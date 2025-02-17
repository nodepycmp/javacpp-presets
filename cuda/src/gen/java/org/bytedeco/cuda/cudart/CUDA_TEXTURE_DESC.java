// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.cudart;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.cuda.global.cudart.*;


/**
 * Texture descriptor
 */
@Properties(inherit = org.bytedeco.cuda.presets.cudart.class)
public class CUDA_TEXTURE_DESC extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CUDA_TEXTURE_DESC() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CUDA_TEXTURE_DESC(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CUDA_TEXTURE_DESC(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public CUDA_TEXTURE_DESC position(long position) {
        return (CUDA_TEXTURE_DESC)super.position(position);
    }

    /** Address modes */
    public native @Cast("CUaddress_mode") int addressMode(int i); public native CUDA_TEXTURE_DESC addressMode(int i, int setter);
    @MemberGetter public native @Cast("CUaddress_mode*") IntPointer addressMode();
    /** Filter mode */
    public native @Cast("CUfilter_mode") int filterMode(); public native CUDA_TEXTURE_DESC filterMode(int setter);
    /** Flags */
    public native @Cast("unsigned int") int flags(); public native CUDA_TEXTURE_DESC flags(int setter);
    /** Maximum anisotropy ratio */
    public native @Cast("unsigned int") int maxAnisotropy(); public native CUDA_TEXTURE_DESC maxAnisotropy(int setter);
    /** Mipmap filter mode */
    public native @Cast("CUfilter_mode") int mipmapFilterMode(); public native CUDA_TEXTURE_DESC mipmapFilterMode(int setter);
    /** Mipmap level bias */
    public native float mipmapLevelBias(); public native CUDA_TEXTURE_DESC mipmapLevelBias(float setter);
    /** Mipmap minimum level clamp */
    public native float minMipmapLevelClamp(); public native CUDA_TEXTURE_DESC minMipmapLevelClamp(float setter);
    /** Mipmap maximum level clamp */
    public native float maxMipmapLevelClamp(); public native CUDA_TEXTURE_DESC maxMipmapLevelClamp(float setter);
    /** Border Color */
    public native float borderColor(int i); public native CUDA_TEXTURE_DESC borderColor(int i, float setter);
    @MemberGetter public native FloatPointer borderColor();
    public native int reserved(int i); public native CUDA_TEXTURE_DESC reserved(int i, int setter);
    @MemberGetter public native IntPointer reserved();
}
