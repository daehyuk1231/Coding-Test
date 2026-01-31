package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BaekJoon_4949 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String text = br.readLine();
        while (!text.equals(".")) {
            Stack<Character> myStack = new Stack<>();
            boolean result = true;
            char[] ctext = text.toCharArray();
            for (char now : ctext) {
                if (now == '(') {
                    myStack.push(now);
                } else if (now == '[') {
                    myStack.push(now);
                } else if (now == ')') {
                    if (myStack.empty()) {
                        result = false;
                        break;
                    }
                    char check = myStack.pop();
                    if (check != '(') {
                        result = false;
                        break;
                    }
                } else if (now == ']') {
                    if (myStack.empty()) {
                        result = false;
                        break;
                    }
                    char check = myStack.pop();
                    if (check != '[') {
                        result = false;
                        break;
                    }
                }
            }
            if (result && myStack.empty()) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
            text = br.readLine();
        }
    }
}
