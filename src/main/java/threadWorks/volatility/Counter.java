package threadWorks.volatility;

public class Counter {
    private long count = 0;
    private volatile long volatileCount = 0;

    public void increment(){
        long time = System.currentTimeMillis();
        count = time;
        volatileCount = time;}
    public long getCount(){ return count;}
    public long getVolatileCount(){ return volatileCount;}
}
