/*
 *
 *    Copyright (c) 2023 Project CHIP Authors
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
package chip.devicecontroller;

import chip.clusterinfo.CommandParameterInfo;
import chip.clusterinfo.InteractionInfo;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class ClusterReadMapping {

  private static Map<String, InteractionInfo> readIdentifyInteractionInfo() {
    Map<String, InteractionInfo> result = new LinkedHashMap<>();
    Map<String, CommandParameterInfo> readIdentifyIdentifyTimeCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readIdentifyIdentifyTimeAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.IdentifyCluster) cluster)
                  .readIdentifyTimeAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readIdentifyIdentifyTimeCommandParams);
    result.put("readIdentifyTimeAttribute", readIdentifyIdentifyTimeAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readIdentifyIdentifyTypeCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readIdentifyIdentifyTypeAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.IdentifyCluster) cluster)
                  .readIdentifyTypeAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readIdentifyIdentifyTypeCommandParams);
    result.put("readIdentifyTypeAttribute", readIdentifyIdentifyTypeAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readIdentifyGeneratedCommandListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readIdentifyGeneratedCommandListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.IdentifyCluster) cluster)
                  .readGeneratedCommandListAttribute(
                      (ChipClusters.IdentifyCluster.GeneratedCommandListAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedIdentifyClusterGeneratedCommandListAttributeCallback(),
            readIdentifyGeneratedCommandListCommandParams);
    result.put(
        "readGeneratedCommandListAttribute",
        readIdentifyGeneratedCommandListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readIdentifyAcceptedCommandListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readIdentifyAcceptedCommandListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.IdentifyCluster) cluster)
                  .readAcceptedCommandListAttribute(
                      (ChipClusters.IdentifyCluster.AcceptedCommandListAttributeCallback) callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedIdentifyClusterAcceptedCommandListAttributeCallback(),
            readIdentifyAcceptedCommandListCommandParams);
    result.put(
        "readAcceptedCommandListAttribute",
        readIdentifyAcceptedCommandListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readIdentifyEventListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readIdentifyEventListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.IdentifyCluster) cluster)
                  .readEventListAttribute(
                      (ChipClusters.IdentifyCluster.EventListAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIdentifyClusterEventListAttributeCallback(),
            readIdentifyEventListCommandParams);
    result.put("readEventListAttribute", readIdentifyEventListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readIdentifyAttributeListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readIdentifyAttributeListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.IdentifyCluster) cluster)
                  .readAttributeListAttribute(
                      (ChipClusters.IdentifyCluster.AttributeListAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIdentifyClusterAttributeListAttributeCallback(),
            readIdentifyAttributeListCommandParams);
    result.put("readAttributeListAttribute", readIdentifyAttributeListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readIdentifyFeatureMapCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readIdentifyFeatureMapAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.IdentifyCluster) cluster)
                  .readFeatureMapAttribute((ChipClusters.LongAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedLongAttributeCallback(),
            readIdentifyFeatureMapCommandParams);
    result.put("readFeatureMapAttribute", readIdentifyFeatureMapAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readIdentifyClusterRevisionCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readIdentifyClusterRevisionAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.IdentifyCluster) cluster)
                  .readClusterRevisionAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readIdentifyClusterRevisionCommandParams);
    result.put("readClusterRevisionAttribute", readIdentifyClusterRevisionAttributeInteractionInfo);

    return result;
  }

  private static Map<String, InteractionInfo> readGroupsInteractionInfo() {
    Map<String, InteractionInfo> result = new LinkedHashMap<>();
    Map<String, CommandParameterInfo> readGroupsNameSupportCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readGroupsNameSupportAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.GroupsCluster) cluster)
                  .readNameSupportAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readGroupsNameSupportCommandParams);
    result.put("readNameSupportAttribute", readGroupsNameSupportAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readGroupsGeneratedCommandListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readGroupsGeneratedCommandListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.GroupsCluster) cluster)
                  .readGeneratedCommandListAttribute(
                      (ChipClusters.GroupsCluster.GeneratedCommandListAttributeCallback) callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedGroupsClusterGeneratedCommandListAttributeCallback(),
            readGroupsGeneratedCommandListCommandParams);
    result.put(
        "readGeneratedCommandListAttribute",
        readGroupsGeneratedCommandListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readGroupsAcceptedCommandListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readGroupsAcceptedCommandListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.GroupsCluster) cluster)
                  .readAcceptedCommandListAttribute(
                      (ChipClusters.GroupsCluster.AcceptedCommandListAttributeCallback) callback);
            },
            () ->
                new ClusterInfoMapping.DelegatedGroupsClusterAcceptedCommandListAttributeCallback(),
            readGroupsAcceptedCommandListCommandParams);
    result.put(
        "readAcceptedCommandListAttribute", readGroupsAcceptedCommandListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readGroupsEventListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readGroupsEventListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.GroupsCluster) cluster)
                  .readEventListAttribute(
                      (ChipClusters.GroupsCluster.EventListAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedGroupsClusterEventListAttributeCallback(),
            readGroupsEventListCommandParams);
    result.put("readEventListAttribute", readGroupsEventListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readGroupsAttributeListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readGroupsAttributeListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.GroupsCluster) cluster)
                  .readAttributeListAttribute(
                      (ChipClusters.GroupsCluster.AttributeListAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedGroupsClusterAttributeListAttributeCallback(),
            readGroupsAttributeListCommandParams);
    result.put("readAttributeListAttribute", readGroupsAttributeListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readGroupsFeatureMapCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readGroupsFeatureMapAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.GroupsCluster) cluster)
                  .readFeatureMapAttribute((ChipClusters.LongAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedLongAttributeCallback(),
            readGroupsFeatureMapCommandParams);
    result.put("readFeatureMapAttribute", readGroupsFeatureMapAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readGroupsClusterRevisionCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readGroupsClusterRevisionAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.GroupsCluster) cluster)
                  .readClusterRevisionAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readGroupsClusterRevisionCommandParams);
    result.put("readClusterRevisionAttribute", readGroupsClusterRevisionAttributeInteractionInfo);

    return result;
  }

  private static Map<String, InteractionInfo> readScenesInteractionInfo() {
    Map<String, InteractionInfo> result = new LinkedHashMap<>();
    Map<String, CommandParameterInfo> readScenesSceneCountCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readScenesSceneCountAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ScenesCluster) cluster)
                  .readSceneCountAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readScenesSceneCountCommandParams);
    result.put("readSceneCountAttribute", readScenesSceneCountAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readScenesCurrentSceneCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readScenesCurrentSceneAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ScenesCluster) cluster)
                  .readCurrentSceneAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readScenesCurrentSceneCommandParams);
    result.put("readCurrentSceneAttribute", readScenesCurrentSceneAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readScenesCurrentGroupCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readScenesCurrentGroupAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ScenesCluster) cluster)
                  .readCurrentGroupAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readScenesCurrentGroupCommandParams);
    result.put("readCurrentGroupAttribute", readScenesCurrentGroupAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readScenesSceneValidCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readScenesSceneValidAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ScenesCluster) cluster)
                  .readSceneValidAttribute((ChipClusters.BooleanAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedBooleanAttributeCallback(),
            readScenesSceneValidCommandParams);
    result.put("readSceneValidAttribute", readScenesSceneValidAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readScenesNameSupportCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readScenesNameSupportAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ScenesCluster) cluster)
                  .readNameSupportAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readScenesNameSupportCommandParams);
    result.put("readNameSupportAttribute", readScenesNameSupportAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readScenesLastConfiguredByCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readScenesLastConfiguredByAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ScenesCluster) cluster)
                  .readLastConfiguredByAttribute(
                      (ChipClusters.ScenesCluster.LastConfiguredByAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedScenesClusterLastConfiguredByAttributeCallback(),
            readScenesLastConfiguredByCommandParams);
    result.put("readLastConfiguredByAttribute", readScenesLastConfiguredByAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readScenesGeneratedCommandListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readScenesGeneratedCommandListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ScenesCluster) cluster)
                  .readGeneratedCommandListAttribute(
                      (ChipClusters.ScenesCluster.GeneratedCommandListAttributeCallback) callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedScenesClusterGeneratedCommandListAttributeCallback(),
            readScenesGeneratedCommandListCommandParams);
    result.put(
        "readGeneratedCommandListAttribute",
        readScenesGeneratedCommandListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readScenesAcceptedCommandListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readScenesAcceptedCommandListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ScenesCluster) cluster)
                  .readAcceptedCommandListAttribute(
                      (ChipClusters.ScenesCluster.AcceptedCommandListAttributeCallback) callback);
            },
            () ->
                new ClusterInfoMapping.DelegatedScenesClusterAcceptedCommandListAttributeCallback(),
            readScenesAcceptedCommandListCommandParams);
    result.put(
        "readAcceptedCommandListAttribute", readScenesAcceptedCommandListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readScenesEventListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readScenesEventListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ScenesCluster) cluster)
                  .readEventListAttribute(
                      (ChipClusters.ScenesCluster.EventListAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedScenesClusterEventListAttributeCallback(),
            readScenesEventListCommandParams);
    result.put("readEventListAttribute", readScenesEventListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readScenesAttributeListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readScenesAttributeListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ScenesCluster) cluster)
                  .readAttributeListAttribute(
                      (ChipClusters.ScenesCluster.AttributeListAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedScenesClusterAttributeListAttributeCallback(),
            readScenesAttributeListCommandParams);
    result.put("readAttributeListAttribute", readScenesAttributeListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readScenesFeatureMapCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readScenesFeatureMapAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ScenesCluster) cluster)
                  .readFeatureMapAttribute((ChipClusters.LongAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedLongAttributeCallback(),
            readScenesFeatureMapCommandParams);
    result.put("readFeatureMapAttribute", readScenesFeatureMapAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readScenesClusterRevisionCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readScenesClusterRevisionAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ScenesCluster) cluster)
                  .readClusterRevisionAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readScenesClusterRevisionCommandParams);
    result.put("readClusterRevisionAttribute", readScenesClusterRevisionAttributeInteractionInfo);

    return result;
  }

  private static Map<String, InteractionInfo> readOnOffInteractionInfo() {
    Map<String, InteractionInfo> result = new LinkedHashMap<>();
    Map<String, CommandParameterInfo> readOnOffOnOffCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readOnOffOnOffAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.OnOffCluster) cluster)
                  .readOnOffAttribute((ChipClusters.BooleanAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedBooleanAttributeCallback(),
            readOnOffOnOffCommandParams);
    result.put("readOnOffAttribute", readOnOffOnOffAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readOnOffGlobalSceneControlCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readOnOffGlobalSceneControlAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.OnOffCluster) cluster)
                  .readGlobalSceneControlAttribute(
                      (ChipClusters.BooleanAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedBooleanAttributeCallback(),
            readOnOffGlobalSceneControlCommandParams);
    result.put(
        "readGlobalSceneControlAttribute", readOnOffGlobalSceneControlAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readOnOffOnTimeCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readOnOffOnTimeAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.OnOffCluster) cluster)
                  .readOnTimeAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readOnOffOnTimeCommandParams);
    result.put("readOnTimeAttribute", readOnOffOnTimeAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readOnOffOffWaitTimeCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readOnOffOffWaitTimeAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.OnOffCluster) cluster)
                  .readOffWaitTimeAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readOnOffOffWaitTimeCommandParams);
    result.put("readOffWaitTimeAttribute", readOnOffOffWaitTimeAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readOnOffStartUpOnOffCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readOnOffStartUpOnOffAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.OnOffCluster) cluster)
                  .readStartUpOnOffAttribute(
                      (ChipClusters.OnOffCluster.StartUpOnOffAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedOnOffClusterStartUpOnOffAttributeCallback(),
            readOnOffStartUpOnOffCommandParams);
    result.put("readStartUpOnOffAttribute", readOnOffStartUpOnOffAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readOnOffGeneratedCommandListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readOnOffGeneratedCommandListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.OnOffCluster) cluster)
                  .readGeneratedCommandListAttribute(
                      (ChipClusters.OnOffCluster.GeneratedCommandListAttributeCallback) callback);
            },
            () ->
                new ClusterInfoMapping.DelegatedOnOffClusterGeneratedCommandListAttributeCallback(),
            readOnOffGeneratedCommandListCommandParams);
    result.put(
        "readGeneratedCommandListAttribute", readOnOffGeneratedCommandListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readOnOffAcceptedCommandListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readOnOffAcceptedCommandListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.OnOffCluster) cluster)
                  .readAcceptedCommandListAttribute(
                      (ChipClusters.OnOffCluster.AcceptedCommandListAttributeCallback) callback);
            },
            () ->
                new ClusterInfoMapping.DelegatedOnOffClusterAcceptedCommandListAttributeCallback(),
            readOnOffAcceptedCommandListCommandParams);
    result.put(
        "readAcceptedCommandListAttribute", readOnOffAcceptedCommandListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readOnOffEventListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readOnOffEventListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.OnOffCluster) cluster)
                  .readEventListAttribute(
                      (ChipClusters.OnOffCluster.EventListAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedOnOffClusterEventListAttributeCallback(),
            readOnOffEventListCommandParams);
    result.put("readEventListAttribute", readOnOffEventListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readOnOffAttributeListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readOnOffAttributeListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.OnOffCluster) cluster)
                  .readAttributeListAttribute(
                      (ChipClusters.OnOffCluster.AttributeListAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedOnOffClusterAttributeListAttributeCallback(),
            readOnOffAttributeListCommandParams);
    result.put("readAttributeListAttribute", readOnOffAttributeListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readOnOffFeatureMapCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readOnOffFeatureMapAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.OnOffCluster) cluster)
                  .readFeatureMapAttribute((ChipClusters.LongAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedLongAttributeCallback(),
            readOnOffFeatureMapCommandParams);
    result.put("readFeatureMapAttribute", readOnOffFeatureMapAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readOnOffClusterRevisionCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readOnOffClusterRevisionAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.OnOffCluster) cluster)
                  .readClusterRevisionAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readOnOffClusterRevisionCommandParams);
    result.put("readClusterRevisionAttribute", readOnOffClusterRevisionAttributeInteractionInfo);

    return result;
  }

  private static Map<String, InteractionInfo> readOnOffSwitchConfigurationInteractionInfo() {
    Map<String, InteractionInfo> result = new LinkedHashMap<>();
    Map<String, CommandParameterInfo> readOnOffSwitchConfigurationSwitchTypeCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readOnOffSwitchConfigurationSwitchTypeAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.OnOffSwitchConfigurationCluster) cluster)
                  .readSwitchTypeAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readOnOffSwitchConfigurationSwitchTypeCommandParams);
    result.put(
        "readSwitchTypeAttribute", readOnOffSwitchConfigurationSwitchTypeAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readOnOffSwitchConfigurationSwitchActionsCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readOnOffSwitchConfigurationSwitchActionsAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.OnOffSwitchConfigurationCluster) cluster)
                  .readSwitchActionsAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readOnOffSwitchConfigurationSwitchActionsCommandParams);
    result.put(
        "readSwitchActionsAttribute",
        readOnOffSwitchConfigurationSwitchActionsAttributeInteractionInfo);
    Map<String, CommandParameterInfo>
        readOnOffSwitchConfigurationGeneratedCommandListCommandParams =
            new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readOnOffSwitchConfigurationGeneratedCommandListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.OnOffSwitchConfigurationCluster) cluster)
                  .readGeneratedCommandListAttribute(
                      (ChipClusters.OnOffSwitchConfigurationCluster
                              .GeneratedCommandListAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedOnOffSwitchConfigurationClusterGeneratedCommandListAttributeCallback(),
            readOnOffSwitchConfigurationGeneratedCommandListCommandParams);
    result.put(
        "readGeneratedCommandListAttribute",
        readOnOffSwitchConfigurationGeneratedCommandListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readOnOffSwitchConfigurationAcceptedCommandListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readOnOffSwitchConfigurationAcceptedCommandListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.OnOffSwitchConfigurationCluster) cluster)
                  .readAcceptedCommandListAttribute(
                      (ChipClusters.OnOffSwitchConfigurationCluster
                              .AcceptedCommandListAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedOnOffSwitchConfigurationClusterAcceptedCommandListAttributeCallback(),
            readOnOffSwitchConfigurationAcceptedCommandListCommandParams);
    result.put(
        "readAcceptedCommandListAttribute",
        readOnOffSwitchConfigurationAcceptedCommandListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readOnOffSwitchConfigurationEventListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readOnOffSwitchConfigurationEventListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.OnOffSwitchConfigurationCluster) cluster)
                  .readEventListAttribute(
                      (ChipClusters.OnOffSwitchConfigurationCluster.EventListAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedOnOffSwitchConfigurationClusterEventListAttributeCallback(),
            readOnOffSwitchConfigurationEventListCommandParams);
    result.put(
        "readEventListAttribute", readOnOffSwitchConfigurationEventListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readOnOffSwitchConfigurationAttributeListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readOnOffSwitchConfigurationAttributeListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.OnOffSwitchConfigurationCluster) cluster)
                  .readAttributeListAttribute(
                      (ChipClusters.OnOffSwitchConfigurationCluster.AttributeListAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedOnOffSwitchConfigurationClusterAttributeListAttributeCallback(),
            readOnOffSwitchConfigurationAttributeListCommandParams);
    result.put(
        "readAttributeListAttribute",
        readOnOffSwitchConfigurationAttributeListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readOnOffSwitchConfigurationFeatureMapCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readOnOffSwitchConfigurationFeatureMapAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.OnOffSwitchConfigurationCluster) cluster)
                  .readFeatureMapAttribute((ChipClusters.LongAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedLongAttributeCallback(),
            readOnOffSwitchConfigurationFeatureMapCommandParams);
    result.put(
        "readFeatureMapAttribute", readOnOffSwitchConfigurationFeatureMapAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readOnOffSwitchConfigurationClusterRevisionCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readOnOffSwitchConfigurationClusterRevisionAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.OnOffSwitchConfigurationCluster) cluster)
                  .readClusterRevisionAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readOnOffSwitchConfigurationClusterRevisionCommandParams);
    result.put(
        "readClusterRevisionAttribute",
        readOnOffSwitchConfigurationClusterRevisionAttributeInteractionInfo);

    return result;
  }

  private static Map<String, InteractionInfo> readLevelControlInteractionInfo() {
    Map<String, InteractionInfo> result = new LinkedHashMap<>();
    Map<String, CommandParameterInfo> readLevelControlCurrentLevelCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readLevelControlCurrentLevelAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.LevelControlCluster) cluster)
                  .readCurrentLevelAttribute(
                      (ChipClusters.LevelControlCluster.CurrentLevelAttributeCallback) callback);
            },
            () ->
                new ClusterInfoMapping.DelegatedLevelControlClusterCurrentLevelAttributeCallback(),
            readLevelControlCurrentLevelCommandParams);
    result.put("readCurrentLevelAttribute", readLevelControlCurrentLevelAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readLevelControlRemainingTimeCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readLevelControlRemainingTimeAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.LevelControlCluster) cluster)
                  .readRemainingTimeAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readLevelControlRemainingTimeCommandParams);
    result.put("readRemainingTimeAttribute", readLevelControlRemainingTimeAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readLevelControlMinLevelCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readLevelControlMinLevelAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.LevelControlCluster) cluster)
                  .readMinLevelAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readLevelControlMinLevelCommandParams);
    result.put("readMinLevelAttribute", readLevelControlMinLevelAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readLevelControlMaxLevelCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readLevelControlMaxLevelAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.LevelControlCluster) cluster)
                  .readMaxLevelAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readLevelControlMaxLevelCommandParams);
    result.put("readMaxLevelAttribute", readLevelControlMaxLevelAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readLevelControlCurrentFrequencyCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readLevelControlCurrentFrequencyAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.LevelControlCluster) cluster)
                  .readCurrentFrequencyAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readLevelControlCurrentFrequencyCommandParams);
    result.put(
        "readCurrentFrequencyAttribute", readLevelControlCurrentFrequencyAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readLevelControlMinFrequencyCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readLevelControlMinFrequencyAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.LevelControlCluster) cluster)
                  .readMinFrequencyAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readLevelControlMinFrequencyCommandParams);
    result.put("readMinFrequencyAttribute", readLevelControlMinFrequencyAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readLevelControlMaxFrequencyCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readLevelControlMaxFrequencyAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.LevelControlCluster) cluster)
                  .readMaxFrequencyAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readLevelControlMaxFrequencyCommandParams);
    result.put("readMaxFrequencyAttribute", readLevelControlMaxFrequencyAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readLevelControlOptionsCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readLevelControlOptionsAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.LevelControlCluster) cluster)
                  .readOptionsAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readLevelControlOptionsCommandParams);
    result.put("readOptionsAttribute", readLevelControlOptionsAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readLevelControlOnOffTransitionTimeCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readLevelControlOnOffTransitionTimeAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.LevelControlCluster) cluster)
                  .readOnOffTransitionTimeAttribute(
                      (ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readLevelControlOnOffTransitionTimeCommandParams);
    result.put(
        "readOnOffTransitionTimeAttribute",
        readLevelControlOnOffTransitionTimeAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readLevelControlOnLevelCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readLevelControlOnLevelAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.LevelControlCluster) cluster)
                  .readOnLevelAttribute(
                      (ChipClusters.LevelControlCluster.OnLevelAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedLevelControlClusterOnLevelAttributeCallback(),
            readLevelControlOnLevelCommandParams);
    result.put("readOnLevelAttribute", readLevelControlOnLevelAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readLevelControlOnTransitionTimeCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readLevelControlOnTransitionTimeAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.LevelControlCluster) cluster)
                  .readOnTransitionTimeAttribute(
                      (ChipClusters.LevelControlCluster.OnTransitionTimeAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedLevelControlClusterOnTransitionTimeAttributeCallback(),
            readLevelControlOnTransitionTimeCommandParams);
    result.put(
        "readOnTransitionTimeAttribute", readLevelControlOnTransitionTimeAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readLevelControlOffTransitionTimeCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readLevelControlOffTransitionTimeAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.LevelControlCluster) cluster)
                  .readOffTransitionTimeAttribute(
                      (ChipClusters.LevelControlCluster.OffTransitionTimeAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedLevelControlClusterOffTransitionTimeAttributeCallback(),
            readLevelControlOffTransitionTimeCommandParams);
    result.put(
        "readOffTransitionTimeAttribute",
        readLevelControlOffTransitionTimeAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readLevelControlDefaultMoveRateCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readLevelControlDefaultMoveRateAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.LevelControlCluster) cluster)
                  .readDefaultMoveRateAttribute(
                      (ChipClusters.LevelControlCluster.DefaultMoveRateAttributeCallback) callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedLevelControlClusterDefaultMoveRateAttributeCallback(),
            readLevelControlDefaultMoveRateCommandParams);
    result.put(
        "readDefaultMoveRateAttribute", readLevelControlDefaultMoveRateAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readLevelControlStartUpCurrentLevelCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readLevelControlStartUpCurrentLevelAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.LevelControlCluster) cluster)
                  .readStartUpCurrentLevelAttribute(
                      (ChipClusters.LevelControlCluster.StartUpCurrentLevelAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedLevelControlClusterStartUpCurrentLevelAttributeCallback(),
            readLevelControlStartUpCurrentLevelCommandParams);
    result.put(
        "readStartUpCurrentLevelAttribute",
        readLevelControlStartUpCurrentLevelAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readLevelControlGeneratedCommandListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readLevelControlGeneratedCommandListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.LevelControlCluster) cluster)
                  .readGeneratedCommandListAttribute(
                      (ChipClusters.LevelControlCluster.GeneratedCommandListAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedLevelControlClusterGeneratedCommandListAttributeCallback(),
            readLevelControlGeneratedCommandListCommandParams);
    result.put(
        "readGeneratedCommandListAttribute",
        readLevelControlGeneratedCommandListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readLevelControlAcceptedCommandListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readLevelControlAcceptedCommandListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.LevelControlCluster) cluster)
                  .readAcceptedCommandListAttribute(
                      (ChipClusters.LevelControlCluster.AcceptedCommandListAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedLevelControlClusterAcceptedCommandListAttributeCallback(),
            readLevelControlAcceptedCommandListCommandParams);
    result.put(
        "readAcceptedCommandListAttribute",
        readLevelControlAcceptedCommandListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readLevelControlEventListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readLevelControlEventListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.LevelControlCluster) cluster)
                  .readEventListAttribute(
                      (ChipClusters.LevelControlCluster.EventListAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedLevelControlClusterEventListAttributeCallback(),
            readLevelControlEventListCommandParams);
    result.put("readEventListAttribute", readLevelControlEventListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readLevelControlAttributeListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readLevelControlAttributeListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.LevelControlCluster) cluster)
                  .readAttributeListAttribute(
                      (ChipClusters.LevelControlCluster.AttributeListAttributeCallback) callback);
            },
            () ->
                new ClusterInfoMapping.DelegatedLevelControlClusterAttributeListAttributeCallback(),
            readLevelControlAttributeListCommandParams);
    result.put("readAttributeListAttribute", readLevelControlAttributeListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readLevelControlFeatureMapCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readLevelControlFeatureMapAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.LevelControlCluster) cluster)
                  .readFeatureMapAttribute((ChipClusters.LongAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedLongAttributeCallback(),
            readLevelControlFeatureMapCommandParams);
    result.put("readFeatureMapAttribute", readLevelControlFeatureMapAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readLevelControlClusterRevisionCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readLevelControlClusterRevisionAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.LevelControlCluster) cluster)
                  .readClusterRevisionAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readLevelControlClusterRevisionCommandParams);
    result.put(
        "readClusterRevisionAttribute", readLevelControlClusterRevisionAttributeInteractionInfo);

    return result;
  }

  private static Map<String, InteractionInfo> readBinaryInputBasicInteractionInfo() {
    Map<String, InteractionInfo> result = new LinkedHashMap<>();
    Map<String, CommandParameterInfo> readBinaryInputBasicActiveTextCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readBinaryInputBasicActiveTextAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.BinaryInputBasicCluster) cluster)
                  .readActiveTextAttribute((ChipClusters.CharStringAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedCharStringAttributeCallback(),
            readBinaryInputBasicActiveTextCommandParams);
    result.put("readActiveTextAttribute", readBinaryInputBasicActiveTextAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readBinaryInputBasicDescriptionCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readBinaryInputBasicDescriptionAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.BinaryInputBasicCluster) cluster)
                  .readDescriptionAttribute((ChipClusters.CharStringAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedCharStringAttributeCallback(),
            readBinaryInputBasicDescriptionCommandParams);
    result.put("readDescriptionAttribute", readBinaryInputBasicDescriptionAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readBinaryInputBasicInactiveTextCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readBinaryInputBasicInactiveTextAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.BinaryInputBasicCluster) cluster)
                  .readInactiveTextAttribute((ChipClusters.CharStringAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedCharStringAttributeCallback(),
            readBinaryInputBasicInactiveTextCommandParams);
    result.put(
        "readInactiveTextAttribute", readBinaryInputBasicInactiveTextAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readBinaryInputBasicOutOfServiceCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readBinaryInputBasicOutOfServiceAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.BinaryInputBasicCluster) cluster)
                  .readOutOfServiceAttribute((ChipClusters.BooleanAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedBooleanAttributeCallback(),
            readBinaryInputBasicOutOfServiceCommandParams);
    result.put(
        "readOutOfServiceAttribute", readBinaryInputBasicOutOfServiceAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readBinaryInputBasicPolarityCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readBinaryInputBasicPolarityAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.BinaryInputBasicCluster) cluster)
                  .readPolarityAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readBinaryInputBasicPolarityCommandParams);
    result.put("readPolarityAttribute", readBinaryInputBasicPolarityAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readBinaryInputBasicPresentValueCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readBinaryInputBasicPresentValueAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.BinaryInputBasicCluster) cluster)
                  .readPresentValueAttribute((ChipClusters.BooleanAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedBooleanAttributeCallback(),
            readBinaryInputBasicPresentValueCommandParams);
    result.put(
        "readPresentValueAttribute", readBinaryInputBasicPresentValueAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readBinaryInputBasicReliabilityCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readBinaryInputBasicReliabilityAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.BinaryInputBasicCluster) cluster)
                  .readReliabilityAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readBinaryInputBasicReliabilityCommandParams);
    result.put("readReliabilityAttribute", readBinaryInputBasicReliabilityAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readBinaryInputBasicStatusFlagsCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readBinaryInputBasicStatusFlagsAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.BinaryInputBasicCluster) cluster)
                  .readStatusFlagsAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readBinaryInputBasicStatusFlagsCommandParams);
    result.put("readStatusFlagsAttribute", readBinaryInputBasicStatusFlagsAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readBinaryInputBasicApplicationTypeCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readBinaryInputBasicApplicationTypeAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.BinaryInputBasicCluster) cluster)
                  .readApplicationTypeAttribute((ChipClusters.LongAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedLongAttributeCallback(),
            readBinaryInputBasicApplicationTypeCommandParams);
    result.put(
        "readApplicationTypeAttribute",
        readBinaryInputBasicApplicationTypeAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readBinaryInputBasicGeneratedCommandListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readBinaryInputBasicGeneratedCommandListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.BinaryInputBasicCluster) cluster)
                  .readGeneratedCommandListAttribute(
                      (ChipClusters.BinaryInputBasicCluster.GeneratedCommandListAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedBinaryInputBasicClusterGeneratedCommandListAttributeCallback(),
            readBinaryInputBasicGeneratedCommandListCommandParams);
    result.put(
        "readGeneratedCommandListAttribute",
        readBinaryInputBasicGeneratedCommandListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readBinaryInputBasicAcceptedCommandListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readBinaryInputBasicAcceptedCommandListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.BinaryInputBasicCluster) cluster)
                  .readAcceptedCommandListAttribute(
                      (ChipClusters.BinaryInputBasicCluster.AcceptedCommandListAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedBinaryInputBasicClusterAcceptedCommandListAttributeCallback(),
            readBinaryInputBasicAcceptedCommandListCommandParams);
    result.put(
        "readAcceptedCommandListAttribute",
        readBinaryInputBasicAcceptedCommandListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readBinaryInputBasicEventListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readBinaryInputBasicEventListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.BinaryInputBasicCluster) cluster)
                  .readEventListAttribute(
                      (ChipClusters.BinaryInputBasicCluster.EventListAttributeCallback) callback);
            },
            () ->
                new ClusterInfoMapping.DelegatedBinaryInputBasicClusterEventListAttributeCallback(),
            readBinaryInputBasicEventListCommandParams);
    result.put("readEventListAttribute", readBinaryInputBasicEventListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readBinaryInputBasicAttributeListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readBinaryInputBasicAttributeListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.BinaryInputBasicCluster) cluster)
                  .readAttributeListAttribute(
                      (ChipClusters.BinaryInputBasicCluster.AttributeListAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedBinaryInputBasicClusterAttributeListAttributeCallback(),
            readBinaryInputBasicAttributeListCommandParams);
    result.put(
        "readAttributeListAttribute", readBinaryInputBasicAttributeListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readBinaryInputBasicFeatureMapCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readBinaryInputBasicFeatureMapAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.BinaryInputBasicCluster) cluster)
                  .readFeatureMapAttribute((ChipClusters.LongAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedLongAttributeCallback(),
            readBinaryInputBasicFeatureMapCommandParams);
    result.put("readFeatureMapAttribute", readBinaryInputBasicFeatureMapAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readBinaryInputBasicClusterRevisionCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readBinaryInputBasicClusterRevisionAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.BinaryInputBasicCluster) cluster)
                  .readClusterRevisionAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readBinaryInputBasicClusterRevisionCommandParams);
    result.put(
        "readClusterRevisionAttribute",
        readBinaryInputBasicClusterRevisionAttributeInteractionInfo);

    return result;
  }

  private static Map<String, InteractionInfo> readDescriptorInteractionInfo() {
    Map<String, InteractionInfo> result = new LinkedHashMap<>();
    Map<String, CommandParameterInfo> readDescriptorDeviceTypeListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readDescriptorDeviceTypeListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.DescriptorCluster) cluster)
                  .readDeviceTypeListAttribute(
                      (ChipClusters.DescriptorCluster.DeviceTypeListAttributeCallback) callback);
            },
            () ->
                new ClusterInfoMapping.DelegatedDescriptorClusterDeviceTypeListAttributeCallback(),
            readDescriptorDeviceTypeListCommandParams);
    result.put("readDeviceTypeListAttribute", readDescriptorDeviceTypeListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readDescriptorServerListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readDescriptorServerListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.DescriptorCluster) cluster)
                  .readServerListAttribute(
                      (ChipClusters.DescriptorCluster.ServerListAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedDescriptorClusterServerListAttributeCallback(),
            readDescriptorServerListCommandParams);
    result.put("readServerListAttribute", readDescriptorServerListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readDescriptorClientListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readDescriptorClientListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.DescriptorCluster) cluster)
                  .readClientListAttribute(
                      (ChipClusters.DescriptorCluster.ClientListAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedDescriptorClusterClientListAttributeCallback(),
            readDescriptorClientListCommandParams);
    result.put("readClientListAttribute", readDescriptorClientListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readDescriptorPartsListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readDescriptorPartsListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.DescriptorCluster) cluster)
                  .readPartsListAttribute(
                      (ChipClusters.DescriptorCluster.PartsListAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedDescriptorClusterPartsListAttributeCallback(),
            readDescriptorPartsListCommandParams);
    result.put("readPartsListAttribute", readDescriptorPartsListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readDescriptorGeneratedCommandListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readDescriptorGeneratedCommandListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.DescriptorCluster) cluster)
                  .readGeneratedCommandListAttribute(
                      (ChipClusters.DescriptorCluster.GeneratedCommandListAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedDescriptorClusterGeneratedCommandListAttributeCallback(),
            readDescriptorGeneratedCommandListCommandParams);
    result.put(
        "readGeneratedCommandListAttribute",
        readDescriptorGeneratedCommandListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readDescriptorAcceptedCommandListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readDescriptorAcceptedCommandListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.DescriptorCluster) cluster)
                  .readAcceptedCommandListAttribute(
                      (ChipClusters.DescriptorCluster.AcceptedCommandListAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedDescriptorClusterAcceptedCommandListAttributeCallback(),
            readDescriptorAcceptedCommandListCommandParams);
    result.put(
        "readAcceptedCommandListAttribute",
        readDescriptorAcceptedCommandListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readDescriptorEventListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readDescriptorEventListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.DescriptorCluster) cluster)
                  .readEventListAttribute(
                      (ChipClusters.DescriptorCluster.EventListAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedDescriptorClusterEventListAttributeCallback(),
            readDescriptorEventListCommandParams);
    result.put("readEventListAttribute", readDescriptorEventListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readDescriptorAttributeListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readDescriptorAttributeListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.DescriptorCluster) cluster)
                  .readAttributeListAttribute(
                      (ChipClusters.DescriptorCluster.AttributeListAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedDescriptorClusterAttributeListAttributeCallback(),
            readDescriptorAttributeListCommandParams);
    result.put("readAttributeListAttribute", readDescriptorAttributeListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readDescriptorFeatureMapCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readDescriptorFeatureMapAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.DescriptorCluster) cluster)
                  .readFeatureMapAttribute((ChipClusters.LongAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedLongAttributeCallback(),
            readDescriptorFeatureMapCommandParams);
    result.put("readFeatureMapAttribute", readDescriptorFeatureMapAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readDescriptorClusterRevisionCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readDescriptorClusterRevisionAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.DescriptorCluster) cluster)
                  .readClusterRevisionAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readDescriptorClusterRevisionCommandParams);
    result.put(
        "readClusterRevisionAttribute", readDescriptorClusterRevisionAttributeInteractionInfo);

    return result;
  }

  private static Map<String, InteractionInfo> readBindingInteractionInfo() {
    Map<String, InteractionInfo> result = new LinkedHashMap<>();
    Map<String, CommandParameterInfo> readBindingBindingCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readBindingBindingAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.BindingCluster) cluster)
                  .readBindingAttribute(
                      (ChipClusters.BindingCluster.BindingAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedBindingClusterBindingAttributeCallback(),
            readBindingBindingCommandParams);
    result.put("readBindingAttribute", readBindingBindingAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readBindingGeneratedCommandListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readBindingGeneratedCommandListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.BindingCluster) cluster)
                  .readGeneratedCommandListAttribute(
                      (ChipClusters.BindingCluster.GeneratedCommandListAttributeCallback) callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedBindingClusterGeneratedCommandListAttributeCallback(),
            readBindingGeneratedCommandListCommandParams);
    result.put(
        "readGeneratedCommandListAttribute",
        readBindingGeneratedCommandListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readBindingAcceptedCommandListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readBindingAcceptedCommandListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.BindingCluster) cluster)
                  .readAcceptedCommandListAttribute(
                      (ChipClusters.BindingCluster.AcceptedCommandListAttributeCallback) callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedBindingClusterAcceptedCommandListAttributeCallback(),
            readBindingAcceptedCommandListCommandParams);
    result.put(
        "readAcceptedCommandListAttribute", readBindingAcceptedCommandListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readBindingEventListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readBindingEventListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.BindingCluster) cluster)
                  .readEventListAttribute(
                      (ChipClusters.BindingCluster.EventListAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedBindingClusterEventListAttributeCallback(),
            readBindingEventListCommandParams);
    result.put("readEventListAttribute", readBindingEventListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readBindingAttributeListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readBindingAttributeListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.BindingCluster) cluster)
                  .readAttributeListAttribute(
                      (ChipClusters.BindingCluster.AttributeListAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedBindingClusterAttributeListAttributeCallback(),
            readBindingAttributeListCommandParams);
    result.put("readAttributeListAttribute", readBindingAttributeListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readBindingFeatureMapCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readBindingFeatureMapAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.BindingCluster) cluster)
                  .readFeatureMapAttribute((ChipClusters.LongAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedLongAttributeCallback(),
            readBindingFeatureMapCommandParams);
    result.put("readFeatureMapAttribute", readBindingFeatureMapAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readBindingClusterRevisionCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readBindingClusterRevisionAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.BindingCluster) cluster)
                  .readClusterRevisionAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readBindingClusterRevisionCommandParams);
    result.put("readClusterRevisionAttribute", readBindingClusterRevisionAttributeInteractionInfo);

    return result;
  }

  private static Map<String, InteractionInfo> readAccessControlInteractionInfo() {
    Map<String, InteractionInfo> result = new LinkedHashMap<>();
    Map<String, CommandParameterInfo> readAccessControlAclCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readAccessControlAclAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.AccessControlCluster) cluster)
                  .readAclAttribute(
                      (ChipClusters.AccessControlCluster.AclAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedAccessControlClusterAclAttributeCallback(),
            readAccessControlAclCommandParams);
    result.put("readAclAttribute", readAccessControlAclAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readAccessControlExtensionCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readAccessControlExtensionAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.AccessControlCluster) cluster)
                  .readExtensionAttribute(
                      (ChipClusters.AccessControlCluster.ExtensionAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedAccessControlClusterExtensionAttributeCallback(),
            readAccessControlExtensionCommandParams);
    result.put("readExtensionAttribute", readAccessControlExtensionAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readAccessControlSubjectsPerAccessControlEntryCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readAccessControlSubjectsPerAccessControlEntryAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.AccessControlCluster) cluster)
                  .readSubjectsPerAccessControlEntryAttribute(
                      (ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readAccessControlSubjectsPerAccessControlEntryCommandParams);
    result.put(
        "readSubjectsPerAccessControlEntryAttribute",
        readAccessControlSubjectsPerAccessControlEntryAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readAccessControlTargetsPerAccessControlEntryCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readAccessControlTargetsPerAccessControlEntryAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.AccessControlCluster) cluster)
                  .readTargetsPerAccessControlEntryAttribute(
                      (ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readAccessControlTargetsPerAccessControlEntryCommandParams);
    result.put(
        "readTargetsPerAccessControlEntryAttribute",
        readAccessControlTargetsPerAccessControlEntryAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readAccessControlAccessControlEntriesPerFabricCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readAccessControlAccessControlEntriesPerFabricAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.AccessControlCluster) cluster)
                  .readAccessControlEntriesPerFabricAttribute(
                      (ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readAccessControlAccessControlEntriesPerFabricCommandParams);
    result.put(
        "readAccessControlEntriesPerFabricAttribute",
        readAccessControlAccessControlEntriesPerFabricAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readAccessControlGeneratedCommandListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readAccessControlGeneratedCommandListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.AccessControlCluster) cluster)
                  .readGeneratedCommandListAttribute(
                      (ChipClusters.AccessControlCluster.GeneratedCommandListAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedAccessControlClusterGeneratedCommandListAttributeCallback(),
            readAccessControlGeneratedCommandListCommandParams);
    result.put(
        "readGeneratedCommandListAttribute",
        readAccessControlGeneratedCommandListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readAccessControlAcceptedCommandListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readAccessControlAcceptedCommandListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.AccessControlCluster) cluster)
                  .readAcceptedCommandListAttribute(
                      (ChipClusters.AccessControlCluster.AcceptedCommandListAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedAccessControlClusterAcceptedCommandListAttributeCallback(),
            readAccessControlAcceptedCommandListCommandParams);
    result.put(
        "readAcceptedCommandListAttribute",
        readAccessControlAcceptedCommandListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readAccessControlEventListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readAccessControlEventListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.AccessControlCluster) cluster)
                  .readEventListAttribute(
                      (ChipClusters.AccessControlCluster.EventListAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedAccessControlClusterEventListAttributeCallback(),
            readAccessControlEventListCommandParams);
    result.put("readEventListAttribute", readAccessControlEventListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readAccessControlAttributeListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readAccessControlAttributeListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.AccessControlCluster) cluster)
                  .readAttributeListAttribute(
                      (ChipClusters.AccessControlCluster.AttributeListAttributeCallback) callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedAccessControlClusterAttributeListAttributeCallback(),
            readAccessControlAttributeListCommandParams);
    result.put(
        "readAttributeListAttribute", readAccessControlAttributeListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readAccessControlFeatureMapCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readAccessControlFeatureMapAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.AccessControlCluster) cluster)
                  .readFeatureMapAttribute((ChipClusters.LongAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedLongAttributeCallback(),
            readAccessControlFeatureMapCommandParams);
    result.put("readFeatureMapAttribute", readAccessControlFeatureMapAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readAccessControlClusterRevisionCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readAccessControlClusterRevisionAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.AccessControlCluster) cluster)
                  .readClusterRevisionAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readAccessControlClusterRevisionCommandParams);
    result.put(
        "readClusterRevisionAttribute", readAccessControlClusterRevisionAttributeInteractionInfo);

    return result;
  }

  private static Map<String, InteractionInfo> readActionsInteractionInfo() {
    Map<String, InteractionInfo> result = new LinkedHashMap<>();
    Map<String, CommandParameterInfo> readActionsActionListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readActionsActionListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ActionsCluster) cluster)
                  .readActionListAttribute(
                      (ChipClusters.ActionsCluster.ActionListAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedActionsClusterActionListAttributeCallback(),
            readActionsActionListCommandParams);
    result.put("readActionListAttribute", readActionsActionListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readActionsEndpointListsCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readActionsEndpointListsAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ActionsCluster) cluster)
                  .readEndpointListsAttribute(
                      (ChipClusters.ActionsCluster.EndpointListsAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedActionsClusterEndpointListsAttributeCallback(),
            readActionsEndpointListsCommandParams);
    result.put("readEndpointListsAttribute", readActionsEndpointListsAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readActionsSetupURLCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readActionsSetupURLAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ActionsCluster) cluster)
                  .readSetupURLAttribute((ChipClusters.CharStringAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedCharStringAttributeCallback(),
            readActionsSetupURLCommandParams);
    result.put("readSetupURLAttribute", readActionsSetupURLAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readActionsGeneratedCommandListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readActionsGeneratedCommandListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ActionsCluster) cluster)
                  .readGeneratedCommandListAttribute(
                      (ChipClusters.ActionsCluster.GeneratedCommandListAttributeCallback) callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedActionsClusterGeneratedCommandListAttributeCallback(),
            readActionsGeneratedCommandListCommandParams);
    result.put(
        "readGeneratedCommandListAttribute",
        readActionsGeneratedCommandListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readActionsAcceptedCommandListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readActionsAcceptedCommandListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ActionsCluster) cluster)
                  .readAcceptedCommandListAttribute(
                      (ChipClusters.ActionsCluster.AcceptedCommandListAttributeCallback) callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedActionsClusterAcceptedCommandListAttributeCallback(),
            readActionsAcceptedCommandListCommandParams);
    result.put(
        "readAcceptedCommandListAttribute", readActionsAcceptedCommandListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readActionsEventListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readActionsEventListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ActionsCluster) cluster)
                  .readEventListAttribute(
                      (ChipClusters.ActionsCluster.EventListAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedActionsClusterEventListAttributeCallback(),
            readActionsEventListCommandParams);
    result.put("readEventListAttribute", readActionsEventListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readActionsAttributeListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readActionsAttributeListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ActionsCluster) cluster)
                  .readAttributeListAttribute(
                      (ChipClusters.ActionsCluster.AttributeListAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedActionsClusterAttributeListAttributeCallback(),
            readActionsAttributeListCommandParams);
    result.put("readAttributeListAttribute", readActionsAttributeListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readActionsFeatureMapCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readActionsFeatureMapAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ActionsCluster) cluster)
                  .readFeatureMapAttribute((ChipClusters.LongAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedLongAttributeCallback(),
            readActionsFeatureMapCommandParams);
    result.put("readFeatureMapAttribute", readActionsFeatureMapAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readActionsClusterRevisionCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readActionsClusterRevisionAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ActionsCluster) cluster)
                  .readClusterRevisionAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readActionsClusterRevisionCommandParams);
    result.put("readClusterRevisionAttribute", readActionsClusterRevisionAttributeInteractionInfo);

    return result;
  }

  private static Map<String, InteractionInfo> readBasicInformationInteractionInfo() {
    Map<String, InteractionInfo> result = new LinkedHashMap<>();
    Map<String, CommandParameterInfo> readBasicInformationDataModelRevisionCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readBasicInformationDataModelRevisionAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.BasicInformationCluster) cluster)
                  .readDataModelRevisionAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readBasicInformationDataModelRevisionCommandParams);
    result.put(
        "readDataModelRevisionAttribute",
        readBasicInformationDataModelRevisionAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readBasicInformationVendorNameCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readBasicInformationVendorNameAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.BasicInformationCluster) cluster)
                  .readVendorNameAttribute((ChipClusters.CharStringAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedCharStringAttributeCallback(),
            readBasicInformationVendorNameCommandParams);
    result.put("readVendorNameAttribute", readBasicInformationVendorNameAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readBasicInformationVendorIDCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readBasicInformationVendorIDAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.BasicInformationCluster) cluster)
                  .readVendorIDAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readBasicInformationVendorIDCommandParams);
    result.put("readVendorIDAttribute", readBasicInformationVendorIDAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readBasicInformationProductNameCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readBasicInformationProductNameAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.BasicInformationCluster) cluster)
                  .readProductNameAttribute((ChipClusters.CharStringAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedCharStringAttributeCallback(),
            readBasicInformationProductNameCommandParams);
    result.put("readProductNameAttribute", readBasicInformationProductNameAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readBasicInformationProductIDCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readBasicInformationProductIDAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.BasicInformationCluster) cluster)
                  .readProductIDAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readBasicInformationProductIDCommandParams);
    result.put("readProductIDAttribute", readBasicInformationProductIDAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readBasicInformationNodeLabelCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readBasicInformationNodeLabelAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.BasicInformationCluster) cluster)
                  .readNodeLabelAttribute((ChipClusters.CharStringAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedCharStringAttributeCallback(),
            readBasicInformationNodeLabelCommandParams);
    result.put("readNodeLabelAttribute", readBasicInformationNodeLabelAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readBasicInformationLocationCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readBasicInformationLocationAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.BasicInformationCluster) cluster)
                  .readLocationAttribute((ChipClusters.CharStringAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedCharStringAttributeCallback(),
            readBasicInformationLocationCommandParams);
    result.put("readLocationAttribute", readBasicInformationLocationAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readBasicInformationHardwareVersionCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readBasicInformationHardwareVersionAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.BasicInformationCluster) cluster)
                  .readHardwareVersionAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readBasicInformationHardwareVersionCommandParams);
    result.put(
        "readHardwareVersionAttribute",
        readBasicInformationHardwareVersionAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readBasicInformationHardwareVersionStringCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readBasicInformationHardwareVersionStringAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.BasicInformationCluster) cluster)
                  .readHardwareVersionStringAttribute(
                      (ChipClusters.CharStringAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedCharStringAttributeCallback(),
            readBasicInformationHardwareVersionStringCommandParams);
    result.put(
        "readHardwareVersionStringAttribute",
        readBasicInformationHardwareVersionStringAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readBasicInformationSoftwareVersionCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readBasicInformationSoftwareVersionAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.BasicInformationCluster) cluster)
                  .readSoftwareVersionAttribute((ChipClusters.LongAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedLongAttributeCallback(),
            readBasicInformationSoftwareVersionCommandParams);
    result.put(
        "readSoftwareVersionAttribute",
        readBasicInformationSoftwareVersionAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readBasicInformationSoftwareVersionStringCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readBasicInformationSoftwareVersionStringAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.BasicInformationCluster) cluster)
                  .readSoftwareVersionStringAttribute(
                      (ChipClusters.CharStringAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedCharStringAttributeCallback(),
            readBasicInformationSoftwareVersionStringCommandParams);
    result.put(
        "readSoftwareVersionStringAttribute",
        readBasicInformationSoftwareVersionStringAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readBasicInformationManufacturingDateCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readBasicInformationManufacturingDateAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.BasicInformationCluster) cluster)
                  .readManufacturingDateAttribute(
                      (ChipClusters.CharStringAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedCharStringAttributeCallback(),
            readBasicInformationManufacturingDateCommandParams);
    result.put(
        "readManufacturingDateAttribute",
        readBasicInformationManufacturingDateAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readBasicInformationPartNumberCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readBasicInformationPartNumberAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.BasicInformationCluster) cluster)
                  .readPartNumberAttribute((ChipClusters.CharStringAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedCharStringAttributeCallback(),
            readBasicInformationPartNumberCommandParams);
    result.put("readPartNumberAttribute", readBasicInformationPartNumberAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readBasicInformationProductURLCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readBasicInformationProductURLAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.BasicInformationCluster) cluster)
                  .readProductURLAttribute((ChipClusters.CharStringAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedCharStringAttributeCallback(),
            readBasicInformationProductURLCommandParams);
    result.put("readProductURLAttribute", readBasicInformationProductURLAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readBasicInformationProductLabelCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readBasicInformationProductLabelAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.BasicInformationCluster) cluster)
                  .readProductLabelAttribute((ChipClusters.CharStringAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedCharStringAttributeCallback(),
            readBasicInformationProductLabelCommandParams);
    result.put(
        "readProductLabelAttribute", readBasicInformationProductLabelAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readBasicInformationSerialNumberCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readBasicInformationSerialNumberAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.BasicInformationCluster) cluster)
                  .readSerialNumberAttribute((ChipClusters.CharStringAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedCharStringAttributeCallback(),
            readBasicInformationSerialNumberCommandParams);
    result.put(
        "readSerialNumberAttribute", readBasicInformationSerialNumberAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readBasicInformationLocalConfigDisabledCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readBasicInformationLocalConfigDisabledAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.BasicInformationCluster) cluster)
                  .readLocalConfigDisabledAttribute(
                      (ChipClusters.BooleanAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedBooleanAttributeCallback(),
            readBasicInformationLocalConfigDisabledCommandParams);
    result.put(
        "readLocalConfigDisabledAttribute",
        readBasicInformationLocalConfigDisabledAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readBasicInformationReachableCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readBasicInformationReachableAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.BasicInformationCluster) cluster)
                  .readReachableAttribute((ChipClusters.BooleanAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedBooleanAttributeCallback(),
            readBasicInformationReachableCommandParams);
    result.put("readReachableAttribute", readBasicInformationReachableAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readBasicInformationUniqueIDCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readBasicInformationUniqueIDAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.BasicInformationCluster) cluster)
                  .readUniqueIDAttribute((ChipClusters.CharStringAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedCharStringAttributeCallback(),
            readBasicInformationUniqueIDCommandParams);
    result.put("readUniqueIDAttribute", readBasicInformationUniqueIDAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readBasicInformationGeneratedCommandListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readBasicInformationGeneratedCommandListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.BasicInformationCluster) cluster)
                  .readGeneratedCommandListAttribute(
                      (ChipClusters.BasicInformationCluster.GeneratedCommandListAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedBasicInformationClusterGeneratedCommandListAttributeCallback(),
            readBasicInformationGeneratedCommandListCommandParams);
    result.put(
        "readGeneratedCommandListAttribute",
        readBasicInformationGeneratedCommandListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readBasicInformationAcceptedCommandListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readBasicInformationAcceptedCommandListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.BasicInformationCluster) cluster)
                  .readAcceptedCommandListAttribute(
                      (ChipClusters.BasicInformationCluster.AcceptedCommandListAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedBasicInformationClusterAcceptedCommandListAttributeCallback(),
            readBasicInformationAcceptedCommandListCommandParams);
    result.put(
        "readAcceptedCommandListAttribute",
        readBasicInformationAcceptedCommandListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readBasicInformationEventListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readBasicInformationEventListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.BasicInformationCluster) cluster)
                  .readEventListAttribute(
                      (ChipClusters.BasicInformationCluster.EventListAttributeCallback) callback);
            },
            () ->
                new ClusterInfoMapping.DelegatedBasicInformationClusterEventListAttributeCallback(),
            readBasicInformationEventListCommandParams);
    result.put("readEventListAttribute", readBasicInformationEventListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readBasicInformationAttributeListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readBasicInformationAttributeListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.BasicInformationCluster) cluster)
                  .readAttributeListAttribute(
                      (ChipClusters.BasicInformationCluster.AttributeListAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedBasicInformationClusterAttributeListAttributeCallback(),
            readBasicInformationAttributeListCommandParams);
    result.put(
        "readAttributeListAttribute", readBasicInformationAttributeListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readBasicInformationFeatureMapCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readBasicInformationFeatureMapAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.BasicInformationCluster) cluster)
                  .readFeatureMapAttribute((ChipClusters.LongAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedLongAttributeCallback(),
            readBasicInformationFeatureMapCommandParams);
    result.put("readFeatureMapAttribute", readBasicInformationFeatureMapAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readBasicInformationClusterRevisionCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readBasicInformationClusterRevisionAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.BasicInformationCluster) cluster)
                  .readClusterRevisionAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readBasicInformationClusterRevisionCommandParams);
    result.put(
        "readClusterRevisionAttribute",
        readBasicInformationClusterRevisionAttributeInteractionInfo);

    return result;
  }

  private static Map<String, InteractionInfo> readOtaSoftwareUpdateProviderInteractionInfo() {
    Map<String, InteractionInfo> result = new LinkedHashMap<>();
    Map<String, CommandParameterInfo>
        readOtaSoftwareUpdateProviderGeneratedCommandListCommandParams =
            new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readOtaSoftwareUpdateProviderGeneratedCommandListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.OtaSoftwareUpdateProviderCluster) cluster)
                  .readGeneratedCommandListAttribute(
                      (ChipClusters.OtaSoftwareUpdateProviderCluster
                              .GeneratedCommandListAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedOtaSoftwareUpdateProviderClusterGeneratedCommandListAttributeCallback(),
            readOtaSoftwareUpdateProviderGeneratedCommandListCommandParams);
    result.put(
        "readGeneratedCommandListAttribute",
        readOtaSoftwareUpdateProviderGeneratedCommandListAttributeInteractionInfo);
    Map<String, CommandParameterInfo>
        readOtaSoftwareUpdateProviderAcceptedCommandListCommandParams =
            new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readOtaSoftwareUpdateProviderAcceptedCommandListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.OtaSoftwareUpdateProviderCluster) cluster)
                  .readAcceptedCommandListAttribute(
                      (ChipClusters.OtaSoftwareUpdateProviderCluster
                              .AcceptedCommandListAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedOtaSoftwareUpdateProviderClusterAcceptedCommandListAttributeCallback(),
            readOtaSoftwareUpdateProviderAcceptedCommandListCommandParams);
    result.put(
        "readAcceptedCommandListAttribute",
        readOtaSoftwareUpdateProviderAcceptedCommandListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readOtaSoftwareUpdateProviderEventListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readOtaSoftwareUpdateProviderEventListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.OtaSoftwareUpdateProviderCluster) cluster)
                  .readEventListAttribute(
                      (ChipClusters.OtaSoftwareUpdateProviderCluster.EventListAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedOtaSoftwareUpdateProviderClusterEventListAttributeCallback(),
            readOtaSoftwareUpdateProviderEventListCommandParams);
    result.put(
        "readEventListAttribute", readOtaSoftwareUpdateProviderEventListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readOtaSoftwareUpdateProviderAttributeListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readOtaSoftwareUpdateProviderAttributeListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.OtaSoftwareUpdateProviderCluster) cluster)
                  .readAttributeListAttribute(
                      (ChipClusters.OtaSoftwareUpdateProviderCluster.AttributeListAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedOtaSoftwareUpdateProviderClusterAttributeListAttributeCallback(),
            readOtaSoftwareUpdateProviderAttributeListCommandParams);
    result.put(
        "readAttributeListAttribute",
        readOtaSoftwareUpdateProviderAttributeListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readOtaSoftwareUpdateProviderFeatureMapCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readOtaSoftwareUpdateProviderFeatureMapAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.OtaSoftwareUpdateProviderCluster) cluster)
                  .readFeatureMapAttribute((ChipClusters.LongAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedLongAttributeCallback(),
            readOtaSoftwareUpdateProviderFeatureMapCommandParams);
    result.put(
        "readFeatureMapAttribute", readOtaSoftwareUpdateProviderFeatureMapAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readOtaSoftwareUpdateProviderClusterRevisionCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readOtaSoftwareUpdateProviderClusterRevisionAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.OtaSoftwareUpdateProviderCluster) cluster)
                  .readClusterRevisionAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readOtaSoftwareUpdateProviderClusterRevisionCommandParams);
    result.put(
        "readClusterRevisionAttribute",
        readOtaSoftwareUpdateProviderClusterRevisionAttributeInteractionInfo);

    return result;
  }

  private static Map<String, InteractionInfo> readOtaSoftwareUpdateRequestorInteractionInfo() {
    Map<String, InteractionInfo> result = new LinkedHashMap<>();
    Map<String, CommandParameterInfo>
        readOtaSoftwareUpdateRequestorDefaultOTAProvidersCommandParams =
            new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readOtaSoftwareUpdateRequestorDefaultOTAProvidersAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.OtaSoftwareUpdateRequestorCluster) cluster)
                  .readDefaultOTAProvidersAttribute(
                      (ChipClusters.OtaSoftwareUpdateRequestorCluster
                              .DefaultOTAProvidersAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedOtaSoftwareUpdateRequestorClusterDefaultOTAProvidersAttributeCallback(),
            readOtaSoftwareUpdateRequestorDefaultOTAProvidersCommandParams);
    result.put(
        "readDefaultOTAProvidersAttribute",
        readOtaSoftwareUpdateRequestorDefaultOTAProvidersAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readOtaSoftwareUpdateRequestorUpdatePossibleCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readOtaSoftwareUpdateRequestorUpdatePossibleAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.OtaSoftwareUpdateRequestorCluster) cluster)
                  .readUpdatePossibleAttribute((ChipClusters.BooleanAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedBooleanAttributeCallback(),
            readOtaSoftwareUpdateRequestorUpdatePossibleCommandParams);
    result.put(
        "readUpdatePossibleAttribute",
        readOtaSoftwareUpdateRequestorUpdatePossibleAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readOtaSoftwareUpdateRequestorUpdateStateCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readOtaSoftwareUpdateRequestorUpdateStateAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.OtaSoftwareUpdateRequestorCluster) cluster)
                  .readUpdateStateAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readOtaSoftwareUpdateRequestorUpdateStateCommandParams);
    result.put(
        "readUpdateStateAttribute",
        readOtaSoftwareUpdateRequestorUpdateStateAttributeInteractionInfo);
    Map<String, CommandParameterInfo>
        readOtaSoftwareUpdateRequestorUpdateStateProgressCommandParams =
            new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readOtaSoftwareUpdateRequestorUpdateStateProgressAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.OtaSoftwareUpdateRequestorCluster) cluster)
                  .readUpdateStateProgressAttribute(
                      (ChipClusters.OtaSoftwareUpdateRequestorCluster
                              .UpdateStateProgressAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedOtaSoftwareUpdateRequestorClusterUpdateStateProgressAttributeCallback(),
            readOtaSoftwareUpdateRequestorUpdateStateProgressCommandParams);
    result.put(
        "readUpdateStateProgressAttribute",
        readOtaSoftwareUpdateRequestorUpdateStateProgressAttributeInteractionInfo);
    Map<String, CommandParameterInfo>
        readOtaSoftwareUpdateRequestorGeneratedCommandListCommandParams =
            new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readOtaSoftwareUpdateRequestorGeneratedCommandListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.OtaSoftwareUpdateRequestorCluster) cluster)
                  .readGeneratedCommandListAttribute(
                      (ChipClusters.OtaSoftwareUpdateRequestorCluster
                              .GeneratedCommandListAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedOtaSoftwareUpdateRequestorClusterGeneratedCommandListAttributeCallback(),
            readOtaSoftwareUpdateRequestorGeneratedCommandListCommandParams);
    result.put(
        "readGeneratedCommandListAttribute",
        readOtaSoftwareUpdateRequestorGeneratedCommandListAttributeInteractionInfo);
    Map<String, CommandParameterInfo>
        readOtaSoftwareUpdateRequestorAcceptedCommandListCommandParams =
            new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readOtaSoftwareUpdateRequestorAcceptedCommandListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.OtaSoftwareUpdateRequestorCluster) cluster)
                  .readAcceptedCommandListAttribute(
                      (ChipClusters.OtaSoftwareUpdateRequestorCluster
                              .AcceptedCommandListAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedOtaSoftwareUpdateRequestorClusterAcceptedCommandListAttributeCallback(),
            readOtaSoftwareUpdateRequestorAcceptedCommandListCommandParams);
    result.put(
        "readAcceptedCommandListAttribute",
        readOtaSoftwareUpdateRequestorAcceptedCommandListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readOtaSoftwareUpdateRequestorEventListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readOtaSoftwareUpdateRequestorEventListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.OtaSoftwareUpdateRequestorCluster) cluster)
                  .readEventListAttribute(
                      (ChipClusters.OtaSoftwareUpdateRequestorCluster.EventListAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedOtaSoftwareUpdateRequestorClusterEventListAttributeCallback(),
            readOtaSoftwareUpdateRequestorEventListCommandParams);
    result.put(
        "readEventListAttribute", readOtaSoftwareUpdateRequestorEventListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readOtaSoftwareUpdateRequestorAttributeListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readOtaSoftwareUpdateRequestorAttributeListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.OtaSoftwareUpdateRequestorCluster) cluster)
                  .readAttributeListAttribute(
                      (ChipClusters.OtaSoftwareUpdateRequestorCluster
                              .AttributeListAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedOtaSoftwareUpdateRequestorClusterAttributeListAttributeCallback(),
            readOtaSoftwareUpdateRequestorAttributeListCommandParams);
    result.put(
        "readAttributeListAttribute",
        readOtaSoftwareUpdateRequestorAttributeListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readOtaSoftwareUpdateRequestorFeatureMapCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readOtaSoftwareUpdateRequestorFeatureMapAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.OtaSoftwareUpdateRequestorCluster) cluster)
                  .readFeatureMapAttribute((ChipClusters.LongAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedLongAttributeCallback(),
            readOtaSoftwareUpdateRequestorFeatureMapCommandParams);
    result.put(
        "readFeatureMapAttribute",
        readOtaSoftwareUpdateRequestorFeatureMapAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readOtaSoftwareUpdateRequestorClusterRevisionCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readOtaSoftwareUpdateRequestorClusterRevisionAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.OtaSoftwareUpdateRequestorCluster) cluster)
                  .readClusterRevisionAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readOtaSoftwareUpdateRequestorClusterRevisionCommandParams);
    result.put(
        "readClusterRevisionAttribute",
        readOtaSoftwareUpdateRequestorClusterRevisionAttributeInteractionInfo);

    return result;
  }

  private static Map<String, InteractionInfo> readLocalizationConfigurationInteractionInfo() {
    Map<String, InteractionInfo> result = new LinkedHashMap<>();
    Map<String, CommandParameterInfo> readLocalizationConfigurationActiveLocaleCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readLocalizationConfigurationActiveLocaleAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.LocalizationConfigurationCluster) cluster)
                  .readActiveLocaleAttribute((ChipClusters.CharStringAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedCharStringAttributeCallback(),
            readLocalizationConfigurationActiveLocaleCommandParams);
    result.put(
        "readActiveLocaleAttribute",
        readLocalizationConfigurationActiveLocaleAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readLocalizationConfigurationSupportedLocalesCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readLocalizationConfigurationSupportedLocalesAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.LocalizationConfigurationCluster) cluster)
                  .readSupportedLocalesAttribute(
                      (ChipClusters.LocalizationConfigurationCluster
                              .SupportedLocalesAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedLocalizationConfigurationClusterSupportedLocalesAttributeCallback(),
            readLocalizationConfigurationSupportedLocalesCommandParams);
    result.put(
        "readSupportedLocalesAttribute",
        readLocalizationConfigurationSupportedLocalesAttributeInteractionInfo);
    Map<String, CommandParameterInfo>
        readLocalizationConfigurationGeneratedCommandListCommandParams =
            new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readLocalizationConfigurationGeneratedCommandListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.LocalizationConfigurationCluster) cluster)
                  .readGeneratedCommandListAttribute(
                      (ChipClusters.LocalizationConfigurationCluster
                              .GeneratedCommandListAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedLocalizationConfigurationClusterGeneratedCommandListAttributeCallback(),
            readLocalizationConfigurationGeneratedCommandListCommandParams);
    result.put(
        "readGeneratedCommandListAttribute",
        readLocalizationConfigurationGeneratedCommandListAttributeInteractionInfo);
    Map<String, CommandParameterInfo>
        readLocalizationConfigurationAcceptedCommandListCommandParams =
            new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readLocalizationConfigurationAcceptedCommandListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.LocalizationConfigurationCluster) cluster)
                  .readAcceptedCommandListAttribute(
                      (ChipClusters.LocalizationConfigurationCluster
                              .AcceptedCommandListAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedLocalizationConfigurationClusterAcceptedCommandListAttributeCallback(),
            readLocalizationConfigurationAcceptedCommandListCommandParams);
    result.put(
        "readAcceptedCommandListAttribute",
        readLocalizationConfigurationAcceptedCommandListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readLocalizationConfigurationEventListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readLocalizationConfigurationEventListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.LocalizationConfigurationCluster) cluster)
                  .readEventListAttribute(
                      (ChipClusters.LocalizationConfigurationCluster.EventListAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedLocalizationConfigurationClusterEventListAttributeCallback(),
            readLocalizationConfigurationEventListCommandParams);
    result.put(
        "readEventListAttribute", readLocalizationConfigurationEventListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readLocalizationConfigurationAttributeListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readLocalizationConfigurationAttributeListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.LocalizationConfigurationCluster) cluster)
                  .readAttributeListAttribute(
                      (ChipClusters.LocalizationConfigurationCluster.AttributeListAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedLocalizationConfigurationClusterAttributeListAttributeCallback(),
            readLocalizationConfigurationAttributeListCommandParams);
    result.put(
        "readAttributeListAttribute",
        readLocalizationConfigurationAttributeListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readLocalizationConfigurationFeatureMapCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readLocalizationConfigurationFeatureMapAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.LocalizationConfigurationCluster) cluster)
                  .readFeatureMapAttribute((ChipClusters.LongAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedLongAttributeCallback(),
            readLocalizationConfigurationFeatureMapCommandParams);
    result.put(
        "readFeatureMapAttribute", readLocalizationConfigurationFeatureMapAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readLocalizationConfigurationClusterRevisionCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readLocalizationConfigurationClusterRevisionAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.LocalizationConfigurationCluster) cluster)
                  .readClusterRevisionAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readLocalizationConfigurationClusterRevisionCommandParams);
    result.put(
        "readClusterRevisionAttribute",
        readLocalizationConfigurationClusterRevisionAttributeInteractionInfo);

    return result;
  }

  private static Map<String, InteractionInfo> readTimeFormatLocalizationInteractionInfo() {
    Map<String, InteractionInfo> result = new LinkedHashMap<>();
    Map<String, CommandParameterInfo> readTimeFormatLocalizationHourFormatCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readTimeFormatLocalizationHourFormatAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.TimeFormatLocalizationCluster) cluster)
                  .readHourFormatAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readTimeFormatLocalizationHourFormatCommandParams);
    result.put(
        "readHourFormatAttribute", readTimeFormatLocalizationHourFormatAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readTimeFormatLocalizationActiveCalendarTypeCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readTimeFormatLocalizationActiveCalendarTypeAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.TimeFormatLocalizationCluster) cluster)
                  .readActiveCalendarTypeAttribute(
                      (ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readTimeFormatLocalizationActiveCalendarTypeCommandParams);
    result.put(
        "readActiveCalendarTypeAttribute",
        readTimeFormatLocalizationActiveCalendarTypeAttributeInteractionInfo);
    Map<String, CommandParameterInfo>
        readTimeFormatLocalizationSupportedCalendarTypesCommandParams =
            new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readTimeFormatLocalizationSupportedCalendarTypesAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.TimeFormatLocalizationCluster) cluster)
                  .readSupportedCalendarTypesAttribute(
                      (ChipClusters.TimeFormatLocalizationCluster
                              .SupportedCalendarTypesAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedTimeFormatLocalizationClusterSupportedCalendarTypesAttributeCallback(),
            readTimeFormatLocalizationSupportedCalendarTypesCommandParams);
    result.put(
        "readSupportedCalendarTypesAttribute",
        readTimeFormatLocalizationSupportedCalendarTypesAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readTimeFormatLocalizationGeneratedCommandListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readTimeFormatLocalizationGeneratedCommandListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.TimeFormatLocalizationCluster) cluster)
                  .readGeneratedCommandListAttribute(
                      (ChipClusters.TimeFormatLocalizationCluster
                              .GeneratedCommandListAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedTimeFormatLocalizationClusterGeneratedCommandListAttributeCallback(),
            readTimeFormatLocalizationGeneratedCommandListCommandParams);
    result.put(
        "readGeneratedCommandListAttribute",
        readTimeFormatLocalizationGeneratedCommandListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readTimeFormatLocalizationAcceptedCommandListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readTimeFormatLocalizationAcceptedCommandListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.TimeFormatLocalizationCluster) cluster)
                  .readAcceptedCommandListAttribute(
                      (ChipClusters.TimeFormatLocalizationCluster
                              .AcceptedCommandListAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedTimeFormatLocalizationClusterAcceptedCommandListAttributeCallback(),
            readTimeFormatLocalizationAcceptedCommandListCommandParams);
    result.put(
        "readAcceptedCommandListAttribute",
        readTimeFormatLocalizationAcceptedCommandListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readTimeFormatLocalizationEventListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readTimeFormatLocalizationEventListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.TimeFormatLocalizationCluster) cluster)
                  .readEventListAttribute(
                      (ChipClusters.TimeFormatLocalizationCluster.EventListAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedTimeFormatLocalizationClusterEventListAttributeCallback(),
            readTimeFormatLocalizationEventListCommandParams);
    result.put(
        "readEventListAttribute", readTimeFormatLocalizationEventListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readTimeFormatLocalizationAttributeListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readTimeFormatLocalizationAttributeListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.TimeFormatLocalizationCluster) cluster)
                  .readAttributeListAttribute(
                      (ChipClusters.TimeFormatLocalizationCluster.AttributeListAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedTimeFormatLocalizationClusterAttributeListAttributeCallback(),
            readTimeFormatLocalizationAttributeListCommandParams);
    result.put(
        "readAttributeListAttribute",
        readTimeFormatLocalizationAttributeListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readTimeFormatLocalizationFeatureMapCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readTimeFormatLocalizationFeatureMapAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.TimeFormatLocalizationCluster) cluster)
                  .readFeatureMapAttribute((ChipClusters.LongAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedLongAttributeCallback(),
            readTimeFormatLocalizationFeatureMapCommandParams);
    result.put(
        "readFeatureMapAttribute", readTimeFormatLocalizationFeatureMapAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readTimeFormatLocalizationClusterRevisionCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readTimeFormatLocalizationClusterRevisionAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.TimeFormatLocalizationCluster) cluster)
                  .readClusterRevisionAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readTimeFormatLocalizationClusterRevisionCommandParams);
    result.put(
        "readClusterRevisionAttribute",
        readTimeFormatLocalizationClusterRevisionAttributeInteractionInfo);

    return result;
  }

  private static Map<String, InteractionInfo> readUnitLocalizationInteractionInfo() {
    Map<String, InteractionInfo> result = new LinkedHashMap<>();
    Map<String, CommandParameterInfo> readUnitLocalizationTemperatureUnitCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readUnitLocalizationTemperatureUnitAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.UnitLocalizationCluster) cluster)
                  .readTemperatureUnitAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readUnitLocalizationTemperatureUnitCommandParams);
    result.put(
        "readTemperatureUnitAttribute",
        readUnitLocalizationTemperatureUnitAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readUnitLocalizationGeneratedCommandListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readUnitLocalizationGeneratedCommandListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.UnitLocalizationCluster) cluster)
                  .readGeneratedCommandListAttribute(
                      (ChipClusters.UnitLocalizationCluster.GeneratedCommandListAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedUnitLocalizationClusterGeneratedCommandListAttributeCallback(),
            readUnitLocalizationGeneratedCommandListCommandParams);
    result.put(
        "readGeneratedCommandListAttribute",
        readUnitLocalizationGeneratedCommandListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readUnitLocalizationAcceptedCommandListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readUnitLocalizationAcceptedCommandListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.UnitLocalizationCluster) cluster)
                  .readAcceptedCommandListAttribute(
                      (ChipClusters.UnitLocalizationCluster.AcceptedCommandListAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedUnitLocalizationClusterAcceptedCommandListAttributeCallback(),
            readUnitLocalizationAcceptedCommandListCommandParams);
    result.put(
        "readAcceptedCommandListAttribute",
        readUnitLocalizationAcceptedCommandListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readUnitLocalizationEventListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readUnitLocalizationEventListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.UnitLocalizationCluster) cluster)
                  .readEventListAttribute(
                      (ChipClusters.UnitLocalizationCluster.EventListAttributeCallback) callback);
            },
            () ->
                new ClusterInfoMapping.DelegatedUnitLocalizationClusterEventListAttributeCallback(),
            readUnitLocalizationEventListCommandParams);
    result.put("readEventListAttribute", readUnitLocalizationEventListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readUnitLocalizationAttributeListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readUnitLocalizationAttributeListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.UnitLocalizationCluster) cluster)
                  .readAttributeListAttribute(
                      (ChipClusters.UnitLocalizationCluster.AttributeListAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedUnitLocalizationClusterAttributeListAttributeCallback(),
            readUnitLocalizationAttributeListCommandParams);
    result.put(
        "readAttributeListAttribute", readUnitLocalizationAttributeListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readUnitLocalizationFeatureMapCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readUnitLocalizationFeatureMapAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.UnitLocalizationCluster) cluster)
                  .readFeatureMapAttribute((ChipClusters.LongAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedLongAttributeCallback(),
            readUnitLocalizationFeatureMapCommandParams);
    result.put("readFeatureMapAttribute", readUnitLocalizationFeatureMapAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readUnitLocalizationClusterRevisionCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readUnitLocalizationClusterRevisionAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.UnitLocalizationCluster) cluster)
                  .readClusterRevisionAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readUnitLocalizationClusterRevisionCommandParams);
    result.put(
        "readClusterRevisionAttribute",
        readUnitLocalizationClusterRevisionAttributeInteractionInfo);

    return result;
  }

  private static Map<String, InteractionInfo> readPowerSourceConfigurationInteractionInfo() {
    Map<String, InteractionInfo> result = new LinkedHashMap<>();
    Map<String, CommandParameterInfo> readPowerSourceConfigurationSourcesCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readPowerSourceConfigurationSourcesAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.PowerSourceConfigurationCluster) cluster)
                  .readSourcesAttribute(
                      (ChipClusters.PowerSourceConfigurationCluster.SourcesAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedPowerSourceConfigurationClusterSourcesAttributeCallback(),
            readPowerSourceConfigurationSourcesCommandParams);
    result.put("readSourcesAttribute", readPowerSourceConfigurationSourcesAttributeInteractionInfo);
    Map<String, CommandParameterInfo>
        readPowerSourceConfigurationGeneratedCommandListCommandParams =
            new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readPowerSourceConfigurationGeneratedCommandListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.PowerSourceConfigurationCluster) cluster)
                  .readGeneratedCommandListAttribute(
                      (ChipClusters.PowerSourceConfigurationCluster
                              .GeneratedCommandListAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedPowerSourceConfigurationClusterGeneratedCommandListAttributeCallback(),
            readPowerSourceConfigurationGeneratedCommandListCommandParams);
    result.put(
        "readGeneratedCommandListAttribute",
        readPowerSourceConfigurationGeneratedCommandListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readPowerSourceConfigurationAcceptedCommandListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readPowerSourceConfigurationAcceptedCommandListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.PowerSourceConfigurationCluster) cluster)
                  .readAcceptedCommandListAttribute(
                      (ChipClusters.PowerSourceConfigurationCluster
                              .AcceptedCommandListAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedPowerSourceConfigurationClusterAcceptedCommandListAttributeCallback(),
            readPowerSourceConfigurationAcceptedCommandListCommandParams);
    result.put(
        "readAcceptedCommandListAttribute",
        readPowerSourceConfigurationAcceptedCommandListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readPowerSourceConfigurationEventListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readPowerSourceConfigurationEventListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.PowerSourceConfigurationCluster) cluster)
                  .readEventListAttribute(
                      (ChipClusters.PowerSourceConfigurationCluster.EventListAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedPowerSourceConfigurationClusterEventListAttributeCallback(),
            readPowerSourceConfigurationEventListCommandParams);
    result.put(
        "readEventListAttribute", readPowerSourceConfigurationEventListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readPowerSourceConfigurationAttributeListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readPowerSourceConfigurationAttributeListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.PowerSourceConfigurationCluster) cluster)
                  .readAttributeListAttribute(
                      (ChipClusters.PowerSourceConfigurationCluster.AttributeListAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedPowerSourceConfigurationClusterAttributeListAttributeCallback(),
            readPowerSourceConfigurationAttributeListCommandParams);
    result.put(
        "readAttributeListAttribute",
        readPowerSourceConfigurationAttributeListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readPowerSourceConfigurationFeatureMapCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readPowerSourceConfigurationFeatureMapAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.PowerSourceConfigurationCluster) cluster)
                  .readFeatureMapAttribute((ChipClusters.LongAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedLongAttributeCallback(),
            readPowerSourceConfigurationFeatureMapCommandParams);
    result.put(
        "readFeatureMapAttribute", readPowerSourceConfigurationFeatureMapAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readPowerSourceConfigurationClusterRevisionCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readPowerSourceConfigurationClusterRevisionAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.PowerSourceConfigurationCluster) cluster)
                  .readClusterRevisionAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readPowerSourceConfigurationClusterRevisionCommandParams);
    result.put(
        "readClusterRevisionAttribute",
        readPowerSourceConfigurationClusterRevisionAttributeInteractionInfo);

    return result;
  }

  private static Map<String, InteractionInfo> readPowerSourceInteractionInfo() {
    Map<String, InteractionInfo> result = new LinkedHashMap<>();
    Map<String, CommandParameterInfo> readPowerSourceStatusCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readPowerSourceStatusAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.PowerSourceCluster) cluster)
                  .readStatusAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readPowerSourceStatusCommandParams);
    result.put("readStatusAttribute", readPowerSourceStatusAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readPowerSourceOrderCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readPowerSourceOrderAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.PowerSourceCluster) cluster)
                  .readOrderAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readPowerSourceOrderCommandParams);
    result.put("readOrderAttribute", readPowerSourceOrderAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readPowerSourceDescriptionCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readPowerSourceDescriptionAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.PowerSourceCluster) cluster)
                  .readDescriptionAttribute((ChipClusters.CharStringAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedCharStringAttributeCallback(),
            readPowerSourceDescriptionCommandParams);
    result.put("readDescriptionAttribute", readPowerSourceDescriptionAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readPowerSourceWiredAssessedInputVoltageCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readPowerSourceWiredAssessedInputVoltageAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.PowerSourceCluster) cluster)
                  .readWiredAssessedInputVoltageAttribute(
                      (ChipClusters.PowerSourceCluster.WiredAssessedInputVoltageAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedPowerSourceClusterWiredAssessedInputVoltageAttributeCallback(),
            readPowerSourceWiredAssessedInputVoltageCommandParams);
    result.put(
        "readWiredAssessedInputVoltageAttribute",
        readPowerSourceWiredAssessedInputVoltageAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readPowerSourceWiredAssessedInputFrequencyCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readPowerSourceWiredAssessedInputFrequencyAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.PowerSourceCluster) cluster)
                  .readWiredAssessedInputFrequencyAttribute(
                      (ChipClusters.PowerSourceCluster.WiredAssessedInputFrequencyAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedPowerSourceClusterWiredAssessedInputFrequencyAttributeCallback(),
            readPowerSourceWiredAssessedInputFrequencyCommandParams);
    result.put(
        "readWiredAssessedInputFrequencyAttribute",
        readPowerSourceWiredAssessedInputFrequencyAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readPowerSourceWiredCurrentTypeCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readPowerSourceWiredCurrentTypeAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.PowerSourceCluster) cluster)
                  .readWiredCurrentTypeAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readPowerSourceWiredCurrentTypeCommandParams);
    result.put(
        "readWiredCurrentTypeAttribute", readPowerSourceWiredCurrentTypeAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readPowerSourceWiredAssessedCurrentCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readPowerSourceWiredAssessedCurrentAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.PowerSourceCluster) cluster)
                  .readWiredAssessedCurrentAttribute(
                      (ChipClusters.PowerSourceCluster.WiredAssessedCurrentAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedPowerSourceClusterWiredAssessedCurrentAttributeCallback(),
            readPowerSourceWiredAssessedCurrentCommandParams);
    result.put(
        "readWiredAssessedCurrentAttribute",
        readPowerSourceWiredAssessedCurrentAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readPowerSourceWiredNominalVoltageCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readPowerSourceWiredNominalVoltageAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.PowerSourceCluster) cluster)
                  .readWiredNominalVoltageAttribute((ChipClusters.LongAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedLongAttributeCallback(),
            readPowerSourceWiredNominalVoltageCommandParams);
    result.put(
        "readWiredNominalVoltageAttribute",
        readPowerSourceWiredNominalVoltageAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readPowerSourceWiredMaximumCurrentCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readPowerSourceWiredMaximumCurrentAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.PowerSourceCluster) cluster)
                  .readWiredMaximumCurrentAttribute((ChipClusters.LongAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedLongAttributeCallback(),
            readPowerSourceWiredMaximumCurrentCommandParams);
    result.put(
        "readWiredMaximumCurrentAttribute",
        readPowerSourceWiredMaximumCurrentAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readPowerSourceWiredPresentCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readPowerSourceWiredPresentAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.PowerSourceCluster) cluster)
                  .readWiredPresentAttribute((ChipClusters.BooleanAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedBooleanAttributeCallback(),
            readPowerSourceWiredPresentCommandParams);
    result.put("readWiredPresentAttribute", readPowerSourceWiredPresentAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readPowerSourceActiveWiredFaultsCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readPowerSourceActiveWiredFaultsAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.PowerSourceCluster) cluster)
                  .readActiveWiredFaultsAttribute(
                      (ChipClusters.PowerSourceCluster.ActiveWiredFaultsAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedPowerSourceClusterActiveWiredFaultsAttributeCallback(),
            readPowerSourceActiveWiredFaultsCommandParams);
    result.put(
        "readActiveWiredFaultsAttribute", readPowerSourceActiveWiredFaultsAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readPowerSourceBatVoltageCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readPowerSourceBatVoltageAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.PowerSourceCluster) cluster)
                  .readBatVoltageAttribute(
                      (ChipClusters.PowerSourceCluster.BatVoltageAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedPowerSourceClusterBatVoltageAttributeCallback(),
            readPowerSourceBatVoltageCommandParams);
    result.put("readBatVoltageAttribute", readPowerSourceBatVoltageAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readPowerSourceBatPercentRemainingCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readPowerSourceBatPercentRemainingAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.PowerSourceCluster) cluster)
                  .readBatPercentRemainingAttribute(
                      (ChipClusters.PowerSourceCluster.BatPercentRemainingAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedPowerSourceClusterBatPercentRemainingAttributeCallback(),
            readPowerSourceBatPercentRemainingCommandParams);
    result.put(
        "readBatPercentRemainingAttribute",
        readPowerSourceBatPercentRemainingAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readPowerSourceBatTimeRemainingCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readPowerSourceBatTimeRemainingAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.PowerSourceCluster) cluster)
                  .readBatTimeRemainingAttribute(
                      (ChipClusters.PowerSourceCluster.BatTimeRemainingAttributeCallback) callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedPowerSourceClusterBatTimeRemainingAttributeCallback(),
            readPowerSourceBatTimeRemainingCommandParams);
    result.put(
        "readBatTimeRemainingAttribute", readPowerSourceBatTimeRemainingAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readPowerSourceBatChargeLevelCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readPowerSourceBatChargeLevelAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.PowerSourceCluster) cluster)
                  .readBatChargeLevelAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readPowerSourceBatChargeLevelCommandParams);
    result.put(
        "readBatChargeLevelAttribute", readPowerSourceBatChargeLevelAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readPowerSourceBatReplacementNeededCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readPowerSourceBatReplacementNeededAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.PowerSourceCluster) cluster)
                  .readBatReplacementNeededAttribute(
                      (ChipClusters.BooleanAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedBooleanAttributeCallback(),
            readPowerSourceBatReplacementNeededCommandParams);
    result.put(
        "readBatReplacementNeededAttribute",
        readPowerSourceBatReplacementNeededAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readPowerSourceBatReplaceabilityCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readPowerSourceBatReplaceabilityAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.PowerSourceCluster) cluster)
                  .readBatReplaceabilityAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readPowerSourceBatReplaceabilityCommandParams);
    result.put(
        "readBatReplaceabilityAttribute", readPowerSourceBatReplaceabilityAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readPowerSourceBatPresentCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readPowerSourceBatPresentAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.PowerSourceCluster) cluster)
                  .readBatPresentAttribute((ChipClusters.BooleanAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedBooleanAttributeCallback(),
            readPowerSourceBatPresentCommandParams);
    result.put("readBatPresentAttribute", readPowerSourceBatPresentAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readPowerSourceActiveBatFaultsCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readPowerSourceActiveBatFaultsAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.PowerSourceCluster) cluster)
                  .readActiveBatFaultsAttribute(
                      (ChipClusters.PowerSourceCluster.ActiveBatFaultsAttributeCallback) callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedPowerSourceClusterActiveBatFaultsAttributeCallback(),
            readPowerSourceActiveBatFaultsCommandParams);
    result.put(
        "readActiveBatFaultsAttribute", readPowerSourceActiveBatFaultsAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readPowerSourceBatReplacementDescriptionCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readPowerSourceBatReplacementDescriptionAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.PowerSourceCluster) cluster)
                  .readBatReplacementDescriptionAttribute(
                      (ChipClusters.CharStringAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedCharStringAttributeCallback(),
            readPowerSourceBatReplacementDescriptionCommandParams);
    result.put(
        "readBatReplacementDescriptionAttribute",
        readPowerSourceBatReplacementDescriptionAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readPowerSourceBatCommonDesignationCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readPowerSourceBatCommonDesignationAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.PowerSourceCluster) cluster)
                  .readBatCommonDesignationAttribute(
                      (ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readPowerSourceBatCommonDesignationCommandParams);
    result.put(
        "readBatCommonDesignationAttribute",
        readPowerSourceBatCommonDesignationAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readPowerSourceBatANSIDesignationCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readPowerSourceBatANSIDesignationAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.PowerSourceCluster) cluster)
                  .readBatANSIDesignationAttribute(
                      (ChipClusters.CharStringAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedCharStringAttributeCallback(),
            readPowerSourceBatANSIDesignationCommandParams);
    result.put(
        "readBatANSIDesignationAttribute",
        readPowerSourceBatANSIDesignationAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readPowerSourceBatIECDesignationCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readPowerSourceBatIECDesignationAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.PowerSourceCluster) cluster)
                  .readBatIECDesignationAttribute(
                      (ChipClusters.CharStringAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedCharStringAttributeCallback(),
            readPowerSourceBatIECDesignationCommandParams);
    result.put(
        "readBatIECDesignationAttribute", readPowerSourceBatIECDesignationAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readPowerSourceBatApprovedChemistryCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readPowerSourceBatApprovedChemistryAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.PowerSourceCluster) cluster)
                  .readBatApprovedChemistryAttribute(
                      (ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readPowerSourceBatApprovedChemistryCommandParams);
    result.put(
        "readBatApprovedChemistryAttribute",
        readPowerSourceBatApprovedChemistryAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readPowerSourceBatCapacityCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readPowerSourceBatCapacityAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.PowerSourceCluster) cluster)
                  .readBatCapacityAttribute((ChipClusters.LongAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedLongAttributeCallback(),
            readPowerSourceBatCapacityCommandParams);
    result.put("readBatCapacityAttribute", readPowerSourceBatCapacityAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readPowerSourceBatQuantityCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readPowerSourceBatQuantityAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.PowerSourceCluster) cluster)
                  .readBatQuantityAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readPowerSourceBatQuantityCommandParams);
    result.put("readBatQuantityAttribute", readPowerSourceBatQuantityAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readPowerSourceBatChargeStateCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readPowerSourceBatChargeStateAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.PowerSourceCluster) cluster)
                  .readBatChargeStateAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readPowerSourceBatChargeStateCommandParams);
    result.put(
        "readBatChargeStateAttribute", readPowerSourceBatChargeStateAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readPowerSourceBatTimeToFullChargeCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readPowerSourceBatTimeToFullChargeAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.PowerSourceCluster) cluster)
                  .readBatTimeToFullChargeAttribute(
                      (ChipClusters.PowerSourceCluster.BatTimeToFullChargeAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedPowerSourceClusterBatTimeToFullChargeAttributeCallback(),
            readPowerSourceBatTimeToFullChargeCommandParams);
    result.put(
        "readBatTimeToFullChargeAttribute",
        readPowerSourceBatTimeToFullChargeAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readPowerSourceBatFunctionalWhileChargingCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readPowerSourceBatFunctionalWhileChargingAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.PowerSourceCluster) cluster)
                  .readBatFunctionalWhileChargingAttribute(
                      (ChipClusters.BooleanAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedBooleanAttributeCallback(),
            readPowerSourceBatFunctionalWhileChargingCommandParams);
    result.put(
        "readBatFunctionalWhileChargingAttribute",
        readPowerSourceBatFunctionalWhileChargingAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readPowerSourceBatChargingCurrentCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readPowerSourceBatChargingCurrentAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.PowerSourceCluster) cluster)
                  .readBatChargingCurrentAttribute(
                      (ChipClusters.PowerSourceCluster.BatChargingCurrentAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedPowerSourceClusterBatChargingCurrentAttributeCallback(),
            readPowerSourceBatChargingCurrentCommandParams);
    result.put(
        "readBatChargingCurrentAttribute",
        readPowerSourceBatChargingCurrentAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readPowerSourceActiveBatChargeFaultsCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readPowerSourceActiveBatChargeFaultsAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.PowerSourceCluster) cluster)
                  .readActiveBatChargeFaultsAttribute(
                      (ChipClusters.PowerSourceCluster.ActiveBatChargeFaultsAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedPowerSourceClusterActiveBatChargeFaultsAttributeCallback(),
            readPowerSourceActiveBatChargeFaultsCommandParams);
    result.put(
        "readActiveBatChargeFaultsAttribute",
        readPowerSourceActiveBatChargeFaultsAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readPowerSourceGeneratedCommandListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readPowerSourceGeneratedCommandListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.PowerSourceCluster) cluster)
                  .readGeneratedCommandListAttribute(
                      (ChipClusters.PowerSourceCluster.GeneratedCommandListAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedPowerSourceClusterGeneratedCommandListAttributeCallback(),
            readPowerSourceGeneratedCommandListCommandParams);
    result.put(
        "readGeneratedCommandListAttribute",
        readPowerSourceGeneratedCommandListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readPowerSourceAcceptedCommandListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readPowerSourceAcceptedCommandListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.PowerSourceCluster) cluster)
                  .readAcceptedCommandListAttribute(
                      (ChipClusters.PowerSourceCluster.AcceptedCommandListAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedPowerSourceClusterAcceptedCommandListAttributeCallback(),
            readPowerSourceAcceptedCommandListCommandParams);
    result.put(
        "readAcceptedCommandListAttribute",
        readPowerSourceAcceptedCommandListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readPowerSourceEventListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readPowerSourceEventListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.PowerSourceCluster) cluster)
                  .readEventListAttribute(
                      (ChipClusters.PowerSourceCluster.EventListAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedPowerSourceClusterEventListAttributeCallback(),
            readPowerSourceEventListCommandParams);
    result.put("readEventListAttribute", readPowerSourceEventListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readPowerSourceAttributeListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readPowerSourceAttributeListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.PowerSourceCluster) cluster)
                  .readAttributeListAttribute(
                      (ChipClusters.PowerSourceCluster.AttributeListAttributeCallback) callback);
            },
            () ->
                new ClusterInfoMapping.DelegatedPowerSourceClusterAttributeListAttributeCallback(),
            readPowerSourceAttributeListCommandParams);
    result.put("readAttributeListAttribute", readPowerSourceAttributeListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readPowerSourceFeatureMapCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readPowerSourceFeatureMapAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.PowerSourceCluster) cluster)
                  .readFeatureMapAttribute((ChipClusters.LongAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedLongAttributeCallback(),
            readPowerSourceFeatureMapCommandParams);
    result.put("readFeatureMapAttribute", readPowerSourceFeatureMapAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readPowerSourceClusterRevisionCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readPowerSourceClusterRevisionAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.PowerSourceCluster) cluster)
                  .readClusterRevisionAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readPowerSourceClusterRevisionCommandParams);
    result.put(
        "readClusterRevisionAttribute", readPowerSourceClusterRevisionAttributeInteractionInfo);

    return result;
  }

  private static Map<String, InteractionInfo> readGeneralCommissioningInteractionInfo() {
    Map<String, InteractionInfo> result = new LinkedHashMap<>();
    Map<String, CommandParameterInfo> readGeneralCommissioningBreadcrumbCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readGeneralCommissioningBreadcrumbAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.GeneralCommissioningCluster) cluster)
                  .readBreadcrumbAttribute((ChipClusters.LongAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedLongAttributeCallback(),
            readGeneralCommissioningBreadcrumbCommandParams);
    result.put(
        "readBreadcrumbAttribute", readGeneralCommissioningBreadcrumbAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readGeneralCommissioningRegulatoryConfigCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readGeneralCommissioningRegulatoryConfigAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.GeneralCommissioningCluster) cluster)
                  .readRegulatoryConfigAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readGeneralCommissioningRegulatoryConfigCommandParams);
    result.put(
        "readRegulatoryConfigAttribute",
        readGeneralCommissioningRegulatoryConfigAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readGeneralCommissioningLocationCapabilityCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readGeneralCommissioningLocationCapabilityAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.GeneralCommissioningCluster) cluster)
                  .readLocationCapabilityAttribute(
                      (ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readGeneralCommissioningLocationCapabilityCommandParams);
    result.put(
        "readLocationCapabilityAttribute",
        readGeneralCommissioningLocationCapabilityAttributeInteractionInfo);
    Map<String, CommandParameterInfo>
        readGeneralCommissioningSupportsConcurrentConnectionCommandParams =
            new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readGeneralCommissioningSupportsConcurrentConnectionAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.GeneralCommissioningCluster) cluster)
                  .readSupportsConcurrentConnectionAttribute(
                      (ChipClusters.BooleanAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedBooleanAttributeCallback(),
            readGeneralCommissioningSupportsConcurrentConnectionCommandParams);
    result.put(
        "readSupportsConcurrentConnectionAttribute",
        readGeneralCommissioningSupportsConcurrentConnectionAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readGeneralCommissioningGeneratedCommandListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readGeneralCommissioningGeneratedCommandListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.GeneralCommissioningCluster) cluster)
                  .readGeneratedCommandListAttribute(
                      (ChipClusters.GeneralCommissioningCluster
                              .GeneratedCommandListAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedGeneralCommissioningClusterGeneratedCommandListAttributeCallback(),
            readGeneralCommissioningGeneratedCommandListCommandParams);
    result.put(
        "readGeneratedCommandListAttribute",
        readGeneralCommissioningGeneratedCommandListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readGeneralCommissioningAcceptedCommandListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readGeneralCommissioningAcceptedCommandListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.GeneralCommissioningCluster) cluster)
                  .readAcceptedCommandListAttribute(
                      (ChipClusters.GeneralCommissioningCluster
                              .AcceptedCommandListAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedGeneralCommissioningClusterAcceptedCommandListAttributeCallback(),
            readGeneralCommissioningAcceptedCommandListCommandParams);
    result.put(
        "readAcceptedCommandListAttribute",
        readGeneralCommissioningAcceptedCommandListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readGeneralCommissioningEventListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readGeneralCommissioningEventListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.GeneralCommissioningCluster) cluster)
                  .readEventListAttribute(
                      (ChipClusters.GeneralCommissioningCluster.EventListAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedGeneralCommissioningClusterEventListAttributeCallback(),
            readGeneralCommissioningEventListCommandParams);
    result.put("readEventListAttribute", readGeneralCommissioningEventListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readGeneralCommissioningAttributeListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readGeneralCommissioningAttributeListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.GeneralCommissioningCluster) cluster)
                  .readAttributeListAttribute(
                      (ChipClusters.GeneralCommissioningCluster.AttributeListAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedGeneralCommissioningClusterAttributeListAttributeCallback(),
            readGeneralCommissioningAttributeListCommandParams);
    result.put(
        "readAttributeListAttribute",
        readGeneralCommissioningAttributeListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readGeneralCommissioningFeatureMapCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readGeneralCommissioningFeatureMapAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.GeneralCommissioningCluster) cluster)
                  .readFeatureMapAttribute((ChipClusters.LongAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedLongAttributeCallback(),
            readGeneralCommissioningFeatureMapCommandParams);
    result.put(
        "readFeatureMapAttribute", readGeneralCommissioningFeatureMapAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readGeneralCommissioningClusterRevisionCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readGeneralCommissioningClusterRevisionAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.GeneralCommissioningCluster) cluster)
                  .readClusterRevisionAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readGeneralCommissioningClusterRevisionCommandParams);
    result.put(
        "readClusterRevisionAttribute",
        readGeneralCommissioningClusterRevisionAttributeInteractionInfo);

    return result;
  }

  private static Map<String, InteractionInfo> readNetworkCommissioningInteractionInfo() {
    Map<String, InteractionInfo> result = new LinkedHashMap<>();
    Map<String, CommandParameterInfo> readNetworkCommissioningMaxNetworksCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readNetworkCommissioningMaxNetworksAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.NetworkCommissioningCluster) cluster)
                  .readMaxNetworksAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readNetworkCommissioningMaxNetworksCommandParams);
    result.put(
        "readMaxNetworksAttribute", readNetworkCommissioningMaxNetworksAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readNetworkCommissioningNetworksCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readNetworkCommissioningNetworksAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.NetworkCommissioningCluster) cluster)
                  .readNetworksAttribute(
                      (ChipClusters.NetworkCommissioningCluster.NetworksAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedNetworkCommissioningClusterNetworksAttributeCallback(),
            readNetworkCommissioningNetworksCommandParams);
    result.put("readNetworksAttribute", readNetworkCommissioningNetworksAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readNetworkCommissioningScanMaxTimeSecondsCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readNetworkCommissioningScanMaxTimeSecondsAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.NetworkCommissioningCluster) cluster)
                  .readScanMaxTimeSecondsAttribute(
                      (ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readNetworkCommissioningScanMaxTimeSecondsCommandParams);
    result.put(
        "readScanMaxTimeSecondsAttribute",
        readNetworkCommissioningScanMaxTimeSecondsAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readNetworkCommissioningConnectMaxTimeSecondsCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readNetworkCommissioningConnectMaxTimeSecondsAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.NetworkCommissioningCluster) cluster)
                  .readConnectMaxTimeSecondsAttribute(
                      (ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readNetworkCommissioningConnectMaxTimeSecondsCommandParams);
    result.put(
        "readConnectMaxTimeSecondsAttribute",
        readNetworkCommissioningConnectMaxTimeSecondsAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readNetworkCommissioningInterfaceEnabledCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readNetworkCommissioningInterfaceEnabledAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.NetworkCommissioningCluster) cluster)
                  .readInterfaceEnabledAttribute((ChipClusters.BooleanAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedBooleanAttributeCallback(),
            readNetworkCommissioningInterfaceEnabledCommandParams);
    result.put(
        "readInterfaceEnabledAttribute",
        readNetworkCommissioningInterfaceEnabledAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readNetworkCommissioningLastNetworkingStatusCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readNetworkCommissioningLastNetworkingStatusAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.NetworkCommissioningCluster) cluster)
                  .readLastNetworkingStatusAttribute(
                      (ChipClusters.NetworkCommissioningCluster
                              .LastNetworkingStatusAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedNetworkCommissioningClusterLastNetworkingStatusAttributeCallback(),
            readNetworkCommissioningLastNetworkingStatusCommandParams);
    result.put(
        "readLastNetworkingStatusAttribute",
        readNetworkCommissioningLastNetworkingStatusAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readNetworkCommissioningLastNetworkIDCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readNetworkCommissioningLastNetworkIDAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.NetworkCommissioningCluster) cluster)
                  .readLastNetworkIDAttribute(
                      (ChipClusters.NetworkCommissioningCluster.LastNetworkIDAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedNetworkCommissioningClusterLastNetworkIDAttributeCallback(),
            readNetworkCommissioningLastNetworkIDCommandParams);
    result.put(
        "readLastNetworkIDAttribute",
        readNetworkCommissioningLastNetworkIDAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readNetworkCommissioningLastConnectErrorValueCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readNetworkCommissioningLastConnectErrorValueAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.NetworkCommissioningCluster) cluster)
                  .readLastConnectErrorValueAttribute(
                      (ChipClusters.NetworkCommissioningCluster
                              .LastConnectErrorValueAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedNetworkCommissioningClusterLastConnectErrorValueAttributeCallback(),
            readNetworkCommissioningLastConnectErrorValueCommandParams);
    result.put(
        "readLastConnectErrorValueAttribute",
        readNetworkCommissioningLastConnectErrorValueAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readNetworkCommissioningGeneratedCommandListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readNetworkCommissioningGeneratedCommandListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.NetworkCommissioningCluster) cluster)
                  .readGeneratedCommandListAttribute(
                      (ChipClusters.NetworkCommissioningCluster
                              .GeneratedCommandListAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedNetworkCommissioningClusterGeneratedCommandListAttributeCallback(),
            readNetworkCommissioningGeneratedCommandListCommandParams);
    result.put(
        "readGeneratedCommandListAttribute",
        readNetworkCommissioningGeneratedCommandListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readNetworkCommissioningAcceptedCommandListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readNetworkCommissioningAcceptedCommandListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.NetworkCommissioningCluster) cluster)
                  .readAcceptedCommandListAttribute(
                      (ChipClusters.NetworkCommissioningCluster
                              .AcceptedCommandListAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedNetworkCommissioningClusterAcceptedCommandListAttributeCallback(),
            readNetworkCommissioningAcceptedCommandListCommandParams);
    result.put(
        "readAcceptedCommandListAttribute",
        readNetworkCommissioningAcceptedCommandListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readNetworkCommissioningEventListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readNetworkCommissioningEventListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.NetworkCommissioningCluster) cluster)
                  .readEventListAttribute(
                      (ChipClusters.NetworkCommissioningCluster.EventListAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedNetworkCommissioningClusterEventListAttributeCallback(),
            readNetworkCommissioningEventListCommandParams);
    result.put("readEventListAttribute", readNetworkCommissioningEventListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readNetworkCommissioningAttributeListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readNetworkCommissioningAttributeListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.NetworkCommissioningCluster) cluster)
                  .readAttributeListAttribute(
                      (ChipClusters.NetworkCommissioningCluster.AttributeListAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedNetworkCommissioningClusterAttributeListAttributeCallback(),
            readNetworkCommissioningAttributeListCommandParams);
    result.put(
        "readAttributeListAttribute",
        readNetworkCommissioningAttributeListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readNetworkCommissioningFeatureMapCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readNetworkCommissioningFeatureMapAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.NetworkCommissioningCluster) cluster)
                  .readFeatureMapAttribute((ChipClusters.LongAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedLongAttributeCallback(),
            readNetworkCommissioningFeatureMapCommandParams);
    result.put(
        "readFeatureMapAttribute", readNetworkCommissioningFeatureMapAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readNetworkCommissioningClusterRevisionCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readNetworkCommissioningClusterRevisionAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.NetworkCommissioningCluster) cluster)
                  .readClusterRevisionAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readNetworkCommissioningClusterRevisionCommandParams);
    result.put(
        "readClusterRevisionAttribute",
        readNetworkCommissioningClusterRevisionAttributeInteractionInfo);

    return result;
  }

  private static Map<String, InteractionInfo> readDiagnosticLogsInteractionInfo() {
    Map<String, InteractionInfo> result = new LinkedHashMap<>();
    Map<String, CommandParameterInfo> readDiagnosticLogsGeneratedCommandListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readDiagnosticLogsGeneratedCommandListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.DiagnosticLogsCluster) cluster)
                  .readGeneratedCommandListAttribute(
                      (ChipClusters.DiagnosticLogsCluster.GeneratedCommandListAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedDiagnosticLogsClusterGeneratedCommandListAttributeCallback(),
            readDiagnosticLogsGeneratedCommandListCommandParams);
    result.put(
        "readGeneratedCommandListAttribute",
        readDiagnosticLogsGeneratedCommandListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readDiagnosticLogsAcceptedCommandListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readDiagnosticLogsAcceptedCommandListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.DiagnosticLogsCluster) cluster)
                  .readAcceptedCommandListAttribute(
                      (ChipClusters.DiagnosticLogsCluster.AcceptedCommandListAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedDiagnosticLogsClusterAcceptedCommandListAttributeCallback(),
            readDiagnosticLogsAcceptedCommandListCommandParams);
    result.put(
        "readAcceptedCommandListAttribute",
        readDiagnosticLogsAcceptedCommandListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readDiagnosticLogsEventListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readDiagnosticLogsEventListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.DiagnosticLogsCluster) cluster)
                  .readEventListAttribute(
                      (ChipClusters.DiagnosticLogsCluster.EventListAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedDiagnosticLogsClusterEventListAttributeCallback(),
            readDiagnosticLogsEventListCommandParams);
    result.put("readEventListAttribute", readDiagnosticLogsEventListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readDiagnosticLogsAttributeListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readDiagnosticLogsAttributeListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.DiagnosticLogsCluster) cluster)
                  .readAttributeListAttribute(
                      (ChipClusters.DiagnosticLogsCluster.AttributeListAttributeCallback) callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedDiagnosticLogsClusterAttributeListAttributeCallback(),
            readDiagnosticLogsAttributeListCommandParams);
    result.put(
        "readAttributeListAttribute", readDiagnosticLogsAttributeListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readDiagnosticLogsFeatureMapCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readDiagnosticLogsFeatureMapAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.DiagnosticLogsCluster) cluster)
                  .readFeatureMapAttribute((ChipClusters.LongAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedLongAttributeCallback(),
            readDiagnosticLogsFeatureMapCommandParams);
    result.put("readFeatureMapAttribute", readDiagnosticLogsFeatureMapAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readDiagnosticLogsClusterRevisionCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readDiagnosticLogsClusterRevisionAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.DiagnosticLogsCluster) cluster)
                  .readClusterRevisionAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readDiagnosticLogsClusterRevisionCommandParams);
    result.put(
        "readClusterRevisionAttribute", readDiagnosticLogsClusterRevisionAttributeInteractionInfo);

    return result;
  }

  private static Map<String, InteractionInfo> readGeneralDiagnosticsInteractionInfo() {
    Map<String, InteractionInfo> result = new LinkedHashMap<>();
    Map<String, CommandParameterInfo> readGeneralDiagnosticsNetworkInterfacesCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readGeneralDiagnosticsNetworkInterfacesAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.GeneralDiagnosticsCluster) cluster)
                  .readNetworkInterfacesAttribute(
                      (ChipClusters.GeneralDiagnosticsCluster.NetworkInterfacesAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedGeneralDiagnosticsClusterNetworkInterfacesAttributeCallback(),
            readGeneralDiagnosticsNetworkInterfacesCommandParams);
    result.put(
        "readNetworkInterfacesAttribute",
        readGeneralDiagnosticsNetworkInterfacesAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readGeneralDiagnosticsRebootCountCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readGeneralDiagnosticsRebootCountAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.GeneralDiagnosticsCluster) cluster)
                  .readRebootCountAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readGeneralDiagnosticsRebootCountCommandParams);
    result.put(
        "readRebootCountAttribute", readGeneralDiagnosticsRebootCountAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readGeneralDiagnosticsUpTimeCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readGeneralDiagnosticsUpTimeAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.GeneralDiagnosticsCluster) cluster)
                  .readUpTimeAttribute((ChipClusters.LongAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedLongAttributeCallback(),
            readGeneralDiagnosticsUpTimeCommandParams);
    result.put("readUpTimeAttribute", readGeneralDiagnosticsUpTimeAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readGeneralDiagnosticsTotalOperationalHoursCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readGeneralDiagnosticsTotalOperationalHoursAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.GeneralDiagnosticsCluster) cluster)
                  .readTotalOperationalHoursAttribute(
                      (ChipClusters.LongAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedLongAttributeCallback(),
            readGeneralDiagnosticsTotalOperationalHoursCommandParams);
    result.put(
        "readTotalOperationalHoursAttribute",
        readGeneralDiagnosticsTotalOperationalHoursAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readGeneralDiagnosticsBootReasonCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readGeneralDiagnosticsBootReasonAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.GeneralDiagnosticsCluster) cluster)
                  .readBootReasonAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readGeneralDiagnosticsBootReasonCommandParams);
    result.put("readBootReasonAttribute", readGeneralDiagnosticsBootReasonAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readGeneralDiagnosticsActiveHardwareFaultsCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readGeneralDiagnosticsActiveHardwareFaultsAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.GeneralDiagnosticsCluster) cluster)
                  .readActiveHardwareFaultsAttribute(
                      (ChipClusters.GeneralDiagnosticsCluster.ActiveHardwareFaultsAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedGeneralDiagnosticsClusterActiveHardwareFaultsAttributeCallback(),
            readGeneralDiagnosticsActiveHardwareFaultsCommandParams);
    result.put(
        "readActiveHardwareFaultsAttribute",
        readGeneralDiagnosticsActiveHardwareFaultsAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readGeneralDiagnosticsActiveRadioFaultsCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readGeneralDiagnosticsActiveRadioFaultsAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.GeneralDiagnosticsCluster) cluster)
                  .readActiveRadioFaultsAttribute(
                      (ChipClusters.GeneralDiagnosticsCluster.ActiveRadioFaultsAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedGeneralDiagnosticsClusterActiveRadioFaultsAttributeCallback(),
            readGeneralDiagnosticsActiveRadioFaultsCommandParams);
    result.put(
        "readActiveRadioFaultsAttribute",
        readGeneralDiagnosticsActiveRadioFaultsAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readGeneralDiagnosticsActiveNetworkFaultsCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readGeneralDiagnosticsActiveNetworkFaultsAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.GeneralDiagnosticsCluster) cluster)
                  .readActiveNetworkFaultsAttribute(
                      (ChipClusters.GeneralDiagnosticsCluster.ActiveNetworkFaultsAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedGeneralDiagnosticsClusterActiveNetworkFaultsAttributeCallback(),
            readGeneralDiagnosticsActiveNetworkFaultsCommandParams);
    result.put(
        "readActiveNetworkFaultsAttribute",
        readGeneralDiagnosticsActiveNetworkFaultsAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readGeneralDiagnosticsTestEventTriggersEnabledCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readGeneralDiagnosticsTestEventTriggersEnabledAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.GeneralDiagnosticsCluster) cluster)
                  .readTestEventTriggersEnabledAttribute(
                      (ChipClusters.BooleanAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedBooleanAttributeCallback(),
            readGeneralDiagnosticsTestEventTriggersEnabledCommandParams);
    result.put(
        "readTestEventTriggersEnabledAttribute",
        readGeneralDiagnosticsTestEventTriggersEnabledAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readGeneralDiagnosticsGeneratedCommandListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readGeneralDiagnosticsGeneratedCommandListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.GeneralDiagnosticsCluster) cluster)
                  .readGeneratedCommandListAttribute(
                      (ChipClusters.GeneralDiagnosticsCluster.GeneratedCommandListAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedGeneralDiagnosticsClusterGeneratedCommandListAttributeCallback(),
            readGeneralDiagnosticsGeneratedCommandListCommandParams);
    result.put(
        "readGeneratedCommandListAttribute",
        readGeneralDiagnosticsGeneratedCommandListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readGeneralDiagnosticsAcceptedCommandListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readGeneralDiagnosticsAcceptedCommandListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.GeneralDiagnosticsCluster) cluster)
                  .readAcceptedCommandListAttribute(
                      (ChipClusters.GeneralDiagnosticsCluster.AcceptedCommandListAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedGeneralDiagnosticsClusterAcceptedCommandListAttributeCallback(),
            readGeneralDiagnosticsAcceptedCommandListCommandParams);
    result.put(
        "readAcceptedCommandListAttribute",
        readGeneralDiagnosticsAcceptedCommandListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readGeneralDiagnosticsEventListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readGeneralDiagnosticsEventListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.GeneralDiagnosticsCluster) cluster)
                  .readEventListAttribute(
                      (ChipClusters.GeneralDiagnosticsCluster.EventListAttributeCallback) callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedGeneralDiagnosticsClusterEventListAttributeCallback(),
            readGeneralDiagnosticsEventListCommandParams);
    result.put("readEventListAttribute", readGeneralDiagnosticsEventListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readGeneralDiagnosticsAttributeListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readGeneralDiagnosticsAttributeListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.GeneralDiagnosticsCluster) cluster)
                  .readAttributeListAttribute(
                      (ChipClusters.GeneralDiagnosticsCluster.AttributeListAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedGeneralDiagnosticsClusterAttributeListAttributeCallback(),
            readGeneralDiagnosticsAttributeListCommandParams);
    result.put(
        "readAttributeListAttribute", readGeneralDiagnosticsAttributeListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readGeneralDiagnosticsFeatureMapCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readGeneralDiagnosticsFeatureMapAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.GeneralDiagnosticsCluster) cluster)
                  .readFeatureMapAttribute((ChipClusters.LongAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedLongAttributeCallback(),
            readGeneralDiagnosticsFeatureMapCommandParams);
    result.put("readFeatureMapAttribute", readGeneralDiagnosticsFeatureMapAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readGeneralDiagnosticsClusterRevisionCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readGeneralDiagnosticsClusterRevisionAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.GeneralDiagnosticsCluster) cluster)
                  .readClusterRevisionAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readGeneralDiagnosticsClusterRevisionCommandParams);
    result.put(
        "readClusterRevisionAttribute",
        readGeneralDiagnosticsClusterRevisionAttributeInteractionInfo);

    return result;
  }

  private static Map<String, InteractionInfo> readSoftwareDiagnosticsInteractionInfo() {
    Map<String, InteractionInfo> result = new LinkedHashMap<>();
    Map<String, CommandParameterInfo> readSoftwareDiagnosticsThreadMetricsCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readSoftwareDiagnosticsThreadMetricsAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.SoftwareDiagnosticsCluster) cluster)
                  .readThreadMetricsAttribute(
                      (ChipClusters.SoftwareDiagnosticsCluster.ThreadMetricsAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedSoftwareDiagnosticsClusterThreadMetricsAttributeCallback(),
            readSoftwareDiagnosticsThreadMetricsCommandParams);
    result.put(
        "readThreadMetricsAttribute", readSoftwareDiagnosticsThreadMetricsAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readSoftwareDiagnosticsCurrentHeapFreeCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readSoftwareDiagnosticsCurrentHeapFreeAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.SoftwareDiagnosticsCluster) cluster)
                  .readCurrentHeapFreeAttribute((ChipClusters.LongAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedLongAttributeCallback(),
            readSoftwareDiagnosticsCurrentHeapFreeCommandParams);
    result.put(
        "readCurrentHeapFreeAttribute",
        readSoftwareDiagnosticsCurrentHeapFreeAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readSoftwareDiagnosticsCurrentHeapUsedCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readSoftwareDiagnosticsCurrentHeapUsedAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.SoftwareDiagnosticsCluster) cluster)
                  .readCurrentHeapUsedAttribute((ChipClusters.LongAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedLongAttributeCallback(),
            readSoftwareDiagnosticsCurrentHeapUsedCommandParams);
    result.put(
        "readCurrentHeapUsedAttribute",
        readSoftwareDiagnosticsCurrentHeapUsedAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readSoftwareDiagnosticsCurrentHeapHighWatermarkCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readSoftwareDiagnosticsCurrentHeapHighWatermarkAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.SoftwareDiagnosticsCluster) cluster)
                  .readCurrentHeapHighWatermarkAttribute(
                      (ChipClusters.LongAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedLongAttributeCallback(),
            readSoftwareDiagnosticsCurrentHeapHighWatermarkCommandParams);
    result.put(
        "readCurrentHeapHighWatermarkAttribute",
        readSoftwareDiagnosticsCurrentHeapHighWatermarkAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readSoftwareDiagnosticsGeneratedCommandListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readSoftwareDiagnosticsGeneratedCommandListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.SoftwareDiagnosticsCluster) cluster)
                  .readGeneratedCommandListAttribute(
                      (ChipClusters.SoftwareDiagnosticsCluster
                              .GeneratedCommandListAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedSoftwareDiagnosticsClusterGeneratedCommandListAttributeCallback(),
            readSoftwareDiagnosticsGeneratedCommandListCommandParams);
    result.put(
        "readGeneratedCommandListAttribute",
        readSoftwareDiagnosticsGeneratedCommandListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readSoftwareDiagnosticsAcceptedCommandListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readSoftwareDiagnosticsAcceptedCommandListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.SoftwareDiagnosticsCluster) cluster)
                  .readAcceptedCommandListAttribute(
                      (ChipClusters.SoftwareDiagnosticsCluster.AcceptedCommandListAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedSoftwareDiagnosticsClusterAcceptedCommandListAttributeCallback(),
            readSoftwareDiagnosticsAcceptedCommandListCommandParams);
    result.put(
        "readAcceptedCommandListAttribute",
        readSoftwareDiagnosticsAcceptedCommandListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readSoftwareDiagnosticsEventListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readSoftwareDiagnosticsEventListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.SoftwareDiagnosticsCluster) cluster)
                  .readEventListAttribute(
                      (ChipClusters.SoftwareDiagnosticsCluster.EventListAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedSoftwareDiagnosticsClusterEventListAttributeCallback(),
            readSoftwareDiagnosticsEventListCommandParams);
    result.put("readEventListAttribute", readSoftwareDiagnosticsEventListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readSoftwareDiagnosticsAttributeListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readSoftwareDiagnosticsAttributeListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.SoftwareDiagnosticsCluster) cluster)
                  .readAttributeListAttribute(
                      (ChipClusters.SoftwareDiagnosticsCluster.AttributeListAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedSoftwareDiagnosticsClusterAttributeListAttributeCallback(),
            readSoftwareDiagnosticsAttributeListCommandParams);
    result.put(
        "readAttributeListAttribute", readSoftwareDiagnosticsAttributeListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readSoftwareDiagnosticsFeatureMapCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readSoftwareDiagnosticsFeatureMapAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.SoftwareDiagnosticsCluster) cluster)
                  .readFeatureMapAttribute((ChipClusters.LongAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedLongAttributeCallback(),
            readSoftwareDiagnosticsFeatureMapCommandParams);
    result.put(
        "readFeatureMapAttribute", readSoftwareDiagnosticsFeatureMapAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readSoftwareDiagnosticsClusterRevisionCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readSoftwareDiagnosticsClusterRevisionAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.SoftwareDiagnosticsCluster) cluster)
                  .readClusterRevisionAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readSoftwareDiagnosticsClusterRevisionCommandParams);
    result.put(
        "readClusterRevisionAttribute",
        readSoftwareDiagnosticsClusterRevisionAttributeInteractionInfo);

    return result;
  }

  private static Map<String, InteractionInfo> readThreadNetworkDiagnosticsInteractionInfo() {
    Map<String, InteractionInfo> result = new LinkedHashMap<>();
    Map<String, CommandParameterInfo> readThreadNetworkDiagnosticsChannelCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readThreadNetworkDiagnosticsChannelAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ThreadNetworkDiagnosticsCluster) cluster)
                  .readChannelAttribute(
                      (ChipClusters.ThreadNetworkDiagnosticsCluster.ChannelAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedThreadNetworkDiagnosticsClusterChannelAttributeCallback(),
            readThreadNetworkDiagnosticsChannelCommandParams);
    result.put("readChannelAttribute", readThreadNetworkDiagnosticsChannelAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readThreadNetworkDiagnosticsRoutingRoleCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readThreadNetworkDiagnosticsRoutingRoleAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ThreadNetworkDiagnosticsCluster) cluster)
                  .readRoutingRoleAttribute(
                      (ChipClusters.ThreadNetworkDiagnosticsCluster.RoutingRoleAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedThreadNetworkDiagnosticsClusterRoutingRoleAttributeCallback(),
            readThreadNetworkDiagnosticsRoutingRoleCommandParams);
    result.put(
        "readRoutingRoleAttribute",
        readThreadNetworkDiagnosticsRoutingRoleAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readThreadNetworkDiagnosticsNetworkNameCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readThreadNetworkDiagnosticsNetworkNameAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ThreadNetworkDiagnosticsCluster) cluster)
                  .readNetworkNameAttribute(
                      (ChipClusters.ThreadNetworkDiagnosticsCluster.NetworkNameAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedThreadNetworkDiagnosticsClusterNetworkNameAttributeCallback(),
            readThreadNetworkDiagnosticsNetworkNameCommandParams);
    result.put(
        "readNetworkNameAttribute",
        readThreadNetworkDiagnosticsNetworkNameAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readThreadNetworkDiagnosticsPanIdCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readThreadNetworkDiagnosticsPanIdAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ThreadNetworkDiagnosticsCluster) cluster)
                  .readPanIdAttribute(
                      (ChipClusters.ThreadNetworkDiagnosticsCluster.PanIdAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedThreadNetworkDiagnosticsClusterPanIdAttributeCallback(),
            readThreadNetworkDiagnosticsPanIdCommandParams);
    result.put("readPanIdAttribute", readThreadNetworkDiagnosticsPanIdAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readThreadNetworkDiagnosticsExtendedPanIdCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readThreadNetworkDiagnosticsExtendedPanIdAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ThreadNetworkDiagnosticsCluster) cluster)
                  .readExtendedPanIdAttribute(
                      (ChipClusters.ThreadNetworkDiagnosticsCluster.ExtendedPanIdAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedThreadNetworkDiagnosticsClusterExtendedPanIdAttributeCallback(),
            readThreadNetworkDiagnosticsExtendedPanIdCommandParams);
    result.put(
        "readExtendedPanIdAttribute",
        readThreadNetworkDiagnosticsExtendedPanIdAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readThreadNetworkDiagnosticsMeshLocalPrefixCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readThreadNetworkDiagnosticsMeshLocalPrefixAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ThreadNetworkDiagnosticsCluster) cluster)
                  .readMeshLocalPrefixAttribute(
                      (ChipClusters.ThreadNetworkDiagnosticsCluster
                              .MeshLocalPrefixAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedThreadNetworkDiagnosticsClusterMeshLocalPrefixAttributeCallback(),
            readThreadNetworkDiagnosticsMeshLocalPrefixCommandParams);
    result.put(
        "readMeshLocalPrefixAttribute",
        readThreadNetworkDiagnosticsMeshLocalPrefixAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readThreadNetworkDiagnosticsOverrunCountCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readThreadNetworkDiagnosticsOverrunCountAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ThreadNetworkDiagnosticsCluster) cluster)
                  .readOverrunCountAttribute((ChipClusters.LongAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedLongAttributeCallback(),
            readThreadNetworkDiagnosticsOverrunCountCommandParams);
    result.put(
        "readOverrunCountAttribute",
        readThreadNetworkDiagnosticsOverrunCountAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readThreadNetworkDiagnosticsNeighborTableCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readThreadNetworkDiagnosticsNeighborTableAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ThreadNetworkDiagnosticsCluster) cluster)
                  .readNeighborTableAttribute(
                      (ChipClusters.ThreadNetworkDiagnosticsCluster.NeighborTableAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedThreadNetworkDiagnosticsClusterNeighborTableAttributeCallback(),
            readThreadNetworkDiagnosticsNeighborTableCommandParams);
    result.put(
        "readNeighborTableAttribute",
        readThreadNetworkDiagnosticsNeighborTableAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readThreadNetworkDiagnosticsRouteTableCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readThreadNetworkDiagnosticsRouteTableAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ThreadNetworkDiagnosticsCluster) cluster)
                  .readRouteTableAttribute(
                      (ChipClusters.ThreadNetworkDiagnosticsCluster.RouteTableAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedThreadNetworkDiagnosticsClusterRouteTableAttributeCallback(),
            readThreadNetworkDiagnosticsRouteTableCommandParams);
    result.put(
        "readRouteTableAttribute", readThreadNetworkDiagnosticsRouteTableAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readThreadNetworkDiagnosticsPartitionIdCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readThreadNetworkDiagnosticsPartitionIdAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ThreadNetworkDiagnosticsCluster) cluster)
                  .readPartitionIdAttribute(
                      (ChipClusters.ThreadNetworkDiagnosticsCluster.PartitionIdAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedThreadNetworkDiagnosticsClusterPartitionIdAttributeCallback(),
            readThreadNetworkDiagnosticsPartitionIdCommandParams);
    result.put(
        "readPartitionIdAttribute",
        readThreadNetworkDiagnosticsPartitionIdAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readThreadNetworkDiagnosticsWeightingCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readThreadNetworkDiagnosticsWeightingAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ThreadNetworkDiagnosticsCluster) cluster)
                  .readWeightingAttribute(
                      (ChipClusters.ThreadNetworkDiagnosticsCluster.WeightingAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedThreadNetworkDiagnosticsClusterWeightingAttributeCallback(),
            readThreadNetworkDiagnosticsWeightingCommandParams);
    result.put(
        "readWeightingAttribute", readThreadNetworkDiagnosticsWeightingAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readThreadNetworkDiagnosticsDataVersionCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readThreadNetworkDiagnosticsDataVersionAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ThreadNetworkDiagnosticsCluster) cluster)
                  .readDataVersionAttribute(
                      (ChipClusters.ThreadNetworkDiagnosticsCluster.DataVersionAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedThreadNetworkDiagnosticsClusterDataVersionAttributeCallback(),
            readThreadNetworkDiagnosticsDataVersionCommandParams);
    result.put(
        "readDataVersionAttribute",
        readThreadNetworkDiagnosticsDataVersionAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readThreadNetworkDiagnosticsStableDataVersionCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readThreadNetworkDiagnosticsStableDataVersionAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ThreadNetworkDiagnosticsCluster) cluster)
                  .readStableDataVersionAttribute(
                      (ChipClusters.ThreadNetworkDiagnosticsCluster
                              .StableDataVersionAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedThreadNetworkDiagnosticsClusterStableDataVersionAttributeCallback(),
            readThreadNetworkDiagnosticsStableDataVersionCommandParams);
    result.put(
        "readStableDataVersionAttribute",
        readThreadNetworkDiagnosticsStableDataVersionAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readThreadNetworkDiagnosticsLeaderRouterIdCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readThreadNetworkDiagnosticsLeaderRouterIdAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ThreadNetworkDiagnosticsCluster) cluster)
                  .readLeaderRouterIdAttribute(
                      (ChipClusters.ThreadNetworkDiagnosticsCluster.LeaderRouterIdAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedThreadNetworkDiagnosticsClusterLeaderRouterIdAttributeCallback(),
            readThreadNetworkDiagnosticsLeaderRouterIdCommandParams);
    result.put(
        "readLeaderRouterIdAttribute",
        readThreadNetworkDiagnosticsLeaderRouterIdAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readThreadNetworkDiagnosticsDetachedRoleCountCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readThreadNetworkDiagnosticsDetachedRoleCountAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ThreadNetworkDiagnosticsCluster) cluster)
                  .readDetachedRoleCountAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readThreadNetworkDiagnosticsDetachedRoleCountCommandParams);
    result.put(
        "readDetachedRoleCountAttribute",
        readThreadNetworkDiagnosticsDetachedRoleCountAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readThreadNetworkDiagnosticsChildRoleCountCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readThreadNetworkDiagnosticsChildRoleCountAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ThreadNetworkDiagnosticsCluster) cluster)
                  .readChildRoleCountAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readThreadNetworkDiagnosticsChildRoleCountCommandParams);
    result.put(
        "readChildRoleCountAttribute",
        readThreadNetworkDiagnosticsChildRoleCountAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readThreadNetworkDiagnosticsRouterRoleCountCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readThreadNetworkDiagnosticsRouterRoleCountAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ThreadNetworkDiagnosticsCluster) cluster)
                  .readRouterRoleCountAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readThreadNetworkDiagnosticsRouterRoleCountCommandParams);
    result.put(
        "readRouterRoleCountAttribute",
        readThreadNetworkDiagnosticsRouterRoleCountAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readThreadNetworkDiagnosticsLeaderRoleCountCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readThreadNetworkDiagnosticsLeaderRoleCountAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ThreadNetworkDiagnosticsCluster) cluster)
                  .readLeaderRoleCountAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readThreadNetworkDiagnosticsLeaderRoleCountCommandParams);
    result.put(
        "readLeaderRoleCountAttribute",
        readThreadNetworkDiagnosticsLeaderRoleCountAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readThreadNetworkDiagnosticsAttachAttemptCountCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readThreadNetworkDiagnosticsAttachAttemptCountAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ThreadNetworkDiagnosticsCluster) cluster)
                  .readAttachAttemptCountAttribute(
                      (ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readThreadNetworkDiagnosticsAttachAttemptCountCommandParams);
    result.put(
        "readAttachAttemptCountAttribute",
        readThreadNetworkDiagnosticsAttachAttemptCountAttributeInteractionInfo);
    Map<String, CommandParameterInfo>
        readThreadNetworkDiagnosticsPartitionIdChangeCountCommandParams =
            new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readThreadNetworkDiagnosticsPartitionIdChangeCountAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ThreadNetworkDiagnosticsCluster) cluster)
                  .readPartitionIdChangeCountAttribute(
                      (ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readThreadNetworkDiagnosticsPartitionIdChangeCountCommandParams);
    result.put(
        "readPartitionIdChangeCountAttribute",
        readThreadNetworkDiagnosticsPartitionIdChangeCountAttributeInteractionInfo);
    Map<String, CommandParameterInfo>
        readThreadNetworkDiagnosticsBetterPartitionAttachAttemptCountCommandParams =
            new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo
        readThreadNetworkDiagnosticsBetterPartitionAttachAttemptCountAttributeInteractionInfo =
            new InteractionInfo(
                (cluster, callback, commandArguments) -> {
                  ((ChipClusters.ThreadNetworkDiagnosticsCluster) cluster)
                      .readBetterPartitionAttachAttemptCountAttribute(
                          (ChipClusters.IntegerAttributeCallback) callback);
                },
                () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
                readThreadNetworkDiagnosticsBetterPartitionAttachAttemptCountCommandParams);
    result.put(
        "readBetterPartitionAttachAttemptCountAttribute",
        readThreadNetworkDiagnosticsBetterPartitionAttachAttemptCountAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readThreadNetworkDiagnosticsParentChangeCountCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readThreadNetworkDiagnosticsParentChangeCountAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ThreadNetworkDiagnosticsCluster) cluster)
                  .readParentChangeCountAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readThreadNetworkDiagnosticsParentChangeCountCommandParams);
    result.put(
        "readParentChangeCountAttribute",
        readThreadNetworkDiagnosticsParentChangeCountAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readThreadNetworkDiagnosticsTxTotalCountCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readThreadNetworkDiagnosticsTxTotalCountAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ThreadNetworkDiagnosticsCluster) cluster)
                  .readTxTotalCountAttribute((ChipClusters.LongAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedLongAttributeCallback(),
            readThreadNetworkDiagnosticsTxTotalCountCommandParams);
    result.put(
        "readTxTotalCountAttribute",
        readThreadNetworkDiagnosticsTxTotalCountAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readThreadNetworkDiagnosticsTxUnicastCountCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readThreadNetworkDiagnosticsTxUnicastCountAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ThreadNetworkDiagnosticsCluster) cluster)
                  .readTxUnicastCountAttribute((ChipClusters.LongAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedLongAttributeCallback(),
            readThreadNetworkDiagnosticsTxUnicastCountCommandParams);
    result.put(
        "readTxUnicastCountAttribute",
        readThreadNetworkDiagnosticsTxUnicastCountAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readThreadNetworkDiagnosticsTxBroadcastCountCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readThreadNetworkDiagnosticsTxBroadcastCountAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ThreadNetworkDiagnosticsCluster) cluster)
                  .readTxBroadcastCountAttribute((ChipClusters.LongAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedLongAttributeCallback(),
            readThreadNetworkDiagnosticsTxBroadcastCountCommandParams);
    result.put(
        "readTxBroadcastCountAttribute",
        readThreadNetworkDiagnosticsTxBroadcastCountAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readThreadNetworkDiagnosticsTxAckRequestedCountCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readThreadNetworkDiagnosticsTxAckRequestedCountAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ThreadNetworkDiagnosticsCluster) cluster)
                  .readTxAckRequestedCountAttribute((ChipClusters.LongAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedLongAttributeCallback(),
            readThreadNetworkDiagnosticsTxAckRequestedCountCommandParams);
    result.put(
        "readTxAckRequestedCountAttribute",
        readThreadNetworkDiagnosticsTxAckRequestedCountAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readThreadNetworkDiagnosticsTxAckedCountCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readThreadNetworkDiagnosticsTxAckedCountAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ThreadNetworkDiagnosticsCluster) cluster)
                  .readTxAckedCountAttribute((ChipClusters.LongAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedLongAttributeCallback(),
            readThreadNetworkDiagnosticsTxAckedCountCommandParams);
    result.put(
        "readTxAckedCountAttribute",
        readThreadNetworkDiagnosticsTxAckedCountAttributeInteractionInfo);
    Map<String, CommandParameterInfo>
        readThreadNetworkDiagnosticsTxNoAckRequestedCountCommandParams =
            new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readThreadNetworkDiagnosticsTxNoAckRequestedCountAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ThreadNetworkDiagnosticsCluster) cluster)
                  .readTxNoAckRequestedCountAttribute(
                      (ChipClusters.LongAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedLongAttributeCallback(),
            readThreadNetworkDiagnosticsTxNoAckRequestedCountCommandParams);
    result.put(
        "readTxNoAckRequestedCountAttribute",
        readThreadNetworkDiagnosticsTxNoAckRequestedCountAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readThreadNetworkDiagnosticsTxDataCountCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readThreadNetworkDiagnosticsTxDataCountAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ThreadNetworkDiagnosticsCluster) cluster)
                  .readTxDataCountAttribute((ChipClusters.LongAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedLongAttributeCallback(),
            readThreadNetworkDiagnosticsTxDataCountCommandParams);
    result.put(
        "readTxDataCountAttribute",
        readThreadNetworkDiagnosticsTxDataCountAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readThreadNetworkDiagnosticsTxDataPollCountCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readThreadNetworkDiagnosticsTxDataPollCountAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ThreadNetworkDiagnosticsCluster) cluster)
                  .readTxDataPollCountAttribute((ChipClusters.LongAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedLongAttributeCallback(),
            readThreadNetworkDiagnosticsTxDataPollCountCommandParams);
    result.put(
        "readTxDataPollCountAttribute",
        readThreadNetworkDiagnosticsTxDataPollCountAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readThreadNetworkDiagnosticsTxBeaconCountCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readThreadNetworkDiagnosticsTxBeaconCountAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ThreadNetworkDiagnosticsCluster) cluster)
                  .readTxBeaconCountAttribute((ChipClusters.LongAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedLongAttributeCallback(),
            readThreadNetworkDiagnosticsTxBeaconCountCommandParams);
    result.put(
        "readTxBeaconCountAttribute",
        readThreadNetworkDiagnosticsTxBeaconCountAttributeInteractionInfo);
    Map<String, CommandParameterInfo>
        readThreadNetworkDiagnosticsTxBeaconRequestCountCommandParams =
            new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readThreadNetworkDiagnosticsTxBeaconRequestCountAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ThreadNetworkDiagnosticsCluster) cluster)
                  .readTxBeaconRequestCountAttribute((ChipClusters.LongAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedLongAttributeCallback(),
            readThreadNetworkDiagnosticsTxBeaconRequestCountCommandParams);
    result.put(
        "readTxBeaconRequestCountAttribute",
        readThreadNetworkDiagnosticsTxBeaconRequestCountAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readThreadNetworkDiagnosticsTxOtherCountCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readThreadNetworkDiagnosticsTxOtherCountAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ThreadNetworkDiagnosticsCluster) cluster)
                  .readTxOtherCountAttribute((ChipClusters.LongAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedLongAttributeCallback(),
            readThreadNetworkDiagnosticsTxOtherCountCommandParams);
    result.put(
        "readTxOtherCountAttribute",
        readThreadNetworkDiagnosticsTxOtherCountAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readThreadNetworkDiagnosticsTxRetryCountCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readThreadNetworkDiagnosticsTxRetryCountAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ThreadNetworkDiagnosticsCluster) cluster)
                  .readTxRetryCountAttribute((ChipClusters.LongAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedLongAttributeCallback(),
            readThreadNetworkDiagnosticsTxRetryCountCommandParams);
    result.put(
        "readTxRetryCountAttribute",
        readThreadNetworkDiagnosticsTxRetryCountAttributeInteractionInfo);
    Map<String, CommandParameterInfo>
        readThreadNetworkDiagnosticsTxDirectMaxRetryExpiryCountCommandParams =
            new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo
        readThreadNetworkDiagnosticsTxDirectMaxRetryExpiryCountAttributeInteractionInfo =
            new InteractionInfo(
                (cluster, callback, commandArguments) -> {
                  ((ChipClusters.ThreadNetworkDiagnosticsCluster) cluster)
                      .readTxDirectMaxRetryExpiryCountAttribute(
                          (ChipClusters.LongAttributeCallback) callback);
                },
                () -> new ClusterInfoMapping.DelegatedLongAttributeCallback(),
                readThreadNetworkDiagnosticsTxDirectMaxRetryExpiryCountCommandParams);
    result.put(
        "readTxDirectMaxRetryExpiryCountAttribute",
        readThreadNetworkDiagnosticsTxDirectMaxRetryExpiryCountAttributeInteractionInfo);
    Map<String, CommandParameterInfo>
        readThreadNetworkDiagnosticsTxIndirectMaxRetryExpiryCountCommandParams =
            new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo
        readThreadNetworkDiagnosticsTxIndirectMaxRetryExpiryCountAttributeInteractionInfo =
            new InteractionInfo(
                (cluster, callback, commandArguments) -> {
                  ((ChipClusters.ThreadNetworkDiagnosticsCluster) cluster)
                      .readTxIndirectMaxRetryExpiryCountAttribute(
                          (ChipClusters.LongAttributeCallback) callback);
                },
                () -> new ClusterInfoMapping.DelegatedLongAttributeCallback(),
                readThreadNetworkDiagnosticsTxIndirectMaxRetryExpiryCountCommandParams);
    result.put(
        "readTxIndirectMaxRetryExpiryCountAttribute",
        readThreadNetworkDiagnosticsTxIndirectMaxRetryExpiryCountAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readThreadNetworkDiagnosticsTxErrCcaCountCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readThreadNetworkDiagnosticsTxErrCcaCountAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ThreadNetworkDiagnosticsCluster) cluster)
                  .readTxErrCcaCountAttribute((ChipClusters.LongAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedLongAttributeCallback(),
            readThreadNetworkDiagnosticsTxErrCcaCountCommandParams);
    result.put(
        "readTxErrCcaCountAttribute",
        readThreadNetworkDiagnosticsTxErrCcaCountAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readThreadNetworkDiagnosticsTxErrAbortCountCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readThreadNetworkDiagnosticsTxErrAbortCountAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ThreadNetworkDiagnosticsCluster) cluster)
                  .readTxErrAbortCountAttribute((ChipClusters.LongAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedLongAttributeCallback(),
            readThreadNetworkDiagnosticsTxErrAbortCountCommandParams);
    result.put(
        "readTxErrAbortCountAttribute",
        readThreadNetworkDiagnosticsTxErrAbortCountAttributeInteractionInfo);
    Map<String, CommandParameterInfo>
        readThreadNetworkDiagnosticsTxErrBusyChannelCountCommandParams =
            new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readThreadNetworkDiagnosticsTxErrBusyChannelCountAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ThreadNetworkDiagnosticsCluster) cluster)
                  .readTxErrBusyChannelCountAttribute(
                      (ChipClusters.LongAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedLongAttributeCallback(),
            readThreadNetworkDiagnosticsTxErrBusyChannelCountCommandParams);
    result.put(
        "readTxErrBusyChannelCountAttribute",
        readThreadNetworkDiagnosticsTxErrBusyChannelCountAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readThreadNetworkDiagnosticsRxTotalCountCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readThreadNetworkDiagnosticsRxTotalCountAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ThreadNetworkDiagnosticsCluster) cluster)
                  .readRxTotalCountAttribute((ChipClusters.LongAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedLongAttributeCallback(),
            readThreadNetworkDiagnosticsRxTotalCountCommandParams);
    result.put(
        "readRxTotalCountAttribute",
        readThreadNetworkDiagnosticsRxTotalCountAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readThreadNetworkDiagnosticsRxUnicastCountCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readThreadNetworkDiagnosticsRxUnicastCountAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ThreadNetworkDiagnosticsCluster) cluster)
                  .readRxUnicastCountAttribute((ChipClusters.LongAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedLongAttributeCallback(),
            readThreadNetworkDiagnosticsRxUnicastCountCommandParams);
    result.put(
        "readRxUnicastCountAttribute",
        readThreadNetworkDiagnosticsRxUnicastCountAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readThreadNetworkDiagnosticsRxBroadcastCountCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readThreadNetworkDiagnosticsRxBroadcastCountAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ThreadNetworkDiagnosticsCluster) cluster)
                  .readRxBroadcastCountAttribute((ChipClusters.LongAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedLongAttributeCallback(),
            readThreadNetworkDiagnosticsRxBroadcastCountCommandParams);
    result.put(
        "readRxBroadcastCountAttribute",
        readThreadNetworkDiagnosticsRxBroadcastCountAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readThreadNetworkDiagnosticsRxDataCountCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readThreadNetworkDiagnosticsRxDataCountAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ThreadNetworkDiagnosticsCluster) cluster)
                  .readRxDataCountAttribute((ChipClusters.LongAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedLongAttributeCallback(),
            readThreadNetworkDiagnosticsRxDataCountCommandParams);
    result.put(
        "readRxDataCountAttribute",
        readThreadNetworkDiagnosticsRxDataCountAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readThreadNetworkDiagnosticsRxDataPollCountCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readThreadNetworkDiagnosticsRxDataPollCountAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ThreadNetworkDiagnosticsCluster) cluster)
                  .readRxDataPollCountAttribute((ChipClusters.LongAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedLongAttributeCallback(),
            readThreadNetworkDiagnosticsRxDataPollCountCommandParams);
    result.put(
        "readRxDataPollCountAttribute",
        readThreadNetworkDiagnosticsRxDataPollCountAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readThreadNetworkDiagnosticsRxBeaconCountCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readThreadNetworkDiagnosticsRxBeaconCountAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ThreadNetworkDiagnosticsCluster) cluster)
                  .readRxBeaconCountAttribute((ChipClusters.LongAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedLongAttributeCallback(),
            readThreadNetworkDiagnosticsRxBeaconCountCommandParams);
    result.put(
        "readRxBeaconCountAttribute",
        readThreadNetworkDiagnosticsRxBeaconCountAttributeInteractionInfo);
    Map<String, CommandParameterInfo>
        readThreadNetworkDiagnosticsRxBeaconRequestCountCommandParams =
            new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readThreadNetworkDiagnosticsRxBeaconRequestCountAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ThreadNetworkDiagnosticsCluster) cluster)
                  .readRxBeaconRequestCountAttribute((ChipClusters.LongAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedLongAttributeCallback(),
            readThreadNetworkDiagnosticsRxBeaconRequestCountCommandParams);
    result.put(
        "readRxBeaconRequestCountAttribute",
        readThreadNetworkDiagnosticsRxBeaconRequestCountAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readThreadNetworkDiagnosticsRxOtherCountCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readThreadNetworkDiagnosticsRxOtherCountAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ThreadNetworkDiagnosticsCluster) cluster)
                  .readRxOtherCountAttribute((ChipClusters.LongAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedLongAttributeCallback(),
            readThreadNetworkDiagnosticsRxOtherCountCommandParams);
    result.put(
        "readRxOtherCountAttribute",
        readThreadNetworkDiagnosticsRxOtherCountAttributeInteractionInfo);
    Map<String, CommandParameterInfo>
        readThreadNetworkDiagnosticsRxAddressFilteredCountCommandParams =
            new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readThreadNetworkDiagnosticsRxAddressFilteredCountAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ThreadNetworkDiagnosticsCluster) cluster)
                  .readRxAddressFilteredCountAttribute(
                      (ChipClusters.LongAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedLongAttributeCallback(),
            readThreadNetworkDiagnosticsRxAddressFilteredCountCommandParams);
    result.put(
        "readRxAddressFilteredCountAttribute",
        readThreadNetworkDiagnosticsRxAddressFilteredCountAttributeInteractionInfo);
    Map<String, CommandParameterInfo>
        readThreadNetworkDiagnosticsRxDestAddrFilteredCountCommandParams =
            new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readThreadNetworkDiagnosticsRxDestAddrFilteredCountAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ThreadNetworkDiagnosticsCluster) cluster)
                  .readRxDestAddrFilteredCountAttribute(
                      (ChipClusters.LongAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedLongAttributeCallback(),
            readThreadNetworkDiagnosticsRxDestAddrFilteredCountCommandParams);
    result.put(
        "readRxDestAddrFilteredCountAttribute",
        readThreadNetworkDiagnosticsRxDestAddrFilteredCountAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readThreadNetworkDiagnosticsRxDuplicatedCountCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readThreadNetworkDiagnosticsRxDuplicatedCountAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ThreadNetworkDiagnosticsCluster) cluster)
                  .readRxDuplicatedCountAttribute((ChipClusters.LongAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedLongAttributeCallback(),
            readThreadNetworkDiagnosticsRxDuplicatedCountCommandParams);
    result.put(
        "readRxDuplicatedCountAttribute",
        readThreadNetworkDiagnosticsRxDuplicatedCountAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readThreadNetworkDiagnosticsRxErrNoFrameCountCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readThreadNetworkDiagnosticsRxErrNoFrameCountAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ThreadNetworkDiagnosticsCluster) cluster)
                  .readRxErrNoFrameCountAttribute((ChipClusters.LongAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedLongAttributeCallback(),
            readThreadNetworkDiagnosticsRxErrNoFrameCountCommandParams);
    result.put(
        "readRxErrNoFrameCountAttribute",
        readThreadNetworkDiagnosticsRxErrNoFrameCountAttributeInteractionInfo);
    Map<String, CommandParameterInfo>
        readThreadNetworkDiagnosticsRxErrUnknownNeighborCountCommandParams =
            new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readThreadNetworkDiagnosticsRxErrUnknownNeighborCountAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ThreadNetworkDiagnosticsCluster) cluster)
                  .readRxErrUnknownNeighborCountAttribute(
                      (ChipClusters.LongAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedLongAttributeCallback(),
            readThreadNetworkDiagnosticsRxErrUnknownNeighborCountCommandParams);
    result.put(
        "readRxErrUnknownNeighborCountAttribute",
        readThreadNetworkDiagnosticsRxErrUnknownNeighborCountAttributeInteractionInfo);
    Map<String, CommandParameterInfo>
        readThreadNetworkDiagnosticsRxErrInvalidSrcAddrCountCommandParams =
            new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readThreadNetworkDiagnosticsRxErrInvalidSrcAddrCountAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ThreadNetworkDiagnosticsCluster) cluster)
                  .readRxErrInvalidSrcAddrCountAttribute(
                      (ChipClusters.LongAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedLongAttributeCallback(),
            readThreadNetworkDiagnosticsRxErrInvalidSrcAddrCountCommandParams);
    result.put(
        "readRxErrInvalidSrcAddrCountAttribute",
        readThreadNetworkDiagnosticsRxErrInvalidSrcAddrCountAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readThreadNetworkDiagnosticsRxErrSecCountCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readThreadNetworkDiagnosticsRxErrSecCountAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ThreadNetworkDiagnosticsCluster) cluster)
                  .readRxErrSecCountAttribute((ChipClusters.LongAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedLongAttributeCallback(),
            readThreadNetworkDiagnosticsRxErrSecCountCommandParams);
    result.put(
        "readRxErrSecCountAttribute",
        readThreadNetworkDiagnosticsRxErrSecCountAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readThreadNetworkDiagnosticsRxErrFcsCountCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readThreadNetworkDiagnosticsRxErrFcsCountAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ThreadNetworkDiagnosticsCluster) cluster)
                  .readRxErrFcsCountAttribute((ChipClusters.LongAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedLongAttributeCallback(),
            readThreadNetworkDiagnosticsRxErrFcsCountCommandParams);
    result.put(
        "readRxErrFcsCountAttribute",
        readThreadNetworkDiagnosticsRxErrFcsCountAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readThreadNetworkDiagnosticsRxErrOtherCountCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readThreadNetworkDiagnosticsRxErrOtherCountAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ThreadNetworkDiagnosticsCluster) cluster)
                  .readRxErrOtherCountAttribute((ChipClusters.LongAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedLongAttributeCallback(),
            readThreadNetworkDiagnosticsRxErrOtherCountCommandParams);
    result.put(
        "readRxErrOtherCountAttribute",
        readThreadNetworkDiagnosticsRxErrOtherCountAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readThreadNetworkDiagnosticsActiveTimestampCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readThreadNetworkDiagnosticsActiveTimestampAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ThreadNetworkDiagnosticsCluster) cluster)
                  .readActiveTimestampAttribute(
                      (ChipClusters.ThreadNetworkDiagnosticsCluster
                              .ActiveTimestampAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedThreadNetworkDiagnosticsClusterActiveTimestampAttributeCallback(),
            readThreadNetworkDiagnosticsActiveTimestampCommandParams);
    result.put(
        "readActiveTimestampAttribute",
        readThreadNetworkDiagnosticsActiveTimestampAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readThreadNetworkDiagnosticsPendingTimestampCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readThreadNetworkDiagnosticsPendingTimestampAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ThreadNetworkDiagnosticsCluster) cluster)
                  .readPendingTimestampAttribute(
                      (ChipClusters.ThreadNetworkDiagnosticsCluster
                              .PendingTimestampAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedThreadNetworkDiagnosticsClusterPendingTimestampAttributeCallback(),
            readThreadNetworkDiagnosticsPendingTimestampCommandParams);
    result.put(
        "readPendingTimestampAttribute",
        readThreadNetworkDiagnosticsPendingTimestampAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readThreadNetworkDiagnosticsDelayCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readThreadNetworkDiagnosticsDelayAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ThreadNetworkDiagnosticsCluster) cluster)
                  .readDelayAttribute(
                      (ChipClusters.ThreadNetworkDiagnosticsCluster.DelayAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedThreadNetworkDiagnosticsClusterDelayAttributeCallback(),
            readThreadNetworkDiagnosticsDelayCommandParams);
    result.put("readDelayAttribute", readThreadNetworkDiagnosticsDelayAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readThreadNetworkDiagnosticsChannelPage0MaskCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readThreadNetworkDiagnosticsChannelPage0MaskAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ThreadNetworkDiagnosticsCluster) cluster)
                  .readChannelPage0MaskAttribute(
                      (ChipClusters.ThreadNetworkDiagnosticsCluster
                              .ChannelPage0MaskAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedThreadNetworkDiagnosticsClusterChannelPage0MaskAttributeCallback(),
            readThreadNetworkDiagnosticsChannelPage0MaskCommandParams);
    result.put(
        "readChannelPage0MaskAttribute",
        readThreadNetworkDiagnosticsChannelPage0MaskAttributeInteractionInfo);
    Map<String, CommandParameterInfo>
        readThreadNetworkDiagnosticsActiveNetworkFaultsListCommandParams =
            new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readThreadNetworkDiagnosticsActiveNetworkFaultsListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ThreadNetworkDiagnosticsCluster) cluster)
                  .readActiveNetworkFaultsListAttribute(
                      (ChipClusters.ThreadNetworkDiagnosticsCluster
                              .ActiveNetworkFaultsListAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedThreadNetworkDiagnosticsClusterActiveNetworkFaultsListAttributeCallback(),
            readThreadNetworkDiagnosticsActiveNetworkFaultsListCommandParams);
    result.put(
        "readActiveNetworkFaultsListAttribute",
        readThreadNetworkDiagnosticsActiveNetworkFaultsListAttributeInteractionInfo);
    Map<String, CommandParameterInfo>
        readThreadNetworkDiagnosticsGeneratedCommandListCommandParams =
            new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readThreadNetworkDiagnosticsGeneratedCommandListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ThreadNetworkDiagnosticsCluster) cluster)
                  .readGeneratedCommandListAttribute(
                      (ChipClusters.ThreadNetworkDiagnosticsCluster
                              .GeneratedCommandListAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedThreadNetworkDiagnosticsClusterGeneratedCommandListAttributeCallback(),
            readThreadNetworkDiagnosticsGeneratedCommandListCommandParams);
    result.put(
        "readGeneratedCommandListAttribute",
        readThreadNetworkDiagnosticsGeneratedCommandListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readThreadNetworkDiagnosticsAcceptedCommandListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readThreadNetworkDiagnosticsAcceptedCommandListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ThreadNetworkDiagnosticsCluster) cluster)
                  .readAcceptedCommandListAttribute(
                      (ChipClusters.ThreadNetworkDiagnosticsCluster
                              .AcceptedCommandListAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedThreadNetworkDiagnosticsClusterAcceptedCommandListAttributeCallback(),
            readThreadNetworkDiagnosticsAcceptedCommandListCommandParams);
    result.put(
        "readAcceptedCommandListAttribute",
        readThreadNetworkDiagnosticsAcceptedCommandListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readThreadNetworkDiagnosticsEventListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readThreadNetworkDiagnosticsEventListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ThreadNetworkDiagnosticsCluster) cluster)
                  .readEventListAttribute(
                      (ChipClusters.ThreadNetworkDiagnosticsCluster.EventListAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedThreadNetworkDiagnosticsClusterEventListAttributeCallback(),
            readThreadNetworkDiagnosticsEventListCommandParams);
    result.put(
        "readEventListAttribute", readThreadNetworkDiagnosticsEventListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readThreadNetworkDiagnosticsAttributeListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readThreadNetworkDiagnosticsAttributeListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ThreadNetworkDiagnosticsCluster) cluster)
                  .readAttributeListAttribute(
                      (ChipClusters.ThreadNetworkDiagnosticsCluster.AttributeListAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedThreadNetworkDiagnosticsClusterAttributeListAttributeCallback(),
            readThreadNetworkDiagnosticsAttributeListCommandParams);
    result.put(
        "readAttributeListAttribute",
        readThreadNetworkDiagnosticsAttributeListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readThreadNetworkDiagnosticsFeatureMapCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readThreadNetworkDiagnosticsFeatureMapAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ThreadNetworkDiagnosticsCluster) cluster)
                  .readFeatureMapAttribute((ChipClusters.LongAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedLongAttributeCallback(),
            readThreadNetworkDiagnosticsFeatureMapCommandParams);
    result.put(
        "readFeatureMapAttribute", readThreadNetworkDiagnosticsFeatureMapAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readThreadNetworkDiagnosticsClusterRevisionCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readThreadNetworkDiagnosticsClusterRevisionAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ThreadNetworkDiagnosticsCluster) cluster)
                  .readClusterRevisionAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readThreadNetworkDiagnosticsClusterRevisionCommandParams);
    result.put(
        "readClusterRevisionAttribute",
        readThreadNetworkDiagnosticsClusterRevisionAttributeInteractionInfo);

    return result;
  }

  private static Map<String, InteractionInfo> readWiFiNetworkDiagnosticsInteractionInfo() {
    Map<String, InteractionInfo> result = new LinkedHashMap<>();
    Map<String, CommandParameterInfo> readWiFiNetworkDiagnosticsBssidCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readWiFiNetworkDiagnosticsBssidAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.WiFiNetworkDiagnosticsCluster) cluster)
                  .readBssidAttribute(
                      (ChipClusters.WiFiNetworkDiagnosticsCluster.BssidAttributeCallback) callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedWiFiNetworkDiagnosticsClusterBssidAttributeCallback(),
            readWiFiNetworkDiagnosticsBssidCommandParams);
    result.put("readBssidAttribute", readWiFiNetworkDiagnosticsBssidAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readWiFiNetworkDiagnosticsSecurityTypeCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readWiFiNetworkDiagnosticsSecurityTypeAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.WiFiNetworkDiagnosticsCluster) cluster)
                  .readSecurityTypeAttribute(
                      (ChipClusters.WiFiNetworkDiagnosticsCluster.SecurityTypeAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedWiFiNetworkDiagnosticsClusterSecurityTypeAttributeCallback(),
            readWiFiNetworkDiagnosticsSecurityTypeCommandParams);
    result.put(
        "readSecurityTypeAttribute",
        readWiFiNetworkDiagnosticsSecurityTypeAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readWiFiNetworkDiagnosticsWiFiVersionCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readWiFiNetworkDiagnosticsWiFiVersionAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.WiFiNetworkDiagnosticsCluster) cluster)
                  .readWiFiVersionAttribute(
                      (ChipClusters.WiFiNetworkDiagnosticsCluster.WiFiVersionAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedWiFiNetworkDiagnosticsClusterWiFiVersionAttributeCallback(),
            readWiFiNetworkDiagnosticsWiFiVersionCommandParams);
    result.put(
        "readWiFiVersionAttribute", readWiFiNetworkDiagnosticsWiFiVersionAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readWiFiNetworkDiagnosticsChannelNumberCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readWiFiNetworkDiagnosticsChannelNumberAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.WiFiNetworkDiagnosticsCluster) cluster)
                  .readChannelNumberAttribute(
                      (ChipClusters.WiFiNetworkDiagnosticsCluster.ChannelNumberAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedWiFiNetworkDiagnosticsClusterChannelNumberAttributeCallback(),
            readWiFiNetworkDiagnosticsChannelNumberCommandParams);
    result.put(
        "readChannelNumberAttribute",
        readWiFiNetworkDiagnosticsChannelNumberAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readWiFiNetworkDiagnosticsRssiCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readWiFiNetworkDiagnosticsRssiAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.WiFiNetworkDiagnosticsCluster) cluster)
                  .readRssiAttribute(
                      (ChipClusters.WiFiNetworkDiagnosticsCluster.RssiAttributeCallback) callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedWiFiNetworkDiagnosticsClusterRssiAttributeCallback(),
            readWiFiNetworkDiagnosticsRssiCommandParams);
    result.put("readRssiAttribute", readWiFiNetworkDiagnosticsRssiAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readWiFiNetworkDiagnosticsBeaconLostCountCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readWiFiNetworkDiagnosticsBeaconLostCountAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.WiFiNetworkDiagnosticsCluster) cluster)
                  .readBeaconLostCountAttribute(
                      (ChipClusters.WiFiNetworkDiagnosticsCluster.BeaconLostCountAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedWiFiNetworkDiagnosticsClusterBeaconLostCountAttributeCallback(),
            readWiFiNetworkDiagnosticsBeaconLostCountCommandParams);
    result.put(
        "readBeaconLostCountAttribute",
        readWiFiNetworkDiagnosticsBeaconLostCountAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readWiFiNetworkDiagnosticsBeaconRxCountCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readWiFiNetworkDiagnosticsBeaconRxCountAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.WiFiNetworkDiagnosticsCluster) cluster)
                  .readBeaconRxCountAttribute(
                      (ChipClusters.WiFiNetworkDiagnosticsCluster.BeaconRxCountAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedWiFiNetworkDiagnosticsClusterBeaconRxCountAttributeCallback(),
            readWiFiNetworkDiagnosticsBeaconRxCountCommandParams);
    result.put(
        "readBeaconRxCountAttribute",
        readWiFiNetworkDiagnosticsBeaconRxCountAttributeInteractionInfo);
    Map<String, CommandParameterInfo>
        readWiFiNetworkDiagnosticsPacketMulticastRxCountCommandParams =
            new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readWiFiNetworkDiagnosticsPacketMulticastRxCountAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.WiFiNetworkDiagnosticsCluster) cluster)
                  .readPacketMulticastRxCountAttribute(
                      (ChipClusters.WiFiNetworkDiagnosticsCluster
                              .PacketMulticastRxCountAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedWiFiNetworkDiagnosticsClusterPacketMulticastRxCountAttributeCallback(),
            readWiFiNetworkDiagnosticsPacketMulticastRxCountCommandParams);
    result.put(
        "readPacketMulticastRxCountAttribute",
        readWiFiNetworkDiagnosticsPacketMulticastRxCountAttributeInteractionInfo);
    Map<String, CommandParameterInfo>
        readWiFiNetworkDiagnosticsPacketMulticastTxCountCommandParams =
            new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readWiFiNetworkDiagnosticsPacketMulticastTxCountAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.WiFiNetworkDiagnosticsCluster) cluster)
                  .readPacketMulticastTxCountAttribute(
                      (ChipClusters.WiFiNetworkDiagnosticsCluster
                              .PacketMulticastTxCountAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedWiFiNetworkDiagnosticsClusterPacketMulticastTxCountAttributeCallback(),
            readWiFiNetworkDiagnosticsPacketMulticastTxCountCommandParams);
    result.put(
        "readPacketMulticastTxCountAttribute",
        readWiFiNetworkDiagnosticsPacketMulticastTxCountAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readWiFiNetworkDiagnosticsPacketUnicastRxCountCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readWiFiNetworkDiagnosticsPacketUnicastRxCountAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.WiFiNetworkDiagnosticsCluster) cluster)
                  .readPacketUnicastRxCountAttribute(
                      (ChipClusters.WiFiNetworkDiagnosticsCluster
                              .PacketUnicastRxCountAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedWiFiNetworkDiagnosticsClusterPacketUnicastRxCountAttributeCallback(),
            readWiFiNetworkDiagnosticsPacketUnicastRxCountCommandParams);
    result.put(
        "readPacketUnicastRxCountAttribute",
        readWiFiNetworkDiagnosticsPacketUnicastRxCountAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readWiFiNetworkDiagnosticsPacketUnicastTxCountCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readWiFiNetworkDiagnosticsPacketUnicastTxCountAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.WiFiNetworkDiagnosticsCluster) cluster)
                  .readPacketUnicastTxCountAttribute(
                      (ChipClusters.WiFiNetworkDiagnosticsCluster
                              .PacketUnicastTxCountAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedWiFiNetworkDiagnosticsClusterPacketUnicastTxCountAttributeCallback(),
            readWiFiNetworkDiagnosticsPacketUnicastTxCountCommandParams);
    result.put(
        "readPacketUnicastTxCountAttribute",
        readWiFiNetworkDiagnosticsPacketUnicastTxCountAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readWiFiNetworkDiagnosticsCurrentMaxRateCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readWiFiNetworkDiagnosticsCurrentMaxRateAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.WiFiNetworkDiagnosticsCluster) cluster)
                  .readCurrentMaxRateAttribute(
                      (ChipClusters.WiFiNetworkDiagnosticsCluster.CurrentMaxRateAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedWiFiNetworkDiagnosticsClusterCurrentMaxRateAttributeCallback(),
            readWiFiNetworkDiagnosticsCurrentMaxRateCommandParams);
    result.put(
        "readCurrentMaxRateAttribute",
        readWiFiNetworkDiagnosticsCurrentMaxRateAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readWiFiNetworkDiagnosticsOverrunCountCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readWiFiNetworkDiagnosticsOverrunCountAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.WiFiNetworkDiagnosticsCluster) cluster)
                  .readOverrunCountAttribute(
                      (ChipClusters.WiFiNetworkDiagnosticsCluster.OverrunCountAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedWiFiNetworkDiagnosticsClusterOverrunCountAttributeCallback(),
            readWiFiNetworkDiagnosticsOverrunCountCommandParams);
    result.put(
        "readOverrunCountAttribute",
        readWiFiNetworkDiagnosticsOverrunCountAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readWiFiNetworkDiagnosticsGeneratedCommandListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readWiFiNetworkDiagnosticsGeneratedCommandListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.WiFiNetworkDiagnosticsCluster) cluster)
                  .readGeneratedCommandListAttribute(
                      (ChipClusters.WiFiNetworkDiagnosticsCluster
                              .GeneratedCommandListAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedWiFiNetworkDiagnosticsClusterGeneratedCommandListAttributeCallback(),
            readWiFiNetworkDiagnosticsGeneratedCommandListCommandParams);
    result.put(
        "readGeneratedCommandListAttribute",
        readWiFiNetworkDiagnosticsGeneratedCommandListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readWiFiNetworkDiagnosticsAcceptedCommandListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readWiFiNetworkDiagnosticsAcceptedCommandListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.WiFiNetworkDiagnosticsCluster) cluster)
                  .readAcceptedCommandListAttribute(
                      (ChipClusters.WiFiNetworkDiagnosticsCluster
                              .AcceptedCommandListAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedWiFiNetworkDiagnosticsClusterAcceptedCommandListAttributeCallback(),
            readWiFiNetworkDiagnosticsAcceptedCommandListCommandParams);
    result.put(
        "readAcceptedCommandListAttribute",
        readWiFiNetworkDiagnosticsAcceptedCommandListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readWiFiNetworkDiagnosticsEventListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readWiFiNetworkDiagnosticsEventListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.WiFiNetworkDiagnosticsCluster) cluster)
                  .readEventListAttribute(
                      (ChipClusters.WiFiNetworkDiagnosticsCluster.EventListAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedWiFiNetworkDiagnosticsClusterEventListAttributeCallback(),
            readWiFiNetworkDiagnosticsEventListCommandParams);
    result.put(
        "readEventListAttribute", readWiFiNetworkDiagnosticsEventListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readWiFiNetworkDiagnosticsAttributeListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readWiFiNetworkDiagnosticsAttributeListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.WiFiNetworkDiagnosticsCluster) cluster)
                  .readAttributeListAttribute(
                      (ChipClusters.WiFiNetworkDiagnosticsCluster.AttributeListAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedWiFiNetworkDiagnosticsClusterAttributeListAttributeCallback(),
            readWiFiNetworkDiagnosticsAttributeListCommandParams);
    result.put(
        "readAttributeListAttribute",
        readWiFiNetworkDiagnosticsAttributeListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readWiFiNetworkDiagnosticsFeatureMapCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readWiFiNetworkDiagnosticsFeatureMapAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.WiFiNetworkDiagnosticsCluster) cluster)
                  .readFeatureMapAttribute((ChipClusters.LongAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedLongAttributeCallback(),
            readWiFiNetworkDiagnosticsFeatureMapCommandParams);
    result.put(
        "readFeatureMapAttribute", readWiFiNetworkDiagnosticsFeatureMapAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readWiFiNetworkDiagnosticsClusterRevisionCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readWiFiNetworkDiagnosticsClusterRevisionAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.WiFiNetworkDiagnosticsCluster) cluster)
                  .readClusterRevisionAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readWiFiNetworkDiagnosticsClusterRevisionCommandParams);
    result.put(
        "readClusterRevisionAttribute",
        readWiFiNetworkDiagnosticsClusterRevisionAttributeInteractionInfo);

    return result;
  }

  private static Map<String, InteractionInfo> readEthernetNetworkDiagnosticsInteractionInfo() {
    Map<String, InteractionInfo> result = new LinkedHashMap<>();
    Map<String, CommandParameterInfo> readEthernetNetworkDiagnosticsPHYRateCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readEthernetNetworkDiagnosticsPHYRateAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.EthernetNetworkDiagnosticsCluster) cluster)
                  .readPHYRateAttribute(
                      (ChipClusters.EthernetNetworkDiagnosticsCluster.PHYRateAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedEthernetNetworkDiagnosticsClusterPHYRateAttributeCallback(),
            readEthernetNetworkDiagnosticsPHYRateCommandParams);
    result.put(
        "readPHYRateAttribute", readEthernetNetworkDiagnosticsPHYRateAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readEthernetNetworkDiagnosticsFullDuplexCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readEthernetNetworkDiagnosticsFullDuplexAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.EthernetNetworkDiagnosticsCluster) cluster)
                  .readFullDuplexAttribute(
                      (ChipClusters.EthernetNetworkDiagnosticsCluster.FullDuplexAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedEthernetNetworkDiagnosticsClusterFullDuplexAttributeCallback(),
            readEthernetNetworkDiagnosticsFullDuplexCommandParams);
    result.put(
        "readFullDuplexAttribute",
        readEthernetNetworkDiagnosticsFullDuplexAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readEthernetNetworkDiagnosticsPacketRxCountCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readEthernetNetworkDiagnosticsPacketRxCountAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.EthernetNetworkDiagnosticsCluster) cluster)
                  .readPacketRxCountAttribute((ChipClusters.LongAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedLongAttributeCallback(),
            readEthernetNetworkDiagnosticsPacketRxCountCommandParams);
    result.put(
        "readPacketRxCountAttribute",
        readEthernetNetworkDiagnosticsPacketRxCountAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readEthernetNetworkDiagnosticsPacketTxCountCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readEthernetNetworkDiagnosticsPacketTxCountAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.EthernetNetworkDiagnosticsCluster) cluster)
                  .readPacketTxCountAttribute((ChipClusters.LongAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedLongAttributeCallback(),
            readEthernetNetworkDiagnosticsPacketTxCountCommandParams);
    result.put(
        "readPacketTxCountAttribute",
        readEthernetNetworkDiagnosticsPacketTxCountAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readEthernetNetworkDiagnosticsTxErrCountCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readEthernetNetworkDiagnosticsTxErrCountAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.EthernetNetworkDiagnosticsCluster) cluster)
                  .readTxErrCountAttribute((ChipClusters.LongAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedLongAttributeCallback(),
            readEthernetNetworkDiagnosticsTxErrCountCommandParams);
    result.put(
        "readTxErrCountAttribute",
        readEthernetNetworkDiagnosticsTxErrCountAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readEthernetNetworkDiagnosticsCollisionCountCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readEthernetNetworkDiagnosticsCollisionCountAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.EthernetNetworkDiagnosticsCluster) cluster)
                  .readCollisionCountAttribute((ChipClusters.LongAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedLongAttributeCallback(),
            readEthernetNetworkDiagnosticsCollisionCountCommandParams);
    result.put(
        "readCollisionCountAttribute",
        readEthernetNetworkDiagnosticsCollisionCountAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readEthernetNetworkDiagnosticsOverrunCountCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readEthernetNetworkDiagnosticsOverrunCountAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.EthernetNetworkDiagnosticsCluster) cluster)
                  .readOverrunCountAttribute((ChipClusters.LongAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedLongAttributeCallback(),
            readEthernetNetworkDiagnosticsOverrunCountCommandParams);
    result.put(
        "readOverrunCountAttribute",
        readEthernetNetworkDiagnosticsOverrunCountAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readEthernetNetworkDiagnosticsCarrierDetectCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readEthernetNetworkDiagnosticsCarrierDetectAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.EthernetNetworkDiagnosticsCluster) cluster)
                  .readCarrierDetectAttribute(
                      (ChipClusters.EthernetNetworkDiagnosticsCluster
                              .CarrierDetectAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedEthernetNetworkDiagnosticsClusterCarrierDetectAttributeCallback(),
            readEthernetNetworkDiagnosticsCarrierDetectCommandParams);
    result.put(
        "readCarrierDetectAttribute",
        readEthernetNetworkDiagnosticsCarrierDetectAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readEthernetNetworkDiagnosticsTimeSinceResetCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readEthernetNetworkDiagnosticsTimeSinceResetAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.EthernetNetworkDiagnosticsCluster) cluster)
                  .readTimeSinceResetAttribute((ChipClusters.LongAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedLongAttributeCallback(),
            readEthernetNetworkDiagnosticsTimeSinceResetCommandParams);
    result.put(
        "readTimeSinceResetAttribute",
        readEthernetNetworkDiagnosticsTimeSinceResetAttributeInteractionInfo);
    Map<String, CommandParameterInfo>
        readEthernetNetworkDiagnosticsGeneratedCommandListCommandParams =
            new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readEthernetNetworkDiagnosticsGeneratedCommandListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.EthernetNetworkDiagnosticsCluster) cluster)
                  .readGeneratedCommandListAttribute(
                      (ChipClusters.EthernetNetworkDiagnosticsCluster
                              .GeneratedCommandListAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedEthernetNetworkDiagnosticsClusterGeneratedCommandListAttributeCallback(),
            readEthernetNetworkDiagnosticsGeneratedCommandListCommandParams);
    result.put(
        "readGeneratedCommandListAttribute",
        readEthernetNetworkDiagnosticsGeneratedCommandListAttributeInteractionInfo);
    Map<String, CommandParameterInfo>
        readEthernetNetworkDiagnosticsAcceptedCommandListCommandParams =
            new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readEthernetNetworkDiagnosticsAcceptedCommandListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.EthernetNetworkDiagnosticsCluster) cluster)
                  .readAcceptedCommandListAttribute(
                      (ChipClusters.EthernetNetworkDiagnosticsCluster
                              .AcceptedCommandListAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedEthernetNetworkDiagnosticsClusterAcceptedCommandListAttributeCallback(),
            readEthernetNetworkDiagnosticsAcceptedCommandListCommandParams);
    result.put(
        "readAcceptedCommandListAttribute",
        readEthernetNetworkDiagnosticsAcceptedCommandListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readEthernetNetworkDiagnosticsEventListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readEthernetNetworkDiagnosticsEventListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.EthernetNetworkDiagnosticsCluster) cluster)
                  .readEventListAttribute(
                      (ChipClusters.EthernetNetworkDiagnosticsCluster.EventListAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedEthernetNetworkDiagnosticsClusterEventListAttributeCallback(),
            readEthernetNetworkDiagnosticsEventListCommandParams);
    result.put(
        "readEventListAttribute", readEthernetNetworkDiagnosticsEventListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readEthernetNetworkDiagnosticsAttributeListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readEthernetNetworkDiagnosticsAttributeListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.EthernetNetworkDiagnosticsCluster) cluster)
                  .readAttributeListAttribute(
                      (ChipClusters.EthernetNetworkDiagnosticsCluster
                              .AttributeListAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedEthernetNetworkDiagnosticsClusterAttributeListAttributeCallback(),
            readEthernetNetworkDiagnosticsAttributeListCommandParams);
    result.put(
        "readAttributeListAttribute",
        readEthernetNetworkDiagnosticsAttributeListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readEthernetNetworkDiagnosticsFeatureMapCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readEthernetNetworkDiagnosticsFeatureMapAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.EthernetNetworkDiagnosticsCluster) cluster)
                  .readFeatureMapAttribute((ChipClusters.LongAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedLongAttributeCallback(),
            readEthernetNetworkDiagnosticsFeatureMapCommandParams);
    result.put(
        "readFeatureMapAttribute",
        readEthernetNetworkDiagnosticsFeatureMapAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readEthernetNetworkDiagnosticsClusterRevisionCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readEthernetNetworkDiagnosticsClusterRevisionAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.EthernetNetworkDiagnosticsCluster) cluster)
                  .readClusterRevisionAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readEthernetNetworkDiagnosticsClusterRevisionCommandParams);
    result.put(
        "readClusterRevisionAttribute",
        readEthernetNetworkDiagnosticsClusterRevisionAttributeInteractionInfo);

    return result;
  }

  private static Map<String, InteractionInfo> readBridgedDeviceBasicInformationInteractionInfo() {
    Map<String, InteractionInfo> result = new LinkedHashMap<>();
    Map<String, CommandParameterInfo> readBridgedDeviceBasicInformationVendorNameCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readBridgedDeviceBasicInformationVendorNameAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.BridgedDeviceBasicInformationCluster) cluster)
                  .readVendorNameAttribute((ChipClusters.CharStringAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedCharStringAttributeCallback(),
            readBridgedDeviceBasicInformationVendorNameCommandParams);
    result.put(
        "readVendorNameAttribute",
        readBridgedDeviceBasicInformationVendorNameAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readBridgedDeviceBasicInformationVendorIDCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readBridgedDeviceBasicInformationVendorIDAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.BridgedDeviceBasicInformationCluster) cluster)
                  .readVendorIDAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readBridgedDeviceBasicInformationVendorIDCommandParams);
    result.put(
        "readVendorIDAttribute", readBridgedDeviceBasicInformationVendorIDAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readBridgedDeviceBasicInformationProductNameCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readBridgedDeviceBasicInformationProductNameAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.BridgedDeviceBasicInformationCluster) cluster)
                  .readProductNameAttribute((ChipClusters.CharStringAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedCharStringAttributeCallback(),
            readBridgedDeviceBasicInformationProductNameCommandParams);
    result.put(
        "readProductNameAttribute",
        readBridgedDeviceBasicInformationProductNameAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readBridgedDeviceBasicInformationNodeLabelCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readBridgedDeviceBasicInformationNodeLabelAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.BridgedDeviceBasicInformationCluster) cluster)
                  .readNodeLabelAttribute((ChipClusters.CharStringAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedCharStringAttributeCallback(),
            readBridgedDeviceBasicInformationNodeLabelCommandParams);
    result.put(
        "readNodeLabelAttribute",
        readBridgedDeviceBasicInformationNodeLabelAttributeInteractionInfo);
    Map<String, CommandParameterInfo>
        readBridgedDeviceBasicInformationHardwareVersionCommandParams =
            new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readBridgedDeviceBasicInformationHardwareVersionAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.BridgedDeviceBasicInformationCluster) cluster)
                  .readHardwareVersionAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readBridgedDeviceBasicInformationHardwareVersionCommandParams);
    result.put(
        "readHardwareVersionAttribute",
        readBridgedDeviceBasicInformationHardwareVersionAttributeInteractionInfo);
    Map<String, CommandParameterInfo>
        readBridgedDeviceBasicInformationHardwareVersionStringCommandParams =
            new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readBridgedDeviceBasicInformationHardwareVersionStringAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.BridgedDeviceBasicInformationCluster) cluster)
                  .readHardwareVersionStringAttribute(
                      (ChipClusters.CharStringAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedCharStringAttributeCallback(),
            readBridgedDeviceBasicInformationHardwareVersionStringCommandParams);
    result.put(
        "readHardwareVersionStringAttribute",
        readBridgedDeviceBasicInformationHardwareVersionStringAttributeInteractionInfo);
    Map<String, CommandParameterInfo>
        readBridgedDeviceBasicInformationSoftwareVersionCommandParams =
            new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readBridgedDeviceBasicInformationSoftwareVersionAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.BridgedDeviceBasicInformationCluster) cluster)
                  .readSoftwareVersionAttribute((ChipClusters.LongAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedLongAttributeCallback(),
            readBridgedDeviceBasicInformationSoftwareVersionCommandParams);
    result.put(
        "readSoftwareVersionAttribute",
        readBridgedDeviceBasicInformationSoftwareVersionAttributeInteractionInfo);
    Map<String, CommandParameterInfo>
        readBridgedDeviceBasicInformationSoftwareVersionStringCommandParams =
            new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readBridgedDeviceBasicInformationSoftwareVersionStringAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.BridgedDeviceBasicInformationCluster) cluster)
                  .readSoftwareVersionStringAttribute(
                      (ChipClusters.CharStringAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedCharStringAttributeCallback(),
            readBridgedDeviceBasicInformationSoftwareVersionStringCommandParams);
    result.put(
        "readSoftwareVersionStringAttribute",
        readBridgedDeviceBasicInformationSoftwareVersionStringAttributeInteractionInfo);
    Map<String, CommandParameterInfo>
        readBridgedDeviceBasicInformationManufacturingDateCommandParams =
            new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readBridgedDeviceBasicInformationManufacturingDateAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.BridgedDeviceBasicInformationCluster) cluster)
                  .readManufacturingDateAttribute(
                      (ChipClusters.CharStringAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedCharStringAttributeCallback(),
            readBridgedDeviceBasicInformationManufacturingDateCommandParams);
    result.put(
        "readManufacturingDateAttribute",
        readBridgedDeviceBasicInformationManufacturingDateAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readBridgedDeviceBasicInformationPartNumberCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readBridgedDeviceBasicInformationPartNumberAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.BridgedDeviceBasicInformationCluster) cluster)
                  .readPartNumberAttribute((ChipClusters.CharStringAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedCharStringAttributeCallback(),
            readBridgedDeviceBasicInformationPartNumberCommandParams);
    result.put(
        "readPartNumberAttribute",
        readBridgedDeviceBasicInformationPartNumberAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readBridgedDeviceBasicInformationProductURLCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readBridgedDeviceBasicInformationProductURLAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.BridgedDeviceBasicInformationCluster) cluster)
                  .readProductURLAttribute((ChipClusters.CharStringAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedCharStringAttributeCallback(),
            readBridgedDeviceBasicInformationProductURLCommandParams);
    result.put(
        "readProductURLAttribute",
        readBridgedDeviceBasicInformationProductURLAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readBridgedDeviceBasicInformationProductLabelCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readBridgedDeviceBasicInformationProductLabelAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.BridgedDeviceBasicInformationCluster) cluster)
                  .readProductLabelAttribute((ChipClusters.CharStringAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedCharStringAttributeCallback(),
            readBridgedDeviceBasicInformationProductLabelCommandParams);
    result.put(
        "readProductLabelAttribute",
        readBridgedDeviceBasicInformationProductLabelAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readBridgedDeviceBasicInformationSerialNumberCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readBridgedDeviceBasicInformationSerialNumberAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.BridgedDeviceBasicInformationCluster) cluster)
                  .readSerialNumberAttribute((ChipClusters.CharStringAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedCharStringAttributeCallback(),
            readBridgedDeviceBasicInformationSerialNumberCommandParams);
    result.put(
        "readSerialNumberAttribute",
        readBridgedDeviceBasicInformationSerialNumberAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readBridgedDeviceBasicInformationReachableCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readBridgedDeviceBasicInformationReachableAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.BridgedDeviceBasicInformationCluster) cluster)
                  .readReachableAttribute((ChipClusters.BooleanAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedBooleanAttributeCallback(),
            readBridgedDeviceBasicInformationReachableCommandParams);
    result.put(
        "readReachableAttribute",
        readBridgedDeviceBasicInformationReachableAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readBridgedDeviceBasicInformationUniqueIDCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readBridgedDeviceBasicInformationUniqueIDAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.BridgedDeviceBasicInformationCluster) cluster)
                  .readUniqueIDAttribute((ChipClusters.CharStringAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedCharStringAttributeCallback(),
            readBridgedDeviceBasicInformationUniqueIDCommandParams);
    result.put(
        "readUniqueIDAttribute", readBridgedDeviceBasicInformationUniqueIDAttributeInteractionInfo);
    Map<String, CommandParameterInfo>
        readBridgedDeviceBasicInformationGeneratedCommandListCommandParams =
            new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readBridgedDeviceBasicInformationGeneratedCommandListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.BridgedDeviceBasicInformationCluster) cluster)
                  .readGeneratedCommandListAttribute(
                      (ChipClusters.BridgedDeviceBasicInformationCluster
                              .GeneratedCommandListAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedBridgedDeviceBasicInformationClusterGeneratedCommandListAttributeCallback(),
            readBridgedDeviceBasicInformationGeneratedCommandListCommandParams);
    result.put(
        "readGeneratedCommandListAttribute",
        readBridgedDeviceBasicInformationGeneratedCommandListAttributeInteractionInfo);
    Map<String, CommandParameterInfo>
        readBridgedDeviceBasicInformationAcceptedCommandListCommandParams =
            new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readBridgedDeviceBasicInformationAcceptedCommandListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.BridgedDeviceBasicInformationCluster) cluster)
                  .readAcceptedCommandListAttribute(
                      (ChipClusters.BridgedDeviceBasicInformationCluster
                              .AcceptedCommandListAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedBridgedDeviceBasicInformationClusterAcceptedCommandListAttributeCallback(),
            readBridgedDeviceBasicInformationAcceptedCommandListCommandParams);
    result.put(
        "readAcceptedCommandListAttribute",
        readBridgedDeviceBasicInformationAcceptedCommandListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readBridgedDeviceBasicInformationEventListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readBridgedDeviceBasicInformationEventListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.BridgedDeviceBasicInformationCluster) cluster)
                  .readEventListAttribute(
                      (ChipClusters.BridgedDeviceBasicInformationCluster.EventListAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedBridgedDeviceBasicInformationClusterEventListAttributeCallback(),
            readBridgedDeviceBasicInformationEventListCommandParams);
    result.put(
        "readEventListAttribute",
        readBridgedDeviceBasicInformationEventListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readBridgedDeviceBasicInformationAttributeListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readBridgedDeviceBasicInformationAttributeListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.BridgedDeviceBasicInformationCluster) cluster)
                  .readAttributeListAttribute(
                      (ChipClusters.BridgedDeviceBasicInformationCluster
                              .AttributeListAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedBridgedDeviceBasicInformationClusterAttributeListAttributeCallback(),
            readBridgedDeviceBasicInformationAttributeListCommandParams);
    result.put(
        "readAttributeListAttribute",
        readBridgedDeviceBasicInformationAttributeListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readBridgedDeviceBasicInformationFeatureMapCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readBridgedDeviceBasicInformationFeatureMapAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.BridgedDeviceBasicInformationCluster) cluster)
                  .readFeatureMapAttribute((ChipClusters.LongAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedLongAttributeCallback(),
            readBridgedDeviceBasicInformationFeatureMapCommandParams);
    result.put(
        "readFeatureMapAttribute",
        readBridgedDeviceBasicInformationFeatureMapAttributeInteractionInfo);
    Map<String, CommandParameterInfo>
        readBridgedDeviceBasicInformationClusterRevisionCommandParams =
            new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readBridgedDeviceBasicInformationClusterRevisionAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.BridgedDeviceBasicInformationCluster) cluster)
                  .readClusterRevisionAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readBridgedDeviceBasicInformationClusterRevisionCommandParams);
    result.put(
        "readClusterRevisionAttribute",
        readBridgedDeviceBasicInformationClusterRevisionAttributeInteractionInfo);

    return result;
  }

  private static Map<String, InteractionInfo> readSwitchInteractionInfo() {
    Map<String, InteractionInfo> result = new LinkedHashMap<>();
    Map<String, CommandParameterInfo> readSwitchNumberOfPositionsCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readSwitchNumberOfPositionsAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.SwitchCluster) cluster)
                  .readNumberOfPositionsAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readSwitchNumberOfPositionsCommandParams);
    result.put(
        "readNumberOfPositionsAttribute", readSwitchNumberOfPositionsAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readSwitchCurrentPositionCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readSwitchCurrentPositionAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.SwitchCluster) cluster)
                  .readCurrentPositionAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readSwitchCurrentPositionCommandParams);
    result.put("readCurrentPositionAttribute", readSwitchCurrentPositionAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readSwitchMultiPressMaxCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readSwitchMultiPressMaxAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.SwitchCluster) cluster)
                  .readMultiPressMaxAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readSwitchMultiPressMaxCommandParams);
    result.put("readMultiPressMaxAttribute", readSwitchMultiPressMaxAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readSwitchGeneratedCommandListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readSwitchGeneratedCommandListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.SwitchCluster) cluster)
                  .readGeneratedCommandListAttribute(
                      (ChipClusters.SwitchCluster.GeneratedCommandListAttributeCallback) callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedSwitchClusterGeneratedCommandListAttributeCallback(),
            readSwitchGeneratedCommandListCommandParams);
    result.put(
        "readGeneratedCommandListAttribute",
        readSwitchGeneratedCommandListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readSwitchAcceptedCommandListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readSwitchAcceptedCommandListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.SwitchCluster) cluster)
                  .readAcceptedCommandListAttribute(
                      (ChipClusters.SwitchCluster.AcceptedCommandListAttributeCallback) callback);
            },
            () ->
                new ClusterInfoMapping.DelegatedSwitchClusterAcceptedCommandListAttributeCallback(),
            readSwitchAcceptedCommandListCommandParams);
    result.put(
        "readAcceptedCommandListAttribute", readSwitchAcceptedCommandListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readSwitchEventListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readSwitchEventListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.SwitchCluster) cluster)
                  .readEventListAttribute(
                      (ChipClusters.SwitchCluster.EventListAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedSwitchClusterEventListAttributeCallback(),
            readSwitchEventListCommandParams);
    result.put("readEventListAttribute", readSwitchEventListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readSwitchAttributeListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readSwitchAttributeListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.SwitchCluster) cluster)
                  .readAttributeListAttribute(
                      (ChipClusters.SwitchCluster.AttributeListAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedSwitchClusterAttributeListAttributeCallback(),
            readSwitchAttributeListCommandParams);
    result.put("readAttributeListAttribute", readSwitchAttributeListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readSwitchFeatureMapCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readSwitchFeatureMapAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.SwitchCluster) cluster)
                  .readFeatureMapAttribute((ChipClusters.LongAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedLongAttributeCallback(),
            readSwitchFeatureMapCommandParams);
    result.put("readFeatureMapAttribute", readSwitchFeatureMapAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readSwitchClusterRevisionCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readSwitchClusterRevisionAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.SwitchCluster) cluster)
                  .readClusterRevisionAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readSwitchClusterRevisionCommandParams);
    result.put("readClusterRevisionAttribute", readSwitchClusterRevisionAttributeInteractionInfo);

    return result;
  }

  private static Map<String, InteractionInfo> readAdministratorCommissioningInteractionInfo() {
    Map<String, InteractionInfo> result = new LinkedHashMap<>();
    Map<String, CommandParameterInfo> readAdministratorCommissioningWindowStatusCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readAdministratorCommissioningWindowStatusAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.AdministratorCommissioningCluster) cluster)
                  .readWindowStatusAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readAdministratorCommissioningWindowStatusCommandParams);
    result.put(
        "readWindowStatusAttribute",
        readAdministratorCommissioningWindowStatusAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readAdministratorCommissioningAdminFabricIndexCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readAdministratorCommissioningAdminFabricIndexAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.AdministratorCommissioningCluster) cluster)
                  .readAdminFabricIndexAttribute(
                      (ChipClusters.AdministratorCommissioningCluster
                              .AdminFabricIndexAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedAdministratorCommissioningClusterAdminFabricIndexAttributeCallback(),
            readAdministratorCommissioningAdminFabricIndexCommandParams);
    result.put(
        "readAdminFabricIndexAttribute",
        readAdministratorCommissioningAdminFabricIndexAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readAdministratorCommissioningAdminVendorIdCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readAdministratorCommissioningAdminVendorIdAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.AdministratorCommissioningCluster) cluster)
                  .readAdminVendorIdAttribute(
                      (ChipClusters.AdministratorCommissioningCluster
                              .AdminVendorIdAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedAdministratorCommissioningClusterAdminVendorIdAttributeCallback(),
            readAdministratorCommissioningAdminVendorIdCommandParams);
    result.put(
        "readAdminVendorIdAttribute",
        readAdministratorCommissioningAdminVendorIdAttributeInteractionInfo);
    Map<String, CommandParameterInfo>
        readAdministratorCommissioningGeneratedCommandListCommandParams =
            new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readAdministratorCommissioningGeneratedCommandListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.AdministratorCommissioningCluster) cluster)
                  .readGeneratedCommandListAttribute(
                      (ChipClusters.AdministratorCommissioningCluster
                              .GeneratedCommandListAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedAdministratorCommissioningClusterGeneratedCommandListAttributeCallback(),
            readAdministratorCommissioningGeneratedCommandListCommandParams);
    result.put(
        "readGeneratedCommandListAttribute",
        readAdministratorCommissioningGeneratedCommandListAttributeInteractionInfo);
    Map<String, CommandParameterInfo>
        readAdministratorCommissioningAcceptedCommandListCommandParams =
            new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readAdministratorCommissioningAcceptedCommandListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.AdministratorCommissioningCluster) cluster)
                  .readAcceptedCommandListAttribute(
                      (ChipClusters.AdministratorCommissioningCluster
                              .AcceptedCommandListAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedAdministratorCommissioningClusterAcceptedCommandListAttributeCallback(),
            readAdministratorCommissioningAcceptedCommandListCommandParams);
    result.put(
        "readAcceptedCommandListAttribute",
        readAdministratorCommissioningAcceptedCommandListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readAdministratorCommissioningEventListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readAdministratorCommissioningEventListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.AdministratorCommissioningCluster) cluster)
                  .readEventListAttribute(
                      (ChipClusters.AdministratorCommissioningCluster.EventListAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedAdministratorCommissioningClusterEventListAttributeCallback(),
            readAdministratorCommissioningEventListCommandParams);
    result.put(
        "readEventListAttribute", readAdministratorCommissioningEventListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readAdministratorCommissioningAttributeListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readAdministratorCommissioningAttributeListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.AdministratorCommissioningCluster) cluster)
                  .readAttributeListAttribute(
                      (ChipClusters.AdministratorCommissioningCluster
                              .AttributeListAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedAdministratorCommissioningClusterAttributeListAttributeCallback(),
            readAdministratorCommissioningAttributeListCommandParams);
    result.put(
        "readAttributeListAttribute",
        readAdministratorCommissioningAttributeListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readAdministratorCommissioningFeatureMapCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readAdministratorCommissioningFeatureMapAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.AdministratorCommissioningCluster) cluster)
                  .readFeatureMapAttribute((ChipClusters.LongAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedLongAttributeCallback(),
            readAdministratorCommissioningFeatureMapCommandParams);
    result.put(
        "readFeatureMapAttribute",
        readAdministratorCommissioningFeatureMapAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readAdministratorCommissioningClusterRevisionCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readAdministratorCommissioningClusterRevisionAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.AdministratorCommissioningCluster) cluster)
                  .readClusterRevisionAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readAdministratorCommissioningClusterRevisionCommandParams);
    result.put(
        "readClusterRevisionAttribute",
        readAdministratorCommissioningClusterRevisionAttributeInteractionInfo);

    return result;
  }

  private static Map<String, InteractionInfo> readOperationalCredentialsInteractionInfo() {
    Map<String, InteractionInfo> result = new LinkedHashMap<>();
    Map<String, CommandParameterInfo> readOperationalCredentialsNOCsCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readOperationalCredentialsNOCsAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.OperationalCredentialsCluster) cluster)
                  .readNOCsAttribute(
                      (ChipClusters.OperationalCredentialsCluster.NOCsAttributeCallback) callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedOperationalCredentialsClusterNOCsAttributeCallback(),
            readOperationalCredentialsNOCsCommandParams);
    result.put("readNOCsAttribute", readOperationalCredentialsNOCsAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readOperationalCredentialsFabricsCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readOperationalCredentialsFabricsAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.OperationalCredentialsCluster) cluster)
                  .readFabricsAttribute(
                      (ChipClusters.OperationalCredentialsCluster.FabricsAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedOperationalCredentialsClusterFabricsAttributeCallback(),
            readOperationalCredentialsFabricsCommandParams);
    result.put("readFabricsAttribute", readOperationalCredentialsFabricsAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readOperationalCredentialsSupportedFabricsCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readOperationalCredentialsSupportedFabricsAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.OperationalCredentialsCluster) cluster)
                  .readSupportedFabricsAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readOperationalCredentialsSupportedFabricsCommandParams);
    result.put(
        "readSupportedFabricsAttribute",
        readOperationalCredentialsSupportedFabricsAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readOperationalCredentialsCommissionedFabricsCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readOperationalCredentialsCommissionedFabricsAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.OperationalCredentialsCluster) cluster)
                  .readCommissionedFabricsAttribute(
                      (ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readOperationalCredentialsCommissionedFabricsCommandParams);
    result.put(
        "readCommissionedFabricsAttribute",
        readOperationalCredentialsCommissionedFabricsAttributeInteractionInfo);
    Map<String, CommandParameterInfo>
        readOperationalCredentialsTrustedRootCertificatesCommandParams =
            new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readOperationalCredentialsTrustedRootCertificatesAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.OperationalCredentialsCluster) cluster)
                  .readTrustedRootCertificatesAttribute(
                      (ChipClusters.OperationalCredentialsCluster
                              .TrustedRootCertificatesAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedOperationalCredentialsClusterTrustedRootCertificatesAttributeCallback(),
            readOperationalCredentialsTrustedRootCertificatesCommandParams);
    result.put(
        "readTrustedRootCertificatesAttribute",
        readOperationalCredentialsTrustedRootCertificatesAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readOperationalCredentialsCurrentFabricIndexCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readOperationalCredentialsCurrentFabricIndexAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.OperationalCredentialsCluster) cluster)
                  .readCurrentFabricIndexAttribute(
                      (ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readOperationalCredentialsCurrentFabricIndexCommandParams);
    result.put(
        "readCurrentFabricIndexAttribute",
        readOperationalCredentialsCurrentFabricIndexAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readOperationalCredentialsGeneratedCommandListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readOperationalCredentialsGeneratedCommandListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.OperationalCredentialsCluster) cluster)
                  .readGeneratedCommandListAttribute(
                      (ChipClusters.OperationalCredentialsCluster
                              .GeneratedCommandListAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedOperationalCredentialsClusterGeneratedCommandListAttributeCallback(),
            readOperationalCredentialsGeneratedCommandListCommandParams);
    result.put(
        "readGeneratedCommandListAttribute",
        readOperationalCredentialsGeneratedCommandListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readOperationalCredentialsAcceptedCommandListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readOperationalCredentialsAcceptedCommandListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.OperationalCredentialsCluster) cluster)
                  .readAcceptedCommandListAttribute(
                      (ChipClusters.OperationalCredentialsCluster
                              .AcceptedCommandListAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedOperationalCredentialsClusterAcceptedCommandListAttributeCallback(),
            readOperationalCredentialsAcceptedCommandListCommandParams);
    result.put(
        "readAcceptedCommandListAttribute",
        readOperationalCredentialsAcceptedCommandListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readOperationalCredentialsEventListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readOperationalCredentialsEventListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.OperationalCredentialsCluster) cluster)
                  .readEventListAttribute(
                      (ChipClusters.OperationalCredentialsCluster.EventListAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedOperationalCredentialsClusterEventListAttributeCallback(),
            readOperationalCredentialsEventListCommandParams);
    result.put(
        "readEventListAttribute", readOperationalCredentialsEventListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readOperationalCredentialsAttributeListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readOperationalCredentialsAttributeListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.OperationalCredentialsCluster) cluster)
                  .readAttributeListAttribute(
                      (ChipClusters.OperationalCredentialsCluster.AttributeListAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedOperationalCredentialsClusterAttributeListAttributeCallback(),
            readOperationalCredentialsAttributeListCommandParams);
    result.put(
        "readAttributeListAttribute",
        readOperationalCredentialsAttributeListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readOperationalCredentialsFeatureMapCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readOperationalCredentialsFeatureMapAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.OperationalCredentialsCluster) cluster)
                  .readFeatureMapAttribute((ChipClusters.LongAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedLongAttributeCallback(),
            readOperationalCredentialsFeatureMapCommandParams);
    result.put(
        "readFeatureMapAttribute", readOperationalCredentialsFeatureMapAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readOperationalCredentialsClusterRevisionCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readOperationalCredentialsClusterRevisionAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.OperationalCredentialsCluster) cluster)
                  .readClusterRevisionAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readOperationalCredentialsClusterRevisionCommandParams);
    result.put(
        "readClusterRevisionAttribute",
        readOperationalCredentialsClusterRevisionAttributeInteractionInfo);

    return result;
  }

  private static Map<String, InteractionInfo> readGroupKeyManagementInteractionInfo() {
    Map<String, InteractionInfo> result = new LinkedHashMap<>();
    Map<String, CommandParameterInfo> readGroupKeyManagementGroupKeyMapCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readGroupKeyManagementGroupKeyMapAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.GroupKeyManagementCluster) cluster)
                  .readGroupKeyMapAttribute(
                      (ChipClusters.GroupKeyManagementCluster.GroupKeyMapAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedGroupKeyManagementClusterGroupKeyMapAttributeCallback(),
            readGroupKeyManagementGroupKeyMapCommandParams);
    result.put(
        "readGroupKeyMapAttribute", readGroupKeyManagementGroupKeyMapAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readGroupKeyManagementGroupTableCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readGroupKeyManagementGroupTableAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.GroupKeyManagementCluster) cluster)
                  .readGroupTableAttribute(
                      (ChipClusters.GroupKeyManagementCluster.GroupTableAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedGroupKeyManagementClusterGroupTableAttributeCallback(),
            readGroupKeyManagementGroupTableCommandParams);
    result.put("readGroupTableAttribute", readGroupKeyManagementGroupTableAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readGroupKeyManagementMaxGroupsPerFabricCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readGroupKeyManagementMaxGroupsPerFabricAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.GroupKeyManagementCluster) cluster)
                  .readMaxGroupsPerFabricAttribute(
                      (ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readGroupKeyManagementMaxGroupsPerFabricCommandParams);
    result.put(
        "readMaxGroupsPerFabricAttribute",
        readGroupKeyManagementMaxGroupsPerFabricAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readGroupKeyManagementMaxGroupKeysPerFabricCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readGroupKeyManagementMaxGroupKeysPerFabricAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.GroupKeyManagementCluster) cluster)
                  .readMaxGroupKeysPerFabricAttribute(
                      (ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readGroupKeyManagementMaxGroupKeysPerFabricCommandParams);
    result.put(
        "readMaxGroupKeysPerFabricAttribute",
        readGroupKeyManagementMaxGroupKeysPerFabricAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readGroupKeyManagementGeneratedCommandListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readGroupKeyManagementGeneratedCommandListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.GroupKeyManagementCluster) cluster)
                  .readGeneratedCommandListAttribute(
                      (ChipClusters.GroupKeyManagementCluster.GeneratedCommandListAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedGroupKeyManagementClusterGeneratedCommandListAttributeCallback(),
            readGroupKeyManagementGeneratedCommandListCommandParams);
    result.put(
        "readGeneratedCommandListAttribute",
        readGroupKeyManagementGeneratedCommandListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readGroupKeyManagementAcceptedCommandListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readGroupKeyManagementAcceptedCommandListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.GroupKeyManagementCluster) cluster)
                  .readAcceptedCommandListAttribute(
                      (ChipClusters.GroupKeyManagementCluster.AcceptedCommandListAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedGroupKeyManagementClusterAcceptedCommandListAttributeCallback(),
            readGroupKeyManagementAcceptedCommandListCommandParams);
    result.put(
        "readAcceptedCommandListAttribute",
        readGroupKeyManagementAcceptedCommandListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readGroupKeyManagementEventListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readGroupKeyManagementEventListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.GroupKeyManagementCluster) cluster)
                  .readEventListAttribute(
                      (ChipClusters.GroupKeyManagementCluster.EventListAttributeCallback) callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedGroupKeyManagementClusterEventListAttributeCallback(),
            readGroupKeyManagementEventListCommandParams);
    result.put("readEventListAttribute", readGroupKeyManagementEventListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readGroupKeyManagementAttributeListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readGroupKeyManagementAttributeListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.GroupKeyManagementCluster) cluster)
                  .readAttributeListAttribute(
                      (ChipClusters.GroupKeyManagementCluster.AttributeListAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedGroupKeyManagementClusterAttributeListAttributeCallback(),
            readGroupKeyManagementAttributeListCommandParams);
    result.put(
        "readAttributeListAttribute", readGroupKeyManagementAttributeListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readGroupKeyManagementFeatureMapCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readGroupKeyManagementFeatureMapAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.GroupKeyManagementCluster) cluster)
                  .readFeatureMapAttribute((ChipClusters.LongAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedLongAttributeCallback(),
            readGroupKeyManagementFeatureMapCommandParams);
    result.put("readFeatureMapAttribute", readGroupKeyManagementFeatureMapAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readGroupKeyManagementClusterRevisionCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readGroupKeyManagementClusterRevisionAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.GroupKeyManagementCluster) cluster)
                  .readClusterRevisionAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readGroupKeyManagementClusterRevisionCommandParams);
    result.put(
        "readClusterRevisionAttribute",
        readGroupKeyManagementClusterRevisionAttributeInteractionInfo);

    return result;
  }

  private static Map<String, InteractionInfo> readFixedLabelInteractionInfo() {
    Map<String, InteractionInfo> result = new LinkedHashMap<>();
    Map<String, CommandParameterInfo> readFixedLabelLabelListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readFixedLabelLabelListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.FixedLabelCluster) cluster)
                  .readLabelListAttribute(
                      (ChipClusters.FixedLabelCluster.LabelListAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedFixedLabelClusterLabelListAttributeCallback(),
            readFixedLabelLabelListCommandParams);
    result.put("readLabelListAttribute", readFixedLabelLabelListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readFixedLabelGeneratedCommandListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readFixedLabelGeneratedCommandListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.FixedLabelCluster) cluster)
                  .readGeneratedCommandListAttribute(
                      (ChipClusters.FixedLabelCluster.GeneratedCommandListAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedFixedLabelClusterGeneratedCommandListAttributeCallback(),
            readFixedLabelGeneratedCommandListCommandParams);
    result.put(
        "readGeneratedCommandListAttribute",
        readFixedLabelGeneratedCommandListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readFixedLabelAcceptedCommandListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readFixedLabelAcceptedCommandListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.FixedLabelCluster) cluster)
                  .readAcceptedCommandListAttribute(
                      (ChipClusters.FixedLabelCluster.AcceptedCommandListAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedFixedLabelClusterAcceptedCommandListAttributeCallback(),
            readFixedLabelAcceptedCommandListCommandParams);
    result.put(
        "readAcceptedCommandListAttribute",
        readFixedLabelAcceptedCommandListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readFixedLabelEventListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readFixedLabelEventListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.FixedLabelCluster) cluster)
                  .readEventListAttribute(
                      (ChipClusters.FixedLabelCluster.EventListAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedFixedLabelClusterEventListAttributeCallback(),
            readFixedLabelEventListCommandParams);
    result.put("readEventListAttribute", readFixedLabelEventListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readFixedLabelAttributeListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readFixedLabelAttributeListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.FixedLabelCluster) cluster)
                  .readAttributeListAttribute(
                      (ChipClusters.FixedLabelCluster.AttributeListAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedFixedLabelClusterAttributeListAttributeCallback(),
            readFixedLabelAttributeListCommandParams);
    result.put("readAttributeListAttribute", readFixedLabelAttributeListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readFixedLabelFeatureMapCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readFixedLabelFeatureMapAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.FixedLabelCluster) cluster)
                  .readFeatureMapAttribute((ChipClusters.LongAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedLongAttributeCallback(),
            readFixedLabelFeatureMapCommandParams);
    result.put("readFeatureMapAttribute", readFixedLabelFeatureMapAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readFixedLabelClusterRevisionCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readFixedLabelClusterRevisionAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.FixedLabelCluster) cluster)
                  .readClusterRevisionAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readFixedLabelClusterRevisionCommandParams);
    result.put(
        "readClusterRevisionAttribute", readFixedLabelClusterRevisionAttributeInteractionInfo);

    return result;
  }

  private static Map<String, InteractionInfo> readUserLabelInteractionInfo() {
    Map<String, InteractionInfo> result = new LinkedHashMap<>();
    Map<String, CommandParameterInfo> readUserLabelLabelListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readUserLabelLabelListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.UserLabelCluster) cluster)
                  .readLabelListAttribute(
                      (ChipClusters.UserLabelCluster.LabelListAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedUserLabelClusterLabelListAttributeCallback(),
            readUserLabelLabelListCommandParams);
    result.put("readLabelListAttribute", readUserLabelLabelListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readUserLabelGeneratedCommandListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readUserLabelGeneratedCommandListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.UserLabelCluster) cluster)
                  .readGeneratedCommandListAttribute(
                      (ChipClusters.UserLabelCluster.GeneratedCommandListAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedUserLabelClusterGeneratedCommandListAttributeCallback(),
            readUserLabelGeneratedCommandListCommandParams);
    result.put(
        "readGeneratedCommandListAttribute",
        readUserLabelGeneratedCommandListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readUserLabelAcceptedCommandListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readUserLabelAcceptedCommandListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.UserLabelCluster) cluster)
                  .readAcceptedCommandListAttribute(
                      (ChipClusters.UserLabelCluster.AcceptedCommandListAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedUserLabelClusterAcceptedCommandListAttributeCallback(),
            readUserLabelAcceptedCommandListCommandParams);
    result.put(
        "readAcceptedCommandListAttribute",
        readUserLabelAcceptedCommandListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readUserLabelEventListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readUserLabelEventListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.UserLabelCluster) cluster)
                  .readEventListAttribute(
                      (ChipClusters.UserLabelCluster.EventListAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedUserLabelClusterEventListAttributeCallback(),
            readUserLabelEventListCommandParams);
    result.put("readEventListAttribute", readUserLabelEventListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readUserLabelAttributeListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readUserLabelAttributeListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.UserLabelCluster) cluster)
                  .readAttributeListAttribute(
                      (ChipClusters.UserLabelCluster.AttributeListAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedUserLabelClusterAttributeListAttributeCallback(),
            readUserLabelAttributeListCommandParams);
    result.put("readAttributeListAttribute", readUserLabelAttributeListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readUserLabelFeatureMapCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readUserLabelFeatureMapAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.UserLabelCluster) cluster)
                  .readFeatureMapAttribute((ChipClusters.LongAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedLongAttributeCallback(),
            readUserLabelFeatureMapCommandParams);
    result.put("readFeatureMapAttribute", readUserLabelFeatureMapAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readUserLabelClusterRevisionCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readUserLabelClusterRevisionAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.UserLabelCluster) cluster)
                  .readClusterRevisionAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readUserLabelClusterRevisionCommandParams);
    result.put(
        "readClusterRevisionAttribute", readUserLabelClusterRevisionAttributeInteractionInfo);

    return result;
  }

  private static Map<String, InteractionInfo> readBooleanStateInteractionInfo() {
    Map<String, InteractionInfo> result = new LinkedHashMap<>();
    Map<String, CommandParameterInfo> readBooleanStateStateValueCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readBooleanStateStateValueAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.BooleanStateCluster) cluster)
                  .readStateValueAttribute((ChipClusters.BooleanAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedBooleanAttributeCallback(),
            readBooleanStateStateValueCommandParams);
    result.put("readStateValueAttribute", readBooleanStateStateValueAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readBooleanStateGeneratedCommandListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readBooleanStateGeneratedCommandListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.BooleanStateCluster) cluster)
                  .readGeneratedCommandListAttribute(
                      (ChipClusters.BooleanStateCluster.GeneratedCommandListAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedBooleanStateClusterGeneratedCommandListAttributeCallback(),
            readBooleanStateGeneratedCommandListCommandParams);
    result.put(
        "readGeneratedCommandListAttribute",
        readBooleanStateGeneratedCommandListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readBooleanStateAcceptedCommandListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readBooleanStateAcceptedCommandListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.BooleanStateCluster) cluster)
                  .readAcceptedCommandListAttribute(
                      (ChipClusters.BooleanStateCluster.AcceptedCommandListAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedBooleanStateClusterAcceptedCommandListAttributeCallback(),
            readBooleanStateAcceptedCommandListCommandParams);
    result.put(
        "readAcceptedCommandListAttribute",
        readBooleanStateAcceptedCommandListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readBooleanStateEventListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readBooleanStateEventListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.BooleanStateCluster) cluster)
                  .readEventListAttribute(
                      (ChipClusters.BooleanStateCluster.EventListAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedBooleanStateClusterEventListAttributeCallback(),
            readBooleanStateEventListCommandParams);
    result.put("readEventListAttribute", readBooleanStateEventListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readBooleanStateAttributeListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readBooleanStateAttributeListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.BooleanStateCluster) cluster)
                  .readAttributeListAttribute(
                      (ChipClusters.BooleanStateCluster.AttributeListAttributeCallback) callback);
            },
            () ->
                new ClusterInfoMapping.DelegatedBooleanStateClusterAttributeListAttributeCallback(),
            readBooleanStateAttributeListCommandParams);
    result.put("readAttributeListAttribute", readBooleanStateAttributeListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readBooleanStateFeatureMapCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readBooleanStateFeatureMapAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.BooleanStateCluster) cluster)
                  .readFeatureMapAttribute((ChipClusters.LongAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedLongAttributeCallback(),
            readBooleanStateFeatureMapCommandParams);
    result.put("readFeatureMapAttribute", readBooleanStateFeatureMapAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readBooleanStateClusterRevisionCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readBooleanStateClusterRevisionAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.BooleanStateCluster) cluster)
                  .readClusterRevisionAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readBooleanStateClusterRevisionCommandParams);
    result.put(
        "readClusterRevisionAttribute", readBooleanStateClusterRevisionAttributeInteractionInfo);

    return result;
  }

  private static Map<String, InteractionInfo> readModeSelectInteractionInfo() {
    Map<String, InteractionInfo> result = new LinkedHashMap<>();
    Map<String, CommandParameterInfo> readModeSelectDescriptionCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readModeSelectDescriptionAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ModeSelectCluster) cluster)
                  .readDescriptionAttribute((ChipClusters.CharStringAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedCharStringAttributeCallback(),
            readModeSelectDescriptionCommandParams);
    result.put("readDescriptionAttribute", readModeSelectDescriptionAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readModeSelectStandardNamespaceCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readModeSelectStandardNamespaceAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ModeSelectCluster) cluster)
                  .readStandardNamespaceAttribute(
                      (ChipClusters.ModeSelectCluster.StandardNamespaceAttributeCallback) callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedModeSelectClusterStandardNamespaceAttributeCallback(),
            readModeSelectStandardNamespaceCommandParams);
    result.put(
        "readStandardNamespaceAttribute", readModeSelectStandardNamespaceAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readModeSelectSupportedModesCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readModeSelectSupportedModesAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ModeSelectCluster) cluster)
                  .readSupportedModesAttribute(
                      (ChipClusters.ModeSelectCluster.SupportedModesAttributeCallback) callback);
            },
            () ->
                new ClusterInfoMapping.DelegatedModeSelectClusterSupportedModesAttributeCallback(),
            readModeSelectSupportedModesCommandParams);
    result.put("readSupportedModesAttribute", readModeSelectSupportedModesAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readModeSelectCurrentModeCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readModeSelectCurrentModeAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ModeSelectCluster) cluster)
                  .readCurrentModeAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readModeSelectCurrentModeCommandParams);
    result.put("readCurrentModeAttribute", readModeSelectCurrentModeAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readModeSelectStartUpModeCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readModeSelectStartUpModeAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ModeSelectCluster) cluster)
                  .readStartUpModeAttribute(
                      (ChipClusters.ModeSelectCluster.StartUpModeAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedModeSelectClusterStartUpModeAttributeCallback(),
            readModeSelectStartUpModeCommandParams);
    result.put("readStartUpModeAttribute", readModeSelectStartUpModeAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readModeSelectOnModeCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readModeSelectOnModeAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ModeSelectCluster) cluster)
                  .readOnModeAttribute(
                      (ChipClusters.ModeSelectCluster.OnModeAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedModeSelectClusterOnModeAttributeCallback(),
            readModeSelectOnModeCommandParams);
    result.put("readOnModeAttribute", readModeSelectOnModeAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readModeSelectGeneratedCommandListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readModeSelectGeneratedCommandListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ModeSelectCluster) cluster)
                  .readGeneratedCommandListAttribute(
                      (ChipClusters.ModeSelectCluster.GeneratedCommandListAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedModeSelectClusterGeneratedCommandListAttributeCallback(),
            readModeSelectGeneratedCommandListCommandParams);
    result.put(
        "readGeneratedCommandListAttribute",
        readModeSelectGeneratedCommandListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readModeSelectAcceptedCommandListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readModeSelectAcceptedCommandListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ModeSelectCluster) cluster)
                  .readAcceptedCommandListAttribute(
                      (ChipClusters.ModeSelectCluster.AcceptedCommandListAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedModeSelectClusterAcceptedCommandListAttributeCallback(),
            readModeSelectAcceptedCommandListCommandParams);
    result.put(
        "readAcceptedCommandListAttribute",
        readModeSelectAcceptedCommandListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readModeSelectEventListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readModeSelectEventListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ModeSelectCluster) cluster)
                  .readEventListAttribute(
                      (ChipClusters.ModeSelectCluster.EventListAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedModeSelectClusterEventListAttributeCallback(),
            readModeSelectEventListCommandParams);
    result.put("readEventListAttribute", readModeSelectEventListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readModeSelectAttributeListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readModeSelectAttributeListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ModeSelectCluster) cluster)
                  .readAttributeListAttribute(
                      (ChipClusters.ModeSelectCluster.AttributeListAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedModeSelectClusterAttributeListAttributeCallback(),
            readModeSelectAttributeListCommandParams);
    result.put("readAttributeListAttribute", readModeSelectAttributeListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readModeSelectFeatureMapCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readModeSelectFeatureMapAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ModeSelectCluster) cluster)
                  .readFeatureMapAttribute((ChipClusters.LongAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedLongAttributeCallback(),
            readModeSelectFeatureMapCommandParams);
    result.put("readFeatureMapAttribute", readModeSelectFeatureMapAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readModeSelectClusterRevisionCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readModeSelectClusterRevisionAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ModeSelectCluster) cluster)
                  .readClusterRevisionAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readModeSelectClusterRevisionCommandParams);
    result.put(
        "readClusterRevisionAttribute", readModeSelectClusterRevisionAttributeInteractionInfo);

    return result;
  }

  private static Map<String, InteractionInfo> readDoorLockInteractionInfo() {
    Map<String, InteractionInfo> result = new LinkedHashMap<>();
    Map<String, CommandParameterInfo> readDoorLockLockStateCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readDoorLockLockStateAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.DoorLockCluster) cluster)
                  .readLockStateAttribute(
                      (ChipClusters.DoorLockCluster.LockStateAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedDoorLockClusterLockStateAttributeCallback(),
            readDoorLockLockStateCommandParams);
    result.put("readLockStateAttribute", readDoorLockLockStateAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readDoorLockLockTypeCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readDoorLockLockTypeAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.DoorLockCluster) cluster)
                  .readLockTypeAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readDoorLockLockTypeCommandParams);
    result.put("readLockTypeAttribute", readDoorLockLockTypeAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readDoorLockActuatorEnabledCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readDoorLockActuatorEnabledAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.DoorLockCluster) cluster)
                  .readActuatorEnabledAttribute((ChipClusters.BooleanAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedBooleanAttributeCallback(),
            readDoorLockActuatorEnabledCommandParams);
    result.put("readActuatorEnabledAttribute", readDoorLockActuatorEnabledAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readDoorLockDoorStateCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readDoorLockDoorStateAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.DoorLockCluster) cluster)
                  .readDoorStateAttribute(
                      (ChipClusters.DoorLockCluster.DoorStateAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedDoorLockClusterDoorStateAttributeCallback(),
            readDoorLockDoorStateCommandParams);
    result.put("readDoorStateAttribute", readDoorLockDoorStateAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readDoorLockDoorOpenEventsCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readDoorLockDoorOpenEventsAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.DoorLockCluster) cluster)
                  .readDoorOpenEventsAttribute((ChipClusters.LongAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedLongAttributeCallback(),
            readDoorLockDoorOpenEventsCommandParams);
    result.put("readDoorOpenEventsAttribute", readDoorLockDoorOpenEventsAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readDoorLockDoorClosedEventsCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readDoorLockDoorClosedEventsAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.DoorLockCluster) cluster)
                  .readDoorClosedEventsAttribute((ChipClusters.LongAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedLongAttributeCallback(),
            readDoorLockDoorClosedEventsCommandParams);
    result.put(
        "readDoorClosedEventsAttribute", readDoorLockDoorClosedEventsAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readDoorLockOpenPeriodCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readDoorLockOpenPeriodAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.DoorLockCluster) cluster)
                  .readOpenPeriodAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readDoorLockOpenPeriodCommandParams);
    result.put("readOpenPeriodAttribute", readDoorLockOpenPeriodAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readDoorLockNumberOfTotalUsersSupportedCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readDoorLockNumberOfTotalUsersSupportedAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.DoorLockCluster) cluster)
                  .readNumberOfTotalUsersSupportedAttribute(
                      (ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readDoorLockNumberOfTotalUsersSupportedCommandParams);
    result.put(
        "readNumberOfTotalUsersSupportedAttribute",
        readDoorLockNumberOfTotalUsersSupportedAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readDoorLockNumberOfPINUsersSupportedCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readDoorLockNumberOfPINUsersSupportedAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.DoorLockCluster) cluster)
                  .readNumberOfPINUsersSupportedAttribute(
                      (ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readDoorLockNumberOfPINUsersSupportedCommandParams);
    result.put(
        "readNumberOfPINUsersSupportedAttribute",
        readDoorLockNumberOfPINUsersSupportedAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readDoorLockNumberOfRFIDUsersSupportedCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readDoorLockNumberOfRFIDUsersSupportedAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.DoorLockCluster) cluster)
                  .readNumberOfRFIDUsersSupportedAttribute(
                      (ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readDoorLockNumberOfRFIDUsersSupportedCommandParams);
    result.put(
        "readNumberOfRFIDUsersSupportedAttribute",
        readDoorLockNumberOfRFIDUsersSupportedAttributeInteractionInfo);
    Map<String, CommandParameterInfo>
        readDoorLockNumberOfWeekDaySchedulesSupportedPerUserCommandParams =
            new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readDoorLockNumberOfWeekDaySchedulesSupportedPerUserAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.DoorLockCluster) cluster)
                  .readNumberOfWeekDaySchedulesSupportedPerUserAttribute(
                      (ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readDoorLockNumberOfWeekDaySchedulesSupportedPerUserCommandParams);
    result.put(
        "readNumberOfWeekDaySchedulesSupportedPerUserAttribute",
        readDoorLockNumberOfWeekDaySchedulesSupportedPerUserAttributeInteractionInfo);
    Map<String, CommandParameterInfo>
        readDoorLockNumberOfYearDaySchedulesSupportedPerUserCommandParams =
            new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readDoorLockNumberOfYearDaySchedulesSupportedPerUserAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.DoorLockCluster) cluster)
                  .readNumberOfYearDaySchedulesSupportedPerUserAttribute(
                      (ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readDoorLockNumberOfYearDaySchedulesSupportedPerUserCommandParams);
    result.put(
        "readNumberOfYearDaySchedulesSupportedPerUserAttribute",
        readDoorLockNumberOfYearDaySchedulesSupportedPerUserAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readDoorLockNumberOfHolidaySchedulesSupportedCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readDoorLockNumberOfHolidaySchedulesSupportedAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.DoorLockCluster) cluster)
                  .readNumberOfHolidaySchedulesSupportedAttribute(
                      (ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readDoorLockNumberOfHolidaySchedulesSupportedCommandParams);
    result.put(
        "readNumberOfHolidaySchedulesSupportedAttribute",
        readDoorLockNumberOfHolidaySchedulesSupportedAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readDoorLockMaxPINCodeLengthCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readDoorLockMaxPINCodeLengthAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.DoorLockCluster) cluster)
                  .readMaxPINCodeLengthAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readDoorLockMaxPINCodeLengthCommandParams);
    result.put(
        "readMaxPINCodeLengthAttribute", readDoorLockMaxPINCodeLengthAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readDoorLockMinPINCodeLengthCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readDoorLockMinPINCodeLengthAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.DoorLockCluster) cluster)
                  .readMinPINCodeLengthAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readDoorLockMinPINCodeLengthCommandParams);
    result.put(
        "readMinPINCodeLengthAttribute", readDoorLockMinPINCodeLengthAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readDoorLockMaxRFIDCodeLengthCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readDoorLockMaxRFIDCodeLengthAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.DoorLockCluster) cluster)
                  .readMaxRFIDCodeLengthAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readDoorLockMaxRFIDCodeLengthCommandParams);
    result.put(
        "readMaxRFIDCodeLengthAttribute", readDoorLockMaxRFIDCodeLengthAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readDoorLockMinRFIDCodeLengthCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readDoorLockMinRFIDCodeLengthAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.DoorLockCluster) cluster)
                  .readMinRFIDCodeLengthAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readDoorLockMinRFIDCodeLengthCommandParams);
    result.put(
        "readMinRFIDCodeLengthAttribute", readDoorLockMinRFIDCodeLengthAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readDoorLockCredentialRulesSupportCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readDoorLockCredentialRulesSupportAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.DoorLockCluster) cluster)
                  .readCredentialRulesSupportAttribute(
                      (ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readDoorLockCredentialRulesSupportCommandParams);
    result.put(
        "readCredentialRulesSupportAttribute",
        readDoorLockCredentialRulesSupportAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readDoorLockNumberOfCredentialsSupportedPerUserCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readDoorLockNumberOfCredentialsSupportedPerUserAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.DoorLockCluster) cluster)
                  .readNumberOfCredentialsSupportedPerUserAttribute(
                      (ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readDoorLockNumberOfCredentialsSupportedPerUserCommandParams);
    result.put(
        "readNumberOfCredentialsSupportedPerUserAttribute",
        readDoorLockNumberOfCredentialsSupportedPerUserAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readDoorLockLanguageCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readDoorLockLanguageAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.DoorLockCluster) cluster)
                  .readLanguageAttribute((ChipClusters.CharStringAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedCharStringAttributeCallback(),
            readDoorLockLanguageCommandParams);
    result.put("readLanguageAttribute", readDoorLockLanguageAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readDoorLockLEDSettingsCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readDoorLockLEDSettingsAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.DoorLockCluster) cluster)
                  .readLEDSettingsAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readDoorLockLEDSettingsCommandParams);
    result.put("readLEDSettingsAttribute", readDoorLockLEDSettingsAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readDoorLockAutoRelockTimeCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readDoorLockAutoRelockTimeAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.DoorLockCluster) cluster)
                  .readAutoRelockTimeAttribute((ChipClusters.LongAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedLongAttributeCallback(),
            readDoorLockAutoRelockTimeCommandParams);
    result.put("readAutoRelockTimeAttribute", readDoorLockAutoRelockTimeAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readDoorLockSoundVolumeCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readDoorLockSoundVolumeAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.DoorLockCluster) cluster)
                  .readSoundVolumeAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readDoorLockSoundVolumeCommandParams);
    result.put("readSoundVolumeAttribute", readDoorLockSoundVolumeAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readDoorLockOperatingModeCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readDoorLockOperatingModeAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.DoorLockCluster) cluster)
                  .readOperatingModeAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readDoorLockOperatingModeCommandParams);
    result.put("readOperatingModeAttribute", readDoorLockOperatingModeAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readDoorLockSupportedOperatingModesCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readDoorLockSupportedOperatingModesAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.DoorLockCluster) cluster)
                  .readSupportedOperatingModesAttribute(
                      (ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readDoorLockSupportedOperatingModesCommandParams);
    result.put(
        "readSupportedOperatingModesAttribute",
        readDoorLockSupportedOperatingModesAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readDoorLockDefaultConfigurationRegisterCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readDoorLockDefaultConfigurationRegisterAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.DoorLockCluster) cluster)
                  .readDefaultConfigurationRegisterAttribute(
                      (ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readDoorLockDefaultConfigurationRegisterCommandParams);
    result.put(
        "readDefaultConfigurationRegisterAttribute",
        readDoorLockDefaultConfigurationRegisterAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readDoorLockEnableLocalProgrammingCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readDoorLockEnableLocalProgrammingAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.DoorLockCluster) cluster)
                  .readEnableLocalProgrammingAttribute(
                      (ChipClusters.BooleanAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedBooleanAttributeCallback(),
            readDoorLockEnableLocalProgrammingCommandParams);
    result.put(
        "readEnableLocalProgrammingAttribute",
        readDoorLockEnableLocalProgrammingAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readDoorLockEnableOneTouchLockingCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readDoorLockEnableOneTouchLockingAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.DoorLockCluster) cluster)
                  .readEnableOneTouchLockingAttribute(
                      (ChipClusters.BooleanAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedBooleanAttributeCallback(),
            readDoorLockEnableOneTouchLockingCommandParams);
    result.put(
        "readEnableOneTouchLockingAttribute",
        readDoorLockEnableOneTouchLockingAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readDoorLockEnableInsideStatusLEDCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readDoorLockEnableInsideStatusLEDAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.DoorLockCluster) cluster)
                  .readEnableInsideStatusLEDAttribute(
                      (ChipClusters.BooleanAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedBooleanAttributeCallback(),
            readDoorLockEnableInsideStatusLEDCommandParams);
    result.put(
        "readEnableInsideStatusLEDAttribute",
        readDoorLockEnableInsideStatusLEDAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readDoorLockEnablePrivacyModeButtonCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readDoorLockEnablePrivacyModeButtonAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.DoorLockCluster) cluster)
                  .readEnablePrivacyModeButtonAttribute(
                      (ChipClusters.BooleanAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedBooleanAttributeCallback(),
            readDoorLockEnablePrivacyModeButtonCommandParams);
    result.put(
        "readEnablePrivacyModeButtonAttribute",
        readDoorLockEnablePrivacyModeButtonAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readDoorLockLocalProgrammingFeaturesCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readDoorLockLocalProgrammingFeaturesAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.DoorLockCluster) cluster)
                  .readLocalProgrammingFeaturesAttribute(
                      (ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readDoorLockLocalProgrammingFeaturesCommandParams);
    result.put(
        "readLocalProgrammingFeaturesAttribute",
        readDoorLockLocalProgrammingFeaturesAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readDoorLockWrongCodeEntryLimitCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readDoorLockWrongCodeEntryLimitAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.DoorLockCluster) cluster)
                  .readWrongCodeEntryLimitAttribute(
                      (ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readDoorLockWrongCodeEntryLimitCommandParams);
    result.put(
        "readWrongCodeEntryLimitAttribute",
        readDoorLockWrongCodeEntryLimitAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readDoorLockUserCodeTemporaryDisableTimeCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readDoorLockUserCodeTemporaryDisableTimeAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.DoorLockCluster) cluster)
                  .readUserCodeTemporaryDisableTimeAttribute(
                      (ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readDoorLockUserCodeTemporaryDisableTimeCommandParams);
    result.put(
        "readUserCodeTemporaryDisableTimeAttribute",
        readDoorLockUserCodeTemporaryDisableTimeAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readDoorLockSendPINOverTheAirCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readDoorLockSendPINOverTheAirAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.DoorLockCluster) cluster)
                  .readSendPINOverTheAirAttribute((ChipClusters.BooleanAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedBooleanAttributeCallback(),
            readDoorLockSendPINOverTheAirCommandParams);
    result.put(
        "readSendPINOverTheAirAttribute", readDoorLockSendPINOverTheAirAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readDoorLockRequirePINforRemoteOperationCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readDoorLockRequirePINforRemoteOperationAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.DoorLockCluster) cluster)
                  .readRequirePINforRemoteOperationAttribute(
                      (ChipClusters.BooleanAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedBooleanAttributeCallback(),
            readDoorLockRequirePINforRemoteOperationCommandParams);
    result.put(
        "readRequirePINforRemoteOperationAttribute",
        readDoorLockRequirePINforRemoteOperationAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readDoorLockExpiringUserTimeoutCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readDoorLockExpiringUserTimeoutAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.DoorLockCluster) cluster)
                  .readExpiringUserTimeoutAttribute(
                      (ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readDoorLockExpiringUserTimeoutCommandParams);
    result.put(
        "readExpiringUserTimeoutAttribute",
        readDoorLockExpiringUserTimeoutAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readDoorLockGeneratedCommandListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readDoorLockGeneratedCommandListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.DoorLockCluster) cluster)
                  .readGeneratedCommandListAttribute(
                      (ChipClusters.DoorLockCluster.GeneratedCommandListAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedDoorLockClusterGeneratedCommandListAttributeCallback(),
            readDoorLockGeneratedCommandListCommandParams);
    result.put(
        "readGeneratedCommandListAttribute",
        readDoorLockGeneratedCommandListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readDoorLockAcceptedCommandListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readDoorLockAcceptedCommandListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.DoorLockCluster) cluster)
                  .readAcceptedCommandListAttribute(
                      (ChipClusters.DoorLockCluster.AcceptedCommandListAttributeCallback) callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedDoorLockClusterAcceptedCommandListAttributeCallback(),
            readDoorLockAcceptedCommandListCommandParams);
    result.put(
        "readAcceptedCommandListAttribute",
        readDoorLockAcceptedCommandListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readDoorLockEventListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readDoorLockEventListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.DoorLockCluster) cluster)
                  .readEventListAttribute(
                      (ChipClusters.DoorLockCluster.EventListAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedDoorLockClusterEventListAttributeCallback(),
            readDoorLockEventListCommandParams);
    result.put("readEventListAttribute", readDoorLockEventListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readDoorLockAttributeListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readDoorLockAttributeListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.DoorLockCluster) cluster)
                  .readAttributeListAttribute(
                      (ChipClusters.DoorLockCluster.AttributeListAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedDoorLockClusterAttributeListAttributeCallback(),
            readDoorLockAttributeListCommandParams);
    result.put("readAttributeListAttribute", readDoorLockAttributeListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readDoorLockFeatureMapCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readDoorLockFeatureMapAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.DoorLockCluster) cluster)
                  .readFeatureMapAttribute((ChipClusters.LongAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedLongAttributeCallback(),
            readDoorLockFeatureMapCommandParams);
    result.put("readFeatureMapAttribute", readDoorLockFeatureMapAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readDoorLockClusterRevisionCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readDoorLockClusterRevisionAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.DoorLockCluster) cluster)
                  .readClusterRevisionAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readDoorLockClusterRevisionCommandParams);
    result.put("readClusterRevisionAttribute", readDoorLockClusterRevisionAttributeInteractionInfo);

    return result;
  }

  private static Map<String, InteractionInfo> readWindowCoveringInteractionInfo() {
    Map<String, InteractionInfo> result = new LinkedHashMap<>();
    Map<String, CommandParameterInfo> readWindowCoveringTypeCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readWindowCoveringTypeAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.WindowCoveringCluster) cluster)
                  .readTypeAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readWindowCoveringTypeCommandParams);
    result.put("readTypeAttribute", readWindowCoveringTypeAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readWindowCoveringPhysicalClosedLimitLiftCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readWindowCoveringPhysicalClosedLimitLiftAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.WindowCoveringCluster) cluster)
                  .readPhysicalClosedLimitLiftAttribute(
                      (ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readWindowCoveringPhysicalClosedLimitLiftCommandParams);
    result.put(
        "readPhysicalClosedLimitLiftAttribute",
        readWindowCoveringPhysicalClosedLimitLiftAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readWindowCoveringPhysicalClosedLimitTiltCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readWindowCoveringPhysicalClosedLimitTiltAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.WindowCoveringCluster) cluster)
                  .readPhysicalClosedLimitTiltAttribute(
                      (ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readWindowCoveringPhysicalClosedLimitTiltCommandParams);
    result.put(
        "readPhysicalClosedLimitTiltAttribute",
        readWindowCoveringPhysicalClosedLimitTiltAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readWindowCoveringCurrentPositionLiftCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readWindowCoveringCurrentPositionLiftAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.WindowCoveringCluster) cluster)
                  .readCurrentPositionLiftAttribute(
                      (ChipClusters.WindowCoveringCluster.CurrentPositionLiftAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedWindowCoveringClusterCurrentPositionLiftAttributeCallback(),
            readWindowCoveringCurrentPositionLiftCommandParams);
    result.put(
        "readCurrentPositionLiftAttribute",
        readWindowCoveringCurrentPositionLiftAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readWindowCoveringCurrentPositionTiltCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readWindowCoveringCurrentPositionTiltAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.WindowCoveringCluster) cluster)
                  .readCurrentPositionTiltAttribute(
                      (ChipClusters.WindowCoveringCluster.CurrentPositionTiltAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedWindowCoveringClusterCurrentPositionTiltAttributeCallback(),
            readWindowCoveringCurrentPositionTiltCommandParams);
    result.put(
        "readCurrentPositionTiltAttribute",
        readWindowCoveringCurrentPositionTiltAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readWindowCoveringNumberOfActuationsLiftCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readWindowCoveringNumberOfActuationsLiftAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.WindowCoveringCluster) cluster)
                  .readNumberOfActuationsLiftAttribute(
                      (ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readWindowCoveringNumberOfActuationsLiftCommandParams);
    result.put(
        "readNumberOfActuationsLiftAttribute",
        readWindowCoveringNumberOfActuationsLiftAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readWindowCoveringNumberOfActuationsTiltCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readWindowCoveringNumberOfActuationsTiltAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.WindowCoveringCluster) cluster)
                  .readNumberOfActuationsTiltAttribute(
                      (ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readWindowCoveringNumberOfActuationsTiltCommandParams);
    result.put(
        "readNumberOfActuationsTiltAttribute",
        readWindowCoveringNumberOfActuationsTiltAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readWindowCoveringConfigStatusCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readWindowCoveringConfigStatusAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.WindowCoveringCluster) cluster)
                  .readConfigStatusAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readWindowCoveringConfigStatusCommandParams);
    result.put("readConfigStatusAttribute", readWindowCoveringConfigStatusAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readWindowCoveringCurrentPositionLiftPercentageCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readWindowCoveringCurrentPositionLiftPercentageAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.WindowCoveringCluster) cluster)
                  .readCurrentPositionLiftPercentageAttribute(
                      (ChipClusters.WindowCoveringCluster
                              .CurrentPositionLiftPercentageAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedWindowCoveringClusterCurrentPositionLiftPercentageAttributeCallback(),
            readWindowCoveringCurrentPositionLiftPercentageCommandParams);
    result.put(
        "readCurrentPositionLiftPercentageAttribute",
        readWindowCoveringCurrentPositionLiftPercentageAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readWindowCoveringCurrentPositionTiltPercentageCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readWindowCoveringCurrentPositionTiltPercentageAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.WindowCoveringCluster) cluster)
                  .readCurrentPositionTiltPercentageAttribute(
                      (ChipClusters.WindowCoveringCluster
                              .CurrentPositionTiltPercentageAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedWindowCoveringClusterCurrentPositionTiltPercentageAttributeCallback(),
            readWindowCoveringCurrentPositionTiltPercentageCommandParams);
    result.put(
        "readCurrentPositionTiltPercentageAttribute",
        readWindowCoveringCurrentPositionTiltPercentageAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readWindowCoveringOperationalStatusCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readWindowCoveringOperationalStatusAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.WindowCoveringCluster) cluster)
                  .readOperationalStatusAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readWindowCoveringOperationalStatusCommandParams);
    result.put(
        "readOperationalStatusAttribute",
        readWindowCoveringOperationalStatusAttributeInteractionInfo);
    Map<String, CommandParameterInfo>
        readWindowCoveringTargetPositionLiftPercent100thsCommandParams =
            new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readWindowCoveringTargetPositionLiftPercent100thsAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.WindowCoveringCluster) cluster)
                  .readTargetPositionLiftPercent100thsAttribute(
                      (ChipClusters.WindowCoveringCluster
                              .TargetPositionLiftPercent100thsAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedWindowCoveringClusterTargetPositionLiftPercent100thsAttributeCallback(),
            readWindowCoveringTargetPositionLiftPercent100thsCommandParams);
    result.put(
        "readTargetPositionLiftPercent100thsAttribute",
        readWindowCoveringTargetPositionLiftPercent100thsAttributeInteractionInfo);
    Map<String, CommandParameterInfo>
        readWindowCoveringTargetPositionTiltPercent100thsCommandParams =
            new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readWindowCoveringTargetPositionTiltPercent100thsAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.WindowCoveringCluster) cluster)
                  .readTargetPositionTiltPercent100thsAttribute(
                      (ChipClusters.WindowCoveringCluster
                              .TargetPositionTiltPercent100thsAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedWindowCoveringClusterTargetPositionTiltPercent100thsAttributeCallback(),
            readWindowCoveringTargetPositionTiltPercent100thsCommandParams);
    result.put(
        "readTargetPositionTiltPercent100thsAttribute",
        readWindowCoveringTargetPositionTiltPercent100thsAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readWindowCoveringEndProductTypeCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readWindowCoveringEndProductTypeAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.WindowCoveringCluster) cluster)
                  .readEndProductTypeAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readWindowCoveringEndProductTypeCommandParams);
    result.put(
        "readEndProductTypeAttribute", readWindowCoveringEndProductTypeAttributeInteractionInfo);
    Map<String, CommandParameterInfo>
        readWindowCoveringCurrentPositionLiftPercent100thsCommandParams =
            new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readWindowCoveringCurrentPositionLiftPercent100thsAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.WindowCoveringCluster) cluster)
                  .readCurrentPositionLiftPercent100thsAttribute(
                      (ChipClusters.WindowCoveringCluster
                              .CurrentPositionLiftPercent100thsAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedWindowCoveringClusterCurrentPositionLiftPercent100thsAttributeCallback(),
            readWindowCoveringCurrentPositionLiftPercent100thsCommandParams);
    result.put(
        "readCurrentPositionLiftPercent100thsAttribute",
        readWindowCoveringCurrentPositionLiftPercent100thsAttributeInteractionInfo);
    Map<String, CommandParameterInfo>
        readWindowCoveringCurrentPositionTiltPercent100thsCommandParams =
            new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readWindowCoveringCurrentPositionTiltPercent100thsAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.WindowCoveringCluster) cluster)
                  .readCurrentPositionTiltPercent100thsAttribute(
                      (ChipClusters.WindowCoveringCluster
                              .CurrentPositionTiltPercent100thsAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedWindowCoveringClusterCurrentPositionTiltPercent100thsAttributeCallback(),
            readWindowCoveringCurrentPositionTiltPercent100thsCommandParams);
    result.put(
        "readCurrentPositionTiltPercent100thsAttribute",
        readWindowCoveringCurrentPositionTiltPercent100thsAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readWindowCoveringInstalledOpenLimitLiftCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readWindowCoveringInstalledOpenLimitLiftAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.WindowCoveringCluster) cluster)
                  .readInstalledOpenLimitLiftAttribute(
                      (ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readWindowCoveringInstalledOpenLimitLiftCommandParams);
    result.put(
        "readInstalledOpenLimitLiftAttribute",
        readWindowCoveringInstalledOpenLimitLiftAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readWindowCoveringInstalledClosedLimitLiftCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readWindowCoveringInstalledClosedLimitLiftAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.WindowCoveringCluster) cluster)
                  .readInstalledClosedLimitLiftAttribute(
                      (ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readWindowCoveringInstalledClosedLimitLiftCommandParams);
    result.put(
        "readInstalledClosedLimitLiftAttribute",
        readWindowCoveringInstalledClosedLimitLiftAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readWindowCoveringInstalledOpenLimitTiltCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readWindowCoveringInstalledOpenLimitTiltAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.WindowCoveringCluster) cluster)
                  .readInstalledOpenLimitTiltAttribute(
                      (ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readWindowCoveringInstalledOpenLimitTiltCommandParams);
    result.put(
        "readInstalledOpenLimitTiltAttribute",
        readWindowCoveringInstalledOpenLimitTiltAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readWindowCoveringInstalledClosedLimitTiltCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readWindowCoveringInstalledClosedLimitTiltAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.WindowCoveringCluster) cluster)
                  .readInstalledClosedLimitTiltAttribute(
                      (ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readWindowCoveringInstalledClosedLimitTiltCommandParams);
    result.put(
        "readInstalledClosedLimitTiltAttribute",
        readWindowCoveringInstalledClosedLimitTiltAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readWindowCoveringModeCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readWindowCoveringModeAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.WindowCoveringCluster) cluster)
                  .readModeAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readWindowCoveringModeCommandParams);
    result.put("readModeAttribute", readWindowCoveringModeAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readWindowCoveringSafetyStatusCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readWindowCoveringSafetyStatusAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.WindowCoveringCluster) cluster)
                  .readSafetyStatusAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readWindowCoveringSafetyStatusCommandParams);
    result.put("readSafetyStatusAttribute", readWindowCoveringSafetyStatusAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readWindowCoveringGeneratedCommandListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readWindowCoveringGeneratedCommandListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.WindowCoveringCluster) cluster)
                  .readGeneratedCommandListAttribute(
                      (ChipClusters.WindowCoveringCluster.GeneratedCommandListAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedWindowCoveringClusterGeneratedCommandListAttributeCallback(),
            readWindowCoveringGeneratedCommandListCommandParams);
    result.put(
        "readGeneratedCommandListAttribute",
        readWindowCoveringGeneratedCommandListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readWindowCoveringAcceptedCommandListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readWindowCoveringAcceptedCommandListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.WindowCoveringCluster) cluster)
                  .readAcceptedCommandListAttribute(
                      (ChipClusters.WindowCoveringCluster.AcceptedCommandListAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedWindowCoveringClusterAcceptedCommandListAttributeCallback(),
            readWindowCoveringAcceptedCommandListCommandParams);
    result.put(
        "readAcceptedCommandListAttribute",
        readWindowCoveringAcceptedCommandListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readWindowCoveringEventListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readWindowCoveringEventListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.WindowCoveringCluster) cluster)
                  .readEventListAttribute(
                      (ChipClusters.WindowCoveringCluster.EventListAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedWindowCoveringClusterEventListAttributeCallback(),
            readWindowCoveringEventListCommandParams);
    result.put("readEventListAttribute", readWindowCoveringEventListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readWindowCoveringAttributeListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readWindowCoveringAttributeListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.WindowCoveringCluster) cluster)
                  .readAttributeListAttribute(
                      (ChipClusters.WindowCoveringCluster.AttributeListAttributeCallback) callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedWindowCoveringClusterAttributeListAttributeCallback(),
            readWindowCoveringAttributeListCommandParams);
    result.put(
        "readAttributeListAttribute", readWindowCoveringAttributeListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readWindowCoveringFeatureMapCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readWindowCoveringFeatureMapAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.WindowCoveringCluster) cluster)
                  .readFeatureMapAttribute((ChipClusters.LongAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedLongAttributeCallback(),
            readWindowCoveringFeatureMapCommandParams);
    result.put("readFeatureMapAttribute", readWindowCoveringFeatureMapAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readWindowCoveringClusterRevisionCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readWindowCoveringClusterRevisionAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.WindowCoveringCluster) cluster)
                  .readClusterRevisionAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readWindowCoveringClusterRevisionCommandParams);
    result.put(
        "readClusterRevisionAttribute", readWindowCoveringClusterRevisionAttributeInteractionInfo);

    return result;
  }

  private static Map<String, InteractionInfo> readBarrierControlInteractionInfo() {
    Map<String, InteractionInfo> result = new LinkedHashMap<>();
    Map<String, CommandParameterInfo> readBarrierControlBarrierMovingStateCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readBarrierControlBarrierMovingStateAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.BarrierControlCluster) cluster)
                  .readBarrierMovingStateAttribute(
                      (ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readBarrierControlBarrierMovingStateCommandParams);
    result.put(
        "readBarrierMovingStateAttribute",
        readBarrierControlBarrierMovingStateAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readBarrierControlBarrierSafetyStatusCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readBarrierControlBarrierSafetyStatusAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.BarrierControlCluster) cluster)
                  .readBarrierSafetyStatusAttribute(
                      (ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readBarrierControlBarrierSafetyStatusCommandParams);
    result.put(
        "readBarrierSafetyStatusAttribute",
        readBarrierControlBarrierSafetyStatusAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readBarrierControlBarrierCapabilitiesCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readBarrierControlBarrierCapabilitiesAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.BarrierControlCluster) cluster)
                  .readBarrierCapabilitiesAttribute(
                      (ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readBarrierControlBarrierCapabilitiesCommandParams);
    result.put(
        "readBarrierCapabilitiesAttribute",
        readBarrierControlBarrierCapabilitiesAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readBarrierControlBarrierOpenEventsCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readBarrierControlBarrierOpenEventsAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.BarrierControlCluster) cluster)
                  .readBarrierOpenEventsAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readBarrierControlBarrierOpenEventsCommandParams);
    result.put(
        "readBarrierOpenEventsAttribute",
        readBarrierControlBarrierOpenEventsAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readBarrierControlBarrierCloseEventsCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readBarrierControlBarrierCloseEventsAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.BarrierControlCluster) cluster)
                  .readBarrierCloseEventsAttribute(
                      (ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readBarrierControlBarrierCloseEventsCommandParams);
    result.put(
        "readBarrierCloseEventsAttribute",
        readBarrierControlBarrierCloseEventsAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readBarrierControlBarrierCommandOpenEventsCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readBarrierControlBarrierCommandOpenEventsAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.BarrierControlCluster) cluster)
                  .readBarrierCommandOpenEventsAttribute(
                      (ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readBarrierControlBarrierCommandOpenEventsCommandParams);
    result.put(
        "readBarrierCommandOpenEventsAttribute",
        readBarrierControlBarrierCommandOpenEventsAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readBarrierControlBarrierCommandCloseEventsCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readBarrierControlBarrierCommandCloseEventsAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.BarrierControlCluster) cluster)
                  .readBarrierCommandCloseEventsAttribute(
                      (ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readBarrierControlBarrierCommandCloseEventsCommandParams);
    result.put(
        "readBarrierCommandCloseEventsAttribute",
        readBarrierControlBarrierCommandCloseEventsAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readBarrierControlBarrierOpenPeriodCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readBarrierControlBarrierOpenPeriodAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.BarrierControlCluster) cluster)
                  .readBarrierOpenPeriodAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readBarrierControlBarrierOpenPeriodCommandParams);
    result.put(
        "readBarrierOpenPeriodAttribute",
        readBarrierControlBarrierOpenPeriodAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readBarrierControlBarrierClosePeriodCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readBarrierControlBarrierClosePeriodAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.BarrierControlCluster) cluster)
                  .readBarrierClosePeriodAttribute(
                      (ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readBarrierControlBarrierClosePeriodCommandParams);
    result.put(
        "readBarrierClosePeriodAttribute",
        readBarrierControlBarrierClosePeriodAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readBarrierControlBarrierPositionCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readBarrierControlBarrierPositionAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.BarrierControlCluster) cluster)
                  .readBarrierPositionAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readBarrierControlBarrierPositionCommandParams);
    result.put(
        "readBarrierPositionAttribute", readBarrierControlBarrierPositionAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readBarrierControlGeneratedCommandListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readBarrierControlGeneratedCommandListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.BarrierControlCluster) cluster)
                  .readGeneratedCommandListAttribute(
                      (ChipClusters.BarrierControlCluster.GeneratedCommandListAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedBarrierControlClusterGeneratedCommandListAttributeCallback(),
            readBarrierControlGeneratedCommandListCommandParams);
    result.put(
        "readGeneratedCommandListAttribute",
        readBarrierControlGeneratedCommandListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readBarrierControlAcceptedCommandListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readBarrierControlAcceptedCommandListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.BarrierControlCluster) cluster)
                  .readAcceptedCommandListAttribute(
                      (ChipClusters.BarrierControlCluster.AcceptedCommandListAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedBarrierControlClusterAcceptedCommandListAttributeCallback(),
            readBarrierControlAcceptedCommandListCommandParams);
    result.put(
        "readAcceptedCommandListAttribute",
        readBarrierControlAcceptedCommandListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readBarrierControlEventListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readBarrierControlEventListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.BarrierControlCluster) cluster)
                  .readEventListAttribute(
                      (ChipClusters.BarrierControlCluster.EventListAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedBarrierControlClusterEventListAttributeCallback(),
            readBarrierControlEventListCommandParams);
    result.put("readEventListAttribute", readBarrierControlEventListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readBarrierControlAttributeListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readBarrierControlAttributeListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.BarrierControlCluster) cluster)
                  .readAttributeListAttribute(
                      (ChipClusters.BarrierControlCluster.AttributeListAttributeCallback) callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedBarrierControlClusterAttributeListAttributeCallback(),
            readBarrierControlAttributeListCommandParams);
    result.put(
        "readAttributeListAttribute", readBarrierControlAttributeListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readBarrierControlFeatureMapCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readBarrierControlFeatureMapAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.BarrierControlCluster) cluster)
                  .readFeatureMapAttribute((ChipClusters.LongAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedLongAttributeCallback(),
            readBarrierControlFeatureMapCommandParams);
    result.put("readFeatureMapAttribute", readBarrierControlFeatureMapAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readBarrierControlClusterRevisionCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readBarrierControlClusterRevisionAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.BarrierControlCluster) cluster)
                  .readClusterRevisionAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readBarrierControlClusterRevisionCommandParams);
    result.put(
        "readClusterRevisionAttribute", readBarrierControlClusterRevisionAttributeInteractionInfo);

    return result;
  }

  private static Map<String, InteractionInfo> readPumpConfigurationAndControlInteractionInfo() {
    Map<String, InteractionInfo> result = new LinkedHashMap<>();
    Map<String, CommandParameterInfo> readPumpConfigurationAndControlMaxPressureCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readPumpConfigurationAndControlMaxPressureAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.PumpConfigurationAndControlCluster) cluster)
                  .readMaxPressureAttribute(
                      (ChipClusters.PumpConfigurationAndControlCluster.MaxPressureAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedPumpConfigurationAndControlClusterMaxPressureAttributeCallback(),
            readPumpConfigurationAndControlMaxPressureCommandParams);
    result.put(
        "readMaxPressureAttribute",
        readPumpConfigurationAndControlMaxPressureAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readPumpConfigurationAndControlMaxSpeedCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readPumpConfigurationAndControlMaxSpeedAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.PumpConfigurationAndControlCluster) cluster)
                  .readMaxSpeedAttribute(
                      (ChipClusters.PumpConfigurationAndControlCluster.MaxSpeedAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedPumpConfigurationAndControlClusterMaxSpeedAttributeCallback(),
            readPumpConfigurationAndControlMaxSpeedCommandParams);
    result.put(
        "readMaxSpeedAttribute", readPumpConfigurationAndControlMaxSpeedAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readPumpConfigurationAndControlMaxFlowCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readPumpConfigurationAndControlMaxFlowAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.PumpConfigurationAndControlCluster) cluster)
                  .readMaxFlowAttribute(
                      (ChipClusters.PumpConfigurationAndControlCluster.MaxFlowAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedPumpConfigurationAndControlClusterMaxFlowAttributeCallback(),
            readPumpConfigurationAndControlMaxFlowCommandParams);
    result.put(
        "readMaxFlowAttribute", readPumpConfigurationAndControlMaxFlowAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readPumpConfigurationAndControlMinConstPressureCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readPumpConfigurationAndControlMinConstPressureAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.PumpConfigurationAndControlCluster) cluster)
                  .readMinConstPressureAttribute(
                      (ChipClusters.PumpConfigurationAndControlCluster
                              .MinConstPressureAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedPumpConfigurationAndControlClusterMinConstPressureAttributeCallback(),
            readPumpConfigurationAndControlMinConstPressureCommandParams);
    result.put(
        "readMinConstPressureAttribute",
        readPumpConfigurationAndControlMinConstPressureAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readPumpConfigurationAndControlMaxConstPressureCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readPumpConfigurationAndControlMaxConstPressureAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.PumpConfigurationAndControlCluster) cluster)
                  .readMaxConstPressureAttribute(
                      (ChipClusters.PumpConfigurationAndControlCluster
                              .MaxConstPressureAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedPumpConfigurationAndControlClusterMaxConstPressureAttributeCallback(),
            readPumpConfigurationAndControlMaxConstPressureCommandParams);
    result.put(
        "readMaxConstPressureAttribute",
        readPumpConfigurationAndControlMaxConstPressureAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readPumpConfigurationAndControlMinCompPressureCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readPumpConfigurationAndControlMinCompPressureAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.PumpConfigurationAndControlCluster) cluster)
                  .readMinCompPressureAttribute(
                      (ChipClusters.PumpConfigurationAndControlCluster
                              .MinCompPressureAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedPumpConfigurationAndControlClusterMinCompPressureAttributeCallback(),
            readPumpConfigurationAndControlMinCompPressureCommandParams);
    result.put(
        "readMinCompPressureAttribute",
        readPumpConfigurationAndControlMinCompPressureAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readPumpConfigurationAndControlMaxCompPressureCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readPumpConfigurationAndControlMaxCompPressureAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.PumpConfigurationAndControlCluster) cluster)
                  .readMaxCompPressureAttribute(
                      (ChipClusters.PumpConfigurationAndControlCluster
                              .MaxCompPressureAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedPumpConfigurationAndControlClusterMaxCompPressureAttributeCallback(),
            readPumpConfigurationAndControlMaxCompPressureCommandParams);
    result.put(
        "readMaxCompPressureAttribute",
        readPumpConfigurationAndControlMaxCompPressureAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readPumpConfigurationAndControlMinConstSpeedCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readPumpConfigurationAndControlMinConstSpeedAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.PumpConfigurationAndControlCluster) cluster)
                  .readMinConstSpeedAttribute(
                      (ChipClusters.PumpConfigurationAndControlCluster
                              .MinConstSpeedAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedPumpConfigurationAndControlClusterMinConstSpeedAttributeCallback(),
            readPumpConfigurationAndControlMinConstSpeedCommandParams);
    result.put(
        "readMinConstSpeedAttribute",
        readPumpConfigurationAndControlMinConstSpeedAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readPumpConfigurationAndControlMaxConstSpeedCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readPumpConfigurationAndControlMaxConstSpeedAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.PumpConfigurationAndControlCluster) cluster)
                  .readMaxConstSpeedAttribute(
                      (ChipClusters.PumpConfigurationAndControlCluster
                              .MaxConstSpeedAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedPumpConfigurationAndControlClusterMaxConstSpeedAttributeCallback(),
            readPumpConfigurationAndControlMaxConstSpeedCommandParams);
    result.put(
        "readMaxConstSpeedAttribute",
        readPumpConfigurationAndControlMaxConstSpeedAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readPumpConfigurationAndControlMinConstFlowCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readPumpConfigurationAndControlMinConstFlowAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.PumpConfigurationAndControlCluster) cluster)
                  .readMinConstFlowAttribute(
                      (ChipClusters.PumpConfigurationAndControlCluster
                              .MinConstFlowAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedPumpConfigurationAndControlClusterMinConstFlowAttributeCallback(),
            readPumpConfigurationAndControlMinConstFlowCommandParams);
    result.put(
        "readMinConstFlowAttribute",
        readPumpConfigurationAndControlMinConstFlowAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readPumpConfigurationAndControlMaxConstFlowCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readPumpConfigurationAndControlMaxConstFlowAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.PumpConfigurationAndControlCluster) cluster)
                  .readMaxConstFlowAttribute(
                      (ChipClusters.PumpConfigurationAndControlCluster
                              .MaxConstFlowAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedPumpConfigurationAndControlClusterMaxConstFlowAttributeCallback(),
            readPumpConfigurationAndControlMaxConstFlowCommandParams);
    result.put(
        "readMaxConstFlowAttribute",
        readPumpConfigurationAndControlMaxConstFlowAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readPumpConfigurationAndControlMinConstTempCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readPumpConfigurationAndControlMinConstTempAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.PumpConfigurationAndControlCluster) cluster)
                  .readMinConstTempAttribute(
                      (ChipClusters.PumpConfigurationAndControlCluster
                              .MinConstTempAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedPumpConfigurationAndControlClusterMinConstTempAttributeCallback(),
            readPumpConfigurationAndControlMinConstTempCommandParams);
    result.put(
        "readMinConstTempAttribute",
        readPumpConfigurationAndControlMinConstTempAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readPumpConfigurationAndControlMaxConstTempCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readPumpConfigurationAndControlMaxConstTempAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.PumpConfigurationAndControlCluster) cluster)
                  .readMaxConstTempAttribute(
                      (ChipClusters.PumpConfigurationAndControlCluster
                              .MaxConstTempAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedPumpConfigurationAndControlClusterMaxConstTempAttributeCallback(),
            readPumpConfigurationAndControlMaxConstTempCommandParams);
    result.put(
        "readMaxConstTempAttribute",
        readPumpConfigurationAndControlMaxConstTempAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readPumpConfigurationAndControlPumpStatusCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readPumpConfigurationAndControlPumpStatusAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.PumpConfigurationAndControlCluster) cluster)
                  .readPumpStatusAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readPumpConfigurationAndControlPumpStatusCommandParams);
    result.put(
        "readPumpStatusAttribute",
        readPumpConfigurationAndControlPumpStatusAttributeInteractionInfo);
    Map<String, CommandParameterInfo>
        readPumpConfigurationAndControlEffectiveOperationModeCommandParams =
            new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readPumpConfigurationAndControlEffectiveOperationModeAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.PumpConfigurationAndControlCluster) cluster)
                  .readEffectiveOperationModeAttribute(
                      (ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readPumpConfigurationAndControlEffectiveOperationModeCommandParams);
    result.put(
        "readEffectiveOperationModeAttribute",
        readPumpConfigurationAndControlEffectiveOperationModeAttributeInteractionInfo);
    Map<String, CommandParameterInfo>
        readPumpConfigurationAndControlEffectiveControlModeCommandParams =
            new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readPumpConfigurationAndControlEffectiveControlModeAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.PumpConfigurationAndControlCluster) cluster)
                  .readEffectiveControlModeAttribute(
                      (ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readPumpConfigurationAndControlEffectiveControlModeCommandParams);
    result.put(
        "readEffectiveControlModeAttribute",
        readPumpConfigurationAndControlEffectiveControlModeAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readPumpConfigurationAndControlCapacityCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readPumpConfigurationAndControlCapacityAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.PumpConfigurationAndControlCluster) cluster)
                  .readCapacityAttribute(
                      (ChipClusters.PumpConfigurationAndControlCluster.CapacityAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedPumpConfigurationAndControlClusterCapacityAttributeCallback(),
            readPumpConfigurationAndControlCapacityCommandParams);
    result.put(
        "readCapacityAttribute", readPumpConfigurationAndControlCapacityAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readPumpConfigurationAndControlSpeedCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readPumpConfigurationAndControlSpeedAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.PumpConfigurationAndControlCluster) cluster)
                  .readSpeedAttribute(
                      (ChipClusters.PumpConfigurationAndControlCluster.SpeedAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedPumpConfigurationAndControlClusterSpeedAttributeCallback(),
            readPumpConfigurationAndControlSpeedCommandParams);
    result.put("readSpeedAttribute", readPumpConfigurationAndControlSpeedAttributeInteractionInfo);
    Map<String, CommandParameterInfo>
        readPumpConfigurationAndControlLifetimeRunningHoursCommandParams =
            new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readPumpConfigurationAndControlLifetimeRunningHoursAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.PumpConfigurationAndControlCluster) cluster)
                  .readLifetimeRunningHoursAttribute(
                      (ChipClusters.PumpConfigurationAndControlCluster
                              .LifetimeRunningHoursAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedPumpConfigurationAndControlClusterLifetimeRunningHoursAttributeCallback(),
            readPumpConfigurationAndControlLifetimeRunningHoursCommandParams);
    result.put(
        "readLifetimeRunningHoursAttribute",
        readPumpConfigurationAndControlLifetimeRunningHoursAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readPumpConfigurationAndControlPowerCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readPumpConfigurationAndControlPowerAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.PumpConfigurationAndControlCluster) cluster)
                  .readPowerAttribute(
                      (ChipClusters.PumpConfigurationAndControlCluster.PowerAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedPumpConfigurationAndControlClusterPowerAttributeCallback(),
            readPumpConfigurationAndControlPowerCommandParams);
    result.put("readPowerAttribute", readPumpConfigurationAndControlPowerAttributeInteractionInfo);
    Map<String, CommandParameterInfo>
        readPumpConfigurationAndControlLifetimeEnergyConsumedCommandParams =
            new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readPumpConfigurationAndControlLifetimeEnergyConsumedAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.PumpConfigurationAndControlCluster) cluster)
                  .readLifetimeEnergyConsumedAttribute(
                      (ChipClusters.PumpConfigurationAndControlCluster
                              .LifetimeEnergyConsumedAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedPumpConfigurationAndControlClusterLifetimeEnergyConsumedAttributeCallback(),
            readPumpConfigurationAndControlLifetimeEnergyConsumedCommandParams);
    result.put(
        "readLifetimeEnergyConsumedAttribute",
        readPumpConfigurationAndControlLifetimeEnergyConsumedAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readPumpConfigurationAndControlOperationModeCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readPumpConfigurationAndControlOperationModeAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.PumpConfigurationAndControlCluster) cluster)
                  .readOperationModeAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readPumpConfigurationAndControlOperationModeCommandParams);
    result.put(
        "readOperationModeAttribute",
        readPumpConfigurationAndControlOperationModeAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readPumpConfigurationAndControlControlModeCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readPumpConfigurationAndControlControlModeAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.PumpConfigurationAndControlCluster) cluster)
                  .readControlModeAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readPumpConfigurationAndControlControlModeCommandParams);
    result.put(
        "readControlModeAttribute",
        readPumpConfigurationAndControlControlModeAttributeInteractionInfo);
    Map<String, CommandParameterInfo>
        readPumpConfigurationAndControlGeneratedCommandListCommandParams =
            new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readPumpConfigurationAndControlGeneratedCommandListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.PumpConfigurationAndControlCluster) cluster)
                  .readGeneratedCommandListAttribute(
                      (ChipClusters.PumpConfigurationAndControlCluster
                              .GeneratedCommandListAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedPumpConfigurationAndControlClusterGeneratedCommandListAttributeCallback(),
            readPumpConfigurationAndControlGeneratedCommandListCommandParams);
    result.put(
        "readGeneratedCommandListAttribute",
        readPumpConfigurationAndControlGeneratedCommandListAttributeInteractionInfo);
    Map<String, CommandParameterInfo>
        readPumpConfigurationAndControlAcceptedCommandListCommandParams =
            new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readPumpConfigurationAndControlAcceptedCommandListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.PumpConfigurationAndControlCluster) cluster)
                  .readAcceptedCommandListAttribute(
                      (ChipClusters.PumpConfigurationAndControlCluster
                              .AcceptedCommandListAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedPumpConfigurationAndControlClusterAcceptedCommandListAttributeCallback(),
            readPumpConfigurationAndControlAcceptedCommandListCommandParams);
    result.put(
        "readAcceptedCommandListAttribute",
        readPumpConfigurationAndControlAcceptedCommandListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readPumpConfigurationAndControlEventListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readPumpConfigurationAndControlEventListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.PumpConfigurationAndControlCluster) cluster)
                  .readEventListAttribute(
                      (ChipClusters.PumpConfigurationAndControlCluster.EventListAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedPumpConfigurationAndControlClusterEventListAttributeCallback(),
            readPumpConfigurationAndControlEventListCommandParams);
    result.put(
        "readEventListAttribute", readPumpConfigurationAndControlEventListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readPumpConfigurationAndControlAttributeListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readPumpConfigurationAndControlAttributeListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.PumpConfigurationAndControlCluster) cluster)
                  .readAttributeListAttribute(
                      (ChipClusters.PumpConfigurationAndControlCluster
                              .AttributeListAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedPumpConfigurationAndControlClusterAttributeListAttributeCallback(),
            readPumpConfigurationAndControlAttributeListCommandParams);
    result.put(
        "readAttributeListAttribute",
        readPumpConfigurationAndControlAttributeListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readPumpConfigurationAndControlFeatureMapCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readPumpConfigurationAndControlFeatureMapAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.PumpConfigurationAndControlCluster) cluster)
                  .readFeatureMapAttribute((ChipClusters.LongAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedLongAttributeCallback(),
            readPumpConfigurationAndControlFeatureMapCommandParams);
    result.put(
        "readFeatureMapAttribute",
        readPumpConfigurationAndControlFeatureMapAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readPumpConfigurationAndControlClusterRevisionCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readPumpConfigurationAndControlClusterRevisionAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.PumpConfigurationAndControlCluster) cluster)
                  .readClusterRevisionAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readPumpConfigurationAndControlClusterRevisionCommandParams);
    result.put(
        "readClusterRevisionAttribute",
        readPumpConfigurationAndControlClusterRevisionAttributeInteractionInfo);

    return result;
  }

  private static Map<String, InteractionInfo> readThermostatInteractionInfo() {
    Map<String, InteractionInfo> result = new LinkedHashMap<>();
    Map<String, CommandParameterInfo> readThermostatLocalTemperatureCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readThermostatLocalTemperatureAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ThermostatCluster) cluster)
                  .readLocalTemperatureAttribute(
                      (ChipClusters.ThermostatCluster.LocalTemperatureAttributeCallback) callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedThermostatClusterLocalTemperatureAttributeCallback(),
            readThermostatLocalTemperatureCommandParams);
    result.put(
        "readLocalTemperatureAttribute", readThermostatLocalTemperatureAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readThermostatOutdoorTemperatureCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readThermostatOutdoorTemperatureAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ThermostatCluster) cluster)
                  .readOutdoorTemperatureAttribute(
                      (ChipClusters.ThermostatCluster.OutdoorTemperatureAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedThermostatClusterOutdoorTemperatureAttributeCallback(),
            readThermostatOutdoorTemperatureCommandParams);
    result.put(
        "readOutdoorTemperatureAttribute",
        readThermostatOutdoorTemperatureAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readThermostatOccupancyCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readThermostatOccupancyAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ThermostatCluster) cluster)
                  .readOccupancyAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readThermostatOccupancyCommandParams);
    result.put("readOccupancyAttribute", readThermostatOccupancyAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readThermostatAbsMinHeatSetpointLimitCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readThermostatAbsMinHeatSetpointLimitAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ThermostatCluster) cluster)
                  .readAbsMinHeatSetpointLimitAttribute(
                      (ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readThermostatAbsMinHeatSetpointLimitCommandParams);
    result.put(
        "readAbsMinHeatSetpointLimitAttribute",
        readThermostatAbsMinHeatSetpointLimitAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readThermostatAbsMaxHeatSetpointLimitCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readThermostatAbsMaxHeatSetpointLimitAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ThermostatCluster) cluster)
                  .readAbsMaxHeatSetpointLimitAttribute(
                      (ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readThermostatAbsMaxHeatSetpointLimitCommandParams);
    result.put(
        "readAbsMaxHeatSetpointLimitAttribute",
        readThermostatAbsMaxHeatSetpointLimitAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readThermostatAbsMinCoolSetpointLimitCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readThermostatAbsMinCoolSetpointLimitAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ThermostatCluster) cluster)
                  .readAbsMinCoolSetpointLimitAttribute(
                      (ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readThermostatAbsMinCoolSetpointLimitCommandParams);
    result.put(
        "readAbsMinCoolSetpointLimitAttribute",
        readThermostatAbsMinCoolSetpointLimitAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readThermostatAbsMaxCoolSetpointLimitCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readThermostatAbsMaxCoolSetpointLimitAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ThermostatCluster) cluster)
                  .readAbsMaxCoolSetpointLimitAttribute(
                      (ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readThermostatAbsMaxCoolSetpointLimitCommandParams);
    result.put(
        "readAbsMaxCoolSetpointLimitAttribute",
        readThermostatAbsMaxCoolSetpointLimitAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readThermostatPICoolingDemandCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readThermostatPICoolingDemandAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ThermostatCluster) cluster)
                  .readPICoolingDemandAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readThermostatPICoolingDemandCommandParams);
    result.put(
        "readPICoolingDemandAttribute", readThermostatPICoolingDemandAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readThermostatPIHeatingDemandCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readThermostatPIHeatingDemandAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ThermostatCluster) cluster)
                  .readPIHeatingDemandAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readThermostatPIHeatingDemandCommandParams);
    result.put(
        "readPIHeatingDemandAttribute", readThermostatPIHeatingDemandAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readThermostatHVACSystemTypeConfigurationCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readThermostatHVACSystemTypeConfigurationAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ThermostatCluster) cluster)
                  .readHVACSystemTypeConfigurationAttribute(
                      (ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readThermostatHVACSystemTypeConfigurationCommandParams);
    result.put(
        "readHVACSystemTypeConfigurationAttribute",
        readThermostatHVACSystemTypeConfigurationAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readThermostatLocalTemperatureCalibrationCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readThermostatLocalTemperatureCalibrationAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ThermostatCluster) cluster)
                  .readLocalTemperatureCalibrationAttribute(
                      (ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readThermostatLocalTemperatureCalibrationCommandParams);
    result.put(
        "readLocalTemperatureCalibrationAttribute",
        readThermostatLocalTemperatureCalibrationAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readThermostatOccupiedCoolingSetpointCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readThermostatOccupiedCoolingSetpointAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ThermostatCluster) cluster)
                  .readOccupiedCoolingSetpointAttribute(
                      (ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readThermostatOccupiedCoolingSetpointCommandParams);
    result.put(
        "readOccupiedCoolingSetpointAttribute",
        readThermostatOccupiedCoolingSetpointAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readThermostatOccupiedHeatingSetpointCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readThermostatOccupiedHeatingSetpointAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ThermostatCluster) cluster)
                  .readOccupiedHeatingSetpointAttribute(
                      (ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readThermostatOccupiedHeatingSetpointCommandParams);
    result.put(
        "readOccupiedHeatingSetpointAttribute",
        readThermostatOccupiedHeatingSetpointAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readThermostatUnoccupiedCoolingSetpointCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readThermostatUnoccupiedCoolingSetpointAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ThermostatCluster) cluster)
                  .readUnoccupiedCoolingSetpointAttribute(
                      (ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readThermostatUnoccupiedCoolingSetpointCommandParams);
    result.put(
        "readUnoccupiedCoolingSetpointAttribute",
        readThermostatUnoccupiedCoolingSetpointAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readThermostatUnoccupiedHeatingSetpointCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readThermostatUnoccupiedHeatingSetpointAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ThermostatCluster) cluster)
                  .readUnoccupiedHeatingSetpointAttribute(
                      (ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readThermostatUnoccupiedHeatingSetpointCommandParams);
    result.put(
        "readUnoccupiedHeatingSetpointAttribute",
        readThermostatUnoccupiedHeatingSetpointAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readThermostatMinHeatSetpointLimitCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readThermostatMinHeatSetpointLimitAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ThermostatCluster) cluster)
                  .readMinHeatSetpointLimitAttribute(
                      (ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readThermostatMinHeatSetpointLimitCommandParams);
    result.put(
        "readMinHeatSetpointLimitAttribute",
        readThermostatMinHeatSetpointLimitAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readThermostatMaxHeatSetpointLimitCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readThermostatMaxHeatSetpointLimitAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ThermostatCluster) cluster)
                  .readMaxHeatSetpointLimitAttribute(
                      (ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readThermostatMaxHeatSetpointLimitCommandParams);
    result.put(
        "readMaxHeatSetpointLimitAttribute",
        readThermostatMaxHeatSetpointLimitAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readThermostatMinCoolSetpointLimitCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readThermostatMinCoolSetpointLimitAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ThermostatCluster) cluster)
                  .readMinCoolSetpointLimitAttribute(
                      (ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readThermostatMinCoolSetpointLimitCommandParams);
    result.put(
        "readMinCoolSetpointLimitAttribute",
        readThermostatMinCoolSetpointLimitAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readThermostatMaxCoolSetpointLimitCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readThermostatMaxCoolSetpointLimitAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ThermostatCluster) cluster)
                  .readMaxCoolSetpointLimitAttribute(
                      (ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readThermostatMaxCoolSetpointLimitCommandParams);
    result.put(
        "readMaxCoolSetpointLimitAttribute",
        readThermostatMaxCoolSetpointLimitAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readThermostatMinSetpointDeadBandCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readThermostatMinSetpointDeadBandAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ThermostatCluster) cluster)
                  .readMinSetpointDeadBandAttribute(
                      (ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readThermostatMinSetpointDeadBandCommandParams);
    result.put(
        "readMinSetpointDeadBandAttribute",
        readThermostatMinSetpointDeadBandAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readThermostatRemoteSensingCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readThermostatRemoteSensingAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ThermostatCluster) cluster)
                  .readRemoteSensingAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readThermostatRemoteSensingCommandParams);
    result.put("readRemoteSensingAttribute", readThermostatRemoteSensingAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readThermostatControlSequenceOfOperationCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readThermostatControlSequenceOfOperationAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ThermostatCluster) cluster)
                  .readControlSequenceOfOperationAttribute(
                      (ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readThermostatControlSequenceOfOperationCommandParams);
    result.put(
        "readControlSequenceOfOperationAttribute",
        readThermostatControlSequenceOfOperationAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readThermostatSystemModeCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readThermostatSystemModeAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ThermostatCluster) cluster)
                  .readSystemModeAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readThermostatSystemModeCommandParams);
    result.put("readSystemModeAttribute", readThermostatSystemModeAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readThermostatThermostatRunningModeCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readThermostatThermostatRunningModeAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ThermostatCluster) cluster)
                  .readThermostatRunningModeAttribute(
                      (ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readThermostatThermostatRunningModeCommandParams);
    result.put(
        "readThermostatRunningModeAttribute",
        readThermostatThermostatRunningModeAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readThermostatStartOfWeekCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readThermostatStartOfWeekAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ThermostatCluster) cluster)
                  .readStartOfWeekAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readThermostatStartOfWeekCommandParams);
    result.put("readStartOfWeekAttribute", readThermostatStartOfWeekAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readThermostatNumberOfWeeklyTransitionsCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readThermostatNumberOfWeeklyTransitionsAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ThermostatCluster) cluster)
                  .readNumberOfWeeklyTransitionsAttribute(
                      (ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readThermostatNumberOfWeeklyTransitionsCommandParams);
    result.put(
        "readNumberOfWeeklyTransitionsAttribute",
        readThermostatNumberOfWeeklyTransitionsAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readThermostatNumberOfDailyTransitionsCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readThermostatNumberOfDailyTransitionsAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ThermostatCluster) cluster)
                  .readNumberOfDailyTransitionsAttribute(
                      (ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readThermostatNumberOfDailyTransitionsCommandParams);
    result.put(
        "readNumberOfDailyTransitionsAttribute",
        readThermostatNumberOfDailyTransitionsAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readThermostatTemperatureSetpointHoldCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readThermostatTemperatureSetpointHoldAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ThermostatCluster) cluster)
                  .readTemperatureSetpointHoldAttribute(
                      (ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readThermostatTemperatureSetpointHoldCommandParams);
    result.put(
        "readTemperatureSetpointHoldAttribute",
        readThermostatTemperatureSetpointHoldAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readThermostatTemperatureSetpointHoldDurationCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readThermostatTemperatureSetpointHoldDurationAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ThermostatCluster) cluster)
                  .readTemperatureSetpointHoldDurationAttribute(
                      (ChipClusters.ThermostatCluster
                              .TemperatureSetpointHoldDurationAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedThermostatClusterTemperatureSetpointHoldDurationAttributeCallback(),
            readThermostatTemperatureSetpointHoldDurationCommandParams);
    result.put(
        "readTemperatureSetpointHoldDurationAttribute",
        readThermostatTemperatureSetpointHoldDurationAttributeInteractionInfo);
    Map<String, CommandParameterInfo>
        readThermostatThermostatProgrammingOperationModeCommandParams =
            new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readThermostatThermostatProgrammingOperationModeAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ThermostatCluster) cluster)
                  .readThermostatProgrammingOperationModeAttribute(
                      (ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readThermostatThermostatProgrammingOperationModeCommandParams);
    result.put(
        "readThermostatProgrammingOperationModeAttribute",
        readThermostatThermostatProgrammingOperationModeAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readThermostatThermostatRunningStateCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readThermostatThermostatRunningStateAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ThermostatCluster) cluster)
                  .readThermostatRunningStateAttribute(
                      (ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readThermostatThermostatRunningStateCommandParams);
    result.put(
        "readThermostatRunningStateAttribute",
        readThermostatThermostatRunningStateAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readThermostatSetpointChangeSourceCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readThermostatSetpointChangeSourceAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ThermostatCluster) cluster)
                  .readSetpointChangeSourceAttribute(
                      (ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readThermostatSetpointChangeSourceCommandParams);
    result.put(
        "readSetpointChangeSourceAttribute",
        readThermostatSetpointChangeSourceAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readThermostatSetpointChangeAmountCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readThermostatSetpointChangeAmountAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ThermostatCluster) cluster)
                  .readSetpointChangeAmountAttribute(
                      (ChipClusters.ThermostatCluster.SetpointChangeAmountAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedThermostatClusterSetpointChangeAmountAttributeCallback(),
            readThermostatSetpointChangeAmountCommandParams);
    result.put(
        "readSetpointChangeAmountAttribute",
        readThermostatSetpointChangeAmountAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readThermostatSetpointChangeSourceTimestampCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readThermostatSetpointChangeSourceTimestampAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ThermostatCluster) cluster)
                  .readSetpointChangeSourceTimestampAttribute(
                      (ChipClusters.LongAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedLongAttributeCallback(),
            readThermostatSetpointChangeSourceTimestampCommandParams);
    result.put(
        "readSetpointChangeSourceTimestampAttribute",
        readThermostatSetpointChangeSourceTimestampAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readThermostatOccupiedSetbackCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readThermostatOccupiedSetbackAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ThermostatCluster) cluster)
                  .readOccupiedSetbackAttribute(
                      (ChipClusters.ThermostatCluster.OccupiedSetbackAttributeCallback) callback);
            },
            () ->
                new ClusterInfoMapping.DelegatedThermostatClusterOccupiedSetbackAttributeCallback(),
            readThermostatOccupiedSetbackCommandParams);
    result.put(
        "readOccupiedSetbackAttribute", readThermostatOccupiedSetbackAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readThermostatOccupiedSetbackMinCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readThermostatOccupiedSetbackMinAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ThermostatCluster) cluster)
                  .readOccupiedSetbackMinAttribute(
                      (ChipClusters.ThermostatCluster.OccupiedSetbackMinAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedThermostatClusterOccupiedSetbackMinAttributeCallback(),
            readThermostatOccupiedSetbackMinCommandParams);
    result.put(
        "readOccupiedSetbackMinAttribute",
        readThermostatOccupiedSetbackMinAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readThermostatOccupiedSetbackMaxCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readThermostatOccupiedSetbackMaxAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ThermostatCluster) cluster)
                  .readOccupiedSetbackMaxAttribute(
                      (ChipClusters.ThermostatCluster.OccupiedSetbackMaxAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedThermostatClusterOccupiedSetbackMaxAttributeCallback(),
            readThermostatOccupiedSetbackMaxCommandParams);
    result.put(
        "readOccupiedSetbackMaxAttribute",
        readThermostatOccupiedSetbackMaxAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readThermostatUnoccupiedSetbackCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readThermostatUnoccupiedSetbackAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ThermostatCluster) cluster)
                  .readUnoccupiedSetbackAttribute(
                      (ChipClusters.ThermostatCluster.UnoccupiedSetbackAttributeCallback) callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedThermostatClusterUnoccupiedSetbackAttributeCallback(),
            readThermostatUnoccupiedSetbackCommandParams);
    result.put(
        "readUnoccupiedSetbackAttribute", readThermostatUnoccupiedSetbackAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readThermostatUnoccupiedSetbackMinCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readThermostatUnoccupiedSetbackMinAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ThermostatCluster) cluster)
                  .readUnoccupiedSetbackMinAttribute(
                      (ChipClusters.ThermostatCluster.UnoccupiedSetbackMinAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedThermostatClusterUnoccupiedSetbackMinAttributeCallback(),
            readThermostatUnoccupiedSetbackMinCommandParams);
    result.put(
        "readUnoccupiedSetbackMinAttribute",
        readThermostatUnoccupiedSetbackMinAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readThermostatUnoccupiedSetbackMaxCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readThermostatUnoccupiedSetbackMaxAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ThermostatCluster) cluster)
                  .readUnoccupiedSetbackMaxAttribute(
                      (ChipClusters.ThermostatCluster.UnoccupiedSetbackMaxAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedThermostatClusterUnoccupiedSetbackMaxAttributeCallback(),
            readThermostatUnoccupiedSetbackMaxCommandParams);
    result.put(
        "readUnoccupiedSetbackMaxAttribute",
        readThermostatUnoccupiedSetbackMaxAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readThermostatEmergencyHeatDeltaCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readThermostatEmergencyHeatDeltaAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ThermostatCluster) cluster)
                  .readEmergencyHeatDeltaAttribute(
                      (ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readThermostatEmergencyHeatDeltaCommandParams);
    result.put(
        "readEmergencyHeatDeltaAttribute",
        readThermostatEmergencyHeatDeltaAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readThermostatACTypeCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readThermostatACTypeAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ThermostatCluster) cluster)
                  .readACTypeAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readThermostatACTypeCommandParams);
    result.put("readACTypeAttribute", readThermostatACTypeAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readThermostatACCapacityCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readThermostatACCapacityAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ThermostatCluster) cluster)
                  .readACCapacityAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readThermostatACCapacityCommandParams);
    result.put("readACCapacityAttribute", readThermostatACCapacityAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readThermostatACRefrigerantTypeCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readThermostatACRefrigerantTypeAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ThermostatCluster) cluster)
                  .readACRefrigerantTypeAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readThermostatACRefrigerantTypeCommandParams);
    result.put(
        "readACRefrigerantTypeAttribute", readThermostatACRefrigerantTypeAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readThermostatACCompressorTypeCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readThermostatACCompressorTypeAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ThermostatCluster) cluster)
                  .readACCompressorTypeAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readThermostatACCompressorTypeCommandParams);
    result.put(
        "readACCompressorTypeAttribute", readThermostatACCompressorTypeAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readThermostatACErrorCodeCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readThermostatACErrorCodeAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ThermostatCluster) cluster)
                  .readACErrorCodeAttribute((ChipClusters.LongAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedLongAttributeCallback(),
            readThermostatACErrorCodeCommandParams);
    result.put("readACErrorCodeAttribute", readThermostatACErrorCodeAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readThermostatACLouverPositionCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readThermostatACLouverPositionAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ThermostatCluster) cluster)
                  .readACLouverPositionAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readThermostatACLouverPositionCommandParams);
    result.put(
        "readACLouverPositionAttribute", readThermostatACLouverPositionAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readThermostatACCoilTemperatureCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readThermostatACCoilTemperatureAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ThermostatCluster) cluster)
                  .readACCoilTemperatureAttribute(
                      (ChipClusters.ThermostatCluster.ACCoilTemperatureAttributeCallback) callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedThermostatClusterACCoilTemperatureAttributeCallback(),
            readThermostatACCoilTemperatureCommandParams);
    result.put(
        "readACCoilTemperatureAttribute", readThermostatACCoilTemperatureAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readThermostatACCapacityformatCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readThermostatACCapacityformatAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ThermostatCluster) cluster)
                  .readACCapacityformatAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readThermostatACCapacityformatCommandParams);
    result.put(
        "readACCapacityformatAttribute", readThermostatACCapacityformatAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readThermostatGeneratedCommandListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readThermostatGeneratedCommandListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ThermostatCluster) cluster)
                  .readGeneratedCommandListAttribute(
                      (ChipClusters.ThermostatCluster.GeneratedCommandListAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedThermostatClusterGeneratedCommandListAttributeCallback(),
            readThermostatGeneratedCommandListCommandParams);
    result.put(
        "readGeneratedCommandListAttribute",
        readThermostatGeneratedCommandListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readThermostatAcceptedCommandListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readThermostatAcceptedCommandListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ThermostatCluster) cluster)
                  .readAcceptedCommandListAttribute(
                      (ChipClusters.ThermostatCluster.AcceptedCommandListAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedThermostatClusterAcceptedCommandListAttributeCallback(),
            readThermostatAcceptedCommandListCommandParams);
    result.put(
        "readAcceptedCommandListAttribute",
        readThermostatAcceptedCommandListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readThermostatEventListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readThermostatEventListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ThermostatCluster) cluster)
                  .readEventListAttribute(
                      (ChipClusters.ThermostatCluster.EventListAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedThermostatClusterEventListAttributeCallback(),
            readThermostatEventListCommandParams);
    result.put("readEventListAttribute", readThermostatEventListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readThermostatAttributeListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readThermostatAttributeListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ThermostatCluster) cluster)
                  .readAttributeListAttribute(
                      (ChipClusters.ThermostatCluster.AttributeListAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedThermostatClusterAttributeListAttributeCallback(),
            readThermostatAttributeListCommandParams);
    result.put("readAttributeListAttribute", readThermostatAttributeListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readThermostatFeatureMapCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readThermostatFeatureMapAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ThermostatCluster) cluster)
                  .readFeatureMapAttribute((ChipClusters.LongAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedLongAttributeCallback(),
            readThermostatFeatureMapCommandParams);
    result.put("readFeatureMapAttribute", readThermostatFeatureMapAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readThermostatClusterRevisionCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readThermostatClusterRevisionAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ThermostatCluster) cluster)
                  .readClusterRevisionAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readThermostatClusterRevisionCommandParams);
    result.put(
        "readClusterRevisionAttribute", readThermostatClusterRevisionAttributeInteractionInfo);

    return result;
  }

  private static Map<String, InteractionInfo> readFanControlInteractionInfo() {
    Map<String, InteractionInfo> result = new LinkedHashMap<>();
    Map<String, CommandParameterInfo> readFanControlFanModeCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readFanControlFanModeAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.FanControlCluster) cluster)
                  .readFanModeAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readFanControlFanModeCommandParams);
    result.put("readFanModeAttribute", readFanControlFanModeAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readFanControlFanModeSequenceCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readFanControlFanModeSequenceAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.FanControlCluster) cluster)
                  .readFanModeSequenceAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readFanControlFanModeSequenceCommandParams);
    result.put(
        "readFanModeSequenceAttribute", readFanControlFanModeSequenceAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readFanControlPercentSettingCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readFanControlPercentSettingAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.FanControlCluster) cluster)
                  .readPercentSettingAttribute(
                      (ChipClusters.FanControlCluster.PercentSettingAttributeCallback) callback);
            },
            () ->
                new ClusterInfoMapping.DelegatedFanControlClusterPercentSettingAttributeCallback(),
            readFanControlPercentSettingCommandParams);
    result.put("readPercentSettingAttribute", readFanControlPercentSettingAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readFanControlPercentCurrentCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readFanControlPercentCurrentAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.FanControlCluster) cluster)
                  .readPercentCurrentAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readFanControlPercentCurrentCommandParams);
    result.put("readPercentCurrentAttribute", readFanControlPercentCurrentAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readFanControlSpeedMaxCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readFanControlSpeedMaxAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.FanControlCluster) cluster)
                  .readSpeedMaxAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readFanControlSpeedMaxCommandParams);
    result.put("readSpeedMaxAttribute", readFanControlSpeedMaxAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readFanControlSpeedSettingCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readFanControlSpeedSettingAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.FanControlCluster) cluster)
                  .readSpeedSettingAttribute(
                      (ChipClusters.FanControlCluster.SpeedSettingAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedFanControlClusterSpeedSettingAttributeCallback(),
            readFanControlSpeedSettingCommandParams);
    result.put("readSpeedSettingAttribute", readFanControlSpeedSettingAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readFanControlSpeedCurrentCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readFanControlSpeedCurrentAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.FanControlCluster) cluster)
                  .readSpeedCurrentAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readFanControlSpeedCurrentCommandParams);
    result.put("readSpeedCurrentAttribute", readFanControlSpeedCurrentAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readFanControlRockSupportCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readFanControlRockSupportAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.FanControlCluster) cluster)
                  .readRockSupportAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readFanControlRockSupportCommandParams);
    result.put("readRockSupportAttribute", readFanControlRockSupportAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readFanControlRockSettingCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readFanControlRockSettingAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.FanControlCluster) cluster)
                  .readRockSettingAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readFanControlRockSettingCommandParams);
    result.put("readRockSettingAttribute", readFanControlRockSettingAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readFanControlWindSupportCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readFanControlWindSupportAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.FanControlCluster) cluster)
                  .readWindSupportAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readFanControlWindSupportCommandParams);
    result.put("readWindSupportAttribute", readFanControlWindSupportAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readFanControlWindSettingCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readFanControlWindSettingAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.FanControlCluster) cluster)
                  .readWindSettingAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readFanControlWindSettingCommandParams);
    result.put("readWindSettingAttribute", readFanControlWindSettingAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readFanControlGeneratedCommandListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readFanControlGeneratedCommandListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.FanControlCluster) cluster)
                  .readGeneratedCommandListAttribute(
                      (ChipClusters.FanControlCluster.GeneratedCommandListAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedFanControlClusterGeneratedCommandListAttributeCallback(),
            readFanControlGeneratedCommandListCommandParams);
    result.put(
        "readGeneratedCommandListAttribute",
        readFanControlGeneratedCommandListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readFanControlAcceptedCommandListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readFanControlAcceptedCommandListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.FanControlCluster) cluster)
                  .readAcceptedCommandListAttribute(
                      (ChipClusters.FanControlCluster.AcceptedCommandListAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedFanControlClusterAcceptedCommandListAttributeCallback(),
            readFanControlAcceptedCommandListCommandParams);
    result.put(
        "readAcceptedCommandListAttribute",
        readFanControlAcceptedCommandListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readFanControlEventListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readFanControlEventListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.FanControlCluster) cluster)
                  .readEventListAttribute(
                      (ChipClusters.FanControlCluster.EventListAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedFanControlClusterEventListAttributeCallback(),
            readFanControlEventListCommandParams);
    result.put("readEventListAttribute", readFanControlEventListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readFanControlAttributeListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readFanControlAttributeListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.FanControlCluster) cluster)
                  .readAttributeListAttribute(
                      (ChipClusters.FanControlCluster.AttributeListAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedFanControlClusterAttributeListAttributeCallback(),
            readFanControlAttributeListCommandParams);
    result.put("readAttributeListAttribute", readFanControlAttributeListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readFanControlFeatureMapCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readFanControlFeatureMapAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.FanControlCluster) cluster)
                  .readFeatureMapAttribute((ChipClusters.LongAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedLongAttributeCallback(),
            readFanControlFeatureMapCommandParams);
    result.put("readFeatureMapAttribute", readFanControlFeatureMapAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readFanControlClusterRevisionCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readFanControlClusterRevisionAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.FanControlCluster) cluster)
                  .readClusterRevisionAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readFanControlClusterRevisionCommandParams);
    result.put(
        "readClusterRevisionAttribute", readFanControlClusterRevisionAttributeInteractionInfo);

    return result;
  }

  private static Map<String, InteractionInfo>
      readThermostatUserInterfaceConfigurationInteractionInfo() {
    Map<String, InteractionInfo> result = new LinkedHashMap<>();
    Map<String, CommandParameterInfo>
        readThermostatUserInterfaceConfigurationTemperatureDisplayModeCommandParams =
            new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo
        readThermostatUserInterfaceConfigurationTemperatureDisplayModeAttributeInteractionInfo =
            new InteractionInfo(
                (cluster, callback, commandArguments) -> {
                  ((ChipClusters.ThermostatUserInterfaceConfigurationCluster) cluster)
                      .readTemperatureDisplayModeAttribute(
                          (ChipClusters.IntegerAttributeCallback) callback);
                },
                () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
                readThermostatUserInterfaceConfigurationTemperatureDisplayModeCommandParams);
    result.put(
        "readTemperatureDisplayModeAttribute",
        readThermostatUserInterfaceConfigurationTemperatureDisplayModeAttributeInteractionInfo);
    Map<String, CommandParameterInfo>
        readThermostatUserInterfaceConfigurationKeypadLockoutCommandParams =
            new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readThermostatUserInterfaceConfigurationKeypadLockoutAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ThermostatUserInterfaceConfigurationCluster) cluster)
                  .readKeypadLockoutAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readThermostatUserInterfaceConfigurationKeypadLockoutCommandParams);
    result.put(
        "readKeypadLockoutAttribute",
        readThermostatUserInterfaceConfigurationKeypadLockoutAttributeInteractionInfo);
    Map<String, CommandParameterInfo>
        readThermostatUserInterfaceConfigurationScheduleProgrammingVisibilityCommandParams =
            new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo
        readThermostatUserInterfaceConfigurationScheduleProgrammingVisibilityAttributeInteractionInfo =
            new InteractionInfo(
                (cluster, callback, commandArguments) -> {
                  ((ChipClusters.ThermostatUserInterfaceConfigurationCluster) cluster)
                      .readScheduleProgrammingVisibilityAttribute(
                          (ChipClusters.IntegerAttributeCallback) callback);
                },
                () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
                readThermostatUserInterfaceConfigurationScheduleProgrammingVisibilityCommandParams);
    result.put(
        "readScheduleProgrammingVisibilityAttribute",
        readThermostatUserInterfaceConfigurationScheduleProgrammingVisibilityAttributeInteractionInfo);
    Map<String, CommandParameterInfo>
        readThermostatUserInterfaceConfigurationGeneratedCommandListCommandParams =
            new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo
        readThermostatUserInterfaceConfigurationGeneratedCommandListAttributeInteractionInfo =
            new InteractionInfo(
                (cluster, callback, commandArguments) -> {
                  ((ChipClusters.ThermostatUserInterfaceConfigurationCluster) cluster)
                      .readGeneratedCommandListAttribute(
                          (ChipClusters.ThermostatUserInterfaceConfigurationCluster
                                  .GeneratedCommandListAttributeCallback)
                              callback);
                },
                () ->
                    new ClusterInfoMapping
                        .DelegatedThermostatUserInterfaceConfigurationClusterGeneratedCommandListAttributeCallback(),
                readThermostatUserInterfaceConfigurationGeneratedCommandListCommandParams);
    result.put(
        "readGeneratedCommandListAttribute",
        readThermostatUserInterfaceConfigurationGeneratedCommandListAttributeInteractionInfo);
    Map<String, CommandParameterInfo>
        readThermostatUserInterfaceConfigurationAcceptedCommandListCommandParams =
            new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo
        readThermostatUserInterfaceConfigurationAcceptedCommandListAttributeInteractionInfo =
            new InteractionInfo(
                (cluster, callback, commandArguments) -> {
                  ((ChipClusters.ThermostatUserInterfaceConfigurationCluster) cluster)
                      .readAcceptedCommandListAttribute(
                          (ChipClusters.ThermostatUserInterfaceConfigurationCluster
                                  .AcceptedCommandListAttributeCallback)
                              callback);
                },
                () ->
                    new ClusterInfoMapping
                        .DelegatedThermostatUserInterfaceConfigurationClusterAcceptedCommandListAttributeCallback(),
                readThermostatUserInterfaceConfigurationAcceptedCommandListCommandParams);
    result.put(
        "readAcceptedCommandListAttribute",
        readThermostatUserInterfaceConfigurationAcceptedCommandListAttributeInteractionInfo);
    Map<String, CommandParameterInfo>
        readThermostatUserInterfaceConfigurationEventListCommandParams =
            new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readThermostatUserInterfaceConfigurationEventListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ThermostatUserInterfaceConfigurationCluster) cluster)
                  .readEventListAttribute(
                      (ChipClusters.ThermostatUserInterfaceConfigurationCluster
                              .EventListAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedThermostatUserInterfaceConfigurationClusterEventListAttributeCallback(),
            readThermostatUserInterfaceConfigurationEventListCommandParams);
    result.put(
        "readEventListAttribute",
        readThermostatUserInterfaceConfigurationEventListAttributeInteractionInfo);
    Map<String, CommandParameterInfo>
        readThermostatUserInterfaceConfigurationAttributeListCommandParams =
            new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readThermostatUserInterfaceConfigurationAttributeListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ThermostatUserInterfaceConfigurationCluster) cluster)
                  .readAttributeListAttribute(
                      (ChipClusters.ThermostatUserInterfaceConfigurationCluster
                              .AttributeListAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedThermostatUserInterfaceConfigurationClusterAttributeListAttributeCallback(),
            readThermostatUserInterfaceConfigurationAttributeListCommandParams);
    result.put(
        "readAttributeListAttribute",
        readThermostatUserInterfaceConfigurationAttributeListAttributeInteractionInfo);
    Map<String, CommandParameterInfo>
        readThermostatUserInterfaceConfigurationFeatureMapCommandParams =
            new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readThermostatUserInterfaceConfigurationFeatureMapAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ThermostatUserInterfaceConfigurationCluster) cluster)
                  .readFeatureMapAttribute((ChipClusters.LongAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedLongAttributeCallback(),
            readThermostatUserInterfaceConfigurationFeatureMapCommandParams);
    result.put(
        "readFeatureMapAttribute",
        readThermostatUserInterfaceConfigurationFeatureMapAttributeInteractionInfo);
    Map<String, CommandParameterInfo>
        readThermostatUserInterfaceConfigurationClusterRevisionCommandParams =
            new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo
        readThermostatUserInterfaceConfigurationClusterRevisionAttributeInteractionInfo =
            new InteractionInfo(
                (cluster, callback, commandArguments) -> {
                  ((ChipClusters.ThermostatUserInterfaceConfigurationCluster) cluster)
                      .readClusterRevisionAttribute(
                          (ChipClusters.IntegerAttributeCallback) callback);
                },
                () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
                readThermostatUserInterfaceConfigurationClusterRevisionCommandParams);
    result.put(
        "readClusterRevisionAttribute",
        readThermostatUserInterfaceConfigurationClusterRevisionAttributeInteractionInfo);

    return result;
  }

  private static Map<String, InteractionInfo> readColorControlInteractionInfo() {
    Map<String, InteractionInfo> result = new LinkedHashMap<>();
    Map<String, CommandParameterInfo> readColorControlCurrentHueCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readColorControlCurrentHueAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ColorControlCluster) cluster)
                  .readCurrentHueAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readColorControlCurrentHueCommandParams);
    result.put("readCurrentHueAttribute", readColorControlCurrentHueAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readColorControlCurrentSaturationCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readColorControlCurrentSaturationAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ColorControlCluster) cluster)
                  .readCurrentSaturationAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readColorControlCurrentSaturationCommandParams);
    result.put(
        "readCurrentSaturationAttribute",
        readColorControlCurrentSaturationAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readColorControlRemainingTimeCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readColorControlRemainingTimeAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ColorControlCluster) cluster)
                  .readRemainingTimeAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readColorControlRemainingTimeCommandParams);
    result.put("readRemainingTimeAttribute", readColorControlRemainingTimeAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readColorControlCurrentXCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readColorControlCurrentXAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ColorControlCluster) cluster)
                  .readCurrentXAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readColorControlCurrentXCommandParams);
    result.put("readCurrentXAttribute", readColorControlCurrentXAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readColorControlCurrentYCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readColorControlCurrentYAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ColorControlCluster) cluster)
                  .readCurrentYAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readColorControlCurrentYCommandParams);
    result.put("readCurrentYAttribute", readColorControlCurrentYAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readColorControlDriftCompensationCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readColorControlDriftCompensationAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ColorControlCluster) cluster)
                  .readDriftCompensationAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readColorControlDriftCompensationCommandParams);
    result.put(
        "readDriftCompensationAttribute",
        readColorControlDriftCompensationAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readColorControlCompensationTextCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readColorControlCompensationTextAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ColorControlCluster) cluster)
                  .readCompensationTextAttribute(
                      (ChipClusters.CharStringAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedCharStringAttributeCallback(),
            readColorControlCompensationTextCommandParams);
    result.put(
        "readCompensationTextAttribute", readColorControlCompensationTextAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readColorControlColorTemperatureMiredsCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readColorControlColorTemperatureMiredsAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ColorControlCluster) cluster)
                  .readColorTemperatureMiredsAttribute(
                      (ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readColorControlColorTemperatureMiredsCommandParams);
    result.put(
        "readColorTemperatureMiredsAttribute",
        readColorControlColorTemperatureMiredsAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readColorControlColorModeCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readColorControlColorModeAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ColorControlCluster) cluster)
                  .readColorModeAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readColorControlColorModeCommandParams);
    result.put("readColorModeAttribute", readColorControlColorModeAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readColorControlOptionsCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readColorControlOptionsAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ColorControlCluster) cluster)
                  .readOptionsAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readColorControlOptionsCommandParams);
    result.put("readOptionsAttribute", readColorControlOptionsAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readColorControlNumberOfPrimariesCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readColorControlNumberOfPrimariesAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ColorControlCluster) cluster)
                  .readNumberOfPrimariesAttribute(
                      (ChipClusters.ColorControlCluster.NumberOfPrimariesAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedColorControlClusterNumberOfPrimariesAttributeCallback(),
            readColorControlNumberOfPrimariesCommandParams);
    result.put(
        "readNumberOfPrimariesAttribute",
        readColorControlNumberOfPrimariesAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readColorControlPrimary1XCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readColorControlPrimary1XAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ColorControlCluster) cluster)
                  .readPrimary1XAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readColorControlPrimary1XCommandParams);
    result.put("readPrimary1XAttribute", readColorControlPrimary1XAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readColorControlPrimary1YCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readColorControlPrimary1YAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ColorControlCluster) cluster)
                  .readPrimary1YAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readColorControlPrimary1YCommandParams);
    result.put("readPrimary1YAttribute", readColorControlPrimary1YAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readColorControlPrimary1IntensityCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readColorControlPrimary1IntensityAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ColorControlCluster) cluster)
                  .readPrimary1IntensityAttribute(
                      (ChipClusters.ColorControlCluster.Primary1IntensityAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedColorControlClusterPrimary1IntensityAttributeCallback(),
            readColorControlPrimary1IntensityCommandParams);
    result.put(
        "readPrimary1IntensityAttribute",
        readColorControlPrimary1IntensityAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readColorControlPrimary2XCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readColorControlPrimary2XAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ColorControlCluster) cluster)
                  .readPrimary2XAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readColorControlPrimary2XCommandParams);
    result.put("readPrimary2XAttribute", readColorControlPrimary2XAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readColorControlPrimary2YCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readColorControlPrimary2YAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ColorControlCluster) cluster)
                  .readPrimary2YAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readColorControlPrimary2YCommandParams);
    result.put("readPrimary2YAttribute", readColorControlPrimary2YAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readColorControlPrimary2IntensityCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readColorControlPrimary2IntensityAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ColorControlCluster) cluster)
                  .readPrimary2IntensityAttribute(
                      (ChipClusters.ColorControlCluster.Primary2IntensityAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedColorControlClusterPrimary2IntensityAttributeCallback(),
            readColorControlPrimary2IntensityCommandParams);
    result.put(
        "readPrimary2IntensityAttribute",
        readColorControlPrimary2IntensityAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readColorControlPrimary3XCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readColorControlPrimary3XAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ColorControlCluster) cluster)
                  .readPrimary3XAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readColorControlPrimary3XCommandParams);
    result.put("readPrimary3XAttribute", readColorControlPrimary3XAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readColorControlPrimary3YCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readColorControlPrimary3YAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ColorControlCluster) cluster)
                  .readPrimary3YAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readColorControlPrimary3YCommandParams);
    result.put("readPrimary3YAttribute", readColorControlPrimary3YAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readColorControlPrimary3IntensityCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readColorControlPrimary3IntensityAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ColorControlCluster) cluster)
                  .readPrimary3IntensityAttribute(
                      (ChipClusters.ColorControlCluster.Primary3IntensityAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedColorControlClusterPrimary3IntensityAttributeCallback(),
            readColorControlPrimary3IntensityCommandParams);
    result.put(
        "readPrimary3IntensityAttribute",
        readColorControlPrimary3IntensityAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readColorControlPrimary4XCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readColorControlPrimary4XAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ColorControlCluster) cluster)
                  .readPrimary4XAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readColorControlPrimary4XCommandParams);
    result.put("readPrimary4XAttribute", readColorControlPrimary4XAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readColorControlPrimary4YCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readColorControlPrimary4YAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ColorControlCluster) cluster)
                  .readPrimary4YAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readColorControlPrimary4YCommandParams);
    result.put("readPrimary4YAttribute", readColorControlPrimary4YAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readColorControlPrimary4IntensityCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readColorControlPrimary4IntensityAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ColorControlCluster) cluster)
                  .readPrimary4IntensityAttribute(
                      (ChipClusters.ColorControlCluster.Primary4IntensityAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedColorControlClusterPrimary4IntensityAttributeCallback(),
            readColorControlPrimary4IntensityCommandParams);
    result.put(
        "readPrimary4IntensityAttribute",
        readColorControlPrimary4IntensityAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readColorControlPrimary5XCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readColorControlPrimary5XAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ColorControlCluster) cluster)
                  .readPrimary5XAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readColorControlPrimary5XCommandParams);
    result.put("readPrimary5XAttribute", readColorControlPrimary5XAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readColorControlPrimary5YCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readColorControlPrimary5YAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ColorControlCluster) cluster)
                  .readPrimary5YAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readColorControlPrimary5YCommandParams);
    result.put("readPrimary5YAttribute", readColorControlPrimary5YAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readColorControlPrimary5IntensityCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readColorControlPrimary5IntensityAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ColorControlCluster) cluster)
                  .readPrimary5IntensityAttribute(
                      (ChipClusters.ColorControlCluster.Primary5IntensityAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedColorControlClusterPrimary5IntensityAttributeCallback(),
            readColorControlPrimary5IntensityCommandParams);
    result.put(
        "readPrimary5IntensityAttribute",
        readColorControlPrimary5IntensityAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readColorControlPrimary6XCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readColorControlPrimary6XAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ColorControlCluster) cluster)
                  .readPrimary6XAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readColorControlPrimary6XCommandParams);
    result.put("readPrimary6XAttribute", readColorControlPrimary6XAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readColorControlPrimary6YCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readColorControlPrimary6YAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ColorControlCluster) cluster)
                  .readPrimary6YAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readColorControlPrimary6YCommandParams);
    result.put("readPrimary6YAttribute", readColorControlPrimary6YAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readColorControlPrimary6IntensityCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readColorControlPrimary6IntensityAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ColorControlCluster) cluster)
                  .readPrimary6IntensityAttribute(
                      (ChipClusters.ColorControlCluster.Primary6IntensityAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedColorControlClusterPrimary6IntensityAttributeCallback(),
            readColorControlPrimary6IntensityCommandParams);
    result.put(
        "readPrimary6IntensityAttribute",
        readColorControlPrimary6IntensityAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readColorControlWhitePointXCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readColorControlWhitePointXAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ColorControlCluster) cluster)
                  .readWhitePointXAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readColorControlWhitePointXCommandParams);
    result.put("readWhitePointXAttribute", readColorControlWhitePointXAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readColorControlWhitePointYCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readColorControlWhitePointYAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ColorControlCluster) cluster)
                  .readWhitePointYAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readColorControlWhitePointYCommandParams);
    result.put("readWhitePointYAttribute", readColorControlWhitePointYAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readColorControlColorPointRXCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readColorControlColorPointRXAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ColorControlCluster) cluster)
                  .readColorPointRXAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readColorControlColorPointRXCommandParams);
    result.put("readColorPointRXAttribute", readColorControlColorPointRXAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readColorControlColorPointRYCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readColorControlColorPointRYAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ColorControlCluster) cluster)
                  .readColorPointRYAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readColorControlColorPointRYCommandParams);
    result.put("readColorPointRYAttribute", readColorControlColorPointRYAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readColorControlColorPointRIntensityCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readColorControlColorPointRIntensityAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ColorControlCluster) cluster)
                  .readColorPointRIntensityAttribute(
                      (ChipClusters.ColorControlCluster.ColorPointRIntensityAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedColorControlClusterColorPointRIntensityAttributeCallback(),
            readColorControlColorPointRIntensityCommandParams);
    result.put(
        "readColorPointRIntensityAttribute",
        readColorControlColorPointRIntensityAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readColorControlColorPointGXCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readColorControlColorPointGXAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ColorControlCluster) cluster)
                  .readColorPointGXAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readColorControlColorPointGXCommandParams);
    result.put("readColorPointGXAttribute", readColorControlColorPointGXAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readColorControlColorPointGYCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readColorControlColorPointGYAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ColorControlCluster) cluster)
                  .readColorPointGYAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readColorControlColorPointGYCommandParams);
    result.put("readColorPointGYAttribute", readColorControlColorPointGYAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readColorControlColorPointGIntensityCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readColorControlColorPointGIntensityAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ColorControlCluster) cluster)
                  .readColorPointGIntensityAttribute(
                      (ChipClusters.ColorControlCluster.ColorPointGIntensityAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedColorControlClusterColorPointGIntensityAttributeCallback(),
            readColorControlColorPointGIntensityCommandParams);
    result.put(
        "readColorPointGIntensityAttribute",
        readColorControlColorPointGIntensityAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readColorControlColorPointBXCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readColorControlColorPointBXAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ColorControlCluster) cluster)
                  .readColorPointBXAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readColorControlColorPointBXCommandParams);
    result.put("readColorPointBXAttribute", readColorControlColorPointBXAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readColorControlColorPointBYCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readColorControlColorPointBYAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ColorControlCluster) cluster)
                  .readColorPointBYAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readColorControlColorPointBYCommandParams);
    result.put("readColorPointBYAttribute", readColorControlColorPointBYAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readColorControlColorPointBIntensityCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readColorControlColorPointBIntensityAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ColorControlCluster) cluster)
                  .readColorPointBIntensityAttribute(
                      (ChipClusters.ColorControlCluster.ColorPointBIntensityAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedColorControlClusterColorPointBIntensityAttributeCallback(),
            readColorControlColorPointBIntensityCommandParams);
    result.put(
        "readColorPointBIntensityAttribute",
        readColorControlColorPointBIntensityAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readColorControlEnhancedCurrentHueCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readColorControlEnhancedCurrentHueAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ColorControlCluster) cluster)
                  .readEnhancedCurrentHueAttribute(
                      (ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readColorControlEnhancedCurrentHueCommandParams);
    result.put(
        "readEnhancedCurrentHueAttribute",
        readColorControlEnhancedCurrentHueAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readColorControlEnhancedColorModeCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readColorControlEnhancedColorModeAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ColorControlCluster) cluster)
                  .readEnhancedColorModeAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readColorControlEnhancedColorModeCommandParams);
    result.put(
        "readEnhancedColorModeAttribute",
        readColorControlEnhancedColorModeAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readColorControlColorLoopActiveCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readColorControlColorLoopActiveAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ColorControlCluster) cluster)
                  .readColorLoopActiveAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readColorControlColorLoopActiveCommandParams);
    result.put(
        "readColorLoopActiveAttribute", readColorControlColorLoopActiveAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readColorControlColorLoopDirectionCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readColorControlColorLoopDirectionAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ColorControlCluster) cluster)
                  .readColorLoopDirectionAttribute(
                      (ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readColorControlColorLoopDirectionCommandParams);
    result.put(
        "readColorLoopDirectionAttribute",
        readColorControlColorLoopDirectionAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readColorControlColorLoopTimeCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readColorControlColorLoopTimeAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ColorControlCluster) cluster)
                  .readColorLoopTimeAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readColorControlColorLoopTimeCommandParams);
    result.put("readColorLoopTimeAttribute", readColorControlColorLoopTimeAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readColorControlColorLoopStartEnhancedHueCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readColorControlColorLoopStartEnhancedHueAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ColorControlCluster) cluster)
                  .readColorLoopStartEnhancedHueAttribute(
                      (ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readColorControlColorLoopStartEnhancedHueCommandParams);
    result.put(
        "readColorLoopStartEnhancedHueAttribute",
        readColorControlColorLoopStartEnhancedHueAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readColorControlColorLoopStoredEnhancedHueCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readColorControlColorLoopStoredEnhancedHueAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ColorControlCluster) cluster)
                  .readColorLoopStoredEnhancedHueAttribute(
                      (ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readColorControlColorLoopStoredEnhancedHueCommandParams);
    result.put(
        "readColorLoopStoredEnhancedHueAttribute",
        readColorControlColorLoopStoredEnhancedHueAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readColorControlColorCapabilitiesCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readColorControlColorCapabilitiesAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ColorControlCluster) cluster)
                  .readColorCapabilitiesAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readColorControlColorCapabilitiesCommandParams);
    result.put(
        "readColorCapabilitiesAttribute",
        readColorControlColorCapabilitiesAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readColorControlColorTempPhysicalMinMiredsCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readColorControlColorTempPhysicalMinMiredsAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ColorControlCluster) cluster)
                  .readColorTempPhysicalMinMiredsAttribute(
                      (ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readColorControlColorTempPhysicalMinMiredsCommandParams);
    result.put(
        "readColorTempPhysicalMinMiredsAttribute",
        readColorControlColorTempPhysicalMinMiredsAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readColorControlColorTempPhysicalMaxMiredsCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readColorControlColorTempPhysicalMaxMiredsAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ColorControlCluster) cluster)
                  .readColorTempPhysicalMaxMiredsAttribute(
                      (ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readColorControlColorTempPhysicalMaxMiredsCommandParams);
    result.put(
        "readColorTempPhysicalMaxMiredsAttribute",
        readColorControlColorTempPhysicalMaxMiredsAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readColorControlCoupleColorTempToLevelMinMiredsCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readColorControlCoupleColorTempToLevelMinMiredsAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ColorControlCluster) cluster)
                  .readCoupleColorTempToLevelMinMiredsAttribute(
                      (ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readColorControlCoupleColorTempToLevelMinMiredsCommandParams);
    result.put(
        "readCoupleColorTempToLevelMinMiredsAttribute",
        readColorControlCoupleColorTempToLevelMinMiredsAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readColorControlStartUpColorTemperatureMiredsCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readColorControlStartUpColorTemperatureMiredsAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ColorControlCluster) cluster)
                  .readStartUpColorTemperatureMiredsAttribute(
                      (ChipClusters.ColorControlCluster
                              .StartUpColorTemperatureMiredsAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedColorControlClusterStartUpColorTemperatureMiredsAttributeCallback(),
            readColorControlStartUpColorTemperatureMiredsCommandParams);
    result.put(
        "readStartUpColorTemperatureMiredsAttribute",
        readColorControlStartUpColorTemperatureMiredsAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readColorControlGeneratedCommandListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readColorControlGeneratedCommandListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ColorControlCluster) cluster)
                  .readGeneratedCommandListAttribute(
                      (ChipClusters.ColorControlCluster.GeneratedCommandListAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedColorControlClusterGeneratedCommandListAttributeCallback(),
            readColorControlGeneratedCommandListCommandParams);
    result.put(
        "readGeneratedCommandListAttribute",
        readColorControlGeneratedCommandListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readColorControlAcceptedCommandListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readColorControlAcceptedCommandListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ColorControlCluster) cluster)
                  .readAcceptedCommandListAttribute(
                      (ChipClusters.ColorControlCluster.AcceptedCommandListAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedColorControlClusterAcceptedCommandListAttributeCallback(),
            readColorControlAcceptedCommandListCommandParams);
    result.put(
        "readAcceptedCommandListAttribute",
        readColorControlAcceptedCommandListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readColorControlEventListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readColorControlEventListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ColorControlCluster) cluster)
                  .readEventListAttribute(
                      (ChipClusters.ColorControlCluster.EventListAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedColorControlClusterEventListAttributeCallback(),
            readColorControlEventListCommandParams);
    result.put("readEventListAttribute", readColorControlEventListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readColorControlAttributeListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readColorControlAttributeListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ColorControlCluster) cluster)
                  .readAttributeListAttribute(
                      (ChipClusters.ColorControlCluster.AttributeListAttributeCallback) callback);
            },
            () ->
                new ClusterInfoMapping.DelegatedColorControlClusterAttributeListAttributeCallback(),
            readColorControlAttributeListCommandParams);
    result.put("readAttributeListAttribute", readColorControlAttributeListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readColorControlFeatureMapCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readColorControlFeatureMapAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ColorControlCluster) cluster)
                  .readFeatureMapAttribute((ChipClusters.LongAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedLongAttributeCallback(),
            readColorControlFeatureMapCommandParams);
    result.put("readFeatureMapAttribute", readColorControlFeatureMapAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readColorControlClusterRevisionCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readColorControlClusterRevisionAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ColorControlCluster) cluster)
                  .readClusterRevisionAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readColorControlClusterRevisionCommandParams);
    result.put(
        "readClusterRevisionAttribute", readColorControlClusterRevisionAttributeInteractionInfo);

    return result;
  }

  private static Map<String, InteractionInfo> readBallastConfigurationInteractionInfo() {
    Map<String, InteractionInfo> result = new LinkedHashMap<>();
    Map<String, CommandParameterInfo> readBallastConfigurationPhysicalMinLevelCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readBallastConfigurationPhysicalMinLevelAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.BallastConfigurationCluster) cluster)
                  .readPhysicalMinLevelAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readBallastConfigurationPhysicalMinLevelCommandParams);
    result.put(
        "readPhysicalMinLevelAttribute",
        readBallastConfigurationPhysicalMinLevelAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readBallastConfigurationPhysicalMaxLevelCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readBallastConfigurationPhysicalMaxLevelAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.BallastConfigurationCluster) cluster)
                  .readPhysicalMaxLevelAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readBallastConfigurationPhysicalMaxLevelCommandParams);
    result.put(
        "readPhysicalMaxLevelAttribute",
        readBallastConfigurationPhysicalMaxLevelAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readBallastConfigurationBallastStatusCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readBallastConfigurationBallastStatusAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.BallastConfigurationCluster) cluster)
                  .readBallastStatusAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readBallastConfigurationBallastStatusCommandParams);
    result.put(
        "readBallastStatusAttribute",
        readBallastConfigurationBallastStatusAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readBallastConfigurationMinLevelCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readBallastConfigurationMinLevelAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.BallastConfigurationCluster) cluster)
                  .readMinLevelAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readBallastConfigurationMinLevelCommandParams);
    result.put("readMinLevelAttribute", readBallastConfigurationMinLevelAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readBallastConfigurationMaxLevelCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readBallastConfigurationMaxLevelAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.BallastConfigurationCluster) cluster)
                  .readMaxLevelAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readBallastConfigurationMaxLevelCommandParams);
    result.put("readMaxLevelAttribute", readBallastConfigurationMaxLevelAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readBallastConfigurationIntrinsicBallastFactorCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readBallastConfigurationIntrinsicBallastFactorAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.BallastConfigurationCluster) cluster)
                  .readIntrinsicBallastFactorAttribute(
                      (ChipClusters.BallastConfigurationCluster
                              .IntrinsicBallastFactorAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedBallastConfigurationClusterIntrinsicBallastFactorAttributeCallback(),
            readBallastConfigurationIntrinsicBallastFactorCommandParams);
    result.put(
        "readIntrinsicBallastFactorAttribute",
        readBallastConfigurationIntrinsicBallastFactorAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readBallastConfigurationBallastFactorAdjustmentCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readBallastConfigurationBallastFactorAdjustmentAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.BallastConfigurationCluster) cluster)
                  .readBallastFactorAdjustmentAttribute(
                      (ChipClusters.BallastConfigurationCluster
                              .BallastFactorAdjustmentAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedBallastConfigurationClusterBallastFactorAdjustmentAttributeCallback(),
            readBallastConfigurationBallastFactorAdjustmentCommandParams);
    result.put(
        "readBallastFactorAdjustmentAttribute",
        readBallastConfigurationBallastFactorAdjustmentAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readBallastConfigurationLampQuantityCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readBallastConfigurationLampQuantityAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.BallastConfigurationCluster) cluster)
                  .readLampQuantityAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readBallastConfigurationLampQuantityCommandParams);
    result.put(
        "readLampQuantityAttribute", readBallastConfigurationLampQuantityAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readBallastConfigurationLampTypeCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readBallastConfigurationLampTypeAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.BallastConfigurationCluster) cluster)
                  .readLampTypeAttribute((ChipClusters.CharStringAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedCharStringAttributeCallback(),
            readBallastConfigurationLampTypeCommandParams);
    result.put("readLampTypeAttribute", readBallastConfigurationLampTypeAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readBallastConfigurationLampManufacturerCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readBallastConfigurationLampManufacturerAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.BallastConfigurationCluster) cluster)
                  .readLampManufacturerAttribute(
                      (ChipClusters.CharStringAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedCharStringAttributeCallback(),
            readBallastConfigurationLampManufacturerCommandParams);
    result.put(
        "readLampManufacturerAttribute",
        readBallastConfigurationLampManufacturerAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readBallastConfigurationLampRatedHoursCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readBallastConfigurationLampRatedHoursAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.BallastConfigurationCluster) cluster)
                  .readLampRatedHoursAttribute(
                      (ChipClusters.BallastConfigurationCluster.LampRatedHoursAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedBallastConfigurationClusterLampRatedHoursAttributeCallback(),
            readBallastConfigurationLampRatedHoursCommandParams);
    result.put(
        "readLampRatedHoursAttribute",
        readBallastConfigurationLampRatedHoursAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readBallastConfigurationLampBurnHoursCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readBallastConfigurationLampBurnHoursAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.BallastConfigurationCluster) cluster)
                  .readLampBurnHoursAttribute(
                      (ChipClusters.BallastConfigurationCluster.LampBurnHoursAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedBallastConfigurationClusterLampBurnHoursAttributeCallback(),
            readBallastConfigurationLampBurnHoursCommandParams);
    result.put(
        "readLampBurnHoursAttribute",
        readBallastConfigurationLampBurnHoursAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readBallastConfigurationLampAlarmModeCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readBallastConfigurationLampAlarmModeAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.BallastConfigurationCluster) cluster)
                  .readLampAlarmModeAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readBallastConfigurationLampAlarmModeCommandParams);
    result.put(
        "readLampAlarmModeAttribute",
        readBallastConfigurationLampAlarmModeAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readBallastConfigurationLampBurnHoursTripPointCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readBallastConfigurationLampBurnHoursTripPointAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.BallastConfigurationCluster) cluster)
                  .readLampBurnHoursTripPointAttribute(
                      (ChipClusters.BallastConfigurationCluster
                              .LampBurnHoursTripPointAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedBallastConfigurationClusterLampBurnHoursTripPointAttributeCallback(),
            readBallastConfigurationLampBurnHoursTripPointCommandParams);
    result.put(
        "readLampBurnHoursTripPointAttribute",
        readBallastConfigurationLampBurnHoursTripPointAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readBallastConfigurationGeneratedCommandListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readBallastConfigurationGeneratedCommandListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.BallastConfigurationCluster) cluster)
                  .readGeneratedCommandListAttribute(
                      (ChipClusters.BallastConfigurationCluster
                              .GeneratedCommandListAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedBallastConfigurationClusterGeneratedCommandListAttributeCallback(),
            readBallastConfigurationGeneratedCommandListCommandParams);
    result.put(
        "readGeneratedCommandListAttribute",
        readBallastConfigurationGeneratedCommandListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readBallastConfigurationAcceptedCommandListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readBallastConfigurationAcceptedCommandListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.BallastConfigurationCluster) cluster)
                  .readAcceptedCommandListAttribute(
                      (ChipClusters.BallastConfigurationCluster
                              .AcceptedCommandListAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedBallastConfigurationClusterAcceptedCommandListAttributeCallback(),
            readBallastConfigurationAcceptedCommandListCommandParams);
    result.put(
        "readAcceptedCommandListAttribute",
        readBallastConfigurationAcceptedCommandListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readBallastConfigurationEventListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readBallastConfigurationEventListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.BallastConfigurationCluster) cluster)
                  .readEventListAttribute(
                      (ChipClusters.BallastConfigurationCluster.EventListAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedBallastConfigurationClusterEventListAttributeCallback(),
            readBallastConfigurationEventListCommandParams);
    result.put("readEventListAttribute", readBallastConfigurationEventListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readBallastConfigurationAttributeListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readBallastConfigurationAttributeListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.BallastConfigurationCluster) cluster)
                  .readAttributeListAttribute(
                      (ChipClusters.BallastConfigurationCluster.AttributeListAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedBallastConfigurationClusterAttributeListAttributeCallback(),
            readBallastConfigurationAttributeListCommandParams);
    result.put(
        "readAttributeListAttribute",
        readBallastConfigurationAttributeListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readBallastConfigurationFeatureMapCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readBallastConfigurationFeatureMapAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.BallastConfigurationCluster) cluster)
                  .readFeatureMapAttribute((ChipClusters.LongAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedLongAttributeCallback(),
            readBallastConfigurationFeatureMapCommandParams);
    result.put(
        "readFeatureMapAttribute", readBallastConfigurationFeatureMapAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readBallastConfigurationClusterRevisionCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readBallastConfigurationClusterRevisionAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.BallastConfigurationCluster) cluster)
                  .readClusterRevisionAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readBallastConfigurationClusterRevisionCommandParams);
    result.put(
        "readClusterRevisionAttribute",
        readBallastConfigurationClusterRevisionAttributeInteractionInfo);

    return result;
  }

  private static Map<String, InteractionInfo> readIlluminanceMeasurementInteractionInfo() {
    Map<String, InteractionInfo> result = new LinkedHashMap<>();
    Map<String, CommandParameterInfo> readIlluminanceMeasurementMeasuredValueCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readIlluminanceMeasurementMeasuredValueAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.IlluminanceMeasurementCluster) cluster)
                  .readMeasuredValueAttribute(
                      (ChipClusters.IlluminanceMeasurementCluster.MeasuredValueAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedIlluminanceMeasurementClusterMeasuredValueAttributeCallback(),
            readIlluminanceMeasurementMeasuredValueCommandParams);
    result.put(
        "readMeasuredValueAttribute",
        readIlluminanceMeasurementMeasuredValueAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readIlluminanceMeasurementMinMeasuredValueCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readIlluminanceMeasurementMinMeasuredValueAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.IlluminanceMeasurementCluster) cluster)
                  .readMinMeasuredValueAttribute(
                      (ChipClusters.IlluminanceMeasurementCluster.MinMeasuredValueAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedIlluminanceMeasurementClusterMinMeasuredValueAttributeCallback(),
            readIlluminanceMeasurementMinMeasuredValueCommandParams);
    result.put(
        "readMinMeasuredValueAttribute",
        readIlluminanceMeasurementMinMeasuredValueAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readIlluminanceMeasurementMaxMeasuredValueCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readIlluminanceMeasurementMaxMeasuredValueAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.IlluminanceMeasurementCluster) cluster)
                  .readMaxMeasuredValueAttribute(
                      (ChipClusters.IlluminanceMeasurementCluster.MaxMeasuredValueAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedIlluminanceMeasurementClusterMaxMeasuredValueAttributeCallback(),
            readIlluminanceMeasurementMaxMeasuredValueCommandParams);
    result.put(
        "readMaxMeasuredValueAttribute",
        readIlluminanceMeasurementMaxMeasuredValueAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readIlluminanceMeasurementToleranceCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readIlluminanceMeasurementToleranceAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.IlluminanceMeasurementCluster) cluster)
                  .readToleranceAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readIlluminanceMeasurementToleranceCommandParams);
    result.put(
        "readToleranceAttribute", readIlluminanceMeasurementToleranceAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readIlluminanceMeasurementLightSensorTypeCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readIlluminanceMeasurementLightSensorTypeAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.IlluminanceMeasurementCluster) cluster)
                  .readLightSensorTypeAttribute(
                      (ChipClusters.IlluminanceMeasurementCluster.LightSensorTypeAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedIlluminanceMeasurementClusterLightSensorTypeAttributeCallback(),
            readIlluminanceMeasurementLightSensorTypeCommandParams);
    result.put(
        "readLightSensorTypeAttribute",
        readIlluminanceMeasurementLightSensorTypeAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readIlluminanceMeasurementGeneratedCommandListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readIlluminanceMeasurementGeneratedCommandListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.IlluminanceMeasurementCluster) cluster)
                  .readGeneratedCommandListAttribute(
                      (ChipClusters.IlluminanceMeasurementCluster
                              .GeneratedCommandListAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedIlluminanceMeasurementClusterGeneratedCommandListAttributeCallback(),
            readIlluminanceMeasurementGeneratedCommandListCommandParams);
    result.put(
        "readGeneratedCommandListAttribute",
        readIlluminanceMeasurementGeneratedCommandListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readIlluminanceMeasurementAcceptedCommandListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readIlluminanceMeasurementAcceptedCommandListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.IlluminanceMeasurementCluster) cluster)
                  .readAcceptedCommandListAttribute(
                      (ChipClusters.IlluminanceMeasurementCluster
                              .AcceptedCommandListAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedIlluminanceMeasurementClusterAcceptedCommandListAttributeCallback(),
            readIlluminanceMeasurementAcceptedCommandListCommandParams);
    result.put(
        "readAcceptedCommandListAttribute",
        readIlluminanceMeasurementAcceptedCommandListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readIlluminanceMeasurementEventListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readIlluminanceMeasurementEventListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.IlluminanceMeasurementCluster) cluster)
                  .readEventListAttribute(
                      (ChipClusters.IlluminanceMeasurementCluster.EventListAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedIlluminanceMeasurementClusterEventListAttributeCallback(),
            readIlluminanceMeasurementEventListCommandParams);
    result.put(
        "readEventListAttribute", readIlluminanceMeasurementEventListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readIlluminanceMeasurementAttributeListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readIlluminanceMeasurementAttributeListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.IlluminanceMeasurementCluster) cluster)
                  .readAttributeListAttribute(
                      (ChipClusters.IlluminanceMeasurementCluster.AttributeListAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedIlluminanceMeasurementClusterAttributeListAttributeCallback(),
            readIlluminanceMeasurementAttributeListCommandParams);
    result.put(
        "readAttributeListAttribute",
        readIlluminanceMeasurementAttributeListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readIlluminanceMeasurementFeatureMapCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readIlluminanceMeasurementFeatureMapAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.IlluminanceMeasurementCluster) cluster)
                  .readFeatureMapAttribute((ChipClusters.LongAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedLongAttributeCallback(),
            readIlluminanceMeasurementFeatureMapCommandParams);
    result.put(
        "readFeatureMapAttribute", readIlluminanceMeasurementFeatureMapAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readIlluminanceMeasurementClusterRevisionCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readIlluminanceMeasurementClusterRevisionAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.IlluminanceMeasurementCluster) cluster)
                  .readClusterRevisionAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readIlluminanceMeasurementClusterRevisionCommandParams);
    result.put(
        "readClusterRevisionAttribute",
        readIlluminanceMeasurementClusterRevisionAttributeInteractionInfo);

    return result;
  }

  private static Map<String, InteractionInfo> readTemperatureMeasurementInteractionInfo() {
    Map<String, InteractionInfo> result = new LinkedHashMap<>();
    Map<String, CommandParameterInfo> readTemperatureMeasurementMeasuredValueCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readTemperatureMeasurementMeasuredValueAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.TemperatureMeasurementCluster) cluster)
                  .readMeasuredValueAttribute(
                      (ChipClusters.TemperatureMeasurementCluster.MeasuredValueAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedTemperatureMeasurementClusterMeasuredValueAttributeCallback(),
            readTemperatureMeasurementMeasuredValueCommandParams);
    result.put(
        "readMeasuredValueAttribute",
        readTemperatureMeasurementMeasuredValueAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readTemperatureMeasurementMinMeasuredValueCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readTemperatureMeasurementMinMeasuredValueAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.TemperatureMeasurementCluster) cluster)
                  .readMinMeasuredValueAttribute(
                      (ChipClusters.TemperatureMeasurementCluster.MinMeasuredValueAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedTemperatureMeasurementClusterMinMeasuredValueAttributeCallback(),
            readTemperatureMeasurementMinMeasuredValueCommandParams);
    result.put(
        "readMinMeasuredValueAttribute",
        readTemperatureMeasurementMinMeasuredValueAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readTemperatureMeasurementMaxMeasuredValueCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readTemperatureMeasurementMaxMeasuredValueAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.TemperatureMeasurementCluster) cluster)
                  .readMaxMeasuredValueAttribute(
                      (ChipClusters.TemperatureMeasurementCluster.MaxMeasuredValueAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedTemperatureMeasurementClusterMaxMeasuredValueAttributeCallback(),
            readTemperatureMeasurementMaxMeasuredValueCommandParams);
    result.put(
        "readMaxMeasuredValueAttribute",
        readTemperatureMeasurementMaxMeasuredValueAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readTemperatureMeasurementToleranceCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readTemperatureMeasurementToleranceAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.TemperatureMeasurementCluster) cluster)
                  .readToleranceAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readTemperatureMeasurementToleranceCommandParams);
    result.put(
        "readToleranceAttribute", readTemperatureMeasurementToleranceAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readTemperatureMeasurementGeneratedCommandListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readTemperatureMeasurementGeneratedCommandListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.TemperatureMeasurementCluster) cluster)
                  .readGeneratedCommandListAttribute(
                      (ChipClusters.TemperatureMeasurementCluster
                              .GeneratedCommandListAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedTemperatureMeasurementClusterGeneratedCommandListAttributeCallback(),
            readTemperatureMeasurementGeneratedCommandListCommandParams);
    result.put(
        "readGeneratedCommandListAttribute",
        readTemperatureMeasurementGeneratedCommandListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readTemperatureMeasurementAcceptedCommandListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readTemperatureMeasurementAcceptedCommandListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.TemperatureMeasurementCluster) cluster)
                  .readAcceptedCommandListAttribute(
                      (ChipClusters.TemperatureMeasurementCluster
                              .AcceptedCommandListAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedTemperatureMeasurementClusterAcceptedCommandListAttributeCallback(),
            readTemperatureMeasurementAcceptedCommandListCommandParams);
    result.put(
        "readAcceptedCommandListAttribute",
        readTemperatureMeasurementAcceptedCommandListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readTemperatureMeasurementEventListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readTemperatureMeasurementEventListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.TemperatureMeasurementCluster) cluster)
                  .readEventListAttribute(
                      (ChipClusters.TemperatureMeasurementCluster.EventListAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedTemperatureMeasurementClusterEventListAttributeCallback(),
            readTemperatureMeasurementEventListCommandParams);
    result.put(
        "readEventListAttribute", readTemperatureMeasurementEventListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readTemperatureMeasurementAttributeListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readTemperatureMeasurementAttributeListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.TemperatureMeasurementCluster) cluster)
                  .readAttributeListAttribute(
                      (ChipClusters.TemperatureMeasurementCluster.AttributeListAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedTemperatureMeasurementClusterAttributeListAttributeCallback(),
            readTemperatureMeasurementAttributeListCommandParams);
    result.put(
        "readAttributeListAttribute",
        readTemperatureMeasurementAttributeListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readTemperatureMeasurementFeatureMapCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readTemperatureMeasurementFeatureMapAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.TemperatureMeasurementCluster) cluster)
                  .readFeatureMapAttribute((ChipClusters.LongAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedLongAttributeCallback(),
            readTemperatureMeasurementFeatureMapCommandParams);
    result.put(
        "readFeatureMapAttribute", readTemperatureMeasurementFeatureMapAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readTemperatureMeasurementClusterRevisionCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readTemperatureMeasurementClusterRevisionAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.TemperatureMeasurementCluster) cluster)
                  .readClusterRevisionAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readTemperatureMeasurementClusterRevisionCommandParams);
    result.put(
        "readClusterRevisionAttribute",
        readTemperatureMeasurementClusterRevisionAttributeInteractionInfo);

    return result;
  }

  private static Map<String, InteractionInfo> readPressureMeasurementInteractionInfo() {
    Map<String, InteractionInfo> result = new LinkedHashMap<>();
    Map<String, CommandParameterInfo> readPressureMeasurementMeasuredValueCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readPressureMeasurementMeasuredValueAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.PressureMeasurementCluster) cluster)
                  .readMeasuredValueAttribute(
                      (ChipClusters.PressureMeasurementCluster.MeasuredValueAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedPressureMeasurementClusterMeasuredValueAttributeCallback(),
            readPressureMeasurementMeasuredValueCommandParams);
    result.put(
        "readMeasuredValueAttribute", readPressureMeasurementMeasuredValueAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readPressureMeasurementMinMeasuredValueCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readPressureMeasurementMinMeasuredValueAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.PressureMeasurementCluster) cluster)
                  .readMinMeasuredValueAttribute(
                      (ChipClusters.PressureMeasurementCluster.MinMeasuredValueAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedPressureMeasurementClusterMinMeasuredValueAttributeCallback(),
            readPressureMeasurementMinMeasuredValueCommandParams);
    result.put(
        "readMinMeasuredValueAttribute",
        readPressureMeasurementMinMeasuredValueAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readPressureMeasurementMaxMeasuredValueCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readPressureMeasurementMaxMeasuredValueAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.PressureMeasurementCluster) cluster)
                  .readMaxMeasuredValueAttribute(
                      (ChipClusters.PressureMeasurementCluster.MaxMeasuredValueAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedPressureMeasurementClusterMaxMeasuredValueAttributeCallback(),
            readPressureMeasurementMaxMeasuredValueCommandParams);
    result.put(
        "readMaxMeasuredValueAttribute",
        readPressureMeasurementMaxMeasuredValueAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readPressureMeasurementToleranceCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readPressureMeasurementToleranceAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.PressureMeasurementCluster) cluster)
                  .readToleranceAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readPressureMeasurementToleranceCommandParams);
    result.put("readToleranceAttribute", readPressureMeasurementToleranceAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readPressureMeasurementScaledValueCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readPressureMeasurementScaledValueAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.PressureMeasurementCluster) cluster)
                  .readScaledValueAttribute(
                      (ChipClusters.PressureMeasurementCluster.ScaledValueAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedPressureMeasurementClusterScaledValueAttributeCallback(),
            readPressureMeasurementScaledValueCommandParams);
    result.put(
        "readScaledValueAttribute", readPressureMeasurementScaledValueAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readPressureMeasurementMinScaledValueCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readPressureMeasurementMinScaledValueAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.PressureMeasurementCluster) cluster)
                  .readMinScaledValueAttribute(
                      (ChipClusters.PressureMeasurementCluster.MinScaledValueAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedPressureMeasurementClusterMinScaledValueAttributeCallback(),
            readPressureMeasurementMinScaledValueCommandParams);
    result.put(
        "readMinScaledValueAttribute",
        readPressureMeasurementMinScaledValueAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readPressureMeasurementMaxScaledValueCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readPressureMeasurementMaxScaledValueAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.PressureMeasurementCluster) cluster)
                  .readMaxScaledValueAttribute(
                      (ChipClusters.PressureMeasurementCluster.MaxScaledValueAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedPressureMeasurementClusterMaxScaledValueAttributeCallback(),
            readPressureMeasurementMaxScaledValueCommandParams);
    result.put(
        "readMaxScaledValueAttribute",
        readPressureMeasurementMaxScaledValueAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readPressureMeasurementScaledToleranceCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readPressureMeasurementScaledToleranceAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.PressureMeasurementCluster) cluster)
                  .readScaledToleranceAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readPressureMeasurementScaledToleranceCommandParams);
    result.put(
        "readScaledToleranceAttribute",
        readPressureMeasurementScaledToleranceAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readPressureMeasurementScaleCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readPressureMeasurementScaleAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.PressureMeasurementCluster) cluster)
                  .readScaleAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readPressureMeasurementScaleCommandParams);
    result.put("readScaleAttribute", readPressureMeasurementScaleAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readPressureMeasurementGeneratedCommandListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readPressureMeasurementGeneratedCommandListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.PressureMeasurementCluster) cluster)
                  .readGeneratedCommandListAttribute(
                      (ChipClusters.PressureMeasurementCluster
                              .GeneratedCommandListAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedPressureMeasurementClusterGeneratedCommandListAttributeCallback(),
            readPressureMeasurementGeneratedCommandListCommandParams);
    result.put(
        "readGeneratedCommandListAttribute",
        readPressureMeasurementGeneratedCommandListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readPressureMeasurementAcceptedCommandListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readPressureMeasurementAcceptedCommandListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.PressureMeasurementCluster) cluster)
                  .readAcceptedCommandListAttribute(
                      (ChipClusters.PressureMeasurementCluster.AcceptedCommandListAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedPressureMeasurementClusterAcceptedCommandListAttributeCallback(),
            readPressureMeasurementAcceptedCommandListCommandParams);
    result.put(
        "readAcceptedCommandListAttribute",
        readPressureMeasurementAcceptedCommandListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readPressureMeasurementEventListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readPressureMeasurementEventListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.PressureMeasurementCluster) cluster)
                  .readEventListAttribute(
                      (ChipClusters.PressureMeasurementCluster.EventListAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedPressureMeasurementClusterEventListAttributeCallback(),
            readPressureMeasurementEventListCommandParams);
    result.put("readEventListAttribute", readPressureMeasurementEventListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readPressureMeasurementAttributeListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readPressureMeasurementAttributeListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.PressureMeasurementCluster) cluster)
                  .readAttributeListAttribute(
                      (ChipClusters.PressureMeasurementCluster.AttributeListAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedPressureMeasurementClusterAttributeListAttributeCallback(),
            readPressureMeasurementAttributeListCommandParams);
    result.put(
        "readAttributeListAttribute", readPressureMeasurementAttributeListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readPressureMeasurementFeatureMapCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readPressureMeasurementFeatureMapAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.PressureMeasurementCluster) cluster)
                  .readFeatureMapAttribute((ChipClusters.LongAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedLongAttributeCallback(),
            readPressureMeasurementFeatureMapCommandParams);
    result.put(
        "readFeatureMapAttribute", readPressureMeasurementFeatureMapAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readPressureMeasurementClusterRevisionCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readPressureMeasurementClusterRevisionAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.PressureMeasurementCluster) cluster)
                  .readClusterRevisionAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readPressureMeasurementClusterRevisionCommandParams);
    result.put(
        "readClusterRevisionAttribute",
        readPressureMeasurementClusterRevisionAttributeInteractionInfo);

    return result;
  }

  private static Map<String, InteractionInfo> readFlowMeasurementInteractionInfo() {
    Map<String, InteractionInfo> result = new LinkedHashMap<>();
    Map<String, CommandParameterInfo> readFlowMeasurementMeasuredValueCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readFlowMeasurementMeasuredValueAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.FlowMeasurementCluster) cluster)
                  .readMeasuredValueAttribute(
                      (ChipClusters.FlowMeasurementCluster.MeasuredValueAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedFlowMeasurementClusterMeasuredValueAttributeCallback(),
            readFlowMeasurementMeasuredValueCommandParams);
    result.put(
        "readMeasuredValueAttribute", readFlowMeasurementMeasuredValueAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readFlowMeasurementMinMeasuredValueCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readFlowMeasurementMinMeasuredValueAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.FlowMeasurementCluster) cluster)
                  .readMinMeasuredValueAttribute(
                      (ChipClusters.FlowMeasurementCluster.MinMeasuredValueAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedFlowMeasurementClusterMinMeasuredValueAttributeCallback(),
            readFlowMeasurementMinMeasuredValueCommandParams);
    result.put(
        "readMinMeasuredValueAttribute",
        readFlowMeasurementMinMeasuredValueAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readFlowMeasurementMaxMeasuredValueCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readFlowMeasurementMaxMeasuredValueAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.FlowMeasurementCluster) cluster)
                  .readMaxMeasuredValueAttribute(
                      (ChipClusters.FlowMeasurementCluster.MaxMeasuredValueAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedFlowMeasurementClusterMaxMeasuredValueAttributeCallback(),
            readFlowMeasurementMaxMeasuredValueCommandParams);
    result.put(
        "readMaxMeasuredValueAttribute",
        readFlowMeasurementMaxMeasuredValueAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readFlowMeasurementToleranceCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readFlowMeasurementToleranceAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.FlowMeasurementCluster) cluster)
                  .readToleranceAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readFlowMeasurementToleranceCommandParams);
    result.put("readToleranceAttribute", readFlowMeasurementToleranceAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readFlowMeasurementGeneratedCommandListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readFlowMeasurementGeneratedCommandListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.FlowMeasurementCluster) cluster)
                  .readGeneratedCommandListAttribute(
                      (ChipClusters.FlowMeasurementCluster.GeneratedCommandListAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedFlowMeasurementClusterGeneratedCommandListAttributeCallback(),
            readFlowMeasurementGeneratedCommandListCommandParams);
    result.put(
        "readGeneratedCommandListAttribute",
        readFlowMeasurementGeneratedCommandListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readFlowMeasurementAcceptedCommandListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readFlowMeasurementAcceptedCommandListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.FlowMeasurementCluster) cluster)
                  .readAcceptedCommandListAttribute(
                      (ChipClusters.FlowMeasurementCluster.AcceptedCommandListAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedFlowMeasurementClusterAcceptedCommandListAttributeCallback(),
            readFlowMeasurementAcceptedCommandListCommandParams);
    result.put(
        "readAcceptedCommandListAttribute",
        readFlowMeasurementAcceptedCommandListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readFlowMeasurementEventListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readFlowMeasurementEventListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.FlowMeasurementCluster) cluster)
                  .readEventListAttribute(
                      (ChipClusters.FlowMeasurementCluster.EventListAttributeCallback) callback);
            },
            () ->
                new ClusterInfoMapping.DelegatedFlowMeasurementClusterEventListAttributeCallback(),
            readFlowMeasurementEventListCommandParams);
    result.put("readEventListAttribute", readFlowMeasurementEventListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readFlowMeasurementAttributeListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readFlowMeasurementAttributeListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.FlowMeasurementCluster) cluster)
                  .readAttributeListAttribute(
                      (ChipClusters.FlowMeasurementCluster.AttributeListAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedFlowMeasurementClusterAttributeListAttributeCallback(),
            readFlowMeasurementAttributeListCommandParams);
    result.put(
        "readAttributeListAttribute", readFlowMeasurementAttributeListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readFlowMeasurementFeatureMapCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readFlowMeasurementFeatureMapAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.FlowMeasurementCluster) cluster)
                  .readFeatureMapAttribute((ChipClusters.LongAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedLongAttributeCallback(),
            readFlowMeasurementFeatureMapCommandParams);
    result.put("readFeatureMapAttribute", readFlowMeasurementFeatureMapAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readFlowMeasurementClusterRevisionCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readFlowMeasurementClusterRevisionAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.FlowMeasurementCluster) cluster)
                  .readClusterRevisionAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readFlowMeasurementClusterRevisionCommandParams);
    result.put(
        "readClusterRevisionAttribute", readFlowMeasurementClusterRevisionAttributeInteractionInfo);

    return result;
  }

  private static Map<String, InteractionInfo> readRelativeHumidityMeasurementInteractionInfo() {
    Map<String, InteractionInfo> result = new LinkedHashMap<>();
    Map<String, CommandParameterInfo> readRelativeHumidityMeasurementMeasuredValueCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readRelativeHumidityMeasurementMeasuredValueAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.RelativeHumidityMeasurementCluster) cluster)
                  .readMeasuredValueAttribute(
                      (ChipClusters.RelativeHumidityMeasurementCluster
                              .MeasuredValueAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedRelativeHumidityMeasurementClusterMeasuredValueAttributeCallback(),
            readRelativeHumidityMeasurementMeasuredValueCommandParams);
    result.put(
        "readMeasuredValueAttribute",
        readRelativeHumidityMeasurementMeasuredValueAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readRelativeHumidityMeasurementMinMeasuredValueCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readRelativeHumidityMeasurementMinMeasuredValueAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.RelativeHumidityMeasurementCluster) cluster)
                  .readMinMeasuredValueAttribute(
                      (ChipClusters.RelativeHumidityMeasurementCluster
                              .MinMeasuredValueAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedRelativeHumidityMeasurementClusterMinMeasuredValueAttributeCallback(),
            readRelativeHumidityMeasurementMinMeasuredValueCommandParams);
    result.put(
        "readMinMeasuredValueAttribute",
        readRelativeHumidityMeasurementMinMeasuredValueAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readRelativeHumidityMeasurementMaxMeasuredValueCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readRelativeHumidityMeasurementMaxMeasuredValueAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.RelativeHumidityMeasurementCluster) cluster)
                  .readMaxMeasuredValueAttribute(
                      (ChipClusters.RelativeHumidityMeasurementCluster
                              .MaxMeasuredValueAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedRelativeHumidityMeasurementClusterMaxMeasuredValueAttributeCallback(),
            readRelativeHumidityMeasurementMaxMeasuredValueCommandParams);
    result.put(
        "readMaxMeasuredValueAttribute",
        readRelativeHumidityMeasurementMaxMeasuredValueAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readRelativeHumidityMeasurementToleranceCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readRelativeHumidityMeasurementToleranceAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.RelativeHumidityMeasurementCluster) cluster)
                  .readToleranceAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readRelativeHumidityMeasurementToleranceCommandParams);
    result.put(
        "readToleranceAttribute", readRelativeHumidityMeasurementToleranceAttributeInteractionInfo);
    Map<String, CommandParameterInfo>
        readRelativeHumidityMeasurementGeneratedCommandListCommandParams =
            new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readRelativeHumidityMeasurementGeneratedCommandListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.RelativeHumidityMeasurementCluster) cluster)
                  .readGeneratedCommandListAttribute(
                      (ChipClusters.RelativeHumidityMeasurementCluster
                              .GeneratedCommandListAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedRelativeHumidityMeasurementClusterGeneratedCommandListAttributeCallback(),
            readRelativeHumidityMeasurementGeneratedCommandListCommandParams);
    result.put(
        "readGeneratedCommandListAttribute",
        readRelativeHumidityMeasurementGeneratedCommandListAttributeInteractionInfo);
    Map<String, CommandParameterInfo>
        readRelativeHumidityMeasurementAcceptedCommandListCommandParams =
            new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readRelativeHumidityMeasurementAcceptedCommandListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.RelativeHumidityMeasurementCluster) cluster)
                  .readAcceptedCommandListAttribute(
                      (ChipClusters.RelativeHumidityMeasurementCluster
                              .AcceptedCommandListAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedRelativeHumidityMeasurementClusterAcceptedCommandListAttributeCallback(),
            readRelativeHumidityMeasurementAcceptedCommandListCommandParams);
    result.put(
        "readAcceptedCommandListAttribute",
        readRelativeHumidityMeasurementAcceptedCommandListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readRelativeHumidityMeasurementEventListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readRelativeHumidityMeasurementEventListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.RelativeHumidityMeasurementCluster) cluster)
                  .readEventListAttribute(
                      (ChipClusters.RelativeHumidityMeasurementCluster.EventListAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedRelativeHumidityMeasurementClusterEventListAttributeCallback(),
            readRelativeHumidityMeasurementEventListCommandParams);
    result.put(
        "readEventListAttribute", readRelativeHumidityMeasurementEventListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readRelativeHumidityMeasurementAttributeListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readRelativeHumidityMeasurementAttributeListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.RelativeHumidityMeasurementCluster) cluster)
                  .readAttributeListAttribute(
                      (ChipClusters.RelativeHumidityMeasurementCluster
                              .AttributeListAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedRelativeHumidityMeasurementClusterAttributeListAttributeCallback(),
            readRelativeHumidityMeasurementAttributeListCommandParams);
    result.put(
        "readAttributeListAttribute",
        readRelativeHumidityMeasurementAttributeListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readRelativeHumidityMeasurementFeatureMapCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readRelativeHumidityMeasurementFeatureMapAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.RelativeHumidityMeasurementCluster) cluster)
                  .readFeatureMapAttribute((ChipClusters.LongAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedLongAttributeCallback(),
            readRelativeHumidityMeasurementFeatureMapCommandParams);
    result.put(
        "readFeatureMapAttribute",
        readRelativeHumidityMeasurementFeatureMapAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readRelativeHumidityMeasurementClusterRevisionCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readRelativeHumidityMeasurementClusterRevisionAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.RelativeHumidityMeasurementCluster) cluster)
                  .readClusterRevisionAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readRelativeHumidityMeasurementClusterRevisionCommandParams);
    result.put(
        "readClusterRevisionAttribute",
        readRelativeHumidityMeasurementClusterRevisionAttributeInteractionInfo);

    return result;
  }

  private static Map<String, InteractionInfo> readOccupancySensingInteractionInfo() {
    Map<String, InteractionInfo> result = new LinkedHashMap<>();
    Map<String, CommandParameterInfo> readOccupancySensingOccupancyCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readOccupancySensingOccupancyAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.OccupancySensingCluster) cluster)
                  .readOccupancyAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readOccupancySensingOccupancyCommandParams);
    result.put("readOccupancyAttribute", readOccupancySensingOccupancyAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readOccupancySensingOccupancySensorTypeCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readOccupancySensingOccupancySensorTypeAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.OccupancySensingCluster) cluster)
                  .readOccupancySensorTypeAttribute(
                      (ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readOccupancySensingOccupancySensorTypeCommandParams);
    result.put(
        "readOccupancySensorTypeAttribute",
        readOccupancySensingOccupancySensorTypeAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readOccupancySensingOccupancySensorTypeBitmapCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readOccupancySensingOccupancySensorTypeBitmapAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.OccupancySensingCluster) cluster)
                  .readOccupancySensorTypeBitmapAttribute(
                      (ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readOccupancySensingOccupancySensorTypeBitmapCommandParams);
    result.put(
        "readOccupancySensorTypeBitmapAttribute",
        readOccupancySensingOccupancySensorTypeBitmapAttributeInteractionInfo);
    Map<String, CommandParameterInfo>
        readOccupancySensingPIROccupiedToUnoccupiedDelayCommandParams =
            new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readOccupancySensingPIROccupiedToUnoccupiedDelayAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.OccupancySensingCluster) cluster)
                  .readPIROccupiedToUnoccupiedDelayAttribute(
                      (ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readOccupancySensingPIROccupiedToUnoccupiedDelayCommandParams);
    result.put(
        "readPIROccupiedToUnoccupiedDelayAttribute",
        readOccupancySensingPIROccupiedToUnoccupiedDelayAttributeInteractionInfo);
    Map<String, CommandParameterInfo>
        readOccupancySensingPIRUnoccupiedToOccupiedDelayCommandParams =
            new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readOccupancySensingPIRUnoccupiedToOccupiedDelayAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.OccupancySensingCluster) cluster)
                  .readPIRUnoccupiedToOccupiedDelayAttribute(
                      (ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readOccupancySensingPIRUnoccupiedToOccupiedDelayCommandParams);
    result.put(
        "readPIRUnoccupiedToOccupiedDelayAttribute",
        readOccupancySensingPIRUnoccupiedToOccupiedDelayAttributeInteractionInfo);
    Map<String, CommandParameterInfo>
        readOccupancySensingPIRUnoccupiedToOccupiedThresholdCommandParams =
            new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readOccupancySensingPIRUnoccupiedToOccupiedThresholdAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.OccupancySensingCluster) cluster)
                  .readPIRUnoccupiedToOccupiedThresholdAttribute(
                      (ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readOccupancySensingPIRUnoccupiedToOccupiedThresholdCommandParams);
    result.put(
        "readPIRUnoccupiedToOccupiedThresholdAttribute",
        readOccupancySensingPIRUnoccupiedToOccupiedThresholdAttributeInteractionInfo);
    Map<String, CommandParameterInfo>
        readOccupancySensingUltrasonicOccupiedToUnoccupiedDelayCommandParams =
            new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo
        readOccupancySensingUltrasonicOccupiedToUnoccupiedDelayAttributeInteractionInfo =
            new InteractionInfo(
                (cluster, callback, commandArguments) -> {
                  ((ChipClusters.OccupancySensingCluster) cluster)
                      .readUltrasonicOccupiedToUnoccupiedDelayAttribute(
                          (ChipClusters.IntegerAttributeCallback) callback);
                },
                () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
                readOccupancySensingUltrasonicOccupiedToUnoccupiedDelayCommandParams);
    result.put(
        "readUltrasonicOccupiedToUnoccupiedDelayAttribute",
        readOccupancySensingUltrasonicOccupiedToUnoccupiedDelayAttributeInteractionInfo);
    Map<String, CommandParameterInfo>
        readOccupancySensingUltrasonicUnoccupiedToOccupiedDelayCommandParams =
            new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo
        readOccupancySensingUltrasonicUnoccupiedToOccupiedDelayAttributeInteractionInfo =
            new InteractionInfo(
                (cluster, callback, commandArguments) -> {
                  ((ChipClusters.OccupancySensingCluster) cluster)
                      .readUltrasonicUnoccupiedToOccupiedDelayAttribute(
                          (ChipClusters.IntegerAttributeCallback) callback);
                },
                () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
                readOccupancySensingUltrasonicUnoccupiedToOccupiedDelayCommandParams);
    result.put(
        "readUltrasonicUnoccupiedToOccupiedDelayAttribute",
        readOccupancySensingUltrasonicUnoccupiedToOccupiedDelayAttributeInteractionInfo);
    Map<String, CommandParameterInfo>
        readOccupancySensingUltrasonicUnoccupiedToOccupiedThresholdCommandParams =
            new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo
        readOccupancySensingUltrasonicUnoccupiedToOccupiedThresholdAttributeInteractionInfo =
            new InteractionInfo(
                (cluster, callback, commandArguments) -> {
                  ((ChipClusters.OccupancySensingCluster) cluster)
                      .readUltrasonicUnoccupiedToOccupiedThresholdAttribute(
                          (ChipClusters.IntegerAttributeCallback) callback);
                },
                () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
                readOccupancySensingUltrasonicUnoccupiedToOccupiedThresholdCommandParams);
    result.put(
        "readUltrasonicUnoccupiedToOccupiedThresholdAttribute",
        readOccupancySensingUltrasonicUnoccupiedToOccupiedThresholdAttributeInteractionInfo);
    Map<String, CommandParameterInfo>
        readOccupancySensingPhysicalContactOccupiedToUnoccupiedDelayCommandParams =
            new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo
        readOccupancySensingPhysicalContactOccupiedToUnoccupiedDelayAttributeInteractionInfo =
            new InteractionInfo(
                (cluster, callback, commandArguments) -> {
                  ((ChipClusters.OccupancySensingCluster) cluster)
                      .readPhysicalContactOccupiedToUnoccupiedDelayAttribute(
                          (ChipClusters.IntegerAttributeCallback) callback);
                },
                () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
                readOccupancySensingPhysicalContactOccupiedToUnoccupiedDelayCommandParams);
    result.put(
        "readPhysicalContactOccupiedToUnoccupiedDelayAttribute",
        readOccupancySensingPhysicalContactOccupiedToUnoccupiedDelayAttributeInteractionInfo);
    Map<String, CommandParameterInfo>
        readOccupancySensingPhysicalContactUnoccupiedToOccupiedDelayCommandParams =
            new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo
        readOccupancySensingPhysicalContactUnoccupiedToOccupiedDelayAttributeInteractionInfo =
            new InteractionInfo(
                (cluster, callback, commandArguments) -> {
                  ((ChipClusters.OccupancySensingCluster) cluster)
                      .readPhysicalContactUnoccupiedToOccupiedDelayAttribute(
                          (ChipClusters.IntegerAttributeCallback) callback);
                },
                () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
                readOccupancySensingPhysicalContactUnoccupiedToOccupiedDelayCommandParams);
    result.put(
        "readPhysicalContactUnoccupiedToOccupiedDelayAttribute",
        readOccupancySensingPhysicalContactUnoccupiedToOccupiedDelayAttributeInteractionInfo);
    Map<String, CommandParameterInfo>
        readOccupancySensingPhysicalContactUnoccupiedToOccupiedThresholdCommandParams =
            new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo
        readOccupancySensingPhysicalContactUnoccupiedToOccupiedThresholdAttributeInteractionInfo =
            new InteractionInfo(
                (cluster, callback, commandArguments) -> {
                  ((ChipClusters.OccupancySensingCluster) cluster)
                      .readPhysicalContactUnoccupiedToOccupiedThresholdAttribute(
                          (ChipClusters.IntegerAttributeCallback) callback);
                },
                () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
                readOccupancySensingPhysicalContactUnoccupiedToOccupiedThresholdCommandParams);
    result.put(
        "readPhysicalContactUnoccupiedToOccupiedThresholdAttribute",
        readOccupancySensingPhysicalContactUnoccupiedToOccupiedThresholdAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readOccupancySensingGeneratedCommandListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readOccupancySensingGeneratedCommandListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.OccupancySensingCluster) cluster)
                  .readGeneratedCommandListAttribute(
                      (ChipClusters.OccupancySensingCluster.GeneratedCommandListAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedOccupancySensingClusterGeneratedCommandListAttributeCallback(),
            readOccupancySensingGeneratedCommandListCommandParams);
    result.put(
        "readGeneratedCommandListAttribute",
        readOccupancySensingGeneratedCommandListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readOccupancySensingAcceptedCommandListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readOccupancySensingAcceptedCommandListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.OccupancySensingCluster) cluster)
                  .readAcceptedCommandListAttribute(
                      (ChipClusters.OccupancySensingCluster.AcceptedCommandListAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedOccupancySensingClusterAcceptedCommandListAttributeCallback(),
            readOccupancySensingAcceptedCommandListCommandParams);
    result.put(
        "readAcceptedCommandListAttribute",
        readOccupancySensingAcceptedCommandListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readOccupancySensingEventListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readOccupancySensingEventListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.OccupancySensingCluster) cluster)
                  .readEventListAttribute(
                      (ChipClusters.OccupancySensingCluster.EventListAttributeCallback) callback);
            },
            () ->
                new ClusterInfoMapping.DelegatedOccupancySensingClusterEventListAttributeCallback(),
            readOccupancySensingEventListCommandParams);
    result.put("readEventListAttribute", readOccupancySensingEventListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readOccupancySensingAttributeListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readOccupancySensingAttributeListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.OccupancySensingCluster) cluster)
                  .readAttributeListAttribute(
                      (ChipClusters.OccupancySensingCluster.AttributeListAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedOccupancySensingClusterAttributeListAttributeCallback(),
            readOccupancySensingAttributeListCommandParams);
    result.put(
        "readAttributeListAttribute", readOccupancySensingAttributeListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readOccupancySensingFeatureMapCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readOccupancySensingFeatureMapAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.OccupancySensingCluster) cluster)
                  .readFeatureMapAttribute((ChipClusters.LongAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedLongAttributeCallback(),
            readOccupancySensingFeatureMapCommandParams);
    result.put("readFeatureMapAttribute", readOccupancySensingFeatureMapAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readOccupancySensingClusterRevisionCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readOccupancySensingClusterRevisionAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.OccupancySensingCluster) cluster)
                  .readClusterRevisionAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readOccupancySensingClusterRevisionCommandParams);
    result.put(
        "readClusterRevisionAttribute",
        readOccupancySensingClusterRevisionAttributeInteractionInfo);

    return result;
  }

  private static Map<String, InteractionInfo> readWakeOnLanInteractionInfo() {
    Map<String, InteractionInfo> result = new LinkedHashMap<>();
    Map<String, CommandParameterInfo> readWakeOnLanMACAddressCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readWakeOnLanMACAddressAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.WakeOnLanCluster) cluster)
                  .readMACAddressAttribute((ChipClusters.CharStringAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedCharStringAttributeCallback(),
            readWakeOnLanMACAddressCommandParams);
    result.put("readMACAddressAttribute", readWakeOnLanMACAddressAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readWakeOnLanGeneratedCommandListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readWakeOnLanGeneratedCommandListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.WakeOnLanCluster) cluster)
                  .readGeneratedCommandListAttribute(
                      (ChipClusters.WakeOnLanCluster.GeneratedCommandListAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedWakeOnLanClusterGeneratedCommandListAttributeCallback(),
            readWakeOnLanGeneratedCommandListCommandParams);
    result.put(
        "readGeneratedCommandListAttribute",
        readWakeOnLanGeneratedCommandListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readWakeOnLanAcceptedCommandListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readWakeOnLanAcceptedCommandListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.WakeOnLanCluster) cluster)
                  .readAcceptedCommandListAttribute(
                      (ChipClusters.WakeOnLanCluster.AcceptedCommandListAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedWakeOnLanClusterAcceptedCommandListAttributeCallback(),
            readWakeOnLanAcceptedCommandListCommandParams);
    result.put(
        "readAcceptedCommandListAttribute",
        readWakeOnLanAcceptedCommandListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readWakeOnLanEventListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readWakeOnLanEventListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.WakeOnLanCluster) cluster)
                  .readEventListAttribute(
                      (ChipClusters.WakeOnLanCluster.EventListAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedWakeOnLanClusterEventListAttributeCallback(),
            readWakeOnLanEventListCommandParams);
    result.put("readEventListAttribute", readWakeOnLanEventListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readWakeOnLanAttributeListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readWakeOnLanAttributeListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.WakeOnLanCluster) cluster)
                  .readAttributeListAttribute(
                      (ChipClusters.WakeOnLanCluster.AttributeListAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedWakeOnLanClusterAttributeListAttributeCallback(),
            readWakeOnLanAttributeListCommandParams);
    result.put("readAttributeListAttribute", readWakeOnLanAttributeListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readWakeOnLanFeatureMapCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readWakeOnLanFeatureMapAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.WakeOnLanCluster) cluster)
                  .readFeatureMapAttribute((ChipClusters.LongAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedLongAttributeCallback(),
            readWakeOnLanFeatureMapCommandParams);
    result.put("readFeatureMapAttribute", readWakeOnLanFeatureMapAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readWakeOnLanClusterRevisionCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readWakeOnLanClusterRevisionAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.WakeOnLanCluster) cluster)
                  .readClusterRevisionAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readWakeOnLanClusterRevisionCommandParams);
    result.put(
        "readClusterRevisionAttribute", readWakeOnLanClusterRevisionAttributeInteractionInfo);

    return result;
  }

  private static Map<String, InteractionInfo> readChannelInteractionInfo() {
    Map<String, InteractionInfo> result = new LinkedHashMap<>();
    Map<String, CommandParameterInfo> readChannelChannelListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readChannelChannelListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ChannelCluster) cluster)
                  .readChannelListAttribute(
                      (ChipClusters.ChannelCluster.ChannelListAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedChannelClusterChannelListAttributeCallback(),
            readChannelChannelListCommandParams);
    result.put("readChannelListAttribute", readChannelChannelListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readChannelGeneratedCommandListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readChannelGeneratedCommandListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ChannelCluster) cluster)
                  .readGeneratedCommandListAttribute(
                      (ChipClusters.ChannelCluster.GeneratedCommandListAttributeCallback) callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedChannelClusterGeneratedCommandListAttributeCallback(),
            readChannelGeneratedCommandListCommandParams);
    result.put(
        "readGeneratedCommandListAttribute",
        readChannelGeneratedCommandListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readChannelAcceptedCommandListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readChannelAcceptedCommandListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ChannelCluster) cluster)
                  .readAcceptedCommandListAttribute(
                      (ChipClusters.ChannelCluster.AcceptedCommandListAttributeCallback) callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedChannelClusterAcceptedCommandListAttributeCallback(),
            readChannelAcceptedCommandListCommandParams);
    result.put(
        "readAcceptedCommandListAttribute", readChannelAcceptedCommandListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readChannelEventListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readChannelEventListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ChannelCluster) cluster)
                  .readEventListAttribute(
                      (ChipClusters.ChannelCluster.EventListAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedChannelClusterEventListAttributeCallback(),
            readChannelEventListCommandParams);
    result.put("readEventListAttribute", readChannelEventListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readChannelAttributeListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readChannelAttributeListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ChannelCluster) cluster)
                  .readAttributeListAttribute(
                      (ChipClusters.ChannelCluster.AttributeListAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedChannelClusterAttributeListAttributeCallback(),
            readChannelAttributeListCommandParams);
    result.put("readAttributeListAttribute", readChannelAttributeListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readChannelFeatureMapCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readChannelFeatureMapAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ChannelCluster) cluster)
                  .readFeatureMapAttribute((ChipClusters.LongAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedLongAttributeCallback(),
            readChannelFeatureMapCommandParams);
    result.put("readFeatureMapAttribute", readChannelFeatureMapAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readChannelClusterRevisionCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readChannelClusterRevisionAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ChannelCluster) cluster)
                  .readClusterRevisionAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readChannelClusterRevisionCommandParams);
    result.put("readClusterRevisionAttribute", readChannelClusterRevisionAttributeInteractionInfo);

    return result;
  }

  private static Map<String, InteractionInfo> readTargetNavigatorInteractionInfo() {
    Map<String, InteractionInfo> result = new LinkedHashMap<>();
    Map<String, CommandParameterInfo> readTargetNavigatorTargetListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readTargetNavigatorTargetListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.TargetNavigatorCluster) cluster)
                  .readTargetListAttribute(
                      (ChipClusters.TargetNavigatorCluster.TargetListAttributeCallback) callback);
            },
            () ->
                new ClusterInfoMapping.DelegatedTargetNavigatorClusterTargetListAttributeCallback(),
            readTargetNavigatorTargetListCommandParams);
    result.put("readTargetListAttribute", readTargetNavigatorTargetListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readTargetNavigatorCurrentTargetCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readTargetNavigatorCurrentTargetAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.TargetNavigatorCluster) cluster)
                  .readCurrentTargetAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readTargetNavigatorCurrentTargetCommandParams);
    result.put(
        "readCurrentTargetAttribute", readTargetNavigatorCurrentTargetAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readTargetNavigatorGeneratedCommandListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readTargetNavigatorGeneratedCommandListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.TargetNavigatorCluster) cluster)
                  .readGeneratedCommandListAttribute(
                      (ChipClusters.TargetNavigatorCluster.GeneratedCommandListAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedTargetNavigatorClusterGeneratedCommandListAttributeCallback(),
            readTargetNavigatorGeneratedCommandListCommandParams);
    result.put(
        "readGeneratedCommandListAttribute",
        readTargetNavigatorGeneratedCommandListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readTargetNavigatorAcceptedCommandListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readTargetNavigatorAcceptedCommandListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.TargetNavigatorCluster) cluster)
                  .readAcceptedCommandListAttribute(
                      (ChipClusters.TargetNavigatorCluster.AcceptedCommandListAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedTargetNavigatorClusterAcceptedCommandListAttributeCallback(),
            readTargetNavigatorAcceptedCommandListCommandParams);
    result.put(
        "readAcceptedCommandListAttribute",
        readTargetNavigatorAcceptedCommandListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readTargetNavigatorEventListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readTargetNavigatorEventListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.TargetNavigatorCluster) cluster)
                  .readEventListAttribute(
                      (ChipClusters.TargetNavigatorCluster.EventListAttributeCallback) callback);
            },
            () ->
                new ClusterInfoMapping.DelegatedTargetNavigatorClusterEventListAttributeCallback(),
            readTargetNavigatorEventListCommandParams);
    result.put("readEventListAttribute", readTargetNavigatorEventListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readTargetNavigatorAttributeListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readTargetNavigatorAttributeListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.TargetNavigatorCluster) cluster)
                  .readAttributeListAttribute(
                      (ChipClusters.TargetNavigatorCluster.AttributeListAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedTargetNavigatorClusterAttributeListAttributeCallback(),
            readTargetNavigatorAttributeListCommandParams);
    result.put(
        "readAttributeListAttribute", readTargetNavigatorAttributeListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readTargetNavigatorFeatureMapCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readTargetNavigatorFeatureMapAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.TargetNavigatorCluster) cluster)
                  .readFeatureMapAttribute((ChipClusters.LongAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedLongAttributeCallback(),
            readTargetNavigatorFeatureMapCommandParams);
    result.put("readFeatureMapAttribute", readTargetNavigatorFeatureMapAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readTargetNavigatorClusterRevisionCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readTargetNavigatorClusterRevisionAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.TargetNavigatorCluster) cluster)
                  .readClusterRevisionAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readTargetNavigatorClusterRevisionCommandParams);
    result.put(
        "readClusterRevisionAttribute", readTargetNavigatorClusterRevisionAttributeInteractionInfo);

    return result;
  }

  private static Map<String, InteractionInfo> readMediaPlaybackInteractionInfo() {
    Map<String, InteractionInfo> result = new LinkedHashMap<>();
    Map<String, CommandParameterInfo> readMediaPlaybackCurrentStateCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readMediaPlaybackCurrentStateAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.MediaPlaybackCluster) cluster)
                  .readCurrentStateAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readMediaPlaybackCurrentStateCommandParams);
    result.put("readCurrentStateAttribute", readMediaPlaybackCurrentStateAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readMediaPlaybackStartTimeCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readMediaPlaybackStartTimeAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.MediaPlaybackCluster) cluster)
                  .readStartTimeAttribute(
                      (ChipClusters.MediaPlaybackCluster.StartTimeAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedMediaPlaybackClusterStartTimeAttributeCallback(),
            readMediaPlaybackStartTimeCommandParams);
    result.put("readStartTimeAttribute", readMediaPlaybackStartTimeAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readMediaPlaybackDurationCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readMediaPlaybackDurationAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.MediaPlaybackCluster) cluster)
                  .readDurationAttribute(
                      (ChipClusters.MediaPlaybackCluster.DurationAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedMediaPlaybackClusterDurationAttributeCallback(),
            readMediaPlaybackDurationCommandParams);
    result.put("readDurationAttribute", readMediaPlaybackDurationAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readMediaPlaybackPlaybackSpeedCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readMediaPlaybackPlaybackSpeedAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.MediaPlaybackCluster) cluster)
                  .readPlaybackSpeedAttribute((ChipClusters.FloatAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedFloatAttributeCallback(),
            readMediaPlaybackPlaybackSpeedCommandParams);
    result.put(
        "readPlaybackSpeedAttribute", readMediaPlaybackPlaybackSpeedAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readMediaPlaybackSeekRangeEndCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readMediaPlaybackSeekRangeEndAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.MediaPlaybackCluster) cluster)
                  .readSeekRangeEndAttribute(
                      (ChipClusters.MediaPlaybackCluster.SeekRangeEndAttributeCallback) callback);
            },
            () ->
                new ClusterInfoMapping.DelegatedMediaPlaybackClusterSeekRangeEndAttributeCallback(),
            readMediaPlaybackSeekRangeEndCommandParams);
    result.put("readSeekRangeEndAttribute", readMediaPlaybackSeekRangeEndAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readMediaPlaybackSeekRangeStartCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readMediaPlaybackSeekRangeStartAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.MediaPlaybackCluster) cluster)
                  .readSeekRangeStartAttribute(
                      (ChipClusters.MediaPlaybackCluster.SeekRangeStartAttributeCallback) callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedMediaPlaybackClusterSeekRangeStartAttributeCallback(),
            readMediaPlaybackSeekRangeStartCommandParams);
    result.put(
        "readSeekRangeStartAttribute", readMediaPlaybackSeekRangeStartAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readMediaPlaybackGeneratedCommandListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readMediaPlaybackGeneratedCommandListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.MediaPlaybackCluster) cluster)
                  .readGeneratedCommandListAttribute(
                      (ChipClusters.MediaPlaybackCluster.GeneratedCommandListAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedMediaPlaybackClusterGeneratedCommandListAttributeCallback(),
            readMediaPlaybackGeneratedCommandListCommandParams);
    result.put(
        "readGeneratedCommandListAttribute",
        readMediaPlaybackGeneratedCommandListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readMediaPlaybackAcceptedCommandListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readMediaPlaybackAcceptedCommandListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.MediaPlaybackCluster) cluster)
                  .readAcceptedCommandListAttribute(
                      (ChipClusters.MediaPlaybackCluster.AcceptedCommandListAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedMediaPlaybackClusterAcceptedCommandListAttributeCallback(),
            readMediaPlaybackAcceptedCommandListCommandParams);
    result.put(
        "readAcceptedCommandListAttribute",
        readMediaPlaybackAcceptedCommandListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readMediaPlaybackEventListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readMediaPlaybackEventListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.MediaPlaybackCluster) cluster)
                  .readEventListAttribute(
                      (ChipClusters.MediaPlaybackCluster.EventListAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedMediaPlaybackClusterEventListAttributeCallback(),
            readMediaPlaybackEventListCommandParams);
    result.put("readEventListAttribute", readMediaPlaybackEventListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readMediaPlaybackAttributeListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readMediaPlaybackAttributeListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.MediaPlaybackCluster) cluster)
                  .readAttributeListAttribute(
                      (ChipClusters.MediaPlaybackCluster.AttributeListAttributeCallback) callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedMediaPlaybackClusterAttributeListAttributeCallback(),
            readMediaPlaybackAttributeListCommandParams);
    result.put(
        "readAttributeListAttribute", readMediaPlaybackAttributeListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readMediaPlaybackFeatureMapCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readMediaPlaybackFeatureMapAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.MediaPlaybackCluster) cluster)
                  .readFeatureMapAttribute((ChipClusters.LongAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedLongAttributeCallback(),
            readMediaPlaybackFeatureMapCommandParams);
    result.put("readFeatureMapAttribute", readMediaPlaybackFeatureMapAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readMediaPlaybackClusterRevisionCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readMediaPlaybackClusterRevisionAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.MediaPlaybackCluster) cluster)
                  .readClusterRevisionAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readMediaPlaybackClusterRevisionCommandParams);
    result.put(
        "readClusterRevisionAttribute", readMediaPlaybackClusterRevisionAttributeInteractionInfo);

    return result;
  }

  private static Map<String, InteractionInfo> readMediaInputInteractionInfo() {
    Map<String, InteractionInfo> result = new LinkedHashMap<>();
    Map<String, CommandParameterInfo> readMediaInputInputListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readMediaInputInputListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.MediaInputCluster) cluster)
                  .readInputListAttribute(
                      (ChipClusters.MediaInputCluster.InputListAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedMediaInputClusterInputListAttributeCallback(),
            readMediaInputInputListCommandParams);
    result.put("readInputListAttribute", readMediaInputInputListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readMediaInputCurrentInputCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readMediaInputCurrentInputAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.MediaInputCluster) cluster)
                  .readCurrentInputAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readMediaInputCurrentInputCommandParams);
    result.put("readCurrentInputAttribute", readMediaInputCurrentInputAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readMediaInputGeneratedCommandListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readMediaInputGeneratedCommandListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.MediaInputCluster) cluster)
                  .readGeneratedCommandListAttribute(
                      (ChipClusters.MediaInputCluster.GeneratedCommandListAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedMediaInputClusterGeneratedCommandListAttributeCallback(),
            readMediaInputGeneratedCommandListCommandParams);
    result.put(
        "readGeneratedCommandListAttribute",
        readMediaInputGeneratedCommandListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readMediaInputAcceptedCommandListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readMediaInputAcceptedCommandListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.MediaInputCluster) cluster)
                  .readAcceptedCommandListAttribute(
                      (ChipClusters.MediaInputCluster.AcceptedCommandListAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedMediaInputClusterAcceptedCommandListAttributeCallback(),
            readMediaInputAcceptedCommandListCommandParams);
    result.put(
        "readAcceptedCommandListAttribute",
        readMediaInputAcceptedCommandListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readMediaInputEventListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readMediaInputEventListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.MediaInputCluster) cluster)
                  .readEventListAttribute(
                      (ChipClusters.MediaInputCluster.EventListAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedMediaInputClusterEventListAttributeCallback(),
            readMediaInputEventListCommandParams);
    result.put("readEventListAttribute", readMediaInputEventListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readMediaInputAttributeListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readMediaInputAttributeListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.MediaInputCluster) cluster)
                  .readAttributeListAttribute(
                      (ChipClusters.MediaInputCluster.AttributeListAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedMediaInputClusterAttributeListAttributeCallback(),
            readMediaInputAttributeListCommandParams);
    result.put("readAttributeListAttribute", readMediaInputAttributeListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readMediaInputFeatureMapCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readMediaInputFeatureMapAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.MediaInputCluster) cluster)
                  .readFeatureMapAttribute((ChipClusters.LongAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedLongAttributeCallback(),
            readMediaInputFeatureMapCommandParams);
    result.put("readFeatureMapAttribute", readMediaInputFeatureMapAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readMediaInputClusterRevisionCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readMediaInputClusterRevisionAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.MediaInputCluster) cluster)
                  .readClusterRevisionAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readMediaInputClusterRevisionCommandParams);
    result.put(
        "readClusterRevisionAttribute", readMediaInputClusterRevisionAttributeInteractionInfo);

    return result;
  }

  private static Map<String, InteractionInfo> readLowPowerInteractionInfo() {
    Map<String, InteractionInfo> result = new LinkedHashMap<>();
    Map<String, CommandParameterInfo> readLowPowerGeneratedCommandListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readLowPowerGeneratedCommandListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.LowPowerCluster) cluster)
                  .readGeneratedCommandListAttribute(
                      (ChipClusters.LowPowerCluster.GeneratedCommandListAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedLowPowerClusterGeneratedCommandListAttributeCallback(),
            readLowPowerGeneratedCommandListCommandParams);
    result.put(
        "readGeneratedCommandListAttribute",
        readLowPowerGeneratedCommandListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readLowPowerAcceptedCommandListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readLowPowerAcceptedCommandListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.LowPowerCluster) cluster)
                  .readAcceptedCommandListAttribute(
                      (ChipClusters.LowPowerCluster.AcceptedCommandListAttributeCallback) callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedLowPowerClusterAcceptedCommandListAttributeCallback(),
            readLowPowerAcceptedCommandListCommandParams);
    result.put(
        "readAcceptedCommandListAttribute",
        readLowPowerAcceptedCommandListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readLowPowerEventListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readLowPowerEventListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.LowPowerCluster) cluster)
                  .readEventListAttribute(
                      (ChipClusters.LowPowerCluster.EventListAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedLowPowerClusterEventListAttributeCallback(),
            readLowPowerEventListCommandParams);
    result.put("readEventListAttribute", readLowPowerEventListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readLowPowerAttributeListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readLowPowerAttributeListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.LowPowerCluster) cluster)
                  .readAttributeListAttribute(
                      (ChipClusters.LowPowerCluster.AttributeListAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedLowPowerClusterAttributeListAttributeCallback(),
            readLowPowerAttributeListCommandParams);
    result.put("readAttributeListAttribute", readLowPowerAttributeListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readLowPowerFeatureMapCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readLowPowerFeatureMapAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.LowPowerCluster) cluster)
                  .readFeatureMapAttribute((ChipClusters.LongAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedLongAttributeCallback(),
            readLowPowerFeatureMapCommandParams);
    result.put("readFeatureMapAttribute", readLowPowerFeatureMapAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readLowPowerClusterRevisionCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readLowPowerClusterRevisionAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.LowPowerCluster) cluster)
                  .readClusterRevisionAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readLowPowerClusterRevisionCommandParams);
    result.put("readClusterRevisionAttribute", readLowPowerClusterRevisionAttributeInteractionInfo);

    return result;
  }

  private static Map<String, InteractionInfo> readKeypadInputInteractionInfo() {
    Map<String, InteractionInfo> result = new LinkedHashMap<>();
    Map<String, CommandParameterInfo> readKeypadInputGeneratedCommandListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readKeypadInputGeneratedCommandListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.KeypadInputCluster) cluster)
                  .readGeneratedCommandListAttribute(
                      (ChipClusters.KeypadInputCluster.GeneratedCommandListAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedKeypadInputClusterGeneratedCommandListAttributeCallback(),
            readKeypadInputGeneratedCommandListCommandParams);
    result.put(
        "readGeneratedCommandListAttribute",
        readKeypadInputGeneratedCommandListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readKeypadInputAcceptedCommandListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readKeypadInputAcceptedCommandListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.KeypadInputCluster) cluster)
                  .readAcceptedCommandListAttribute(
                      (ChipClusters.KeypadInputCluster.AcceptedCommandListAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedKeypadInputClusterAcceptedCommandListAttributeCallback(),
            readKeypadInputAcceptedCommandListCommandParams);
    result.put(
        "readAcceptedCommandListAttribute",
        readKeypadInputAcceptedCommandListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readKeypadInputEventListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readKeypadInputEventListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.KeypadInputCluster) cluster)
                  .readEventListAttribute(
                      (ChipClusters.KeypadInputCluster.EventListAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedKeypadInputClusterEventListAttributeCallback(),
            readKeypadInputEventListCommandParams);
    result.put("readEventListAttribute", readKeypadInputEventListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readKeypadInputAttributeListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readKeypadInputAttributeListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.KeypadInputCluster) cluster)
                  .readAttributeListAttribute(
                      (ChipClusters.KeypadInputCluster.AttributeListAttributeCallback) callback);
            },
            () ->
                new ClusterInfoMapping.DelegatedKeypadInputClusterAttributeListAttributeCallback(),
            readKeypadInputAttributeListCommandParams);
    result.put("readAttributeListAttribute", readKeypadInputAttributeListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readKeypadInputFeatureMapCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readKeypadInputFeatureMapAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.KeypadInputCluster) cluster)
                  .readFeatureMapAttribute((ChipClusters.LongAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedLongAttributeCallback(),
            readKeypadInputFeatureMapCommandParams);
    result.put("readFeatureMapAttribute", readKeypadInputFeatureMapAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readKeypadInputClusterRevisionCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readKeypadInputClusterRevisionAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.KeypadInputCluster) cluster)
                  .readClusterRevisionAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readKeypadInputClusterRevisionCommandParams);
    result.put(
        "readClusterRevisionAttribute", readKeypadInputClusterRevisionAttributeInteractionInfo);

    return result;
  }

  private static Map<String, InteractionInfo> readContentLauncherInteractionInfo() {
    Map<String, InteractionInfo> result = new LinkedHashMap<>();
    Map<String, CommandParameterInfo> readContentLauncherAcceptHeaderCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readContentLauncherAcceptHeaderAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ContentLauncherCluster) cluster)
                  .readAcceptHeaderAttribute(
                      (ChipClusters.ContentLauncherCluster.AcceptHeaderAttributeCallback) callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedContentLauncherClusterAcceptHeaderAttributeCallback(),
            readContentLauncherAcceptHeaderCommandParams);
    result.put(
        "readAcceptHeaderAttribute", readContentLauncherAcceptHeaderAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readContentLauncherSupportedStreamingProtocolsCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readContentLauncherSupportedStreamingProtocolsAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ContentLauncherCluster) cluster)
                  .readSupportedStreamingProtocolsAttribute(
                      (ChipClusters.LongAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedLongAttributeCallback(),
            readContentLauncherSupportedStreamingProtocolsCommandParams);
    result.put(
        "readSupportedStreamingProtocolsAttribute",
        readContentLauncherSupportedStreamingProtocolsAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readContentLauncherGeneratedCommandListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readContentLauncherGeneratedCommandListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ContentLauncherCluster) cluster)
                  .readGeneratedCommandListAttribute(
                      (ChipClusters.ContentLauncherCluster.GeneratedCommandListAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedContentLauncherClusterGeneratedCommandListAttributeCallback(),
            readContentLauncherGeneratedCommandListCommandParams);
    result.put(
        "readGeneratedCommandListAttribute",
        readContentLauncherGeneratedCommandListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readContentLauncherAcceptedCommandListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readContentLauncherAcceptedCommandListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ContentLauncherCluster) cluster)
                  .readAcceptedCommandListAttribute(
                      (ChipClusters.ContentLauncherCluster.AcceptedCommandListAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedContentLauncherClusterAcceptedCommandListAttributeCallback(),
            readContentLauncherAcceptedCommandListCommandParams);
    result.put(
        "readAcceptedCommandListAttribute",
        readContentLauncherAcceptedCommandListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readContentLauncherEventListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readContentLauncherEventListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ContentLauncherCluster) cluster)
                  .readEventListAttribute(
                      (ChipClusters.ContentLauncherCluster.EventListAttributeCallback) callback);
            },
            () ->
                new ClusterInfoMapping.DelegatedContentLauncherClusterEventListAttributeCallback(),
            readContentLauncherEventListCommandParams);
    result.put("readEventListAttribute", readContentLauncherEventListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readContentLauncherAttributeListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readContentLauncherAttributeListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ContentLauncherCluster) cluster)
                  .readAttributeListAttribute(
                      (ChipClusters.ContentLauncherCluster.AttributeListAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedContentLauncherClusterAttributeListAttributeCallback(),
            readContentLauncherAttributeListCommandParams);
    result.put(
        "readAttributeListAttribute", readContentLauncherAttributeListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readContentLauncherFeatureMapCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readContentLauncherFeatureMapAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ContentLauncherCluster) cluster)
                  .readFeatureMapAttribute((ChipClusters.LongAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedLongAttributeCallback(),
            readContentLauncherFeatureMapCommandParams);
    result.put("readFeatureMapAttribute", readContentLauncherFeatureMapAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readContentLauncherClusterRevisionCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readContentLauncherClusterRevisionAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ContentLauncherCluster) cluster)
                  .readClusterRevisionAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readContentLauncherClusterRevisionCommandParams);
    result.put(
        "readClusterRevisionAttribute", readContentLauncherClusterRevisionAttributeInteractionInfo);

    return result;
  }

  private static Map<String, InteractionInfo> readAudioOutputInteractionInfo() {
    Map<String, InteractionInfo> result = new LinkedHashMap<>();
    Map<String, CommandParameterInfo> readAudioOutputOutputListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readAudioOutputOutputListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.AudioOutputCluster) cluster)
                  .readOutputListAttribute(
                      (ChipClusters.AudioOutputCluster.OutputListAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedAudioOutputClusterOutputListAttributeCallback(),
            readAudioOutputOutputListCommandParams);
    result.put("readOutputListAttribute", readAudioOutputOutputListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readAudioOutputCurrentOutputCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readAudioOutputCurrentOutputAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.AudioOutputCluster) cluster)
                  .readCurrentOutputAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readAudioOutputCurrentOutputCommandParams);
    result.put("readCurrentOutputAttribute", readAudioOutputCurrentOutputAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readAudioOutputGeneratedCommandListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readAudioOutputGeneratedCommandListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.AudioOutputCluster) cluster)
                  .readGeneratedCommandListAttribute(
                      (ChipClusters.AudioOutputCluster.GeneratedCommandListAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedAudioOutputClusterGeneratedCommandListAttributeCallback(),
            readAudioOutputGeneratedCommandListCommandParams);
    result.put(
        "readGeneratedCommandListAttribute",
        readAudioOutputGeneratedCommandListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readAudioOutputAcceptedCommandListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readAudioOutputAcceptedCommandListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.AudioOutputCluster) cluster)
                  .readAcceptedCommandListAttribute(
                      (ChipClusters.AudioOutputCluster.AcceptedCommandListAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedAudioOutputClusterAcceptedCommandListAttributeCallback(),
            readAudioOutputAcceptedCommandListCommandParams);
    result.put(
        "readAcceptedCommandListAttribute",
        readAudioOutputAcceptedCommandListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readAudioOutputEventListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readAudioOutputEventListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.AudioOutputCluster) cluster)
                  .readEventListAttribute(
                      (ChipClusters.AudioOutputCluster.EventListAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedAudioOutputClusterEventListAttributeCallback(),
            readAudioOutputEventListCommandParams);
    result.put("readEventListAttribute", readAudioOutputEventListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readAudioOutputAttributeListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readAudioOutputAttributeListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.AudioOutputCluster) cluster)
                  .readAttributeListAttribute(
                      (ChipClusters.AudioOutputCluster.AttributeListAttributeCallback) callback);
            },
            () ->
                new ClusterInfoMapping.DelegatedAudioOutputClusterAttributeListAttributeCallback(),
            readAudioOutputAttributeListCommandParams);
    result.put("readAttributeListAttribute", readAudioOutputAttributeListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readAudioOutputFeatureMapCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readAudioOutputFeatureMapAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.AudioOutputCluster) cluster)
                  .readFeatureMapAttribute((ChipClusters.LongAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedLongAttributeCallback(),
            readAudioOutputFeatureMapCommandParams);
    result.put("readFeatureMapAttribute", readAudioOutputFeatureMapAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readAudioOutputClusterRevisionCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readAudioOutputClusterRevisionAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.AudioOutputCluster) cluster)
                  .readClusterRevisionAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readAudioOutputClusterRevisionCommandParams);
    result.put(
        "readClusterRevisionAttribute", readAudioOutputClusterRevisionAttributeInteractionInfo);

    return result;
  }

  private static Map<String, InteractionInfo> readApplicationLauncherInteractionInfo() {
    Map<String, InteractionInfo> result = new LinkedHashMap<>();
    Map<String, CommandParameterInfo> readApplicationLauncherCatalogListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readApplicationLauncherCatalogListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ApplicationLauncherCluster) cluster)
                  .readCatalogListAttribute(
                      (ChipClusters.ApplicationLauncherCluster.CatalogListAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedApplicationLauncherClusterCatalogListAttributeCallback(),
            readApplicationLauncherCatalogListCommandParams);
    result.put(
        "readCatalogListAttribute", readApplicationLauncherCatalogListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readApplicationLauncherGeneratedCommandListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readApplicationLauncherGeneratedCommandListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ApplicationLauncherCluster) cluster)
                  .readGeneratedCommandListAttribute(
                      (ChipClusters.ApplicationLauncherCluster
                              .GeneratedCommandListAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedApplicationLauncherClusterGeneratedCommandListAttributeCallback(),
            readApplicationLauncherGeneratedCommandListCommandParams);
    result.put(
        "readGeneratedCommandListAttribute",
        readApplicationLauncherGeneratedCommandListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readApplicationLauncherAcceptedCommandListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readApplicationLauncherAcceptedCommandListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ApplicationLauncherCluster) cluster)
                  .readAcceptedCommandListAttribute(
                      (ChipClusters.ApplicationLauncherCluster.AcceptedCommandListAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedApplicationLauncherClusterAcceptedCommandListAttributeCallback(),
            readApplicationLauncherAcceptedCommandListCommandParams);
    result.put(
        "readAcceptedCommandListAttribute",
        readApplicationLauncherAcceptedCommandListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readApplicationLauncherEventListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readApplicationLauncherEventListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ApplicationLauncherCluster) cluster)
                  .readEventListAttribute(
                      (ChipClusters.ApplicationLauncherCluster.EventListAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedApplicationLauncherClusterEventListAttributeCallback(),
            readApplicationLauncherEventListCommandParams);
    result.put("readEventListAttribute", readApplicationLauncherEventListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readApplicationLauncherAttributeListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readApplicationLauncherAttributeListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ApplicationLauncherCluster) cluster)
                  .readAttributeListAttribute(
                      (ChipClusters.ApplicationLauncherCluster.AttributeListAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedApplicationLauncherClusterAttributeListAttributeCallback(),
            readApplicationLauncherAttributeListCommandParams);
    result.put(
        "readAttributeListAttribute", readApplicationLauncherAttributeListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readApplicationLauncherFeatureMapCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readApplicationLauncherFeatureMapAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ApplicationLauncherCluster) cluster)
                  .readFeatureMapAttribute((ChipClusters.LongAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedLongAttributeCallback(),
            readApplicationLauncherFeatureMapCommandParams);
    result.put(
        "readFeatureMapAttribute", readApplicationLauncherFeatureMapAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readApplicationLauncherClusterRevisionCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readApplicationLauncherClusterRevisionAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ApplicationLauncherCluster) cluster)
                  .readClusterRevisionAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readApplicationLauncherClusterRevisionCommandParams);
    result.put(
        "readClusterRevisionAttribute",
        readApplicationLauncherClusterRevisionAttributeInteractionInfo);

    return result;
  }

  private static Map<String, InteractionInfo> readApplicationBasicInteractionInfo() {
    Map<String, InteractionInfo> result = new LinkedHashMap<>();
    Map<String, CommandParameterInfo> readApplicationBasicVendorNameCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readApplicationBasicVendorNameAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ApplicationBasicCluster) cluster)
                  .readVendorNameAttribute((ChipClusters.CharStringAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedCharStringAttributeCallback(),
            readApplicationBasicVendorNameCommandParams);
    result.put("readVendorNameAttribute", readApplicationBasicVendorNameAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readApplicationBasicVendorIDCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readApplicationBasicVendorIDAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ApplicationBasicCluster) cluster)
                  .readVendorIDAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readApplicationBasicVendorIDCommandParams);
    result.put("readVendorIDAttribute", readApplicationBasicVendorIDAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readApplicationBasicApplicationNameCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readApplicationBasicApplicationNameAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ApplicationBasicCluster) cluster)
                  .readApplicationNameAttribute(
                      (ChipClusters.CharStringAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedCharStringAttributeCallback(),
            readApplicationBasicApplicationNameCommandParams);
    result.put(
        "readApplicationNameAttribute",
        readApplicationBasicApplicationNameAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readApplicationBasicProductIDCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readApplicationBasicProductIDAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ApplicationBasicCluster) cluster)
                  .readProductIDAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readApplicationBasicProductIDCommandParams);
    result.put("readProductIDAttribute", readApplicationBasicProductIDAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readApplicationBasicStatusCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readApplicationBasicStatusAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ApplicationBasicCluster) cluster)
                  .readStatusAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readApplicationBasicStatusCommandParams);
    result.put("readStatusAttribute", readApplicationBasicStatusAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readApplicationBasicApplicationVersionCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readApplicationBasicApplicationVersionAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ApplicationBasicCluster) cluster)
                  .readApplicationVersionAttribute(
                      (ChipClusters.CharStringAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedCharStringAttributeCallback(),
            readApplicationBasicApplicationVersionCommandParams);
    result.put(
        "readApplicationVersionAttribute",
        readApplicationBasicApplicationVersionAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readApplicationBasicAllowedVendorListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readApplicationBasicAllowedVendorListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ApplicationBasicCluster) cluster)
                  .readAllowedVendorListAttribute(
                      (ChipClusters.ApplicationBasicCluster.AllowedVendorListAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedApplicationBasicClusterAllowedVendorListAttributeCallback(),
            readApplicationBasicAllowedVendorListCommandParams);
    result.put(
        "readAllowedVendorListAttribute",
        readApplicationBasicAllowedVendorListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readApplicationBasicGeneratedCommandListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readApplicationBasicGeneratedCommandListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ApplicationBasicCluster) cluster)
                  .readGeneratedCommandListAttribute(
                      (ChipClusters.ApplicationBasicCluster.GeneratedCommandListAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedApplicationBasicClusterGeneratedCommandListAttributeCallback(),
            readApplicationBasicGeneratedCommandListCommandParams);
    result.put(
        "readGeneratedCommandListAttribute",
        readApplicationBasicGeneratedCommandListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readApplicationBasicAcceptedCommandListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readApplicationBasicAcceptedCommandListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ApplicationBasicCluster) cluster)
                  .readAcceptedCommandListAttribute(
                      (ChipClusters.ApplicationBasicCluster.AcceptedCommandListAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedApplicationBasicClusterAcceptedCommandListAttributeCallback(),
            readApplicationBasicAcceptedCommandListCommandParams);
    result.put(
        "readAcceptedCommandListAttribute",
        readApplicationBasicAcceptedCommandListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readApplicationBasicEventListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readApplicationBasicEventListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ApplicationBasicCluster) cluster)
                  .readEventListAttribute(
                      (ChipClusters.ApplicationBasicCluster.EventListAttributeCallback) callback);
            },
            () ->
                new ClusterInfoMapping.DelegatedApplicationBasicClusterEventListAttributeCallback(),
            readApplicationBasicEventListCommandParams);
    result.put("readEventListAttribute", readApplicationBasicEventListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readApplicationBasicAttributeListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readApplicationBasicAttributeListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ApplicationBasicCluster) cluster)
                  .readAttributeListAttribute(
                      (ChipClusters.ApplicationBasicCluster.AttributeListAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedApplicationBasicClusterAttributeListAttributeCallback(),
            readApplicationBasicAttributeListCommandParams);
    result.put(
        "readAttributeListAttribute", readApplicationBasicAttributeListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readApplicationBasicFeatureMapCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readApplicationBasicFeatureMapAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ApplicationBasicCluster) cluster)
                  .readFeatureMapAttribute((ChipClusters.LongAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedLongAttributeCallback(),
            readApplicationBasicFeatureMapCommandParams);
    result.put("readFeatureMapAttribute", readApplicationBasicFeatureMapAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readApplicationBasicClusterRevisionCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readApplicationBasicClusterRevisionAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ApplicationBasicCluster) cluster)
                  .readClusterRevisionAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readApplicationBasicClusterRevisionCommandParams);
    result.put(
        "readClusterRevisionAttribute",
        readApplicationBasicClusterRevisionAttributeInteractionInfo);

    return result;
  }

  private static Map<String, InteractionInfo> readAccountLoginInteractionInfo() {
    Map<String, InteractionInfo> result = new LinkedHashMap<>();
    Map<String, CommandParameterInfo> readAccountLoginGeneratedCommandListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readAccountLoginGeneratedCommandListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.AccountLoginCluster) cluster)
                  .readGeneratedCommandListAttribute(
                      (ChipClusters.AccountLoginCluster.GeneratedCommandListAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedAccountLoginClusterGeneratedCommandListAttributeCallback(),
            readAccountLoginGeneratedCommandListCommandParams);
    result.put(
        "readGeneratedCommandListAttribute",
        readAccountLoginGeneratedCommandListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readAccountLoginAcceptedCommandListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readAccountLoginAcceptedCommandListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.AccountLoginCluster) cluster)
                  .readAcceptedCommandListAttribute(
                      (ChipClusters.AccountLoginCluster.AcceptedCommandListAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedAccountLoginClusterAcceptedCommandListAttributeCallback(),
            readAccountLoginAcceptedCommandListCommandParams);
    result.put(
        "readAcceptedCommandListAttribute",
        readAccountLoginAcceptedCommandListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readAccountLoginEventListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readAccountLoginEventListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.AccountLoginCluster) cluster)
                  .readEventListAttribute(
                      (ChipClusters.AccountLoginCluster.EventListAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedAccountLoginClusterEventListAttributeCallback(),
            readAccountLoginEventListCommandParams);
    result.put("readEventListAttribute", readAccountLoginEventListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readAccountLoginAttributeListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readAccountLoginAttributeListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.AccountLoginCluster) cluster)
                  .readAttributeListAttribute(
                      (ChipClusters.AccountLoginCluster.AttributeListAttributeCallback) callback);
            },
            () ->
                new ClusterInfoMapping.DelegatedAccountLoginClusterAttributeListAttributeCallback(),
            readAccountLoginAttributeListCommandParams);
    result.put("readAttributeListAttribute", readAccountLoginAttributeListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readAccountLoginFeatureMapCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readAccountLoginFeatureMapAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.AccountLoginCluster) cluster)
                  .readFeatureMapAttribute((ChipClusters.LongAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedLongAttributeCallback(),
            readAccountLoginFeatureMapCommandParams);
    result.put("readFeatureMapAttribute", readAccountLoginFeatureMapAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readAccountLoginClusterRevisionCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readAccountLoginClusterRevisionAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.AccountLoginCluster) cluster)
                  .readClusterRevisionAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readAccountLoginClusterRevisionCommandParams);
    result.put(
        "readClusterRevisionAttribute", readAccountLoginClusterRevisionAttributeInteractionInfo);

    return result;
  }

  private static Map<String, InteractionInfo> readElectricalMeasurementInteractionInfo() {
    Map<String, InteractionInfo> result = new LinkedHashMap<>();
    Map<String, CommandParameterInfo> readElectricalMeasurementMeasurementTypeCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readElectricalMeasurementMeasurementTypeAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ElectricalMeasurementCluster) cluster)
                  .readMeasurementTypeAttribute((ChipClusters.LongAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedLongAttributeCallback(),
            readElectricalMeasurementMeasurementTypeCommandParams);
    result.put(
        "readMeasurementTypeAttribute",
        readElectricalMeasurementMeasurementTypeAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readElectricalMeasurementDcVoltageCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readElectricalMeasurementDcVoltageAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ElectricalMeasurementCluster) cluster)
                  .readDcVoltageAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readElectricalMeasurementDcVoltageCommandParams);
    result.put(
        "readDcVoltageAttribute", readElectricalMeasurementDcVoltageAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readElectricalMeasurementDcVoltageMinCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readElectricalMeasurementDcVoltageMinAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ElectricalMeasurementCluster) cluster)
                  .readDcVoltageMinAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readElectricalMeasurementDcVoltageMinCommandParams);
    result.put(
        "readDcVoltageMinAttribute", readElectricalMeasurementDcVoltageMinAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readElectricalMeasurementDcVoltageMaxCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readElectricalMeasurementDcVoltageMaxAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ElectricalMeasurementCluster) cluster)
                  .readDcVoltageMaxAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readElectricalMeasurementDcVoltageMaxCommandParams);
    result.put(
        "readDcVoltageMaxAttribute", readElectricalMeasurementDcVoltageMaxAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readElectricalMeasurementDcCurrentCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readElectricalMeasurementDcCurrentAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ElectricalMeasurementCluster) cluster)
                  .readDcCurrentAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readElectricalMeasurementDcCurrentCommandParams);
    result.put(
        "readDcCurrentAttribute", readElectricalMeasurementDcCurrentAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readElectricalMeasurementDcCurrentMinCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readElectricalMeasurementDcCurrentMinAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ElectricalMeasurementCluster) cluster)
                  .readDcCurrentMinAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readElectricalMeasurementDcCurrentMinCommandParams);
    result.put(
        "readDcCurrentMinAttribute", readElectricalMeasurementDcCurrentMinAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readElectricalMeasurementDcCurrentMaxCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readElectricalMeasurementDcCurrentMaxAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ElectricalMeasurementCluster) cluster)
                  .readDcCurrentMaxAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readElectricalMeasurementDcCurrentMaxCommandParams);
    result.put(
        "readDcCurrentMaxAttribute", readElectricalMeasurementDcCurrentMaxAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readElectricalMeasurementDcPowerCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readElectricalMeasurementDcPowerAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ElectricalMeasurementCluster) cluster)
                  .readDcPowerAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readElectricalMeasurementDcPowerCommandParams);
    result.put("readDcPowerAttribute", readElectricalMeasurementDcPowerAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readElectricalMeasurementDcPowerMinCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readElectricalMeasurementDcPowerMinAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ElectricalMeasurementCluster) cluster)
                  .readDcPowerMinAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readElectricalMeasurementDcPowerMinCommandParams);
    result.put(
        "readDcPowerMinAttribute", readElectricalMeasurementDcPowerMinAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readElectricalMeasurementDcPowerMaxCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readElectricalMeasurementDcPowerMaxAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ElectricalMeasurementCluster) cluster)
                  .readDcPowerMaxAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readElectricalMeasurementDcPowerMaxCommandParams);
    result.put(
        "readDcPowerMaxAttribute", readElectricalMeasurementDcPowerMaxAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readElectricalMeasurementDcVoltageMultiplierCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readElectricalMeasurementDcVoltageMultiplierAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ElectricalMeasurementCluster) cluster)
                  .readDcVoltageMultiplierAttribute(
                      (ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readElectricalMeasurementDcVoltageMultiplierCommandParams);
    result.put(
        "readDcVoltageMultiplierAttribute",
        readElectricalMeasurementDcVoltageMultiplierAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readElectricalMeasurementDcVoltageDivisorCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readElectricalMeasurementDcVoltageDivisorAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ElectricalMeasurementCluster) cluster)
                  .readDcVoltageDivisorAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readElectricalMeasurementDcVoltageDivisorCommandParams);
    result.put(
        "readDcVoltageDivisorAttribute",
        readElectricalMeasurementDcVoltageDivisorAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readElectricalMeasurementDcCurrentMultiplierCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readElectricalMeasurementDcCurrentMultiplierAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ElectricalMeasurementCluster) cluster)
                  .readDcCurrentMultiplierAttribute(
                      (ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readElectricalMeasurementDcCurrentMultiplierCommandParams);
    result.put(
        "readDcCurrentMultiplierAttribute",
        readElectricalMeasurementDcCurrentMultiplierAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readElectricalMeasurementDcCurrentDivisorCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readElectricalMeasurementDcCurrentDivisorAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ElectricalMeasurementCluster) cluster)
                  .readDcCurrentDivisorAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readElectricalMeasurementDcCurrentDivisorCommandParams);
    result.put(
        "readDcCurrentDivisorAttribute",
        readElectricalMeasurementDcCurrentDivisorAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readElectricalMeasurementDcPowerMultiplierCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readElectricalMeasurementDcPowerMultiplierAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ElectricalMeasurementCluster) cluster)
                  .readDcPowerMultiplierAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readElectricalMeasurementDcPowerMultiplierCommandParams);
    result.put(
        "readDcPowerMultiplierAttribute",
        readElectricalMeasurementDcPowerMultiplierAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readElectricalMeasurementDcPowerDivisorCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readElectricalMeasurementDcPowerDivisorAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ElectricalMeasurementCluster) cluster)
                  .readDcPowerDivisorAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readElectricalMeasurementDcPowerDivisorCommandParams);
    result.put(
        "readDcPowerDivisorAttribute",
        readElectricalMeasurementDcPowerDivisorAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readElectricalMeasurementAcFrequencyCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readElectricalMeasurementAcFrequencyAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ElectricalMeasurementCluster) cluster)
                  .readAcFrequencyAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readElectricalMeasurementAcFrequencyCommandParams);
    result.put(
        "readAcFrequencyAttribute", readElectricalMeasurementAcFrequencyAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readElectricalMeasurementAcFrequencyMinCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readElectricalMeasurementAcFrequencyMinAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ElectricalMeasurementCluster) cluster)
                  .readAcFrequencyMinAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readElectricalMeasurementAcFrequencyMinCommandParams);
    result.put(
        "readAcFrequencyMinAttribute",
        readElectricalMeasurementAcFrequencyMinAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readElectricalMeasurementAcFrequencyMaxCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readElectricalMeasurementAcFrequencyMaxAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ElectricalMeasurementCluster) cluster)
                  .readAcFrequencyMaxAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readElectricalMeasurementAcFrequencyMaxCommandParams);
    result.put(
        "readAcFrequencyMaxAttribute",
        readElectricalMeasurementAcFrequencyMaxAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readElectricalMeasurementNeutralCurrentCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readElectricalMeasurementNeutralCurrentAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ElectricalMeasurementCluster) cluster)
                  .readNeutralCurrentAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readElectricalMeasurementNeutralCurrentCommandParams);
    result.put(
        "readNeutralCurrentAttribute",
        readElectricalMeasurementNeutralCurrentAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readElectricalMeasurementTotalActivePowerCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readElectricalMeasurementTotalActivePowerAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ElectricalMeasurementCluster) cluster)
                  .readTotalActivePowerAttribute((ChipClusters.LongAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedLongAttributeCallback(),
            readElectricalMeasurementTotalActivePowerCommandParams);
    result.put(
        "readTotalActivePowerAttribute",
        readElectricalMeasurementTotalActivePowerAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readElectricalMeasurementTotalReactivePowerCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readElectricalMeasurementTotalReactivePowerAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ElectricalMeasurementCluster) cluster)
                  .readTotalReactivePowerAttribute((ChipClusters.LongAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedLongAttributeCallback(),
            readElectricalMeasurementTotalReactivePowerCommandParams);
    result.put(
        "readTotalReactivePowerAttribute",
        readElectricalMeasurementTotalReactivePowerAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readElectricalMeasurementTotalApparentPowerCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readElectricalMeasurementTotalApparentPowerAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ElectricalMeasurementCluster) cluster)
                  .readTotalApparentPowerAttribute((ChipClusters.LongAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedLongAttributeCallback(),
            readElectricalMeasurementTotalApparentPowerCommandParams);
    result.put(
        "readTotalApparentPowerAttribute",
        readElectricalMeasurementTotalApparentPowerAttributeInteractionInfo);
    Map<String, CommandParameterInfo>
        readElectricalMeasurementMeasured1stHarmonicCurrentCommandParams =
            new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readElectricalMeasurementMeasured1stHarmonicCurrentAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ElectricalMeasurementCluster) cluster)
                  .readMeasured1stHarmonicCurrentAttribute(
                      (ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readElectricalMeasurementMeasured1stHarmonicCurrentCommandParams);
    result.put(
        "readMeasured1stHarmonicCurrentAttribute",
        readElectricalMeasurementMeasured1stHarmonicCurrentAttributeInteractionInfo);
    Map<String, CommandParameterInfo>
        readElectricalMeasurementMeasured3rdHarmonicCurrentCommandParams =
            new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readElectricalMeasurementMeasured3rdHarmonicCurrentAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ElectricalMeasurementCluster) cluster)
                  .readMeasured3rdHarmonicCurrentAttribute(
                      (ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readElectricalMeasurementMeasured3rdHarmonicCurrentCommandParams);
    result.put(
        "readMeasured3rdHarmonicCurrentAttribute",
        readElectricalMeasurementMeasured3rdHarmonicCurrentAttributeInteractionInfo);
    Map<String, CommandParameterInfo>
        readElectricalMeasurementMeasured5thHarmonicCurrentCommandParams =
            new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readElectricalMeasurementMeasured5thHarmonicCurrentAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ElectricalMeasurementCluster) cluster)
                  .readMeasured5thHarmonicCurrentAttribute(
                      (ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readElectricalMeasurementMeasured5thHarmonicCurrentCommandParams);
    result.put(
        "readMeasured5thHarmonicCurrentAttribute",
        readElectricalMeasurementMeasured5thHarmonicCurrentAttributeInteractionInfo);
    Map<String, CommandParameterInfo>
        readElectricalMeasurementMeasured7thHarmonicCurrentCommandParams =
            new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readElectricalMeasurementMeasured7thHarmonicCurrentAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ElectricalMeasurementCluster) cluster)
                  .readMeasured7thHarmonicCurrentAttribute(
                      (ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readElectricalMeasurementMeasured7thHarmonicCurrentCommandParams);
    result.put(
        "readMeasured7thHarmonicCurrentAttribute",
        readElectricalMeasurementMeasured7thHarmonicCurrentAttributeInteractionInfo);
    Map<String, CommandParameterInfo>
        readElectricalMeasurementMeasured9thHarmonicCurrentCommandParams =
            new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readElectricalMeasurementMeasured9thHarmonicCurrentAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ElectricalMeasurementCluster) cluster)
                  .readMeasured9thHarmonicCurrentAttribute(
                      (ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readElectricalMeasurementMeasured9thHarmonicCurrentCommandParams);
    result.put(
        "readMeasured9thHarmonicCurrentAttribute",
        readElectricalMeasurementMeasured9thHarmonicCurrentAttributeInteractionInfo);
    Map<String, CommandParameterInfo>
        readElectricalMeasurementMeasured11thHarmonicCurrentCommandParams =
            new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readElectricalMeasurementMeasured11thHarmonicCurrentAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ElectricalMeasurementCluster) cluster)
                  .readMeasured11thHarmonicCurrentAttribute(
                      (ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readElectricalMeasurementMeasured11thHarmonicCurrentCommandParams);
    result.put(
        "readMeasured11thHarmonicCurrentAttribute",
        readElectricalMeasurementMeasured11thHarmonicCurrentAttributeInteractionInfo);
    Map<String, CommandParameterInfo>
        readElectricalMeasurementMeasuredPhase1stHarmonicCurrentCommandParams =
            new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo
        readElectricalMeasurementMeasuredPhase1stHarmonicCurrentAttributeInteractionInfo =
            new InteractionInfo(
                (cluster, callback, commandArguments) -> {
                  ((ChipClusters.ElectricalMeasurementCluster) cluster)
                      .readMeasuredPhase1stHarmonicCurrentAttribute(
                          (ChipClusters.IntegerAttributeCallback) callback);
                },
                () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
                readElectricalMeasurementMeasuredPhase1stHarmonicCurrentCommandParams);
    result.put(
        "readMeasuredPhase1stHarmonicCurrentAttribute",
        readElectricalMeasurementMeasuredPhase1stHarmonicCurrentAttributeInteractionInfo);
    Map<String, CommandParameterInfo>
        readElectricalMeasurementMeasuredPhase3rdHarmonicCurrentCommandParams =
            new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo
        readElectricalMeasurementMeasuredPhase3rdHarmonicCurrentAttributeInteractionInfo =
            new InteractionInfo(
                (cluster, callback, commandArguments) -> {
                  ((ChipClusters.ElectricalMeasurementCluster) cluster)
                      .readMeasuredPhase3rdHarmonicCurrentAttribute(
                          (ChipClusters.IntegerAttributeCallback) callback);
                },
                () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
                readElectricalMeasurementMeasuredPhase3rdHarmonicCurrentCommandParams);
    result.put(
        "readMeasuredPhase3rdHarmonicCurrentAttribute",
        readElectricalMeasurementMeasuredPhase3rdHarmonicCurrentAttributeInteractionInfo);
    Map<String, CommandParameterInfo>
        readElectricalMeasurementMeasuredPhase5thHarmonicCurrentCommandParams =
            new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo
        readElectricalMeasurementMeasuredPhase5thHarmonicCurrentAttributeInteractionInfo =
            new InteractionInfo(
                (cluster, callback, commandArguments) -> {
                  ((ChipClusters.ElectricalMeasurementCluster) cluster)
                      .readMeasuredPhase5thHarmonicCurrentAttribute(
                          (ChipClusters.IntegerAttributeCallback) callback);
                },
                () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
                readElectricalMeasurementMeasuredPhase5thHarmonicCurrentCommandParams);
    result.put(
        "readMeasuredPhase5thHarmonicCurrentAttribute",
        readElectricalMeasurementMeasuredPhase5thHarmonicCurrentAttributeInteractionInfo);
    Map<String, CommandParameterInfo>
        readElectricalMeasurementMeasuredPhase7thHarmonicCurrentCommandParams =
            new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo
        readElectricalMeasurementMeasuredPhase7thHarmonicCurrentAttributeInteractionInfo =
            new InteractionInfo(
                (cluster, callback, commandArguments) -> {
                  ((ChipClusters.ElectricalMeasurementCluster) cluster)
                      .readMeasuredPhase7thHarmonicCurrentAttribute(
                          (ChipClusters.IntegerAttributeCallback) callback);
                },
                () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
                readElectricalMeasurementMeasuredPhase7thHarmonicCurrentCommandParams);
    result.put(
        "readMeasuredPhase7thHarmonicCurrentAttribute",
        readElectricalMeasurementMeasuredPhase7thHarmonicCurrentAttributeInteractionInfo);
    Map<String, CommandParameterInfo>
        readElectricalMeasurementMeasuredPhase9thHarmonicCurrentCommandParams =
            new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo
        readElectricalMeasurementMeasuredPhase9thHarmonicCurrentAttributeInteractionInfo =
            new InteractionInfo(
                (cluster, callback, commandArguments) -> {
                  ((ChipClusters.ElectricalMeasurementCluster) cluster)
                      .readMeasuredPhase9thHarmonicCurrentAttribute(
                          (ChipClusters.IntegerAttributeCallback) callback);
                },
                () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
                readElectricalMeasurementMeasuredPhase9thHarmonicCurrentCommandParams);
    result.put(
        "readMeasuredPhase9thHarmonicCurrentAttribute",
        readElectricalMeasurementMeasuredPhase9thHarmonicCurrentAttributeInteractionInfo);
    Map<String, CommandParameterInfo>
        readElectricalMeasurementMeasuredPhase11thHarmonicCurrentCommandParams =
            new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo
        readElectricalMeasurementMeasuredPhase11thHarmonicCurrentAttributeInteractionInfo =
            new InteractionInfo(
                (cluster, callback, commandArguments) -> {
                  ((ChipClusters.ElectricalMeasurementCluster) cluster)
                      .readMeasuredPhase11thHarmonicCurrentAttribute(
                          (ChipClusters.IntegerAttributeCallback) callback);
                },
                () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
                readElectricalMeasurementMeasuredPhase11thHarmonicCurrentCommandParams);
    result.put(
        "readMeasuredPhase11thHarmonicCurrentAttribute",
        readElectricalMeasurementMeasuredPhase11thHarmonicCurrentAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readElectricalMeasurementAcFrequencyMultiplierCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readElectricalMeasurementAcFrequencyMultiplierAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ElectricalMeasurementCluster) cluster)
                  .readAcFrequencyMultiplierAttribute(
                      (ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readElectricalMeasurementAcFrequencyMultiplierCommandParams);
    result.put(
        "readAcFrequencyMultiplierAttribute",
        readElectricalMeasurementAcFrequencyMultiplierAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readElectricalMeasurementAcFrequencyDivisorCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readElectricalMeasurementAcFrequencyDivisorAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ElectricalMeasurementCluster) cluster)
                  .readAcFrequencyDivisorAttribute(
                      (ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readElectricalMeasurementAcFrequencyDivisorCommandParams);
    result.put(
        "readAcFrequencyDivisorAttribute",
        readElectricalMeasurementAcFrequencyDivisorAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readElectricalMeasurementPowerMultiplierCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readElectricalMeasurementPowerMultiplierAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ElectricalMeasurementCluster) cluster)
                  .readPowerMultiplierAttribute((ChipClusters.LongAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedLongAttributeCallback(),
            readElectricalMeasurementPowerMultiplierCommandParams);
    result.put(
        "readPowerMultiplierAttribute",
        readElectricalMeasurementPowerMultiplierAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readElectricalMeasurementPowerDivisorCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readElectricalMeasurementPowerDivisorAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ElectricalMeasurementCluster) cluster)
                  .readPowerDivisorAttribute((ChipClusters.LongAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedLongAttributeCallback(),
            readElectricalMeasurementPowerDivisorCommandParams);
    result.put(
        "readPowerDivisorAttribute", readElectricalMeasurementPowerDivisorAttributeInteractionInfo);
    Map<String, CommandParameterInfo>
        readElectricalMeasurementHarmonicCurrentMultiplierCommandParams =
            new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readElectricalMeasurementHarmonicCurrentMultiplierAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ElectricalMeasurementCluster) cluster)
                  .readHarmonicCurrentMultiplierAttribute(
                      (ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readElectricalMeasurementHarmonicCurrentMultiplierCommandParams);
    result.put(
        "readHarmonicCurrentMultiplierAttribute",
        readElectricalMeasurementHarmonicCurrentMultiplierAttributeInteractionInfo);
    Map<String, CommandParameterInfo>
        readElectricalMeasurementPhaseHarmonicCurrentMultiplierCommandParams =
            new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo
        readElectricalMeasurementPhaseHarmonicCurrentMultiplierAttributeInteractionInfo =
            new InteractionInfo(
                (cluster, callback, commandArguments) -> {
                  ((ChipClusters.ElectricalMeasurementCluster) cluster)
                      .readPhaseHarmonicCurrentMultiplierAttribute(
                          (ChipClusters.IntegerAttributeCallback) callback);
                },
                () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
                readElectricalMeasurementPhaseHarmonicCurrentMultiplierCommandParams);
    result.put(
        "readPhaseHarmonicCurrentMultiplierAttribute",
        readElectricalMeasurementPhaseHarmonicCurrentMultiplierAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readElectricalMeasurementInstantaneousVoltageCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readElectricalMeasurementInstantaneousVoltageAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ElectricalMeasurementCluster) cluster)
                  .readInstantaneousVoltageAttribute(
                      (ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readElectricalMeasurementInstantaneousVoltageCommandParams);
    result.put(
        "readInstantaneousVoltageAttribute",
        readElectricalMeasurementInstantaneousVoltageAttributeInteractionInfo);
    Map<String, CommandParameterInfo>
        readElectricalMeasurementInstantaneousLineCurrentCommandParams =
            new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readElectricalMeasurementInstantaneousLineCurrentAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ElectricalMeasurementCluster) cluster)
                  .readInstantaneousLineCurrentAttribute(
                      (ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readElectricalMeasurementInstantaneousLineCurrentCommandParams);
    result.put(
        "readInstantaneousLineCurrentAttribute",
        readElectricalMeasurementInstantaneousLineCurrentAttributeInteractionInfo);
    Map<String, CommandParameterInfo>
        readElectricalMeasurementInstantaneousActiveCurrentCommandParams =
            new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readElectricalMeasurementInstantaneousActiveCurrentAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ElectricalMeasurementCluster) cluster)
                  .readInstantaneousActiveCurrentAttribute(
                      (ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readElectricalMeasurementInstantaneousActiveCurrentCommandParams);
    result.put(
        "readInstantaneousActiveCurrentAttribute",
        readElectricalMeasurementInstantaneousActiveCurrentAttributeInteractionInfo);
    Map<String, CommandParameterInfo>
        readElectricalMeasurementInstantaneousReactiveCurrentCommandParams =
            new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readElectricalMeasurementInstantaneousReactiveCurrentAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ElectricalMeasurementCluster) cluster)
                  .readInstantaneousReactiveCurrentAttribute(
                      (ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readElectricalMeasurementInstantaneousReactiveCurrentCommandParams);
    result.put(
        "readInstantaneousReactiveCurrentAttribute",
        readElectricalMeasurementInstantaneousReactiveCurrentAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readElectricalMeasurementInstantaneousPowerCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readElectricalMeasurementInstantaneousPowerAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ElectricalMeasurementCluster) cluster)
                  .readInstantaneousPowerAttribute(
                      (ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readElectricalMeasurementInstantaneousPowerCommandParams);
    result.put(
        "readInstantaneousPowerAttribute",
        readElectricalMeasurementInstantaneousPowerAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readElectricalMeasurementRmsVoltageCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readElectricalMeasurementRmsVoltageAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ElectricalMeasurementCluster) cluster)
                  .readRmsVoltageAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readElectricalMeasurementRmsVoltageCommandParams);
    result.put(
        "readRmsVoltageAttribute", readElectricalMeasurementRmsVoltageAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readElectricalMeasurementRmsVoltageMinCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readElectricalMeasurementRmsVoltageMinAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ElectricalMeasurementCluster) cluster)
                  .readRmsVoltageMinAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readElectricalMeasurementRmsVoltageMinCommandParams);
    result.put(
        "readRmsVoltageMinAttribute",
        readElectricalMeasurementRmsVoltageMinAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readElectricalMeasurementRmsVoltageMaxCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readElectricalMeasurementRmsVoltageMaxAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ElectricalMeasurementCluster) cluster)
                  .readRmsVoltageMaxAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readElectricalMeasurementRmsVoltageMaxCommandParams);
    result.put(
        "readRmsVoltageMaxAttribute",
        readElectricalMeasurementRmsVoltageMaxAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readElectricalMeasurementRmsCurrentCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readElectricalMeasurementRmsCurrentAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ElectricalMeasurementCluster) cluster)
                  .readRmsCurrentAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readElectricalMeasurementRmsCurrentCommandParams);
    result.put(
        "readRmsCurrentAttribute", readElectricalMeasurementRmsCurrentAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readElectricalMeasurementRmsCurrentMinCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readElectricalMeasurementRmsCurrentMinAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ElectricalMeasurementCluster) cluster)
                  .readRmsCurrentMinAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readElectricalMeasurementRmsCurrentMinCommandParams);
    result.put(
        "readRmsCurrentMinAttribute",
        readElectricalMeasurementRmsCurrentMinAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readElectricalMeasurementRmsCurrentMaxCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readElectricalMeasurementRmsCurrentMaxAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ElectricalMeasurementCluster) cluster)
                  .readRmsCurrentMaxAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readElectricalMeasurementRmsCurrentMaxCommandParams);
    result.put(
        "readRmsCurrentMaxAttribute",
        readElectricalMeasurementRmsCurrentMaxAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readElectricalMeasurementActivePowerCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readElectricalMeasurementActivePowerAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ElectricalMeasurementCluster) cluster)
                  .readActivePowerAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readElectricalMeasurementActivePowerCommandParams);
    result.put(
        "readActivePowerAttribute", readElectricalMeasurementActivePowerAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readElectricalMeasurementActivePowerMinCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readElectricalMeasurementActivePowerMinAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ElectricalMeasurementCluster) cluster)
                  .readActivePowerMinAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readElectricalMeasurementActivePowerMinCommandParams);
    result.put(
        "readActivePowerMinAttribute",
        readElectricalMeasurementActivePowerMinAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readElectricalMeasurementActivePowerMaxCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readElectricalMeasurementActivePowerMaxAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ElectricalMeasurementCluster) cluster)
                  .readActivePowerMaxAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readElectricalMeasurementActivePowerMaxCommandParams);
    result.put(
        "readActivePowerMaxAttribute",
        readElectricalMeasurementActivePowerMaxAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readElectricalMeasurementReactivePowerCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readElectricalMeasurementReactivePowerAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ElectricalMeasurementCluster) cluster)
                  .readReactivePowerAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readElectricalMeasurementReactivePowerCommandParams);
    result.put(
        "readReactivePowerAttribute",
        readElectricalMeasurementReactivePowerAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readElectricalMeasurementApparentPowerCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readElectricalMeasurementApparentPowerAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ElectricalMeasurementCluster) cluster)
                  .readApparentPowerAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readElectricalMeasurementApparentPowerCommandParams);
    result.put(
        "readApparentPowerAttribute",
        readElectricalMeasurementApparentPowerAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readElectricalMeasurementPowerFactorCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readElectricalMeasurementPowerFactorAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ElectricalMeasurementCluster) cluster)
                  .readPowerFactorAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readElectricalMeasurementPowerFactorCommandParams);
    result.put(
        "readPowerFactorAttribute", readElectricalMeasurementPowerFactorAttributeInteractionInfo);
    Map<String, CommandParameterInfo>
        readElectricalMeasurementAverageRmsVoltageMeasurementPeriodCommandParams =
            new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo
        readElectricalMeasurementAverageRmsVoltageMeasurementPeriodAttributeInteractionInfo =
            new InteractionInfo(
                (cluster, callback, commandArguments) -> {
                  ((ChipClusters.ElectricalMeasurementCluster) cluster)
                      .readAverageRmsVoltageMeasurementPeriodAttribute(
                          (ChipClusters.IntegerAttributeCallback) callback);
                },
                () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
                readElectricalMeasurementAverageRmsVoltageMeasurementPeriodCommandParams);
    result.put(
        "readAverageRmsVoltageMeasurementPeriodAttribute",
        readElectricalMeasurementAverageRmsVoltageMeasurementPeriodAttributeInteractionInfo);
    Map<String, CommandParameterInfo>
        readElectricalMeasurementAverageRmsUnderVoltageCounterCommandParams =
            new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readElectricalMeasurementAverageRmsUnderVoltageCounterAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ElectricalMeasurementCluster) cluster)
                  .readAverageRmsUnderVoltageCounterAttribute(
                      (ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readElectricalMeasurementAverageRmsUnderVoltageCounterCommandParams);
    result.put(
        "readAverageRmsUnderVoltageCounterAttribute",
        readElectricalMeasurementAverageRmsUnderVoltageCounterAttributeInteractionInfo);
    Map<String, CommandParameterInfo>
        readElectricalMeasurementRmsExtremeOverVoltagePeriodCommandParams =
            new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readElectricalMeasurementRmsExtremeOverVoltagePeriodAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ElectricalMeasurementCluster) cluster)
                  .readRmsExtremeOverVoltagePeriodAttribute(
                      (ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readElectricalMeasurementRmsExtremeOverVoltagePeriodCommandParams);
    result.put(
        "readRmsExtremeOverVoltagePeriodAttribute",
        readElectricalMeasurementRmsExtremeOverVoltagePeriodAttributeInteractionInfo);
    Map<String, CommandParameterInfo>
        readElectricalMeasurementRmsExtremeUnderVoltagePeriodCommandParams =
            new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readElectricalMeasurementRmsExtremeUnderVoltagePeriodAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ElectricalMeasurementCluster) cluster)
                  .readRmsExtremeUnderVoltagePeriodAttribute(
                      (ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readElectricalMeasurementRmsExtremeUnderVoltagePeriodCommandParams);
    result.put(
        "readRmsExtremeUnderVoltagePeriodAttribute",
        readElectricalMeasurementRmsExtremeUnderVoltagePeriodAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readElectricalMeasurementRmsVoltageSagPeriodCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readElectricalMeasurementRmsVoltageSagPeriodAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ElectricalMeasurementCluster) cluster)
                  .readRmsVoltageSagPeriodAttribute(
                      (ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readElectricalMeasurementRmsVoltageSagPeriodCommandParams);
    result.put(
        "readRmsVoltageSagPeriodAttribute",
        readElectricalMeasurementRmsVoltageSagPeriodAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readElectricalMeasurementRmsVoltageSwellPeriodCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readElectricalMeasurementRmsVoltageSwellPeriodAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ElectricalMeasurementCluster) cluster)
                  .readRmsVoltageSwellPeriodAttribute(
                      (ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readElectricalMeasurementRmsVoltageSwellPeriodCommandParams);
    result.put(
        "readRmsVoltageSwellPeriodAttribute",
        readElectricalMeasurementRmsVoltageSwellPeriodAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readElectricalMeasurementAcVoltageMultiplierCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readElectricalMeasurementAcVoltageMultiplierAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ElectricalMeasurementCluster) cluster)
                  .readAcVoltageMultiplierAttribute(
                      (ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readElectricalMeasurementAcVoltageMultiplierCommandParams);
    result.put(
        "readAcVoltageMultiplierAttribute",
        readElectricalMeasurementAcVoltageMultiplierAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readElectricalMeasurementAcVoltageDivisorCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readElectricalMeasurementAcVoltageDivisorAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ElectricalMeasurementCluster) cluster)
                  .readAcVoltageDivisorAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readElectricalMeasurementAcVoltageDivisorCommandParams);
    result.put(
        "readAcVoltageDivisorAttribute",
        readElectricalMeasurementAcVoltageDivisorAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readElectricalMeasurementAcCurrentMultiplierCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readElectricalMeasurementAcCurrentMultiplierAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ElectricalMeasurementCluster) cluster)
                  .readAcCurrentMultiplierAttribute(
                      (ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readElectricalMeasurementAcCurrentMultiplierCommandParams);
    result.put(
        "readAcCurrentMultiplierAttribute",
        readElectricalMeasurementAcCurrentMultiplierAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readElectricalMeasurementAcCurrentDivisorCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readElectricalMeasurementAcCurrentDivisorAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ElectricalMeasurementCluster) cluster)
                  .readAcCurrentDivisorAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readElectricalMeasurementAcCurrentDivisorCommandParams);
    result.put(
        "readAcCurrentDivisorAttribute",
        readElectricalMeasurementAcCurrentDivisorAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readElectricalMeasurementAcPowerMultiplierCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readElectricalMeasurementAcPowerMultiplierAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ElectricalMeasurementCluster) cluster)
                  .readAcPowerMultiplierAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readElectricalMeasurementAcPowerMultiplierCommandParams);
    result.put(
        "readAcPowerMultiplierAttribute",
        readElectricalMeasurementAcPowerMultiplierAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readElectricalMeasurementAcPowerDivisorCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readElectricalMeasurementAcPowerDivisorAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ElectricalMeasurementCluster) cluster)
                  .readAcPowerDivisorAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readElectricalMeasurementAcPowerDivisorCommandParams);
    result.put(
        "readAcPowerDivisorAttribute",
        readElectricalMeasurementAcPowerDivisorAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readElectricalMeasurementOverloadAlarmsMaskCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readElectricalMeasurementOverloadAlarmsMaskAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ElectricalMeasurementCluster) cluster)
                  .readOverloadAlarmsMaskAttribute(
                      (ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readElectricalMeasurementOverloadAlarmsMaskCommandParams);
    result.put(
        "readOverloadAlarmsMaskAttribute",
        readElectricalMeasurementOverloadAlarmsMaskAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readElectricalMeasurementVoltageOverloadCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readElectricalMeasurementVoltageOverloadAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ElectricalMeasurementCluster) cluster)
                  .readVoltageOverloadAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readElectricalMeasurementVoltageOverloadCommandParams);
    result.put(
        "readVoltageOverloadAttribute",
        readElectricalMeasurementVoltageOverloadAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readElectricalMeasurementCurrentOverloadCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readElectricalMeasurementCurrentOverloadAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ElectricalMeasurementCluster) cluster)
                  .readCurrentOverloadAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readElectricalMeasurementCurrentOverloadCommandParams);
    result.put(
        "readCurrentOverloadAttribute",
        readElectricalMeasurementCurrentOverloadAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readElectricalMeasurementAcOverloadAlarmsMaskCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readElectricalMeasurementAcOverloadAlarmsMaskAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ElectricalMeasurementCluster) cluster)
                  .readAcOverloadAlarmsMaskAttribute(
                      (ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readElectricalMeasurementAcOverloadAlarmsMaskCommandParams);
    result.put(
        "readAcOverloadAlarmsMaskAttribute",
        readElectricalMeasurementAcOverloadAlarmsMaskAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readElectricalMeasurementAcVoltageOverloadCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readElectricalMeasurementAcVoltageOverloadAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ElectricalMeasurementCluster) cluster)
                  .readAcVoltageOverloadAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readElectricalMeasurementAcVoltageOverloadCommandParams);
    result.put(
        "readAcVoltageOverloadAttribute",
        readElectricalMeasurementAcVoltageOverloadAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readElectricalMeasurementAcCurrentOverloadCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readElectricalMeasurementAcCurrentOverloadAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ElectricalMeasurementCluster) cluster)
                  .readAcCurrentOverloadAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readElectricalMeasurementAcCurrentOverloadCommandParams);
    result.put(
        "readAcCurrentOverloadAttribute",
        readElectricalMeasurementAcCurrentOverloadAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readElectricalMeasurementAcActivePowerOverloadCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readElectricalMeasurementAcActivePowerOverloadAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ElectricalMeasurementCluster) cluster)
                  .readAcActivePowerOverloadAttribute(
                      (ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readElectricalMeasurementAcActivePowerOverloadCommandParams);
    result.put(
        "readAcActivePowerOverloadAttribute",
        readElectricalMeasurementAcActivePowerOverloadAttributeInteractionInfo);
    Map<String, CommandParameterInfo>
        readElectricalMeasurementAcReactivePowerOverloadCommandParams =
            new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readElectricalMeasurementAcReactivePowerOverloadAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ElectricalMeasurementCluster) cluster)
                  .readAcReactivePowerOverloadAttribute(
                      (ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readElectricalMeasurementAcReactivePowerOverloadCommandParams);
    result.put(
        "readAcReactivePowerOverloadAttribute",
        readElectricalMeasurementAcReactivePowerOverloadAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readElectricalMeasurementAverageRmsOverVoltageCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readElectricalMeasurementAverageRmsOverVoltageAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ElectricalMeasurementCluster) cluster)
                  .readAverageRmsOverVoltageAttribute(
                      (ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readElectricalMeasurementAverageRmsOverVoltageCommandParams);
    result.put(
        "readAverageRmsOverVoltageAttribute",
        readElectricalMeasurementAverageRmsOverVoltageAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readElectricalMeasurementAverageRmsUnderVoltageCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readElectricalMeasurementAverageRmsUnderVoltageAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ElectricalMeasurementCluster) cluster)
                  .readAverageRmsUnderVoltageAttribute(
                      (ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readElectricalMeasurementAverageRmsUnderVoltageCommandParams);
    result.put(
        "readAverageRmsUnderVoltageAttribute",
        readElectricalMeasurementAverageRmsUnderVoltageAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readElectricalMeasurementRmsExtremeOverVoltageCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readElectricalMeasurementRmsExtremeOverVoltageAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ElectricalMeasurementCluster) cluster)
                  .readRmsExtremeOverVoltageAttribute(
                      (ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readElectricalMeasurementRmsExtremeOverVoltageCommandParams);
    result.put(
        "readRmsExtremeOverVoltageAttribute",
        readElectricalMeasurementRmsExtremeOverVoltageAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readElectricalMeasurementRmsExtremeUnderVoltageCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readElectricalMeasurementRmsExtremeUnderVoltageAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ElectricalMeasurementCluster) cluster)
                  .readRmsExtremeUnderVoltageAttribute(
                      (ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readElectricalMeasurementRmsExtremeUnderVoltageCommandParams);
    result.put(
        "readRmsExtremeUnderVoltageAttribute",
        readElectricalMeasurementRmsExtremeUnderVoltageAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readElectricalMeasurementRmsVoltageSagCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readElectricalMeasurementRmsVoltageSagAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ElectricalMeasurementCluster) cluster)
                  .readRmsVoltageSagAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readElectricalMeasurementRmsVoltageSagCommandParams);
    result.put(
        "readRmsVoltageSagAttribute",
        readElectricalMeasurementRmsVoltageSagAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readElectricalMeasurementRmsVoltageSwellCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readElectricalMeasurementRmsVoltageSwellAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ElectricalMeasurementCluster) cluster)
                  .readRmsVoltageSwellAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readElectricalMeasurementRmsVoltageSwellCommandParams);
    result.put(
        "readRmsVoltageSwellAttribute",
        readElectricalMeasurementRmsVoltageSwellAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readElectricalMeasurementLineCurrentPhaseBCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readElectricalMeasurementLineCurrentPhaseBAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ElectricalMeasurementCluster) cluster)
                  .readLineCurrentPhaseBAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readElectricalMeasurementLineCurrentPhaseBCommandParams);
    result.put(
        "readLineCurrentPhaseBAttribute",
        readElectricalMeasurementLineCurrentPhaseBAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readElectricalMeasurementActiveCurrentPhaseBCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readElectricalMeasurementActiveCurrentPhaseBAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ElectricalMeasurementCluster) cluster)
                  .readActiveCurrentPhaseBAttribute(
                      (ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readElectricalMeasurementActiveCurrentPhaseBCommandParams);
    result.put(
        "readActiveCurrentPhaseBAttribute",
        readElectricalMeasurementActiveCurrentPhaseBAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readElectricalMeasurementReactiveCurrentPhaseBCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readElectricalMeasurementReactiveCurrentPhaseBAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ElectricalMeasurementCluster) cluster)
                  .readReactiveCurrentPhaseBAttribute(
                      (ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readElectricalMeasurementReactiveCurrentPhaseBCommandParams);
    result.put(
        "readReactiveCurrentPhaseBAttribute",
        readElectricalMeasurementReactiveCurrentPhaseBAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readElectricalMeasurementRmsVoltagePhaseBCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readElectricalMeasurementRmsVoltagePhaseBAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ElectricalMeasurementCluster) cluster)
                  .readRmsVoltagePhaseBAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readElectricalMeasurementRmsVoltagePhaseBCommandParams);
    result.put(
        "readRmsVoltagePhaseBAttribute",
        readElectricalMeasurementRmsVoltagePhaseBAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readElectricalMeasurementRmsVoltageMinPhaseBCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readElectricalMeasurementRmsVoltageMinPhaseBAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ElectricalMeasurementCluster) cluster)
                  .readRmsVoltageMinPhaseBAttribute(
                      (ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readElectricalMeasurementRmsVoltageMinPhaseBCommandParams);
    result.put(
        "readRmsVoltageMinPhaseBAttribute",
        readElectricalMeasurementRmsVoltageMinPhaseBAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readElectricalMeasurementRmsVoltageMaxPhaseBCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readElectricalMeasurementRmsVoltageMaxPhaseBAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ElectricalMeasurementCluster) cluster)
                  .readRmsVoltageMaxPhaseBAttribute(
                      (ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readElectricalMeasurementRmsVoltageMaxPhaseBCommandParams);
    result.put(
        "readRmsVoltageMaxPhaseBAttribute",
        readElectricalMeasurementRmsVoltageMaxPhaseBAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readElectricalMeasurementRmsCurrentPhaseBCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readElectricalMeasurementRmsCurrentPhaseBAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ElectricalMeasurementCluster) cluster)
                  .readRmsCurrentPhaseBAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readElectricalMeasurementRmsCurrentPhaseBCommandParams);
    result.put(
        "readRmsCurrentPhaseBAttribute",
        readElectricalMeasurementRmsCurrentPhaseBAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readElectricalMeasurementRmsCurrentMinPhaseBCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readElectricalMeasurementRmsCurrentMinPhaseBAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ElectricalMeasurementCluster) cluster)
                  .readRmsCurrentMinPhaseBAttribute(
                      (ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readElectricalMeasurementRmsCurrentMinPhaseBCommandParams);
    result.put(
        "readRmsCurrentMinPhaseBAttribute",
        readElectricalMeasurementRmsCurrentMinPhaseBAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readElectricalMeasurementRmsCurrentMaxPhaseBCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readElectricalMeasurementRmsCurrentMaxPhaseBAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ElectricalMeasurementCluster) cluster)
                  .readRmsCurrentMaxPhaseBAttribute(
                      (ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readElectricalMeasurementRmsCurrentMaxPhaseBCommandParams);
    result.put(
        "readRmsCurrentMaxPhaseBAttribute",
        readElectricalMeasurementRmsCurrentMaxPhaseBAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readElectricalMeasurementActivePowerPhaseBCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readElectricalMeasurementActivePowerPhaseBAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ElectricalMeasurementCluster) cluster)
                  .readActivePowerPhaseBAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readElectricalMeasurementActivePowerPhaseBCommandParams);
    result.put(
        "readActivePowerPhaseBAttribute",
        readElectricalMeasurementActivePowerPhaseBAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readElectricalMeasurementActivePowerMinPhaseBCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readElectricalMeasurementActivePowerMinPhaseBAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ElectricalMeasurementCluster) cluster)
                  .readActivePowerMinPhaseBAttribute(
                      (ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readElectricalMeasurementActivePowerMinPhaseBCommandParams);
    result.put(
        "readActivePowerMinPhaseBAttribute",
        readElectricalMeasurementActivePowerMinPhaseBAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readElectricalMeasurementActivePowerMaxPhaseBCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readElectricalMeasurementActivePowerMaxPhaseBAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ElectricalMeasurementCluster) cluster)
                  .readActivePowerMaxPhaseBAttribute(
                      (ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readElectricalMeasurementActivePowerMaxPhaseBCommandParams);
    result.put(
        "readActivePowerMaxPhaseBAttribute",
        readElectricalMeasurementActivePowerMaxPhaseBAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readElectricalMeasurementReactivePowerPhaseBCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readElectricalMeasurementReactivePowerPhaseBAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ElectricalMeasurementCluster) cluster)
                  .readReactivePowerPhaseBAttribute(
                      (ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readElectricalMeasurementReactivePowerPhaseBCommandParams);
    result.put(
        "readReactivePowerPhaseBAttribute",
        readElectricalMeasurementReactivePowerPhaseBAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readElectricalMeasurementApparentPowerPhaseBCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readElectricalMeasurementApparentPowerPhaseBAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ElectricalMeasurementCluster) cluster)
                  .readApparentPowerPhaseBAttribute(
                      (ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readElectricalMeasurementApparentPowerPhaseBCommandParams);
    result.put(
        "readApparentPowerPhaseBAttribute",
        readElectricalMeasurementApparentPowerPhaseBAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readElectricalMeasurementPowerFactorPhaseBCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readElectricalMeasurementPowerFactorPhaseBAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ElectricalMeasurementCluster) cluster)
                  .readPowerFactorPhaseBAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readElectricalMeasurementPowerFactorPhaseBCommandParams);
    result.put(
        "readPowerFactorPhaseBAttribute",
        readElectricalMeasurementPowerFactorPhaseBAttributeInteractionInfo);
    Map<String, CommandParameterInfo>
        readElectricalMeasurementAverageRmsVoltageMeasurementPeriodPhaseBCommandParams =
            new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo
        readElectricalMeasurementAverageRmsVoltageMeasurementPeriodPhaseBAttributeInteractionInfo =
            new InteractionInfo(
                (cluster, callback, commandArguments) -> {
                  ((ChipClusters.ElectricalMeasurementCluster) cluster)
                      .readAverageRmsVoltageMeasurementPeriodPhaseBAttribute(
                          (ChipClusters.IntegerAttributeCallback) callback);
                },
                () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
                readElectricalMeasurementAverageRmsVoltageMeasurementPeriodPhaseBCommandParams);
    result.put(
        "readAverageRmsVoltageMeasurementPeriodPhaseBAttribute",
        readElectricalMeasurementAverageRmsVoltageMeasurementPeriodPhaseBAttributeInteractionInfo);
    Map<String, CommandParameterInfo>
        readElectricalMeasurementAverageRmsOverVoltageCounterPhaseBCommandParams =
            new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo
        readElectricalMeasurementAverageRmsOverVoltageCounterPhaseBAttributeInteractionInfo =
            new InteractionInfo(
                (cluster, callback, commandArguments) -> {
                  ((ChipClusters.ElectricalMeasurementCluster) cluster)
                      .readAverageRmsOverVoltageCounterPhaseBAttribute(
                          (ChipClusters.IntegerAttributeCallback) callback);
                },
                () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
                readElectricalMeasurementAverageRmsOverVoltageCounterPhaseBCommandParams);
    result.put(
        "readAverageRmsOverVoltageCounterPhaseBAttribute",
        readElectricalMeasurementAverageRmsOverVoltageCounterPhaseBAttributeInteractionInfo);
    Map<String, CommandParameterInfo>
        readElectricalMeasurementAverageRmsUnderVoltageCounterPhaseBCommandParams =
            new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo
        readElectricalMeasurementAverageRmsUnderVoltageCounterPhaseBAttributeInteractionInfo =
            new InteractionInfo(
                (cluster, callback, commandArguments) -> {
                  ((ChipClusters.ElectricalMeasurementCluster) cluster)
                      .readAverageRmsUnderVoltageCounterPhaseBAttribute(
                          (ChipClusters.IntegerAttributeCallback) callback);
                },
                () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
                readElectricalMeasurementAverageRmsUnderVoltageCounterPhaseBCommandParams);
    result.put(
        "readAverageRmsUnderVoltageCounterPhaseBAttribute",
        readElectricalMeasurementAverageRmsUnderVoltageCounterPhaseBAttributeInteractionInfo);
    Map<String, CommandParameterInfo>
        readElectricalMeasurementRmsExtremeOverVoltagePeriodPhaseBCommandParams =
            new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo
        readElectricalMeasurementRmsExtremeOverVoltagePeriodPhaseBAttributeInteractionInfo =
            new InteractionInfo(
                (cluster, callback, commandArguments) -> {
                  ((ChipClusters.ElectricalMeasurementCluster) cluster)
                      .readRmsExtremeOverVoltagePeriodPhaseBAttribute(
                          (ChipClusters.IntegerAttributeCallback) callback);
                },
                () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
                readElectricalMeasurementRmsExtremeOverVoltagePeriodPhaseBCommandParams);
    result.put(
        "readRmsExtremeOverVoltagePeriodPhaseBAttribute",
        readElectricalMeasurementRmsExtremeOverVoltagePeriodPhaseBAttributeInteractionInfo);
    Map<String, CommandParameterInfo>
        readElectricalMeasurementRmsExtremeUnderVoltagePeriodPhaseBCommandParams =
            new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo
        readElectricalMeasurementRmsExtremeUnderVoltagePeriodPhaseBAttributeInteractionInfo =
            new InteractionInfo(
                (cluster, callback, commandArguments) -> {
                  ((ChipClusters.ElectricalMeasurementCluster) cluster)
                      .readRmsExtremeUnderVoltagePeriodPhaseBAttribute(
                          (ChipClusters.IntegerAttributeCallback) callback);
                },
                () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
                readElectricalMeasurementRmsExtremeUnderVoltagePeriodPhaseBCommandParams);
    result.put(
        "readRmsExtremeUnderVoltagePeriodPhaseBAttribute",
        readElectricalMeasurementRmsExtremeUnderVoltagePeriodPhaseBAttributeInteractionInfo);
    Map<String, CommandParameterInfo>
        readElectricalMeasurementRmsVoltageSagPeriodPhaseBCommandParams =
            new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readElectricalMeasurementRmsVoltageSagPeriodPhaseBAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ElectricalMeasurementCluster) cluster)
                  .readRmsVoltageSagPeriodPhaseBAttribute(
                      (ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readElectricalMeasurementRmsVoltageSagPeriodPhaseBCommandParams);
    result.put(
        "readRmsVoltageSagPeriodPhaseBAttribute",
        readElectricalMeasurementRmsVoltageSagPeriodPhaseBAttributeInteractionInfo);
    Map<String, CommandParameterInfo>
        readElectricalMeasurementRmsVoltageSwellPeriodPhaseBCommandParams =
            new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readElectricalMeasurementRmsVoltageSwellPeriodPhaseBAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ElectricalMeasurementCluster) cluster)
                  .readRmsVoltageSwellPeriodPhaseBAttribute(
                      (ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readElectricalMeasurementRmsVoltageSwellPeriodPhaseBCommandParams);
    result.put(
        "readRmsVoltageSwellPeriodPhaseBAttribute",
        readElectricalMeasurementRmsVoltageSwellPeriodPhaseBAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readElectricalMeasurementLineCurrentPhaseCCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readElectricalMeasurementLineCurrentPhaseCAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ElectricalMeasurementCluster) cluster)
                  .readLineCurrentPhaseCAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readElectricalMeasurementLineCurrentPhaseCCommandParams);
    result.put(
        "readLineCurrentPhaseCAttribute",
        readElectricalMeasurementLineCurrentPhaseCAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readElectricalMeasurementActiveCurrentPhaseCCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readElectricalMeasurementActiveCurrentPhaseCAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ElectricalMeasurementCluster) cluster)
                  .readActiveCurrentPhaseCAttribute(
                      (ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readElectricalMeasurementActiveCurrentPhaseCCommandParams);
    result.put(
        "readActiveCurrentPhaseCAttribute",
        readElectricalMeasurementActiveCurrentPhaseCAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readElectricalMeasurementReactiveCurrentPhaseCCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readElectricalMeasurementReactiveCurrentPhaseCAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ElectricalMeasurementCluster) cluster)
                  .readReactiveCurrentPhaseCAttribute(
                      (ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readElectricalMeasurementReactiveCurrentPhaseCCommandParams);
    result.put(
        "readReactiveCurrentPhaseCAttribute",
        readElectricalMeasurementReactiveCurrentPhaseCAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readElectricalMeasurementRmsVoltagePhaseCCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readElectricalMeasurementRmsVoltagePhaseCAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ElectricalMeasurementCluster) cluster)
                  .readRmsVoltagePhaseCAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readElectricalMeasurementRmsVoltagePhaseCCommandParams);
    result.put(
        "readRmsVoltagePhaseCAttribute",
        readElectricalMeasurementRmsVoltagePhaseCAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readElectricalMeasurementRmsVoltageMinPhaseCCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readElectricalMeasurementRmsVoltageMinPhaseCAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ElectricalMeasurementCluster) cluster)
                  .readRmsVoltageMinPhaseCAttribute(
                      (ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readElectricalMeasurementRmsVoltageMinPhaseCCommandParams);
    result.put(
        "readRmsVoltageMinPhaseCAttribute",
        readElectricalMeasurementRmsVoltageMinPhaseCAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readElectricalMeasurementRmsVoltageMaxPhaseCCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readElectricalMeasurementRmsVoltageMaxPhaseCAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ElectricalMeasurementCluster) cluster)
                  .readRmsVoltageMaxPhaseCAttribute(
                      (ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readElectricalMeasurementRmsVoltageMaxPhaseCCommandParams);
    result.put(
        "readRmsVoltageMaxPhaseCAttribute",
        readElectricalMeasurementRmsVoltageMaxPhaseCAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readElectricalMeasurementRmsCurrentPhaseCCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readElectricalMeasurementRmsCurrentPhaseCAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ElectricalMeasurementCluster) cluster)
                  .readRmsCurrentPhaseCAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readElectricalMeasurementRmsCurrentPhaseCCommandParams);
    result.put(
        "readRmsCurrentPhaseCAttribute",
        readElectricalMeasurementRmsCurrentPhaseCAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readElectricalMeasurementRmsCurrentMinPhaseCCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readElectricalMeasurementRmsCurrentMinPhaseCAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ElectricalMeasurementCluster) cluster)
                  .readRmsCurrentMinPhaseCAttribute(
                      (ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readElectricalMeasurementRmsCurrentMinPhaseCCommandParams);
    result.put(
        "readRmsCurrentMinPhaseCAttribute",
        readElectricalMeasurementRmsCurrentMinPhaseCAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readElectricalMeasurementRmsCurrentMaxPhaseCCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readElectricalMeasurementRmsCurrentMaxPhaseCAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ElectricalMeasurementCluster) cluster)
                  .readRmsCurrentMaxPhaseCAttribute(
                      (ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readElectricalMeasurementRmsCurrentMaxPhaseCCommandParams);
    result.put(
        "readRmsCurrentMaxPhaseCAttribute",
        readElectricalMeasurementRmsCurrentMaxPhaseCAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readElectricalMeasurementActivePowerPhaseCCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readElectricalMeasurementActivePowerPhaseCAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ElectricalMeasurementCluster) cluster)
                  .readActivePowerPhaseCAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readElectricalMeasurementActivePowerPhaseCCommandParams);
    result.put(
        "readActivePowerPhaseCAttribute",
        readElectricalMeasurementActivePowerPhaseCAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readElectricalMeasurementActivePowerMinPhaseCCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readElectricalMeasurementActivePowerMinPhaseCAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ElectricalMeasurementCluster) cluster)
                  .readActivePowerMinPhaseCAttribute(
                      (ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readElectricalMeasurementActivePowerMinPhaseCCommandParams);
    result.put(
        "readActivePowerMinPhaseCAttribute",
        readElectricalMeasurementActivePowerMinPhaseCAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readElectricalMeasurementActivePowerMaxPhaseCCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readElectricalMeasurementActivePowerMaxPhaseCAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ElectricalMeasurementCluster) cluster)
                  .readActivePowerMaxPhaseCAttribute(
                      (ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readElectricalMeasurementActivePowerMaxPhaseCCommandParams);
    result.put(
        "readActivePowerMaxPhaseCAttribute",
        readElectricalMeasurementActivePowerMaxPhaseCAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readElectricalMeasurementReactivePowerPhaseCCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readElectricalMeasurementReactivePowerPhaseCAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ElectricalMeasurementCluster) cluster)
                  .readReactivePowerPhaseCAttribute(
                      (ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readElectricalMeasurementReactivePowerPhaseCCommandParams);
    result.put(
        "readReactivePowerPhaseCAttribute",
        readElectricalMeasurementReactivePowerPhaseCAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readElectricalMeasurementApparentPowerPhaseCCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readElectricalMeasurementApparentPowerPhaseCAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ElectricalMeasurementCluster) cluster)
                  .readApparentPowerPhaseCAttribute(
                      (ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readElectricalMeasurementApparentPowerPhaseCCommandParams);
    result.put(
        "readApparentPowerPhaseCAttribute",
        readElectricalMeasurementApparentPowerPhaseCAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readElectricalMeasurementPowerFactorPhaseCCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readElectricalMeasurementPowerFactorPhaseCAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ElectricalMeasurementCluster) cluster)
                  .readPowerFactorPhaseCAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readElectricalMeasurementPowerFactorPhaseCCommandParams);
    result.put(
        "readPowerFactorPhaseCAttribute",
        readElectricalMeasurementPowerFactorPhaseCAttributeInteractionInfo);
    Map<String, CommandParameterInfo>
        readElectricalMeasurementAverageRmsVoltageMeasurementPeriodPhaseCCommandParams =
            new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo
        readElectricalMeasurementAverageRmsVoltageMeasurementPeriodPhaseCAttributeInteractionInfo =
            new InteractionInfo(
                (cluster, callback, commandArguments) -> {
                  ((ChipClusters.ElectricalMeasurementCluster) cluster)
                      .readAverageRmsVoltageMeasurementPeriodPhaseCAttribute(
                          (ChipClusters.IntegerAttributeCallback) callback);
                },
                () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
                readElectricalMeasurementAverageRmsVoltageMeasurementPeriodPhaseCCommandParams);
    result.put(
        "readAverageRmsVoltageMeasurementPeriodPhaseCAttribute",
        readElectricalMeasurementAverageRmsVoltageMeasurementPeriodPhaseCAttributeInteractionInfo);
    Map<String, CommandParameterInfo>
        readElectricalMeasurementAverageRmsOverVoltageCounterPhaseCCommandParams =
            new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo
        readElectricalMeasurementAverageRmsOverVoltageCounterPhaseCAttributeInteractionInfo =
            new InteractionInfo(
                (cluster, callback, commandArguments) -> {
                  ((ChipClusters.ElectricalMeasurementCluster) cluster)
                      .readAverageRmsOverVoltageCounterPhaseCAttribute(
                          (ChipClusters.IntegerAttributeCallback) callback);
                },
                () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
                readElectricalMeasurementAverageRmsOverVoltageCounterPhaseCCommandParams);
    result.put(
        "readAverageRmsOverVoltageCounterPhaseCAttribute",
        readElectricalMeasurementAverageRmsOverVoltageCounterPhaseCAttributeInteractionInfo);
    Map<String, CommandParameterInfo>
        readElectricalMeasurementAverageRmsUnderVoltageCounterPhaseCCommandParams =
            new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo
        readElectricalMeasurementAverageRmsUnderVoltageCounterPhaseCAttributeInteractionInfo =
            new InteractionInfo(
                (cluster, callback, commandArguments) -> {
                  ((ChipClusters.ElectricalMeasurementCluster) cluster)
                      .readAverageRmsUnderVoltageCounterPhaseCAttribute(
                          (ChipClusters.IntegerAttributeCallback) callback);
                },
                () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
                readElectricalMeasurementAverageRmsUnderVoltageCounterPhaseCCommandParams);
    result.put(
        "readAverageRmsUnderVoltageCounterPhaseCAttribute",
        readElectricalMeasurementAverageRmsUnderVoltageCounterPhaseCAttributeInteractionInfo);
    Map<String, CommandParameterInfo>
        readElectricalMeasurementRmsExtremeOverVoltagePeriodPhaseCCommandParams =
            new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo
        readElectricalMeasurementRmsExtremeOverVoltagePeriodPhaseCAttributeInteractionInfo =
            new InteractionInfo(
                (cluster, callback, commandArguments) -> {
                  ((ChipClusters.ElectricalMeasurementCluster) cluster)
                      .readRmsExtremeOverVoltagePeriodPhaseCAttribute(
                          (ChipClusters.IntegerAttributeCallback) callback);
                },
                () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
                readElectricalMeasurementRmsExtremeOverVoltagePeriodPhaseCCommandParams);
    result.put(
        "readRmsExtremeOverVoltagePeriodPhaseCAttribute",
        readElectricalMeasurementRmsExtremeOverVoltagePeriodPhaseCAttributeInteractionInfo);
    Map<String, CommandParameterInfo>
        readElectricalMeasurementRmsExtremeUnderVoltagePeriodPhaseCCommandParams =
            new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo
        readElectricalMeasurementRmsExtremeUnderVoltagePeriodPhaseCAttributeInteractionInfo =
            new InteractionInfo(
                (cluster, callback, commandArguments) -> {
                  ((ChipClusters.ElectricalMeasurementCluster) cluster)
                      .readRmsExtremeUnderVoltagePeriodPhaseCAttribute(
                          (ChipClusters.IntegerAttributeCallback) callback);
                },
                () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
                readElectricalMeasurementRmsExtremeUnderVoltagePeriodPhaseCCommandParams);
    result.put(
        "readRmsExtremeUnderVoltagePeriodPhaseCAttribute",
        readElectricalMeasurementRmsExtremeUnderVoltagePeriodPhaseCAttributeInteractionInfo);
    Map<String, CommandParameterInfo>
        readElectricalMeasurementRmsVoltageSagPeriodPhaseCCommandParams =
            new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readElectricalMeasurementRmsVoltageSagPeriodPhaseCAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ElectricalMeasurementCluster) cluster)
                  .readRmsVoltageSagPeriodPhaseCAttribute(
                      (ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readElectricalMeasurementRmsVoltageSagPeriodPhaseCCommandParams);
    result.put(
        "readRmsVoltageSagPeriodPhaseCAttribute",
        readElectricalMeasurementRmsVoltageSagPeriodPhaseCAttributeInteractionInfo);
    Map<String, CommandParameterInfo>
        readElectricalMeasurementRmsVoltageSwellPeriodPhaseCCommandParams =
            new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readElectricalMeasurementRmsVoltageSwellPeriodPhaseCAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ElectricalMeasurementCluster) cluster)
                  .readRmsVoltageSwellPeriodPhaseCAttribute(
                      (ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readElectricalMeasurementRmsVoltageSwellPeriodPhaseCCommandParams);
    result.put(
        "readRmsVoltageSwellPeriodPhaseCAttribute",
        readElectricalMeasurementRmsVoltageSwellPeriodPhaseCAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readElectricalMeasurementGeneratedCommandListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readElectricalMeasurementGeneratedCommandListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ElectricalMeasurementCluster) cluster)
                  .readGeneratedCommandListAttribute(
                      (ChipClusters.ElectricalMeasurementCluster
                              .GeneratedCommandListAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedElectricalMeasurementClusterGeneratedCommandListAttributeCallback(),
            readElectricalMeasurementGeneratedCommandListCommandParams);
    result.put(
        "readGeneratedCommandListAttribute",
        readElectricalMeasurementGeneratedCommandListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readElectricalMeasurementAcceptedCommandListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readElectricalMeasurementAcceptedCommandListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ElectricalMeasurementCluster) cluster)
                  .readAcceptedCommandListAttribute(
                      (ChipClusters.ElectricalMeasurementCluster
                              .AcceptedCommandListAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedElectricalMeasurementClusterAcceptedCommandListAttributeCallback(),
            readElectricalMeasurementAcceptedCommandListCommandParams);
    result.put(
        "readAcceptedCommandListAttribute",
        readElectricalMeasurementAcceptedCommandListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readElectricalMeasurementEventListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readElectricalMeasurementEventListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ElectricalMeasurementCluster) cluster)
                  .readEventListAttribute(
                      (ChipClusters.ElectricalMeasurementCluster.EventListAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedElectricalMeasurementClusterEventListAttributeCallback(),
            readElectricalMeasurementEventListCommandParams);
    result.put(
        "readEventListAttribute", readElectricalMeasurementEventListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readElectricalMeasurementAttributeListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readElectricalMeasurementAttributeListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ElectricalMeasurementCluster) cluster)
                  .readAttributeListAttribute(
                      (ChipClusters.ElectricalMeasurementCluster.AttributeListAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedElectricalMeasurementClusterAttributeListAttributeCallback(),
            readElectricalMeasurementAttributeListCommandParams);
    result.put(
        "readAttributeListAttribute",
        readElectricalMeasurementAttributeListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readElectricalMeasurementFeatureMapCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readElectricalMeasurementFeatureMapAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ElectricalMeasurementCluster) cluster)
                  .readFeatureMapAttribute((ChipClusters.LongAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedLongAttributeCallback(),
            readElectricalMeasurementFeatureMapCommandParams);
    result.put(
        "readFeatureMapAttribute", readElectricalMeasurementFeatureMapAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readElectricalMeasurementClusterRevisionCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readElectricalMeasurementClusterRevisionAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.ElectricalMeasurementCluster) cluster)
                  .readClusterRevisionAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readElectricalMeasurementClusterRevisionCommandParams);
    result.put(
        "readClusterRevisionAttribute",
        readElectricalMeasurementClusterRevisionAttributeInteractionInfo);

    return result;
  }

  private static Map<String, InteractionInfo> readUnitTestingInteractionInfo() {
    Map<String, InteractionInfo> result = new LinkedHashMap<>();
    Map<String, CommandParameterInfo> readUnitTestingBooleanCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readUnitTestingBooleanAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.UnitTestingCluster) cluster)
                  .readBooleanAttribute((ChipClusters.BooleanAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedBooleanAttributeCallback(),
            readUnitTestingBooleanCommandParams);
    result.put("readBooleanAttribute", readUnitTestingBooleanAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readUnitTestingBitmap8CommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readUnitTestingBitmap8AttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.UnitTestingCluster) cluster)
                  .readBitmap8Attribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readUnitTestingBitmap8CommandParams);
    result.put("readBitmap8Attribute", readUnitTestingBitmap8AttributeInteractionInfo);
    Map<String, CommandParameterInfo> readUnitTestingBitmap16CommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readUnitTestingBitmap16AttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.UnitTestingCluster) cluster)
                  .readBitmap16Attribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readUnitTestingBitmap16CommandParams);
    result.put("readBitmap16Attribute", readUnitTestingBitmap16AttributeInteractionInfo);
    Map<String, CommandParameterInfo> readUnitTestingBitmap32CommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readUnitTestingBitmap32AttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.UnitTestingCluster) cluster)
                  .readBitmap32Attribute((ChipClusters.LongAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedLongAttributeCallback(),
            readUnitTestingBitmap32CommandParams);
    result.put("readBitmap32Attribute", readUnitTestingBitmap32AttributeInteractionInfo);
    Map<String, CommandParameterInfo> readUnitTestingBitmap64CommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readUnitTestingBitmap64AttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.UnitTestingCluster) cluster)
                  .readBitmap64Attribute((ChipClusters.LongAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedLongAttributeCallback(),
            readUnitTestingBitmap64CommandParams);
    result.put("readBitmap64Attribute", readUnitTestingBitmap64AttributeInteractionInfo);
    Map<String, CommandParameterInfo> readUnitTestingInt8uCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readUnitTestingInt8uAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.UnitTestingCluster) cluster)
                  .readInt8uAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readUnitTestingInt8uCommandParams);
    result.put("readInt8uAttribute", readUnitTestingInt8uAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readUnitTestingInt16uCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readUnitTestingInt16uAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.UnitTestingCluster) cluster)
                  .readInt16uAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readUnitTestingInt16uCommandParams);
    result.put("readInt16uAttribute", readUnitTestingInt16uAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readUnitTestingInt24uCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readUnitTestingInt24uAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.UnitTestingCluster) cluster)
                  .readInt24uAttribute((ChipClusters.LongAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedLongAttributeCallback(),
            readUnitTestingInt24uCommandParams);
    result.put("readInt24uAttribute", readUnitTestingInt24uAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readUnitTestingInt32uCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readUnitTestingInt32uAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.UnitTestingCluster) cluster)
                  .readInt32uAttribute((ChipClusters.LongAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedLongAttributeCallback(),
            readUnitTestingInt32uCommandParams);
    result.put("readInt32uAttribute", readUnitTestingInt32uAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readUnitTestingInt40uCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readUnitTestingInt40uAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.UnitTestingCluster) cluster)
                  .readInt40uAttribute((ChipClusters.LongAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedLongAttributeCallback(),
            readUnitTestingInt40uCommandParams);
    result.put("readInt40uAttribute", readUnitTestingInt40uAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readUnitTestingInt48uCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readUnitTestingInt48uAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.UnitTestingCluster) cluster)
                  .readInt48uAttribute((ChipClusters.LongAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedLongAttributeCallback(),
            readUnitTestingInt48uCommandParams);
    result.put("readInt48uAttribute", readUnitTestingInt48uAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readUnitTestingInt56uCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readUnitTestingInt56uAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.UnitTestingCluster) cluster)
                  .readInt56uAttribute((ChipClusters.LongAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedLongAttributeCallback(),
            readUnitTestingInt56uCommandParams);
    result.put("readInt56uAttribute", readUnitTestingInt56uAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readUnitTestingInt64uCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readUnitTestingInt64uAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.UnitTestingCluster) cluster)
                  .readInt64uAttribute((ChipClusters.LongAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedLongAttributeCallback(),
            readUnitTestingInt64uCommandParams);
    result.put("readInt64uAttribute", readUnitTestingInt64uAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readUnitTestingInt8sCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readUnitTestingInt8sAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.UnitTestingCluster) cluster)
                  .readInt8sAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readUnitTestingInt8sCommandParams);
    result.put("readInt8sAttribute", readUnitTestingInt8sAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readUnitTestingInt16sCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readUnitTestingInt16sAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.UnitTestingCluster) cluster)
                  .readInt16sAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readUnitTestingInt16sCommandParams);
    result.put("readInt16sAttribute", readUnitTestingInt16sAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readUnitTestingInt24sCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readUnitTestingInt24sAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.UnitTestingCluster) cluster)
                  .readInt24sAttribute((ChipClusters.LongAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedLongAttributeCallback(),
            readUnitTestingInt24sCommandParams);
    result.put("readInt24sAttribute", readUnitTestingInt24sAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readUnitTestingInt32sCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readUnitTestingInt32sAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.UnitTestingCluster) cluster)
                  .readInt32sAttribute((ChipClusters.LongAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedLongAttributeCallback(),
            readUnitTestingInt32sCommandParams);
    result.put("readInt32sAttribute", readUnitTestingInt32sAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readUnitTestingInt40sCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readUnitTestingInt40sAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.UnitTestingCluster) cluster)
                  .readInt40sAttribute((ChipClusters.LongAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedLongAttributeCallback(),
            readUnitTestingInt40sCommandParams);
    result.put("readInt40sAttribute", readUnitTestingInt40sAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readUnitTestingInt48sCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readUnitTestingInt48sAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.UnitTestingCluster) cluster)
                  .readInt48sAttribute((ChipClusters.LongAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedLongAttributeCallback(),
            readUnitTestingInt48sCommandParams);
    result.put("readInt48sAttribute", readUnitTestingInt48sAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readUnitTestingInt56sCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readUnitTestingInt56sAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.UnitTestingCluster) cluster)
                  .readInt56sAttribute((ChipClusters.LongAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedLongAttributeCallback(),
            readUnitTestingInt56sCommandParams);
    result.put("readInt56sAttribute", readUnitTestingInt56sAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readUnitTestingInt64sCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readUnitTestingInt64sAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.UnitTestingCluster) cluster)
                  .readInt64sAttribute((ChipClusters.LongAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedLongAttributeCallback(),
            readUnitTestingInt64sCommandParams);
    result.put("readInt64sAttribute", readUnitTestingInt64sAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readUnitTestingEnum8CommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readUnitTestingEnum8AttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.UnitTestingCluster) cluster)
                  .readEnum8Attribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readUnitTestingEnum8CommandParams);
    result.put("readEnum8Attribute", readUnitTestingEnum8AttributeInteractionInfo);
    Map<String, CommandParameterInfo> readUnitTestingEnum16CommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readUnitTestingEnum16AttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.UnitTestingCluster) cluster)
                  .readEnum16Attribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readUnitTestingEnum16CommandParams);
    result.put("readEnum16Attribute", readUnitTestingEnum16AttributeInteractionInfo);
    Map<String, CommandParameterInfo> readUnitTestingFloatSingleCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readUnitTestingFloatSingleAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.UnitTestingCluster) cluster)
                  .readFloatSingleAttribute((ChipClusters.FloatAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedFloatAttributeCallback(),
            readUnitTestingFloatSingleCommandParams);
    result.put("readFloatSingleAttribute", readUnitTestingFloatSingleAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readUnitTestingFloatDoubleCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readUnitTestingFloatDoubleAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.UnitTestingCluster) cluster)
                  .readFloatDoubleAttribute((ChipClusters.DoubleAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedDoubleAttributeCallback(),
            readUnitTestingFloatDoubleCommandParams);
    result.put("readFloatDoubleAttribute", readUnitTestingFloatDoubleAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readUnitTestingOctetStringCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readUnitTestingOctetStringAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.UnitTestingCluster) cluster)
                  .readOctetStringAttribute((ChipClusters.OctetStringAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedOctetStringAttributeCallback(),
            readUnitTestingOctetStringCommandParams);
    result.put("readOctetStringAttribute", readUnitTestingOctetStringAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readUnitTestingListInt8uCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readUnitTestingListInt8uAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.UnitTestingCluster) cluster)
                  .readListInt8uAttribute(
                      (ChipClusters.UnitTestingCluster.ListInt8uAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedUnitTestingClusterListInt8uAttributeCallback(),
            readUnitTestingListInt8uCommandParams);
    result.put("readListInt8uAttribute", readUnitTestingListInt8uAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readUnitTestingListOctetStringCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readUnitTestingListOctetStringAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.UnitTestingCluster) cluster)
                  .readListOctetStringAttribute(
                      (ChipClusters.UnitTestingCluster.ListOctetStringAttributeCallback) callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedUnitTestingClusterListOctetStringAttributeCallback(),
            readUnitTestingListOctetStringCommandParams);
    result.put(
        "readListOctetStringAttribute", readUnitTestingListOctetStringAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readUnitTestingListStructOctetStringCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readUnitTestingListStructOctetStringAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.UnitTestingCluster) cluster)
                  .readListStructOctetStringAttribute(
                      (ChipClusters.UnitTestingCluster.ListStructOctetStringAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedUnitTestingClusterListStructOctetStringAttributeCallback(),
            readUnitTestingListStructOctetStringCommandParams);
    result.put(
        "readListStructOctetStringAttribute",
        readUnitTestingListStructOctetStringAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readUnitTestingLongOctetStringCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readUnitTestingLongOctetStringAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.UnitTestingCluster) cluster)
                  .readLongOctetStringAttribute(
                      (ChipClusters.OctetStringAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedOctetStringAttributeCallback(),
            readUnitTestingLongOctetStringCommandParams);
    result.put(
        "readLongOctetStringAttribute", readUnitTestingLongOctetStringAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readUnitTestingCharStringCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readUnitTestingCharStringAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.UnitTestingCluster) cluster)
                  .readCharStringAttribute((ChipClusters.CharStringAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedCharStringAttributeCallback(),
            readUnitTestingCharStringCommandParams);
    result.put("readCharStringAttribute", readUnitTestingCharStringAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readUnitTestingLongCharStringCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readUnitTestingLongCharStringAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.UnitTestingCluster) cluster)
                  .readLongCharStringAttribute((ChipClusters.CharStringAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedCharStringAttributeCallback(),
            readUnitTestingLongCharStringCommandParams);
    result.put(
        "readLongCharStringAttribute", readUnitTestingLongCharStringAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readUnitTestingEpochUsCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readUnitTestingEpochUsAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.UnitTestingCluster) cluster)
                  .readEpochUsAttribute((ChipClusters.LongAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedLongAttributeCallback(),
            readUnitTestingEpochUsCommandParams);
    result.put("readEpochUsAttribute", readUnitTestingEpochUsAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readUnitTestingEpochSCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readUnitTestingEpochSAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.UnitTestingCluster) cluster)
                  .readEpochSAttribute((ChipClusters.LongAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedLongAttributeCallback(),
            readUnitTestingEpochSCommandParams);
    result.put("readEpochSAttribute", readUnitTestingEpochSAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readUnitTestingVendorIdCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readUnitTestingVendorIdAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.UnitTestingCluster) cluster)
                  .readVendorIdAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readUnitTestingVendorIdCommandParams);
    result.put("readVendorIdAttribute", readUnitTestingVendorIdAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readUnitTestingListNullablesAndOptionalsStructCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readUnitTestingListNullablesAndOptionalsStructAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.UnitTestingCluster) cluster)
                  .readListNullablesAndOptionalsStructAttribute(
                      (ChipClusters.UnitTestingCluster
                              .ListNullablesAndOptionalsStructAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedUnitTestingClusterListNullablesAndOptionalsStructAttributeCallback(),
            readUnitTestingListNullablesAndOptionalsStructCommandParams);
    result.put(
        "readListNullablesAndOptionalsStructAttribute",
        readUnitTestingListNullablesAndOptionalsStructAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readUnitTestingEnumAttrCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readUnitTestingEnumAttrAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.UnitTestingCluster) cluster)
                  .readEnumAttrAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readUnitTestingEnumAttrCommandParams);
    result.put("readEnumAttrAttribute", readUnitTestingEnumAttrAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readUnitTestingRangeRestrictedInt8uCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readUnitTestingRangeRestrictedInt8uAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.UnitTestingCluster) cluster)
                  .readRangeRestrictedInt8uAttribute(
                      (ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readUnitTestingRangeRestrictedInt8uCommandParams);
    result.put(
        "readRangeRestrictedInt8uAttribute",
        readUnitTestingRangeRestrictedInt8uAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readUnitTestingRangeRestrictedInt8sCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readUnitTestingRangeRestrictedInt8sAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.UnitTestingCluster) cluster)
                  .readRangeRestrictedInt8sAttribute(
                      (ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readUnitTestingRangeRestrictedInt8sCommandParams);
    result.put(
        "readRangeRestrictedInt8sAttribute",
        readUnitTestingRangeRestrictedInt8sAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readUnitTestingRangeRestrictedInt16uCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readUnitTestingRangeRestrictedInt16uAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.UnitTestingCluster) cluster)
                  .readRangeRestrictedInt16uAttribute(
                      (ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readUnitTestingRangeRestrictedInt16uCommandParams);
    result.put(
        "readRangeRestrictedInt16uAttribute",
        readUnitTestingRangeRestrictedInt16uAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readUnitTestingRangeRestrictedInt16sCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readUnitTestingRangeRestrictedInt16sAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.UnitTestingCluster) cluster)
                  .readRangeRestrictedInt16sAttribute(
                      (ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readUnitTestingRangeRestrictedInt16sCommandParams);
    result.put(
        "readRangeRestrictedInt16sAttribute",
        readUnitTestingRangeRestrictedInt16sAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readUnitTestingListLongOctetStringCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readUnitTestingListLongOctetStringAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.UnitTestingCluster) cluster)
                  .readListLongOctetStringAttribute(
                      (ChipClusters.UnitTestingCluster.ListLongOctetStringAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedUnitTestingClusterListLongOctetStringAttributeCallback(),
            readUnitTestingListLongOctetStringCommandParams);
    result.put(
        "readListLongOctetStringAttribute",
        readUnitTestingListLongOctetStringAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readUnitTestingListFabricScopedCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readUnitTestingListFabricScopedAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.UnitTestingCluster) cluster)
                  .readListFabricScopedAttribute(
                      (ChipClusters.UnitTestingCluster.ListFabricScopedAttributeCallback) callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedUnitTestingClusterListFabricScopedAttributeCallback(),
            readUnitTestingListFabricScopedCommandParams);
    result.put(
        "readListFabricScopedAttribute", readUnitTestingListFabricScopedAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readUnitTestingTimedWriteBooleanCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readUnitTestingTimedWriteBooleanAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.UnitTestingCluster) cluster)
                  .readTimedWriteBooleanAttribute((ChipClusters.BooleanAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedBooleanAttributeCallback(),
            readUnitTestingTimedWriteBooleanCommandParams);
    result.put(
        "readTimedWriteBooleanAttribute", readUnitTestingTimedWriteBooleanAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readUnitTestingGeneralErrorBooleanCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readUnitTestingGeneralErrorBooleanAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.UnitTestingCluster) cluster)
                  .readGeneralErrorBooleanAttribute(
                      (ChipClusters.BooleanAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedBooleanAttributeCallback(),
            readUnitTestingGeneralErrorBooleanCommandParams);
    result.put(
        "readGeneralErrorBooleanAttribute",
        readUnitTestingGeneralErrorBooleanAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readUnitTestingClusterErrorBooleanCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readUnitTestingClusterErrorBooleanAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.UnitTestingCluster) cluster)
                  .readClusterErrorBooleanAttribute(
                      (ChipClusters.BooleanAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedBooleanAttributeCallback(),
            readUnitTestingClusterErrorBooleanCommandParams);
    result.put(
        "readClusterErrorBooleanAttribute",
        readUnitTestingClusterErrorBooleanAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readUnitTestingUnsupportedCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readUnitTestingUnsupportedAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.UnitTestingCluster) cluster)
                  .readUnsupportedAttribute((ChipClusters.BooleanAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedBooleanAttributeCallback(),
            readUnitTestingUnsupportedCommandParams);
    result.put("readUnsupportedAttribute", readUnitTestingUnsupportedAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readUnitTestingNullableBooleanCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readUnitTestingNullableBooleanAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.UnitTestingCluster) cluster)
                  .readNullableBooleanAttribute(
                      (ChipClusters.UnitTestingCluster.NullableBooleanAttributeCallback) callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedUnitTestingClusterNullableBooleanAttributeCallback(),
            readUnitTestingNullableBooleanCommandParams);
    result.put(
        "readNullableBooleanAttribute", readUnitTestingNullableBooleanAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readUnitTestingNullableBitmap8CommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readUnitTestingNullableBitmap8AttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.UnitTestingCluster) cluster)
                  .readNullableBitmap8Attribute(
                      (ChipClusters.UnitTestingCluster.NullableBitmap8AttributeCallback) callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedUnitTestingClusterNullableBitmap8AttributeCallback(),
            readUnitTestingNullableBitmap8CommandParams);
    result.put(
        "readNullableBitmap8Attribute", readUnitTestingNullableBitmap8AttributeInteractionInfo);
    Map<String, CommandParameterInfo> readUnitTestingNullableBitmap16CommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readUnitTestingNullableBitmap16AttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.UnitTestingCluster) cluster)
                  .readNullableBitmap16Attribute(
                      (ChipClusters.UnitTestingCluster.NullableBitmap16AttributeCallback) callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedUnitTestingClusterNullableBitmap16AttributeCallback(),
            readUnitTestingNullableBitmap16CommandParams);
    result.put(
        "readNullableBitmap16Attribute", readUnitTestingNullableBitmap16AttributeInteractionInfo);
    Map<String, CommandParameterInfo> readUnitTestingNullableBitmap32CommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readUnitTestingNullableBitmap32AttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.UnitTestingCluster) cluster)
                  .readNullableBitmap32Attribute(
                      (ChipClusters.UnitTestingCluster.NullableBitmap32AttributeCallback) callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedUnitTestingClusterNullableBitmap32AttributeCallback(),
            readUnitTestingNullableBitmap32CommandParams);
    result.put(
        "readNullableBitmap32Attribute", readUnitTestingNullableBitmap32AttributeInteractionInfo);
    Map<String, CommandParameterInfo> readUnitTestingNullableBitmap64CommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readUnitTestingNullableBitmap64AttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.UnitTestingCluster) cluster)
                  .readNullableBitmap64Attribute(
                      (ChipClusters.UnitTestingCluster.NullableBitmap64AttributeCallback) callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedUnitTestingClusterNullableBitmap64AttributeCallback(),
            readUnitTestingNullableBitmap64CommandParams);
    result.put(
        "readNullableBitmap64Attribute", readUnitTestingNullableBitmap64AttributeInteractionInfo);
    Map<String, CommandParameterInfo> readUnitTestingNullableInt8uCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readUnitTestingNullableInt8uAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.UnitTestingCluster) cluster)
                  .readNullableInt8uAttribute(
                      (ChipClusters.UnitTestingCluster.NullableInt8uAttributeCallback) callback);
            },
            () ->
                new ClusterInfoMapping.DelegatedUnitTestingClusterNullableInt8uAttributeCallback(),
            readUnitTestingNullableInt8uCommandParams);
    result.put("readNullableInt8uAttribute", readUnitTestingNullableInt8uAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readUnitTestingNullableInt16uCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readUnitTestingNullableInt16uAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.UnitTestingCluster) cluster)
                  .readNullableInt16uAttribute(
                      (ChipClusters.UnitTestingCluster.NullableInt16uAttributeCallback) callback);
            },
            () ->
                new ClusterInfoMapping.DelegatedUnitTestingClusterNullableInt16uAttributeCallback(),
            readUnitTestingNullableInt16uCommandParams);
    result.put(
        "readNullableInt16uAttribute", readUnitTestingNullableInt16uAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readUnitTestingNullableInt24uCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readUnitTestingNullableInt24uAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.UnitTestingCluster) cluster)
                  .readNullableInt24uAttribute(
                      (ChipClusters.UnitTestingCluster.NullableInt24uAttributeCallback) callback);
            },
            () ->
                new ClusterInfoMapping.DelegatedUnitTestingClusterNullableInt24uAttributeCallback(),
            readUnitTestingNullableInt24uCommandParams);
    result.put(
        "readNullableInt24uAttribute", readUnitTestingNullableInt24uAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readUnitTestingNullableInt32uCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readUnitTestingNullableInt32uAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.UnitTestingCluster) cluster)
                  .readNullableInt32uAttribute(
                      (ChipClusters.UnitTestingCluster.NullableInt32uAttributeCallback) callback);
            },
            () ->
                new ClusterInfoMapping.DelegatedUnitTestingClusterNullableInt32uAttributeCallback(),
            readUnitTestingNullableInt32uCommandParams);
    result.put(
        "readNullableInt32uAttribute", readUnitTestingNullableInt32uAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readUnitTestingNullableInt40uCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readUnitTestingNullableInt40uAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.UnitTestingCluster) cluster)
                  .readNullableInt40uAttribute(
                      (ChipClusters.UnitTestingCluster.NullableInt40uAttributeCallback) callback);
            },
            () ->
                new ClusterInfoMapping.DelegatedUnitTestingClusterNullableInt40uAttributeCallback(),
            readUnitTestingNullableInt40uCommandParams);
    result.put(
        "readNullableInt40uAttribute", readUnitTestingNullableInt40uAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readUnitTestingNullableInt48uCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readUnitTestingNullableInt48uAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.UnitTestingCluster) cluster)
                  .readNullableInt48uAttribute(
                      (ChipClusters.UnitTestingCluster.NullableInt48uAttributeCallback) callback);
            },
            () ->
                new ClusterInfoMapping.DelegatedUnitTestingClusterNullableInt48uAttributeCallback(),
            readUnitTestingNullableInt48uCommandParams);
    result.put(
        "readNullableInt48uAttribute", readUnitTestingNullableInt48uAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readUnitTestingNullableInt56uCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readUnitTestingNullableInt56uAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.UnitTestingCluster) cluster)
                  .readNullableInt56uAttribute(
                      (ChipClusters.UnitTestingCluster.NullableInt56uAttributeCallback) callback);
            },
            () ->
                new ClusterInfoMapping.DelegatedUnitTestingClusterNullableInt56uAttributeCallback(),
            readUnitTestingNullableInt56uCommandParams);
    result.put(
        "readNullableInt56uAttribute", readUnitTestingNullableInt56uAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readUnitTestingNullableInt64uCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readUnitTestingNullableInt64uAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.UnitTestingCluster) cluster)
                  .readNullableInt64uAttribute(
                      (ChipClusters.UnitTestingCluster.NullableInt64uAttributeCallback) callback);
            },
            () ->
                new ClusterInfoMapping.DelegatedUnitTestingClusterNullableInt64uAttributeCallback(),
            readUnitTestingNullableInt64uCommandParams);
    result.put(
        "readNullableInt64uAttribute", readUnitTestingNullableInt64uAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readUnitTestingNullableInt8sCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readUnitTestingNullableInt8sAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.UnitTestingCluster) cluster)
                  .readNullableInt8sAttribute(
                      (ChipClusters.UnitTestingCluster.NullableInt8sAttributeCallback) callback);
            },
            () ->
                new ClusterInfoMapping.DelegatedUnitTestingClusterNullableInt8sAttributeCallback(),
            readUnitTestingNullableInt8sCommandParams);
    result.put("readNullableInt8sAttribute", readUnitTestingNullableInt8sAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readUnitTestingNullableInt16sCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readUnitTestingNullableInt16sAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.UnitTestingCluster) cluster)
                  .readNullableInt16sAttribute(
                      (ChipClusters.UnitTestingCluster.NullableInt16sAttributeCallback) callback);
            },
            () ->
                new ClusterInfoMapping.DelegatedUnitTestingClusterNullableInt16sAttributeCallback(),
            readUnitTestingNullableInt16sCommandParams);
    result.put(
        "readNullableInt16sAttribute", readUnitTestingNullableInt16sAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readUnitTestingNullableInt24sCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readUnitTestingNullableInt24sAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.UnitTestingCluster) cluster)
                  .readNullableInt24sAttribute(
                      (ChipClusters.UnitTestingCluster.NullableInt24sAttributeCallback) callback);
            },
            () ->
                new ClusterInfoMapping.DelegatedUnitTestingClusterNullableInt24sAttributeCallback(),
            readUnitTestingNullableInt24sCommandParams);
    result.put(
        "readNullableInt24sAttribute", readUnitTestingNullableInt24sAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readUnitTestingNullableInt32sCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readUnitTestingNullableInt32sAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.UnitTestingCluster) cluster)
                  .readNullableInt32sAttribute(
                      (ChipClusters.UnitTestingCluster.NullableInt32sAttributeCallback) callback);
            },
            () ->
                new ClusterInfoMapping.DelegatedUnitTestingClusterNullableInt32sAttributeCallback(),
            readUnitTestingNullableInt32sCommandParams);
    result.put(
        "readNullableInt32sAttribute", readUnitTestingNullableInt32sAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readUnitTestingNullableInt40sCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readUnitTestingNullableInt40sAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.UnitTestingCluster) cluster)
                  .readNullableInt40sAttribute(
                      (ChipClusters.UnitTestingCluster.NullableInt40sAttributeCallback) callback);
            },
            () ->
                new ClusterInfoMapping.DelegatedUnitTestingClusterNullableInt40sAttributeCallback(),
            readUnitTestingNullableInt40sCommandParams);
    result.put(
        "readNullableInt40sAttribute", readUnitTestingNullableInt40sAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readUnitTestingNullableInt48sCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readUnitTestingNullableInt48sAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.UnitTestingCluster) cluster)
                  .readNullableInt48sAttribute(
                      (ChipClusters.UnitTestingCluster.NullableInt48sAttributeCallback) callback);
            },
            () ->
                new ClusterInfoMapping.DelegatedUnitTestingClusterNullableInt48sAttributeCallback(),
            readUnitTestingNullableInt48sCommandParams);
    result.put(
        "readNullableInt48sAttribute", readUnitTestingNullableInt48sAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readUnitTestingNullableInt56sCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readUnitTestingNullableInt56sAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.UnitTestingCluster) cluster)
                  .readNullableInt56sAttribute(
                      (ChipClusters.UnitTestingCluster.NullableInt56sAttributeCallback) callback);
            },
            () ->
                new ClusterInfoMapping.DelegatedUnitTestingClusterNullableInt56sAttributeCallback(),
            readUnitTestingNullableInt56sCommandParams);
    result.put(
        "readNullableInt56sAttribute", readUnitTestingNullableInt56sAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readUnitTestingNullableInt64sCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readUnitTestingNullableInt64sAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.UnitTestingCluster) cluster)
                  .readNullableInt64sAttribute(
                      (ChipClusters.UnitTestingCluster.NullableInt64sAttributeCallback) callback);
            },
            () ->
                new ClusterInfoMapping.DelegatedUnitTestingClusterNullableInt64sAttributeCallback(),
            readUnitTestingNullableInt64sCommandParams);
    result.put(
        "readNullableInt64sAttribute", readUnitTestingNullableInt64sAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readUnitTestingNullableEnum8CommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readUnitTestingNullableEnum8AttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.UnitTestingCluster) cluster)
                  .readNullableEnum8Attribute(
                      (ChipClusters.UnitTestingCluster.NullableEnum8AttributeCallback) callback);
            },
            () ->
                new ClusterInfoMapping.DelegatedUnitTestingClusterNullableEnum8AttributeCallback(),
            readUnitTestingNullableEnum8CommandParams);
    result.put("readNullableEnum8Attribute", readUnitTestingNullableEnum8AttributeInteractionInfo);
    Map<String, CommandParameterInfo> readUnitTestingNullableEnum16CommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readUnitTestingNullableEnum16AttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.UnitTestingCluster) cluster)
                  .readNullableEnum16Attribute(
                      (ChipClusters.UnitTestingCluster.NullableEnum16AttributeCallback) callback);
            },
            () ->
                new ClusterInfoMapping.DelegatedUnitTestingClusterNullableEnum16AttributeCallback(),
            readUnitTestingNullableEnum16CommandParams);
    result.put(
        "readNullableEnum16Attribute", readUnitTestingNullableEnum16AttributeInteractionInfo);
    Map<String, CommandParameterInfo> readUnitTestingNullableFloatSingleCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readUnitTestingNullableFloatSingleAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.UnitTestingCluster) cluster)
                  .readNullableFloatSingleAttribute(
                      (ChipClusters.UnitTestingCluster.NullableFloatSingleAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedUnitTestingClusterNullableFloatSingleAttributeCallback(),
            readUnitTestingNullableFloatSingleCommandParams);
    result.put(
        "readNullableFloatSingleAttribute",
        readUnitTestingNullableFloatSingleAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readUnitTestingNullableFloatDoubleCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readUnitTestingNullableFloatDoubleAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.UnitTestingCluster) cluster)
                  .readNullableFloatDoubleAttribute(
                      (ChipClusters.UnitTestingCluster.NullableFloatDoubleAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedUnitTestingClusterNullableFloatDoubleAttributeCallback(),
            readUnitTestingNullableFloatDoubleCommandParams);
    result.put(
        "readNullableFloatDoubleAttribute",
        readUnitTestingNullableFloatDoubleAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readUnitTestingNullableOctetStringCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readUnitTestingNullableOctetStringAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.UnitTestingCluster) cluster)
                  .readNullableOctetStringAttribute(
                      (ChipClusters.UnitTestingCluster.NullableOctetStringAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedUnitTestingClusterNullableOctetStringAttributeCallback(),
            readUnitTestingNullableOctetStringCommandParams);
    result.put(
        "readNullableOctetStringAttribute",
        readUnitTestingNullableOctetStringAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readUnitTestingNullableCharStringCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readUnitTestingNullableCharStringAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.UnitTestingCluster) cluster)
                  .readNullableCharStringAttribute(
                      (ChipClusters.UnitTestingCluster.NullableCharStringAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedUnitTestingClusterNullableCharStringAttributeCallback(),
            readUnitTestingNullableCharStringCommandParams);
    result.put(
        "readNullableCharStringAttribute",
        readUnitTestingNullableCharStringAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readUnitTestingNullableEnumAttrCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readUnitTestingNullableEnumAttrAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.UnitTestingCluster) cluster)
                  .readNullableEnumAttrAttribute(
                      (ChipClusters.UnitTestingCluster.NullableEnumAttrAttributeCallback) callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedUnitTestingClusterNullableEnumAttrAttributeCallback(),
            readUnitTestingNullableEnumAttrCommandParams);
    result.put(
        "readNullableEnumAttrAttribute", readUnitTestingNullableEnumAttrAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readUnitTestingNullableRangeRestrictedInt8uCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readUnitTestingNullableRangeRestrictedInt8uAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.UnitTestingCluster) cluster)
                  .readNullableRangeRestrictedInt8uAttribute(
                      (ChipClusters.UnitTestingCluster
                              .NullableRangeRestrictedInt8uAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedUnitTestingClusterNullableRangeRestrictedInt8uAttributeCallback(),
            readUnitTestingNullableRangeRestrictedInt8uCommandParams);
    result.put(
        "readNullableRangeRestrictedInt8uAttribute",
        readUnitTestingNullableRangeRestrictedInt8uAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readUnitTestingNullableRangeRestrictedInt8sCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readUnitTestingNullableRangeRestrictedInt8sAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.UnitTestingCluster) cluster)
                  .readNullableRangeRestrictedInt8sAttribute(
                      (ChipClusters.UnitTestingCluster
                              .NullableRangeRestrictedInt8sAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedUnitTestingClusterNullableRangeRestrictedInt8sAttributeCallback(),
            readUnitTestingNullableRangeRestrictedInt8sCommandParams);
    result.put(
        "readNullableRangeRestrictedInt8sAttribute",
        readUnitTestingNullableRangeRestrictedInt8sAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readUnitTestingNullableRangeRestrictedInt16uCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readUnitTestingNullableRangeRestrictedInt16uAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.UnitTestingCluster) cluster)
                  .readNullableRangeRestrictedInt16uAttribute(
                      (ChipClusters.UnitTestingCluster
                              .NullableRangeRestrictedInt16uAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedUnitTestingClusterNullableRangeRestrictedInt16uAttributeCallback(),
            readUnitTestingNullableRangeRestrictedInt16uCommandParams);
    result.put(
        "readNullableRangeRestrictedInt16uAttribute",
        readUnitTestingNullableRangeRestrictedInt16uAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readUnitTestingNullableRangeRestrictedInt16sCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readUnitTestingNullableRangeRestrictedInt16sAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.UnitTestingCluster) cluster)
                  .readNullableRangeRestrictedInt16sAttribute(
                      (ChipClusters.UnitTestingCluster
                              .NullableRangeRestrictedInt16sAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedUnitTestingClusterNullableRangeRestrictedInt16sAttributeCallback(),
            readUnitTestingNullableRangeRestrictedInt16sCommandParams);
    result.put(
        "readNullableRangeRestrictedInt16sAttribute",
        readUnitTestingNullableRangeRestrictedInt16sAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readUnitTestingWriteOnlyInt8uCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readUnitTestingWriteOnlyInt8uAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.UnitTestingCluster) cluster)
                  .readWriteOnlyInt8uAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readUnitTestingWriteOnlyInt8uCommandParams);
    result.put(
        "readWriteOnlyInt8uAttribute", readUnitTestingWriteOnlyInt8uAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readUnitTestingGeneratedCommandListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readUnitTestingGeneratedCommandListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.UnitTestingCluster) cluster)
                  .readGeneratedCommandListAttribute(
                      (ChipClusters.UnitTestingCluster.GeneratedCommandListAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedUnitTestingClusterGeneratedCommandListAttributeCallback(),
            readUnitTestingGeneratedCommandListCommandParams);
    result.put(
        "readGeneratedCommandListAttribute",
        readUnitTestingGeneratedCommandListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readUnitTestingAcceptedCommandListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readUnitTestingAcceptedCommandListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.UnitTestingCluster) cluster)
                  .readAcceptedCommandListAttribute(
                      (ChipClusters.UnitTestingCluster.AcceptedCommandListAttributeCallback)
                          callback);
            },
            () ->
                new ClusterInfoMapping
                    .DelegatedUnitTestingClusterAcceptedCommandListAttributeCallback(),
            readUnitTestingAcceptedCommandListCommandParams);
    result.put(
        "readAcceptedCommandListAttribute",
        readUnitTestingAcceptedCommandListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readUnitTestingEventListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readUnitTestingEventListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.UnitTestingCluster) cluster)
                  .readEventListAttribute(
                      (ChipClusters.UnitTestingCluster.EventListAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedUnitTestingClusterEventListAttributeCallback(),
            readUnitTestingEventListCommandParams);
    result.put("readEventListAttribute", readUnitTestingEventListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readUnitTestingAttributeListCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readUnitTestingAttributeListAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.UnitTestingCluster) cluster)
                  .readAttributeListAttribute(
                      (ChipClusters.UnitTestingCluster.AttributeListAttributeCallback) callback);
            },
            () ->
                new ClusterInfoMapping.DelegatedUnitTestingClusterAttributeListAttributeCallback(),
            readUnitTestingAttributeListCommandParams);
    result.put("readAttributeListAttribute", readUnitTestingAttributeListAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readUnitTestingFeatureMapCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readUnitTestingFeatureMapAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.UnitTestingCluster) cluster)
                  .readFeatureMapAttribute((ChipClusters.LongAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedLongAttributeCallback(),
            readUnitTestingFeatureMapCommandParams);
    result.put("readFeatureMapAttribute", readUnitTestingFeatureMapAttributeInteractionInfo);
    Map<String, CommandParameterInfo> readUnitTestingClusterRevisionCommandParams =
        new LinkedHashMap<String, CommandParameterInfo>();
    InteractionInfo readUnitTestingClusterRevisionAttributeInteractionInfo =
        new InteractionInfo(
            (cluster, callback, commandArguments) -> {
              ((ChipClusters.UnitTestingCluster) cluster)
                  .readClusterRevisionAttribute((ChipClusters.IntegerAttributeCallback) callback);
            },
            () -> new ClusterInfoMapping.DelegatedIntegerAttributeCallback(),
            readUnitTestingClusterRevisionCommandParams);
    result.put(
        "readClusterRevisionAttribute", readUnitTestingClusterRevisionAttributeInteractionInfo);

    return result;
  }

  @SuppressWarnings("serial")
  public Map<String, Map<String, InteractionInfo>> getReadAttributeMap() {

    return new HashMap<String, Map<String, InteractionInfo>>() {
      {
        put("identify", readIdentifyInteractionInfo());
        put("groups", readGroupsInteractionInfo());
        put("scenes", readScenesInteractionInfo());
        put("onOff", readOnOffInteractionInfo());
        put("onOffSwitchConfiguration", readOnOffSwitchConfigurationInteractionInfo());
        put("levelControl", readLevelControlInteractionInfo());
        put("binaryInputBasic", readBinaryInputBasicInteractionInfo());
        put("descriptor", readDescriptorInteractionInfo());
        put("binding", readBindingInteractionInfo());
        put("accessControl", readAccessControlInteractionInfo());
        put("actions", readActionsInteractionInfo());
        put("basicInformation", readBasicInformationInteractionInfo());
        put("otaSoftwareUpdateProvider", readOtaSoftwareUpdateProviderInteractionInfo());
        put("otaSoftwareUpdateRequestor", readOtaSoftwareUpdateRequestorInteractionInfo());
        put("localizationConfiguration", readLocalizationConfigurationInteractionInfo());
        put("timeFormatLocalization", readTimeFormatLocalizationInteractionInfo());
        put("unitLocalization", readUnitLocalizationInteractionInfo());
        put("powerSourceConfiguration", readPowerSourceConfigurationInteractionInfo());
        put("powerSource", readPowerSourceInteractionInfo());
        put("generalCommissioning", readGeneralCommissioningInteractionInfo());
        put("networkCommissioning", readNetworkCommissioningInteractionInfo());
        put("diagnosticLogs", readDiagnosticLogsInteractionInfo());
        put("generalDiagnostics", readGeneralDiagnosticsInteractionInfo());
        put("softwareDiagnostics", readSoftwareDiagnosticsInteractionInfo());
        put("threadNetworkDiagnostics", readThreadNetworkDiagnosticsInteractionInfo());
        put("wiFiNetworkDiagnostics", readWiFiNetworkDiagnosticsInteractionInfo());
        put("ethernetNetworkDiagnostics", readEthernetNetworkDiagnosticsInteractionInfo());
        put("bridgedDeviceBasicInformation", readBridgedDeviceBasicInformationInteractionInfo());
        put("switch", readSwitchInteractionInfo());
        put("administratorCommissioning", readAdministratorCommissioningInteractionInfo());
        put("operationalCredentials", readOperationalCredentialsInteractionInfo());
        put("groupKeyManagement", readGroupKeyManagementInteractionInfo());
        put("fixedLabel", readFixedLabelInteractionInfo());
        put("userLabel", readUserLabelInteractionInfo());
        put("booleanState", readBooleanStateInteractionInfo());
        put("modeSelect", readModeSelectInteractionInfo());
        put("doorLock", readDoorLockInteractionInfo());
        put("windowCovering", readWindowCoveringInteractionInfo());
        put("barrierControl", readBarrierControlInteractionInfo());
        put("pumpConfigurationAndControl", readPumpConfigurationAndControlInteractionInfo());
        put("thermostat", readThermostatInteractionInfo());
        put("fanControl", readFanControlInteractionInfo());
        put(
            "thermostatUserInterfaceConfiguration",
            readThermostatUserInterfaceConfigurationInteractionInfo());
        put("colorControl", readColorControlInteractionInfo());
        put("ballastConfiguration", readBallastConfigurationInteractionInfo());
        put("illuminanceMeasurement", readIlluminanceMeasurementInteractionInfo());
        put("temperatureMeasurement", readTemperatureMeasurementInteractionInfo());
        put("pressureMeasurement", readPressureMeasurementInteractionInfo());
        put("flowMeasurement", readFlowMeasurementInteractionInfo());
        put("relativeHumidityMeasurement", readRelativeHumidityMeasurementInteractionInfo());
        put("occupancySensing", readOccupancySensingInteractionInfo());
        put("wakeOnLan", readWakeOnLanInteractionInfo());
        put("channel", readChannelInteractionInfo());
        put("targetNavigator", readTargetNavigatorInteractionInfo());
        put("mediaPlayback", readMediaPlaybackInteractionInfo());
        put("mediaInput", readMediaInputInteractionInfo());
        put("lowPower", readLowPowerInteractionInfo());
        put("keypadInput", readKeypadInputInteractionInfo());
        put("contentLauncher", readContentLauncherInteractionInfo());
        put("audioOutput", readAudioOutputInteractionInfo());
        put("applicationLauncher", readApplicationLauncherInteractionInfo());
        put("applicationBasic", readApplicationBasicInteractionInfo());
        put("accountLogin", readAccountLoginInteractionInfo());
        put("electricalMeasurement", readElectricalMeasurementInteractionInfo());
        put("unitTesting", readUnitTestingInteractionInfo());
      }
    };
  }
}