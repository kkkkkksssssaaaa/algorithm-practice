package dev.kkkkkksssssaaaa.practice.algorithm.lv1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

// 문자열 다루기
class HandlingString {

    public boolean solution(String s) {
        if (s.length() == 4 || s.length() == 6) {
            try {
                Integer.valueOf(s);
                return true;
            } catch (NumberFormatException e) {
                return false;
            }
        }

        return false;
    }
}
