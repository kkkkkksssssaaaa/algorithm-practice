package dev.kkkkkksssssaaaa.practice.algorithm.lv1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// 숫자 문자열과 영단어
class NumberOfStringAndEnglishWord {

    public int solution(String s) {
        String answerOfString = s;
        Map<Integer, String> wordTable = new HashMap<>();

        wordTable.put(0, "zero");
        wordTable.put(1, "one");
        wordTable.put(2, "two");
        wordTable.put(3, "three");
        wordTable.put(4, "four");
        wordTable.put(5, "five");
        wordTable.put(6, "six");
        wordTable.put(7, "seven");
        wordTable.put(8, "eight");
        wordTable.put(9, "nine");

        List<Integer> keySet = new ArrayList<>(wordTable.keySet());

        for (Integer key : keySet) {
            if (answerOfString.contains(wordTable.get(key))) {
                answerOfString = answerOfString.replace(wordTable.get(key), key.toString());
            }
        }

        return Integer.valueOf(answerOfString);
    }
}
