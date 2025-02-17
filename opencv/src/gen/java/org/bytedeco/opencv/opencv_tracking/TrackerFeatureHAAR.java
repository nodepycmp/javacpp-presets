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


/** \brief TrackerFeature based on HAAR features, used by TrackerMIL and many others algorithms
\note HAAR features implementation is copied from apps/traincascade and modified according to MIL
 */
@Namespace("cv") @NoOffset @Properties(inherit = org.bytedeco.opencv.presets.opencv_tracking.class)
public class TrackerFeatureHAAR extends TrackerFeature {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TrackerFeatureHAAR(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public TrackerFeatureHAAR(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public TrackerFeatureHAAR position(long position) {
        return (TrackerFeatureHAAR)super.position(position);
    }

  @NoOffset public static class Params extends Pointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public Params(Pointer p) { super(p); }
      /** Native array allocator. Access with {@link Pointer#position(long)}. */
      public Params(long size) { super((Pointer)null); allocateArray(size); }
      private native void allocateArray(long size);
      @Override public Params position(long position) {
          return (Params)super.position(position);
      }
  
    public Params() { super((Pointer)null); allocate(); }
    private native void allocate();
    /** # of rects */
    public native int numFeatures(); public native Params numFeatures(int setter);
    /** rect size */
    public native @ByRef Size rectSize(); public native Params rectSize(Size setter);
    /** true if input images are integral, false otherwise */
    public native @Cast("bool") boolean isIntegral(); public native Params isIntegral(boolean setter);
  }

  /** \brief Constructor
    @param parameters TrackerFeatureHAAR parameters TrackerFeatureHAAR::Params
     */
  public TrackerFeatureHAAR( @Const @ByRef(nullValue = "cv::TrackerFeatureHAAR::Params()") Params parameters ) { super((Pointer)null); allocate(parameters); }
  private native void allocate( @Const @ByRef(nullValue = "cv::TrackerFeatureHAAR::Params()") Params parameters );
  public TrackerFeatureHAAR( ) { super((Pointer)null); allocate(); }
  private native void allocate( );

  /** \brief Compute the features only for the selected indices in the images collection
    @param selFeatures indices of selected features
    @param images The images
    @param response Collection of response for the specific TrackerFeature
     */
  public native @Cast("bool") boolean extractSelected( @StdVector IntPointer selFeatures, @Const @ByRef MatVector images, @ByRef Mat response );
  public native @Cast("bool") boolean extractSelected( @StdVector IntBuffer selFeatures, @Const @ByRef MatVector images, @ByRef Mat response );
  public native @Cast("bool") boolean extractSelected( @StdVector int[] selFeatures, @Const @ByRef MatVector images, @ByRef Mat response );

  /** \brief Identify most effective features
    @param response Collection of response for the specific TrackerFeature
    @param npoints Max number of features
    <p>
    \note This method modifies the response parameter
     */
  public native void selection( @ByRef Mat response, int npoints );

  /** \brief Swap the feature in position source with the feature in position target
  @param source The source position
  @param target The target position
 */
  public native @Cast("bool") boolean swapFeature( int source, int target );

  /** \brief   Swap the feature in position id with the feature input
  @param id The position
  @param feature The feature
 */
  public native @Cast("bool") boolean swapFeature( int id, @ByRef CvHaarEvaluator.FeatureHaar feature );

  /** \brief Get the feature in position id
    @param id The position
     */
  public native @ByRef CvHaarEvaluator.FeatureHaar getFeatureAt( int id );
}
