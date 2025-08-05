import java.io.File;
import java.io.FileNotFoundException;
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
			int sum;
			// 각 행의 합
			for (int i = 0; i < 100; i++) {
				sum = 0;
				for (int j = 0; j < 100; j++) {
					sum += arr[i][j];
				}
				max = Math.max(max, sum);
			}

			// 각 열의 합
			for (int i = 0; i < 100; i++) {
				sum = 0;
				for (int j = 0; j < 100; j++) {
					sum += arr[j][i];
				}
				max = Math.max(max, sum);
			}

			// 각 대각선의 합
			sum = 0;
			for (int i = 0; i < 100; i++) {
				sum += arr[i][i];
			}
			max = Math.max(max, sum);

			// 각 대각선의 합
			sum = 0;
			for (int i = 0; i < 100; i++) {
				sum += arr[i][100-i-1];
			}
			max = Math.max(max, sum);
			
			System.out.printf("#%d %d",tc,max);
			System.out.println();
			
		}//테스트케이스

	}
}
