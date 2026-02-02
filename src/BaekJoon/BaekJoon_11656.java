package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BaekJoon_11656 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String text = br.readLine();
        String[] myarr = new String[text.length()];
        for (int i = 0; i < text.length(); i++) {
            myarr[i] = text.substring(i);
        }
        Arrays.sort(myarr);
        for (int i = 0; i < text.length(); i++) {
            System.out.println(myarr[i]);
        }
    }
}
