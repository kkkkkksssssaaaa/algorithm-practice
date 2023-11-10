package dev.kkkkkksssssaaaa.practice.algorithm.inflearn.section2;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

// 피보나치 수열
class Q2_4 {

    @Test
    void doTest() {
//        assertEquals(List.of(1, 1, 2, 3, 5, 8, 13, 21, 34, 55), solution(10));
    }

    public static List<Integer> solution(int n) {
        List<Integer> result = new ArrayList<>();
        int[] arr = new int[n + 1];

        int a = 1, b = 1, c;

        System.out.print(a + " " + b + " ");

        for (int i = 2; i < n; i++) {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int input = in.nextInt();
        List<Integer> result = solution(input);

//        for (int i : result) {
//            System.out.print(i + " ");
//        }

        return ;
    }
}
