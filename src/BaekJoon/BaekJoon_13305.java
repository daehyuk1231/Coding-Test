package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon_13305 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] D = new int[N - 1];
        int[] V = new int[N - 1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N - 1; i++) {
            D[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N - 1; i++) {
            V[i] = Integer.parseInt(st.nextToken());
        }
        long nowD = D[0];
        long nowV = V[0];
        long cost = 0;
        for (int i = 1; i < N - 1; i++) {
            if (nowV > V[i]) {
                cost += nowD * nowV;
                nowV = V[i];
                nowD = D[i];
            } else {
                nowD += D[i];
            }
        }
        cost += nowD * nowV;
        System.out.println(cost);
    }
}
