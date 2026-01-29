package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon_1476 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int E = Integer.parseInt(st.nextToken());
        if (E == 15) E = 0;
        int S = Integer.parseInt(st.nextToken());
        if (S == 28) S = 0;
        int M = Integer.parseInt(st.nextToken());
        if (M == 19) M = 0;
        int V = 1;
        while (true) {
            if (V % 15 == E && V % 28 == S && V % 19 == M) {
                break;
            }
            V++;
        }
        System.out.println(V);
    }
}
