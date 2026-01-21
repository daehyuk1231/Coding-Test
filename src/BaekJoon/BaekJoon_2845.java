package BaekJoon;

import java.util.Scanner;

public class BaekJoon_2845 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        int P = sc.nextInt();
        for (int i = 0; i < 5; i++) {
            int temp = sc.nextInt();
            System.out.print(temp - (L * P) + " ");
        }
    }
}
