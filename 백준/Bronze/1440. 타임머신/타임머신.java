import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String time = sc.next();

		int ans = 0;

		for (int i = 0; i < time.length(); i += 3) {
			int t = Integer.parseInt(time.substring(i, i + 2));
			if (t <= 12 && t >= 1)
				ans += 2;
			else if (t >= 60) {
				ans = 0;
				break;
			}
		}

		System.out.println(ans);

	}
}