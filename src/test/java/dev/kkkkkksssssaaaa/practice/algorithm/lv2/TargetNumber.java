package dev.kkkkkksssssaaaa.practice.algorithm.lv2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

// 타겟 넘버
class TargetNumber {

    @Test
    void doTest() {
        assertEquals(5, solution(new int[]{1, 1, 1, 1, 1}, 3));
        assertEquals(2, solution(new int[]{4, 1, 2, 1}, 4));
    }

    int result = 0;

    public int solution(int[] numbers, int target) {
        result = 0;

        dfs(0, numbers, target, 0);
        return result;
    }

    private void dfs(int index, int[] num, int target, int sum) {
        if(index == num.length) {
            if(target == sum) {
                result++;
            }
            return;
        }
        dfs(index + 1, num, target, sum + num[index]);
        dfs(index + 1, num, target, sum - num[index]);
    }
}
