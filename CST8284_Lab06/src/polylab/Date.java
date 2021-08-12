
package polylab;
/*
 * class name: CST8284
 * Student: Jie Ke
 * Due date: July 25
 * Class name:Date
 * 
 */


// THIS IS LAB 6 -  Date.java 
//Date class declaration.

public class Date {

	private int month; // 1-12
	private int year; // any year


	//constructor: confirm proper value for month given the year
	public Date(int month, int year) {
		// check if month in range
		if (month <= 0 || month > 12) {
			throw new IllegalArgumentException(
					"month (" + month + ") must be 1-12");
		}

		this.month = month;
		this.year = year;

		System.out.printf(
				"Date object constructor for date %s%n", this);
	}





	/**
	 * @return the month
	 */
	public int getMonth() {
		return month;
	}

	/**
	 * @param month the month to set
	 */
	public void setMonth(int month) {
		this.month = month;
	}

	/**
	 * @return the year
	 */
	public int getYear() {
		return year;
	}

	/**
	 * @param year the year to set
	 */
	public void setYear(int year) {
		this.year = year;
	} 



	@Override
	public String toString() {
		return String.format(month + "/" +  year);
	}



}

