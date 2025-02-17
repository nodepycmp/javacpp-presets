// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.systems.global.windows.*;


@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class RIP_INFO extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public RIP_INFO() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public RIP_INFO(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public RIP_INFO(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public RIP_INFO position(long position) {
        return (RIP_INFO)super.position(position);
    }

    public native @Cast("DWORD") int dwError(); public native RIP_INFO dwError(int setter);
    public native @Cast("DWORD") int dwType(); public native RIP_INFO dwType(int setter);
}
