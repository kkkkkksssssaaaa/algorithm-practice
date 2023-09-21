package dev.kkkkkksssssaaaa.practice.algorithm.lv2;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

// 연속 부분 수열 합의 개수
class SumOfCircleSequence {

    @Test
    void doTest() {
        assertEquals(18, solution(new int[]{7, 9, 1, 1, 4}));
    }

    public int solution(int[] elements) {
        Map<Integer, Set<Integer>> resultMap = new HashMap<>();

        // 수열의 길이는 최소 1이며, 최종적으로는 전체 요소의 개수만큼의 길이를 가지게 된다
        for (int arrayLength = 1; arrayLength <= elements.length; arrayLength++) {
            Set<Integer> resultValue = new HashSet<>();

            System.out.println("arrayLength = " + arrayLength);

            int targetIndex = 0;

            for (int j = 0; j < elements.length; j++) {
                System.out.println("targetIndex = " + targetIndex);
                int sum = 0;

                for (int k = 0; k < arrayLength; k++) {
                    if (targetIndex >= elements.length) {
                        targetIndex = 0;
                    }

                    sum += elements[targetIndex];
                    targetIndex++;
                }

                System.out.println("sum = " + sum);
                resultValue.add(sum);
            }

            resultMap.put(arrayLength, resultValue);
        }

        Set<Integer> results = new HashSet<>();

        resultMap.values()
            .iterator()
            .forEachRemaining(results::addAll);

        return results.size();
    }
}
