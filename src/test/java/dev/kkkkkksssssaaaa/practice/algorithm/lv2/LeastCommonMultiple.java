package dev.kkkkkksssssaaaa.practice.algorithm.lv2;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

// 두 수의 최소공배수
// 참고: https://hstory0208.tistory.com/entry/Java자바-프로그래머스-Lv2-N개의-최소공배수-유클리드-호재법
class LeastCommonMultiple {

    @Test
    void doTest() {
        assertEquals(168, solution(new int[]{2, 6, 8, 14}));
        assertEquals(6, solution(new int[]{1, 2, 3}));
    }

    // 주어진 수를 인수분해
    // 인수분해한 수들을 모두 모아 곱합

    /**
     * 2         2
     * 6         2 3
     * 8         2 2 2
     * 14        2 7
     *
     * 일 때, 2 * 2 * 2 * 3 * 7 = 168 이라고 한다...
     * */
    public int solution(int[] arr) {
        Arrays.sort(arr);

        int result = arr[0];

        for (int i = 1; i < arr.length; i++) {
            result = lcm(result, arr[i]);
        }

        return result;
    }

    // 두 수의 최소공배수 구하기
    public int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }

    // 유클리드 호제법을 이용한 최대 공약수 구하기
    // a = 큰 수, 나머지 값으로 나눌 값
    // b = 작은 수, 나머지 값
    public int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }

        return gcd(b, a % b);
    }
}
