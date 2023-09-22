package dev.kkkkkksssssaaaa.practice.algorithm.lv2;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

// 연속 부분 수열 합의 개수
// 참고: https://iyk2h.tistory.com/350
class SumOfCircleSequence {

    @Test
    void doTest() {
        assertEquals(18, solution(new int[]{7, 9, 1, 1, 4}));
    }

    public int solution(int[] elements) {
        int[] extendedElements = new int[elements.length * 2];

        for (int i = 0; i < elements.length; i++) {
            // extendedElements 의 i 번째 요소와 i + elements.length 번째 요소에 elements[i] 를 대입한다
            // 즉, elements 가 5개라면 0번 인덱스와 6번 인덱스에 elements[0] 을 동시에 대입한다
            extendedElements[i] = extendedElements[i + elements.length] = elements[i];
        }

        Set<Integer> result = new HashSet<>();

        // 전체 수열의 개수만큼 반복한다
        // i 는 부분 수열의 개수이다
        // 7부터 시작하여 +9, +1.... 로 차례대로 더해나간다
        // 한 루프를 도면, 그 다음은 9부터 시작하여 +1, +1, +4.... 로 차례대로 더해나간다
        // 이 모든 과정이 반복되고나면 원순열의 모든 요소에 대한 부분 순열의 합을 구할 수 있다.
        for (int i = 0; i < elements.length; i++) {
            int sum = 0;
            System.out.println("부분 수열의 개수 = " + (i + 1));

            // k는 i 를 대입 받아 초기화한다
            for (int k = i; k < i + elements.length; k++) {
                // 배열을 순회할 때 마다 합계에 더한다
                // 더한 수는 곧바로 result 에 더한다
                sum += extendedElements[k];
                System.out.println("sum = " + sum);
                result.add(sum);
            }
        }

        return result.size();
    }
}
