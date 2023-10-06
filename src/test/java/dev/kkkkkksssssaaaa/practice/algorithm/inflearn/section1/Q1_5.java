package dev.kkkkkksssssaaaa.practice.algorithm.inflearn.section1;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

// 특정 문자 뒤집기
class Q1_5 {

    @Test
    void doTest() {
        assertEquals("S#T!EG*b@a", solution("a#b!GE*T@S"));
    }

    public static String solution(String input) {
        List<Integer> letterIndex = new ArrayList<>();
        char[] toCharArray = input.toCharArray();

        for (int i = 0; i < toCharArray.length; i++) {
            if (Character.isLetter(toCharArray[i])) {
                letterIndex.add(i);
            }
        }

        int lt = 0;
        int gt = letterIndex.size() - 1;

        while (lt < gt) {
            char prevLt = toCharArray[letterIndex.get(lt)];
            toCharArray[letterIndex.get(lt)] = toCharArray[letterIndex.get(gt)];
            toCharArray[letterIndex.get(gt)] = prevLt;

            lt++;
            gt--;
        }

        return String.valueOf(toCharArray);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String input = in.next();

        System.out.println(solution(input));

        return ;
    }
}
