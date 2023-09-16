package dev.kkkkkksssssaaaa.practice.algorithm.lv2;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class MaxAndMin {

    @Test
    void doTest() {
        System.out.println(solution("-1 -2 -3 -4"));
    }

    public String solution(String s) {
        String answer = "";
        List<Integer> answerOfList = new ArrayList<>();

        for (int i = 0; i < s.split(" ").length; i++) {
            answerOfList.add(Integer.valueOf(s.split(" ")[i]));
        }

        answerOfList = answerOfList.stream().sorted().collect(Collectors.toList());

        return answerOfList.get(0) + " " + answerOfList.get(answerOfList.size() - 1);
    }
}
