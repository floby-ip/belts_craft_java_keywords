package threadWorks.volatility;

public class ThreadIncrementer extends Thread {

    Counter counter;

    public ThreadIncrementer(String name, Counter counter){
        super(name);
        this.counter = counter;
    }

    @Override
    public void run() {
        if(getName().contains("inc")){
            incrementAndWatch();
        }else{
            onlyWatch();
        }
    }

    private void onlyWatch(){
        for(int i = 0; i < 10000; i++){
            watchValues();
            sleep();
        }
    }

    private void incrementAndWatch(){
        for(int i = 0; i < 10000; i++){
            watchValues();
            counter.increment();
            sleep();
        }
    }

    private void watchValues(){
        long c = counter.getCount();
        long cv = counter.getVolatileCount();
        if(c != cv) {
            System.out.println(String.format("%14s ::: normal %03d  -- volatile %03d", getName(), c, cv));
        }
    }

    private void sleep(){
        try {
            Thread.sleep(1);
        }catch (Exception e){
            // nothing to do if sleep fails
        }
    }
}
