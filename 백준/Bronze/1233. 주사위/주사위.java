import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int S1 = sc.nextInt();
		int S2 = sc.nextInt();
		int S3 = sc.nextInt();

		int[] sumCount = new int[S1 + S2 + S3 + 1]; // 1-based

		for (int i = 1; i <= S1; i++) {
			for (int j = 1; j <= S2; j++) {
				for (int k = 1; k <= S3; k++) {
					sumCount[i + j + k] += 1;
				}
			}
		}

		int max = 0;
		int sum = 0;
		for (int i = sumCount.length - 1; i > 0; i--) {
			if (max <= sumCount[i]) {
				sum = i;
				max = sumCount[i];
			}
		}
		System.out.println(sum);
	}
}
