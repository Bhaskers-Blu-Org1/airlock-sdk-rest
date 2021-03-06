/*
 * 
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.ncp.airlock.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Represents an Airlock stream.
 */
@ApiModel(description = "Represents an Airlock stream.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2018-10-26T06:00:40.553Z[Etc/UTC]")
public class Stream {
  public static final String SERIALIZED_NAME_FILTER = "filter";
  @SerializedName(SERIALIZED_NAME_FILTER)
  private String filter = null;

  public static final String SERIALIZED_NAME_PROCESSOR = "processor";
  @SerializedName(SERIALIZED_NAME_PROCESSOR)
  private String processor = null;

  public static final String SERIALIZED_NAME_TRACE = "trace";
  @SerializedName(SERIALIZED_NAME_TRACE)
  private List<String> trace = null;

  public static final String SERIALIZED_NAME_ENABLED = "enabled";
  @SerializedName(SERIALIZED_NAME_ENABLED)
  private Boolean enabled = null;

  public static final String SERIALIZED_NAME_PROCESSING_ENABLED = "processingEnabled";
  @SerializedName(SERIALIZED_NAME_PROCESSING_ENABLED)
  private Boolean processingEnabled = null;

  public static final String SERIALIZED_NAME_PROCESSING_SUSPENDED = "processingSuspended";
  @SerializedName(SERIALIZED_NAME_PROCESSING_SUSPENDED)
  private Boolean processingSuspended = null;

  public static final String SERIALIZED_NAME_INTERNAL_USER_GROUPS = "internalUserGroups";
  @SerializedName(SERIALIZED_NAME_INTERNAL_USER_GROUPS)
  private List<Object> internalUserGroups = null;

  public static final String SERIALIZED_NAME_MIN_APP_VERSION = "minAppVersion";
  @SerializedName(SERIALIZED_NAME_MIN_APP_VERSION)
  private String minAppVersion = null;

  public static final String SERIALIZED_NAME_ROLLOUT_PERCENTAGE = "rolloutPercentage";
  @SerializedName(SERIALIZED_NAME_ROLLOUT_PERCENTAGE)
  private Long rolloutPercentage = null;

  public static final String SERIALIZED_NAME_STAGE = "stage";
  @SerializedName(SERIALIZED_NAME_STAGE)
  private String stage = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name = null;

  public static final String SERIALIZED_NAME_MAX_CACHE_SIZE = "maxCacheSize";
  @SerializedName(SERIALIZED_NAME_MAX_CACHE_SIZE)
  private Integer maxCacheSize = null;

  public static final String SERIALIZED_NAME_LAST_PROCESSED_TIME = "lastProcessedTime";
  @SerializedName(SERIALIZED_NAME_LAST_PROCESSED_TIME)
  private String lastProcessedTime = null;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id = null;

  public static final String SERIALIZED_NAME_EVENTS = "events";
  @SerializedName(SERIALIZED_NAME_EVENTS)
  private List<Object> events = null;

  public static final String SERIALIZED_NAME_CACHE = "cache";
  @SerializedName(SERIALIZED_NAME_CACHE)
  private String cache = null;

  public static final String SERIALIZED_NAME_RESULT = "result";
  @SerializedName(SERIALIZED_NAME_RESULT)
  private String result = null;

  public Stream filter(String filter) {
    this.filter = filter;
    return this;
  }

   /**
   * Stream filter string value.
   * @return filter
  **/
  @ApiModelProperty(value = "Stream filter string value.")
  public String getFilter() {
    return filter;
  }

  public void setFilter(String filter) {
    this.filter = filter;
  }

  public Stream processor(String processor) {
    this.processor = processor;
    return this;
  }

   /**
   * Stream processor string value.
   * @return processor
  **/
  @ApiModelProperty(value = "Stream processor string value.")
  public String getProcessor() {
    return processor;
  }

  public void setProcessor(String processor) {
    this.processor = processor;
  }

  public Stream trace(List<String> trace) {
    this.trace = trace;
    return this;
  }

