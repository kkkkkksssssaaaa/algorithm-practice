package dev.kkkkkksssssaaaa.practice.algorithm.lv2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Carpet {

    @Test
    void doTest() {
        assertArrayEquals(new int[]{4, 3}, solution(10, 2));
        assertArrayEquals(new int[]{3, 3}, solution(8, 1));
        assertArrayEquals(new int[]{8, 6}, solution(24, 24));
    }

    public int[] solution(int brown, int yellow) {
        int total = brown + yellow;

        int x = 0;
        int y = 0;

        for (int i = 1; i <= yellow; i++) {
            // yellow 의 약수 i 찾기
            if (yellow % i == 0) {
                // 카펫은 가로가 더 길다.
                // i * (yellow / i) = yellow
                x = Math.max(i, yellow / i);
                y = Math.min(i, yellow / i);

                // brown 은 yellow 를 한 겹 씩 감싸고 있다.
                // 즉, yellow 의 x 축과 y 축에서 +2씩 한다면 brown 의 x, y 가 되는 것이다.
                if ((y + 2) * (x + 2) == total) {
                    break;
                }
            }
        }

        return new int[]{ x + 2, y + 2 };
    }
}
