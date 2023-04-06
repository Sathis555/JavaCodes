import java.util.Scanner;

public class NumToWords {

	public static void main(String[] args) {
		convert();

	}

	public static void convert() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter any number");
		int input = sc.nextInt();
		int ans = input;
		int D1=ans%10;//999
		int a=ans/10;
		int D2=a%10;
		int b=a/10;
		int D3=b%10;
		int c=b/10;
		int D4=c%10;
		int d=c/10;
		int D5=d%10;
		int e=d/10;
		int D6=e%10;
		
		String[] ones = { "", "One", "Two", "Three", "Four", "Five", "Six",
				"Seven", "Eight", "Nine","ten", "eleven", "twelve", "thirteen", "fourteen", "Fifteen",
				"Sisteen", "Seventeen", "Eighteen", "Nineteen" };
		
		String[] tens = { "", "", "Twenty", "Thrty", "Fourty", "Fifty",
				"Sixty", "Seventy", "Eighty", "Ninety" };
		String[] hundres={"","One hundred", "Two hundred", "Three hundred", "Four hundred", "Five hundred", "Six hundred",
				"Seven hundred", "Eight hundred", "Nine hundred"};
		String[] thousands={"","One thousand", "Two thousand", "Three thousand", "Four thousand", "Five thousand", "Six thousand",
				"Seven thousand", "Eight thousand", "Nine thousand"};
        String[] lacks={"",ones[1]+" lack",ones[2]+" lack",ones[3]+" lack",ones[4]+" lack",ones[5]+" lack",ones[6]+" lack",ones[7]+" lack",ones[8]+" lack",ones[9]+" lack"};
		if (ans < 20) {
			System.out.println(ones[ans]);
			}
		else if(ans > 20){
			System.out.println(lacks[D5]+" "+thousands[D4]+" "+hundres[D3]+" "+ tens[D2]+" "+ones[D1]);
		}

		
	}	
}     
