import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] numList = new int[5];

		for (int i = 0; i < 5; i++) {
			numList[i] = sc.nextInt();
		}
		int ans = 1;

		while (true) {
			int cnt = 0;
			for (int i = 0; i < 5; i++) {
				if (ans % numList[i] == 0)
					cnt++;
			}

			if (cnt >= 3) {
				System.out.println(ans);
				return;
			}
			ans++;
		}

	}
}
