package com.javarush.task.pro.task18.task1803;

import java.util.Comparator;

/* 
Наставники JavaRush
*/

public class NameComparator implements Comparator<JavaRushMentor>{
    public int compare (JavaRushMentor men1, JavaRushMentor men2)
    {
        String name1 = men1.getName();
        String name2 = men2.getName();
        int name1Length = name1.length();
        int name2Length = name2.length();
        return name1Length - name2Length;
    }//напишите тут ваш код
}
