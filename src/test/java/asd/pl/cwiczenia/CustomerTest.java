package asd.pl.cwiczenia;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by RENT on 2017-01-18.
 */
public class CustomerTest{

    @Test
    public void constructor_simpleTest(){

        String text = "Jan,Kowalski,1980,111";

        Customer customer = new Customer(text);

        assertEquals("Jan", customer.getFirstName());
        assertEquals("Kowalski", customer.getLastName());
        assertEquals(1980, customer.getBirthYear());
        assertEquals("111", customer.getIdNumber());

    }
@Test(expected = IllegalArgumentException.class)
    public void constructor_nullTest(){
        String text = null;

//        if(text == null){
//            throw new IllegalArgumentException("string jest nullem");
//        }

        Customer customer = new Customer(text);



    }
    @Test(expected = IllegalArgumentException.class)
    public void constructor_wrongFormatTest(){
        String text = "ABC, asdsd";

        Customer customer = new Customer(text);



    }
    @Test(expected = IllegalArgumentException.class)
    public void constructor_wrongBirthYear(){
        String text = "Jan,Kowalski,ABC,123";

        Customer customer = new Customer(text);
    }

}