package dev.kkkkkksssssaaaa.practice.algorithm.inflearn.section2;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 큰 수 출력하기
class Q2_1 {

    @Test
    void doTest() {
    }

    public static List<Integer> solution(int length, int[] arr) {
        List<Integer> answer = new ArrayList<>();

        answer.add(arr[0]);

        for (int i = 1; i < length; i++) {
            if (arr[i] > arr[i - 1]) {
                answer.add(arr[i]);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int inputLength = in.nextInt();
        int[] arr = new int[inputLength];

        for (int i = 0; i < inputLength; i++) {
            arr[i] = in.nextInt();
        }

        List<Integer> result = solution(inputLength, arr);

        for (int x : result) {
            System.out.print(x + " ");
        }

        return ;
    }
}
