package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BaekJoon_10845 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int[] q = new int[N];

        int front = 0;
        int back = 0;
        int size = 0;

        for (int i = 0; i < N; i++) {
            String text = br.readLine();
            if (text.contains("push")) {
                int X = Integer.parseInt(text.substring(5));
                q[back] = X;
                back++;
                size++;
            } else if (text.equals("pop")) {
                if (size == 0) sb.append(-1).append("\n");
                else {
                    sb.append(q[front]).append("\n");
                    front++;
                    size--;
                }
            } else if (text.equals("size")) {
                sb.append(size).append("\n");
            } else if (text.equals("empty")) {
                sb.append(size == 0 ? 1 : 0).append("\n");
            } else if (text.equals("front")) {
                if (size == 0) sb.append(-1).append("\n");
                else sb.append(q[front]).append("\n");
            } else {
                if (size == 0) sb.append(-1).append("\n");
                else sb.append(q[back - 1]).append("\n");
            }
        }
        System.out.println(sb);
    }
}
