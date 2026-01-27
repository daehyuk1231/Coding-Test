package BaekJoon;

import java.util.Scanner;

public class BaekJoon_1037 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int Max = -1;
        int Min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int temp = sc.nextInt();
            if (temp > Max) Max = temp;
            if (temp < Min) Min = temp;
        }
        System.out.println(Max * Min);
    }
}
