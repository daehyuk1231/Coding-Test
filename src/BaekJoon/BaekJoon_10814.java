package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

public class BaekJoon_10814 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        ArrayList<People> peoples = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();
            peoples.add(new People(age, name));
        }
        Collections.sort(peoples, new Comparator<People>() {
            @Override
            public int compare(People o1, People o2) {
                return o1.age - o2.age;
            }
        });
        for (int i = 0; i < peoples.size(); i++) {
            People now = peoples.get(i);
            System.out.println(now.age + " " + now.name);
        }
    }
}

class People {
    int age;
    String name;

    public People(int age, String name) {
        this.age = age;
        this.name = name;
    }
}
