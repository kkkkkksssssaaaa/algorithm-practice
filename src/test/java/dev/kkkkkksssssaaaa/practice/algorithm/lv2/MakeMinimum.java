package dev.kkkkkksssssaaaa.practice.algorithm.lv2;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

import static org.junit.jupiter.api.Assertions.assertEquals;

// 최솟값 만들기
class MakeMinimum {

    @Test
    void doTest() {
        assertEquals(29, solution(new int[]{1, 4, 2}, new int[]{5, 4, 4}));
        assertEquals(29, solution2(new int[]{1, 4, 2}, new int[]{5, 4, 4}));
    }

    /**
     * a, b 는 길이가 같은 배열이다.
     * 각가 한 개의 숫자를 뽑아 두 수를 곱하며 배열의 길이만큼 반복한다.
     * 두 수를 곱한 값을 누적하여 더한다.
     * 이 때 최종적으로 누적된 값이 최소가 되도록 만들어야 한다.
     * */
    public int solution(int[] a, int[] b) {
        int[] sortByAscA = a;
        Arrays.sort(sortByAscA);

        Integer[] sortByDescB = Arrays.stream(b).boxed().toArray(Integer[]::new);
        Arrays.sort(sortByDescB, Collections.reverseOrder());

        int sum = 0;

        for (int i = 0; i < sortByAscA.length; i++) {
            sum += sortByAscA[i] * sortByDescB[i];
        }

        return sum;
    }

    public int solution2(int[] a, int[] b) {
        PriorityQueue<Integer> sortedA = new PriorityQueue<>();
        PriorityQueue<Integer> sortedB = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < a.length; i++) {
            sortedA.add(a[i]);
            sortedB.add(b[i]);
        }

        int sum = 0;

        while(!sortedA.isEmpty() && !sortedB.isEmpty()) {
            sum += sortedA.poll() * sortedB.poll();
        }

        return sum;
    }
}
