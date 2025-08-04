import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int cnt = 0;
		for(int i =3; i<=n-6;i+=3) {
			for(int j =3; j<=n-i;j+=3) {
				for(int k =3; k<=n-i-j;k+=3) {
					if(i+j+k==n)
						cnt++;
				}
			}
		}
		
		System.out.println(cnt);
	}
}
