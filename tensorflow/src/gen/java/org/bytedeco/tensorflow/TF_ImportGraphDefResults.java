// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


@Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class TF_ImportGraphDefResults extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public TF_ImportGraphDefResults() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public TF_ImportGraphDefResults(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TF_ImportGraphDefResults(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public TF_ImportGraphDefResults position(long position) {
        return (TF_ImportGraphDefResults)super.position(position);
    }

  public native @StdVector TF_Output return_tensors(); public native TF_ImportGraphDefResults return_tensors(TF_Output setter);
  public native @Cast("TF_Operation**") @StdVector PointerPointer return_nodes(); public native TF_ImportGraphDefResults return_nodes(PointerPointer setter);
  public native @Cast("const char**") @StdVector PointerPointer missing_unused_key_names(); public native TF_ImportGraphDefResults missing_unused_key_names(PointerPointer setter);
  public native @StdVector IntPointer missing_unused_key_indexes(); public native TF_ImportGraphDefResults missing_unused_key_indexes(IntPointer setter);

  // Backing memory for missing_unused_key_names values.
  public native @ByRef StringList missing_unused_key_names_data(); public native TF_ImportGraphDefResults missing_unused_key_names_data(StringList setter);
}
