// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.cudart;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.cuda.global.cudart.*;


/**
 * External semaphore  signal parameters
 */
@Properties(inherit = org.bytedeco.cuda.presets.cudart.class)
public class cudaExternalSemaphoreSignalParams extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public cudaExternalSemaphoreSignalParams() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public cudaExternalSemaphoreSignalParams(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public cudaExternalSemaphoreSignalParams(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public cudaExternalSemaphoreSignalParams position(long position) {
        return (cudaExternalSemaphoreSignalParams)super.position(position);
    }

        /**
         * Parameters for fence objects
         */
            /**
             * Value of fence to be signaled
             */
            @Name("params.fence.value") public native @Cast("unsigned long long") long params_fence_value(); public native cudaExternalSemaphoreSignalParams params_fence_value(long setter);
    /**
     * Flags reserved for the future. Must be zero.
     */
    public native @Cast("unsigned int") int flags(); public native cudaExternalSemaphoreSignalParams flags(int setter);
}
