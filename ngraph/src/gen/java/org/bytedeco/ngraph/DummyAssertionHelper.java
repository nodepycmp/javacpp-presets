// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.ngraph;

import org.bytedeco.ngraph.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.ngraph.global.ngraph.*;


    /**
     *  Class that returns a dummy ostream to absorb error strings for non-failed assertions.
     *  This is cheaper to construct than AssertionHelper, so the macros will produce a
     *  DummyAssertionHelper in lieu of an AssertionHelper if the condition is true.
     *  */
    @Namespace("ngraph") @Properties(inherit = org.bytedeco.ngraph.presets.ngraph.class)
public class DummyAssertionHelper extends Pointer {
        static { Loader.load(); }
        /** Default native constructor. */
        public DummyAssertionHelper() { super((Pointer)null); allocate(); }
        /** Native array allocator. Access with {@link Pointer#position(long)}. */
        public DummyAssertionHelper(long size) { super((Pointer)null); allocateArray(size); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public DummyAssertionHelper(Pointer p) { super(p); }
        private native void allocate();
        private native void allocateArray(long size);
        @Override public DummyAssertionHelper position(long position) {
            return (DummyAssertionHelper)super.position(position);
        }
    
        /** Returns an ostream to which additional error details can be written. Anything written
         *  to this stream will be ignored. The returned stream has the lifetime of the
         *  DummyAssertionHelper. */
        public native @Cast("std::ostream*") @ByRef Pointer get_stream();
    }
