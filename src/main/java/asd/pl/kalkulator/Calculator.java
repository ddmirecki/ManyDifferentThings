package asd.pl.kalkulator;

import java.util.Scanner;

/**
 * Created by RENT on 2017-01-14.
 */
public class Calculator {
    public Calculator() {
    }

    public static void main(String[] args) {

        Scanner scannerIn = new Scanner(System.in);

        System.out.println("podaj pierwsza liczbe");
        Integer x = scannerIn.nextInt();

        System.out.println("podaj druga liczbe");
        Integer y = scannerIn.nextInt();

        System.out.println("podaj znak dzialania( +, -, *, /,");

        String actionChar = new Scanner(System.in).nextLine();

        Action actionToPerform = null;

        switch  (actionChar){
            case "+":
                actionToPerform = new Add();
            break;
            case "-":
                actionToPerform = new Substract();
            break;
            case "*":
                actionToPerform = new Multiply();
                break;
            case "/":
                actionToPerform = new Divde();
                break;
                default: throw new IllegalArgumentException("Zly kod dzialania");

        }


        double result = actionToPerform.eval(x, y);
        System.out.println("wynik dzialania to: " + result);
    }
}
