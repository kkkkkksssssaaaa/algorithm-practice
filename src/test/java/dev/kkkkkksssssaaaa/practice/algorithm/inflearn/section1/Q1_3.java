package dev.kkkkkksssssaaaa.practice.algorithm.inflearn.section1;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

// 문장 속 단어
class Q1_3 {

    @Test
    void doTest() {
        assertEquals("study", solution("it is time to study"));
        assertEquals("witouweiotwiowioei", solution("eitoiw iruow witouweiotwiowioei eiiuow e"));
    }

    public String solution(String sentence) {
        int splitLength = sentence.split(" ").length;
        int longestIndex = 0;
        String[] wordArray = new String[splitLength];

        for (int i = 0; i < splitLength; i++) {
            wordArray[i] = sentence.split(" ")[i];

            if (sentence.split(" ")[i].length() > sentence.split(" ")[longestIndex].length()) {
                longestIndex = i;
            }
        }

        return sentence.split(" ")[longestIndex];
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String sentence = in.nextLine();

        System.out.println(new Q1_3().solution(sentence));
        return ;
    }
}
