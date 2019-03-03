// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.mkldnn;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.mkldnn.global.mklml.*;

import static org.bytedeco.mkldnn.global.mkldnn.*;


/** A descriptor of a Softmax operation. */
@Properties(inherit = org.bytedeco.mkldnn.presets.mkldnn.class)
public class mkldnn_softmax_desc_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public mkldnn_softmax_desc_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public mkldnn_softmax_desc_t(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public mkldnn_softmax_desc_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public mkldnn_softmax_desc_t position(long position) {
        return (mkldnn_softmax_desc_t)super.position(position);
    }

    /** The kind of primitive. Used for self-identifying the primitive
    * descriptor. Must be #mkldnn_softmax. */
    public native @Cast("mkldnn_primitive_kind_t") int primitive_kind(); public native mkldnn_softmax_desc_t primitive_kind(int primitive_kind);
    /** The kind of propagation. Possible values: #mkldnn_forward_training and
     * #mkldnn_forward_inference. */
    public native @Cast("mkldnn_prop_kind_t") int prop_kind(); public native mkldnn_softmax_desc_t prop_kind(int prop_kind);
    /** Source and destination memory descriptor. */
    public native @ByRef mkldnn_memory_desc_t data_desc(); public native mkldnn_softmax_desc_t data_desc(mkldnn_memory_desc_t data_desc);
    /** Source and Destination of gradient memory descriptor. */
    public native @ByRef mkldnn_memory_desc_t diff_desc(); public native mkldnn_softmax_desc_t diff_desc(mkldnn_memory_desc_t diff_desc);
    /** The axis along which to perform the softmax. */
    public native int softmax_axis(); public native mkldnn_softmax_desc_t softmax_axis(int softmax_axis);
}