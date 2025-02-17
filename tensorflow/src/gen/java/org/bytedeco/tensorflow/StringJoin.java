// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Joins the strings in the given list of string tensors into one tensor;
 * 
 *  with the given separator (default is an empty separator).
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * inputs: A list of string tensors.  The tensors must all have the same shape,
 *  or be scalars.  Scalars may be mixed in; these will be broadcast to the shape
 *  of non-scalar inputs.
 * 
 *  Optional attributes (see {@code Attrs}):
 *  * separator: string, an optional join separator.
 * 
 *  Returns:
 *  * {@code Output}: The output tensor. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class StringJoin extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public StringJoin(Pointer p) { super(p); }

  /** Optional attribute setters for StringJoin */
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
  
    /** string, an optional join separator.
     * 
     *  Defaults to "" */
    public native @ByVal Attrs Separator(@StringPiece BytePointer x);
    public native @ByVal Attrs Separator(@StringPiece String x);

    public native @StringPiece BytePointer separator_(); public native Attrs separator_(BytePointer setter);
  }
  public StringJoin(@Const @ByRef Scope scope, @ByVal InputList inputs) { super((Pointer)null); allocate(scope, inputs); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal InputList inputs);
  public StringJoin(@Const @ByRef Scope scope, @ByVal InputList inputs,
             @Const @ByRef Attrs attrs) { super((Pointer)null); allocate(scope, inputs, attrs); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal InputList inputs,
             @Const @ByRef Attrs attrs);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public static native @ByVal Attrs Separator(@StringPiece BytePointer x);
  public static native @ByVal Attrs Separator(@StringPiece String x);

  public native @ByRef Operation operation(); public native StringJoin operation(Operation setter);
  public native @ByRef Output output(); public native StringJoin output(Output setter);
}
