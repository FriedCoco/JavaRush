package com.javarush.task.pro.task05.task0506;

import java.util.Scanner;

/* 
Минимальное из N чисел
*/

public class Solution {
    public static int[] array;

    public static void main(String[] args) throws Exception {
        Scanner console = new Scanner(System.in);
        int amount = console.nextInt();
        int min = Integer.MAX_VALUE;
        if (amount > 0) {
            array = new int[amount];
            for (int i = 0; i < amount; i++) {
                array[i] = console.nextInt();
                if (array[i] < min) {
                    min = array[i];
                }
            }

        }
        System.out.println(min);
    }

}

//напишите тут ваш код


