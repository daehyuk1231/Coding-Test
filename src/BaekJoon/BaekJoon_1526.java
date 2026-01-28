package BaekJoon;

import java.util.Scanner;

public class BaekJoon_1526 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = N; i >= 4; i--) {
            char[] temp = String.valueOf(i).toCharArray();
            boolean gm = true;
            for (int j = 0; j < temp.length; j++) {
                if (temp[j] != '4' && temp[j] != '7') {
                    gm = false;
                    break;
                }
            }
            if (gm) {
                System.out.println(i);
                break;
            }
        }
    }
}
