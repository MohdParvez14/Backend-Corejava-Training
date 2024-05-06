package String;
import java.util.*;
public class threading {
	public static void main(String[] args) {
        // Define and start thread 1
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 5; i++) {
                    System.out.println("Number: " + i);
                }
            }
        });
        thread1.start();
    }
}