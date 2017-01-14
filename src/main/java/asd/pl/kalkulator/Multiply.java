package asd.pl.kalkulator;

/**
 * Created by RENT on 2017-01-14.
 */
public class Multiply implements Action {
    @Override
    public double eval(double a, double b) {
        return a*b;
    }
}
