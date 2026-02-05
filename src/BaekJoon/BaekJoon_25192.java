package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class BaekJoon_25192 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        HashSet<String> GOM = new HashSet<>();
        int useCnt = 0;
        for (int i = 0; i < N; i++) {
            String text = br.readLine();
            if (text.equals("ENTER")) {
                useCnt += GOM.size();
                GOM.clear();
            } else {
                GOM.add(text);
            }
        }
        useCnt += GOM.size();
        System.out.println(useCnt);
    }
}
