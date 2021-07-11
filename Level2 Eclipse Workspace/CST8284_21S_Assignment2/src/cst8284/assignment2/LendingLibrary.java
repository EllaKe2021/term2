package cst8284.assignment2;
import java.util.ArrayList;

/**
 * Class Name: CST8284_21S_301
 * Author Name: Jie Ke
 * Date: July 18, 2021
 * Class Name:LendingLibrary
 * Description: This program solution the Assignment2 task. 
 */
/**
 * This class is the The add/find methods process the addition 
 * and searching of items in the corresponding arrays. 
 */

public class LendingLibrary {
	//control the user only loan 2 books
	private static final int MAX_LOAN_PER_USER = 2;

	private ArrayList<Book> bookReg;
	private ArrayList<User> userReg;
	private ArrayList<BookLoan> loanReg;

	/**
	 *  Constructor without parameters
	 */
	public LendingLibrary() {
		bookReg = new ArrayList<Book>();
		userReg = new ArrayList<User>();
		loanReg = new ArrayList<BookLoan>();
	}

	/**
	 * Adds a user to the arraylist
	 * @param u   User object
	 * @return    if no such a user we can add return true 
	 *            
	 */
	public boolean addUser(User u) {

		for(int i = 0; i<userReg.size(); i++) {

			if(userReg.get(i).equals(u)) {
				return false;
			}
		}
		userReg.add(u);
		return true;
	}

	/**
	 * adds a book in arraylist
	 * @param b   Book object
	 * @return true if no such a book isbnnumber
	 */
	public boolean addBook(Book b) {

		for(int i = 0; i<bookReg.size(); i++) {

			if(bookReg.get(i).equals(b)) {
				return false;
			}
		}
		bookReg.add(b);
		return true;
	}

	/**
	 * adds a bookloan
	 * @param l   bookloan object
	 * @return    true if the book and user is correct
	 *            else return false
	 */
	public boolean addLoan(BookLoan l) {

		for(int i = 0; i<loanReg.size(); i++) {
			if(loanReg.get(i).equals(l)) {
				return false;
			}
		}
		loanReg.add(l);
		return true;
	}	

	/**
	 * find a user by firstname and lastname
	 * @param firstName
	 * @param lastName
	 * @return
	 */
	public User findUser(String firstName, String lastName){

		for(int i = 0; i<userReg.size(); i++) {

			if (userReg == null)
				break;
			if ((firstName.equals(userReg.get(i).getFirstName())) 
					&& (lastName.equals(userReg.get(i).getLastName())))
				return userReg.get(i);
		}
		return null;
	}

	/**
	 * find a book by isbnnumber
	 * @param isbnNumber    
	 * @return
	 */
	/**
	 * @param isbnNumber
	 * @return
	 */
	public Book findBook(String isbnNumber) {

		for(int i = 0; i<bookReg.size(); i++) {
			if (bookReg == null) 
				break;

			if (isbnNumber.equals(bookReg.get(i).getIsbnNumber()))
				return bookReg.get(i);

		}
		return null;
	}	

	/**
	 * find a loan
	 * @param isbnNumber
	 * @return if find the correct loan then return it else return null
	 */
	public BookLoan findLoan(String isbnNumber) {

		for(int i = 0; i<loanReg.size(); i++) {

			if (loanReg == null)
				break;
			if (isbnNumber.equals(loanReg.get(i).getBook().getIsbnNumber()))
				return loanReg.get(i);
		}
		return null;
	}

	/**
	 * delet a user
	 * @param firstName
	 * @param lastName
	 * @return    if the user is correct name and wasn't loan
	 *            can be delete return true
	 */
	public boolean deleteUser(String firstName, String lastName) {

		User user = findUser(firstName, lastName);
		if(user != null) {
			for(int i = 0; i<loanReg.size(); i++) {
				if(firstName.equals(loanReg.get(i).getUser().getFirstName())
						&& (lastName.equals(loanReg.get(i).getUser().getLastName()))){
					return false;
				}
			}userReg.remove(user);
			return true;
		}return false;
	}


	/**
	 * delet a book
	 * @param isbnNumber
	 * @return if the book isbnnumber is correct and wasn't loan
	 *        can be delete return true
	 */
	public boolean deleteBook(String isbnNumber) {

		Book book = findBook(isbnNumber);
		if(book != null) {
			for(int i = 0; i<loanReg.size(); i++) {
				if(isbnNumber.equals(loanReg.get(i).getBook().getIsbnNumber())){
					return false;
				}

			}bookReg.remove(book);
			return true;
		}return false;
	}

	/**
	 * delete a bookloan 
	 * @param isbnNumber
	 * @return if the book and user both correct can be delete
	 *         return true
	 */
	public boolean deleteLoan(String isbnNumber) {

		BookLoan loan = findLoan(isbnNumber);
		if(loan != null) {
			for(int i = 0; i<loanReg.size(); i++) {
				if(loan != loanReg.get(i)) {
					return false;
				}
			}
			loanReg.remove(loan);
			return true;
		}return false;
	}

	/**
	 * 
	 * @param u
	 * @return true if user loaned less than 2 books
	 * 
	 */
	public boolean userCanBorrow(User u) {
		int index = 0;
		for (int i = 0; i<loanReg.size(); i++) {
			if(loanReg == null) 
				break;
			if(loanReg.get(i).getUser().getId() == u .getId()) {
				index++;
			}
		}				
		if(index >= MAX_LOAN_PER_USER) {	
			return false;  
		}else {
			return true;  	
		}
	}

	/**
	 * check if user has loaned book
	 * @param b
	 * @return
	 */
	public boolean isBookLoaned(Book b) {
		for(int i = 0; i<loanReg.size(); i++) {

			if(loanReg != null 
					&& loanReg.get(i).getBook().equals(b)){
				return true;  
			}
		}	
		return false;
	}

	/**
	 * get the bookReg
	 * @return arrayList bookReg
	 */
	public ArrayList<Book> getBookReg() {
		return bookReg;
	}

	/**
	 * set the bookReg
	 * @param bookReg
	 */
	public void setBookReg(ArrayList<Book> bookReg) {
		this.bookReg = bookReg;
	}

	/**
	 * get the userReg
	 * @return arrayList userReg
	 */
	public ArrayList<User> getUserReg() {
		return userReg;
	}

	/**
	 * set the userReg
	 * @param userReg
	 */
	public void setUserReg(ArrayList<User> userReg) {
		this.userReg = userReg;
	}

	/**
	 * get the loanReg
	 * @return arrayList loanReg
	 */
	public ArrayList<BookLoan> getLoanReg() {
		return loanReg;
	}
	/**
	 * set the loanReg
	 * @param loanReg
	 */
	public void setLoanReg(ArrayList<BookLoan> loanReg) {
		this.loanReg = loanReg;
	}

}
