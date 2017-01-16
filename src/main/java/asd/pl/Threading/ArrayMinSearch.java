package asd.pl.Threading;

import java.util.Random;

/**
 * Created by Daniel on 2017-01-16.
 */
public class ArrayMinSearch {
    public static void main(String[] args) {
        int[] BigArray = new int[100_000_000];
        long start = System.nanoTime();
        for (int i = 0; i < BigArray.length; i++) {
            BigArray[i] = new Random().nextInt(100_000_000);
        }
        long end = System.nanoTime();
        long min = BigArray[0];

        for(int i: BigArray){
            if (i < min){
                min = i;
            }

        }

        double duration = (end - start) / 1_000_000_000d;
        for (int i = 0; i < 100; i++) {
            System.out.println("indeks tablicy " + i + " wartosc " + BigArray[i]);
        }

        System.out.println("min wartość to: "+ min + " czas " + duration);
    }
}
