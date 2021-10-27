#include <jni.h>
#include <string>

extern "C" JNIEXPORT jstring JNICALL
Java_com_tispunshahryar960103_metro_MainActivity_stringFromJNI(
        JNIEnv* env,
        jobject /* this */) {
    std::string hello = "Welcome To Metro";
    return env->NewStringUTF(hello.c_str());
}


extern "C" JNIEXPORT jstring JNICALL
Java_com_tispunshahryar960103_metro_utils_Constants_getNDKLibraryName(
        JNIEnv* env,
        jobject /* this */) {
    std::string hello = "ndksample";
    return env->NewStringUTF(hello.c_str());
}