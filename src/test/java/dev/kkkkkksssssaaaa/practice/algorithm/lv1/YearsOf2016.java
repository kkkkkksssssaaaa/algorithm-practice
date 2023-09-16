package dev.kkkkkksssssaaaa.practice.algorithm.lv1;

import org.junit.jupiter.api.Test;

import java.time.DayOfWeek;
import java.time.LocalDate;

class YearsOf2016 {

    public String solution(int a, int b) {
        LocalDate date = LocalDate.of(2016, a, b);

        DayOfWeek dayOfWeek = date.getDayOfWeek();

        switch (dayOfWeek) {
            case SUNDAY:
                return "SUN";
            case MONDAY:
                return "MON";
            case TUESDAY:
                return "TUE";
            case WEDNESDAY:
                return "WED";
            case THURSDAY:
                return "THU";
            case FRIDAY:
                return "FRI";
            case SATURDAY:
                return "SAT";
            default:
                return "";
        }
    }
}
