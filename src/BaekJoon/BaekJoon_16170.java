package BaekJoon;

import java.time.LocalDate;
import java.time.ZoneOffset;

public class BaekJoon_16170 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now(ZoneOffset.UTC);

        System.out.println(now.getYear());
        System.out.printf("%02d%n", now.getMonthValue());
        System.out.printf("%02d%n", now.getDayOfMonth());
    }
}
