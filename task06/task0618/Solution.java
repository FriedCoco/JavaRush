package com.javarush.task.pro.task06.task0618;

/* 
Злобный призрак
*/

public class Solution {
    public static String material = "материальный";
    public static String immaterial = "нематериальный";

    public static void main(String[] args) {
        System.out.println("Из болота вылез нематериальный монстр...");
        switchSword(immaterial);
        //напишите тут ваш код
    }

    public static void switchSword(String newMode) {
        System.out.println("Меч переключен в " + newMode + " режим.");
    }
    //напишите тут ваш код
}
