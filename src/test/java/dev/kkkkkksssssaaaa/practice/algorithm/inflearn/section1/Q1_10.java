package dev.kkkkkksssssaaaa.practice.algorithm.inflearn.section1;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

// 가장 짧은 문자거리
class Q1_10 {

    @Test
    void doTest() {
//        assertEquals("1 0 1 2 1 0 1 2 2 1 0", solution("teachermode", "e"));
    }

    public static int[] solution(String input, char target) {
        int[] result = new int[input.length()];

        int distance = 1000;

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == target) {
                distance = 0;
                result[i] = distance;
            } else {
                distance++;
                result[i] = distance;
            }
        }

        distance = 1000;

        for (int i = input.length() - 1; i >= 0; i--) {
            if (input.charAt(i) == target) {
                distance = 0;
            } else {
                distance++;
                result[i] = Math.min(result[i], distance);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String input = in.nextLine();
        char target = in.next().charAt(0);

        for (int i : solution(input, target)) {
            System.out.print(i + " ");
        }

        return ;
    }
}
