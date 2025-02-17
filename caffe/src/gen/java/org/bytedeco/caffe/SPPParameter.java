// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.caffe;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;
import org.bytedeco.opencv.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgcodecs.*;
import org.bytedeco.opencv.opencv_videoio.*;
import static org.bytedeco.opencv.global.opencv_videoio.*;
import org.bytedeco.opencv.opencv_highgui.*;
import static org.bytedeco.opencv.global.opencv_highgui.*;
import org.bytedeco.hdf5.*;
import static org.bytedeco.hdf5.global.hdf5.*;

import static org.bytedeco.caffe.global.caffe.*;

// -------------------------------------------------------------------

@Namespace("caffe") @NoOffset @Properties(inherit = org.bytedeco.caffe.presets.caffe.class)
public class SPPParameter extends Message {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SPPParameter(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public SPPParameter(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public SPPParameter position(long position) {
        return (SPPParameter)super.position(position);
    }

  public SPPParameter() { super((Pointer)null); allocate(); }
  private native void allocate();

  public SPPParameter(@Const @ByRef SPPParameter from) { super((Pointer)null); allocate(from); }
  private native void allocate(@Const @ByRef SPPParameter from);

  public native @ByRef @Name("operator =") SPPParameter put(@Const @ByRef SPPParameter from);
//   #if LANG_CXX11
//   #endif
  public native @Const @ByRef UnknownFieldSet unknown_fields();
  public native UnknownFieldSet mutable_unknown_fields();

  public static native @Const Descriptor descriptor();
  public static native @Const @ByRef SPPParameter default_instance();

  public static native void InitAsDefaultInstance();  // FOR INTERNAL USE ONLY
  public static native @Const SPPParameter internal_default_instance();
  @MemberGetter public static native int kIndexInFileMessages();
  public static final int kIndexInFileMessages = kIndexInFileMessages();

  public native void Swap(SPPParameter other);
  

  // implements Message ----------------------------------------------

  public native final SPPParameter New();

  public native final SPPParameter New(Arena arena);
  public native final void CopyFrom(@Const @ByRef Message from);
  public native final void MergeFrom(@Const @ByRef Message from);
  public native void CopyFrom(@Const @ByRef SPPParameter from);
  public native void MergeFrom(@Const @ByRef SPPParameter from);
  public native final void Clear();
  public native @Cast("bool") final boolean IsInitialized();

  public native @Cast("size_t") final long ByteSizeLong();
//   #if GOOGLE_PROTOBUF_ENABLE_EXPERIMENTAL_PARSER
//   #else
  public native @Cast("bool") final boolean MergePartialFromCodedStream(
        CodedInputStream input);
//   #endif  // GOOGLE_PROTOBUF_ENABLE_EXPERIMENTAL_PARSER
  public native final void SerializeWithCachedSizes(
        CodedOutputStream output);
  public native @Cast("google::protobuf::uint8*") final BytePointer InternalSerializeWithCachedSizesToArray(
        @Cast("google::protobuf::uint8*") BytePointer target);
  public native @Cast("google::protobuf::uint8*") final ByteBuffer InternalSerializeWithCachedSizesToArray(
        @Cast("google::protobuf::uint8*") ByteBuffer target);
  public native @Cast("google::protobuf::uint8*") final byte[] InternalSerializeWithCachedSizesToArray(
        @Cast("google::protobuf::uint8*") byte[] target);
  public native final int GetCachedSize();

  public native @ByVal final Metadata GetMetadata();

  // nested types ----------------------------------------------------
  @MemberGetter public static native @Cast("const caffe::SPPParameter::PoolMethod") int MAX();
  public static final int MAX = MAX();
  @MemberGetter public static native @Cast("const caffe::SPPParameter::PoolMethod") int AVE();
  public static final int AVE = AVE();
  @MemberGetter public static native @Cast("const caffe::SPPParameter::PoolMethod") int STOCHASTIC();
  public static final int STOCHASTIC = STOCHASTIC();
  public static native @Cast("bool") boolean PoolMethod_IsValid(int value);
  @MemberGetter public static native @Cast("const caffe::SPPParameter::PoolMethod") int PoolMethod_MIN();
  public static final int PoolMethod_MIN = PoolMethod_MIN();
  @MemberGetter public static native @Cast("const caffe::SPPParameter::PoolMethod") int PoolMethod_MAX();
  public static final int PoolMethod_MAX = PoolMethod_MAX();
  @MemberGetter public static native int PoolMethod_ARRAYSIZE();
  public static final int PoolMethod_ARRAYSIZE = PoolMethod_ARRAYSIZE();
  public static native @Const EnumDescriptor PoolMethod_descriptor();
  public static native @StdString BytePointer PoolMethod_Name(@Cast("caffe::SPPParameter::PoolMethod") int value);
  public static native @Cast("bool") boolean PoolMethod_Parse(@StdString BytePointer name,
        @Cast("caffe::SPPParameter::PoolMethod*") IntPointer value);
  public static native @Cast("bool") boolean PoolMethod_Parse(@StdString String name,
        @Cast("caffe::SPPParameter::PoolMethod*") IntBuffer value);
  public static native @Cast("bool") boolean PoolMethod_Parse(@StdString BytePointer name,
        @Cast("caffe::SPPParameter::PoolMethod*") int[] value);
  public static native @Cast("bool") boolean PoolMethod_Parse(@StdString String name,
        @Cast("caffe::SPPParameter::PoolMethod*") IntPointer value);
  public static native @Cast("bool") boolean PoolMethod_Parse(@StdString BytePointer name,
        @Cast("caffe::SPPParameter::PoolMethod*") IntBuffer value);
  public static native @Cast("bool") boolean PoolMethod_Parse(@StdString String name,
        @Cast("caffe::SPPParameter::PoolMethod*") int[] value);
  @MemberGetter public static native @Cast("const caffe::SPPParameter::Engine") int DEFAULT();
  public static final int DEFAULT = DEFAULT();
  @MemberGetter public static native @Cast("const caffe::SPPParameter::Engine") int CAFFE();
  public static final int CAFFE = CAFFE();
  @MemberGetter public static native @Cast("const caffe::SPPParameter::Engine") int CUDNN();
  public static final int CUDNN = CUDNN();
  public static native @Cast("bool") boolean Engine_IsValid(int value);
  @MemberGetter public static native @Cast("const caffe::SPPParameter::Engine") int Engine_MIN();
  public static final int Engine_MIN = Engine_MIN();
  @MemberGetter public static native @Cast("const caffe::SPPParameter::Engine") int Engine_MAX();
  public static final int Engine_MAX = Engine_MAX();
  @MemberGetter public static native int Engine_ARRAYSIZE();
  public static final int Engine_ARRAYSIZE = Engine_ARRAYSIZE();
  public static native @Const EnumDescriptor Engine_descriptor();
  public static native @StdString BytePointer Engine_Name(@Cast("caffe::SPPParameter::Engine") int value);
  public static native @Cast("bool") boolean Engine_Parse(@StdString BytePointer name,
        @Cast("caffe::SPPParameter::Engine*") IntPointer value);
  public static native @Cast("bool") boolean Engine_Parse(@StdString String name,
        @Cast("caffe::SPPParameter::Engine*") IntBuffer value);
  public static native @Cast("bool") boolean Engine_Parse(@StdString BytePointer name,
        @Cast("caffe::SPPParameter::Engine*") int[] value);
  public static native @Cast("bool") boolean Engine_Parse(@StdString String name,
        @Cast("caffe::SPPParameter::Engine*") IntPointer value);
  public static native @Cast("bool") boolean Engine_Parse(@StdString BytePointer name,
        @Cast("caffe::SPPParameter::Engine*") IntBuffer value);
  public static native @Cast("bool") boolean Engine_Parse(@StdString String name,
        @Cast("caffe::SPPParameter::Engine*") int[] value);

  // accessors -------------------------------------------------------

  // optional uint32 pyramid_height = 1;
  public native @Cast("bool") boolean has_pyramid_height();
  public native void clear_pyramid_height();
  @MemberGetter public static native int kPyramidHeightFieldNumber();
  public static final int kPyramidHeightFieldNumber = kPyramidHeightFieldNumber();
  public native @Cast("google::protobuf::uint32") int pyramid_height();
  public native void set_pyramid_height(@Cast("google::protobuf::uint32") int value);

  // optional .caffe.SPPParameter.PoolMethod pool = 2 [default = MAX];
  public native @Cast("bool") boolean has_pool();
  public native void clear_pool();
  @MemberGetter public static native int kPoolFieldNumber();
  public static final int kPoolFieldNumber = kPoolFieldNumber();
  public native @Cast("caffe::SPPParameter_PoolMethod") int pool();
  public native void set_pool(@Cast("caffe::SPPParameter_PoolMethod") int value);

  // optional .caffe.SPPParameter.Engine engine = 6 [default = DEFAULT];
  public native @Cast("bool") boolean has_engine();
  public native void clear_engine();
  @MemberGetter public static native int kEngineFieldNumber();
  public static final int kEngineFieldNumber = kEngineFieldNumber();
  public native @Cast("caffe::SPPParameter_Engine") int engine();
  public native void set_engine(@Cast("caffe::SPPParameter_Engine") int value);
}
