package cst8284.assignment2.test;

import static org.junit.Assert.*;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import cst8284.assignment2.*;
/**
 * Class Name: CST8284_21S_301
 * @author JieKe
 * Date: July 18, 2021
 * Class Name: BookTest
 * Description: This program solution the Assignment2 task. 
 */

/**
 * jUnit test for book class
 *
 */
public class BookTest {
	private final String DEFAULT_ISBN = "1234567890";
	private final String DEFAULT_TITLE = "Harry Potter";
	private final String DEFAULT_AUTHOR = "J K Rowing";
	private final String DEFAULT_YEAR = "2000";


	private final String OTHER_ISBN = "9876543210";
	private final String OTHER_TITLE = "The Hunger Games";
	private final String OTHER_AUTHOR = "Suzanne Collins";
	private final String OTHER_YEAR = "1962";
	Book book1;
	Book book2;
	Book book3;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		book1 = new Book(DEFAULT_TITLE, DEFAULT_AUTHOR, DEFAULT_YEAR, DEFAULT_ISBN);
		book2 = new Book(OTHER_TITLE, OTHER_AUTHOR, OTHER_YEAR, OTHER_ISBN);
	}

	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test the constructor 
	 */
	@Test
	public void testBook_True() {
		String isbn = book1.getIsbnNumber();
		String title = book1.getTitle();
		String author = book1.getAuthor();
		String date = book1.getPublicationDate();
		assertTrue(isbn.equals(DEFAULT_ISBN) && title.equals(DEFAULT_TITLE)
				&& author.equals(DEFAULT_AUTHOR) && date.equals(DEFAULT_YEAR));
	}

	/**
	 * Test the constructor 
	 */
	@Test
	public void testBook_False() {
		String isbn = book1.getIsbnNumber();
		String title = book1.getTitle();
		String author = book1.getAuthor();
		String date = book1.getPublicationDate();
		assertFalse(isbn.equals(OTHER_ISBN) && title.equals(OTHER_TITLE)
				&& author.equals(OTHER_AUTHOR) && date.equals(OTHER_YEAR));;
	}

	/**
	 * Test getTitle method 
	 */
	@Test
	public void testGetTitle_True() {
		String title = book1.getTitle();
		assertTrue(title.equals(DEFAULT_TITLE));
	}

	/**
	 * Test getTitle method 
	 */
	@Test
	public void testGetTitle_False() {
		String title = book1.getTitle();
		assertFalse(title.equals(OTHER_TITLE));
	}

	/**
	 * Test setTitle method 
	 */
	@Test
	public void testSetTitle_True() {
		book1.setTitle(DEFAULT_TITLE);
		assertTrue(book1.getTitle().equals(DEFAULT_TITLE));
	}

	/**
	 * Test setTitle method 
	 */
	@Test
	public void testSetTitle_False() {
		book1.setTitle(DEFAULT_TITLE);
		assertFalse(book1.getTitle().equals(OTHER_TITLE));
	}

	/**
	 * Test getAuthor method 
	 */
	@Test
	public void testGetAuthor_True() {
		String author = book1.getAuthor();
		assertTrue(author.equals(DEFAULT_AUTHOR));
	}

	/**
	 * Test getAuthor method 
	 */
	@Test
	public void testGetAuthor_False() {
		String author = book1.getAuthor();
		assertFalse(author.equals(OTHER_AUTHOR));
	}

	/**
	 * Test setAuthor method 
	 */
	@Test
	public void testSetAuthor_True() {
		book1.setAuthor(DEFAULT_AUTHOR);
		assertTrue(book1.getAuthor().equals(DEFAULT_AUTHOR));
	}

	/**
	 * Test setAuthor method 
	 */
	@Test
	public void testSetAuthor_False() {
		book1.setAuthor(DEFAULT_AUTHOR);
		assertFalse(book1.getAuthor().equals(OTHER_AUTHOR));
	}

	/**
	 * Test getPublicationDate method 
	 */
	@Test
	public void testGetPublicationDate_True() {
		String date = book1.getPublicationDate();
		assertTrue(date.equals(DEFAULT_YEAR));
	}

	/**
	 * Test getPublicationDate method 
	 */
	@Test
	public void testGetPublicationDate_False() {
		String date = book1.getPublicationDate();
		assertFalse(date.equals(OTHER_YEAR));
	}

	/**
	 * Test setPublicationDate method 
	 */
	@Test
	public void testSetPublicationDate_True() {
		book1.setPublicationDate(DEFAULT_YEAR);
		assertTrue(book1.getPublicationDate().equals(DEFAULT_YEAR));
	}

	/**
	 * Test setPublicationDate method 
	 */
	@Test
	public void testSetPublicationDate_False() {
		book1.setPublicationDate(DEFAULT_YEAR);
		assertFalse(book1.getPublicationDate().equals(OTHER_YEAR));
	}

	/**
	 * Test getIsbnNumber method 
	 */
	@Test
	public void testGetIsbnNumber_True() {
		String isbn = book1.getIsbnNumber();
		assertTrue(isbn.equals(DEFAULT_ISBN));
	}

	/**
	 * Test getIsbnNumber method 
	 */
	@Test
	public void testGetIsbnNumber_False() {
		String isbn = book1.getIsbnNumber();
		assertFalse(isbn.equals(OTHER_ISBN));
	}

	/**
	 * Test setIsbnNumber method 
	 */
	@Test
	public void testSetIsbnNumber_True() {
		book1.setIsbnNumber(DEFAULT_ISBN);
		assertTrue(book1.getIsbnNumber().equals(DEFAULT_ISBN));
	}

	/**
	 * Test setIsbnNumber method 
	 */
	@Test
	public void testSetIsbnNumber_False() {
		book1.setIsbnNumber(DEFAULT_ISBN);
		assertFalse(book1.getIsbnNumber().equals(OTHER_ISBN));
	}

	/**
	 * Test override toString method 
	 */
	@Test
	public void testToString_True() {

		String result = "";
		result = "\n*************Title: " + book1.getTitle();
		result += "\n*************Author: " + book1.getAuthor();
		result += "\n*************Publication Year: " + book1.getPublicationDate();
		result += "\n*************ISBN: " + book1.getIsbnNumber() + "\n ";
		assertEquals(result, book1.toString());

	}

	/**
	 * Test override toString method 
	 */
	@Test
	public void testToString_False() {

		String result = "";
		result = "\n*************Title: " + book1.getTitle();
		result += "\n*************Author: " + book1.getAuthor();
		result += "\n*************Publication Year: " + book1.getPublicationDate();
		result += "\n*************ISBN: " + book1.getIsbnNumber() + "\n ";

		assertNotEquals(result, book2.toString());
	}

	/**
	 * Test override equals method 
	 */
	@Test
	public void testEqualsObject_True() {
		book3 = new Book(DEFAULT_TITLE, DEFAULT_AUTHOR, DEFAULT_YEAR, DEFAULT_ISBN);
		assertEquals(book1, book3);
	}

	/**
	 * Test override equals method 
	 */
	@Test
	public void testEqualsObject_False() {
		assertNotEquals(book1, book2);;
	}

}