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
        int[] result = new int[input.length()];
        char[] inputToCharArray = input.toCharArray();
        char targetToChar = target.toCharArray()[0];

        int distance = input.length() + 1;

        for (int i = 0; i < inputToCharArray.length; i++) {
            if (inputToCharArray[i] == targetToChar) {
                distance = 0;
            }

            result[i] = distance;
            distance++;
        }

        for (int i = inputToCharArray.length - 1; i >= 0; i--) {
            if (inputToCharArray[i] == targetToChar) {
                distance = 0;
            }

            result[i] = Math.min(distance, result[i]);
            distance++;
        }

        String[] toStringArray = new String[input.length()];

        for (int i = 0; i < result.length; i++) {
            toStringArray[i] = String.valueOf(result[i]);
        }

        return String.join(" ", toStringArray);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String input = in.nextLine();
        String target = in.nextLine();

        System.out.println(solution(input, target));

        return ;
    }
}
