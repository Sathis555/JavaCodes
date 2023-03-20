package Payilagam;
import java.util.Scanner;
public class DecimalToBinaryConversion {
	public static void main(String[] args) {
		Scanner number=new Scanner(System.in);
		System.out.println("Enter any value do you want");
		long value=number.nextLong();
		long givenNumber=value;
		String binaryvalue=" ";
		while(givenNumber>0){
			binaryvalue =(givenNumber%2) + binaryvalue + " ";
			givenNumber =givenNumber/2;
		}
	System.out.println(binaryvalue);
	}
}
