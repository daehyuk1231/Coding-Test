package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BaekJoon_20291 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Map<String, Integer> files = new HashMap<>();
        for (int i = 0; i < N; i++) {
            String file = br.readLine().split("\\.")[1];
            if (files.containsKey(file)) {
                int nowValue = files.get(file);
                files.replace(file, nowValue + 1);
            } else {
                files.put(file, 1);
            }
        }
        List<String> mydata = new ArrayList<>(files.keySet());
        Collections.sort(mydata);
        for (String key : mydata) {
            int v = files.get(key);
            System.out.println(key + " " + v);
        }
    }
}
