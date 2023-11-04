package dev.kkkkkksssssaaaa.practice.algorithm.inflearn.section2;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

// 보이는 학생
class Q2_2 {

    @Test
    void doTest() {
        assertEquals(5, solution(8, new int[]{130, 135, 148, 140, 145, 150, 150, 153}));
        assertEquals(4, solution(10, new int[]{23, 10, 46, 62, 42, 39, 11, 98, 71, 41}));
    }

    public static int solution(int length, int[] arr) {
        int result = 1;

        int standard = arr[0];

        for (int i = 1; i < length; i++) {
            if (standard < arr[i]) {
                standard = arr[i];
                result++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int inputLength = in.nextInt();
        int[] arr = new int[inputLength];

        for (int i = 0; i < inputLength; i++) {
            arr[i] = in.nextInt();
        }

        int result = solution(inputLength, arr);

        System.out.println(result);

        return ;
    }
}
