package asd.pl.Threading;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by RENT on 2017-01-14.
 */
public class Threading4 {
    public static void main(String[] args) throws InterruptedException {
        List<Integer> integerList = new ArrayList<>();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1_000_000; i++) {
                    synchronized (integerList) { // blok synchronized moze wykonywac na raz tylko 1 watek
                        integerList.add(i);
                    }
                }

            }
        };
        Thread thread = new Thread(runnable);
        thread.start();


        Thread thread2 = new Thread(runnable);
        thread2.start();
        thread.join();
        thread2.join();

        System.out.println(integerList.size());
    }
}
