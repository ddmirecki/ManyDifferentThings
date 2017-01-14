package asd.pl.Threading;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by RENT on 2017-01-14.
 */
public class Threading5 {

    public static boolean isPrimary(int x) {

        for (int i = 2; i < x; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;

    }

    public static List<Integer> getAllPrimaryNumbers(int n){
        List<Integer> integers = new LinkedList<>();
        for (int i = 2; i <= n ; i++) {
            if(isPrimary(i)){
                integers.add(i);
            }

        }
        return integers;
    }

    public static void main(String[] args) {
        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                getAllPrimaryNumbers(2_500_000);
            }
        };

    }
}
