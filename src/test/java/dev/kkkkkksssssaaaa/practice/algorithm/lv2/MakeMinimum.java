package dev.kkkkkksssssaaaa.practice.algorithm.lv2;

import java.util.Arrays;
import java.util.Collections;

// 최솟값 만들기
class MakeMinimum {

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
}
