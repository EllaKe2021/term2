package cst8284.assignment3;
/**
 * Class name: CST8284_300
 * Student: Jie Ke
 * Due Date: Aug 12, 2021
 * Description: Solution assignment3
 * 
 */
/**
 * This class demonstrates the rethrowing of an exception process. 
 * 
 */
public class SolutionThree {
	/**
	 * Start the program
	 */
	public static void main(String[] args){
		/**
		 * main method give the solution of exception 
		 */
		try {
			courseStarting();
		} catch (Exception e) {
			System.out.println("Rethrowing an exception test.");
			e.getMessage();
			e.printStackTrace() ;
		}finally {
			System.out.println("Solution of the exception");
		}
	}
	/**
	 *  throw the exception to courseStarting() method
	 * @throws Exception
	 */
	static void courseEnding() throws Exception{
		/*When I throw a exception I can provide my own message string.*/
		throw new Exception("This is a exception I want to throw to courseStarting() method.");
	}
	/* call courseEnding() method, then throws the exception to main method*/
	static void  courseStarting() throws Exception{		
		courseEnding();
	}
}	




