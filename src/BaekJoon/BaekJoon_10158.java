package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

public class BaekJoon_10158 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int t = Integer.parseInt(br.readLine());
        x += t;
        y += t;
        x %= 2 * w;
        y %= 2 * h;
        if (x > w) {
            x = x - w;
            x = w - x;
        }
        if (y > h) {
            y = y - h;
            y = h - y;
        }
        bw.write(String.valueOf(x + " " + String.valueOf(y)));
        bw.flush();
    }
}
