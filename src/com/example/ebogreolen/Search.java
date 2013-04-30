package com.example.ebogreolen;

import java.util.ArrayList;

public class Search {

    public static final Search instance = new Search();

    private String searchString = null;

    public Search() {
    }

    public ArrayList<Integer> getResults() {
        if (this.searchString != null) {
            return WebAPIIO.instance.getResults(this.searchString);
        } else {
            return null;
        }
    }

    public void setSearchString(final String searchString) {
        this.searchString = searchString;
    }

    public String getSearchString() {
        return this.searchString;
    }

}