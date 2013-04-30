package com.example.ebogreolen;

import java.util.ArrayList;

public class Account {

    private final String firstName;
    private final String middleName;
    private String surName;
    private final String emailAddress;
    private String phoneNumber;
    private final ArrayList<Book> bookList;

    /**
     * Creates a new account for the android application, the user has to
     * specify their full name, email address and phone number.
     * 
     * @param firstName
     *            First name of the user.
     * @param surName
     *            Surname of the user.
     * @param middleName
     *            Middle name of the user, can be set to null.
     * @param emailAddress
     *            Email address of the user.
     * @param phoneNumber
     *            Phone number of the user.
     */
    public Account(final String firstName, final String middleName,
            final String surName, final String emailAddress,
            final String phoneNumber) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.surName = surName;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
        this.bookList = null;
    }

    public String getFullName() {
        if (this.middleName != null) {
            return this.firstName + this.middleName + this.surName;
        }
        return this.firstName + this.surName;
    }

    public void setSurName(final String surName) {
        this.surName = surName;
    }

    public String getSurName() {
        return this.surName;
    }

    public void setPhoneNumber(final String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void addBook(final Book book) {
        this.bookList.add(book);
    }

    public void removeBook(final Book book) {
        this.bookList.remove(book);
    }

    public ArrayList<Book> getBookList() {
        return this.bookList;
    }

    public String getEmailAddress() {
        return this.emailAddress;
    }

    public String getFirstName() {
        return this.firstName;
    }
}
