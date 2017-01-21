package asd.pl.cwiczenia;

import asd.pl.cwiczenia.exceptions.CustomerAlreadyExistsException;
import asd.pl.cwiczenia.exceptions.MovieAlreadyExistsException;
import asd.pl.cwiczenia.exceptions.MyException;
import asd.pl.cwiczenia.exceptions.RentalNotFoundException;
import org.joda.time.DateTime;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by RENT on 2017-01-19.
 */
public class MovieRental {
    private List<Customer> customers = new ArrayList<>();
    private List<Movie> movies = new ArrayList<>();
    private List<Rental> rentals = new ArrayList<>();

    public MovieRental(){ //   KONSTRUKTOR INICJALIZUJACY
        customers = new ArrayList<>();
        movies = new ArrayList<>();
    }

    public void rent(String customerId, String movieID) throws RentalException {
        Customer customer = getCustomerById(customerId);
        Movie movie = getMovieById(movieID);
        if(customer != null && movie != null){

            Rental rental = new Rental(customer, movie);
            rentals.add(rental);
            movies.remove(movie);
        } else{
            throw new RentalException();
        }

    }
    public Rental getRentalById(String id){

        for(Rental rental: rentals){
            if(rental.getId().equals(id)){
                return rental;
            }
        }
        return null;
    }
    public void returnMovie(String rentalId) throws RentalNotFoundException, MovieAlreadyExistsException {
        Rental rentalById = getRentalById(rentalId);
        if(rentalById != null){
            rentalById.setEndDate(DateTime.now());
            Movie movie = rentalById.getMovie();
            addMovie(movie);
            //movies.add(movie)

        }else{
            throw new RentalNotFoundException();
        }


    }

    public static void main(String[] args) throws CustomerAlreadyExistsException, MyException {
        MovieRental movieRental = new MovieRental();
        Customer customer = new Customer("Jan,Kowalski,1980,123");
        Customer customer1 = new Customer("Jan,Adamski,1980,124");
        movieRental.addCustomer(customer);
        movieRental.addCustomer(customer1);


        Customer customerById = movieRental.getCustomerById("123");

        System.out.println(movieRental);
    }


    @Override
    public String toString() {
        return "MovieRental{" +
                "customers=" + customers +
                ", movies=" + movies +
                '}';
    }

    public Customer getCustomerById(String id) {
        return customers.stream().filter(x -> x.getIdNumber().equals(id)).findFirst().orElse(null);

//        Object<Customer> customerOptional = customers.stream().filter(x -> x.getIdNumber().equals(id)).findFirst();
//        if(customerOptional.isPresent()) {
//            return customerOptional.get();
//        }else {
//            return null;
//        }

//        for(Customer customer: customers){
//            if(customer.getIdNumber().equals(id)){
//                return customer;
//            }
//        }
//        return null;

    }

    public Customer getCustomerByFirstAndLastName(String firstname, String lastName) {
//        return  customers.stream().filter(x -> x.getFirstName().equals(firstname) && x.getLastName().equals(lastName)).findFirst().orElse(null);
        for(Customer customer: customers){
            if(customer.getFirstName().equals(firstname) && customer.getLastName().equals(lastName)){
                return customer;
            }
        }

        return null;
    }

    public void addCustomer(Customer customer) throws CustomerAlreadyExistsException {
//        if(!customers.contains(customer)){  !!!! METODA contains sprawdza za pomoca metody EQUALS !!!!!!!
//            customers.add(customer)
//        }
//
        Customer existingCustomer = getCustomerById(customer.getIdNumber());
        if(existingCustomer == null) {
            customers.add(customer);
        }else{
                throw new CustomerAlreadyExistsException();
            }
        }

//
//        }
        // dodac klienta - jesli jest klient o tym samym Id to powinna rzucic custom wyjatek
//    }

    public void addMovie(Movie movie) throws MovieAlreadyExistsException {
        Movie existingMovie = getMovieById(movie.getId());
        if(existingMovie == null) {
            movies.add(movie);
        }else{
            throw new MovieAlreadyExistsException();
        }
    }

    public Movie getMovieById(String id) {
        for(Movie movie: movies){
            if(movie.getId().equals(id)){
                return movie;
            }
        }
        return null;

    }

    public Movie getMovieByTitle(String title) {
        for(Movie movie: movies){
            if(movie.getTitle().equals(title)){
                return movie;
            }
        }
        return null;
    }

    public Movie getMovieByTitleAndGenre(String title, String genre){
//       return movies.stream().filter(x -> x.getTitle().equals(title) && x.getGenre().equals(genre)).findFirst().orElse(null);

        for(Movie movie: movies){
            if(movie.getTitle().equals(title) && movie.getGenre().equals(genre)){
                return movie;
            }
        }
        return null;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

//    public void setCustomers(List<Customer> customers) {  niepotrzebne bo mamy metode dodajaca film
//        this.customers = customers;
//    }

    public List<Movie> getMovies() {
        return movies;
    }

    public List<Rental> getRentals() {
        return rentals;
    }





}
