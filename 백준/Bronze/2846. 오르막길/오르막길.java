import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] nList = new int[N];

		for (int i = 0; i < N; i++) {
			nList[i] = sc.nextInt();
		}

		int max = 0;

		for (int i = 0; i < N - 1; i++) {
			int height = 0;

			for (int j = i; j < N - 1; j++) {
				if (nList[j] < nList[j + 1])
					height = nList[j + 1] - nList[i];
				else
					break;
			}
			max = Math.max(max, height);
		}

		System.out.println(max);

	}
}
