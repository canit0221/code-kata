import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] color = new int[3];
		
		for (int i = 0; i<3; i++) {
			
			switch (sc.next()) {
			case "black":
				color[i] = 0;
				break;
			case "brown":
				color[i] = 1;
				break;
			case "red":
				color[i] = 2;
				break;
			case "orange":
				color[i] = 3;
				break;
			case "yellow":
				color[i] = 4;
				break;
			case "green":
				color[i] = 5;
				break;
			case "blue":
				color[i] = 6;
				break;
			case "violet":
				color[i] = 7;
				break;
			case "grey":
				color[i] = 8;
				break;
			case "white":
				color[i] = 9;
				break;
			}
		}
		
		System.out.println((long)Math.pow(10, color[2]+1)*color[0]+(long)Math.pow(10, color[2])*color[1]);
		

	}
}
