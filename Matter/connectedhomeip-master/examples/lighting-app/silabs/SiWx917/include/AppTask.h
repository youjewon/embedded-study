/*
 *
 *    Copyright (c) 2020 Project CHIP Authors
 *    Copyright (c) 2019 Google LLC.
 *    All rights reserved.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

#pragma once

/**********************************************************
 * Includes
 *********************************************************/

#include <stdbool.h>
#include <stdint.h>

#include "AppEvent.h"
#include "BaseApplication.h"
#include "FreeRTOS.h"
#include "LightingManager.h"
#include "timers.h" // provides FreeRTOS timer support
#include <app/clusters/identify-server/identify-server.h>
#include <ble/BLEEndPoint.h>
#include <lib/core/CHIPError.h>
#include <platform/CHIPDeviceLayer.h>

/**********************************************************
 * Defines
 *********************************************************/
// Button specific defines for SiWx917
#define SL_SIMPLE_BUTTON_PRESSED 1
#define SIWx917_BTN0 0
#define SIWx917_BTN1 1

// Application-defined error codes in the CHIP_ERROR space.
#define APP_ERROR_EVENT_QUEUE_FAILED CHIP_APPLICATION_ERROR(0x01)
#define APP_ERROR_CREATE_TASK_FAILED CHIP_APPLICATION_ERROR(0x02)
#define APP_ERROR_UNHANDLED_EVENT CHIP_APPLICATION_ERROR(0x03)
#define APP_ERROR_CREATE_TIMER_FAILED CHIP_APPLICATION_ERROR(0x04)
#define APP_ERROR_START_TIMER_FAILED CHIP_APPLICATION_ERROR(0x05)
#define APP_ERROR_STOP_TIMER_FAILED CHIP_APPLICATION_ERROR(0x06)

/**********************************************************
 * AppTask Declaration
 *********************************************************/

class AppTask : public BaseApplication
{

public:
    AppTask() = default;

    static AppTask & GetAppTask() { return sAppTask; }

    /**
     * @brief AppTask task main loop function
     *
     * @param pvParameter FreeRTOS task parameter
     */
    static void AppTaskMain(void * pvParameter);

    CHIP_ERROR StartAppTask();

    /**
     * @brief Event handler when a button is pressed
     * Function posts an event for button processing
     *
     * @param button - btn0 or btn1
     * @param btnAction button action - SL_SIMPLE_BUTTON_PRESSED,
     *                  SL_SIMPLE_BUTTON_RELEASED or SL_SIMPLE_BUTTON_DISABLED
     */
    static void ButtonEventHandler(uint8_t button, uint8_t btnAction);

    /**
     * @brief Callback called by the identify-server when an identify command is received
     *
     * @param identify identify structure the command applies on
     */
    static void OnIdentifyStart(Identify * identify);

    /**
     * @brief Callback called by the identify-server when an identify command is stopped or finished
     *
     * @param identify identify structure the command applies on
     */
    static void OnIdentifyStop(Identify * identify);

    void PostLightActionRequest(int32_t aActor, LightingManager::Action_t aAction);

private:
    static AppTask sAppTask;

    static void ActionInitiated(LightingManager::Action_t aAction, int32_t aActor);
    static void ActionCompleted(LightingManager::Action_t aAction);
    static void LightActionEventHandler(AppEvent * aEvent);

    static void UpdateClusterState(intptr_t context);

    /**
     * @brief AppTask initialisation function
     *
     * @return CHIP_ERROR
     */
    CHIP_ERROR Init();

    /**
     * @brief PB0 Button event processing function
     *        Press and hold will trigger a factory reset timer start
     *        Press and release will restart BLEAdvertising if not commisionned
     *
     * @param aEvent button event being processed
     */
    static void ButtonHandler(AppEvent * aEvent);

    /**
     * @brief PB1 Button event processing function
     *        Function triggers a switch action sent to the CHIP task
     *
     * @param aEvent button event being processed
     */
    static void SwitchActionEventHandler(AppEvent * aEvent);
};