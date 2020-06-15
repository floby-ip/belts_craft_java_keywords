package threadWorks.synchronization;

public class ThreadWorkerSynchronized extends Thread{
    public ThreadWorkerSynchronized(String name){
        super(name);
    }
    public void run(){
        for(int i = 0; i < 26; i++){
            char c = (char)(i+97);
            Concatenator.concatenateSynchronized(this.getName(), c);
        }
    }

}
