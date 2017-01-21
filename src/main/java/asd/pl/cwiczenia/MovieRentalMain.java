package asd.pl.cwiczenia;

import asd.pl.cwiczenia.exceptions.CustomerAlreadyExistsException;
import asd.pl.cwiczenia.exceptions.MovieAlreadyExistsException;
import asd.pl.cwiczenia.exceptions.MyException;

/**
 * Created by RENT on 2017-01-21.
 */
public class MovieRentalMain {
    public static void main(String[] args) throws MyException, CustomerAlreadyExistsException, MovieAlreadyExistsException, RentalException {
        MovieRental movieRental = new MovieRental();
        movieRental.addCustomer(new Customer("Adam,Kowalski,1980,A"));
        movieRental.addCustomer(new Customer("Jan,Kowalski,1980,AB"));
        movieRental.addCustomer(new Customer("Adam,Adamski,1980,ABC"));
        movieRental.addMovie(new Movie("Terminator,akcja,1980,120,M1"));
        movieRental.addMovie(new Movie("Matrix,sf,1999,120,M2"));
        movieRental.addMovie(new Movie("Terminator2,akcja,1990,120,M3"));

        System.out.println("DOSTEPNE FILMY: ");
        for(Movie movie: movieRental.getMovies()){
            System.out.println(movie);
        }

        movieRental.rent("A", "M3");
        System.out.println("Wypozyczam film");


    }
}
