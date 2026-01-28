package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class BaekJoon_1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        ArrayList<String> myarr = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            String now = br.readLine();
            if (!myarr.contains(now)) {
                myarr.add(now);
            }
        }
        Collections.sort(myarr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() == o2.length()) {
                    return o1.compareTo(o2);
                }
                return o1.length() - o2.length();
            }
        });

        for (int i = 0; i < myarr.size(); i++) {
            System.out.println(myarr.get(i));
        }
    }
}
