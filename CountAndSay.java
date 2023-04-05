import java.util.Scanner;

public class CountAndSay {

	public static void main(String[] args) {
		System.out
				.println("Please enter How many nuber of rows you want to print");
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		countAndPrint(rows);

	}

	public static void countAndPrint(int n) {
		String print1 = "1";
		String temp = "";
		System.out.println(print1);
		for (int k = 0; k < n; k++) {

			int index = 0;
			while (index < print1.length()) {
				int count = 1;

				while (index < print1.length() - 1
						&& (print1.charAt(index) == print1.charAt(index + 1))) {
					count += 1;
					index += 1;
				}

				temp +=""+ count + print1.charAt(index);

				index += 1;
				count =0;
			}
			print1 = temp;
			temp="";
			System.out.println(print1);
		}

	}

}
