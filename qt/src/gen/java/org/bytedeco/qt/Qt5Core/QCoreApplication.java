// Targeted by JavaCPP version 1.5: DO NOT EDIT THIS FILE

package org.bytedeco.qt.Qt5Core;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.qt.global.Qt5Core.*;

// Parsed from QtCore/qcoreapplication.h

@NoOffset @Properties(inherit = org.bytedeco.qt.presets.Qt5Core.class)
public class QCoreApplication extends QObject {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public QCoreApplication(Pointer p) { super(p); }

    /** enum QCoreApplication:: */
    public static final int ApplicationFlags = 0;

    public QCoreApplication(@ByRef IntPointer argc, @Cast("char**") PointerPointer argv
                ) { super((Pointer)null); allocate(argc, argv); }
    private native void allocate(@ByRef IntPointer argc, @Cast("char**") PointerPointer argv
                );
    public QCoreApplication(@ByRef IntPointer argc, @Cast("char**") @ByPtrPtr BytePointer argv
                ) { super((Pointer)null); allocate(argc, argv); }
    private native void allocate(@ByRef IntPointer argc, @Cast("char**") @ByPtrPtr BytePointer argv
                );
    public QCoreApplication(@ByRef IntBuffer argc, @Cast("char**") @ByPtrPtr ByteBuffer argv
                ) { super((Pointer)null); allocate(argc, argv); }
    private native void allocate(@ByRef IntBuffer argc, @Cast("char**") @ByPtrPtr ByteBuffer argv
                );
    public QCoreApplication(@ByRef int[] argc, @Cast("char**") @ByPtrPtr byte[] argv
                ) { super((Pointer)null); allocate(argc, argv); }
    private native void allocate(@ByRef int[] argc, @Cast("char**") @ByPtrPtr byte[] argv
                );

    public static native void setAttribute(ApplicationAttribute attribute, @Cast("bool") boolean on/*=true*/);
    public static native void setAttribute(ApplicationAttribute attribute);
    public static native @Cast("bool") boolean testAttribute(ApplicationAttribute attribute);

    public static native void setOrganizationDomain(@Const @ByRef QString orgDomain);
    public static native @ByVal QString organizationDomain();
    public static native void setOrganizationName(@Const @ByRef QString orgName);
    public static native @ByVal QString organizationName();
    public static native void setApplicationName(@Const @ByRef QString application);
    public static native @ByVal QString applicationName();
    public static native void setApplicationVersion(@Const @ByRef QString version);
    public static native @ByVal QString applicationVersion();

    public static native void setSetuidAllowed(@Cast("bool") boolean allow);
    public static native @Cast("bool") boolean isSetuidAllowed();

    public static native QCoreApplication instance();

// #ifndef QT_NO_QOBJECT
    public static native int exec();
    public static native void processEvents();
    public static native void exit(int retcode/*=0*/);
    public static native void exit();

    public static native @Cast("bool") boolean sendEvent(QObject receiver, QEvent event);
    public static native void postEvent(QObject receiver, QEvent event, int priority/*=Qt::NormalEventPriority*/);
    public static native void postEvent(QObject receiver, QEvent event);
    public static native void sendPostedEvents(QObject receiver/*=nullptr*/, int event_type/*=0*/);
    public static native void sendPostedEvents();
    public static native void removePostedEvents(QObject receiver, int eventType/*=0*/);
    public static native void removePostedEvents(QObject receiver);
// #if QT_DEPRECATED_SINCE(5, 3)
    public static native @Cast("bool") @Deprecated boolean hasPendingEvents();
// #endif
    public static native QAbstractEventDispatcher eventDispatcher();
    public static native void setEventDispatcher(QAbstractEventDispatcher eventDispatcher);

    public native @Cast("bool") @Name("notify") boolean _notify(QObject arg0, QEvent arg1);

    public static native @Cast("bool") boolean startingUp();
    public static native @Cast("bool") boolean closingDown();
// #endif

    public static native @ByVal QString applicationDirPath();
    public static native @ByVal QString applicationFilePath();
    public static native long applicationPid();

// #if QT_CONFIG(library)
    public static native void addLibraryPath(@Const @ByRef QString arg0);
    public static native void removeLibraryPath(@Const @ByRef QString arg0);
// #endif // QT_CONFIG(library)

// #ifndef QT_NO_TRANSLATION
// #endif

    public static native @ByVal QString translate(@Cast("const char*") BytePointer context,
                                 @Cast("const char*") BytePointer key,
                                 @Cast("const char*") BytePointer disambiguation/*=nullptr*/,
                                 int n/*=-1*/);
    public static native @ByVal QString translate(@Cast("const char*") BytePointer context,
                                 @Cast("const char*") BytePointer key);
    public static native @ByVal QString translate(String context,
                                 String key,
                                 String disambiguation/*=nullptr*/,
                                 int n/*=-1*/);
    public static native @ByVal QString translate(String context,
                                 String key);
// #if QT_DEPRECATED_SINCE(5, 0)
// #endif

// #ifndef QT_NO_QOBJECT
// #  if QT_DEPRECATED_SINCE(5, 9)
// #  endif

    public static native @Cast("bool") boolean isQuitLockEnabled();
    public static native void setQuitLockEnabled(@Cast("bool") boolean enabled);
    public static native void quit();
}