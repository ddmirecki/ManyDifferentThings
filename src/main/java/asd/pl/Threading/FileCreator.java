package asd.pl.Threading;

import com.google.common.base.Charsets;
import com.google.common.io.Files;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by RENT on 2017-01-16.
 */
public class FileCreator {
    public static void main(String[] args) {

        List<String> files = new ArrayList<>();

        Runnable runnable = new Runnable() {
            @Override
            public void run() {

                for (int i = 0; i < 1000; i++) {
                    String filePath = "test2/file" + i + ".txt";

                    File file = new File(filePath);
                    try {
                        Files.write("1", file, Charsets.UTF_8);
                        files.add(filePath);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }

            }
        };

        Thread thread = new Thread(runnable);


        long start = System.nanoTime();

        thread.start();
        try {
            thread.join();
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