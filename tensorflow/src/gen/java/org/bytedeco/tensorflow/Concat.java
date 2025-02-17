// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Concatenates tensors along one dimension.
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * values: List of {@code N} Tensors to concatenate. Their ranks and types must match,
 *  and their sizes must match in all dimensions except {@code concat_dim}.
 *  * axis: 0-D.  The dimension along which to concatenate.  Must be in the
 *  range [-rank(values), rank(values)).
 * 
 *  Returns:
 *  * {@code Output}: A {@code Tensor} with the concatenation of values stacked along the
 *  {@code concat_dim} dimension.  This tensor's shape matches that of {@code values} except
 *  in {@code concat_dim} where it has the sum of the sizes. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class Concat extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Concat(Pointer p) { super(p); }

  public Concat(@Const @ByRef Scope scope, @ByVal InputList values,
         @ByVal Input axis) { super((Pointer)null); allocate(scope, values, axis); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal InputList values,
         @ByVal Input axis);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public native @ByRef Operation operation(); public native Concat operation(Operation setter);
  public native @ByRef Output output(); public native Concat output(Output setter);
}
