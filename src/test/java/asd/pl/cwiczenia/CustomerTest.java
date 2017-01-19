package asd.pl.cwiczenia;

import junit.framework.TestCase;
import org.junit.Test;

import javax.swing.*;

import java.awt.*;

import static org.junit.Assert.*;

/**
 * Created by RENT on 2017-01-18.
 */
public class CustomerTest{

    @Test
    public void constructor_simpleTest() throws MyException {

        String text = "Jan,Kowalski,1980,111";

        Customer customer = new Customer(text);

        assertEquals("Jan", customer.getFirstName());
        assertEquals("Kowalski", customer.getLastName());
        assertEquals(1980, customer.getBirthYear());
        assertEquals("111", customer.getIdNumber());

    }
@Test(expected = MyException.class)
    public void constructor_nullTest() throws MyException {
        String text = null;

//        if(text == null){
//            throw new IllegalArgumentException("string jest nullem");
//        }

        Customer customer = new Customer(text);



    }
    @Test(expected = MyException.class)
    public void constructor_wrongFormatTest() throws MyException {
        String text = "ABC, asdsd";

        Customer customer = new Customer(text);



    }
    @Test(expected = IllegalArgumentException.class)
    public void constructor_wrongBirthYear() throws MyException {
        String text = "Jan,Kowalski,ABC,123";

        Customer customer = new Customer(text);
    }
    @Test
    public void equals_simpleTest() throws MyException {
        String text1 = "Jan,Kowalski,1888,123";
        String text2 = "Jan,Kowalski,1888,123";

        Customer customer1 = new Customer(text1);
        Customer customer2 = new Customer(text2);

        assertEquals(customer1, customer2);

    }

    @Test
    public void equals_simpleTest2() throws MyException {
        String text1 = "Jan,Kowalski,1888,123";
        String text2 = "Jan,Kowalski,1888,124";

        Customer customer1 = new Customer(text1);
        Customer customer2 = new Customer(text2);

        assertFalse(customer1.equals(customer2));
        assertNotEquals(customer1, customer2);

    }

    @Test
    public void equals_returnsFalseForNull(){
        Customer customer1 = new Customer("Jan","kowalski", 1998, "asdsd");

        boolean equals = customer1.equals(null);

        assertFalse(equals);



    }

    @Test
    public void equals_shouldReturnFalseForOtherClass(){
        Customer customer1 = new Customer("Jan","kowalski", 1998, "asdsd");
        Point point = new Point();

        boolean equals = customer1.equals(point);

        assertFalse(equals);


    }

}