// Targeted by JavaCPP version 1.5: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.systems.global.windows.*;


@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class RTL_CRITICAL_SECTION extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public RTL_CRITICAL_SECTION() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public RTL_CRITICAL_SECTION(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public RTL_CRITICAL_SECTION(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public RTL_CRITICAL_SECTION position(long position) {
        return (RTL_CRITICAL_SECTION)super.position(position);
    }

    public native @Cast("PRTL_CRITICAL_SECTION_DEBUG") RTL_CRITICAL_SECTION_DEBUG DebugInfo(); public native RTL_CRITICAL_SECTION DebugInfo(RTL_CRITICAL_SECTION_DEBUG setter);

    //
    //  The following three fields control entering and exiting the critical
    //  section for the resource
    //

    public native @Cast("LONG") int LockCount(); public native RTL_CRITICAL_SECTION LockCount(int setter);
    public native @Cast("LONG") int RecursionCount(); public native RTL_CRITICAL_SECTION RecursionCount(int setter);
    public native @Cast("HANDLE") Pointer OwningThread(); public native RTL_CRITICAL_SECTION OwningThread(Pointer setter);        // from the thread's ClientId->UniqueThread
    public native @Cast("HANDLE") Pointer LockSemaphore(); public native RTL_CRITICAL_SECTION LockSemaphore(Pointer setter);
    public native @Cast("ULONG_PTR") long SpinCount(); public native RTL_CRITICAL_SECTION SpinCount(long setter);        // force size on 64-bit systems when packed
}