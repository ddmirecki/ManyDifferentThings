package asd.pl.cwiczenia;

import org.joda.time.DateTime;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by RENT on 2017-01-21.
 */
public class Rental {
    private Customer customer;
    private Movie movie;
    private DateTime startDate;
    private DateTime endDate;
    private String id;



    private List<Rental> rentals = new ArrayList<>();

    public Rental(Customer customer, Movie movie) {
        this.customer = customer;
        this.movie = movie;
        this.startDate = DateTime.now();
        int randomId = new Random().nextInt(100000);
        this.id = Integer.toString(randomId);
    }

    @Override
    public String toString() {
        return "Rental{" +
                "customer=" + customer +
                ", movie=" + movie +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", id='" + id + '\'' +
                ", rentals=" + rentals +
                '}';
    }

    public Customer getCustomer() {
        return customer;
    }

    public Movie getMovie() {
        return movie;
    }

    public DateTime getStartDate() {
        return startDate;
    }

    public DateTime getEndDate() {
        return endDate;
    }



    public void setEndDate(DateTime endDate) {
        this.endDate = endDate;
    }
    public String getId() {
        return id;
    }

}
