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
 * Class Name: BookLoanTest
 * Description: This program solution the Assignment2 task. 
 */

/**
 * jUnit test for bookLoan 
 *
 */
public class BookLoanTest {

	private final String DEFAULT_ISBN = "1234567890";
	private final String DEFAULT_TITLE = "Harry Potter";
	private final String DEFAULT_AUTHOR = "J K Rowing";
	private final String DEFAULT_YEAR = "2000";

	private final String OTHER_ISBN = "9876543210";
	private final String OTHER_TITLE = "The Hunger Games";
	private final String OTHER_AUTHOR = "Suzanne Collins";
	private final String OTHER_YEAR = "1962";

	private final String DEFAULT_FIRST = "Raja";
	private final String DEFAULT_LAST = "Singh";
	private final String DEFAULT_ADDRESS = "45 Wood Dr";
	private final int DEFAULT_AGE = 20;
	private final int DEFAULT_ID = 1000;

	private final String OTHER_FIRST = "Jeff";
	private final String OTHER_LAST = "Smith";
	private final String OTHER_ADDRESS = "5678 Edenval Dr";
	private final int OTHER_AGE = 30;
	private final int OTHER_ID = 2500;

	private final String DEFAULT_DUE_DATE = "2021-05-29";
	private final String OTHER_DUE_DATE = "1999-09-09";		

	Book book1;
	Book book2;		
	User user1;
	User user2;
	BookLoan loan1;
	BookLoan loan2;
	BookLoan loan3;


	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		user1 = new User(DEFAULT_ID, DEFAULT_FIRST, DEFAULT_LAST, DEFAULT_ADDRESS, DEFAULT_AGE);
		user2 = new User(OTHER_ID, OTHER_FIRST, OTHER_LAST, OTHER_ADDRESS, OTHER_AGE);

		book1 = new Book(DEFAULT_TITLE, DEFAULT_AUTHOR, DEFAULT_YEAR, DEFAULT_ISBN);
		book2 = new Book(OTHER_TITLE, OTHER_AUTHOR, OTHER_YEAR, OTHER_ISBN);

		loan1 = new BookLoan(user1, book1, DEFAULT_DUE_DATE);
		loan2 = new BookLoan(user2, book2, OTHER_DUE_DATE);
	}

	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test constructor 
	 */
	@Test
	public void testBookLoan_True() {
		User user = loan1.getUser();
		Book book = loan1.getBook();
		String dueDate = loan1.getDueDate();

		assertTrue(user.equals(user1) 
				&& book.equals(book1) 
				&& dueDate.equals(DEFAULT_DUE_DATE));
	}

	/**
	 * Test constructor 
	 */
	public void testBookLoan_Flase() {
		User user = loan1.getUser();
		Book book = loan1.getBook();
		String dueDate = loan1.getDueDate();

		assertFalse(user.equals(user2) 
				&& book.equals(book2) 
				&& dueDate.equals(OTHER_DUE_DATE));
	}

	/**
	 * Test toString method 
	 */
	@Test
	public void testToString_True() {
		String result = "";
		result =  "\n*********User name: "+ user1.getFirstName() + " " + user1.getLastName();
		result += "\n*********Title: " + book1.getTitle();
		result += "\n*********Author: " + book1.getAuthor();
		result += "\n********ISBN: " + book1.getIsbnNumber();
		result += "\n*********Due Date: " + DEFAULT_DUE_DATE + "\n";

		assertEquals(result, loan1.toString());
	}

	/**
	 * Test toString method 
	 */
	@Test
	public void testToString_False() {
		String result = "";
		result =  "\n*********User name: "+ user1.getFirstName() + " " + user1.getLastName();
		result += "\n*********Title: " + book1.getTitle();
		result += "\n*********Author: " + book1.getAuthor();
		result += "\n********ISBN: " + book1.getIsbnNumber();
		result += "\n*********Due Date: " + DEFAULT_DUE_DATE + "\n";

		assertNotEquals(result, loan2.toString());
	}

	/**
	 * Test equals method 
	 */
	@Test
	public void testEqualsObject_True() {
		loan3 = new BookLoan(user1, book1, DEFAULT_DUE_DATE);
		assertEquals(loan3, loan1);
	}

	/**
	 * Test equals method 
	 */
	@Test
	public void testEqualsObject_False() {
		assertNotEquals(loan2, loan1);
	}	

	/**
	 * Test getUser method 
	 */
	@Test
	public void testGetUser_True() {
		User user = loan1.getUser();
		assertEquals(user, user1);
	}

	/**
	 * Test getUser method 
	 */
	@Test
	public void testGetUser_False() {
		User user = loan1.getUser();
		assertNotEquals(user, user2);
	}

	/**
	 * Test setUser method 
	 */
	@Test
	public void testSetUser_True() {
		loan1.setUser(user1);
		assertEquals(loan1.getUser(), user1);
	}

	/**
	 * Test setUser method 
	 */
	@Test
	public void testSetUser_False() {
		loan1.setUser(user1);
		assertNotEquals(loan1.getUser(), user2);
	}

	/**
	 * Test getBook method 
	 */
	@Test
	public void testGetBook_True() {
		Book book = loan1.getBook();
		assertEquals(book, book1);
	}

	/**
	 * Test getBook method 
	 */
	@Test
	public void testGetBook_False() {
		Book book = loan1.getBook();
		assertNotEquals(book, book2);
	}

	/**
	 * Test setBook method 
	 */
	@Test
	public void testSetBook_True() {
		loan1.setBook(book1);
		assertEquals(loan1.getBook(), book1);
	}

	/**
	 * Test setBook method 
	 */
	@Test
	public void testSetBook_False() {
		loan1.setBook(book1);
		assertNotEquals(loan1.getBook(), book2);
	}

	/**
	 * Test getDueDate method 
	 */
	@Test
	public void testGetDueDate_True() {
		String dueDate = loan1.getDueDate();
		assertEquals(dueDate, DEFAULT_DUE_DATE);
	}

	/**
	 * Test getDueDate method 
	 */
	@Test
	public void testGetDueDate_False() {
		String dueDate = loan1.getDueDate();
		assertNotEquals(dueDate, OTHER_DUE_DATE);
	}

	/**
	 * Test setDueDate method 
	 */
	@Test
	public void testSetDueDate_True() {
		loan1.setDueDate(DEFAULT_DUE_DATE);
		assertEquals(loan1.getDueDate(), DEFAULT_DUE_DATE);
	}

	/**
	 * Test setDueDate method 
	 */
	@Test
	public void testSetDueDate_False() {
		loan1.setDueDate(DEFAULT_DUE_DATE);
		assertNotEquals(loan1.getDueDate(), OTHER_DUE_DATE);
	}

}