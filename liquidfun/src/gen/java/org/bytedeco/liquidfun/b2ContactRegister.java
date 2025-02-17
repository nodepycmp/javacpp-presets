// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.liquidfun;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.liquidfun.global.liquidfun.*;


@Properties(inherit = org.bytedeco.liquidfun.presets.liquidfun.class)
public class b2ContactRegister extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public b2ContactRegister() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public b2ContactRegister(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public b2ContactRegister(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public b2ContactRegister position(long position) {
        return (b2ContactRegister)super.position(position);
    }

	public native b2ContactCreateFcn createFcn(); public native b2ContactRegister createFcn(b2ContactCreateFcn setter);
	public native b2ContactDestroyFcn destroyFcn(); public native b2ContactRegister destroyFcn(b2ContactDestroyFcn setter);
	public native @Cast("bool") boolean primary(); public native b2ContactRegister primary(boolean setter);
}
