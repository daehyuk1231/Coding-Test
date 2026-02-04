package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon_1120 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        char[] A = st.nextToken().toCharArray();
        char[] B = st.nextToken().toCharArray();

        int Min = Integer.MAX_VALUE;
        for (int i = 0; i <= B.length - A.length; i++) {
            int temp = 0;
            for (int j = i; j < A.length + i; j++) {
                if (B[j] != A[j - i]) temp++;
            }
            if (Min > temp) Min = temp;
        }
        System.out.println(Min);
    }
}
