import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] nList = new int[10];

		int sum = 0;
		int min = Integer.MAX_VALUE;
		int tmp = min;
		for (int i = 0; i < 10; i++) {
			nList[i] = sc.nextInt();
			sum += nList[i];

			// 차이가 가장적은걸 넣기
			min = Math.min(min, Math.abs(100 - sum));
			if (min == tmp) {
				if (Math.abs(100 - sum + nList[i]) == Math.abs(100 - sum)) {
					System.out.println(sum);
					return;
				}
				System.out.println(sum - nList[i]);
				return;
			}
			tmp = min;
		}
		System.out.println(sum);

	}
}
