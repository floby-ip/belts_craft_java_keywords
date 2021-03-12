package threadWorks.synchronization;

public class ThreadWorker extends Thread {
    public ThreadWorker(String name){
        super(name);
    }
    public void run(){
        for(int i = 0; i < 26; i++){
            char c = (char)(i+65);
            Concatenator.concatenate(this.getName(), c);
        }
    }
}
