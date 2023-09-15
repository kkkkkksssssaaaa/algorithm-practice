package dev.kkkkkksssssaaaa.practice.algorithm.lv1;

import java.util.Arrays;

// 예산
class Budget {

    public int solution(int[] d, int budget) {
        int count = 0;

        Arrays.sort(d);

        for (int i = 0; i < d.length; i++) {
            if (budget - d[i] >= 0) {
                budget -= d[i];
                count++;
            }
        }

        return count;
    }
}
