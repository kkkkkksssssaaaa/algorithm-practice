package dev.kkkkkksssssaaaa.practice.algorithm.inflearn.section1;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

// 회문 문자열
class Q1_7 {

    @Test
    void doTest() {
        assertEquals("YES", solution("gooG"));
        assertEquals("NO", solution("gooGa"));
    }

    public static String solution(String input) {
        input = input.toLowerCase();

        int length = input.length();

        for (int i = 0; i < length/2; i++) {
            if (input.charAt(i) != input.charAt(length - i - 1)) {
                return "NO";
            }
        }

        return "YES";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String input = in.next();

        System.out.println(solution(input));

        return ;
    }
}
