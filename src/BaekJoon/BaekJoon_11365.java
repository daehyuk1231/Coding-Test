package BaekJoon;

import java.util.Scanner;

public class BaekJoon_11365 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String text = sc.nextLine();
            if (text.equals("END")) break;
            char[] textArr = text.toCharArray();
            for (int i = textArr.length - 1; i >= 0; i--) {
                System.out.print(textArr[i]);
            }
            System.out.println();
        }
    }
}
