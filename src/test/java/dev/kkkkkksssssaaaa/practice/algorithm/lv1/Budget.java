package dev.kkkkkksssssaaaa.practice.algorithm.lv1;

// 예산
class Budget {

    public int solution(int[] d, int budget) {
        int count = 0;

        for (int i : d) {
            if (budget - i >= 0) {
                budget -= i;
                count++;
            }
        }

        return count;
    }
}
