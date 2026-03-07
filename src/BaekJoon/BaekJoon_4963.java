package BaekJoon;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BaekJoon_4963 {
    static int w;
    static int h;
    static int[] dirX = {-1, -1, -1, 0, 0, 1, 1, 1};
    static int[] dirY = {-1, 0, 1, 1, -1, -1, 0, 1};
    static int[][] M;
    static int count;

    static class Position {
        int x;
        int y;

        public Position(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            w = sc.nextInt();
            h = sc.nextInt();
            if (w == 0 && h == 0) return;
            M = new int[h][w];
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    M[i][j] = sc.nextInt();
                }
            }
            count = 0;
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    if (M[i][j] == 1) {
                        count++;
                        BFS(i, j);
                    }
                }
            }
            System.out.println(count);
        }
    }

    private static void BFS(int i, int j) {
        Queue<Position> myQueue = new LinkedList<>();
        myQueue.offer(new Position(j, i));
        while (!myQueue.isEmpty()) {
            Position now = myQueue.poll();
            int X = now.x;
            int Y = now.y;
            for (int k = 0; k < 8; k++) {
                int tempX = X + dirX[k];
                int tempY = Y + dirY[k];
                if (tempX >= 0 && tempX < w && tempY >= 0 && tempY < h && M[tempY][tempX] == 1) {
                    myQueue.offer((new Position(tempX, tempY)));
                    M[tempY][tempX] = 0;
                }
            }
        }
    }
}
