package asd.pl.cwiczenia;

import sun.swing.StringUIClientPropertyKey;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by RENT on 2017-01-19.
 */
public class MovieRental {
    List<Customer> customers = new ArrayList<>();
    private List<Movie> movies = new ArrayList<>();
    Customer customer = new Customer();

    @Override
    public String toString() {
        return "MovieRental{" +
                "customers=" + customers +
                ", movies=" + movies +
                ", customer=" + customer +
                '}';
    }

    public Customer getCustomerById(String id){
        for (int i = 0; i < customers.size() ; i++) {
            customer.getIdNumber();
        }

        return customer;
    }

    public Customer getCustomerByFirstAndLastName(String firstname, String lastName){

        return null;
    }
    public void addCustomer(Customer customer) throws MyException {
        for (int i = 0; i < customers.size(); i++) {
//            customers.add(new Customer());
//            setCustomers(customers(new Customer()));


        }
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

    public static void main(String[] args) throws MyException {
    MovieRental movieRental = new MovieRental();
    movieRental.addCustomer(new Customer("123,123,123,123"));

        System.out.println(movieRental);
    }


}
