
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	static int N; // N
	static char[][] grid; // grid
	static boolean[][] visited; //방문배열
	static int[] dr = { -1, 1, 0, 0 };
	static int[] dc = { 0, 0, -1, 1 };// 상하좌우 델타

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

			N = sc.nextInt(); // 변의 크기
			grid = new char[N][N]; // 그리드 초기화

			for (int i = 0; i < N; i++) {
				String str = sc.next();
				for (int j = 0; j < N; j++) {
					grid[i][j] = str.charAt(j);
				}
			} // 입력

			int cnt = 0;// 일반인 구역수
			visited = new boolean[N][N]; // 방문배열 초기화
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					if (!visited[i][j]) {
						bfs(i, j); // 처음 방문한 곳이라면 들어가서 bfs로 인접한곳 모두 방문처리하기
						cnt++; // 새로운 구역카운트
					}
				}
			}

			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					if (grid[i][j] == 'G') // G를 R로 바꾸기
						grid[i][j] = 'R';
				}
			} // 적녹색약 적용

			int cntRG = 0; // 적록색약인 구역수
			visited = new boolean[N][N];// 방문배열 초기화
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					if (!visited[i][j]) {
						bfs(i, j); // 처음 방문한 곳이라면 들어가서 bfs로 인접한곳 모두 방문처리하기
						cntRG++; // 새로운 구역카운트
					}
				}
			}

			System.out.println(cnt + " " + cntRG); // 출력

	}// main

	static void bfs(int sr, int sc) {
		Queue<int[]> q = new LinkedList<>(); // 큐 초기화
		q.add(new int[] { sr, sc }); // 시작점 넣기
		visited[sr][sc] = true; // 시작점 방문처리

		while (!q.isEmpty()) { // 큐가 빌때까지 반복
			int[] curr = q.poll(); // 큐에서 꺼내기
			
			for (int k = 0; k < 4; k++) { // 사방탐색
				int nr = curr[0] + dr[k];
				int nc = curr[1] + dc[k];

				if (nr < 0 || nc < 0 || nr >= N || nc >= N) // 경계,인덱스 유효검사
					continue;

				if (!visited[nr][nc] && grid[sr][sc] == grid[nr][nc]) { // 방문한적이 없고 시작점과 동일한 색깔이라면
					visited[nr][nc] = true; // 방문처리
					q.add(new int[] { nr, nc }); // 큐에 담아주기
				}
			}
		}
	} // bfs

}
