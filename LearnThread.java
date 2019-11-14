/**
 * Created by c06042 on 2019/11/14.
 */
public class LearnThread {
    public static void main(String[] args) {
        System.out.println("main start...");
        Thread t=new Thread(){
            public void  run(){
                System.out.println("thread run...");
                try{
                    Thread.sleep(10);
                }catch (InterruptedException e){ }
                System.out.println("thread end.");
            }
        };
        t.start();
        try{
            Thread.sleep(20);
        }catch (InterruptedException e){}
        System.out.println("main end...");
    }
}
