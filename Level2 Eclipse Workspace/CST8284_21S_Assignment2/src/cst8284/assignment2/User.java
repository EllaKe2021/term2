package cst8284.assignment2;

/**
 * Class Name: CST8284_21S_301
 * @author JieKe 
 * Date: July 18, 2021 
 * Class Name:User 
 * Description: This program solution the Assignment1 task.
 */
/**
 * this class include constructor, general method
 * including getters,setters, toString(),equals()
 *
 */
public class User {
	private static int userNextId = 1000;
	private static int userAge = 18;
	private int id;
	private String firstName;
	private String lastName;
	private String address;
	private int age;


	/**
	 * constructor of user
	 * @param id
	 * @param firstName
	 * @param lastName
	 * @param address
	 * @param age
	 */
	public User(int id, String firstName, String lastName, String address, int age) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.age = age;

	}

	/**
	 * constructor of user
	 * @param firstName
	 * @param lastName
	 * @param address
	 * @param age
	 */
	public User(String firstName, String lastName, String address, int age) {

		this(userNextId++, firstName, lastName, address, age);

	}

	/**
	 * constructor of user
	 * @param firstName
	 * @param lastName
	 * @param address
	 */
	public User(String firstName, String lastName, String address) {
		this(firstName, lastName, address, userAge);

	}

	/**
	 *override toString() method
	 *@return String with user information 
	 */
	public String toString() {
		return "\n*********User id: " + getId() 
		+ "\n*********User name: " + getFirstName() + " " + getLastName()
		+ "\n*********Age: " + getAge() 
		+ "\n*********Address: " + getAddress();

	}


	/**
	 * override the equals method
	 * to check if the two object are equal
	 */
	@Override
	public boolean equals(Object o) {
		if(o == null && (! (o instanceof User))) {
			return false;
		}
		User u = (User) o;
		if((getLastName().equals(u.getLastName())) 
				&& (getFirstName().equals(u.getFirstName())) 
				&& (getAge()==(u.getAge()))
				&& (getAddress().equals(u.getAddress()))) {
			return true;
		}

		return false;
	}

	/**
	 * get userNextId
	 * @return
	 */
	public static int getUserNextId() {
		return userNextId;
	}

	/**
	 * set userNextId
	 * @param userNextId
	 */
	public static void setUserNextId(int userNextId) {
		User.userNextId = userNextId;
	}

	/**
	 * get id
	 * @return
	 */
	public int getId() {
		return id;
	}

	/**
	 * set id
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}


	/**
	 * get firstName
	 * @return
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * set firstName
	 * @param firstName
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * get lastName
	 * @return
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * set lastName
	 * @param lastName
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * get address
	 * @return
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * set address
	 * @param address
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * get age
	 * @return
	 */
	public int getAge() {
		return age;
	}

	/**
	 * set age
	 * @param age
	 */
	public void setAge(int age) {
		this.age = age;
	}

}
