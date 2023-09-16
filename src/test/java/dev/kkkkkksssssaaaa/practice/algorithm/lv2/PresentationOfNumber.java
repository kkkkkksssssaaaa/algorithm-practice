package dev.kkkkkksssssaaaa.practice.algorithm.lv2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PresentationOfNumber {

    @Test
    void doTest() {
//        assertEquals(4, solution(15));
        assertEquals(1, solution(1));
    }

    public int solution(int n) {
        int answer = 0;

        int index = 0;

        while(index <= n) {
            int sum = 0;

            for (int i = index; i < n; i++) {
                sum += i;

                if (sum > n) {
                    i = n;
                }

                if (sum == n) {
                    i = n;
                    answer++;
                }
            }

            index++;
        }

        return answer;
    }
}
