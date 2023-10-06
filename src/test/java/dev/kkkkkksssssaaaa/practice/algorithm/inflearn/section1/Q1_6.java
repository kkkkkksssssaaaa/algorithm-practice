package dev.kkkkkksssssaaaa.practice.algorithm.inflearn.section1;

import org.junit.jupiter.api.Test;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

// 중복 문자 제거
class Q1_6 {

    @Test
    void doTest() {
        assertEquals("kset", solution("ksekkset"));
    }

    public static String solution(String input) {
        Set<Character> toSet = new LinkedHashSet<>();

        for (char c : input.toCharArray()) {
            toSet.add(c);
        }

        StringBuilder sb = new StringBuilder();

        for (Character character : toSet) {
            sb.append(character);
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String input = in.next();

        System.out.println(solution(input));

        return ;
    }
}
