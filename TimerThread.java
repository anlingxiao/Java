import java.time.LocalTime;

/**
 * Created by c06042 on 2019/11/19.
 */
public class TimerThread extends Thread {
    @Override
    public void run(){
        while (true){
            System.out.println(LocalTime.now());
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                break;
            }
        }
    }

    public static void main(String[] args) {
        TimerThread t=new TimerThread();
        t.setDaemon(true);
        t.start();
    }
}
