
import java.util.Scanner;

public class Main {
	static int N;
	static int[] o = { 2, 3, 5, 7 };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();

		for (int num : o) {
			dfs(num, 1);
		}

	}// main

	// dfs
	static void dfs(int num, int len) {
		if (len == N) {// 종료조건
			if (isP(num)) {
				System.out.println(num);
				return;
			}
		}

		for (int i = 1; i <= 9; i += 2) {
			if (isP(num * 10 + i))
				dfs(num * 10 + i, len + 1);
		}

	}

	// 소수판별
	static boolean isP(int num) {
		for (int i = 2; i <= Math.pow(num,0.5); i++) {
			if (num % i == 0) {
				return false;
			}
		}

		return true;
	}

}
