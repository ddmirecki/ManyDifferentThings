package asd.pl.Threading;

/**
 * Created by RENT on 2017-01-14.
 */
public class MyThread implements Runnable {
    @Override
    public void run() {
        for (int i = 5000; i < 5500 ; i++) {
            System.out.println(i);


        }
    }
}
