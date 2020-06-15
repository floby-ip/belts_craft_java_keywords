#include "MyNativeMethods.h"
#include <ctype.h>
#include <string.h>

/*
 * Class:     MyNativeMethods
 * Method:    pumpThoseNumbers
 * Signature: (I)I
 */
JNIEXPORT jint JNICALL Java_MyNativeMethods_pumpThoseNumbers
  (JNIEnv* env, jobject object, jint n){
    return n * 3;
  }

/*
 * Class:     MyNativeMethods
 * Method:    isMyParamFalse
 * Signature: (Z)Z
 */
JNIEXPORT jboolean JNICALL Java_MyNativeMethods_isMyParamFalse
  (JNIEnv* env, jobject object, jboolean b){
    return !b;
  }

/*
 * Class:     MyNativeMethods
 * Method:    sayMyName
 * Signature: (Ljava/lang/String;)Ljava/lang/String;
 */
JNIEXPORT jstring JNICALL Java_MyNativeMethods_sayMyName
  (JNIEnv* env, jobject object, jstring s){
    return s;
  }
