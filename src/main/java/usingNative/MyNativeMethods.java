package usingNative;

/**
 * run using : java -cp . -Djava.library.path=../lib/ MyNativeMethods
 */
public class MyNativeMethods {

    // --- Native methods
    public static native int pumpThoseNumbers(int n);
    public static native boolean isMyParamFalse(boolean bool);
    public static native String sayMyName(String text);


    // --- Main method to test our native library
    public static void main() {
        System.setProperty("java.library.path",MyNativeMethods.class.getClassLoader().getResource("lib/").toString());
        System.load(MyNativeMethods.class.getClassLoader().getResource("lib/libnative.so").getFile());

        try {
            System.out.println(5 + " pumped up is " + pumpThoseNumbers(5));
            System.out.println(2 + " pumped up is " + pumpThoseNumbers(2));
            System.out.println("is '" + true + "' false ? " + isMyParamFalse(true));
            System.out.println("is '" + false + "' false ? " + isMyParamFalse(false));
            System.out.println("What's my name ? " + sayMyName("Florent"));
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}
