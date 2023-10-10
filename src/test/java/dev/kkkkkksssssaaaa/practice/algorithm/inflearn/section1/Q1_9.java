package dev.kkkkkksssssaaaa.practice.algorithm.inflearn.section1;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

// 숫자만 추출
class Q1_9 {

    @Test
    void doTest() {
        assertEquals("208", solution("g0en2T0s8eSoft"));
    }

    public static String solution(String input) {
        StringBuilder sb = new StringBuilder();

        for (Character c : input.toCharArray()) {
            if (Character.isDigit(c)) {
                sb.append(c);
            }
        }

        return String.valueOf(Integer.valueOf(sb.toString()));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String input = in.nextLine();

        System.out.println(solution(input));

        return ;
    }
}
