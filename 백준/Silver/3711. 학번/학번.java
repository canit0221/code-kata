import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		for (int tc = 0; tc < N; tc++) {

			int G = sc.nextInt(); // 학생수
			int[] numList = new int[G];
			for (int i = 0; i < G; i++) {
				numList[i] = sc.nextInt();
			} // 학번배열

			int m = 1;

			int mod = 0;
			
			while (true) {
				HashSet<Integer> set = new HashSet<>();
				boolean stop=false;
				
				for (int i = 0; i < G; i++) {
					mod = numList[i] % m;
					if(!set.add(mod)) {
						stop = true;
						break;
					}
					
				}

				if (!stop) break;
					m++;

			}
			System.out.println(m);

		} // 테케

	}
}
