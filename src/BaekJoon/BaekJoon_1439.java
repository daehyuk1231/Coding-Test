package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon_1439 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] S = br.readLine().toCharArray();
        boolean change_S = true;
        int count = 0;
        for (int i = 1; i < S.length; i++) {
            if (S[i] != S[i - 1]) {
                S[i] = S[i - 1];
                if (change_S) {
                    count++;
                    change_S = false;
                }
            } else {
                change_S = true;
            }
        }
        System.out.println(count);
    }
}
