package usingNative;

/**
 * run using : java -cp . -Djava.library.path=../lib/ MyNativeMethods
 */
public class MyNativeMethods {

    // --- Native methods
    public native int pumpThoseNumbers(int n);
    public native boolean isMyParamFalse(boolean bool);
    public native String sayMyName(String text);


    // --- Main method to test our native library
    public static void main() {
        System.setProperty("java.library.path",MyNativeMethods.class.getClassLoader().getResource("lib/").toString());

        System.loadLibrary("myNativeMethods");
        MyNativeMethods myNativeMethods = new MyNativeMethods();

        System.out.println( 5 + " pumped up is " + myNativeMethods.pumpThoseNumbers(5));
        System.out.println( 2 + " pumped up is " + myNativeMethods.pumpThoseNumbers(2));
        System.out.println( "is '" + true + "' false ? " + myNativeMethods.isMyParamFalse(true));
        System.out.println( "is '" + false + "' false ? " + myNativeMethods.isMyParamFalse(false));
        System.out.println( "What's my name ? " + myNativeMethods.sayMyName("Florent"));
    }
}
