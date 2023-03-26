package payilagam;
import java.util.Scanner;

public class PrimeNumbers {
	int primeNumbersUserWants;
	int TotalPrimeNumbersPrinted=0;
	public static void main(String[] args) {
		    PrimeNumbers user1=new PrimeNumbers();
		    System.out.println("Please enter how many Prime numbers you want to print ");
		    Scanner sc=new Scanner(System.in);
		    user1.primeNumbersUserWants=sc.nextInt();
		    user1.printPrimeNumber();
		    user1.printPrimeNumber();
		    System.out.println("The Programme ended");
	}
	void printPrimeNumber(){
		
	         for(int numbersToBeChecked=1;TotalPrimeNumbersPrinted<primeNumbersUserWants;numbersToBeChecked++)
	         { 
	        	 int count=0;
	        	 for(int divider=2;divider<=numbersToBeChecked/2;divider++){
	        		 if(numbersToBeChecked%divider==0){
	        			 count++;
	        		 }
	        		 
	        	 }
	        	 if(count==0){
	        		 System.out.println(numbersToBeChecked);
	        		 TotalPrimeNumbersPrinted +=1;
	        	 }
	         }
	        TotalPrimeNumbersPrinted=0;
	        primeNumbersUserWants=0;
		}

}
