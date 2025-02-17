// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.gsl;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.gsl.global.gsl.*;

// #else
// #endif

@Properties(inherit = org.bytedeco.gsl.presets.gsl.class)
public class gsl_monte_plain_state extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public gsl_monte_plain_state() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public gsl_monte_plain_state(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public gsl_monte_plain_state(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public gsl_monte_plain_state position(long position) {
        return (gsl_monte_plain_state)super.position(position);
    }

  public native @Cast("size_t") long dim(); public native gsl_monte_plain_state dim(long setter);
  public native DoublePointer x(); public native gsl_monte_plain_state x(DoublePointer setter);
}
