package dev.kkkkkksssssaaaa.practice.algorithm.practice100;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Q7 {

    @Test
    void doTest() {
        assertTrue(solution(13));
        assertTrue(solution(47));
        assertFalse(solution(8));
    }

    public boolean solution(int input) {
        int counter = 0;

        for (int i = 1; i <= input; i++) {
            if (input % i == 0) {
                counter++;
            }
        }

        return counter == 2;
    }
}
