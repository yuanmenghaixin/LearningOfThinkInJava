package jdk2;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**固定频率的周期性执行任务。
 * Created by chenyang on 2017/3/19.
 */
public class ScheduledExecutorFixedRateServiceDemo {
    public static void main(String[] args) {
        ScheduledExecutorService ses= Executors.newScheduledThreadPool(10);
        ses.scheduleAtFixedRate(new Runnable() {
            public void run() {
                try {
                    Thread.sleep(6000);
                    System.out.println(System.currentTimeMillis() / 1000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        },0,2,TimeUnit.SECONDS);
    }

}
