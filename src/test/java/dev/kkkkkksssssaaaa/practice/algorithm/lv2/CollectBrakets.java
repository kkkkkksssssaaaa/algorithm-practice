package dev.kkkkkksssssaaaa.practice.algorithm.lv2;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

// 올바른 괄호
class CollectBrakets {

    @Test
    void doTest1() {
        assertTrue(solution("()()"));
        assertTrue(solution("(())()"));
        assertFalse(solution(")()("));
        assertFalse(solution("(()("));
        assertFalse(solution("(((((((((((((((((((((((((((((()"));
    }

    public boolean solution(String s) {
        Stack<Character> characterStack = new Stack<>();

        if (isClose(s.charAt(0))) {
            return false;
        }

        for (char bracket : s.toCharArray()) {
            if (isOpen(bracket)) {
                characterStack.push(bracket);
            } else {
                if (!characterStack.isEmpty()) {
                    characterStack.pop();
                }
            }
        }

        return characterStack.size() == 0;
    }

    private boolean isOpen(char s) {
        return s == '(';
    }

    private boolean isClose(char s) {
        return s == ')';
    }
}
