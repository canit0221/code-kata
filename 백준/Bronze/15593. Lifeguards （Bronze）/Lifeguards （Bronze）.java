
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		// 각 시간별 근무인원수를 표시하는 테이블
		int[] timetable = new int[1001];
		int[] cow = new int[N * 2];

		for (int tc = 0; tc < N; tc++) {
			cow[tc * 2] = sc.nextInt();
			cow[tc * 2 + 1] = sc.nextInt();
			// 근무표 카운트
			for (int t = cow[tc * 2]; t < cow[tc * 2 + 1]; t++) {
				timetable[t] += 1;
			}
		}

		int max = 0;
		for (int i = 0; i < N * 2; i += 2) {
			int[] newtimetable = Arrays.copyOf(timetable, 1002);
			int cnt = 0;

			for (int j = cow[i]; j < cow[i + 1]; j++) {
				newtimetable[j] -= 1;
			}

			for (int j = 0; j < 1000; j++) {
				if (newtimetable[j] > 0)
					cnt++;
			}
			max = Math.max(max, cnt);
		}

		System.out.println(max);

	}
}
