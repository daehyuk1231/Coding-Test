package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon_18111 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int min = 266;
        int max = -1;
        int[][] myMap = new int[N][M];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                myMap[i][j] = Integer.parseInt(st.nextToken());
                if (max < myMap[i][j]) max = myMap[i][j];
                if (min > myMap[i][j]) min = myMap[i][j];
            }
        }
        int result = Integer.MAX_VALUE;
        int result_h = -1;
        for (int h = min; h <= max; h++) {
            int time = 0;
            int tempB = B;
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    int now = myMap[i][j];
                    if (now > h) {
                        int diff = now - h;
                        time += diff * 2;
                        tempB += diff;
                    } else if (now < h) {
                        int diff = h - now;
                        time += diff;
                        tempB -= diff;
                    }
                }
            }
            if (result >= time && tempB >= 0) {
                result = time;
                result_h = h;
            }
        }
        System.out.println(result + " " + result_h);
    }
}
