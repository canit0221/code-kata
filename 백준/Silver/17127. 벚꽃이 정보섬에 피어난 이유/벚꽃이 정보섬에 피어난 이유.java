import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] trees = new int[N];

		for (int i = 0; i < N; i++) {
			trees[i] = sc.nextInt();
		}

		int max = 0;
		int sum;
		for (int i = 1; i < N - 2; i++) {
			for (int j = i + 1; j < N - 1; j++) {
				for (int k = j + 1; k < N; k++) {
					sum = 0;
					int tmp = 1;
					// 0부터 i-1까지 더하거나 곱하기
					if (i > 1) {
						tmp = 1;
						for (int t = 0; t < i; t++) {
							tmp *= trees[t];
						}
						sum += tmp;
					} else
						sum += trees[0];

					// i부터 j-1까지
					if (j - i > 1) {
						tmp = 1;
						for (int t = i; t < j; t++) {
							tmp *= trees[t];
						}
						sum += tmp;
					} else
						sum += trees[i];

					// j부터 k-1까지
					if (k - j > 1) {
						tmp = 1;
						for (int t = j; t < k; t++) {
							tmp *= trees[t];
						}
						sum += tmp;
					} else
						sum += trees[j];

					// k부터 N-1까지
					if (N-k >1) {
						tmp = 1;
						for (int t = k; t < N; t++) {
							tmp *= trees[t];
						}
						sum += tmp;
					} else
						sum += trees[k];

					// 최대값 저장
					max = Math.max(max, sum);
				} // ijk 정하기
			}
		} // ijk
		System.out.println(max);
	}
}
