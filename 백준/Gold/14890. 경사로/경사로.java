
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N, L;
    static int[][] map;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        L = Integer.parseInt(st.nextToken());

        map = new int[N][N];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int ans = 0;

        // 행 검사
        for (int r = 0; r < N; r++) {
            if (checkLine(map[r])) ans++;
        }

        // 열 검사
        for (int c = 0; c < N; c++) {
            int[] col = new int[N];
            for (int r = 0; r < N; r++) col[r] = map[r][c];
            if (checkLine(col)) ans++;
        }

        System.out.println(ans);
    }

    // 한줄씩 경사로확인
    static boolean checkLine(int[] line) {
        boolean[] used = new boolean[N]; // 경사로가 놓인 칸

        for (int i = 0; i < N - 1; i++) {
            int h = line[i];
            int nh = line[i + 1];

            if (h == nh) continue; // 같은 높이면 진행

            // 오르막
            if (nh - h == 1) {
                for (int k = 0; k < L; k++) {
                    int idx = i - k;
                    if (idx < 0 || line[idx] != h || used[idx]) return false;
                }
                for (int k = 0; k < L; k++) used[i - k] = true;
            }
            // 내리막
            else if (h - nh == 1) {
                for (int k = 1; k <= L; k++) {
                    int idx = i + k;
                    if (idx >= N || line[idx] != nh || used[idx]) return false;
                }
                for (int k = 1; k <= L; k++) used[i + k] = true;
            }
            // 높이 차이가 2 이상이면 불가능
            else {
                return false;
            }
        }
        return true;
    }
}
