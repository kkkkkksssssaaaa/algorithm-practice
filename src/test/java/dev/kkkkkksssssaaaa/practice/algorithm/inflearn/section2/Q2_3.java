package dev.kkkkkksssssaaaa.practice.algorithm.inflearn.section2;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

// 가위 바위 보
class Q2_3 {

    @Test
    void doTest() {
        assertEquals(
            List.of("A", "B", "A", "B", "D"),
            solution(
                5,
                new int[]{2, 3, 3, 1, 3},
                new int[]{1, 1, 2, 2, 3}
            )
        );
    }

    public static List<String> solution(int length, int[] arr1, int[] arr2) {
        List<String> result = new ArrayList<>();

        for (int i = 0; i < length; i++) {
            result.add(fight(arr1[i], arr2[i]));
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int inputLength = in.nextInt();
        int[] arr1 = new int[inputLength];
        int[] arr2 = new int[inputLength];

        for (int i = 0; i < inputLength; i++) {
            arr1[i] = in.nextInt();
        }

        for (int i = 0; i < inputLength; i++) {
            arr2[i] = in.nextInt();
        }

        List<String> results = solution(inputLength, arr1, arr2);

        for (String result : results) {
            System.out.println(result);
        }

        return ;
    }

    // 1: 가위
    // 2: 바위
    // 3: 보
    public static String fight(int a, int b) {
        if (a == 1) {
            if (b == 1) {
                return "D";
            } else if (b == 2) {
                return "B";
            } else {
                return "A";
            }
        } else if (a == 2) {
            if (b == 1) {
                return "A";
            } else if (b == 2) {
                return "D";
            } else {
                return "B";
            }
        } else {
            if (b == 1) {
                return "B";
            } else if (b == 2) {
                return "A";
            } else {
                return "D";
            }
        }
    }
}
