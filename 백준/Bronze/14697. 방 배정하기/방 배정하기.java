import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int N = sc.nextInt();

		for (int i = 0; i <= N; i++) {
			for (int j = 0; j <= N; j++) {
				for (int k = 0; k <= N; k++) {
					if (i * A + j * B + k * C == N) {
						System.out.println(1);
						return;
					}
				}
			}
		}
		System.out.println(0);

	}
}
