package com.example.classwork6;

public class movie {

    private string title;
    private  string mainActor ;
    private double movieRate;
    private int pgRate;
    private string pgenre;

    public movie(string title, string mainActor, double movieRate, int pgRate, string pgenre) {
        this.title = title;
        this.mainActor = mainActor;
        this.movieRate = movieRate;
        this.pgRate = pgRate;
        this.pgenre = genre;
    }

    public string getTitle() {
        return title;
    }

    public void setTitle(string title) {
        this.title = title;
    }

    public string getMainActor() {
        return mainActor;
    }

    public void setMainActor(string mainActor) {
        this.mainActor = mainActor;
    }

    public double getMovieRate() {
        return movieRate;
    }

    public void setMovieRate(double movieRate) {
        this.movieRate = movieRate;
    }

    public int getPgRate() {
        return pgRate;
    }

    public void setPgRate(int pgRate) {
        this.pgRate = pgRate;
    }

    public string getPgenre() {
        return pgenre;
    }

    public void setPgenre(string pgenre) {
        this.pgenre = pgenre;
    }
}
