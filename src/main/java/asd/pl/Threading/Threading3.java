package asd.pl.Threading;

/**
 * Created by RENT on 2017-01-14.
 */
public class Threading3 {
    public static void main(String[] args) throws InterruptedException {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                sum(10_000_000_000L);
            }
        };
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);

        long start = System.nanoTime();
        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        long end = System.nanoTime();

        double duration = (end - start) / 1_000_000_000d;
        System.out.println("duration: " + duration);
    }

    public static long sum(long x) {
        long sum = 0;
        for (long i = 1; i <= x; i++) {
            sum += i;
        }
        return sum;
    }
}
