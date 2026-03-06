package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BaekJoon_10799 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] data = br.readLine().toCharArray();
        Stack<Integer> myStack = new Stack<>();
        int count = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] == '(') {
                myStack.add(1);
            } else {
                myStack.pop();
                if (data[i - 1] == '(') {
                    count += myStack.size();
                } else {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
