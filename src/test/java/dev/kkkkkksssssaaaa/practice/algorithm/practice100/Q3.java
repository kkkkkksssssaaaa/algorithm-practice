package dev.kkkkkksssssaaaa.practice.algorithm.practice100;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Q3 {

    @Test
    void doTest() {
        int[] arr = {1, 2, 2, 3, 1, 4, 2, 2, 4, 3, 5, 3, 2};

        assertEquals(2, solution(arr));
        assertEquals(2, answer(arr));
    }

    public int solution(int[] arr) {
        Map<Integer, Integer> answer = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (answer.containsKey(arr[i])) {
                int count = answer.get(arr[i]);
                count++;
                answer.put(arr[i], count);
            } else {
                answer.put(arr[i], 1);
            }
        }

        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(answer.entrySet());

        list.sort(Map.Entry.comparingByValue());

        return list.get(list.size() - 1).getKey();
    }

    public int answer(int[] arr) {
        int[] mode = new int[10];

        for (int i = 0; i < mode.length; i++) {
            mode[arr[i]]++;
        }

        int modeNum = 0;
        int modeCount = 0;

        for (int i = 0; i < mode.length; i++) {
            if (modeCount < mode[i]) {
                modeCount = mode[i];
                modeNum = i;
            }
        }

        System.out.println("최빈수 = " + modeNum);
        System.out.println("출현횟수 = " + modeCount);

        return modeNum;
    }
}
