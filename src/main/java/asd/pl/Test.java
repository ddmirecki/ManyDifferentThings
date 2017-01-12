package asd.pl;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by RENT on 2017-01-11.
 */
public class Test {
    public static void main(String[] args) throws InterruptedException {
        List<Integer> integers = new ArrayList<Integer>();
        for (int i = 0; i <Integer.MAX_VALUE; i++) {
            Thread.sleep(1);
            for (int j = 0; j < 10000 ; j++) {
                Integer integer = new Integer(10);
            }


        }
        Thread.sleep(3000000);

    }
}


