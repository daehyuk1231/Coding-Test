package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BaekJoon_5073 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] S = new int[3];
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < 3; i++) {
                S[i] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(S);
            if (S[0] == 0 && S[1] == 0 && S[2] == 0) return;
            else if (S[0] + S[1] <= S[2]) System.out.println("Invalid");
            else if (S[0] == S[1] && S[1] == S[2]) System.out.println("Equilateral");
            else if (S[0] == S[1] && S[1] != S[2] || S[0] != S[1] && S[1] == S[2]) System.out.println("Isosceles");
            else if (S[0] != S[1] && S[1] != S[2]) System.out.println("Scalene");
        }
    }
}
