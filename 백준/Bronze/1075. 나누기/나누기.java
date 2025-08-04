import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int F = sc.nextInt();
		
		int front = (N / 100)*100;
		
		for(int i= 0; i < 100; i++) {
			
			if ((front+i)%F==0) {
				if (i<10) 
					System.out.println("0"+i);
				else
					System.out.println(i);
				break;
			}
				
		}
		
		
	}
}
