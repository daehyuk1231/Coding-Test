package BaekJoon;

import java.util.Scanner;

public class BaekJoon_10953 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < N; i++) {
            String[] text = sc.nextLine().split(",");
            int A = Integer.parseInt(text[0]);
            int B = Integer.parseInt(text[1]);
            System.out.println(A + B);
        }
    }
}
