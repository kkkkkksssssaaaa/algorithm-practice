package dev.kkkkkksssssaaaa.practice.algorithm.inflearn.section1;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

// 암호
class Q1_12 {

    @Test
    void doTest() {
        assertEquals("COOL", solution(4, "#****###**#####**#####**##**"));
    }

    public static String solution(int length, String input) {
        int splitLength = 7;
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < length; i++) {
            StringBuilder builder = new StringBuilder();

            for (int j = splitLength * i; j < splitLength * (i + 1); j++) {
                builder.append(parse(input.charAt(j)));
            }

            int parseRadix10 = Integer.valueOf(builder.toString(), 2);
            result.append((char) parseRadix10);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int inputLength = in.nextInt();
        String input = in.next();

        System.out.println(solution(inputLength, input));

        return ;
    }

    public static int parse(Character c) {
        if (c.equals('#')) {
            return 1;
        }

        if (c.equals('*')) {
            return 0;
        }

        return -1;
    }
}
