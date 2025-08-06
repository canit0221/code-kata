
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {
			String str = sc.next();
			int N = (int) Math.sqrt(str.length());
			char[][] strArr = new char[N][N];
			
			
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					strArr[i][j] = str.charAt((i * N) + j);
				}
			}

			char[][] ans = new char[N][N];
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					ans[i][j] = strArr[j][N-i-1];
                    System.out.print(ans[i][j]);
				}
			}
			System.out.println();
		} // 테케

	}
}
