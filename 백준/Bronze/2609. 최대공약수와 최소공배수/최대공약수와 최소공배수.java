import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		int min = Math.min(A, B);
		int max = Math.max(A, B);
		
		//공약수
		//둘중 작은수의 약수를 순회하며 큰수를 나눈다.
		for (int i=min;i>0;i--) {
			if (A%i==0 && B%i==0) {
				System.out.println(i);
				break;
			}	
		}
		
		//공배수
		//둘중 큰수부터 큰수단위로 더해가며 작은수를 나눈다.
		//최대값은 두개의 곱
		for (int i=max;i<A*B+1;i+=max) {
			if (i%min==0) {
			System.out.println(i);
			break;
			}
		}
	}
}
