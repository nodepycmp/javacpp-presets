// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_quality;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;
import org.bytedeco.opencv.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgproc.*;
import org.bytedeco.opencv.opencv_ml.*;
import static org.bytedeco.opencv.global.opencv_ml.*;

import static org.bytedeco.opencv.global.opencv_quality.*;


/**
\brief Full reference GMSD algorithm
http://www4.comp.polyu.edu.hk/~cslzhang/IQA/GMSD/GMSD.htm
*/
@Namespace("cv::quality") @NoOffset @Properties(inherit = org.bytedeco.opencv.presets.opencv_quality.class)
public class QualityGMSD extends QualityBase {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public QualityGMSD(Pointer p) { super(p); }


    /**
    \brief Compute GMSD
    @param cmpImgs Comparison images
    @return Per-channel GMSD
    */
    public native @ByVal @Override Scalar compute(@ByVal MatVector cmpImgs);
    public native @ByVal @Override Scalar compute(@ByVal UMatVector cmpImgs);
    public native @ByVal @Override Scalar compute(@ByVal GpuMatVector cmpImgs);

    /** \brief Implements Algorithm::empty()  */
    public native @Cast("bool") @Override boolean empty();

    /** \brief Implements Algorithm::clear()  */
    public native @Override void clear();

    /**
    \brief Create an object which calculates image quality
    @param refImgs input image(s) to use as the source for comparison
    */
    public static native @Ptr QualityGMSD create(@ByVal MatVector refImgs);
    public static native @Ptr QualityGMSD create(@ByVal UMatVector refImgs);
    public static native @Ptr QualityGMSD create(@ByVal GpuMatVector refImgs);

    /**
    \brief static method for computing quality
    @param refImgs reference image(s)
    @param cmpImgs comparison image(s)
    @param qualityMaps output quality map(s), or cv::noArray()
    @return cv::Scalar with per-channel quality value.  Values range from 0 (worst) to 1 (best)
    */
    public static native @ByVal Scalar compute(@ByVal MatVector refImgs, @ByVal MatVector cmpImgs, @ByVal MatVector qualityMaps);
    public static native @ByVal Scalar compute(@ByVal UMatVector refImgs, @ByVal UMatVector cmpImgs, @ByVal UMatVector qualityMaps);
    public static native @ByVal Scalar compute(@ByVal GpuMatVector refImgs, @ByVal GpuMatVector cmpImgs, @ByVal GpuMatVector qualityMaps);

}
