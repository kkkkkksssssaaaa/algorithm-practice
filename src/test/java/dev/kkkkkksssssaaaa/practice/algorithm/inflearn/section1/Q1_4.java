package dev.kkkkkksssssaaaa.practice.algorithm.inflearn.section1;

import org.junit.jupiter.api.Test;

import java.util.Scanner;
import java.util.Stack;

import static org.junit.jupiter.api.Assertions.assertEquals;

// 단어 뒤집기
class Q1_4 {

    @Test
    void doTest() {
        assertEquals("emiT", solution("Time"));
    }

    public String solution(String original) {
        Stack<Character> stack = new Stack<>();

        for (char c : original.toCharArray()) {
            stack.push(c);
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < original.length(); i++) {
            sb.append(stack.pop());
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        String[] result = new String[count];

        for (int i = 0; i < count; i++) {
            String input = in.next();

            result[i] = new StringBuilder(input).reverse().toString();
            System.out.println(result[i]);
        }

        return ;
    }
}
