package asd.pl.cwiczenia;

import sun.swing.StringUIClientPropertyKey;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by RENT on 2017-01-19.
 */
public class MovieRental {
    private List<Customer> customers = new ArrayList<>();
    private List<Movie> movies = new ArrayList<>();

    public Customer getCustomerById(String id){

        return null;
    }

    public Customer getCustomerByFirstAndLastName(String firstname, String lastName){

        return null;
    }
    public void addCustomer(Customer customer){
        // dodac klienta - jesli jest klient o tym samym Id to powinna rzucic custom wyjatek
    }
    public void addMovie(Movie movie){

    }

    public Movie getMovieById(String id){
        return null;

    }

    public Movie getMovieByTitle(String title){
        return null;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }

    public List<Movie> getMovies() {
        return movies;
    }

    public void setMovies(List<Movie> movies) {
        this.movies = movies;
    }
}
