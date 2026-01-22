package BaekJoon;

import java.util.Scanner;

public class BaekJoon_4470 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        for (int i = 1; i <= N; i++) {
            String text = sc.nextLine();
            System.out.println(i + ". " + text);
        }
    }
}
