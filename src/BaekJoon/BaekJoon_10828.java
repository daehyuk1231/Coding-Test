package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon_10828 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int[] stack = new int[N];
        int top = -1;

        for (int i = 0; i < N; i++) {
            String text = br.readLine();

            if (text.contains("push")) {
                int x = Integer.parseInt(text.substring(5));
                stack[++top] = x;
            } else if (text.equals("pop")) {
                if (top == -1) sb.append(-1).append("\n");
                else sb.append(stack[top--]).append("\n");
            } else if (text.equals("size")) {
                sb.append(top + 1).append("\n");
            } else if (text.equals("empty")) {
                sb.append(top == -1 ? 1 : 0).append("\n");
            } else {
                if (top == -1) sb.append(-1).append("\n");
                else sb.append(stack[top]).append("\n");
            }
        }
        System.out.print(sb);
    }
}
