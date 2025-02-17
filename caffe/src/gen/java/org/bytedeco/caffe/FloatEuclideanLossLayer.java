// Targeted by JavaCPP version 1.5.1: DO NOT EDIT THIS FILE

package org.bytedeco.caffe;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;
import org.bytedeco.opencv.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgcodecs.*;
import org.bytedeco.opencv.opencv_videoio.*;
import static org.bytedeco.opencv.global.opencv_videoio.*;
import org.bytedeco.opencv.opencv_highgui.*;
import static org.bytedeco.opencv.global.opencv_highgui.*;
import org.bytedeco.hdf5.*;
import static org.bytedeco.hdf5.global.hdf5.*;

import static org.bytedeco.caffe.global.caffe.*;


/**
 * \brief Computes the Euclidean (L2) loss {@code 
 *          E = \frac{1}{2N} \sum\limits_{n=1}^N \left| \left| \hat{y}_n - y_n
 *        \right| \right|_2^2 } for real-valued regression tasks.
 *
 * @param bottom input Blob vector (length 2)
 *   -# {@code  (N \times C \times H \times W) }
 *      the predictions {@code  \hat{y} \in [-\infty, +\infty]}
 *   -# {@code  (N \times C \times H \times W) }
 *      the targets {@code  y \in [-\infty, +\infty]}
 * @param top output Blob vector (length 1)
 *   -# {@code  (1 \times 1 \times 1 \times 1) }
 *      the computed Euclidean loss: {@code  E =
 *          \frac{1}{2n} \sum\limits_{n=1}^N \left| \left| \hat{y}_n - y_n
 *        \right| \right|_2^2 }
 *
 * This can be used for least-squares regression tasks.  An InnerProductLayer
 * input to a EuclideanLossLayer exactly formulates a linear least squares
 * regression problem. With non-zero weight decay the problem becomes one of
 * ridge regression -- see src/caffe/test/test_sgd_solver.cpp for a concrete
 * example wherein we check that the gradients computed for a Net with exactly
 * this structure match hand-computed gradient formulas for ridge regression.
 *
 * (Note: Caffe, and SGD in general, is certainly \b not the best way to solve
 * linear least squares problems! We use it only as an instructive example.)
 */
@Name("caffe::EuclideanLossLayer<float>") @NoOffset @Properties(inherit = org.bytedeco.caffe.presets.caffe.class)
public class FloatEuclideanLossLayer extends FloatLossLayer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public FloatEuclideanLossLayer(Pointer p) { super(p); }

  public FloatEuclideanLossLayer(@Const @ByRef LayerParameter param) { super((Pointer)null); allocate(param); }
  private native void allocate(@Const @ByRef LayerParameter param);
  @Virtual public native void Reshape(@Const @ByRef FloatBlobVector bottom,
        @Const @ByRef FloatBlobVector top);

  @Virtual public native @Const({false, false, true}) @Cast("const char*") BytePointer type();
  /**
   * Unlike most loss layers, in the EuclideanLossLayer we can backpropagate
   * to both inputs -- override to return true and always allow force_backward.
   */
  @Virtual public native @Cast("bool") @Const({false, false, true}) boolean AllowForceBackward(@Const int bottom_index);
  @Virtual protected native void Forward_cpu(@Const @ByRef FloatBlobVector bottom,
        @Const @ByRef FloatBlobVector top);
  @Virtual protected native void Forward_gpu(@Const @ByRef FloatBlobVector bottom,
        @Const @ByRef FloatBlobVector top);
  @Virtual protected native void Backward_cpu(@Const @ByRef FloatBlobVector top,
        @Const @ByRef BoolVector propagate_down, @Const @ByRef FloatBlobVector bottom);
  @Virtual protected native void Backward_gpu(@Const @ByRef FloatBlobVector top,
        @Const @ByRef BoolVector propagate_down, @Const @ByRef FloatBlobVector bottom);
}
