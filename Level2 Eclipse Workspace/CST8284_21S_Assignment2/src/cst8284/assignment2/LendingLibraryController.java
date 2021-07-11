package cst8284.assignment2;
import java.util.Objects;

import java.util.Scanner;

/**
 * Class Name: CST8284_21S_301
 * Author Name: Jie Ke
 * Date: July 18, 2021
 * Class Name:LendingLibraryController
 * Description: This program solution the Assignment2 task. 
 */
/**
 * This class is the The add/find methods process the addition 
 * and searching of items in the corresponding arrays. 
 */

public class LendingLibraryController{
	private LendingLibrary bookLib;
	private static Scanner input = new Scanner(System.in);
	private static final int ISBN_NUMBER = 10;

	public LendingLibraryController(){
		bookLib = new LendingLibrary();	
	}

	/**
	 * add the User if it is not User of booklib now
	 * if bookLib.addUser return true add a book
	 */
	public void addUser() {
		String lastName = getResponseTo("New User Entry\nLast name:");
		String firstName = getResponseTo("First name:");
		String inputAge = getResponseTo("Age:");
		int age = -1;

		while(true) {
			if(isValidNumber(inputAge)) {
				age = Integer.valueOf(inputAge);
				//accept only great equals 18 years old
				if (age >= 18) {
					break;
				}
			}
			inputAge = getResponseTo("Age:");
		}

		String address = getResponseTo("address:");	

		if(bookLib.findUser(firstName, lastName)!=null) {
			System.out.println("this user already exists.");
		}
		else {
			User u = new User(firstName, lastName, address, age);
			if(bookLib.addUser(u)) {
				System.out.println("User was added");
			}else{
				System.out.println("This user could not be added.");
			}
		}
	}
	/**
	 * change library User address
	 */
	public void changeUser(){
		String last = getResponseTo("Change User\nLast name");
		String first = getResponseTo("First name");
		User user = bookLib.findUser(first, last);
		if (Objects.isNull(user)) {
			System.out.println("No user with this name!");
		}else {
			String address = getResponseTo("Change address");
			user.setAddress(address);
		}
	}

	/**
	 * find a user by name and prompt 
	 */
	public void findUser(){

		String last = getResponseTo("Find User\nLast name");
		String first = getResponseTo("First name");
		User user = bookLib.findUser(first, last);
		if(Objects.isNull(user)) {
			System.out.println("No user with this name!");
		}else {
			System.out.println(user.toString());
		}

	}

	/**
	 * output the user information
	 */
	public void listUsers() {
		int i = 0;

		for(User user : bookLib.getUserReg()) {		
			if(user == null) break;
			System.out.printf("User #%d\n",i+1);
			System.out.println(user.toString());				
			i++;

		}
	}

	/**
	 * add the book to library's books collection
	 * if bookLib.addBook return true add a book 
	 */
	public void addBook() {

		String title = getResponseTo("New Book Entry\nTitle:");
		String author = getResponseTo("Author:");
		String date = getResponseTo("Publication date (year in NNNN format)");
		String isbn = getResponseTo("ISBN number(10 digits):");

		if(verifyISBNNumber(isbn)) {
			if(bookLib.findBook(isbn) != null) {
				System.out.println("This book already exists can not be added");
			} else {
				Book b= new Book(title, author, date, isbn);
				if ( !bookLib.addBook(b) ) {
					System.out.println("Book can not be added");
				} 
			}
		} else {
			System.out.println("Invalid ISBN number");
		}
	}

	/**
	 * modify a book 
	 */
	public void changeBook() {

		Book book = bookLib.findBook(getResponseTo("ISBN:"));
		if (Objects.isNull(book)) {
			System.out.println("Could not find a book with this isbn");
		} else {
			String t = getResponseTo("Change Book\nChange title:");
			book.setTitle(t);
			String a = getResponseTo("Change author:");
			book.setAuthor(a);
			String d = getResponseTo("Change publication date:");
			book.setPublicationDate(d);
		}
	}

	/**
	 * find a book by isbnnumber and prompt the information
	 */
	public void findBook() {

		String isbn = getResponseTo("Find Book\nISBN:");
		Book book = bookLib.findBook(isbn);
		if (Objects.isNull(book)) {
			System.out.println("No book with this ISBN!");
		} else {
			System.out.println(book.toString());
		}
	}
	public void listBooks() {

		int i = 0;

		for(Book book : bookLib.getBookReg()) {		
			if(book == null) break;
			System.out.printf("Book #%d\n",i+1);
			System.out.println(book.toString());				
			i++;

		}
	}

