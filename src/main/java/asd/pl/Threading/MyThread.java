package asd.pl.Threading;

/**
 * Created by RENT on 2017-01-14.
 */
public class MyThread implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10000 ; i++) {
            System.out.println(i);


        }
    }
}
