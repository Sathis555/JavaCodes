package payilagam;
import java.util.Scanner;
public class StringLearn {

	
	public static void main(String[] args) {
		System.out.println("Ether the number of row you want:");
		Scanner sc=new Scanner(System.in);
		int row=sc.nextInt();
		
		StringLearn pattern= new StringLearn();
	pattern.diomend(row);
	}
	public void diomend(int row){
		for(int i=0;i<=row;i++){
			for (int j=row;j>i;j--){
				System.out.print(" ");
			}
			for (int k=0;k<i;k++){
				System.out.print(" @");
			}
			System.out.println("");
		}
		
	}

}
