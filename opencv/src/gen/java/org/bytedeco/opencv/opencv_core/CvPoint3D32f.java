// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_core;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.opencv.global.opencv_core.*;



@NoOffset @Properties(inherit = org.bytedeco.opencv.presets.opencv_core.class)
public class CvPoint3D32f extends AbstractCvPoint3D32f {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CvPoint3D32f(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CvPoint3D32f(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public CvPoint3D32f position(long position) {
        return (CvPoint3D32f)super.position(position);
    }

    public native float x(); public native CvPoint3D32f x(float setter);
    public native float y(); public native CvPoint3D32f y(float setter);
    public native float z(); public native CvPoint3D32f z(float setter);

// #ifdef CV__VALIDATE_UNUNITIALIZED_VARS
    public CvPoint3D32f() { super((Pointer)null); allocate(); }
    private native void allocate();
// #elif defined(CV__ENABLE_C_API_CTORS) && defined(__cplusplus)
    public CvPoint3D32f(float _x/*=0*/, float _y/*=0*/, float _z/*=0*/) { super((Pointer)null); allocate(_x, _y, _z); }
    private native void allocate(float _x/*=0*/, float _y/*=0*/, float _z/*=0*/);
// #endif
// #ifdef __cplusplus
// #endif
}
