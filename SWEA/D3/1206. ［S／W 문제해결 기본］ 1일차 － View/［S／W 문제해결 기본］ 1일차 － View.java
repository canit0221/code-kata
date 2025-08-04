import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		for (int test_case = 1; test_case <= 10; test_case++) {

			int N = sc.nextInt();

			int[] bList = new int[N];

			for (int i = 0; i < N; i++) {
				bList[i] = sc.nextInt();
			}

			// 각 빌딩의 조망권 세대 수 저장
			int sum = 0;

			for (int i = 2; i < N - 2; i++) {
				int max = 0;
				// 근처 2칸 제일 높은 빌딩 찾기
				for (int j = i - 2; j < i + 3; j++) {
					if (j != i)
						max = Math.max(bList[j], max);
				}
				// 제일 높은 빌딩과 현재 빌딩과 차이를 저장
				if (bList[i] > max)
					sum += bList[i]-max;
			}
			
			System.out.printf("#%d %d\n",test_case,sum);
		}	
	}
}
