
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int L = sc.nextInt();

		int[] arr = new int[N];
		Arrays.fill(arr, 0);
		arr[0] = 1; // 첫사람 공받음
		int i = 0;
		int cnt = 0;
		while (arr[i] < M) {
			if (arr[i] % 2 == 1) {//홀수라면
				if (i + L < N)
					arr[i += L] += 1;
				else {
					i = (i + L) % N;
					arr[i] += 1;
				}
				
			} else {//짝수라면
				if (i - L >=0)
					arr[i -= L] += 1;
				else {
					i = (N+i - L)%N ;
					arr[i] += 1;
				}
				  
			}
			cnt++;
		}
		System.out.println(cnt);

	}
}
