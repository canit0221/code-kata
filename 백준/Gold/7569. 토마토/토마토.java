
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	static int M, N, H;
	static int[][][] boxes;
	static int[] dh = { -1, 1, 0, 0, 0, 0 }; // 앞뒤, 상하좌우
	static int[] dr = { 0, 0, -1, 1, 0, 0 };
	static int[] dc = { 0, 0, 0, 0, -1, 1 };
	static List<int[]> start;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		M = sc.nextInt();
		N = sc.nextInt();
		H = sc.nextInt();
		boxes = new int[H][N][M];
		start = new ArrayList<>();

		for (int h = 0; h < H; h++) {
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < M; j++) {
					boxes[h][i][j] = sc.nextInt();
					if (boxes[h][i][j] == 1)
						start.add(new int[] { h, i, j, 0 });
				}
			}
		} // 3차원 배열 입력, 시작점 저장
		sc.close();

		int d = bfs();
		
		for (int h = 0; h < H; h++) {
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < M; j++) {
					if (boxes[h][i][j] == 0) {
						System.out.println(-1);
						return;
					}
						
				}
			}
		}
		
		System.out.println(d);

		
		

	}// main

	static int bfs() {
		Queue<int[]> q = new LinkedList<>();
		for (int i = 0; i < start.size(); i++) {
			q.add(start.get(i));
		}
		int d = 0;
		
		while(!q.isEmpty()) {
			int[] curr = q.poll();
			int ch = curr[0];
			int cr = curr[1];
			int cc = curr[2];
			d = curr[3];
			
			for(int k=0; k<6; k++) {
				int nh = ch+dh[k];
				int nr = cr+dr[k];
				int nc = cc+dc[k];
				
				if(nh<0||nr<0||nc<0||nh>=H||nr>=N||nc>=M)
					continue;
				
				if(boxes[nh][nr][nc]==0) {
					boxes[nh][nr][nc] = 1;
					q.add(new int[] {nh,nr,nc,d+1});
				}
				
			}
		}
		
		return d;
	}
}
