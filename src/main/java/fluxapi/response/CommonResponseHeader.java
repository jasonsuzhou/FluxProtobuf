// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: commonResponseHeader.proto

package fluxapi.response;

public final class CommonResponseHeader {
  private CommonResponseHeader() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface respHeaderOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // required int32 errcode = 1;
    /**
     * <code>required int32 errcode = 1;</code>
     */
    boolean hasErrcode();
    /**
     * <code>required int32 errcode = 1;</code>
     */
    int getErrcode();

    // optional string errmsg = 2;
    /**
     * <code>optional string errmsg = 2;</code>
     */
    boolean hasErrmsg();
    /**
     * <code>optional string errmsg = 2;</code>
     */
    java.lang.String getErrmsg();
    /**
     * <code>optional string errmsg = 2;</code>
     */
    com.google.protobuf.ByteString
        getErrmsgBytes();
  }
  /**
   * Protobuf type {@code fluxapi.response.respHeader}
   */
  public static final class respHeader extends
      com.google.protobuf.GeneratedMessage
      implements respHeaderOrBuilder {
    // Use respHeader.newBuilder() to construct.
    private respHeader(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private respHeader(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final respHeader defaultInstance;
    public static respHeader getDefaultInstance() {
      return defaultInstance;
    }

    public respHeader getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private respHeader(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
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
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {
              bitField0_ |= 0x00000001;
              errcode_ = input.readInt32();
              break;
            }
            case 18: {
              bitField0_ |= 0x00000002;
              errmsg_ = input.readBytes();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return fluxapi.response.CommonResponseHeader.internal_static_fluxapi_response_respHeader_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return fluxapi.response.CommonResponseHeader.internal_static_fluxapi_response_respHeader_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              fluxapi.response.CommonResponseHeader.respHeader.class, fluxapi.response.CommonResponseHeader.respHeader.Builder.class);
    }

    public static com.google.protobuf.Parser<respHeader> PARSER =
        new com.google.protobuf.AbstractParser<respHeader>() {
      public respHeader parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new respHeader(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<respHeader> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // required int32 errcode = 1;
    public static final int ERRCODE_FIELD_NUMBER = 1;
    private int errcode_;
    /**
     * <code>required int32 errcode = 1;</code>
     */
    public boolean hasErrcode() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required int32 errcode = 1;</code>
     */
    public int getErrcode() {
      return errcode_;
    }

    // optional string errmsg = 2;
    public static final int ERRMSG_FIELD_NUMBER = 2;
    private java.lang.Object errmsg_;
    /**
     * <code>optional string errmsg = 2;</code>
     */
    public boolean hasErrmsg() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional string errmsg = 2;</code>
     */
    public java.lang.String getErrmsg() {
      java.lang.Object ref = errmsg_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          errmsg_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string errmsg = 2;</code>
     */
    public com.google.protobuf.ByteString
        getErrmsgBytes() {
      java.lang.Object ref = errmsg_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        errmsg_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private void initFields() {
      errcode_ = 0;
      errmsg_ = "";
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      if (!hasErrcode()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeInt32(1, errcode_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(2, getErrmsgBytes());
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, errcode_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, getErrmsgBytes());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static fluxapi.response.CommonResponseHeader.respHeader parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static fluxapi.response.CommonResponseHeader.respHeader parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static fluxapi.response.CommonResponseHeader.respHeader parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static fluxapi.response.CommonResponseHeader.respHeader parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static fluxapi.response.CommonResponseHeader.respHeader parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static fluxapi.response.CommonResponseHeader.respHeader parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static fluxapi.response.CommonResponseHeader.respHeader parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static fluxapi.response.CommonResponseHeader.respHeader parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static fluxapi.response.CommonResponseHeader.respHeader parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static fluxapi.response.CommonResponseHeader.respHeader parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(fluxapi.response.CommonResponseHeader.respHeader prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code fluxapi.response.respHeader}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements fluxapi.response.CommonResponseHeader.respHeaderOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return fluxapi.response.CommonResponseHeader.internal_static_fluxapi_response_respHeader_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return fluxapi.response.CommonResponseHeader.internal_static_fluxapi_response_respHeader_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                fluxapi.response.CommonResponseHeader.respHeader.class, fluxapi.response.CommonResponseHeader.respHeader.Builder.class);
      }

      // Construct using fluxapi.response.CommonResponseHeader.respHeader.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        errcode_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        errmsg_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return fluxapi.response.CommonResponseHeader.internal_static_fluxapi_response_respHeader_descriptor;
      }

      public fluxapi.response.CommonResponseHeader.respHeader getDefaultInstanceForType() {
        return fluxapi.response.CommonResponseHeader.respHeader.getDefaultInstance();
      }

      public fluxapi.response.CommonResponseHeader.respHeader build() {
        fluxapi.response.CommonResponseHeader.respHeader result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public fluxapi.response.CommonResponseHeader.respHeader buildPartial() {
        fluxapi.response.CommonResponseHeader.respHeader result = new fluxapi.response.CommonResponseHeader.respHeader(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.errcode_ = errcode_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.errmsg_ = errmsg_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof fluxapi.response.CommonResponseHeader.respHeader) {
          return mergeFrom((fluxapi.response.CommonResponseHeader.respHeader)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(fluxapi.response.CommonResponseHeader.respHeader other) {
        if (other == fluxapi.response.CommonResponseHeader.respHeader.getDefaultInstance()) return this;
        if (other.hasErrcode()) {
          setErrcode(other.getErrcode());
        }
        if (other.hasErrmsg()) {
          bitField0_ |= 0x00000002;
          errmsg_ = other.errmsg_;
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasErrcode()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        fluxapi.response.CommonResponseHeader.respHeader parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (fluxapi.response.CommonResponseHeader.respHeader) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // required int32 errcode = 1;
      private int errcode_ ;
      /**
       * <code>required int32 errcode = 1;</code>
       */
      public boolean hasErrcode() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required int32 errcode = 1;</code>
       */
      public int getErrcode() {
        return errcode_;
      }
      /**
       * <code>required int32 errcode = 1;</code>
       */
      public Builder setErrcode(int value) {
        bitField0_ |= 0x00000001;
        errcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 errcode = 1;</code>
       */
      public Builder clearErrcode() {
        bitField0_ = (bitField0_ & ~0x00000001);
        errcode_ = 0;
        onChanged();
        return this;
      }

      // optional string errmsg = 2;
      private java.lang.Object errmsg_ = "";
      /**
       * <code>optional string errmsg = 2;</code>
       */
      public boolean hasErrmsg() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional string errmsg = 2;</code>
       */
      public java.lang.String getErrmsg() {
        java.lang.Object ref = errmsg_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          errmsg_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string errmsg = 2;</code>
       */
      public com.google.protobuf.ByteString
          getErrmsgBytes() {
        java.lang.Object ref = errmsg_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          errmsg_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string errmsg = 2;</code>
       */
      public Builder setErrmsg(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        errmsg_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string errmsg = 2;</code>
       */
      public Builder clearErrmsg() {
        bitField0_ = (bitField0_ & ~0x00000002);
        errmsg_ = getDefaultInstance().getErrmsg();
        onChanged();
        return this;
      }
      /**
       * <code>optional string errmsg = 2;</code>
       */
      public Builder setErrmsgBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        errmsg_ = value;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:fluxapi.response.respHeader)
    }

    static {
      defaultInstance = new respHeader(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:fluxapi.response.respHeader)
  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_fluxapi_response_respHeader_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_fluxapi_response_respHeader_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032commonResponseHeader.proto\022\020fluxapi.re" +
      "sponse\"-\n\nrespHeader\022\017\n\007errcode\030\001 \002(\005\022\016\n" +
      "\006errmsg\030\002 \001(\t"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_fluxapi_response_respHeader_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_fluxapi_response_respHeader_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_fluxapi_response_respHeader_descriptor,
              new java.lang.String[] { "Errcode", "Errmsg", });
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }

  // @@protoc_insertion_point(outer_class_scope)
}
