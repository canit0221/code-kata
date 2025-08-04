import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String N = sc.nextLine();
		
		if (N.length()==1) {
			System.out.println("NO");
			return;
		}
		// 어떻게 나눌까
		for (int i = 0; i < N.length(); i++) {
			String f = N.substring(0, i + 1);
			String b = N.substring(i + 1, N.length());

			long fP = 1l;
			long bP = 1l;

			for (int j = 0; j < f.length(); j++) {
				fP *= f.charAt(j) - '0';
			}
			for (int j = 0; j < b.length(); j++) {
				bP *= b.charAt(j) - '0';
			}

			// 곱이 똑같으면 끝내자
			if (fP == bP) {
				System.out.println("YES");
				return;
			}
		}
		System.out.println("NO");

	}
}
