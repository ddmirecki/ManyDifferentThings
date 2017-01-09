package asd.pl;

import javax.xml.soap.Text;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        String converted = TextToMorse.convert("Jakis napis");
        System.out.println("Morse code");
        System.out.println(converted);
    }
}