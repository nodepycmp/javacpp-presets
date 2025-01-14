// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.nppicom;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;
import org.bytedeco.cuda.nppc.*;
import static org.bytedeco.cuda.global.nppc.*;

import static org.bytedeco.cuda.global.nppicom.*;


/**
 * Memory buffers used by one decode job.
 *
 * @see nppiJpegDecodeJobMemorySize
 * @see nppiJpegDecodeJob
 */
@Properties(inherit = org.bytedeco.cuda.presets.nppicom.class)
public class NppiJpegDecodeJobMemory extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public NppiJpegDecodeJobMemory() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public NppiJpegDecodeJobMemory(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public NppiJpegDecodeJobMemory(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public NppiJpegDecodeJobMemory position(long position) {
        return (NppiJpegDecodeJobMemory)super.position(position);
    }

    
    /** Pointer to host memory containing compressed scan data.
         * Should be allocated with additional \ref nppiJpegDecodeGetScanDeadzoneSize
         * bytes of usable memory after the end of compressed scan data.
         * Should be filled by caller. */
    public native @Cast("const Npp8u*") BytePointer pCpuScan(); public native NppiJpegDecodeJobMemory pCpuScan(BytePointer setter);

    
    /** Pointer to device memory used for compressed scan data.
         * Should be allocated with additional \ref nppiJpegDecodeGetScanDeadzoneSize
         * bytes of usable memory after the end of compressed scan data.
         * Should be filled by caller.
         * This buffer may be overwritten by the decoder.
         * Could be NULL for \ref NPPI_JPEG_DECODE_CPU. */
    public native @Cast("Npp8u*") BytePointer pGpuScan(); public native NppiJpegDecodeJobMemory pGpuScan(BytePointer setter);

    
    /** Pointers to additional host buffers used by job. Call \ref nppiJpegDecodeJobMemorySize
         * to query sizes of these buffers. {@code apCpuBuffer[i]} should point to
         * at least {@code aSize[i]} bytes. If {@code aSize[i] == 0}, the pointer should be set to NULL. */
    public native Pointer apCpuBuffer(int i); public native NppiJpegDecodeJobMemory apCpuBuffer(int i, Pointer setter);
    @MemberGetter public native @Cast("void**") PointerPointer apCpuBuffer();

    
    /** Pointers to additional device buffers used by job.
         * Minimal sizes of buffers should be the same as the sizes of \ref apCpuBuffer. */
    public native Pointer apGpuBuffer(int i); public native NppiJpegDecodeJobMemory apGpuBuffer(int i, Pointer setter);
    @MemberGetter public native @Cast("void**") PointerPointer apGpuBuffer();
}
