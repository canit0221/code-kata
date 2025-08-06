
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int r = sc.nextInt();
		int c = sc.nextInt();
		int min = 20; // 최소거리 저장
		char[][] map = new char[11][11];
		int[] br = new int[11];

		for (int i = 1; i < 11; i++) {
			String str = sc.next();
			int cnt = 0;
			for (int j = 1; j < 11; j++) {
				map[i][j] = str.charAt(j - 1);
				if (map[i][j] == 'o')
					cnt++;
			}
			if (cnt == 0)
				br[i] = 1;

		}

		for (int i = 1; i < 11; i++) {
			if (br[i] == 1) { // 이미 검사 통과한 행에 대해서만

				for (int j = 1; j < 11; j++) {
					int cnt = 0; // o가 나왔는지 체크
					if (map[i][j] == 'x') {
						for (int k = 1; k < 11; k++) { //열에 대해서 검사
							if (map[k][j] == 'o')
								cnt++;
						}
						if (cnt == 0) {
							int tmp = Math.abs(i - r) + Math.abs(j - c); // 거리만 저장
							min = Math.min(min, tmp);
						}
					}
				}
			}
		}
		System.out.println(min);
	}
}
