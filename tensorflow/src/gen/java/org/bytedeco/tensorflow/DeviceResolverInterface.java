// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


// Interface that provides resolution of device localities.
@Namespace("tensorflow") @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class DeviceResolverInterface extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public DeviceResolverInterface(Pointer p) { super(p); }


  // Collects DeviceLocality protobufs from all of the devices identified
  // in 'col_params'.
  public native void GetDeviceLocalitiesAsync(@Const @ByRef CollInstanceParams inst_params,
                                          @StdVector DeviceLocality localities,
                                          @Cast("const tensorflow::StatusCallback*") @ByRef Pointer done);

  // Populate *locality with the DeviceLocality of the specified
  // device.
  public native void GetLocalityAsync(@StdString BytePointer device, @StdString BytePointer task,
                                  DeviceLocality locality,
                                  @Cast("const tensorflow::StatusCallback*") @ByRef Pointer done);
  public native void GetLocalityAsync(@StdString String device, @StdString String task,
                                  DeviceLocality locality,
                                  @Cast("const tensorflow::StatusCallback*") @ByRef Pointer done);

  // Clear the cache of device data belonging
  // to the specified task.
  public native void ClearTask(@StdString BytePointer task);
  public native void ClearTask(@StdString String task);
}
