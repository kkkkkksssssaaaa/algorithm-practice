package dev.kkkkkksssssaaaa.practice.algorithm.lv2;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

// 기능 개발
class DevelopFeature {

    @Test
    void doTest() {
        assertArrayEquals(new int[]{2, 1}, solution(new int[]{93, 30, 55}, new int[]{1, 30, 5}));
        assertArrayEquals(new int[]{1, 3, 2}, solution(new int[]{95, 90, 99, 99, 80, 99}, new int[]{1, 1, 1, 1, 1, 1}));
    }

    /**
     * @param progresses 배포 되어야 할 작업의 완성도, 100%가 되면 배포 가능
     * @param speeds 하루 마다 올라 가는 각 작업의 진행도
     * @return result.length = 앞선 기능을 배포할 수 있는 일 수
     *
     *         result[i] = 배포 일에 배포 되는 기능의 개수, result[i] 들의 모든 합은 결국 progresses 의 개수와 같음
     *         만약 7일 째에 두 개의 기능이, 9일 째에 한 개의 기능이 배포 된다면 result=[2, 1]
     *
     *         기능 배포는 progresses 의 순서에 따라 배포 되어야 하며,
     *         0번 작업이 완료가 되지 않은 상태에서 1번 작업이 완료 되었다면, 1번 작업은 0번 작업 완료 후에 배포 가능함
     * */
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> result = new ArrayList<>();
        Set<Integer> completed = new HashSet<>();

        boolean flag = true;
        int index = 0;

        while (flag) {
            for (int i = 0; i < progresses.length; i++) {
                progresses[i] += speeds[i];
            }

            for (int i = index; i < progresses.length; i++) {
                if (progresses[i] >= 100) {
                    completed.add(i);
                    index++;
                } else {
                    i = progresses.length;
                }
            }

            if (!completed.isEmpty()) {
                result.add(completed.size());
                completed.clear();
            }

            if (result.stream().mapToInt(Integer::intValue).sum() == progresses.length) {
                flag = false;
            }
        }

        return result.stream()
            .mapToInt(Integer::intValue)
            .toArray();
    }
}
