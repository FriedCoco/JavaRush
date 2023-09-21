package com.javarush.task.pro.task05.task0507;

import java.util.Scanner;

/* 
Максимальное из N чисел
*/

public class Solution {
    public static int[] array;

    public static void main(String[] args) throws Exception {
        Scanner console = new Scanner(System.in);
        int amount = console.nextInt();
        int max = Integer.MIN_VALUE;
        if (amount > 0) {
            array = new int[amount];
            for (int i = 0; i < amount; i++) {
                array[i] = console.nextInt();
                if (array[i] > max) {
                    max = array[i];
                }
            }

        }
        System.out.println(max);//напишите тут ваш код
    }
}
