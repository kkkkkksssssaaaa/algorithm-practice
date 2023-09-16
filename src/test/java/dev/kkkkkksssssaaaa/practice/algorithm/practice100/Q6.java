package dev.kkkkkksssssaaaa.practice.algorithm.practice100;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Q6 {

    @Test
    void doTest() {
        assertEquals(6, solution(12, 18));
        assertEquals(15, solution(30, 15));
        assertEquals(10, solution(30, 20));
    }

    public int solution(int a, int b) {
        int result = 0;

        int index;

        if (a >= b) {
            index = a;
        } else {
            index = b;
        }

        for (int i = 1; i < index; i++) {
            if (a % i == 0 && b % i == 0) {
                result = i;
            }
        }

        return result;
    }
}
