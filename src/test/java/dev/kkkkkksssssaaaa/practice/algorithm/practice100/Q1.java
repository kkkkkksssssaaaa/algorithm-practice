package dev.kkkkkksssssaaaa.practice.algorithm.practice100;

import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * 학생 정보들을 저장하고 학생 이름으로 검색했을 때 학번을 출력하는 프로그램 작성
 * */
class Q1 {

    @Test
    void doTest() {
    }

    public String solution(String name) {
        List<Student> students =
            List.of(
                new Student("1", "a"),
                new Student("2", "b"),
                new Student("3", "c"),
                new Student("4", "d"),
                new Student("5", "e")
            );

        String findName = "";

        for (Student student : students) {
            if (student.name().equals(name)) {
                findName = student.name();
                break;
            }
        }

        return findName;
    }
}

record Student(String no, String name) {
}