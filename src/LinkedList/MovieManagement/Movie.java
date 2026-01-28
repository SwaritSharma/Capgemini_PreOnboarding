package LinkedList.MovieManagement;

import java.time.LocalDate;

public class Movie {
    private  final String title;
    private  final String director;
    private  final LocalDate year;
    private double rating;

    Movie(String title,String director,LocalDate year,double rating){
        this.title=title;
        this.director=director;
        this.year=year;
        this.rating=rating;
    }


    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    public LocalDate getYear() {
        return year;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
}
