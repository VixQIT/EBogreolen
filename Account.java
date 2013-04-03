package dk.ebogreolen;

import java.util.ArrayList;

public class Account {

	private String firstName;
	private String middleName;
	private String surName;
	private String emailAddress;
	private String phoneNumber;
	private ArrayList<Book> bookList;

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
	public Account(String firstName, String middleName, String surName,
			String emailAddress, String phoneNumber) {
		this.firstName = firstName;
		this.middleName = middleName;
		this.surName = surName;
		this.emailAddress = emailAddress;
		this.phoneNumber = phoneNumber;
		this.bookList = null;
	}

	public String getFullName(){
		if(this.middleName != null){
			return firstName + middleName + surName;
		}
		return firstName + surName;
	}
	
	public void setSurName(String surName){
		this.surName = surName;
	}
	
	public String getSurName() {
		return surName;
	}

	public void setPhoneNumber(String phoneNumber){
		this.phoneNumber = phoneNumber;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void addBook(Book book){
		bookList.add(book);
	}
	
	public void removeBook(Book book){
		bookList.remove(book);
	}
	
	public ArrayList<Book> getBookList() {
		return bookList;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public String getFirstName() {
		return firstName;
	}
}
