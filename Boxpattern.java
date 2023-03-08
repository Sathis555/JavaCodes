package Payilagam;
import java.util.Scanner;
 class Boxpattern {
	 public static void main(String[] args) {
	  Scanner sc =new Scanner(System.in);
		System.out.println("Enter the size of the box");
		byte max=sc.nextByte();
		for(byte i=0;i<max;i++){
			for(byte j=0;j<max;j++){
			if(i==0&j<max||j==max-1&i<max||i==max-1&j<max||i<max&j==0){
				System.out.print("* ");
			}else{
				System.out.print("  ");
			}	
				}
			System.out.println("");
			}
    }
}  
