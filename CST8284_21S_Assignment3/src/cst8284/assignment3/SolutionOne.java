package cst8284.assignment3;


import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Class name: CST8284_300
 * Student: Jie Ke
 * Due Date: Aug 12, 2021
 * Description: Solution assignment3
 * 
 */
/**
 * This class includes three inner class
 * will be caught their exception separately.
 * 
 * @author JieKe
 *
 */
public class SolutionOne {
	/**
	 * Start the program
	 */

	public static void main(String[] args) {
		/**
		 * ExceptionThree be caught in the catch block of type ExceptionOne
		 */
		try {
			throw new SolutionOne().new ExceptionThree();
		} catch (ExceptionOne e) {
			System.out.println("ExceptionThree went wrong with exceptionOne type");
			e.printStackTrace();
		}
		System.out.println(" ");
		/**
		 * ExceptionTwo be caught in the catch block of type ExceptionOne
		 */
		try {
			throw new SolutionOne().new ExceptionTwo();
		} catch (ExceptionOne e) {
			System.out.println("ExceptionTwo went wrong with exceptionOne type");
			e.printStackTrace();
		}
		System.out.println(" ");

		/**
		 * ExceptionOne be caught
		 */
		try {
			throw new SolutionOne().new ExceptionOne();
		} catch (ExceptionOne e) {
			System.out.println("ExceptionOne went wrong with exceptionOne type");
			e.printStackTrace();
		}
	}
	/**
	 * The inner class ExceptionOne
	 */
	public class ExceptionOne extends Exception {

	}
	/**
	 * The inner class ExceptionTwo
	 *
	 */
	public class ExceptionTwo extends ExceptionOne {

	}
	/**
	 * The inner class ExceptionThree
	 *
	 */
	public class ExceptionThree extends ExceptionTwo {

	}
}
