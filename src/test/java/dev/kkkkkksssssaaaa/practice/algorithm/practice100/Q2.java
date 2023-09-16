package dev.kkkkkksssssaaaa.practice.algorithm.practice100;

import org.junit.jupiter.api.Test;

/**
 * 피보나치 수열 구현하기
 * */
class Q2 {
    
    @Test
    void doTest() {
        solution1();
    }

    // An = An-1 + An-2; n >= 3
    // a1 = 1, a2 = 2
    
    public void solution1() {
        int[] arr = new int[100];
        
        arr[1] = 1;
        arr[2] = 1;
        
        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
            System.out.println(arr[i]);
        }
    }

    public void solution2() {
        int prevPrevNum = 1; // An-2
        int preNum = 1; // An-1


    }
}
