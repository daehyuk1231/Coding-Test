package BaekJoon;

import java.util.Scanner;

public class BaekJoon_2455 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int Max = 0;
        int Now = 0;
        for (int i = 0; i < 4; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            Now = Now - A + B;
            Max = Math.max(Now, Max);
        }
        System.out.println(Max);
    }
}
