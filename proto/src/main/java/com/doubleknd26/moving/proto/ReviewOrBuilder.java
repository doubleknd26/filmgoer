// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: moving.proto

package com.doubleknd26.moving.proto;

public interface ReviewOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Review)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional .SourceType sourceType = 1;</code>
   */
  int getSourceTypeValue();
  /**
   * <code>optional .SourceType sourceType = 1;</code>
   */
  com.doubleknd26.moving.proto.SourceType getSourceType();

  /**
   * <code>optional string url = 2;</code>
   */
  java.lang.String getUrl();
  /**
   * <code>optional string url = 2;</code>
   */
  com.google.protobuf.ByteString
      getUrlBytes();

  /**
   * <code>optional string title = 3;</code>
   */
  java.lang.String getTitle();
  /**
   * <code>optional string title = 3;</code>
   */
  com.google.protobuf.ByteString
      getTitleBytes();

  /**
   * <code>optional int32 grade = 4;</code>
   */
  int getGrade();

  /**
   * <code>optional string comment = 5;</code>
   */
  java.lang.String getComment();
  /**
   * <code>optional string comment = 5;</code>
   */
  com.google.protobuf.ByteString
      getCommentBytes();

  /**
   * <code>optional int64 timestamp = 6;</code>
   */
  long getTimestamp();
}