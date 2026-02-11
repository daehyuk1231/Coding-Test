package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon_26307 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int HH = Integer.parseInt(st.nextToken());
        int MM = Integer.parseInt(st.nextToken());
        int start = 60 * 9;
        int end = 60 * HH + MM;
        System.out.println(end - start);
    }

}
