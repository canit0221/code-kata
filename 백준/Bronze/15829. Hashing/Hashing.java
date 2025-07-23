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
		int[] numText = new int[text.length()];
		int hash = 0;
		//숫자로 전환
		for(int i =0;i<text.length();i++) {
			numText[i] = (int)text.charAt(i) - 'a' + 1;
			hash += numText[i]*(int)Math.pow(31, i);
		}
		System.out.println(hash);
	}
}
