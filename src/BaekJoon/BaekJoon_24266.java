package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class BaekJoon_24266 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine().trim());

        BigInteger bn = BigInteger.valueOf(n);
        BigInteger cnt = bn.multiply(bn).multiply(bn); // n^3

        System.out.println(cnt);
        System.out.println(3);
    }
}
