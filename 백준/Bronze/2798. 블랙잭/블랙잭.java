import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); // 카드 개수
		int M = sc.nextInt(); // 숫자 M
		
		//카드배열 저장
		int[] card = new int[N]; 
		for (int i = 0; i<N;i++) {
			card[i] = sc.nextInt();
		}
		
		Arrays.sort(card); // 오름차순 정렬
		
		int max = 0; // 최대값 저장
		int sum; // 합계 저장
		
		// 최대값 부터 3개 조합해보기
		loop:for (int i = 0; i<N-2;i++) {
			for (int j = i+1;j<N-1;j++) {
				for (int k = j+1;k<N;k++) {
					sum = card[i]+card[j]+card[k];
					// 범위 제한
					if (sum>M) continue;
					// M이 되면 바로 반환
					else if (sum==M) {
						max=sum;
						break loop;
					}
					// M 이하 라면 현재 최대값과 비교 후 저장
					else max = Math.max(max, sum);
				}
			}
		}
		System.out.println(max);
	}
}