package asd.pl.cwiczenia;

import asd.pl.cwiczenia.exceptions.CustomerAlreadyExistsException;
import asd.pl.cwiczenia.exceptions.MovieAlreadyExistsException;
import asd.pl.cwiczenia.exceptions.MyException;

import java.util.Scanner;

/**
 * Created by RENT on 2017-01-21.
 */
public class MovieRentalDisplay {
    MovieRental movieRental;

    public MovieRentalDisplay() throws MyException, CustomerAlreadyExistsException, MovieAlreadyExistsException {
        movieRental = new MovieRental();

        movieRental.addCustomer(new Customer("Adam,Kowalski,1980,A"));
        movieRental.addCustomer(new Customer("Jan,Kowalski,1980,AB"));
        movieRental.addCustomer(new Customer("Adam,Adamski,1980,ABC"));

        movieRental.addMovie(new Movie("Terminator,akcja,1980,120,M1"));
        movieRental.addMovie(new Movie("Matrix,sf,1999,120,M2"));
        movieRental.addMovie(new Movie("Terminator2,akcja,1990,120,M3"));
    }
    public void run() {
        displayTitle();

        while (true) {
            System.out.println("Wybierz opcję:");
            System.out.println("\t0. Zakończ program");
            System.out.println("\t1. Pokaż dostępne filmy");
            System.out.println("\t2. Pokaż klientów");
            System.out.println("\t3. Pokaż wypożyczenia");
            System.out.println("\t4. Wypożycz film");
            System.out.println("\t5. Zwróć film");
            System.out.println("\t6. Wczytaj dane klientow z pliku");
            System.out.println("\t6. Wczytaj dane filmow z pliku");
            System.out.println("\t7. Zapisz dane klientow do pliku");
            System.out.println("\t7. Zapisz dane filmow do pliku");

            int choosedOption = new Scanner(System.in).nextInt();
        }
    }

    private void displayTitle() {
        for (int i = 0; i < 30; i++) {
            System.out.print("#");
        }
        System.out.println();

        System.out.println("SUPER WYPOŻYCZALNIA");

        for (int i = 0; i < 30; i++) {
            System.out.print("#");
        }
    }

    public static void main(String[] args) throws CustomerAlreadyExistsException, MovieAlreadyExistsException, MyException {
        new MovieRentalDisplay().run();
    }
}