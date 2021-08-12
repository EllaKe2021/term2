package cst8284.lab07;
/*
 * Class Name: CST8284_300
 * Student Name: Jie Ke
 * Class Name: lab 7
 * Due Date: Aug 4, 2021
 */


// LAB 7: PaymeInterfaceTest.java

//This is the test for interface Payme.

public class PaymeInterfaceTest  {

public static void main(String[] args) {
	
 //TO DO: IN THIS PORTION OF THE CODE, SEVERAL CHANGES SHOULD BE MADE:
// CREATE SIX-ELEMENTS Payme array HERE

	
 //START CODE 
	Invoice invoice1 = new Invoice("22776", "steering", 3, 300);
	Invoice invoice2 = new Invoice("33442", "cruise", 5, 90.99);
	SalariedProgrammer salariedProgrammer = 
			    new SalariedProgrammer(
			    "Chioma", "Chidimma", "345-67-8901",320);
	HourlyProgrammer hourlyProgrammer = 
			    new HourlyProgrammer(
			    "Cheng", "Lui", "234-56-7890", 18.95, 40);
	CommissionProgrammer commissionProgrammer = 
			    new CommissionProgrammer(
			    "Martha", "Goodman", "123-45-6789", 16500.00, 0.44);
	BasePlusCommissionProgrammer basePlusCommissionProgrammer = 
			    new BasePlusCommissionProgrammer(
			    "Jie", "Ke", "102-34-5678", 1200, 0.04, 720);
//END CODE
 

// TO DO: POULATE THE ARRAY YOU CREATED WITH OBJECTS THAT IMPLEMENT Payable
//CHECK THE OUTPUT FILE AND REUSE EXACTLY THE DETAILS PROVIDED SUCH AS FIRST NAME
// LAST NAME, SOCIAL INSURANCE NUMBER, ETC.

 // START CODE
	Payme[] paymeObjects;
	paymeObjects = new Payme[6];
	paymeObjects[0] = invoice1;
	paymeObjects[1] = invoice2;
	
	paymeObjects[2] = salariedProgrammer;
	paymeObjects[3] = hourlyProgrammer;
	paymeObjects[4] = commissionProgrammer;
	paymeObjects[5] = basePlusCommissionProgrammer;
// END CODE


 System.out.println(
    "Payment for Invoices and Programmers are processed polymorphically:\n"); 

 // generically process each element in array paymeObjects
 
 for (Payme currentPayme : paymeObjects) {
    // output currentPayme and its appropriate payment amount
    System.out.printf("%s \n", currentPayme.toString()); 
       
    if (currentPayme instanceof BasePlusCommissionProgrammer) {
       // downcast Payme reference to 
       // BasePlusCommissioProgrammer reference
       BasePlusCommissionProgrammer programmer = 
          (BasePlusCommissionProgrammer) currentPayme;

       double oldBaseSalary = programmer.getBaseSalary();
       programmer.setBaseSalary(1.10 * oldBaseSalary);
       System.out.printf(
          "new base salary with 10%% increase is: $%,.2f\n",
          programmer.getBaseSalary());
    } 
   

// TO DO: INSERT YOUR PRINT STATEMENT HERE: ENSURE THAT YOUR 
// OUTPUT FOLLOWS THE OUTPUT SAMPLE PROVIDED

// START CODE 
       System.out.printf("payment due: $%,.2f\n\n"
    		   ,currentPayme.getPaymentAmount());
// END CODE

 }
}
}


