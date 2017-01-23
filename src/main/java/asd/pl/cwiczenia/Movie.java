package asd.pl.cwiczenia;

import asd.pl.cwiczenia.exceptions.MyException;

import java.util.Optional;

/**
 * Created by RENT on 2017-01-18.
 */
public class Movie {


    private String title;
    private String genre;
    private int year;
    private int duration; //dlugosc trwania w minutach
    private String id;

        public Movie(String text) throws MyException {
            if(text == null){
                throw new MyException("text jest nullem");

            }
        String[] parts = text.split(",");
            if (parts.length != 5){
                throw new IllegalArgumentException();
            }
        this.title = parts[0];
        this.genre = parts[1];
        this.year = Integer.parseInt(parts[2]);
        this.duration = Integer.parseInt(parts[3]);
        this.id = parts[4];

    }
    public Movie(Optional<String> stringOptional) {
        if (!stringOptional.isPresent()) {
            throw new IllegalArgumentException();
        }
        String[] parts = stringOptional.get().split(",");
//            String string = stringOptional.get().toString();
//            String[] parts = string.split(",");
        title = parts[0];
        genre = parts[1];
        year = Integer.parseInt(parts[2]);
        duration = Integer.parseInt(parts[3]);
        id = parts[4];
    }


    @Override
    public String toString() {
        return "Title: " + getTitle() + ", Genre: " + getGenre() + ", Year: " + getYear() + ", Duration: " + getDuration() + " id :" +getId();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Movie movie = (Movie) obj;
        if (movie.getId() == null) {
            return false;
        }
        return id.equals(movie.getId());

    }

    public static void main(String[] args) {
        Movie movie = new Movie(Optional.of("null"));
        System.out.println(movie);
        System.out.println();
    }

    public Movie(String title, String genre, int year, int duration, String id) {
        this.title = title;
        this.genre = genre;
        this.year = year;
        this.duration = duration;
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
