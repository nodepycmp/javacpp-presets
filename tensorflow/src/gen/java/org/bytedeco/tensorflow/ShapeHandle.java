// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


@Namespace("tensorflow::shape_inference") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class ShapeHandle extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ShapeHandle(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public ShapeHandle(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public ShapeHandle position(long position) {
        return (ShapeHandle)super.position(position);
    }

  public ShapeHandle() { super((Pointer)null); allocate(); }
  private native void allocate();
  public native @Cast("bool") boolean SameHandle(@ByVal ShapeHandle s);
  public native @Cast("std::size_t") long Handle();
}
