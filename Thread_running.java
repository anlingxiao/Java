/**
 * Created by c06042 on 2019/11/18.
 */
public class Thread_running {
    public static void main(String[] args) throws InterruptedException {
        HelloThread1 t=new HelloThread1();
        t.start();
        Thread.sleep(1);
        t.running=false;
    }
}
class HelloThread1 extends Thread{
    public volatile boolean running=true; //voliatile是线程共享变量
    public void run(){
        int n=0;
        while (running){
            n++;
            System.out.println(n+" hello");
        }
        System.out.println("end!");
    }
}
