package threadWorks.synchronization;

public class SynchronizationMain {
    public static void threadsSynchronization(){
        ThreadWorker tw1 = new ThreadWorker("1");
        ThreadWorker tw2 = new ThreadWorker("2");
        ThreadWorker tw3 = new ThreadWorker("3");
        ThreadWorkerSynchronized tws1 = new ThreadWorkerSynchronized("1");
        ThreadWorkerSynchronized tws2 = new ThreadWorkerSynchronized("2");
        ThreadWorkerSynchronized tws3 = new ThreadWorkerSynchronized("3");
        tw1.start();tw2.start();tw3.start();
        tws1.start();tws2.start();tws3.start();
        try {
            tw1.join();
            tw2.join();
            tw3.join();
            tws1.join();
            tws2.join();
            tws3.join();
        } catch (InterruptedException e){
            System.err.println("Interrupted exception occurred : " + e.getMessage());
        }

        String result = Concatenator.getResult();
        String syncResult = Concatenator.getResultSynchronised();
        System.out.println("NOT SYNC ::: " + result);
        System.out.println(" SYNC    ::: " + syncResult);

        System.out.println("NOT SYNC ::: " + (result.length() / 4) + "calls : " + (result.length() / 4 / 3.) + " calls / thread");
        System.out.println("SYNC     ::: " + (syncResult.length() / 4) + "calls : " + (syncResult.length() / 4 / 3.) + " calls / thread");

    }
}
