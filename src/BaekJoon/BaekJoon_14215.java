package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BaekJoon_14215 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] S = new int[3];
        for (int i = 0; i < 3; i++) {
            S[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(S);
        if (S[0] + S[1] > S[2]) System.out.println(S[0] + S[1] + S[2]);
        else {
            S[2] = S[0] + S[1] - 1;
            System.out.println(S[0] + S[1] + S[2]);
        }
    }
}
