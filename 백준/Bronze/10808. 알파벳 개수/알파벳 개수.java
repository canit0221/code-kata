
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String S = sc.next();
		
		int[] cnt = new int[26];
		
		for(int i=0;i<S.length();i++) {
			cnt[S.charAt(i)-'a']++;
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i =0; i<26;i++) {
			sb.append(cnt[i]);
			sb.append(' ');
		}
		System.out.println(sb.toString());
	}

}
