package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon_2578 {
    static int[][] B;
    static int[][] C;
    static int count_row = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        B = new int[5][5];
        C = new int[5][5];
        StringTokenizer st;
        for (int i = 0; i < 5; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 5; j++) {
                B[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < 5; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 5; j++) {
                int now = Integer.parseInt(st.nextToken());
                check(now);
                if (count_row >= 3) {
                    System.out.println(i * 5 + j + 1);
                    return;
                }
            }
        }
    }

    private static void check(int v) {
        boolean find = false;
        int x = -1;
        int y = -1;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (B[i][j] == v) {
                    C[i][j] = 1;
                    find = true;
                    x = j;
                    y = i;
                    break;
                }
            }
            if (find) break;
        }
        if (x == y) {
            boolean row = true;
            for (int i = 0; i < 5; i++) {
                if (C[i][i] != 1) {
                    row = false;
                    break;
                }
            }
            if (row) count_row++;
        }

        if (x + y == 4) {
            boolean row = true;
            for (int i = 0; i < 5; i++) {
                if (C[i][4 - i] != 1) {
                    row = false;
                    break;
                }
            }
            if (row) count_row++;
        }

        boolean row = true;
        for (int i = 0; i < 5; i++) {
            if (C[y][i] != 1) {
                row = false;
                break;
            }
        }
        if (row) count_row++;

        row = true;
        for (int i = 0; i < 5; i++) {
            if (C[i][x] != 1) {
                row = false;
                break;
            }
        }
        if (row) count_row++;
    }
}
