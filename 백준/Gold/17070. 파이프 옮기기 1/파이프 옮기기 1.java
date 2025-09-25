
import java.util.Scanner;

public class Main {
	static int N, cnt;
	static int[][] house;
	static int[] dr = { 0, 1, 1 }; // 오른쪽, 오른쪽 아래 대각선 방향, 아래
	static int[] dc = { 1, 1, 0 };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();// 집의 크기
		house = new int[N + 1][N + 1];

		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= N; j++) {
				house[i][j] = sc.nextInt();
			}
		}

		// 1,1 부터 시작해서 N, N 로 도달하면 종료
		/// dfs로해서 NN도달 하면 카운트 올리면 되지않을까
		cnt = 0;
		dfs(1, 2, 0);

		System.out.println(cnt);

	}

	static void dfs(int r, int c, int d) {
		if (r == N && c == N) {
			cnt++;
			return;
		}

		if (d == 0) { // 가로
			for (int k = 0; k < 2; k++) {
				int nr = r + dr[k];
				int nc = c + dc[k];

				if (k == 0) { // 오른쪽
					if (nr > N || nc > N)
						continue;
					if (house[nr][nc] == 0)
						dfs(nr, nc, k);
				} else if (k == 1) { // 오른쪽 아래
					if (nr > N || nc > N)
						continue;
					if (house[nr][nc] == 0 && house[nr - 1][nc] == 0 && house[nr][nc - 1] == 0)
						dfs(nr, nc, k);
				}
			}
		} else if (d == 2) { // 세로
			for (int k = 1; k < 3; k++) {
				int nr = r + dr[k];
				int nc = c + dc[k];

				if (k == 2) { // 아래
					if (nr > N || nc > N)
						continue;
					if (house[nr][nc] == 0)
						dfs(nr, nc, k);
				} else if (k == 1) { // 오른쪽 아래
					if (nr > N || nc > N)
						continue;
					if (house[nr][nc] == 0 && house[nr - 1][nc] == 0 && house[nr][nc - 1] == 0)
						dfs(nr, nc, k);
				}
			}
		} else { // 대각선
			for (int k = 0; k < 3; k++) {
				int nr = r + dr[k];
				int nc = c + dc[k];

				if (k == 0) { // 오른쪽
					if (nr > N || nc > N)
						continue;
					if (house[nr][nc] == 0)
						dfs(nr, nc, k);
				}

				else if (k == 1) { // 오른쪽 아래
					if (nr > N || nc > N)
						continue;
					if (house[nr][nc] == 0 && house[nr - 1][nc] == 0 && house[nr][nc - 1] == 0)
						dfs(nr, nc, k);
				}

				else if (k == 2) { // 아래
					if (nr > N || nc > N)
						continue;
					if (house[nr][nc] == 0)
						dfs(nr, nc, k);
				}

			}
		}
	}

}
