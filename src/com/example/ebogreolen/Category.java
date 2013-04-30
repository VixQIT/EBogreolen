package com.example.ebogreolen;

import java.util.ArrayList;

public class Category {

    private final String name;
    private ArrayList<Book> bookList = new ArrayList<Book>();
    private ArrayList<Category> categoryList = new ArrayList<Category>();
    private final boolean isSuperCategory;

    public Category(final String name, final ArrayList<Book> bookList,
            final ArrayList<Category> categoryList,
            final boolean isSuperCategory) {
        this.name = name;
        this.bookList = bookList;
        this.categoryList = categoryList;
        this.isSuperCategory = isSuperCategory;
    }

    public boolean isSuperCategory() {
        return this.isSuperCategory;
    }

    public ArrayList<Book> getBookList() {
        if (!this.isSuperCategory) {
            return this.bookList;
        }
        return null;

    }

    public ArrayList<Category> getSubCategories() {
        if (this.isSuperCategory) {
            return this.categoryList;
        }
        return null;
    }

    public String getName() {
        return this.name;
    }

}
