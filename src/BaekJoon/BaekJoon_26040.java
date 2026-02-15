package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class BaekJoon_26040 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String A = br.readLine();

        String[] B = br.readLine().split(" ");

        Set<Character> target = new HashSet<>();
        for (String s : B) {
            target.add(s.charAt(0));
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < A.length(); i++) {
            char c = A.charAt(i);

            if (c >= 'A' && c <= 'Z' && target.contains(c)) {
                sb.append(Character.toLowerCase(c));
            } else {
                sb.append(c);
            }
        }
        System.out.println(sb.toString());
    }
}
