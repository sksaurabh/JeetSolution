package com.example.saurabh.jeetsolution;

import java.util.ArrayList;

/**
 * Created by saurabh on 1/26/2017.
 */

public class MoviedetailsAdapter {

    private  String mtitle;
    private  String mimage;
    private String mrating;
    private String mreleaseYear;

    public ArrayList<String> getGenre() {
        return genre;
    }

    public void setGenre(ArrayList<String> genre) {
        this.genre = genre;
    }

    private ArrayList<String> genre;
    public String getMtitle() {
        return mtitle;
    }

    public void setMtitle(String mtitle) {
        this.mtitle = mtitle;
    }

    public String getMimage() {
        return mimage;
    }

    public void setMimage(String mimage) {
        this.mimage = mimage;
    }

    public String getMrating() {
        return mrating;
    }

    public void setMrating(String mrating) {
        this.mrating = mrating;
    }

    public String getMreleaseYear() {
        return mreleaseYear;
    }

    public void setMreleaseYear(String mreleaseYear) {
        this.mreleaseYear = mreleaseYear;
    }
}
