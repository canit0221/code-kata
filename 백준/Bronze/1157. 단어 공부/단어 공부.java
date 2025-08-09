
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int[] cnt = new int[26];
		
		for(int i =0 ; i<str.length();i++) {
			//대문자
			if (str.charAt(i)<'a') 
				cnt[str.charAt(i)-'A']++;
			
			else
				cnt[str.charAt(i)-'a']++;
			
		}
		int max = -1;
		char alpha = '0';
		
		for(int i=0; i<26;i++) {
			if(max<cnt[i]) {
				max = cnt[i];
				alpha = (char) (i+'A');}
		}
				
		Arrays.sort(cnt);
		if(cnt[24]==max) 
			alpha = '?';
		
		System.out.println(alpha);
		
	}
}
