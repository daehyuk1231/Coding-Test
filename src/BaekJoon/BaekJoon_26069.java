package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class BaekJoon_26069 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        HashSet<String> people = new HashSet<>();
        people.add("ChongChong");
        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String p1 = st.nextToken();
            String p2 = st.nextToken();
            if (people.contains(p1) || people.contains(p2)) {
                people.add(p1);
                people.add(p2);
            }
        }
        System.out.println(people.size());
    }
}
