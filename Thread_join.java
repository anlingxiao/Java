/**
 * Created by c06042 on 2019/11/18.
 */
public class Thread_join {
    public static void main(String[] args) throws InterruptedException {
        Thread t=new Thread(()->{
            System.out.println("hello");
        });
        System.out.println("start ");
        t.start();
        t.join();
        System.out.println("end");
    }
}
