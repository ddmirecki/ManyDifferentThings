package asd.pl.Threading;

import com.google.common.base.Charsets;
import com.google.common.io.Files;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by RENT on 2017-01-16.
 */
public class FileCreator2ndThread {
    public static void main(String[] args) {

        List<String> files = new ArrayList<>();

        Runnable runnable1 = new FileCreatorRunnable(0, 500);
        Runnable runnable2 = new FileCreatorRunnable(599, 1000);

        Thread thread = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);



        long start = System.nanoTime();

        thread.start();
        thread2.start();
        try {
            thread.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long end = System.nanoTime();

        double duration = (end - start) / 1_000_000_000d;

        for (String fileName : files) {
            System.out.println(fileName);
        }

        System.out.println("Czas tworzenia plików: " + duration);
    }
}