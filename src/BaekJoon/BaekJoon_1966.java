package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BaekJoon_1966 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            Queue<Point> myqueue = new LinkedList<>();
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            int MaxV = 0;
            int[] MaxA = new int[10];
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                int tempValue = Integer.parseInt(st.nextToken());
                myqueue.add(new Point(j, tempValue));
                if (MaxV < tempValue) MaxV = tempValue;
                MaxA[tempValue]++;
            }
            int count = 1;
            while (true) {
                Point now = myqueue.poll();
                if (now.value == MaxV) {
                    if (now.index == M) {
                        System.out.println(count);
                        break;
                    } else {
                        count++;
                    }
                    MaxA[MaxV]--;
                    if (MaxA[MaxV] == 0) {
                        for (int j = MaxV - 1; j > 0; j--) {
                            if (MaxA[j] != 0) {
                                MaxV = j;
                                break;
                            }
                        }
                    }
                } else {
                    myqueue.add(now);
                }
            }
        }
    }

    static class Point {
        int index;
        int value;

        public Point(int index, int value) {
            this.index = index;
            this.value = value;
        }
    }
}
