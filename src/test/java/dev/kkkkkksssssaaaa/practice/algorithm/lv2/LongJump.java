package dev.kkkkkksssssaaaa.practice.algorithm.lv2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

// 멀리뛰기
class LongJump {

    @Test
    void doTest() {
        assertEquals(5, solution(4));
        assertEquals(3, solution(3));
    }

    public long solution(int n) {
        // n 은 1 이상의 정수이기 때문에 반드시 한 칸은 뛸 수 있게 된다.
        // 즉, 맨 끝 칸에 도달할 수 있는 방법은 무조건 1개 이상이다.
        long result = 1;

        int[] arr = new int[n + 2];

        for (int i = 0; i <= n + 1; i++) {
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

        return arr[n + 1];
    }
}
