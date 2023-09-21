package com.javarush.task.pro.task05.task0505;

import java.util.Scanner;

/* 
Reverse
*/

public class Solution {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int amount = console.nextInt();
        if (amount > 0) {
            int[] number = new int[amount];
            for (int i = 0; i < amount; i++) {
                number[i] = console.nextInt();
            }
            if (amount % 2 != 0) {
                for (int i = 0; i < amount; i++) {
                    System.out.println(number[i]);
                }
            }
            if (amount % 2 == 0) {
                for (int i = amount-1; i >= 0; i--) {
                    System.out.println(number[i]);
                }
            }
        }
        //напишите тут ваш код
    }
}
