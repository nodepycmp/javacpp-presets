// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Reshapes a SparseTensor to represent values in a new dense shape.
 * 
 *  This operation has the same semantics as reshape on the represented dense
 *  tensor.  The {@code input_indices} are recomputed based on the requested {@code new_shape}.
 * 
 *  If one component of {@code new_shape} is the special value -1, the size of that
 *  dimension is computed so that the total dense size remains constant.  At
 *  most one component of {@code new_shape} can be -1.  The number of dense elements
 *  implied by {@code new_shape} must be the same as the number of dense elements
 *  originally implied by {@code input_shape}.
 * 
 *  Reshaping does not affect the order of values in the SparseTensor.
 * 
 *  If the input tensor has rank {@code R_in} and {@code N} non-empty values, and {@code new_shape}
 *  has length {@code R_out}, then {@code input_indices} has shape {@code [N, R_in]},
 *  {@code input_shape} has length {@code R_in}, {@code output_indices} has shape {@code [N, R_out]}, and
 *  {@code output_shape} has length {@code R_out}.
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * input_indices: 2-D.  {@code N x R_in} matrix with the indices of non-empty values in a
 *  SparseTensor.
 *  * input_shape: 1-D.  {@code R_in} vector with the input SparseTensor's dense shape.
 *  * new_shape: 1-D.  {@code R_out} vector with the requested new dense shape.
 * 
 *  Returns:
 *  * {@code Output} output_indices: 2-D.  {@code N x R_out} matrix with the updated indices of non-empty
 *  values in the output SparseTensor.
 *  * {@code Output} output_shape: 1-D.  {@code R_out} vector with the full dense shape of the output
 *  SparseTensor.  This is the same as {@code new_shape} but with any -1 dimensions
 *  filled in. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class SparseReshape extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SparseReshape(Pointer p) { super(p); }

  public SparseReshape(@Const @ByRef Scope scope, @ByVal Input input_indices, @ByVal Input input_shape,
                @ByVal Input new_shape) { super((Pointer)null); allocate(scope, input_indices, input_shape, new_shape); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input_indices, @ByVal Input input_shape,
                @ByVal Input new_shape);

  public native @ByRef Operation operation(); public native SparseReshape operation(Operation setter);
  public native @ByRef Output output_indices(); public native SparseReshape output_indices(Output setter);
  public native @ByRef Output output_shape(); public native SparseReshape output_shape(Output setter);
}
