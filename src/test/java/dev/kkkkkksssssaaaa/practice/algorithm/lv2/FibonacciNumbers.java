package dev.kkkkkksssssaaaa.practice.algorithm.lv2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FibonacciNumbers {

    @Test
    void doTest() {
        assertEquals(2, solution(3));
        assertEquals(5, solution(5));
    }

    public int solution(int n) {
        int[] arr = new int[n + 1];

        for (int i = 0; i <= n; i++) {
            if (i <= 1) {
                int value = 0 + i;
                System.out.println(value);
                arr[i] = value;
            } else {
                int value = (arr[i - 1] + arr[i - 2]) % 1234567;
                System.out.println(value);
                arr[i] = value;
            }
        }

        return arr[n];
    }
}
