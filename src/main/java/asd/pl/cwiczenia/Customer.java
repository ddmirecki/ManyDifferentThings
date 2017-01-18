package asd.pl.cwiczenia;

/**
 * Created by RENT on 2017-01-18.
 */
public class Customer {

    public Customer(String text){

        if(text != null) {
            String[] parts = text.split(",");
            if(parts.length != 4){
                throw new IllegalArgumentException();
            }
            String firstName1 = parts[0];
            this.firstName = firstName1;
            String lastName1 = parts[1];
            this.lastName = lastName1;
            String birthYear1 = parts[2];
            int x = Integer.parseInt(birthYear1);
            this.birthYear = x;
            String idNumber1 = parts[3];
            this.idNumber = idNumber1;
        }else{
            throw new IllegalArgumentException();
        }

    }

    @Override
    public String toString() {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthYear=" + birthYear +
                ", idNumber='" + idNumber + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Customer customer123 = new Customer("Jan, Kowalski,1980, 111");
        System.out.println("klient " + customer123.toString());
    }


    String firstName;
    String lastName;
    int birthYear;
    String idNumber;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public Customer(String firstName, String lastName, int birthYear, String idNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
        this.idNumber = idNumber;
    }





}
