/*
 *    Copyright (c) 2020 Project CHIP Authors
 *    Copyright (c) 2020 Google LLC.
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

/**
 *    @file
 *          Example project configuration file for CHIP.
 *
 *          This is a place to put application or project-specific overrides
 *          to the default configuration values for general CHIP features.
 *
 */

#pragma once

// Security and Authentication disabled for development build.
// For convenience, enable CHIP Security Test Mode and disable the requirement for
// authentication in various protocols.
// WARNING: These options make it possible to circumvent basic CHIP security functionality,
// including message encryption. Because of this they MUST NEVER BE ENABLED IN PRODUCTION BUILDS.
#define CHIP_CONFIG_SECURITY_TEST_MODE 0

// Use hard-coded test certificates already embedded in generic chip code => set it to 0
// Use real/development certificates => set it to 1 + file the provisioning section from
//                                      the internal flash
#ifndef CONFIG_CHIP_K32W0_REAL_FACTORY_DATA
#define CONFIG_CHIP_K32W0_REAL_FACTORY_DATA 0
#endif

#if CONFIG_CHIP_K32W0_REAL_FACTORY_DATA

// Enable usage of custom factory data provider
#ifndef CHIP_DEVICE_CONFIG_USE_CUSTOM_PROVIDER
#define CHIP_DEVICE_CONFIG_USE_CUSTOM_PROVIDER 0
#endif

#if CHIP_DEVICE_CONFIG_USE_CUSTOM_PROVIDER
#ifndef CHIP_DEVICE_CONFIG_CUSTOM_PROVIDER_NUMBER_IDS
// Set to 3: default number of custom Ids from CustomFactoryDataProvider example
#define CHIP_DEVICE_CONFIG_CUSTOM_PROVIDER_NUMBER_IDS 3
#endif
#endif

// VID/PID for product => will be used by Basic Information Cluster
#define CHIP_DEVICE_CONFIG_DEVICE_VENDOR_ID 0x1037
#define CHIP_DEVICE_CONFIG_DEVICE_PRODUCT_ID 0xA220

#ifndef CHIP_DEVICE_CONFIG_CERTIFICATION_DECLARATION
//-> format_version = 1
//-> vendor_id = 0x1037
//-> product_id_array = [ 0xA220 ]
//-> device_type_id = 0x0100
//-> certificate_id = "ZIG20142ZB330003-24"
//-> security_level = 0
//-> security_information = 0
//-> version_number = 0x2694
//-> certification_type = 1
//-> dac_origin_vendor_id is not present
//-> dac_origin_product_id is not present
#define CHIP_DEVICE_CONFIG_CERTIFICATION_DECLARATION                                                                               \
    {                                                                                                                              \
        0x30, 0x81, 0xe7, 0x06, 0x09, 0x2a, 0x86, 0x48, 0x86, 0xf7, 0x0d, 0x01, 0x07, 0x02, 0xa0, 0x81, 0xd9, 0x30, 0x81, 0xd6,    \
            0x02, 0x01, 0x03, 0x31, 0x0d, 0x30, 0x0b, 0x06, 0x09, 0x60, 0x86, 0x48, 0x01, 0x65, 0x03, 0x04, 0x02, 0x01, 0x30,      \
            0x44, 0x06, 0x09, 0x2a, 0x86, 0x48, 0x86, 0xf7, 0x0d, 0x01, 0x07, 0x01, 0xa0, 0x37, 0x04, 0x35, 0x15, 0x24, 0x00,      \
            0x01, 0x25, 0x01, 0x37, 0x10, 0x36, 0x02, 0x05, 0x20, 0xa2, 0x18, 0x25, 0x03, 0x00, 0x01, 0x2c, 0x04, 0x13, 0x5a,      \
            0x49, 0x47, 0x32, 0x30, 0x31, 0x34, 0x31, 0x5a, 0x42, 0x33, 0x33, 0x30, 0x30, 0x30, 0x31, 0x2d, 0x32, 0x34, 0x24,      \
            0x05, 0x00, 0x24, 0x06, 0x00, 0x24, 0x07, 0x01, 0x24, 0x08, 0x01, 0x18, 0x31, 0x7c, 0x30, 0x7a, 0x02, 0x01, 0x03,      \
            0x80, 0x14, 0x62, 0xfa, 0x82, 0x33, 0x59, 0xac, 0xfa, 0xa9, 0x96, 0x3e, 0x1c, 0xfa, 0x14, 0x0a, 0xdd, 0xf5, 0x04,      \
            0xf3, 0x71, 0x60, 0x30, 0x0b, 0x06, 0x09, 0x60, 0x86, 0x48, 0x01, 0x65, 0x03, 0x04, 0x02, 0x01, 0x30, 0x0a, 0x06,      \
            0x08, 0x2a, 0x86, 0x48, 0xce, 0x3d, 0x04, 0x03, 0x02, 0x04, 0x46, 0x30, 0x44, 0x02, 0x20, 0x5f, 0x32, 0xbc, 0x8b,      \
            0xa7, 0xd6, 0x1c, 0xfc, 0x6b, 0xc2, 0x1f, 0xbb, 0x42, 0xc2, 0xa7, 0x93, 0x45, 0x8a, 0xd9, 0xa6, 0x62, 0x15, 0xb6,      \
            0x93, 0xc4, 0x90, 0x24, 0xdf, 0xca, 0x03, 0x3a, 0x96, 0x02, 0x20, 0x5f, 0xc6, 0x62, 0x7a, 0x84, 0x49, 0x13, 0xf9,      \
            0x99, 0xd5, 0xbb, 0xab, 0xa0, 0x26, 0x22, 0xad, 0xdc, 0x32, 0xe6, 0x02, 0x2f, 0xf2, 0xaa, 0x52, 0x09, 0x86, 0x1d,      \
            0xe4, 0x76, 0x1b, 0xfd, 0x05,                                                                                          \
    }

