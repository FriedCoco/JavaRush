package com.javarush.task.pro.task16.task1601;

import java.util.Calendar;
import java.util.Date;

/* 
Лишь бы не в понедельник :)
*/

public class Solution {

    static Date birthDate = new Date("Dec 30 12:15:00 1994") ;

    public static void main(String[] args) {
        System.out.println(getDayOfWeek(birthDate));
    }

    static String getDayOfWeek(Date date) {
        int day = date.getDay();
        if (day == 0) return "Воскресенье";
        if (day == 1) return "Понедельник";
        if (day == 2) return "Вторник";
        if (day == 3) return "Среда";
        if (day == 4) return "Четверг";
        if (day == 5) return "Пятница";
        if (day == 6) return "Суббота";
        else return null;//напишите тут ваш код


    }
}
