package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class BaekJoon_12789 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        Stack<Integer> stack = new Stack<>();
        int target = 1;

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());

            if (num == target) {
                target++;

                while (!stack.isEmpty() && stack.peek() == target) {
                    stack.pop();
                    target++;
                }
            } else {
                stack.push(num);
            }
        }

        while (!stack.isEmpty() && stack.peek() == target) {
            stack.pop();
            target++;
        }

        if (target == n + 1) {
            System.out.println("Nice");
        } else {
            System.out.println("Sad");
        }
    }
}
