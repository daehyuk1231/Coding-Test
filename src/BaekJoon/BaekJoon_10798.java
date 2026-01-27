package BaekJoon;

import java.util.Scanner;

public class BaekJoon_10798 {
    public static void main(String[] args) {
        char[][] map = new char[5][15];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 15; j++) {
                map[i][j] = ' ';
            }
        }
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            char[] text = sc.nextLine().toCharArray();
            for (int j = 0; j < text.length; j++) {
                map[i][j] = text[j];
            }
        }
        for (int j = 0; j < 15; j++) {
            for (int i = 0; i < 5; i++) {
                if (map[i][j] != ' ') {
                    System.out.print(map[i][j]);
                }
            }
        }
    }
}
