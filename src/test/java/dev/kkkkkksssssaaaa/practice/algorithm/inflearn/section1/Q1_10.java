package dev.kkkkkksssssaaaa.practice.algorithm.inflearn.section1;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

// 가장 짧은 문자거리
class Q1_10 {

    @Test
    void doTest() {
        assertEquals("1 0 1 2 1 0 1 2 2 1 0", solution("teachermode", "e"));
    }

    public static String solution(String input, String target) {
        String[] result = new String[input.length()];
        char[] inputToCharArray = input.toCharArray();
        char targetToChar = target.toCharArray()[0];

        for (int i = 0; i < inputToCharArray.length; i++) {
            char thisChar = inputToCharArray[i];
            int left = Integer.MAX_VALUE;
            int right = Integer.MAX_VALUE;

            if (thisChar == targetToChar) {
                left = 0;
                right = 0;
            } else {
                for (int j = i; j < inputToCharArray.length; j++) {
                    if (targetToChar == inputToCharArray[j]) {
                        right = j - i;
                        j = inputToCharArray.length;
                    }
                }

                for (int j = i; j > 0; j--) {
                    if (targetToChar == inputToCharArray[j]) {
                        left = i - j;
                        j = 0;
                    }
                }
            }

            result[i] = String.valueOf(Math.min(left, right));
        }

        return String.join(" ", result);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String input = in.nextLine();
        String target = in.nextLine();

        System.out.println(solution(input, target));

        return ;
    }
}
