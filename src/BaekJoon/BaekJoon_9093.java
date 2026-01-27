package BaekJoon;

import java.io.*;
import java.util.StringTokenizer;

public class BaekJoon_9093 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            while (st.hasMoreTokens()) {
                char[] text = st.nextToken().toCharArray();
                for (int j = text.length - 1; j >= 0; j--) {
                    bw.write(text[j]);
                }
                bw.write(" ");
            }
            bw.write("\n");
        }
        bw.flush();
    }
}
