package com.javarush.task.pro.task16.task1604;

import java.util.Calendar;
import java.util.GregorianCalendar;

/* 
День недели рождения твоего
*/

public class Solution {

    static Calendar birthDate = new GregorianCalendar(1994, Calendar.DECEMBER, 30);

    public static void main(String[] args) {
        System.out.println(getDayOfWeek(birthDate));
    }

    static String getDayOfWeek(Calendar calendar) {
        int dow = calendar.get(Calendar.DAY_OF_WEEK);//напишите тут ваш код

        if (dow == Calendar.MONDAY) return "Понедельник";
        if (dow == Calendar.TUESDAY) return "Вторник";
        if (dow == Calendar.WEDNESDAY) return "Среда";
        if (dow == Calendar.THURSDAY) return "Четверг";
        if (dow == Calendar.FRIDAY) return "Пятница";
        if (dow == Calendar.SATURDAY) return "Суббота";
        if (dow == Calendar.SUNDAY) return "Воскресенье";
else

        return null;
    }
}
