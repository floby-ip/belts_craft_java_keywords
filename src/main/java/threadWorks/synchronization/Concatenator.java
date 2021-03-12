package threadWorks.synchronization;

public class Concatenator {

    private static String result = "";
    private static String resultSynchronised = "";

    public static synchronized void concatenateSynchronized(String name, char c){
        resultSynchronised += "["+name +"]"+c;
    }

    public static void concatenate(String name, char c){
        result += "["+name +"]"+c;
    }

    public static String getResult(){ return result;}
    public static String getResultSynchronised(){ return resultSynchronised;}

}
