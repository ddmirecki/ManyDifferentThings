package asd.pl;

import javax.xml.soap.Text;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        //        String s1 = "";
//        s1.compareTo("A");
//        Integer.compare(1, 2);

        List personList = new ArrayList<>();
        personList.add(new Person("Jan", "Kowalski", 1980));
        personList.add(new Person("Adam", "Mickiewicz", 1960));
        personList.add(new Person("Adam", "Adamski", 1970));
        personList.add(new Person("Adam", "Jonski", 1970));
        personList.add(new Person("Michal", "Kowalski", 1970));

//        Collections.sort(personList, new PersonBirthYearComparator());
        Collections.sort(personList, new Comparator<Person>() {
                    @Override
                    public int compare(Person person1, Person person2) {
                        if (person1.getLastname().equals(person2.getLastname())) {
                            return person1.getFirstName().compareTo(person2.getFirstName());
                        } else {
                            return person1.getLastname().compareTo(person2.getLastname());
                        }
                    }

                }
        );

        for (Object object : personList) {
            System.out.println(object);
        }
    }
}

//        String converted = TextToMorse.convert("Jakis napis");
//        System.out.println("Morse code");
//        System.out.println(converted);

//        long start = System.nanoTime();
//        for (int i = 0; i < 1000000; i++) {
//            String convert = Test2.translateToMorse("Ala nie ma kota");
//
//        }
//        long stop = System.nanoTime();
//
//        double duration = (stop - start)/1000000000d;
//        System.out.println(duration);




