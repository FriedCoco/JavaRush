package com.javarush.task.pro.task18.task1802;

import java.util.Comparator;

/* 
Сортировка по возрасту
*/

public class AgeComparator implements Comparator<Student> {
    public int compare (Student student1, Student student2)
    {
        int age1 = student1.getAge();
        int age2 = student2.getAge();
        return age2-age1;
    }//напишите тут ваш код
}
