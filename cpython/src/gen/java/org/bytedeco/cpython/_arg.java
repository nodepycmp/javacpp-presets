// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cpython;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.cpython.global.python.*;


@Properties(inherit = org.bytedeco.cpython.presets.python.class)
public class _arg extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public _arg() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public _arg(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public _arg(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public _arg position(long position) {
        return (_arg)super.position(position);
    }

    public native @Cast("identifier") PyObject arg(); public native _arg arg(PyObject setter);
    public native _expr annotation(); public native _arg annotation(_expr setter);
    public native int lineno(); public native _arg lineno(int setter);
    public native int col_offset(); public native _arg col_offset(int setter);
}
