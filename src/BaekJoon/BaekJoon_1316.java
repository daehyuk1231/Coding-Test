package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon_1316 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count = 0;
        for (int i = 0; i < N; i++) {
            int[] check = new int[26];
            char[] text = br.readLine().toCharArray();
            char before = text[0];
            check[(int) (before - 'a')] = 1;
            boolean group = true;
            for (int j = 1; j < text.length; j++) {
                char now = text[j];
                if (before != now && check[(int) (now - 'a')] == 1) {
                    group = false;
                    break;
                }
                before = now;
                check[(int) (now - 'a')] = 1;
            }
            if (group) {
                count++;
            }
        }
        System.out.println(count);
    }
}
