
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[][] map = new int[10][10]; // 1-based
		int max = -1;
		int r = -1;
		int c = -1;

		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				map[i][j] = sc.nextInt();
				if (map[i][j] > max) {
					max = map[i][j];
					r = i;
					c = j;
				}
			}
		}

		System.out.println(max);
		System.out.println(r + " " + c);

	}
}
