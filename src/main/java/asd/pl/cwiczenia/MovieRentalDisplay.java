package asd.pl.cwiczenia;

import asd.pl.cwiczenia.exceptions.CustomerAlreadyExistsException;
import asd.pl.cwiczenia.exceptions.MovieAlreadyExistsException;
import asd.pl.cwiczenia.exceptions.MyException;
import asd.pl.cwiczenia.exceptions.RentalNotFoundException;
import com.google.gson.Gson;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by RENT on 2017-01-21.
 */
public class
MovieRentalDisplay {
    MovieRental movieRental;
    Gson gson = new Gson();


    public MovieRentalDisplay() throws MyException, CustomerAlreadyExistsException, MovieAlreadyExistsException {
        movieRental = new MovieRental();

        movieRental.addCustomer(new Customer("Adam,Kowalski,1980,A"));
        movieRental.addCustomer(new Customer("Jan,Kowalski,1980,AB"));
        movieRental.addCustomer(new Customer("Adam,Adamski,1980,ABC"));

        movieRental.addMovie(new Movie("Terminator,akcja,1980,120,M1"));
        movieRental.addMovie(new Movie("Matrix,sf,1999,120,M2"));
        movieRental.addMovie(new Movie("Terminator2,akcja,1990,120,M3"));


    }


    public void run() throws RentalException, MovieAlreadyExistsException, RentalNotFoundException, MyException, IOException {
        displayTitle();

        while (true) {
            System.out.println("Wybierz opcję:");
            System.out.println("\t0. Zakończ program");
            System.out.println("\t1. Pokaż dostępne filmy");
            System.out.println("\t2. Pokaż klientów");
            System.out.println("\t3. Pokaż wypożyczenia");
            System.out.println("\t4. Wypożycz film");
            System.out.println("\t5. Zwróć film");
            System.out.println("\t6. Dodaj film");
            System.out.println("\t7. Wczytaj dane klientow z pliku");
            System.out.println("\t8. Wczytaj dane filmow z pliku");
            System.out.println("\t9. Zapisz dane klientow do pliku");
            System.out.println("\t10. Zapisz dane filmow do pliku");

            int choosedOption = new Scanner(System.in).nextInt();


            if (choosedOption != 0) {


                switch (choosedOption) {
                    case 1:
                        System.out.println(movieRental.getCustomers());
                        break;
                    case 2:
                        System.out.println(movieRental.getMovies());
                        break;
                    case 3:
                        System.out.println(movieRental.getRentals());
                        break;
                    case 4:
                        System.out.println("Podaj ID klienta");
                        String customerID = new Scanner(System.in).nextLine();
                        System.out.println("Podaj ID filmu");
                        String movieID = new Scanner(System.in).nextLine();
                        movieRental.rent(customerID, movieID);
                        break;
                    case 5:
                        System.out.println("Podaj ID wypozyczenia");
                        String rentalID = new Scanner(System.in).nextLine();
                        movieRental.returnMovie(rentalID);
                        break;
                    case 6:
                        System.out.println("podaj dane filmu");
                        String movieText = new Scanner(System.in).nextLine();
                        Movie movie = new Movie(movieText);
                        movieRental.addMovie(movie = new Movie(movieText));
                    case 7:
                        String json = gson.toJson(movieRental.getCustomers());
                        FileWriter fileWriter = new FileWriter("rental.json");
                        gson.toJson(json, fileWriter);
                        fileWriter.flush();
                        fileWriter.close();
                        System.out.println(json);
                        break;
                    case 8:
                      MovieRental movieRental = gson.fromJson(new FileReader("rental.json"), MovieRental.class);
                        System.out.println(movieRental);


                }

            } else {
                break;


            }

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

    public static void main(String[] args) throws CustomerAlreadyExistsException, MovieAlreadyExistsException, MyException, RentalNotFoundException, RentalException, IOException {
        new MovieRentalDisplay().run();

    }
}