package asd.pl.java8;

import asd.pl.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by RENT on 2017-01-16.
 */
public class Streams {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(12);
        integers.add(4);
        integers.add(13);
        integers.add(3);
        integers.add(8);

        integers.stream().map(x -> "Liczba" + x).forEach(x -> System.out.println(x));
        integers.stream().map(x -> x * x).forEach(x -> System.out.println(x));
        integers.stream().filter(x -> x < 10).forEach(x -> System.out.println(x));
        boolean anyMatch = integers.stream().anyMatch(x -> x == 0);

        IntStream.range(0, 100).filter(x -> x % 2 == 0).forEach(x -> System.out.println(x));

        List<Integer> collect1 = integers.stream().map(x -> x * x).collect(Collectors.toList());
        List<Integer> collect = IntStream.range(0, 100).filter(x -> x % 2 == 0).boxed().collect(Collectors.toList());

        final int[] sum = {0};
        IntStream.range(0, 100).forEach(x -> sum[0] += x);
        System.out.println(sum[0]);

        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Jan", "Kowalski", 1980));
        personList.add(new Person("Piotr", "Mickiewicz", 1960));
        personList.add(new Person("Adam", "Mickiewicz", 1960));
        personList.add(new Person("Łukasz", "Mickiewicz", 1960));
        personList.add(new Person("Adam", "Adamski", 1970));

        personList.stream().filter(x ->x.getBirthyear() < 1970).forEach(x -> System.out.println(x));

        List<String> newList = personList.stream().map(x -> x.getFirstName() +" "+ x.getLastname()).collect(Collectors.toList());

        System.out.println(newList);





        //zamienic liste osob na liste stringow "imie nazwisko"
        //za pomoca streamow sprawdzic czy liczba jest pierwsza (uzyc dwoch streamow poniekad zagniezdzonych w sobie

//        integers.stream().filter(x -> x < 10).forEach(System.out::println); -- to samo co na gorze

//        for (int i = 0; i < integers.size() ; i++) {
//            if(integers.get(i) > 10){
//                integers.remove(i);
//            }
//
//        }
//
//        for(Integer integer: integers){
//            if(integer < 10){
//                System.out.println(integer);
//            }
//        }
    }

}
