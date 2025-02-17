// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.ale;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.ale.global.ale.*;


/**
  This Random class uses a Mersenne Twister to provide pseudorandom numbers.
  The class itself is derived from the original 'Random' class by Bradford W. Mott.
*/
@NoOffset @Properties(inherit = org.bytedeco.ale.presets.ale.class)
public class Random extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Random(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public Random(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public Random position(long position) {
        return (Random)super.position(position);
    }

    
    /**
      Class method which allows you to set the seed that'll be used
      for created new instances of this class
      <p>
      @param value The value to seed the random number generator with
    */
    public native void seed(@Cast("uInt32") int value);

    /**
      Create a new random number generator
    */
    public Random() { super((Pointer)null); allocate(); }
    private native void allocate();

    /**
      Answer the next random number from the random number generator
      <p>
      @return A random number
    */
    public native @Cast("uInt32") int next();

    /**
      Answer the next random number between 0 and 1 from the random number generator
      <p>
      @return A random number between 0 and 1
    */
    public native double nextDouble();

    // Returns a static Random object. DO NOT USE THIS. This is mostly meant for use by the
    // code for the various cartridges. 
    public static native @ByRef Random getInstance();

    /**
      Serializes the RNG state.
    */
    public native @Cast("bool") boolean saveState(@ByRef Serializer out);

    /** 
      Deserializes the RNG state.
    */
    public native @Cast("bool") boolean loadState(@ByRef Deserializer in);
}
