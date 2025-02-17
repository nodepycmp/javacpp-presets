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


/** \brief Fills a Blob with values {@code  x \in [0, 1] }
 *         such that {@code  \forall i \sum_j x_{ij} = 1 }.
 */
@Name("caffe::PositiveUnitballFiller<float>") @Properties(inherit = org.bytedeco.caffe.presets.caffe.class)
public class FloatPositiveUnitballFiller extends FloatFiller {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public FloatPositiveUnitballFiller(Pointer p) { super(p); }

  public FloatPositiveUnitballFiller(@Const @ByRef FillerParameter param) { super((Pointer)null); allocate(param); }
  private native void allocate(@Const @ByRef FillerParameter param);
  public native void Fill(FloatBlob blob);
}