// All remaining data will be pulled from provisioning region of flash.
#endif

#else

/**
 * CHIP_DEVICE_CONFIG_DEVICE_VENDOR_ID
 *
 * 0xFFF1: Test vendor.
 */
#define CHIP_DEVICE_CONFIG_DEVICE_VENDOR_ID 0xFFF1

/**
 * CHIP_DEVICE_CONFIG_DEVICE_PRODUCT_ID
 *
 * 0x8005: example lighting-app
 */
#define CHIP_DEVICE_CONFIG_DEVICE_PRODUCT_ID 0x8005

// Use a default setup PIN code if one hasn't been provisioned in flash.
#define CHIP_DEVICE_CONFIG_USE_TEST_SETUP_PIN_CODE 20202021
#define CHIP_DEVICE_CONFIG_USE_TEST_SETUP_DISCRIMINATOR 0xF00

// Use a default pairing code if one hasn't been provisioned in flash.
#define CHIP_DEVICE_CONFIG_USE_TEST_PAIRING_CODE "CHIPUS"

/**
 * CHIP_DEVICE_CONFIG_TEST_SERIAL_NUMBER
 *
 * Enables the use of a hard-coded default serial number if none
 * is found in CHIP NV storage.
 */
#define CHIP_DEVICE_CONFIG_TEST_SERIAL_NUMBER "TEST_SN"

#endif

/**
 * CHIP_DEVICE_CONFIG_DEVICE_HARDWARE_VERSION
 *
 * The hardware version number assigned to device or product by the device vendor.  This
 * number is scoped to the device product id, and typically corresponds to a revision of the
 * physical device, a change to its packaging, and/or a change to its marketing presentation.
 * This value is generally *not* incremented for device software versions.
 */
#define CHIP_DEVICE_CONFIG_DEVICE_HARDWARE_VERSION 100

#ifndef CHIP_DEVICE_CONFIG_DEFAULT_DEVICE_HARDWARE_VERSION_STRING
#define CHIP_DEVICE_CONFIG_DEFAULT_DEVICE_HARDWARE_VERSION_STRING "v0.1.0"
#endif

