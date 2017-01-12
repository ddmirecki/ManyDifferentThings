package asd.pl;

import javax.xml.soap.Text;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {

        Person person1 = new Person("Jan", "Kowalski", 1980);
        Person person2 = new Person("Janusz", "Kowalskusz", 1981);
        Person person3 = new Person("Adam", "Adamski", 1930);


        List<Person> personList = new ArrayList<Person>();
        personList.add(person1);
        personList.add(person2);
        personList.add(person3);

        Collections.sort(personList);

        for (Object object : personList){
            System.out.println(object);
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




    }
}