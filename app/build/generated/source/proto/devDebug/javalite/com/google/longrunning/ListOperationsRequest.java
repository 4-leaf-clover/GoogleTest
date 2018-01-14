// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/longrunning/operations.proto

package com.google.longrunning;

/**
 * <pre>
 * The request message for [Operations.ListOperations][google.longrunning.Operations.ListOperations].
 * </pre>
 *
 * Protobuf type {@code google.longrunning.ListOperationsRequest}
 */
public  final class ListOperationsRequest extends
    com.google.protobuf.GeneratedMessageLite<
        ListOperationsRequest, ListOperationsRequest.Builder> implements
    // @@protoc_insertion_point(message_implements:google.longrunning.ListOperationsRequest)
    ListOperationsRequestOrBuilder {
  private ListOperationsRequest() {
    name_ = "";
    filter_ = "";
    pageToken_ = "";
  }
  public static final int NAME_FIELD_NUMBER = 4;
  private java.lang.String name_;
  /**
   * <pre>
   * The name of the operation collection.
   * </pre>
   *
   * <code>optional string name = 4;</code>
   */
  public java.lang.String getName() {
    return name_;
  }
  /**
   * <pre>
   * The name of the operation collection.
   * </pre>
   *
   * <code>optional string name = 4;</code>
   */
  public com.google.protobuf.ByteString
      getNameBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(name_);
  }
  /**
   * <pre>
   * The name of the operation collection.
   * </pre>
   *
   * <code>optional string name = 4;</code>
   */
  private void setName(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  
    name_ = value;
  }
  /**
   * <pre>
   * The name of the operation collection.
   * </pre>
   *
   * <code>optional string name = 4;</code>
   */
  private void clearName() {
    
    name_ = getDefaultInstance().getName();
  }
  /**
   * <pre>
   * The name of the operation collection.
   * </pre>
   *
   * <code>optional string name = 4;</code>
   */
  private void setNameBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
    
    name_ = value.toStringUtf8();
  }

  public static final int FILTER_FIELD_NUMBER = 1;
  private java.lang.String filter_;
  /**
   * <pre>
   * The standard List filter.
   * </pre>
   *
   * <code>optional string filter = 1;</code>
   */
  public java.lang.String getFilter() {
    return filter_;
  }
  /**
   * <pre>
   * The standard List filter.
   * </pre>
   *
   * <code>optional string filter = 1;</code>
   */
  public com.google.protobuf.ByteString
      getFilterBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(filter_);
  }
  /**
   * <pre>
   * The standard List filter.
   * </pre>
   *
   * <code>optional string filter = 1;</code>
   */
  private void setFilter(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  
    filter_ = value;
  }
  /**
   * <pre>
   * The standard List filter.
   * </pre>
   *
   * <code>optional string filter = 1;</code>
   */
  private void clearFilter() {
    
    filter_ = getDefaultInstance().getFilter();
  }
  /**
   * <pre>
   * The standard List filter.
   * </pre>
   *
   * <code>optional string filter = 1;</code>
   */
  private void setFilterBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
    
    filter_ = value.toStringUtf8();
  }

  public static final int PAGE_SIZE_FIELD_NUMBER = 2;
  private int pageSize_;
  /**
   * <pre>
   * The standard List page size.
   * </pre>
   *
   * <code>optional int32 page_size = 2;</code>
   */
  public int getPageSize() {
    return pageSize_;
  }
  /**
   * <pre>
   * The standard List page size.
   * </pre>
   *
   * <code>optional int32 page_size = 2;</code>
   */
  private void setPageSize(int value) {
    
    pageSize_ = value;
  }
  /**
   * <pre>
   * The standard List page size.
   * </pre>
   *
   * <code>optional int32 page_size = 2;</code>
   */
  private void clearPageSize() {
    
    pageSize_ = 0;
  }

  public static final int PAGE_TOKEN_FIELD_NUMBER = 3;
  private java.lang.String pageToken_;
  /**
   * <pre>
   * The standard List page token.
   * </pre>
   *
   * <code>optional string page_token = 3;</code>
   */
  public java.lang.String getPageToken() {
    return pageToken_;
  }
  /**
   * <pre>
   * The standard List page token.
   * </pre>
   *
   * <code>optional string page_token = 3;</code>
   */
  public com.google.protobuf.ByteString
      getPageTokenBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(pageToken_);
  }
  /**
   * <pre>
   * The standard List page token.
   * </pre>
   *
   * <code>optional string page_token = 3;</code>
   */
  private void setPageToken(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  
    pageToken_ = value;
  }
  /**
   * <pre>
   * The standard List page token.
   * </pre>
   *
   * <code>optional string page_token = 3;</code>
   */
  private void clearPageToken() {
    
    pageToken_ = getDefaultInstance().getPageToken();
  }
  /**
   * <pre>
   * The standard List page token.
   * </pre>
   *
   * <code>optional string page_token = 3;</code>
   */
  private void setPageTokenBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
    
    pageToken_ = value.toStringUtf8();
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!filter_.isEmpty()) {
      output.writeString(1, getFilter());
    }
    if (pageSize_ != 0) {
      output.writeInt32(2, pageSize_);
    }
    if (!pageToken_.isEmpty()) {
      output.writeString(3, getPageToken());
    }
    if (!name_.isEmpty()) {
      output.writeString(4, getName());
    }
  }

  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (!filter_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeStringSize(1, getFilter());
    }
    if (pageSize_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, pageSize_);
    }
    if (!pageToken_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeStringSize(3, getPageToken());
    }
    if (!name_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeStringSize(4, getName());
    }
    memoizedSerializedSize = size;
    return size;
  }

  public static com.google.longrunning.ListOperationsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.google.longrunning.ListOperationsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.google.longrunning.ListOperationsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.google.longrunning.ListOperationsRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.google.longrunning.ListOperationsRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.google.longrunning.ListOperationsRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.google.longrunning.ListOperationsRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static com.google.longrunning.ListOperationsRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.google.longrunning.ListOperationsRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.google.longrunning.ListOperationsRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.longrunning.ListOperationsRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  /**
   * <pre>
   * The request message for [Operations.ListOperations][google.longrunning.Operations.ListOperations].
   * </pre>
   *
   * Protobuf type {@code google.longrunning.ListOperationsRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.google.longrunning.ListOperationsRequest, Builder> implements
      // @@protoc_insertion_point(builder_implements:google.longrunning.ListOperationsRequest)
      com.google.longrunning.ListOperationsRequestOrBuilder {
    // Construct using com.google.longrunning.ListOperationsRequest.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * The name of the operation collection.
     * </pre>
     *
     * <code>optional string name = 4;</code>
     */
    public java.lang.String getName() {
      return instance.getName();
    }
    /**
     * <pre>
     * The name of the operation collection.
     * </pre>
     *
     * <code>optional string name = 4;</code>
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      return instance.getNameBytes();
    }
    /**
     * <pre>
     * The name of the operation collection.
     * </pre>
     *
     * <code>optional string name = 4;</code>
     */
    public Builder setName(
        java.lang.String value) {
      copyOnWrite();
      instance.setName(value);
      return this;
    }
    /**
     * <pre>
     * The name of the operation collection.
     * </pre>
     *
     * <code>optional string name = 4;</code>
     */
    public Builder clearName() {
      copyOnWrite();
      instance.clearName();
      return this;
    }
    /**
     * <pre>
     * The name of the operation collection.
     * </pre>
     *
     * <code>optional string name = 4;</code>
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setNameBytes(value);
      return this;
    }

    /**
     * <pre>
     * The standard List filter.
     * </pre>
     *
     * <code>optional string filter = 1;</code>
     */
    public java.lang.String getFilter() {
      return instance.getFilter();
    }
    /**
     * <pre>
     * The standard List filter.
     * </pre>
     *
     * <code>optional string filter = 1;</code>
     */
    public com.google.protobuf.ByteString
        getFilterBytes() {
      return instance.getFilterBytes();
    }
    /**
     * <pre>
     * The standard List filter.
     * </pre>
     *
     * <code>optional string filter = 1;</code>
     */
    public Builder setFilter(
        java.lang.String value) {
      copyOnWrite();
      instance.setFilter(value);
      return this;
    }
    /**
     * <pre>
     * The standard List filter.
     * </pre>
     *
     * <code>optional string filter = 1;</code>
     */
    public Builder clearFilter() {
      copyOnWrite();
      instance.clearFilter();
      return this;
    }
    /**
     * <pre>
     * The standard List filter.
     * </pre>
     *
     * <code>optional string filter = 1;</code>
     */
    public Builder setFilterBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setFilterBytes(value);
      return this;
    }

    /**
     * <pre>
     * The standard List page size.
     * </pre>
     *
     * <code>optional int32 page_size = 2;</code>
     */
    public int getPageSize() {
      return instance.getPageSize();
    }
    /**
     * <pre>
     * The standard List page size.
     * </pre>
     *
     * <code>optional int32 page_size = 2;</code>
     */
    public Builder setPageSize(int value) {
      copyOnWrite();
      instance.setPageSize(value);
      return this;
    }
    /**
     * <pre>
     * The standard List page size.
     * </pre>
     *
     * <code>optional int32 page_size = 2;</code>
     */
    public Builder clearPageSize() {
      copyOnWrite();
      instance.clearPageSize();
      return this;
    }

    /**
     * <pre>
     * The standard List page token.
     * </pre>
     *
     * <code>optional string page_token = 3;</code>
     */
    public java.lang.String getPageToken() {
      return instance.getPageToken();
    }
    /**
     * <pre>
     * The standard List page token.
     * </pre>
     *
     * <code>optional string page_token = 3;</code>
     */
    public com.google.protobuf.ByteString
        getPageTokenBytes() {
      return instance.getPageTokenBytes();
    }
    /**
     * <pre>
     * The standard List page token.
     * </pre>
     *
     * <code>optional string page_token = 3;</code>
     */
    public Builder setPageToken(
        java.lang.String value) {
      copyOnWrite();
      instance.setPageToken(value);
      return this;
    }
    /**
     * <pre>
     * The standard List page token.
     * </pre>
     *
     * <code>optional string page_token = 3;</code>
     */
    public Builder clearPageToken() {
      copyOnWrite();
      instance.clearPageToken();
      return this;
    }
    /**
     * <pre>
     * The standard List page token.
     * </pre>
     *
     * <code>optional string page_token = 3;</code>
     */
    public Builder setPageTokenBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setPageTokenBytes(value);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:google.longrunning.ListOperationsRequest)
  }
  protected final Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      Object arg0, Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.google.longrunning.ListOperationsRequest();
      }
      case IS_INITIALIZED: {
        return DEFAULT_INSTANCE;
      }
      case MAKE_IMMUTABLE: {
        return null;
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case VISIT: {
        Visitor visitor = (Visitor) arg0;
        com.google.longrunning.ListOperationsRequest other = (com.google.longrunning.ListOperationsRequest) arg1;
        name_ = visitor.visitString(!name_.isEmpty(), name_,
            !other.name_.isEmpty(), other.name_);
        filter_ = visitor.visitString(!filter_.isEmpty(), filter_,
            !other.filter_.isEmpty(), other.filter_);
        pageSize_ = visitor.visitInt(pageSize_ != 0, pageSize_,
            other.pageSize_ != 0, other.pageSize_);
        pageToken_ = visitor.visitString(!pageToken_.isEmpty(), pageToken_,
            !other.pageToken_.isEmpty(), other.pageToken_);
        if (visitor == com.google.protobuf.GeneratedMessageLite.MergeFromVisitor
            .INSTANCE) {
        }
        return this;
      }
      case MERGE_FROM_STREAM: {
        com.google.protobuf.CodedInputStream input =
            (com.google.protobuf.CodedInputStream) arg0;
        com.google.protobuf.ExtensionRegistryLite extensionRegistry =
            (com.google.protobuf.ExtensionRegistryLite) arg1;
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              default: {
                if (!input.skipField(tag)) {
                  done = true;
                }
                break;
              }
              case 10: {
                String s = input.readStringRequireUtf8();

                filter_ = s;
                break;
              }
              case 16: {

                pageSize_ = input.readInt32();
                break;
              }
              case 26: {
                String s = input.readStringRequireUtf8();

                pageToken_ = s;
                break;
              }
              case 34: {
                String s = input.readStringRequireUtf8();

                name_ = s;
                break;
              }
            }
          }
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw new RuntimeException(e.setUnfinishedMessage(this));
        } catch (java.io.IOException e) {
          throw new RuntimeException(
              new com.google.protobuf.InvalidProtocolBufferException(
                  e.getMessage()).setUnfinishedMessage(this));
        } finally {
        }
      }
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        if (PARSER == null) {    synchronized (com.google.longrunning.ListOperationsRequest.class) {
            if (PARSER == null) {
              PARSER = new DefaultInstanceBasedParser(DEFAULT_INSTANCE);
            }
          }
        }
        return PARSER;
      }
    }
    throw new UnsupportedOperationException();
  }


  // @@protoc_insertion_point(class_scope:google.longrunning.ListOperationsRequest)
  private static final com.google.longrunning.ListOperationsRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ListOperationsRequest();
    DEFAULT_INSTANCE.makeImmutable();
  }

  public static com.google.longrunning.ListOperationsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<ListOperationsRequest> PARSER;

  public static com.google.protobuf.Parser<ListOperationsRequest> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

