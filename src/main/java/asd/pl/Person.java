package asd.pl;

/**
 * Created by RENT on 2017-01-12.
 */
public class Person implements Comparable<Person> {
    String firstName;
    String lastname;
    int birthyear;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;

        Person person = (Person) o;

        if (getBirthyear() != person.getBirthyear()) return false;
        if (!getFirstName().equals(person.getFirstName())) return false;
        return getLastname().equals(person.getLastname());
    }


    public Person(String firstName, String lastname, int birthyear) {
        this.firstName = firstName;
        this.lastname = lastname;
        this.birthyear = birthyear;
    }

    public String getFirstName() {

        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getBirthyear() {
        return birthyear;
    }

    public void setBirthyear(int birthyear) {
        this.birthyear = birthyear;
    }

    @Override
    public String toString() {
        return "osoba o imieniu " + firstName + " o nazwisku " + lastname + " o roku urodzenia " + birthyear;
    }

    public String toComplexString() {
        return "\tosoba" + System.lineSeparator() + "\timie: " + firstName + System.lineSeparator() + "\tnazwisko: " + lastname + System.lineSeparator() + "\turodzona: " + birthyear;
    }


    public int compareTo(Person person) {
        if (getBirthyear() < person.getBirthyear()) {
            return -1;
        }
        if (getBirthyear() == person.getBirthyear()) {
            return 0;
        } else {
            return 1;
        }
    }
}