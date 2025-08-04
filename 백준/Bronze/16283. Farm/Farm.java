import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] numList = new int[4];

		for (int i = 0; i < 4; i++) {
			numList[i] = sc.nextInt();
		}
		int cnt = 0;
		int ans = 0;
		for (int i = 1; i < numList[2]; i++) {
			if (i * numList[0] + (numList[2] - i) * numList[1] == numList[3]) {
				cnt++;
				ans = i;
			}
		}
		
		if (cnt != 1) {
			System.out.println(-1);
			return;
		}

		System.out.println(ans+" "+(numList[2]-ans));
	}
}
