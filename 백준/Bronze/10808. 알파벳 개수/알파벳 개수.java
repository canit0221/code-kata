
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String S = sc.next();
		
		int cnt;
		for (int i =0; i<26;i++) {
			cnt = 0;
			for(int j =0;j<S.length();j++) {
				if (S.charAt(j)-97==i) 
					cnt++;
				
			}
			System.out.print(cnt+" ");
			
		}
	}

}
