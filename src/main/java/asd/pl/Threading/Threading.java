package asd.pl.Threading;

/**
 * Created by RENT on 2017-01-14.
 */
public class Threading {
    public static void main(String[] args) {
        Runnable runnable = new MyThread();



        Runnable runnable2 = new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i < 100; i++) {
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.print(". ");


                }
            }
        };


        Thread thread = new Thread(runnable);
        Thread thread2 = new Thread(runnable2);

        System.out.println("przed wywolaniem");
//        thread.start();
        thread2.start();
        System.out.println("po wywolaniu");
    }
}
