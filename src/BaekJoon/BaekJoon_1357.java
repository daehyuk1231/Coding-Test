package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon_1357 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String X = st.nextToken();
        String Y = st.nextToken();
        String ans = Rev(String.valueOf(Integer.parseInt(Rev(X)) + Integer.parseInt(Rev(Y))));
        System.out.println(ans);
    }

    static String Rev(String num) {
        char[] temp = num.toCharArray();
        String result = "";
        boolean firstZero = true;
        for (int i = temp.length - 1; i >= 0; i--) {
            char now = temp[i];
            if (now == '0' && firstZero) continue;
            firstZero = false;
            result += String.valueOf(now);
        }
        return result;
    }
}
