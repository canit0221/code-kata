import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String text = "";

		while (true) {
			text = sc.next();
			if (text.equals("0"))
				break;
			String rtext = "";

			for (int i = text.length()-1; i >= 0; i--) {
				rtext += text.charAt(i);
			}
			
			if (text.equals(rtext)) {
				System.out.println("yes");}
			else {
				System.out.println("no");}
		}
	}
}
