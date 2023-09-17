package dev.kkkkkksssssaaaa.practice.algorithm.practice100;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Q32 {

    @Test
    void doTest() {
        assertEquals(10, solution(1, 4));
        assertEquals(52, solution(3, 10));
    }

    public int solution(int a, int b) {
        if (a == b) {
            return a;
        }

        int result = a + solution(a + 1, b);

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("result = " + result);

        return result;
    }
}
