import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		sc.close();
		double B = 1;
		
		
		int cnt =0;
		
		while (B<500) {
			double A = Math.sqrt(B*B+N);
			if (A%1==0)
				cnt++;
			B++;
		}
		
		System.out.println(cnt);
	}
}
