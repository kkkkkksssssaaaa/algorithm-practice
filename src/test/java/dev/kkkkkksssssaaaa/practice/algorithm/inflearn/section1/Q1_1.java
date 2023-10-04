package dev.kkkkkksssssaaaa.practice.algorithm.inflearn.section1;

import java.util.Scanner;

// 1.1 문자 찾기
class Q1_1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String target = in.next().toLowerCase();

        char character = in.next().toLowerCase().charAt(0);

        int count = 0;

        for (char c : target.toCharArray()) {
            if (c == character) {
                count++;
            }
        }

        System.out.println(count);
    }
}
