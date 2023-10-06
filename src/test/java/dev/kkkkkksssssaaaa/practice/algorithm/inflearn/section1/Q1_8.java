package dev.kkkkkksssssaaaa.practice.algorithm.inflearn.section1;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

// 유효한 팰린드롬
class Q1_8 {

    @Test
    void doTest() {
        assertEquals("YES", solution("found7, time: study; Yduts; emit, 7Dnuof"));
        assertEquals("YES", solution("a sd fg #%hjkl; %#$@! lkj&*hgfd s ##a"));
        assertEquals("NO", solution("found7, time: study; Yduts; emit, 7Dnuo"));
    }

    public static String solution(String input) {
        input = input.toLowerCase().replaceAll("[^a-z]", "");
        String reverse = new StringBuilder(input).reverse().toString();

        if (input.equals(reverse)) {
            return "YES";
        } else {
            return "NO";
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String input = in.nextLine();

        System.out.println(solution(input));

        return ;
    }
}
