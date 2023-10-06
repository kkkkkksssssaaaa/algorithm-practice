package dev.kkkkkksssssaaaa.practice.algorithm.inflearn.section1;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

// 회문 문자열
class Q1_7 {

    @Test
    void doTest() {
        assertEquals("YES", solution("gooG"));
    }

    public static String solution(String input) {
        input = input.toLowerCase();

        String reverseString = new StringBuilder(input).reverse().toString();

        if (input.equals(reverseString)) {
            return "YES";
        } else {
            return "NO";
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String input = in.next();

        System.out.println(solution(input));

        return ;
    }
}
