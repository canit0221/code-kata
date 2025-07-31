import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		int K = sc.nextInt();
		
		/*
		M*2 < N --> N-1
		M*2 = N --> N-1, M-1 상관없음
		M*2 > N --> M-1
		*/
		for (int i = 0; i<K; i++) {
			if (M*2 <= N) 
				N--;
			else 
				M--;
		}
		
		int answer = Math.min(N/2,M);
		
		System.out.println(answer);
		 
	}

}
