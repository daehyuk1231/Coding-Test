package BaekJoon;

import java.util.Scanner;

public class BaekJoon_1159 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A[] = new int[130];
        int N = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < N; i++) {
            char index = sc.nextLine().toCharArray()[0];
            A[(int) index]++;
        }
        boolean check = false;
        for (int i = 0; i < 130; i++) {
            if (A[i] > 4) {
                check = true;
                System.out.print((char) i);
            }
        }
        if (!check) System.out.println("PREDAJA");
    }
}
