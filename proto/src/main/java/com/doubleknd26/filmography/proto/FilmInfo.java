// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: filmography.proto

package com.doubleknd26.filmography.proto;

/**
 * Protobuf type {@code FilmInfo}
 */
public  final class FilmInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:FilmInfo)
    FilmInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FilmInfo.newBuilder() to construct.
  private FilmInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FilmInfo() {
    title_ = "";
    ageLimit_ = "";
    imagePath_ = "";
    avgGrade_ = 0F;
    reviews_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private FilmInfo(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            title_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            ageLimit_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            imagePath_ = s;
            break;
          }
          case 37: {

            avgGrade_ = input.readFloat();
            break;
          }
          case 42: {
            if (!((mutable_bitField0_ & 0x00000010) == 0x00000010)) {
              reviews_ = new java.util.ArrayList<com.doubleknd26.filmography.proto.Review>();
              mutable_bitField0_ |= 0x00000010;
            }
            reviews_.add(
                input.readMessage(com.doubleknd26.filmography.proto.Review.parser(), extensionRegistry));
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000010) == 0x00000010)) {
        reviews_ = java.util.Collections.unmodifiableList(reviews_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.doubleknd26.filmography.proto.Filmography.internal_static_FilmInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.doubleknd26.filmography.proto.Filmography.internal_static_FilmInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.doubleknd26.filmography.proto.FilmInfo.class, com.doubleknd26.filmography.proto.FilmInfo.Builder.class);
  }

  private int bitField0_;
  public static final int TITLE_FIELD_NUMBER = 1;
  private volatile java.lang.Object title_;
  /**
   * <code>string title = 1;</code>
   */
  public java.lang.String getTitle() {
    java.lang.Object ref = title_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      title_ = s;
      return s;
    }
  }
  /**
   * <code>string title = 1;</code>
   */
  public com.google.protobuf.ByteString
      getTitleBytes() {
    java.lang.Object ref = title_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      title_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int AGELIMIT_FIELD_NUMBER = 2;
  private volatile java.lang.Object ageLimit_;
  /**
   * <code>string ageLimit = 2;</code>
   */
  public java.lang.String getAgeLimit() {
    java.lang.Object ref = ageLimit_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      ageLimit_ = s;
      return s;
    }
  }
  /**
   * <code>string ageLimit = 2;</code>
   */
  public com.google.protobuf.ByteString
      getAgeLimitBytes() {
    java.lang.Object ref = ageLimit_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      ageLimit_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int IMAGEPATH_FIELD_NUMBER = 3;
  private volatile java.lang.Object imagePath_;
  /**
   * <code>string imagePath = 3;</code>
   */
  public java.lang.String getImagePath() {
    java.lang.Object ref = imagePath_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      imagePath_ = s;
      return s;
    }
  }
  /**
   * <code>string imagePath = 3;</code>
   */
  public com.google.protobuf.ByteString
      getImagePathBytes() {
    java.lang.Object ref = imagePath_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      imagePath_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int AVGGRADE_FIELD_NUMBER = 4;
  private float avgGrade_;
  /**
   * <code>float avgGrade = 4;</code>
   */
  public float getAvgGrade() {
    return avgGrade_;
  }

  public static final int REVIEWS_FIELD_NUMBER = 5;
  private java.util.List<com.doubleknd26.filmography.proto.Review> reviews_;
  /**
   * <code>repeated .Review reviews = 5;</code>
   */
  public java.util.List<com.doubleknd26.filmography.proto.Review> getReviewsList() {
    return reviews_;
  }
  /**
   * <code>repeated .Review reviews = 5;</code>
   */
  public java.util.List<? extends com.doubleknd26.filmography.proto.ReviewOrBuilder> 
      getReviewsOrBuilderList() {
    return reviews_;
  }
  /**
   * <code>repeated .Review reviews = 5;</code>
   */
  public int getReviewsCount() {
    return reviews_.size();
  }
  /**
   * <code>repeated .Review reviews = 5;</code>
   */
  public com.doubleknd26.filmography.proto.Review getReviews(int index) {
    return reviews_.get(index);
  }
  /**
   * <code>repeated .Review reviews = 5;</code>
   */
  public com.doubleknd26.filmography.proto.ReviewOrBuilder getReviewsOrBuilder(
      int index) {
    return reviews_.get(index);
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getTitleBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, title_);
    }
    if (!getAgeLimitBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, ageLimit_);
    }
    if (!getImagePathBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, imagePath_);
    }
    if (avgGrade_ != 0F) {
      output.writeFloat(4, avgGrade_);
    }
    for (int i = 0; i < reviews_.size(); i++) {
      output.writeMessage(5, reviews_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getTitleBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, title_);
    }
    if (!getAgeLimitBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, ageLimit_);
    }
    if (!getImagePathBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, imagePath_);
    }
    if (avgGrade_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(4, avgGrade_);
    }
    for (int i = 0; i < reviews_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(5, reviews_.get(i));
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.doubleknd26.filmography.proto.FilmInfo)) {
      return super.equals(obj);
    }
    com.doubleknd26.filmography.proto.FilmInfo other = (com.doubleknd26.filmography.proto.FilmInfo) obj;

    boolean result = true;
    result = result && getTitle()
        .equals(other.getTitle());
    result = result && getAgeLimit()
        .equals(other.getAgeLimit());
    result = result && getImagePath()
        .equals(other.getImagePath());
    result = result && (
        java.lang.Float.floatToIntBits(getAvgGrade())
        == java.lang.Float.floatToIntBits(
            other.getAvgGrade()));
    result = result && getReviewsList()
        .equals(other.getReviewsList());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + TITLE_FIELD_NUMBER;
    hash = (53 * hash) + getTitle().hashCode();
    hash = (37 * hash) + AGELIMIT_FIELD_NUMBER;
    hash = (53 * hash) + getAgeLimit().hashCode();
    hash = (37 * hash) + IMAGEPATH_FIELD_NUMBER;
    hash = (53 * hash) + getImagePath().hashCode();
    hash = (37 * hash) + AVGGRADE_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getAvgGrade());
    if (getReviewsCount() > 0) {
      hash = (37 * hash) + REVIEWS_FIELD_NUMBER;
      hash = (53 * hash) + getReviewsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.doubleknd26.filmography.proto.FilmInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.doubleknd26.filmography.proto.FilmInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.doubleknd26.filmography.proto.FilmInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.doubleknd26.filmography.proto.FilmInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.doubleknd26.filmography.proto.FilmInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.doubleknd26.filmography.proto.FilmInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.doubleknd26.filmography.proto.FilmInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.doubleknd26.filmography.proto.FilmInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.doubleknd26.filmography.proto.FilmInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.doubleknd26.filmography.proto.FilmInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.doubleknd26.filmography.proto.FilmInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.doubleknd26.filmography.proto.FilmInfo parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.doubleknd26.filmography.proto.FilmInfo prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code FilmInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:FilmInfo)
      com.doubleknd26.filmography.proto.FilmInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.doubleknd26.filmography.proto.Filmography.internal_static_FilmInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.doubleknd26.filmography.proto.Filmography.internal_static_FilmInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.doubleknd26.filmography.proto.FilmInfo.class, com.doubleknd26.filmography.proto.FilmInfo.Builder.class);
    }

    // Construct using com.doubleknd26.filmography.proto.FilmInfo.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getReviewsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      title_ = "";

      ageLimit_ = "";

      imagePath_ = "";

      avgGrade_ = 0F;

      if (reviewsBuilder_ == null) {
        reviews_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000010);
      } else {
        reviewsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.doubleknd26.filmography.proto.Filmography.internal_static_FilmInfo_descriptor;
    }

    @java.lang.Override
    public com.doubleknd26.filmography.proto.FilmInfo getDefaultInstanceForType() {
      return com.doubleknd26.filmography.proto.FilmInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.doubleknd26.filmography.proto.FilmInfo build() {
      com.doubleknd26.filmography.proto.FilmInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.doubleknd26.filmography.proto.FilmInfo buildPartial() {
      com.doubleknd26.filmography.proto.FilmInfo result = new com.doubleknd26.filmography.proto.FilmInfo(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.title_ = title_;
      result.ageLimit_ = ageLimit_;
      result.imagePath_ = imagePath_;
      result.avgGrade_ = avgGrade_;
      if (reviewsBuilder_ == null) {
        if (((bitField0_ & 0x00000010) == 0x00000010)) {
          reviews_ = java.util.Collections.unmodifiableList(reviews_);
          bitField0_ = (bitField0_ & ~0x00000010);
        }
        result.reviews_ = reviews_;
      } else {
        result.reviews_ = reviewsBuilder_.build();
      }
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.doubleknd26.filmography.proto.FilmInfo) {
        return mergeFrom((com.doubleknd26.filmography.proto.FilmInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.doubleknd26.filmography.proto.FilmInfo other) {
      if (other == com.doubleknd26.filmography.proto.FilmInfo.getDefaultInstance()) return this;
      if (!other.getTitle().isEmpty()) {
        title_ = other.title_;
        onChanged();
      }
      if (!other.getAgeLimit().isEmpty()) {
        ageLimit_ = other.ageLimit_;
        onChanged();
      }
      if (!other.getImagePath().isEmpty()) {
        imagePath_ = other.imagePath_;
        onChanged();
      }
      if (other.getAvgGrade() != 0F) {
        setAvgGrade(other.getAvgGrade());
      }
      if (reviewsBuilder_ == null) {
        if (!other.reviews_.isEmpty()) {
          if (reviews_.isEmpty()) {
            reviews_ = other.reviews_;
            bitField0_ = (bitField0_ & ~0x00000010);
          } else {
            ensureReviewsIsMutable();
            reviews_.addAll(other.reviews_);
          }
          onChanged();
        }
      } else {
        if (!other.reviews_.isEmpty()) {
          if (reviewsBuilder_.isEmpty()) {
            reviewsBuilder_.dispose();
            reviewsBuilder_ = null;
            reviews_ = other.reviews_;
            bitField0_ = (bitField0_ & ~0x00000010);
            reviewsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getReviewsFieldBuilder() : null;
          } else {
            reviewsBuilder_.addAllMessages(other.reviews_);
          }
        }
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.doubleknd26.filmography.proto.FilmInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.doubleknd26.filmography.proto.FilmInfo) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object title_ = "";
    /**
     * <code>string title = 1;</code>
     */
    public java.lang.String getTitle() {
      java.lang.Object ref = title_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        title_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string title = 1;</code>
     */
    public com.google.protobuf.ByteString
        getTitleBytes() {
      java.lang.Object ref = title_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        title_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string title = 1;</code>
     */
    public Builder setTitle(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      title_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string title = 1;</code>
     */
    public Builder clearTitle() {
      
      title_ = getDefaultInstance().getTitle();
      onChanged();
      return this;
    }
    /**
     * <code>string title = 1;</code>
     */
    public Builder setTitleBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      title_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object ageLimit_ = "";
    /**
     * <code>string ageLimit = 2;</code>
     */
    public java.lang.String getAgeLimit() {
      java.lang.Object ref = ageLimit_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        ageLimit_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string ageLimit = 2;</code>
     */
    public com.google.protobuf.ByteString
        getAgeLimitBytes() {
      java.lang.Object ref = ageLimit_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        ageLimit_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string ageLimit = 2;</code>
     */
    public Builder setAgeLimit(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      ageLimit_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string ageLimit = 2;</code>
     */
    public Builder clearAgeLimit() {
      
      ageLimit_ = getDefaultInstance().getAgeLimit();
      onChanged();
      return this;
    }
    /**
     * <code>string ageLimit = 2;</code>
     */
    public Builder setAgeLimitBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      ageLimit_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object imagePath_ = "";
    /**
     * <code>string imagePath = 3;</code>
     */
    public java.lang.String getImagePath() {
      java.lang.Object ref = imagePath_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        imagePath_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string imagePath = 3;</code>
     */
    public com.google.protobuf.ByteString
        getImagePathBytes() {
      java.lang.Object ref = imagePath_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        imagePath_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string imagePath = 3;</code>
     */
    public Builder setImagePath(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      imagePath_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string imagePath = 3;</code>
     */
    public Builder clearImagePath() {
      
      imagePath_ = getDefaultInstance().getImagePath();
      onChanged();
      return this;
    }
    /**
     * <code>string imagePath = 3;</code>
     */
    public Builder setImagePathBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      imagePath_ = value;
      onChanged();
      return this;
    }

    private float avgGrade_ ;
    /**
     * <code>float avgGrade = 4;</code>
     */
    public float getAvgGrade() {
      return avgGrade_;
    }
    /**
     * <code>float avgGrade = 4;</code>
     */
    public Builder setAvgGrade(float value) {
      
      avgGrade_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float avgGrade = 4;</code>
     */
    public Builder clearAvgGrade() {
      
      avgGrade_ = 0F;
      onChanged();
      return this;
    }

    private java.util.List<com.doubleknd26.filmography.proto.Review> reviews_ =
      java.util.Collections.emptyList();
    private void ensureReviewsIsMutable() {
      if (!((bitField0_ & 0x00000010) == 0x00000010)) {
        reviews_ = new java.util.ArrayList<com.doubleknd26.filmography.proto.Review>(reviews_);
        bitField0_ |= 0x00000010;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.doubleknd26.filmography.proto.Review, com.doubleknd26.filmography.proto.Review.Builder, com.doubleknd26.filmography.proto.ReviewOrBuilder> reviewsBuilder_;

    /**
     * <code>repeated .Review reviews = 5;</code>
     */
    public java.util.List<com.doubleknd26.filmography.proto.Review> getReviewsList() {
      if (reviewsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(reviews_);
      } else {
        return reviewsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .Review reviews = 5;</code>
     */
    public int getReviewsCount() {
      if (reviewsBuilder_ == null) {
        return reviews_.size();
      } else {
        return reviewsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .Review reviews = 5;</code>
     */
    public com.doubleknd26.filmography.proto.Review getReviews(int index) {
      if (reviewsBuilder_ == null) {
        return reviews_.get(index);
      } else {
        return reviewsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .Review reviews = 5;</code>
     */
    public Builder setReviews(
        int index, com.doubleknd26.filmography.proto.Review value) {
      if (reviewsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureReviewsIsMutable();
        reviews_.set(index, value);
        onChanged();
      } else {
        reviewsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .Review reviews = 5;</code>
     */
    public Builder setReviews(
        int index, com.doubleknd26.filmography.proto.Review.Builder builderForValue) {
      if (reviewsBuilder_ == null) {
        ensureReviewsIsMutable();
        reviews_.set(index, builderForValue.build());
        onChanged();
      } else {
        reviewsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Review reviews = 5;</code>
     */
    public Builder addReviews(com.doubleknd26.filmography.proto.Review value) {
      if (reviewsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureReviewsIsMutable();
        reviews_.add(value);
        onChanged();
      } else {
        reviewsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .Review reviews = 5;</code>
     */
    public Builder addReviews(
        int index, com.doubleknd26.filmography.proto.Review value) {
      if (reviewsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureReviewsIsMutable();
        reviews_.add(index, value);
        onChanged();
      } else {
        reviewsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .Review reviews = 5;</code>
     */
    public Builder addReviews(
        com.doubleknd26.filmography.proto.Review.Builder builderForValue) {
      if (reviewsBuilder_ == null) {
        ensureReviewsIsMutable();
        reviews_.add(builderForValue.build());
        onChanged();
      } else {
        reviewsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Review reviews = 5;</code>
     */
    public Builder addReviews(
        int index, com.doubleknd26.filmography.proto.Review.Builder builderForValue) {
      if (reviewsBuilder_ == null) {
        ensureReviewsIsMutable();
        reviews_.add(index, builderForValue.build());
        onChanged();
      } else {
        reviewsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Review reviews = 5;</code>
     */
    public Builder addAllReviews(
        java.lang.Iterable<? extends com.doubleknd26.filmography.proto.Review> values) {
      if (reviewsBuilder_ == null) {
        ensureReviewsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, reviews_);
        onChanged();
      } else {
        reviewsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .Review reviews = 5;</code>
     */
    public Builder clearReviews() {
      if (reviewsBuilder_ == null) {
        reviews_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000010);
        onChanged();
      } else {
        reviewsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .Review reviews = 5;</code>
     */
    public Builder removeReviews(int index) {
      if (reviewsBuilder_ == null) {
        ensureReviewsIsMutable();
        reviews_.remove(index);
        onChanged();
      } else {
        reviewsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .Review reviews = 5;</code>
     */
    public com.doubleknd26.filmography.proto.Review.Builder getReviewsBuilder(
        int index) {
      return getReviewsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .Review reviews = 5;</code>
     */
    public com.doubleknd26.filmography.proto.ReviewOrBuilder getReviewsOrBuilder(
        int index) {
      if (reviewsBuilder_ == null) {
        return reviews_.get(index);  } else {
        return reviewsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .Review reviews = 5;</code>
     */
    public java.util.List<? extends com.doubleknd26.filmography.proto.ReviewOrBuilder> 
         getReviewsOrBuilderList() {
      if (reviewsBuilder_ != null) {
        return reviewsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(reviews_);
      }
    }
    /**
     * <code>repeated .Review reviews = 5;</code>
     */
    public com.doubleknd26.filmography.proto.Review.Builder addReviewsBuilder() {
      return getReviewsFieldBuilder().addBuilder(
          com.doubleknd26.filmography.proto.Review.getDefaultInstance());
    }
    /**
     * <code>repeated .Review reviews = 5;</code>
     */
    public com.doubleknd26.filmography.proto.Review.Builder addReviewsBuilder(
        int index) {
      return getReviewsFieldBuilder().addBuilder(
          index, com.doubleknd26.filmography.proto.Review.getDefaultInstance());
    }
    /**
     * <code>repeated .Review reviews = 5;</code>
     */
    public java.util.List<com.doubleknd26.filmography.proto.Review.Builder> 
         getReviewsBuilderList() {
      return getReviewsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.doubleknd26.filmography.proto.Review, com.doubleknd26.filmography.proto.Review.Builder, com.doubleknd26.filmography.proto.ReviewOrBuilder> 
        getReviewsFieldBuilder() {
      if (reviewsBuilder_ == null) {
        reviewsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.doubleknd26.filmography.proto.Review, com.doubleknd26.filmography.proto.Review.Builder, com.doubleknd26.filmography.proto.ReviewOrBuilder>(
                reviews_,
                ((bitField0_ & 0x00000010) == 0x00000010),
                getParentForChildren(),
                isClean());
        reviews_ = null;
      }
      return reviewsBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:FilmInfo)
  }

  // @@protoc_insertion_point(class_scope:FilmInfo)
  private static final com.doubleknd26.filmography.proto.FilmInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.doubleknd26.filmography.proto.FilmInfo();
  }

  public static com.doubleknd26.filmography.proto.FilmInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FilmInfo>
      PARSER = new com.google.protobuf.AbstractParser<FilmInfo>() {
    @java.lang.Override
    public FilmInfo parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new FilmInfo(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<FilmInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FilmInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.doubleknd26.filmography.proto.FilmInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

