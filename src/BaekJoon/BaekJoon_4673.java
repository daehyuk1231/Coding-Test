package BaekJoon;

public class BaekJoon_4673 {
    public static void main(String[] args) {
        boolean check[] = new boolean[10001];
        for (int i = 1; i < 10000; i++) {
            int s = i;
            char[] temp = String.valueOf(i).toCharArray();
            for (int j = 0; j < temp.length; j++) {
                s += Integer.parseInt(String.valueOf(temp[j]));
            }
            if (s < 10001) {
                check[s] = true;
            }
        }
        for (int i = 1; i <= 10000; i++) {
            if (check[i] == false) {
                System.out.println(i);
            }
        }
    }
}
