package dev.kkkkkksssssaaaa.practice.algorithm.inflearn.section1;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

// 유효한 팰린드롬
class Q1_8 {

    @Test
    void doTest() {
        assertEquals("YES", solution("found7, time: study; Yduts; emit, 7Dnuof"));
        assertEquals("YES", solution("a sd fg #%hjkl; %#$@! lkj&*hgfd s ##a"));
        assertEquals("NO", solution("found7, time: study; Yduts; emit, 7Dnuo"));
    }

    public static String solution(String input) {
        input = input.toLowerCase();

        StringBuilder originalString = new StringBuilder();
        List<Character> reverseArray = new ArrayList<>();

        char[] toCharArray = input.toCharArray();

        for (int i = 0; i < toCharArray.length; i++) {
            if (Character.isAlphabetic(toCharArray[i])) {
                reverseArray.add(toCharArray[i]);
                originalString.append(toCharArray[i]);
            }
        }

        int left = 0;
        int right = reverseArray.size() - 1;

        while (left < right) {
            char prevLeft = reverseArray.get(left);
            reverseArray.set(left, reverseArray.get(right));
            reverseArray.set(right, prevLeft);

            left++;
            right--;
        }

        StringBuilder reverseString = new StringBuilder();

        for (Character c : reverseArray) {
            reverseString.append(c);
        }

        if (originalString.toString().equals(reverseString.toString())) {
            return "YES";
        } else {
            return "NO";
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String input = in.nextLine();

        System.out.println(solution(input));

        return ;
    }
}
