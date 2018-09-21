package com.stonehiy.opencv;

public class OpenCVHelper {

    static {
        System.loadLibrary("my-lib");
    }

    public static native String getStringTmp();


    // image gray processing
    public native int[] getGrayImage(int[] pixels, int w, int h);
}
