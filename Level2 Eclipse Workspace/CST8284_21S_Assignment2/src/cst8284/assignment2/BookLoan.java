package cst8284.assignment2;

/**
 * Class Name: CST8284_21S_301
 * @author JieKe
 * Date: July 18, 2021
 * Class Name: BookLoan
 * Description: This program solution the Assignment2 task. 
 */

/**
 * @author JieKe
 * This class include constructor,
 * getters, setters, equals() and toString() method
 */
/**
 * @author JieKe
 *
 */
public class BookLoan {
	/**
	 * declare the variable
	 */
	private User user;
	private Book book;
	private String dueDate;

	public BookLoan() {

	}

	/**
	 * constructor of BookLoan
	 * @param user who loaned books
	 * @param book which is loaned by user
	 * @param dueDate which the book is loaned
	 */
	public BookLoan(User user, Book book, String dueDate) {
		this.user = user;
		this.book = book;
		this.dueDate = dueDate;

	}
	/**
	 *override toString() method
	 *@return String with bookLoan information 
	 */
	public String toString() {
		return "\n*********User name: "
				+ user.getFirstName() + " " + user.getLastName() +
				"\n*********Title: "
				+ book.getTitle() +
				"\n*********Author: "
				+ book.getAuthor() +
				"\n********ISBN: "
				+ book.getIsbnNumber() + 
				"\n*********Due Date: "
				+ dueDate + "\n";

	}


	/**
	 *override the equals method
	 *to check if the two object are equal
	 */
	@Override
	public boolean equals(Object o) {
		if(o == null && (! (o instanceof BookLoan))) {
			return false;
		}
		BookLoan l = (BookLoan) o;
		if((getBook().equals(l.getBook())) 
				&& (getUser().equals(l.getUser())) 
				&& (getDueDate().equals(l.getDueDate()))) {
			return true;
		}

		return false;
	}

	/**
	 * get the user 
	 * @return
	 */
	public User getUser() {
		return user;
	}
	/**
	 * set the user 
	 * @param user
	 */
	public void setUser(User user) {
		this.user = user;
	}
	/**
	 * get the book 
	 * @return
	 */
	public Book getBook() {
		return book;
	}
	/**
	 * set the book 
	 * @param book
	 */
	public void setBook(Book book) {
		this.book = book;
	}
	/**
	 * get the date
	 * @return
	 */
	public String getDueDate() {
		return dueDate;
	}
	/**
	 * set the date
	 * @param dueDate
	 */
	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}



}
