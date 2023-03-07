package payilagam;
import java.util.Scanner;
public class DivisibleClass {

	public static void main(String[] args) {
		System.out.println("Enter any number:");
		Scanner sc= new Scanner(System.in);
		long value=sc.nextLong();
		if(value%11==0)
		{
		 System.out.println("the given value "+value +" can divied by 11.");
		    if(value%9==0)
		     {
			        System.out.println("The given value "+value+" can divied by 9.");	
		      }else {
			         System.out.println("the given value "+value +" cannot divied by 9.");
			        }
		}else {
		 if(value%9==0){
				System.out.println("The given value "+value+" cannot divied by 11.");
				System.out.println("The given value "+value+" can divied by 9.");
			 } else{
			System.out.println("this number  cannot divisable 11 and 9");
		}
	  }
	}	
 }



