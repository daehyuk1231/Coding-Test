package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon_15873 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int A, B;

        if (s.length() == 2) {
            A = s.charAt(0) - '0';
            B = s.charAt(1) - '0';
        } else if (s.length() == 3) {
            if (s.startsWith("10")) {
                A = 10;
                B = s.charAt(2) - '0';
            } else {
                A = s.charAt(0) - '0';
                B = 10;
            }
        } else {
            A = 10;
            B = 10;
        }

        System.out.println(A + B);
    }
}
