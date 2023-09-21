package com.javarush.task.pro.task13.task1309;

import java.util.HashMap;

/* 
Успеваемость студентов
*/

public class Solution {
    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
        System.out.println(grades);
    }

    public static void addStudents() {
        grades.put("A", 1.0);
        grades.put("B", 2.0);
        grades.put("C", 3.0);
        grades.put("D",4.0 );
        grades.put("E", 5.0);
        //напишите тут ваш код
    }
}
