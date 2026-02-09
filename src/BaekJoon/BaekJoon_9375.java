package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class BaekJoon_9375 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            int n = Integer.parseInt(br.readLine());
            Map<String, Integer> cnt = new HashMap<>();

            for (int i = 0; i < n; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                String name = st.nextToken();
                String type = st.nextToken();

                cnt.put(type, cnt.getOrDefault(type, 0) + 1);
            }

            int ans = 1;
            for (int c : cnt.values()) {
                ans *= (c + 1);
            }

            ans -= 1;
            sb.append(ans).append("\n");
        }
        System.out.println(sb.toString());
    }
}
