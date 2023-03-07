package Payilagam;
import java.util.Scanner;
public class Xpattern {
   public static void main(String[] args) {
	   Scanner x=new Scanner(System.in);
	   System.out.println("Enter how many rows you want:");
	   byte row=x.nextByte();
	for(int i=1;i<=row;i++){
		for(int j=1;j<=row;j++){
		   if(i==j||j==(row+1)-i){
			   System.out.print("* ");
		   }else{
			   System.out.print("0 "); }
		}
		System.out.println(" ");
	}
  }
}
