package asd.pl.java8;

import asd.pl.Person;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.partitioningBy;

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

        // metoda map zamienia cos w cos innego na co wskazemy

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

        List<String> lastNameList = personList.stream().map(x -> x.getLastname()).collect(Collectors.toList());
        System.out.println(lastNameList);

        Set<String> oneLastNameSet = personList.stream().map(x -> x.getLastname()).collect(Collectors.toSet());// to.set - zbiór w ktorym nie ma powtorzen
        oneLastNameSet.stream().forEach(x -> System.out.println(x));


        // summaryStatistics !!!!!!!!!!!!!!!1

        List<Integer> birthYears = personList.stream().map(x -> x.getBirthyear()).collect(Collectors.toList());

        IntSummaryStatistics intSummaryStatistics = personList.stream().mapToInt(x -> x.getBirthyear()).summaryStatistics();
        //metoda summaryStatistics jest tylko dla IntStreama - specjalny rodzaj streama, ktory ma ta sS, ktora ma duzo ciekawych metod
        int max = intSummaryStatistics.getMax();
        double average = intSummaryStatistics.getAverage();
        long count = intSummaryStatistics.getCount();
        long sum1 = intSummaryStatistics.getSum();

        // partitionBy !!!!!!!!!!!!! grupowanie z warunkiem - dwie grupy - spelnia/ nie spelnia warunku, zwraca mape typu boolean, lista

        Map<Boolean, List<Person>> collect2 = personList.stream().collect(partitioningBy(x-> x.getBirthyear() < 1970));

        System.out.println("dla TRUE");
        collect2.get(true).forEach(x-> System.out.println(x));

        System.out.println("dla FALSE");
        collect2.get(false).forEach(x-> System.out.println(x));

        Map<Boolean, List<Person>> firstNameMap = personList.stream().collect(partitioningBy(x -> x.getFirstName().startsWith("A")));

        List<Person> peopleWithFirstNameStartinwWithA = firstNameMap.get(true);
        List<Person> peopleWithFirstNameNOTStartinwWithA = firstNameMap.get(false);

        // groupingBy !!!!!!!!!!!!!!! okreslanie po czym chcemy grupowac (wartosc, string) - i tworzy grupy wg tego

        Map<String, List<Person>> collect3 = personList.stream().collect(groupingBy(x -> x.getLastname()));

        Set<String> lastNames = collect3.keySet();
        for(String lastname: lastNames){
            System.out.println("WARTOSC KLUCZA" + lastname);
            List<Person> persons = collect3.get(lastname);
            for(Person person: persons){
                System.out.println(person);
            }
        }


        List<Person> mieckiewicz = collect3.get("Mickiewicz");
        List<Person> kowalski = collect3.get("Kowalski");
        List<Person> adamski = collect3.get("Adamski");

        // joining !!!!!!!!!!!!!!!!!! łączenie

        String joined = personList.stream().map(x -> x.getFirstName()).collect(joining("; ", "IMIONA ", " KONIEC"));
        System.out.println(joined);

        String joined2 = personList.stream().map(x -> x.getFirstName()).collect(joining("; "));
        System.out.println(joined2);


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
