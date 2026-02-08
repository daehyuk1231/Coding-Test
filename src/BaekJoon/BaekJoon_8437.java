package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class BaekJoon_8437 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BigInteger N = new BigInteger(br.readLine());
        BigInteger M = new BigInteger(br.readLine());
        System.out.println(N.add(M).divide(BigInteger.valueOf(2)));
        System.out.println(N.subtract(M).divide(BigInteger.valueOf(2)));
    }
}
