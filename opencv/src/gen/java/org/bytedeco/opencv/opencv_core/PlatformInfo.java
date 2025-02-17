// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_core;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.opencv.global.opencv_core.*;


@Namespace("cv::ocl") @NoOffset @Properties(inherit = org.bytedeco.opencv.presets.opencv_core.class)
public class PlatformInfo extends Pointer {
    static { Loader.load(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public PlatformInfo(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public PlatformInfo position(long position) {
        return (PlatformInfo)super.position(position);
    }

    public PlatformInfo() { super((Pointer)null); allocate(); }
    private native void allocate();
    public PlatformInfo(Pointer id) { super((Pointer)null); allocate(id); }
    private native void allocate(Pointer id);

    public PlatformInfo(@Const @ByRef PlatformInfo i) { super((Pointer)null); allocate(i); }
    private native void allocate(@Const @ByRef PlatformInfo i);
    public native @ByRef @Name("operator =") PlatformInfo put(@Const @ByRef PlatformInfo i);

    public native @Str BytePointer name();
    public native @Str BytePointer vendor();
    public native @Str BytePointer version();
    public native int deviceNumber();
    public native void getDevice(@ByRef Device device, int d);
}
