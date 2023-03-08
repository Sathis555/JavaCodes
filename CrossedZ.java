package payilagam;

import java.util.Scanner;

public class CrossedZ {

	public static void main(String[] args) {
		 Scanner sc =new Scanner(System.in);
			System.out.println("Enter the size of the box(add numbers recommed for perfect shape)");
			byte max=sc.nextByte();
			if(max%2==0){max +=1;}
			for(byte i=0;i<max;i++){
				for(byte j=0;j<max;j++){
				if(i==0&j<max&j>(max/2)||j==max-1&i>(max/2)||i==max-1&j<(max/2)||i<(max/2)&j==0||i==(max/2)&j<max||i<max&j==(max/2)){
					System.out.print("* ");
				}else{
					System.out.print("  ");
				}	
					}
				System.out.println("");
				}
	}

}
