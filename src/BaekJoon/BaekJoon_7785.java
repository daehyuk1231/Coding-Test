package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BaekJoon_7785 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Set<String> members = new HashSet<>();
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String action = st.nextToken();
            if (action.equals("enter")) {
                members.add(name);
            } else {
                members.remove(name);
            }
        }
        ArrayList<String> answer = new ArrayList<>(members);
        Collections.sort(answer, Collections.reverseOrder());
        for (String name : answer) {
            System.out.println(name);
        }
    }
}
