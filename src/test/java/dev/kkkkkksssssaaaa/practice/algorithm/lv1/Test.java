package dev.kkkkkksssssaaaa.practice.algorithm.lv1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Test {

    @org.junit.jupiter.api.Test
    void doTest() {
        System.out.println(solution(new int[]{1, 3, 2, 4, 2}));
    }

    public int[] solution(int[] answers) {
        List<Integer> answer = new ArrayList<>();

        int[] case1Answer = {1, 2, 3, 4, 5};
        int[] case2Answer = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] case3Answer = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int case1Index = 0;
        int case2Index = 0;
        int case3Index = 0;

        Map<Integer, Integer> scoreTable = new HashMap<>();

        scoreTable.put(1, 0);
        scoreTable.put(2, 0);
        scoreTable.put(3, 0);

        for (int i = 0; i < answers.length; i++) {
            if (case1Answer[case1Index] == answers[i]) {
                int score = scoreTable.get(1);
                score++;
                scoreTable.put(1, score);
            }

            if (case2Answer[case2Index] == answers[i]) {
                int score = scoreTable.get(2);
                score++;
                scoreTable.put(2, score);
            }

            if (case3Answer[case3Index] == answers[i]) {
                int score = scoreTable.get(3);
                score++;
                scoreTable.put(3, score);
            }

            if (case1Index == case1Answer.length - 1) {
                case1Index = 0;
            } else {
                case1Index++;
            }

            if (case2Index == case2Answer.length - 1) {
                case2Index = 0;
            } else {
                case2Index++;
            }

            if (case3Index == case3Answer.length - 1) {
                case3Index = 0;
            } else {
                case3Index++;
            }
        }

        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(scoreTable.entrySet());
        list.sort(Map.Entry.comparingByValue());
        Collections.reverse(list);

        answer.add(0, list.get(0).getKey());

        if (list.get(0).getValue().equals(list.get(1).getValue())) {
            for (int i = 1; i < list.size(); i++) {
                if (i <= list.size() - 1 && list.get(i - 1).getValue().equals(list.get(i).getValue())) {
                    answer.add(i, list.get(i).getKey());
                }
            }
        }

        return answer.stream()
            .mapToInt(Integer::intValue)
            .sorted()
            .toArray();
    }
}
