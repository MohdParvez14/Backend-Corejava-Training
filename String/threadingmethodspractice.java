package String; // You might want to use a more meaningful package name
import java.util.*;
public class threadingmethodspractice {

    public static class SleepThread extends Thread {

        @Override
        public void run() {
            for (int i = 1; i < 5; i++) {
                try {
                    Thread.sleep(2000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        SleepThread s1 = new SleepThread();
        SleepThread s2 = new SleepThread();
        s1.start();
        s2.start();
    }
}