	/**
	 * add a loan if it is possible
	 */
	public void addBookLoan() {


		String lastName = getResponseTo("New Loan Entry\nUser last name:");
		String firstName = getResponseTo("User first name:");
		String isbn = getResponseTo("Book isbn number:");

		User user = bookLib.findUser(firstName, lastName);
		Book book = bookLib.findBook(isbn);
		if (Objects.isNull(user)) {
			System.out.println("No user with this name!");
		} else if (Objects.isNull(book)) {
			System.out.println("Could not find a book with this isbn!");
		} else if (bookLib.isBookLoaned(book)) {
			System.out.println("Book is already loaned");
		} else if (!(bookLib.userCanBorrow(user))) {
			System.out.println("This user is not allowed to borrow more books");
		} else {
			String date = getResponseTo("Loan date (format yyyy-mm-dd): ");
			BookLoan bookLoan = new BookLoan(user, book, date);
			bookLib.addLoan(bookLoan);
			System.out.println("Loan added");
			System.out.println(bookLoan.toString());
		}

	}

	/**
	 * modify the loan information
	 */
	public void changeBookLoan() {

		String isbn = getResponseTo("Modify loan details\nISBN number for the loan you want to modify:");
		BookLoan bookLoan = bookLib.findLoan(isbn);
		if (Objects.isNull(bookLoan)) {
			System.out.println("No book with this ISBN!");
		} else {
			System.out.println(bookLoan.toString());
			String dueDate = getResponseTo("Change due date (Hit Enter key for no change):");
			bookLoan.setDueDate(dueDate);
		}
	}

	/**
	 * find a bookloan by isbnnumber
	 */
	public void findBookLoan() {
		String isbn = getResponseTo("Find a book loan. Enter ISBN nubmer");
		BookLoan loan = bookLib.findLoan(isbn);
		if(Objects.isNull(loan)) {
			System.out.println("No book with this ISBN");
			return;
		}else {
			System.out.println(loan.toString());
		}
	}

	/**
	 * prompt the bookloan list
	 */
	public void listBookLoans() {

		int i = 0;
		for(BookLoan loan : bookLib.getLoanReg()) {
			if(loan == null) break;
			System.out.printf("Book loan #%d\n",(i+1));
			System.out.println(loan.toString());
			i++;
		}
	}

	/**
	 * delete a user if the user didn't have a loan
	 */
	public void deleteUser() {
		String last = getResponseTo("Find User\nLast name");
		String first = getResponseTo("First name");
		User user = bookLib.findUser(first, last);
		if (Objects.isNull(user)) {
			System.out.println("Could not find a user with this name");
		} else {
			if(bookLib.deleteUser(first, last)) {
				System.out.println("This user was deleted.");

			}else {
				System.out.println("This user has loaned books, can not be deleted.");
			}
		}
	}

	/**
	 * delete a book if the book wasn't borrowed
	 */
	public void deleteBook() {
		Book book = bookLib.findBook(getResponseTo("ISBN:"));
		if (Objects.isNull(book)) {
			System.out.println("Could not find a book with this isbn");
		} else {
			if(bookLib.deleteBook(book.getIsbnNumber())) {
				System.out.println("This book was deleted.");

			}else {
				System.out.println("This book was loaned, can not be deleted.");
			}
		}
	}

	/**
	 * delete a bookloan if it is correct 
	 */
	public void deleteBookLoan() {
		BookLoan loan = bookLib.findLoan(getResponseTo("ISBN:"));
		if (Objects.isNull(loan)) {
			System.out.println("Could not find a bookLoan with this isbn");
		} else {
			if(bookLib.deleteLoan(loan.getBook().getIsbnNumber())) {
				System.out.println("This bookLoan was deleted.");

			}else {
				System.out.println("This bookLoan is not exist, can not be deleted.");
			}
		}

	}

	/**
	 * @param s   display the string s
	 * @return    the input 
	 */
	private static String getResponseTo(String s)	{
		System.out.println(s);
		return (input.nextLine());
	}

	/**
	 * @param input
	 * @return  if the number is correct return true
	 */
	private static boolean isValidNumber(String input) {
		for(int i = 0; i < input.length(); i++) {
			if(Character.isDigit(input.charAt(i))) {
				return true;
			}
		}

		return false;
	}

	/**
	 * @param s input
	 * @return if the string is a number and the length is 10
	 */
	public boolean verifyISBNNumber(String s) {

		int j = 0;
		for(int i = 0; i < s.length(); i++) {
			if(Character.isDigit(s.charAt(i))) {
				j++;
			}
		}
		return j == ISBN_NUMBER;
	}

}

