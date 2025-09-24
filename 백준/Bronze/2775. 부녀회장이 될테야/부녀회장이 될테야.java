
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		
		for (int tc = 0; tc < T; tc++) {
			int k = sc.nextInt(); // k층
			int n = sc.nextInt(); // n호

			// a층의 b호에 살려면
			// 자신의 아래(a-1)층의 1호부터 b호까지의 사람수를 합한 만큼 데려와서 살아야한다.
			// 아파트는 0층부터 있고 각층에는 1호부터 있다.
			// 0층의 i호에는 i명이 산다.

			// 0층 i호에는 각각 i명
			// 1층 i호에는 i누적합
			
			System.out.println(cal(k,n));
		}
	}

	static int cal(int k, int n) {

		if (k == 0) // 기저 조건
			return n;

		int ans = 0;
		for (int i = 1; i <= n; i++) {
			ans += cal(k - 1, i);
		}
		return ans;
	}
}
