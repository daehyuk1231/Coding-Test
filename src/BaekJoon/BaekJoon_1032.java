package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon_1032 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        char[][] text = new char[N][];
        for (int i = 0; i < N; i++) {
            text[i] = br.readLine().toCharArray();
        }

        for (int i = 0; i < text[0].length; i++) {
            char now = text[0][i];
            boolean same = true;
            for (int j = 1; j < N; j++) {
                if (now != text[j][i]) {
                    same = false;
                    break;
                }
            }
            if (same) System.out.print(now);
            else System.out.print('?');
        }
    }
}
