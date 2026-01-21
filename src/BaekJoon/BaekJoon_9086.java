package BaekJoon;

import java.util.Scanner;

public class BaekJoon_9086 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < T; i++) {
            String text = sc.nextLine();
            String answer = text.charAt(0) + text.substring(text.length() - 1);
            System.out.println(answer);
        }
    }
}
