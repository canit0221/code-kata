
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	static int N, M;
	static int[][] map;
	static boolean[][][] visited;
	static int[] dr = { -1, 1, 0, 0 };
	static int[] dc = { 0, 0, -1, 1 };
	static int ans;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		map = new int[N][M];
		for (int i = 0; i < N; i++) {
			String str = sc.next();
			for (int j = 0; j < M; j++) {
				map[i][j] = str.charAt(j) - '0';
			}
		}
		visited = new boolean[2][N][M];
		ans = -1;
		bfs();

		System.out.println(ans);

	}

	static void bfs() {
		Queue<int[]> q = new LinkedList<>();
		q.add(new int[] { 0, 0, 0, 0 });
		visited[0][0][0] = true;

		while (!q.isEmpty()) {
			int[] curr = q.poll();
			int r = curr[0];
			int c = curr[1];
			int d = curr[2];
			int b = curr[3];

			if (r == N - 1 && c == M - 1) {
				ans = d+1;
				return;
			}
			for (int k = 0; k < 4; k++) {
				int nr = r + dr[k];
				int nc = c + dc[k];

				if (nr < 0 || nc < 0 || nr >= N || nc >= M)
					continue;

				if (!visited[b][nr][nc] && map[nr][nc] == 0) {
					q.add(new int[] { nr, nc, d + 1, b });
					visited[b][nr][nc] = true;
				}//일반이동
				
				if (!visited[1][nr][nc] &&map[nr][nc] == 1 && b == 0) {
					q.add(new int[] { nr, nc, d + 1, 1 });
					visited[1][nr][nc] = true;
				}//벽깨기

			}
		}
	}
}
