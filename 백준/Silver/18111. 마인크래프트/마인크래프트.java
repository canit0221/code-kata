
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int oB;
    static int N, M, cnt, min = 256, max = 0, height;
    static int[] h = new int[257];
    static boolean isOk;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        oB = Integer.parseInt(st.nextToken());

        // 입력: 카운팅 + min/max 갱신 (정렬/배열 불필요)
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                int v = Integer.parseInt(st.nextToken());
                h[v]++;
                if (v < min) min = v;
                if (v > max) max = v;
            }
        }

        height = 0;
        int minCnt = Integer.MAX_VALUE;

        for (int target = min; target <= max; target++) {
            isOk = true;
            int B = oB;
            cnt = 0;

            // 1) 제거 먼저 (인벤 채우기)
            for (int i = 0; i <= 256; i++) {
                int c = h[i];
                if (c == 0 || i <= target) continue;
                int diff = (i - target) * c;
                cnt += diff * 2; // 제거 시간
                B   += diff;     // 인벤 증가
            }

            // 2) 그 다음 채우기 (인벤 확인)
            for (int i = 0; i <= 256; i++) {
                int c = h[i];
                if (c == 0 || i >= target) continue;
                int need = (target - i) * c;
                if (need > B) { isOk = false; break; }
                cnt += need; // 채우기 시간
                B   -= need; // 인벤 감소
            }

            // 최소 시간, 동률이면 더 높은 높이
            if (isOk && (cnt < minCnt || (cnt == minCnt && target > height))) {
                minCnt = cnt;
                height = target;
            }
        }

        System.out.println(minCnt + " " + height);
    }
}
