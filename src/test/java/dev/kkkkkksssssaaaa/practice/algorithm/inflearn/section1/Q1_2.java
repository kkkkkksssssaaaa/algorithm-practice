package dev.kkkkkksssssaaaa.practice.algorithm.inflearn.section1;

import java.util.Scanner;

// 대소문자 변환
class Q1_2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.next();
        StringBuilder sb = new StringBuilder();

        for (char c : input.toCharArray()) {
            if (Character.isUpperCase(c)) {
                sb.append(Character.toLowerCase(c));
            } else {
                sb.append(Character.toUpperCase(c));
            }
        }

        System.out.println(sb);

        return ;
    }
}
