import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] nList = new int[9];
		int sum = 0;

		for (int i = 0; i < 9; i++) {
			nList[i] = sc.nextInt();
			sum += nList[i];
		}

		int a = 0;
		int b = 0;

		for (int i = 0; i < 8; i++) {
			for (int j = i + 1; j < 9; j++) {

				if (sum - nList[i] - nList[j] == 100) {
					a = nList[i];
					b = nList[j];

				}
			}
		}

		Arrays.sort(nList);

		for (int num : nList) {
			if (num != a && num != b)
				System.out.println(num);
		}
	}
}
