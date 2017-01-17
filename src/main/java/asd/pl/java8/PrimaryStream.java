package asd.pl.java8;

import com.google.common.primitives.Ints;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by Daniel on 2017-01-17.
 */
public class PrimaryStream {

    public static boolean isPrimary(int x){
//        return IntStream.range(2, x).anyMatch(y -> x % y == 0);
        return IntStream.range(2, x).noneMatch(y -> x % y == 0);

    }


    public static List<Integer> getAllPrimaryLessThan(int x){

      //  return IntStream.range(2, x).filter(z -> isPrimary(z)).boxed().collect(Collectors.toList()); -- zamiast tego pod spodem
        List<Integer> primaryNumbers = new ArrayList<>();

        for (int i = 2; i < x ; i++) {
            if(isPrimary(i)){
                primaryNumbers.add(i);
            }
        }

        return primaryNumbers;
    }




    public static void main(String[] args) {
        final int x  = 11;
        System.out.println(IntStream.range(2, x).noneMatch(i -> x % i == 0));

        List<Integer> allPrimaryLessThan = getAllPrimaryLessThan(1000);
        IntSummaryStatistics primaryStatistics = allPrimaryLessThan.stream().mapToInt(y -> y).summaryStatistics();



    }
}
