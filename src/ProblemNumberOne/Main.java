package ProblemNumberOne;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	
		char c;
		
		    float annualIncomeTax = 0;
			float annualIncome = 0;
			float netIncome = 0;
			
			do {
			//Ask the user
		System.out.print("FullName: ");
		String name = scan.next();
		
		System.out.print("Civil Status [Single or Married]: ");
		String civStatus = scan.next();	
		
		System.out.print("Gross monthly income: ");
		float montIncome = scan.nextFloat();
		//
		
		annualIncome = montIncome * 13;
		
		//Getting the Annual Income Tax
		if(annualIncome > 250000 && annualIncome <= 400000) {
			annualIncomeTax = (float) (30000 + (annualIncome - 400000)* .20);
			netIncome = annualIncome - annualIncomeTax;
		}
		else if (annualIncome > 400000 && annualIncome <= 800000){
			annualIncomeTax =  (float)  (30000 + (annualIncome - 400000) * .25);
			netIncome = annualIncome - annualIncomeTax;
		}
		else if(annualIncome > 800000 && annualIncome <= 2000000) {
			annualIncomeTax = (float) (130000 + (annualIncome - 800000) * .30);
			netIncome = annualIncome - annualIncomeTax;
		}
		
		else if(annualIncome > 2000000 && annualIncome <= 8000000) {
			annualIncomeTax = (float) (490000 + (annualIncome - 2000000) * .32);	
			netIncome = annualIncome - annualIncomeTax;
		}
		else if(annualIncome > 8000000) { 
			annualIncomeTax = (float) (2410000 + (annualIncome - 8000000) * .35);
			netIncome = annualIncome - annualIncomeTax;
		}
		
	  //

		//Display Information
		System.out.println(" ");
		System.out.println("BIR TRAIN tax Calculator");
		System.out.println("Fullname: " + name);
		System.out.println("Civil Status: " + civStatus);
		System.out.println("Gross monthly income: " + montIncome);
		System.out.println("Calculating...");
		System.out.println(" ");
		System.out.println("Hi, " + name);
		System.out.println(" ");
		System.out.println("Here are the details of your income and tax rate based on the details that you provided: ");
		System.out.println(" ");
		System.out.println("Gross annual income: " + annualIncome);
		System.out.println("Annual Income Tax: " + annualIncomeTax);
		System.out.println("Net Annual Income: " + netIncome);
		//
		
		//Ask the user to try again
		System.out.println(" ");
		 System.out.println(" Do you want to try again? Y/N?: ");
	     c = scan.next().charAt(0);
		//
	     
	     if(c == 'n' || c == 'N') {
		System.out.println("Thank You," + name);
	     }
	    
	     else if(Character.isDigit(c)) {	
	    	 System.out.println("It is a number.");
	     }
	    
	   
		}while(c == 'y' || c == 'Y');
	}
}		

