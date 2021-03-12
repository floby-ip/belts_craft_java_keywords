package primitiveTypes;

import primitiveTypes.exceptions.NullArgException;

public class PrimitiveTypes {

    public static void main(){
        System.out.println(" === Numeric types === ");
        System.out.println("with strictfp methods, the result will be the same on every platform");
        System.out.println(String.format("long/int               ==> 100/3 = %s",divideLongAndInt(100,3)));
        System.out.println(String.format("long/float             ==> 100/3 = %s",divideLongAndFloat(100,3)));
        System.out.println(String.format("long/double            ==> 100/3 = %s",divideLongAndDouble(100,3.)));
        System.out.println(String.format("long/double strictfp   ==> 100/3 = %s",divideLongAndDoubleStrict(100,3.)));
        System.out.println(String.format("double/double          ==> 100/3 = %s",divideDoubles(100.,3.)));
        System.out.println(String.format("double/double strictfp ==> 100/3 = %s",divideDoublesStrict(100.,3.)));
        System.out.println(" === byte === ");
        try {
            System.out.println("String \"I am a string\" in bytes is : " + getStringAsByteString("\"I am a string\""));
        } catch (NullArgException e){
            System.err.println("Error occured while calling method : " + e.getMessage());
        }
        try {
            System.out.println("String \"I am a string\" in bytes is : " + getStringAsByteString(null));
        } catch (NullArgException e){
            System.err.println("Error occured while calling method : " + e.getMessage());
        }
    }

    public static String getStringAsByteString(String s) throws NullArgException {

        if(s == null){
            throw new NullArgException(PrimitiveTypes.class, "getStringAsByteString", "s(String)");
        }

        String res = "";
        for(byte b : s.getBytes()){
            res += b + "|";
        }
        return res;
    }

    public static float divideLongAndInt(long a, int b){
        return a / b;
    }

    public static float divideLongAndFloat(long a, float b){
        return a / b;
    }

    public static double divideLongAndDouble(long a, double b){
        return a / b;
    }

    public static strictfp double divideLongAndDoubleStrict(long a, double b){
        return a / b;
    }

    public static double divideDoubles(double a, double b){
        return a / b;
    }

    public static strictfp double divideDoublesStrict(double a, double b){
        return a / b;
    }

}
