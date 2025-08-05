import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[100][100];

		for (int tc = 1; tc <= 10; tc++) {
			sc.nextInt();

			for (int i = 0; i < 100; i++) {
				for (int j = 0; j < 100; j++) {
					arr[i][j] = sc.nextInt();
				}
			}

			int max = 0;
			int sumRow;
			int sumCol;
			int sumL;
			int sumR;
			int sumMax;

			// 각 행의 합
			for (int i = 0; i < 100; i++) {
				int[] sum = new int[4];
				sumRow = 0;
				sumCol = 0;
				sumL = 0;
				sumR = 0;
				for (int j = 0; j < 100; j++) {
					sum[0] += arr[i][j];
					sum[1] += arr[j][i];
					sum[2] += arr[j][j];
					sum[3] += arr[j][100 - j - 1];
				}
				Arrays.sort(sum);
				sumMax = sum[3];
				max = Math.max(sumMax, max);
			}

			System.out.printf("#%d %d", tc, max);
			System.out.println();

		} // 테스트케이스

	}
}
