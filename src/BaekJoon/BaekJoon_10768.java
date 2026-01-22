package BaekJoon;

import java.util.Scanner;

public class BaekJoon_10768 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int D = sc.nextInt();

        if (M < 2) {
            System.out.println("Before");
        } else if (M > 2) {
            System.out.println("After");
        } else {
            if (D < 18) {
                System.out.println("Before");
            } else if (D > 18) {
                System.out.println("After");
            } else {
                System.out.println("Special");
            }
        }
    }
}
