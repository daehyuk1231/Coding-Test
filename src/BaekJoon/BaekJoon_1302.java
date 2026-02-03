package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class BaekJoon_1302 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<String, Integer> myMap = new HashMap<>();
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            String name = br.readLine();
            if (myMap.containsKey(name)) {
                int now = myMap.get(name);
                myMap.put(name, now + 1);
            } else {
                myMap.put(name, 1);
            }
        }
        ArrayList<String> BookName = new ArrayList<>(myMap.keySet());
        Collections.sort(BookName);
        BookName.sort((o1, o2) -> myMap.get(o2).compareTo(myMap.get(o1)));
        System.out.println(BookName.get(0));
    }
}
