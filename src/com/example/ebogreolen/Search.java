package com.example.ebogreolen;

import java.util.ArrayList;

public class Search {

  public static final Search instance = new Search();

  private String searchString = null;
  
  public Search() {
  }

  public ArrayList<Integer> getResults(){
    if (searchString != null) {
      return WebAPIIO.instance.getResults(searchString);
    } else {
      return null;
    }
  }

  public void setSearchString(String searchString){
    this.searchString = searchString;
  }
  
  public String getSearchString() {
    return this.searchString;
  }

  
}