package cst8284.assignment3;
/**
 * Class name: CST8284_300
 * @author JieKe
 * Due Date: Aug 12, 2021
 * Description: Solution assignment3
 * 
 */


import java.io.FileInputStream;
import java.io.IOException;
/**
 * This class demonstrates the use of the catch block 
 * using catch(Exception exception) 
 * includes four blocks
 */
public class SolutionTwo {
	/**
	 * Start the program
	 */
	public static void main(String[] args) {
		/**
		 *Exception type of ExceptionBlue
		 */
		try {
			throw new SolutionTwo().new ExceptionYellow();
		}
		catch (ExceptionYellow e) {			
			System.out.println("ExceptionYellow was caught.");
			e.printStackTrace();
		}
		System.out.println(" ");

		/**
		 *Exception type of ExceptionYellow
		 */ 
		try {
			throw new SolutionTwo().new ExceptionBlue();
		} catch (ExceptionBlue e) {
			System.out.println("ExceptionBlue was caught");
			e.printStackTrace();
		}
		System.out.println(" ");

		/**
		 * Exception type of NullPointerException
		 */
		String str = null;
		try {
			System.out.println(str.length());
		} catch (NullPointerException e) {
			System.err.printf("This is a: %s%n","NullPointerException");
			System.out.println("The caught exception is: " + e.getMessage());
			e.printStackTrace();
		}
		System.out.println(" ");
		/**
		 * Exception type of IOException
		 * cited from https://blog.csdn.net/cunchi4221/article/details/107472112
		 */ 
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("data.txt");
			// code to process the file
			fis.close();
		} catch (IOException e) {
			System.out.println("This is an IOException.");
			e.printStackTrace();
		}

	}
	/**
	 * the inner class ExceptionBlue
	 *
	 */
	public class ExceptionBlue extends Exception {

	}
	/**
	 * the inner class ExceptionYellow
	 *
	 */
	public class ExceptionYellow extends Exception {

	}

}

