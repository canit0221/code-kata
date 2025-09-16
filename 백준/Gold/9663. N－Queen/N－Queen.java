import java.util.Scanner;

public class Main {
    static int N;
    static int cnt;
    static boolean[] col;    // 열 사용 여부
    static boolean[] diag1;  // 오아 대각선 (row+col)
    static boolean[] diag2;  // 왼아 대각선 (row-col+N-1)

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();

        col = new boolean[N];
        diag1 = new boolean[2 * N];
        diag2 = new boolean[2 * N];

        cnt = 0;
        dfs(0);
        System.out.println(cnt);
    }

    static void dfs(int row) {
        if (row == N) {
            cnt++;
            return;
        }

        for (int c = 0; c < N; c++) {
            // 이미 같은 열/대각선에 퀸이 있으면 배치 불가
            if (col[c] || diag1[row + c] || diag2[row - c + N]) continue;

            // 현재 위치 사용 처리
            col[c] = diag1[row + c] = diag2[row - c + N] = true;

            dfs(row + 1);

            // 백트래킹 (원상 복구)
            col[c] = diag1[row + c] = diag2[row - c + N] = false;
        }
    }
}