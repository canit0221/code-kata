import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String isbn = sc.next();
		int sum = 0;
		int ansIdx = -1;
		for (int i = 0; i < 12; i++) {
			if (isbn.charAt(i) == '*')
				ansIdx = i;
			else {
				if (i % 2 == 0)
					sum += isbn.charAt(i) - '0';
				else
					sum += 3 * (isbn.charAt(i) - '0');
			}
		}
		int m = isbn.charAt(12) - '0';

		for (int i = 0; i <= 9; i++) {
			int tmp = sum;
			if (ansIdx % 2 == 0)
				tmp += i;
			else
				tmp += 3 * i;

			if (m == (10 - (tmp % 10)) % 10)
				System.out.println(i);
		}
	}
}