  public Stream addTraceItem(String traceItem) {
    if (this.trace == null) {
      this.trace = new ArrayList<>();
    }
    this.trace.add(traceItem);
    return this;
  }

   /**
   * Stream trace messages.
   * @return trace
  **/
  @ApiModelProperty(value = "Stream trace messages.")
  public List<String> getTrace() {
    return trace;
  }

  public void setTrace(List<String> trace) {
    this.trace = trace;
  }

  public Stream enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Stream enablement status.
   * @return enabled
  **/
  @ApiModelProperty(value = "Stream enablement status.")
  public Boolean isEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public Stream processingEnabled(Boolean processingEnabled) {
    this.processingEnabled = processingEnabled;
    return this;
  }

   /**
   * Stream status.
   * @return processingEnabled
  **/
  @ApiModelProperty(value = "Stream status.")
  public Boolean isProcessingEnabled() {
    return processingEnabled;
  }

  public void setProcessingEnabled(Boolean processingEnabled) {
    this.processingEnabled = processingEnabled;
  }

  public Stream processingSuspended(Boolean processingSuspended) {
    this.processingSuspended = processingSuspended;
    return this;
  }

   /**
   * Stream processing suspention flag value
   * @return processingSuspended
  **/
  @ApiModelProperty(value = "Stream processing suspention flag value")
  public Boolean isProcessingSuspended() {
    return processingSuspended;
  }

  public void setProcessingSuspended(Boolean processingSuspended) {
    this.processingSuspended = processingSuspended;
  }

  public Stream internalUserGroups(List<Object> internalUserGroups) {
    this.internalUserGroups = internalUserGroups;
    return this;
  }

  public Stream addInternalUserGroupsItem(Object internalUserGroupsItem) {
    if (this.internalUserGroups == null) {
      this.internalUserGroups = new ArrayList<>();
    }
    this.internalUserGroups.add(internalUserGroupsItem);
    return this;
  }

   /**
   * Stream internal groups.
   * @return internalUserGroups
  **/
  @ApiModelProperty(value = "Stream internal groups.")
  public List<Object> getInternalUserGroups() {
    return internalUserGroups;
  }

  public void setInternalUserGroups(List<Object> internalUserGroups) {
    this.internalUserGroups = internalUserGroups;
  }

  public Stream minAppVersion(String minAppVersion) {
    this.minAppVersion = minAppVersion;
    return this;
  }

   /**
   * Stream minApp version defined.
   * @return minAppVersion
  **/
  @ApiModelProperty(value = "Stream minApp version defined.")
  public String getMinAppVersion() {
    return minAppVersion;
  }

  public void setMinAppVersion(String minAppVersion) {
    this.minAppVersion = minAppVersion;
  }

  public Stream rolloutPercentage(Long rolloutPercentage) {
    this.rolloutPercentage = rolloutPercentage;
    return this;
  }

   /**
   * Stream rollout percentage version defined.
   * @return rolloutPercentage
  **/
  @ApiModelProperty(value = "Stream rollout percentage version defined.")
  public Long getRolloutPercentage() {
    return rolloutPercentage;
  }

  public void setRolloutPercentage(Long rolloutPercentage) {
    this.rolloutPercentage = rolloutPercentage;
  }

  public Stream stage(String stage) {
    this.stage = stage;
    return this;
  }

   /**
   * Stream stage.
   * @return stage
  **/
  @ApiModelProperty(value = "Stream stage.")
  public String getStage() {
    return stage;
  }

  public void setStage(String stage) {
    this.stage = stage;
  }

  public Stream name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Stream name
   * @return name
  **/
  @ApiModelProperty(value = "Stream name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Stream maxCacheSize(Integer maxCacheSize) {
    this.maxCacheSize = maxCacheSize;
    return this;
  }

   /**
   * Stream maxCachSize.
   * @return maxCacheSize
  **/
  @ApiModelProperty(value = "Stream maxCachSize.")
  public Integer getMaxCacheSize() {
    return maxCacheSize;
  }

