package cst8284.assignment3;

import java.io.IOException;

/**
 * Class name: CST8284_300
 * Student: Jie Ke
 * Due Date: Aug 12, 2021
 * Description: Solution assignment3
 * 
 */
/**
 * This class demonstrates the exception's order
 * a compilation error will be caught earlier 
 * @author JieKe
 *
 */
public class SolutionFour {
	/**
	 * Start the program
	 */
	public static void main(String[] args) {
		/**
		 * Catch the exception in order
		 */
		try {
			Exception exception = new Exception("Exception type is exception.");
			IOException ioException = new IOException();

			throw exception;

		}catch (IOException e) {
			System.out.println("The IOException is caught");
			e.printStackTrace();
		}catch (Exception e) {
			System.out.println("The Exception is caught");
			e.printStackTrace();
		}		


	}

}	



