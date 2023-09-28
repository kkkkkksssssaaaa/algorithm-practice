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
    }

    public boolean solution(String s) {
        Queue<Character> brackets = new LinkedList<>();
        Stack<Character> characterStack = new Stack<>();

        for (char bracket : s.toCharArray()) {
            brackets.add(bracket);
        }

        boolean result = true;

        while(brackets.size() > 0 && result) {
            Character character = brackets.poll();

            if (isOpen(character)) {
                characterStack.push(character);

                if (brackets.isEmpty()) {
                    result = false;
                }
            }

            if (isClose(character)) {
                if (characterStack.isEmpty()) {
                    result = false;
                } else {
                    Character popped = characterStack.pop();

                    if (isClose(popped)) {
                        result = false;
                    }
                }
            }
        }

        return result;
    }

    private boolean isOpen(Character s) {
        return s.equals('(');
    }

    private boolean isClose(Character s) {
        return s.equals(')');
    }
}
