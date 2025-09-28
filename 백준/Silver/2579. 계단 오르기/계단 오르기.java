
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] s = new int[N + 1]; // 계단 점수
		for (int i = 1; i < N + 1; i++) {
			s[i] = sc.nextInt();
		} // 입력

		int[] dp = new int[N + 1]; // 최대값 저장
		
		dp[1] = s[1];
		if (N>1) dp[2] = s[1] + s[2];
		if (N>2) dp[3] = Math.max(s[1] + s[3], s[2] + s[3]);

		for (int i = 4; i < N + 1; i++) {
			dp[i] = Math.max(dp[i - 2] + s[i], dp[i - 3] + s[i - 1] + s[i]);
		}

		System.out.println(dp[N]);

	}
}
