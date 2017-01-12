package asd.pl;

import java.util.Comparator;

/**
 * Created by RENT on 2017-01-12.
 */
public class PersonBirthyearComparator implements Comparator<Person> {
    public int compare(Person person1, Person person2) {
        return Integer.compare(person1.getBirthyear(), person2.getBirthyear());

//        if (person1.getBirthyear() > person2.getBirthyear()) {
//            return 1;
//        }
//        if (person2.getBirthyear() == person1.getBirthyear()) {
//            return 0;
//        }
//        else{
//            return -1;
//        }

    }
}