  public void setMaxCacheSize(Integer maxCacheSize) {
    this.maxCacheSize = maxCacheSize;
  }

  public Stream lastProcessedTime(String lastProcessedTime) {
    this.lastProcessedTime = lastProcessedTime;
    return this;
  }

   /**
   * Stream lastProcessedTime.
   * @return lastProcessedTime
  **/
  @ApiModelProperty(value = "Stream lastProcessedTime.")
  public String getLastProcessedTime() {
    return lastProcessedTime;
  }

  public void setLastProcessedTime(String lastProcessedTime) {
    this.lastProcessedTime = lastProcessedTime;
  }

  public Stream id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Stream id.
   * @return id
  **/
  @ApiModelProperty(value = "Stream id.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Stream events(List<Object> events) {
    this.events = events;
    return this;
  }

  public Stream addEventsItem(Object eventsItem) {
    if (this.events == null) {
      this.events = new ArrayList<>();
    }
    this.events.add(eventsItem);
    return this;
  }

   /**
   * Get events
   * @return events
  **/
  @ApiModelProperty(value = "")
  public List<Object> getEvents() {
    return events;
  }

  public void setEvents(List<Object> events) {
    this.events = events;
  }

  public Stream cache(String cache) {
    this.cache = cache;
    return this;
  }

   /**
   * Get cache
   * @return cache
  **/
  @ApiModelProperty(value = "")
  public String getCache() {
    return cache;
  }

  public void setCache(String cache) {
    this.cache = cache;
  }

  public Stream result(String result) {
    this.result = result;
    return this;
  }

   /**
   * Get result
   * @return result
  **/
  @ApiModelProperty(value = "")
  public String getResult() {
    return result;
  }

  public void setResult(String result) {
    this.result = result;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Stream stream = (Stream) o;
    return Objects.equals(this.filter, stream.filter) &&
        Objects.equals(this.processor, stream.processor) &&
        Objects.equals(this.trace, stream.trace) &&
        Objects.equals(this.enabled, stream.enabled) &&
        Objects.equals(this.processingEnabled, stream.processingEnabled) &&
        Objects.equals(this.processingSuspended, stream.processingSuspended) &&
        Objects.equals(this.internalUserGroups, stream.internalUserGroups) &&
        Objects.equals(this.minAppVersion, stream.minAppVersion) &&
        Objects.equals(this.rolloutPercentage, stream.rolloutPercentage) &&
        Objects.equals(this.stage, stream.stage) &&
        Objects.equals(this.name, stream.name) &&
        Objects.equals(this.maxCacheSize, stream.maxCacheSize) &&
        Objects.equals(this.lastProcessedTime, stream.lastProcessedTime) &&
        Objects.equals(this.id, stream.id) &&
        Objects.equals(this.events, stream.events) &&
        Objects.equals(this.cache, stream.cache) &&
        Objects.equals(this.result, stream.result);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filter, processor, trace, enabled, processingEnabled, processingSuspended, internalUserGroups, minAppVersion, rolloutPercentage, stage, name, maxCacheSize, lastProcessedTime, id, events, cache, result);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Stream {\n");
    
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    processor: ").append(toIndentedString(processor)).append("\n");
    sb.append("    trace: ").append(toIndentedString(trace)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    processingEnabled: ").append(toIndentedString(processingEnabled)).append("\n");
    sb.append("    processingSuspended: ").append(toIndentedString(processingSuspended)).append("\n");
    sb.append("    internalUserGroups: ").append(toIndentedString(internalUserGroups)).append("\n");
    sb.append("    minAppVersion: ").append(toIndentedString(minAppVersion)).append("\n");
    sb.append("    rolloutPercentage: ").append(toIndentedString(rolloutPercentage)).append("\n");
    sb.append("    stage: ").append(toIndentedString(stage)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    maxCacheSize: ").append(toIndentedString(maxCacheSize)).append("\n");
    sb.append("    lastProcessedTime: ").append(toIndentedString(lastProcessedTime)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
    sb.append("    cache: ").append(toIndentedString(cache)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

