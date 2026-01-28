package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

public class BaekJoon_11651 {
    public static void main(String[] args) throws IOException {
        ArrayList<Point2> points = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            points.add(new Point2(x, y));
        }
        points.sort((o1, o2) -> {
            if (o1.y == o2.y) return o1.x - o2.x;
            return o1.y - o2.y;
        });
        for (int i = 0; i < N; i++) {
            System.out.println(points.get(i).x + " " + points.get(i).y);
        }
    }
}

class Point2 {
    int x;
    int y;

    public Point2(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
