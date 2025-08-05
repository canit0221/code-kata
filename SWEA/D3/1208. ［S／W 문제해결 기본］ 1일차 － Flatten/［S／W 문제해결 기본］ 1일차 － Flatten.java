import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(System.in);

		for (int tc = 1; tc < 11; tc++) {
	
			int dump = sc.nextInt();

			int[] box = new int[100];

			for (int i = 0; i < 100; i++) {
				box[i] = sc.nextInt();
			}

			Arrays.sort(box);

			while (dump > 0) {
				box[99]--;
				box[0]++;
				dump--;
				Arrays.sort(box);
			}

			System.out.printf("#%d %d",tc,box[99] - box[0]);
			System.out.println();
		}
	}
}
