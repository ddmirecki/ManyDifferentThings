package asd.pl.cwiczenia;


import asd.pl.cwiczenia.exceptions.MyException;

/**
 * Created by RENT on 2017-01-18.
 */
public class Customer {

    public Customer(String text) throws MyException {

        if(text != null) {
            String[] parts = text.split(",");
            if(parts.length != 4){
                throw new MyException("Zly format stringa");
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
            throw new MyException("Zły format stringa");
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



        @Override
    public boolean equals(Object obj) {
        if(obj == null) return false;

        if(getClass() != obj.getClass()){
            return false;
        }
       Customer customer = (Customer) obj;
//
//            if(customer.getIdNumber().equals(idNumber)){
//                return true;
//            }else {
//                return false;
//            }                                   LUB:
            if(customer.getIdNumber() == null){
                return false;
            }
            return idNumber.equals(customer.idNumber);
        }


//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        Customer customer = (Customer) o;
//
//        if (birthYear != customer.birthYear) return false;
//        if (firstName != null ? !firstName.equals(customer.firstName) : customer.firstName != null) return false;
//        if (lastName != null ? !lastName.equals(customer.lastName) : customer.lastName != null) return false;
//        return idNumber != null ? idNumber.equals(customer.idNumber) : customer.idNumber == null;
//    }


    public static void main(String[] args) throws MyException {
        Customer customer123 = new Customer("Jan", null, 1999, "123");
        Customer customer124 = new Customer("Jan, Kowalski,1980, 123");
        System.out.println("klient " + customer123.toString());
        boolean b = customer123.equals(customer124);
        System.out.println(b);
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
    public Customer(){

    }





}
