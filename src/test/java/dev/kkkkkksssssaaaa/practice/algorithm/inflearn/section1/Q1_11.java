package dev.kkkkkksssssaaaa.practice.algorithm.inflearn.section1;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

// 문자열 압축
class Q1_11 {

    @Test
    void doTest() {
        assertEquals("K2HS7E", solution("KKHSSSSSSSE"));
        assertEquals("KST3SE2KFK3DJ2G2", solution("KSTTTSEEKFKKKDJJGG"));
    }

    public static String solution(String input) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            Character c = input.charAt(i);
            int count = 0;

            for (int j = i; j < input.length(); j++) {
                if (c.equals(input.charAt(j))) {
                    count++;
                } else {
                    i = j - 1;
                    j = input.length();
                }

                if (j == input.length() - 1) {
                    i = input.length();
                }
            }

            sb.append(c);

            if (count > 1) {
                sb.append(count);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String input = in.nextLine();

        System.out.println(solution(input));

        return ;
    }
}
