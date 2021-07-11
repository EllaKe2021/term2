package cst8284.assignment2;

/**
 * Class Name: CST8284_21S_301
 * @author JieKe
 * Date: July 18, 2021
 * Class Name: Book
 * Description: This program solution the Assignment2 task. 
 */

/**
 * this class include constructor, general method
 * including getters,setters, toString(),equals()
 *
 */
public class Book {
	private String title;
	private String author;
	private String publicationDate;
	private String isbnNumber;


	/**
	 * constructor of Book
	 * @param title
	 * @param author
	 * @param publicationDate
	 * @param isbnNumber
	 */
	public Book(String title, String author, String publicationDate, String isbnNumber) {

		this.title = title;
		this.author = author;
		this.publicationDate = publicationDate;
		this.isbnNumber = isbnNumber;
	}
	/**
	 * get the book author
	 * @return String book author
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * set the book title
	 * @param title book title
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * get the book author
	 * @return String book author
	 */
	public String getAuthor() {
		return author;
	}
	/**
	 * set the book author
	 * @param author book author
	 */
	public void setAuthor(String author) {
		this.author = author;
	}

	/**
	 * get the book date
	 * @return
	 */
	public String getPublicationDate() {
		return publicationDate;
	}

	/**
	 * set the book date
	 * @param publicationDate
	 */
	public void setPublicationDate(String publicationDate) {
		this.publicationDate = publicationDate;
	}

	/**
	 * get book isbnnumber
	 * @return
	 */
	public String getIsbnNumber() {
		return isbnNumber;
	}

	/**
	 * set book isbnnumber
	 * @param isbnNumber
	 */
	public void setIsbnNumber(String isbnNumber) {

		this.isbnNumber = isbnNumber;
	}

	/**
	 *override toString() method
	 *@return String with book information 
	 */
	public String toString() {
		return ("\n*************Title: " + title 
				+ "\n*************Author: " + author
				+ "\n*************Publication Year: " + publicationDate
				+ "\n*************ISBN: " 
				+ isbnNumber + "\n ");
	}


	/**
	 *override the equals method
	 *to check if the two object are equal
	 */
	@Override
	public boolean equals(Object o) {
		if(o == null && (! (o instanceof Book))) {
			return false;
		}
		Book b = (Book) o;
		if((getTitle().equals(b.getTitle())) 
				&& (getAuthor().equals(b.getAuthor())) 
				&& (getIsbnNumber().equals(b.getIsbnNumber()))
				&& (getPublicationDate().equals(b.getPublicationDate()))) {
			return true;
		}

		return false;
	}



}
