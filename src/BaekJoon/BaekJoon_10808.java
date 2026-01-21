package BaekJoon;

import java.util.Scanner;

public class BaekJoon_10808 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] result = new int[26];
        char[] temp = sc.next().toCharArray();
        for (int i = 0; i < temp.length; i++) {
            result[temp[i] - 97]++;
        }

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i] + " ");
        }
    }
}
