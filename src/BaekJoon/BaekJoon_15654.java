package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BaekJoon_15654 {
    static int N, M;
    static int[] nums;
    static int[] pick;
    static boolean[] used;
    static StringBuilder sb = new StringBuilder();

    static void dfs(int depth) {
        if (depth == M) {
            for (int i = 0; i < M; i++) {
                sb.append(pick[i]);
                if (i + 1 < M) sb.append(' ');
            }
            sb.append('\n');
            return;
        }

        for (int i = 0; i < N; i++) {
            if (used[i]) continue;
            used[i] = true;
            pick[depth] = nums[i];
            dfs(depth + 1);
            used[i] = false;
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        nums = new int[N];
        pick = new int[M];
        used = new boolean[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) nums[i] = Integer.parseInt(st.nextToken());

        Arrays.sort(nums);
        dfs(0);

        System.out.print(sb.toString());
    }
}
