package com.javarush.task.pro.task16.task1607;

import java.time.LocalDate;
import java.time.Month;
import java.util.Calendar;

/* 
Освоение нового API
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(nowExample());
        System.out.println(ofExample());
        System.out.println(ofYearDayExample());
        System.out.println(ofEpochDayExample());
    }

    static LocalDate nowExample() {
        var today = LocalDate.now();//напишите тут ваш код

        return today;
    }

    static LocalDate ofExample() {
        var notToday = LocalDate.of(2020, Month.SEPTEMBER, 12);//напишите тут ваш код

        return notToday;
    }

    static LocalDate ofYearDayExample() {
        var notToday = LocalDate.ofYearDay(2020, 256);//напишите тут ваш код

        return notToday;
        //напишите тут ваш код


    }

    static LocalDate ofEpochDayExample() {
        var notToday = LocalDate.ofEpochDay(18517);//напишите тут ваш код

        return notToday;//напишите тут ваш код


    }
}
