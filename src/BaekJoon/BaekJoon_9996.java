package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon_9996 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String p = br.readLine();
        String[] p2 = p.split("\\*");
        for (int i = 0; i < N; i++) {
            boolean match = false;
            String text = br.readLine();
            if (p2.length == 2) {
                if (text.startsWith(p2[0]) && text.endsWith(p2[1])) {
                    match = true;
                }
            } else {
                if (p.toCharArray()[0] == '*') {
                    if (text.endsWith(p2[0])) {
                        match = true;
                    }
                } else {
                    if (text.startsWith(p2[0])) {
                        match = true;
                    }
                }
            }
            if (match && p.length() - 1 <= text.length()) System.out.println("DA");
            else System.out.println("NE");
        }
    }
}
