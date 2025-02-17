// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.liquidfun;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.liquidfun.global.liquidfun.*;


/** Solver Data */
@Properties(inherit = org.bytedeco.liquidfun.presets.liquidfun.class)
public class b2SolverData extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public b2SolverData() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public b2SolverData(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public b2SolverData(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public b2SolverData position(long position) {
        return (b2SolverData)super.position(position);
    }

	public native @ByRef b2TimeStep step(); public native b2SolverData step(b2TimeStep setter);
	public native b2Position positions(); public native b2SolverData positions(b2Position setter);
	public native b2Velocity velocities(); public native b2SolverData velocities(b2Velocity setter);
}
