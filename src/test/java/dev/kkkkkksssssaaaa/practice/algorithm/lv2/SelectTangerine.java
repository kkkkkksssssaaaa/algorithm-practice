package dev.kkkkkksssssaaaa.practice.algorithm.lv2;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

// 귤 고르기
class SelectTangerine {

    @Test
    void doTest() {
        assertEquals(3, solution(6, new int[]{1, 3, 2, 5, 4, 5, 2, 3}));
        assertEquals(2, solution(4, new int[]{1, 3, 2, 5, 4, 5, 2, 3}));
        assertEquals(1, solution(2, new int[]{1, 1, 1, 1, 2, 2, 2, 3}));
    }

    public int solution(int k, int[] tangerines) {
        int answer = 0;

        Map<Integer, Integer> tangerineMap = new HashMap<>();

        for (int tangerine : tangerines) {
            if (tangerineMap.containsKey(tangerine)) {
                tangerineMap.put(tangerine, tangerineMap.get(tangerine) + 1);
            } else {
                tangerineMap.put(tangerine, 1);
            }
        }

        List<Map.Entry<Integer, Integer>> tangerineList = new ArrayList<>(tangerineMap.entrySet());
        tangerineList.sort(((o1, o2) -> o2.getValue() - o1.getValue()));

        if (tangerineList.get(0).getValue() >= k) {
            return 1;
        }

        int sum = 0;

        while(sum < k) {
            for (int i = 0; i < tangerineList.size(); i++) {
                sum += tangerineList.get(i).getValue();
                answer++;

                if (sum >= k) {
                    i = tangerineList.size();
                }
            }
        }

        return answer;
    }
}
