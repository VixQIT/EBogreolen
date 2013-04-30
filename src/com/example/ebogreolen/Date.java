package com.example.ebogreolen;

public class Date {

    private int year;
    private String month;
    private int day;

    public Date() {

    }

    /**
     * @return Returns the year of the book.
     */
    public int getYear() {
        return this.year;
    }

    /**
     * Sets the year to according to the parameter.
     * 
     * @param year
     *            The year of the release date
     */
    public void setYear(final int year) {
        this.year = year;
    }

    /**
     * @return Returns the month of the book.
     */
    public String getMonth() {
        return this.month;
    }

    /**
     * Sets the month according to the parameter.
     * 
     * @param month
     *            The month of the release date
     */
    public void setMonth(final String month) {
        this.month = month;
    }

    /**
     * @return Returns the day of the book.
     */
    public int getDay() {
        return this.day;
    }

    /**
     * Sets the day according to the parameter.
     * 
     * @param day
     *            The day of the release date
     */
    public void setDay(final int day) {
        this.day = day;
    }

    /**
     * Will return the complete release date for the book as a String.
     */
    @Override
    public String toString() {
        return "" + this.day + ". " + this.month + " " + this.year;
    }
}
