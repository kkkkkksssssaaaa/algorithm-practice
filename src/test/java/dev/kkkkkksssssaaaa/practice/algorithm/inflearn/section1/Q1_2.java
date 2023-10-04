package dev.kkkkkksssssaaaa.practice.algorithm.inflearn.section1;

import java.util.Scanner;

// 대소문자 변환
class Q1_2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.next();
        StringBuilder sb = new StringBuilder();
        int lowerStart = 97;
        int upperStart = 65;
        int value = lowerStart - upperStart;

        for (char c : input.toCharArray()) {
            if (c >= upperStart && c < lowerStart) {
                sb.append((char) (c + value));
            } else {
                sb.append((char) (c - value));
            }
        }

        System.out.println(sb);

        return ;
    }
}
