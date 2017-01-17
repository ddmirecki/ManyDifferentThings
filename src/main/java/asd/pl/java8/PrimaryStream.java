package asd.pl.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

/**
 * Created by Daniel on 2017-01-17.
 */
public class PrimaryStream {



    public static void main(String[] args) {
        final int x  = 11;
        System.out.println(IntStream.range(2, x).noneMatch(i -> x % i == 0));
    }
}
