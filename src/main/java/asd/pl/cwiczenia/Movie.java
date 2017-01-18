package asd.pl.cwiczenia;

/**
 * Created by RENT on 2017-01-18.
 */
public class Movie {
    String title;
    String genre;
    int year;
    int duration; //dlugosc trwania w minutach
    //
    
    public Movie(String text){
        String[] parts = text.split(",");
        this.title = parts[0];
        this.genre = parts[1];
        this.year = Integer.parseInt(parts[2]);
        this.duration = Integer.parseInt(parts[3]);

    }
    @Override
    public String toString(){
        return "Title: " + getTitle() + ", Genre: " + getGenre() + ", Year: " +getYear() + ", Duration: " + getDuration();
    }

    public static void main(String[] args) {
        Movie movie = new Movie("Avengers,Action,2010,120");
        System.out.println(movie);
    }

    public Movie(String title, String genre, int year, int duration) {
        this.title = title;
        this.genre = genre;
        this.year = year;
        this.duration = duration;
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
}
