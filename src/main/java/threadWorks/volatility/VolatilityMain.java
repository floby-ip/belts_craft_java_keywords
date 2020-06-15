package threadWorks.volatility;

public class VolatilityMain {
    public static void threadsVolatility(){
        Counter counter = new Counter();
        ThreadIncrementer incrementer = new ThreadIncrementer("increment1", counter);
        ThreadIncrementer incrementer2 = new ThreadIncrementer("increment2", counter);
        ThreadIncrementer watcher = new ThreadIncrementer("watcher", counter);
        incrementer.start();watcher.start();incrementer2.start();
        try {
            incrementer.join();
            watcher.join();
            incrementer2.join();
        } catch (InterruptedException e){
            System.err.println("Interrupted exception occurred : " + e.getMessage());
        }

    }
}
