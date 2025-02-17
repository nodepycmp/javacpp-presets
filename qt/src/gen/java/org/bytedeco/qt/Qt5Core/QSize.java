// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.qt.Qt5Core;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.qt.global.Qt5Core.*;

// Parsed from QtCore/qsize.h

@NoOffset @Properties(inherit = org.bytedeco.qt.presets.Qt5Core.class)
public class QSize extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public QSize(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public QSize(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public QSize position(long position) {
        return (QSize)super.position(position);
    }

     public QSize() { super((Pointer)null); allocate(); }
private native void allocate();
     public QSize(int w, int h) { super((Pointer)null); allocate(w, h); }
private native void allocate(int w, int h);

     public native @Cast("bool") boolean isNull();
     public native @Cast("bool") boolean isEmpty();
     public native @Cast("bool") boolean isValid();

     public native int width();
     public native int height();
     public native void setWidth(int w);
     public native void setHeight(int h);
    public native void transpose();
      public native @ByVal QSize transposed();

    public native void scale(int w, int h, @Cast("Qt::AspectRatioMode") int mode);
    public native void scale(@Const @ByRef QSize s, @Cast("Qt::AspectRatioMode") int mode);
     public native @ByVal QSize scaled(int w, int h, @Cast("Qt::AspectRatioMode") int mode);
     public native @ByVal QSize scaled(@Const @ByRef QSize s, @Cast("Qt::AspectRatioMode") int mode);

      public native @ByVal QSize expandedTo(@Const @ByRef QSize arg0);
      public native @ByVal QSize boundedTo(@Const @ByRef QSize arg0);

     public native @ByRef IntPointer rwidth();
     public native @ByRef IntPointer rheight();

     public native @ByRef @Name("operator +=") QSize addPut(@Const @ByRef QSize arg0);
     public native @ByRef @Name("operator -=") QSize subtractPut(@Const @ByRef QSize arg0);
     public native @ByRef @Name("operator *=") QSize multiplyPut(double c);
    public native @ByRef @Name("operator /=") QSize dividePut(double c);

    
    
    
    
    
    
    
}
