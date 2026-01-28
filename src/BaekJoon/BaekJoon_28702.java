package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BaekJoon_28702 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] in = new String[3];
        for (int i = 0; i < 3; i++) in[i] = br.readLine();

        for (int i = 0; i < 3; i++) {
            boolean isNumber = true;
            for (int j = 0; j < in[i].length(); j++) {
                if (!Character.isDigit(in[i].charAt(j))) {
                    isNumber = false;
                    break;
                }
            }

            if (isNumber) {
                int val = Integer.parseInt(in[i]);
                int start = val - i;
                int next = start + 3;

                if (next % 15 == 0) System.out.println("FizzBuzz");
                else if (next % 3 == 0) System.out.println("Fizz");
                else if (next % 5 == 0) System.out.println("Buzz");
                else System.out.println(next);

                return;
            }
        }

        for (int s = 1; s <= 15; s++) {
            boolean ok = true;

            for (int i = 0; i < 3; i++) {
                int cur = s + i;
                String fb;
                if (cur % 15 == 0) fb = "FizzBuzz";
                else if (cur % 3 == 0) fb = "Fizz";
                else if (cur % 5 == 0) fb = "Buzz";
                else fb = Integer.toString(cur);

                if (!fb.equals(in[i])) {
                    ok = false;
                    break;
                }
            }
            if (ok) {
                int next = s + 3;
                if (next % 15 == 0) System.out.println("FizzBuzz");
                else if (next % 3 == 0) System.out.println("Fizz");
                else if (next % 5 == 0) System.out.println("Buzz");
                else System.out.println(next);
                return;
            }
        }
    }
}
