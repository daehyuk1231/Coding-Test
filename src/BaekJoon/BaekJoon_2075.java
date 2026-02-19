package BaekJoon;

import java.io.*;
import java.util.*;

public class BaekJoon_2075 {

    static class FastScanner {
        private final InputStream in = System.in;
        private final byte[] buffer = new byte[1 << 16];
        private int ptr = 0, len = 0;

        private int readByte() throws IOException {
            if (ptr >= len) {
                len = in.read(buffer);
                ptr = 0;
                if (len <= 0) return -1;
            }
            return buffer[ptr++];
        }

        int nextInt() throws IOException {
            int c;
            do { c = readByte(); } while (c <= ' ');
            int sign = 1;
            if (c == '-') { sign = -1; c = readByte(); }
            int val = 0;
            while (c > ' ') {
                val = val * 10 + (c - '0');
                c = readByte();
            }
            return val * sign;
        }
    }

    static class IntMinHeap {
        int[] h;
        int size = 0;

        IntMinHeap(int cap) { h = new int[cap]; }

        int peek() { return h[0]; }

        void push(int x) {
            int i = size++;
            h[i] = x;
            while (i > 0) {
                int p = (i - 1) >>> 1;
                if (h[p] <= h[i]) break;
                int tmp = h[p]; h[p] = h[i]; h[i] = tmp;
                i = p;
            }
        }

        int pop() {
            int ret = h[0];
            h[0] = h[--size];
            int i = 0;
            while (true) {
                int l = i * 2 + 1;
                if (l >= size) break;
                int r = l + 1;
                int m = (r < size && h[r] < h[l]) ? r : l;
                if (h[i] <= h[m]) break;
                int tmp = h[i]; h[i] = h[m]; h[m] = tmp;
                i = m;
            }
            return ret;
        }
    }

    public static void main(String[] args) throws Exception {
        FastScanner fs = new FastScanner();
        int N = fs.nextInt();

        IntMinHeap heap = new IntMinHeap(N);

        for (int i = 0; i < N * N; i++) {
            int x = fs.nextInt();
            if (heap.size < N) {
                heap.push(x);
            } else if (x > heap.peek()) {
                heap.pop();
                heap.push(x);
            }
        }

        System.out.println(heap.peek());
    }
}
