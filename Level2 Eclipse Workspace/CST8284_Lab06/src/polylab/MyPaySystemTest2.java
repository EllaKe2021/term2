package polylab;

import java.util.Scanner;

public class MyPaySystemTest2 {
	private static Programmer[] programmer;
	
public static void main(String[] args) {
 // create subclass objects
 SalariedProgrammer salariedProgrammer = 
    new SalariedProgrammer(
    "Emmanuel", "Okoro", "123-11-4567", 6, 1992, 500.00);
 HourlyProgrammer hourlyProgrammer = 
    new HourlyProgrammer(
    "Mary", "Cheng", "890-22-1234", 12, 1981, 16.75, 40);
 CommissionProgrammer commissionProgrammer = 
    new CommissionProgrammer(
    "Martha", "Peter", "567-33-8901", 9, 1983, 23000, .06);
 BasePlusCommissionProgrammer basePlusCommissionProgrammer = 
    new BasePlusCommissionProgrammer(
    "John", "Mark", "234-44-5678", 3, 1978, 9000, .04, 300.00);
 
 ActionProgrammer actionProgrammer =
		 new ActionProgrammer (
			"Jie", "Ke", "123-45-6789",  1, 1999, 100.00, 200.00);

 System.out.println("Programmers are processed individually:\n");
 
 System.out.printf("%s\n%s: $%,.2f\n\n", 
    salariedProgrammer, "earned", salariedProgrammer.earnings());
 System.out.printf("%s\n%s: $%,.2f\n\n",
    hourlyProgrammer, "earned", hourlyProgrammer.earnings());
 System.out.printf("%s\n%s: $%,.2f\n\n",
    commissionProgrammer, "earned", commissionProgrammer.earnings());
 System.out.printf("%s\n%s: $%,.2f\n\n", 
    basePlusCommissionProgrammer, 
    "earned", basePlusCommissionProgrammer.earnings());
 
 System.out.printf("%s\n%s: $%,.2f\n\n", 
	actionProgrammer, "earned", actionProgrammer.earnings());

 /** create and initialize the programmer array */

 
 // TO DO: COMPLETE THIS PORTION. INSERT YOUR OWN CODE: 
   //create the Programmer array elements as required. 
   // Hint: How many elements array do you need to create? DO SO HERE!!!
   
   //START
   //  INSERT CODE
 programmer = new Programmer[5];
 programmer[0] = salariedProgrammer;
 programmer[1] = hourlyProgrammer;
 programmer[2] = commissionProgrammer;
 programmer[3] = basePlusCommissionProgrammer;
 programmer[4] = actionProgrammer;

   //END

   
   //IMPLEMENT THE USE OF A SCANNER TO GET THE CURRENT MONTH. COMPLETE THIS PORTION!!!! 
   //START 
	   Scanner input = new Scanner(System.in);
	   System.out.println("Enter the current month (1 - 12): ");
	   int dateMonth = -1;

	   //END


	 // TO DO: GET AND VALIDATE THE CURRENT MONTH. COMPLETE THIS PORTION!!!! 
	   
	   // START

	   while(true) { 
		   if(!input.hasNextInt()) {
			   System.out.println("Please enter the valid month: ");
			   input.nextLine();
		   }else if(input.hasNextInt()) {
			   dateMonth = input.nextInt();

			   break;
		   }
		   
	   }
   // END


 System.out.println("Programmers processed polymorphically:\n");
 
 // generically process each element in array
 for (Programmer currentProgrammer : programmer) {
    System.out.println(currentProgrammer); // invokes toString

    // determine whether element is a BasePlusCommissionProgrammer
    if (currentProgrammer instanceof BasePlusCommissionProgrammer) {
       // downcast Programmer reference to 
       // BasePlusCommissionProgrammer reference
       BasePlusCommissionProgrammer programmers = 
          (BasePlusCommissionProgrammer) currentProgrammer;

       double oldBaseSalary = programmers.getBaseSalary();
       programmers.setBaseSalary(1.10 * oldBaseSalary);
       System.out.printf(
          "new base salary with 10%% increase is: $%,.2f\n",
          programmers.getBaseSalary());
    }

    // TO DO: COMPLETE THIS PORTION: if this is the month of the programmer's birthday, add $500 to his salary
    // otherwise just state what this programmer currently earned.
    if(dateMonth == currentProgrammer.getBirthDate().getMonth()) {
    	 
    	    	  System.out.print("earned: $" + currentProgrammer.earnings() + " plus $500.00 birthday bonus\n\n");
    	      }
    	      else {
    	    	 System.out.print("earned: $" + currentProgrammer.earnings() +"\n\n");
    		}
    //START
      // INSERT CODE
      // END
 }

 // get type name of each object in programmers array
 for (int j = 0; j < programmer.length; j++) {
    System.out.printf("Programmer %d is a %s\n", j, 
       programmer[j].getClass().getName()); 
 }
}
}
