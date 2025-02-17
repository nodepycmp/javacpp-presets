// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_tracking;

import org.bytedeco.javacpp.annotation.Index;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;
import org.bytedeco.opencv.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgproc.*;
import org.bytedeco.opencv.opencv_plot.*;
import static org.bytedeco.opencv.global.opencv_plot.*;
import static org.bytedeco.opencv.global.opencv_imgcodecs.*;
import org.bytedeco.opencv.opencv_videoio.*;
import static org.bytedeco.opencv.global.opencv_videoio.*;
import org.bytedeco.opencv.opencv_highgui.*;
import static org.bytedeco.opencv.global.opencv_highgui.*;
import org.bytedeco.opencv.opencv_flann.*;
import static org.bytedeco.opencv.global.opencv_flann.*;
import org.bytedeco.opencv.opencv_features2d.*;
import static org.bytedeco.opencv.global.opencv_features2d.*;
import org.bytedeco.opencv.opencv_calib3d.*;
import static org.bytedeco.opencv.global.opencv_calib3d.*;
import org.bytedeco.opencv.opencv_video.*;
import static org.bytedeco.opencv.global.opencv_video.*;
import org.bytedeco.opencv.opencv_dnn.*;
import static org.bytedeco.opencv.global.opencv_dnn.*;

import static org.bytedeco.opencv.global.opencv_tracking.*;

@Name("std::vector<cv::Ptr<cv::Tracker> >") @Properties(inherit = org.bytedeco.opencv.presets.opencv_tracking.class)
public class TrackerVector extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TrackerVector(Pointer p) { super(p); }
    public TrackerVector(Tracker value) { this(1); put(0, value); }
    public TrackerVector(Tracker ... array) { this(array.length); put(array); }
    public TrackerVector()       { allocate();  }
    public TrackerVector(long n) { allocate(n); }
    private native void allocate();
    private native void allocate(@Cast("size_t") long n);
    public native @Name("operator=") @ByRef TrackerVector put(@ByRef TrackerVector x);

    public boolean empty() { return size() == 0; }
    public native long size();
    public void clear() { resize(0); }
    public native void resize(@Cast("size_t") long n);

    @Index(function = "at") public native @Ptr Tracker get(@Cast("size_t") long i);
    public native TrackerVector put(@Cast("size_t") long i, Tracker value);

    public native @ByVal Iterator insert(@ByVal Iterator pos, @Ptr Tracker value);
    public native @ByVal Iterator erase(@ByVal Iterator pos);
    public native @ByVal Iterator begin();
    public native @ByVal Iterator end();
    @NoOffset @Name("iterator") public static class Iterator extends Pointer {
        public Iterator(Pointer p) { super(p); }
        public Iterator() { }

        public native @Name("operator++") @ByRef Iterator increment();
        public native @Name("operator==") boolean equals(@ByRef Iterator it);
        public native @Name("operator*") @Ptr @Const Tracker get();
    }

    public Tracker[] get() {
        Tracker[] array = new Tracker[size() < Integer.MAX_VALUE ? (int)size() : Integer.MAX_VALUE];
        for (int i = 0; i < array.length; i++) {
            array[i] = get(i);
        }
        return array;
    }
    @Override public String toString() {
        return java.util.Arrays.toString(get());
    }

    public Tracker pop_back() {
        long size = size();
        Tracker value = get(size - 1);
        resize(size - 1);
        return value;
    }
    public TrackerVector push_back(Tracker value) {
        long size = size();
        resize(size + 1);
        return put(size, value);
    }
    public TrackerVector put(Tracker value) {
        if (size() != 1) { resize(1); }
        return put(0, value);
    }
    public TrackerVector put(Tracker ... array) {
        if (size() != array.length) { resize(array.length); }
        for (int i = 0; i < array.length; i++) {
            put(i, array[i]);
        }
        return this;
    }
}

