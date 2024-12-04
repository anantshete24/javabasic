package com.example;

public class NativeExample {
    // Declare a native method
    public native int add(int a, int b);

    // Load the native library
    static {
        System.loadLibrary("myNativeLibrary"); // Assuming the library is named myNativeLibrary.dll or libmyNativeLibrary.so
    }

    public static void main(String[] args) {
        NativeExample example = new NativeExample();
        int result = example.add(5, 10);
        System.out.println("Result: " + result);
    }
}
