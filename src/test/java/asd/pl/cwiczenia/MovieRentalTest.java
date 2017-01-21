package asd.pl.cwiczenia;

import asd.pl.cwiczenia.exceptions.CustomerAlreadyExistsException;
import asd.pl.cwiczenia.exceptions.MovieAlreadyExistsException;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by RENT on 2017-01-21.
 */
public class MovieRentalTest{
    MovieRental movieRental;
    Customer customer;
    Movie movie;

    @Before
    public void setup() throws CustomerAlreadyExistsException, MovieAlreadyExistsException {
        movieRental = new MovieRental();

        customer = new Customer("Jan", "kowalski", 1980, "ABC");
        movieRental.addCustomer(customer);

        movie = new Movie("Terminator", "action", 1992, 120, "B");
        movieRental.addMovie(movie);
    }

    @Test
    public void rent_correctCase() throws CustomerAlreadyExistsException, MovieAlreadyExistsException, RentalException {


         movieRental.rent("ABC", "B");
    }

    @Test
    public void rent_shouldProperlyAddRental() throws CustomerAlreadyExistsException, MovieAlreadyExistsException, RentalException {


        List<Rental> rentals = movieRental.getRentals();

        for(Rental rental: rentals){
            if(rental.getCustomer() == customer && rental.getMovie() == movie){
                assertTrue(true);
                return;
            }
        }
        assertTrue(false);

        boolean rentalExists = movieRental.getRentals().stream().anyMatch(x -> x.getMovie() == movie && x.getCustomer() == customer);
        assertTrue(rentalExists);
    }

    @Test
    public void rent_shouldRemoveMovieFromList() throws RentalException {
        List<Movie> movies = movieRental.getMovies();

        movieRental.rent("ABC", "B");

        boolean movieRemoved = movieRental.getMovies().stream().noneMatch(x -> x.getId() == movie.getId());
        assertTrue(movieRemoved);

        for(Movie movie: movies){
            if(movie.getId().equals(this.movie.getId())){
                assertTrue(false);
            }
        }

    }

    @Test
    public void customerById_test(){
        Customer customer1 = new Customer();
    }

}