/**
 * CHIP_DEVICE_CONFIG_DEVICE_SOFTWARE_VERSION_STRING
 *
 * A string identifying the software version running on the device.
 * CHIP currently expects the software version to be in the format
 * {MAJOR_VERSION}.0d{MINOR_VERSION}
 */
#ifndef CHIP_DEVICE_CONFIG_DEVICE_SOFTWARE_VERSION_STRING
#define CHIP_DEVICE_CONFIG_DEVICE_SOFTWARE_VERSION_STRING "03-2022-te8"
#endif

#ifndef CHIP_DEVICE_CONFIG_DEVICE_SOFTWARE_VERSION
#define CHIP_DEVICE_CONFIG_DEVICE_SOFTWARE_VERSION 42020
#endif

#ifndef CHIP_DEVICE_CONFIG_DEVICE_VENDOR_NAME
#define CHIP_DEVICE_CONFIG_DEVICE_VENDOR_NAME "NXP Semiconductors"
#endif

#ifndef CHIP_DEVICE_CONFIG_DEVICE_PRODUCT_NAME
#define CHIP_DEVICE_CONFIG_DEVICE_PRODUCT_NAME "NXP Demo App"
#endif

/**
 * CHIP_DEVICE_CONFIG_BLE_FAST_ADVERTISING_TIMEOUT
 *
 * The amount of time in miliseconds after which BLE should change his advertisements
 * from fast interval to slow interval.
 *
 * 30000 (30 secondes).
 */
#define CHIP_DEVICE_CONFIG_BLE_FAST_ADVERTISING_TIMEOUT (30 * 1000)

/**
 *  @def CHIP_CONFIG_MAX_FABRICS
 *
 *  @brief
 *    Maximum number of fabrics the device can participate in.  Each fabric can
 *    provision the device with its unique operational credentials and manage
 *    its own access control lists.
 */
#define CHIP_CONFIG_MAX_FABRICS 5 // 5 is the minimum number of supported fabrics

/**
 * @def CHIP_IM_MAX_NUM_COMMAND_HANDLER
 *
 * @brief Defines the maximum number of CommandHandler, limits the number of active commands transactions on server.
 */
#define CHIP_IM_MAX_NUM_COMMAND_HANDLER 2

/**
 * @def CHIP_IM_MAX_NUM_WRITE_HANDLER
 *
 * @brief Defines the maximum number of WriteHandler, limits the number of active write transactions on server.
 */
#define CHIP_IM_MAX_NUM_WRITE_HANDLER 2

/**
 * CHIP_CONFIG_EVENT_LOGGING_DEFAULT_IMPORTANCE
 *
 * For a development build, set the default importance of events to be logged as Debug.
 * Since debug is the lowest importance level, this means all standard, critical, info and
 * debug importance level vi events get logged.
 */
#if BUILD_RELEASE
#define CHIP_CONFIG_EVENT_LOGGING_DEFAULT_IMPORTANCE chip::Profiles::DataManagement::Production
#else
#define CHIP_CONFIG_EVENT_LOGGING_DEFAULT_IMPORTANCE chip::Profiles::DataManagement::Debug
#endif // BUILD_RELEASE

#define CHIP_DEVICE_CONFIG_ENABLE_EXTENDED_DISCOVERY 1

/**
 * CHIP_DEVICE_CONFIG_BLE_SET_PHY_2M_REQ
 *
 * This define enables/disables the Gap_LeSetPhy request to switch to 2M.
 * It is disabled here for interoperability reasons just to be extra cautious.
 * Both devices may send a Link Layer control procedure in parallel resulting in a
 * LPM Error Transaction Collision.
 * If the peer device doesn't accept our reject command, this can result in a BLE
 * connection timeout.
 */
#define CHIP_DEVICE_CONFIG_BLE_SET_PHY_2M_REQ 0

/**
 * CHIP_DEVICE_CONFIG_INIT_OTA_DELAY
 *
 * The amount of time in miliseconds after which OTA initialization should be
 * scheduled after a new image is applied.
 *
 */
#define CHIP_DEVICE_CONFIG_INIT_OTA_DELAY 3000