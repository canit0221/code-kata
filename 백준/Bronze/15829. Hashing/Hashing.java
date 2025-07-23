import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int L = sc.nextInt();

		int r = 31;
		int M = 1234567891;
		
		//배열 받기
		String text = sc.next();
		int[] numText = new int[L];
		long hash = 0;
		long pow = 1;
		
		//숫자로 전환
		for(int i =0;i<L;i++) {
			numText[i] = (int)text.charAt(i) - 'a' + 1;
			hash += numText[i]*pow;
			hash %= M;
			pow = (pow*r)%M;
		}
		hash %= M;
		System.out.println(hash);
	}
}
