package com.javarush.task.pro.task06.task0607;

/* 
Добро пожаловать! Но не всем.
*/

public class Solution {

    public static void main(String[] args) {
        signIn("sey");
    }

    public static void signIn(String username) {
        if (username.equals("user")) {
            return;
        } else {
            System.out.println("Добро пожаловать " + username);
            System.out.println("Очень скучали по Вам, " + username);
        }//напишите тут ваш код

    }
}
