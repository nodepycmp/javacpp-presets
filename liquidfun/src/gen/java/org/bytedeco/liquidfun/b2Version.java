// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.liquidfun;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.liquidfun.global.liquidfun.*;


/** Version numbering scheme.
 *  See http://en.wikipedia.org/wiki/Software_versioning */
@Properties(inherit = org.bytedeco.liquidfun.presets.liquidfun.class)
public class b2Version extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public b2Version() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public b2Version(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public b2Version(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public b2Version position(long position) {
        return (b2Version)super.position(position);
    }

	/** significant changes */
	public native @Cast("int32") int major(); public native b2Version major(int setter);
	/** incremental changes */
	public native @Cast("int32") int minor(); public native b2Version minor(int setter);
	/** bug fixes */
	public native @Cast("int32") int revision(); public native b2Version revision(int setter);
}
