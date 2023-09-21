package com.javarush.task.pro.task05.task0511;

import java.util.Scanner;

/* 
Создаем двумерный массив
*/

public class Solution {
    public static int[][] multiArray;

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int x = console.nextInt();
        multiArray = new int[x][];
        for (int i = 0; i < multiArray.length; i++) {
            int y = console.nextInt();
            multiArray[i] = new int[y];
            for (int j = 0; j < multiArray[i].length; j++) {

            }
        }//напишите тут ваш код
    }
}
