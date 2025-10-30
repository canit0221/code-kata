
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	static int N;
	static Stack<Character> stack;
	static boolean isVPS;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		for (int t = 0; t < N; t++) {
			String s = br.readLine();
			isVPS = true;
			stack = new Stack<>(); // 초기화

			for (int i = 0; i < s.length(); i++) { // 괄호검사
				char c = s.charAt(i);

				if (c == '(') // 여는괄호
					stack.add(c);

				else {// 닫는괄호
					if (!stack.isEmpty())
						stack.pop();
					else {
						isVPS = false;
						break;
					}
				}
			}

			if (!stack.isEmpty())
				isVPS = false;

			if (isVPS)
				System.out.println("YES");
			else
				System.out.println("NO");

		} // tc
	}
}
