// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Divides a variable reference by sparse updates.
 * 
 *  This operation computes
 * 
 *  <pre>{@code python
 *      # Scalar indices
 *      ref[indices, ...] /= updates[...]
 * 
 *      # Vector indices (for each i)
 *      ref[indices[i], ...] /= updates[i, ...]
 * 
 *      # High rank indices (for each i, ..., j)
 *      ref[indices[i, ..., j], ...] /= updates[i, ..., j, ...]
 *  }</pre>
 * 
 *  This operation outputs {@code ref} after the update is done.
 *  This makes it easier to chain operations that need to use the reset value.
 * 
 *  Duplicate entries are handled correctly: if multiple {@code indices} reference
 *  the same location, their contributions divide.
 * 
 *  Requires {@code updates.shape = indices.shape + ref.shape[1:]} or {@code updates.shape = []}.
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * ref: Should be from a {@code Variable} node.
 *  * indices: A tensor of indices into the first dimension of {@code ref}.
 *  * updates: A tensor of values that {@code ref} is divided by.
 * 
 *  Optional attributes (see {@code Attrs}):
 *  * use_locking: If True, the operation will be protected by a lock;
 *  otherwise the behavior is undefined, but may exhibit less contention.
 * 
 *  Returns:
 *  * {@code Output}: = Same as {@code ref}.  Returned as a convenience for operations that want
 *  to use the updated values after the update is done. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class ScatterDiv extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ScatterDiv(Pointer p) { super(p); }

  /** Optional attribute setters for ScatterDiv */
  public static class Attrs extends Pointer {
      static { Loader.load(); }
      /** Default native constructor. */
      public Attrs() { super((Pointer)null); allocate(); }
      /** Native array allocator. Access with {@link Pointer#position(long)}. */
      public Attrs(long size) { super((Pointer)null); allocateArray(size); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public Attrs(Pointer p) { super(p); }
      private native void allocate();
      private native void allocateArray(long size);
      @Override public Attrs position(long position) {
          return (Attrs)super.position(position);
      }
  
    /** If True, the operation will be protected by a lock;
     *  otherwise the behavior is undefined, but may exhibit less contention.
     * 
     *  Defaults to false */
    public native @ByVal Attrs UseLocking(@Cast("bool") boolean x);

    public native @Cast("bool") boolean use_locking_(); public native Attrs use_locking_(boolean setter);
  }
  public ScatterDiv(@Const @ByRef Scope scope, @ByVal Input ref,
             @ByVal Input indices, @ByVal Input updates) { super((Pointer)null); allocate(scope, ref, indices, updates); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input ref,
             @ByVal Input indices, @ByVal Input updates);
  public ScatterDiv(@Const @ByRef Scope scope, @ByVal Input ref,
             @ByVal Input indices, @ByVal Input updates, @Const @ByRef Attrs attrs) { super((Pointer)null); allocate(scope, ref, indices, updates, attrs); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input ref,
             @ByVal Input indices, @ByVal Input updates, @Const @ByRef Attrs attrs);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public static native @ByVal Attrs UseLocking(@Cast("bool") boolean x);

  public native @ByRef Operation operation(); public native ScatterDiv operation(Operation setter);
  public native @ByRef Output output_ref(); public native ScatterDiv output_ref(Output setter);
}
