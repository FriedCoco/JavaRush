package com.javarush.task.pro.task08.task0803;

import java.util.Scanner;

/* 
Минимальный элемент массива
*/

public class Solution {

    public static void main(String[] args) {
        int[] intArray = getArrayOfTenElements();
        System.out.println(min(intArray));
    }

    public static int min(int[] ints) {
        int out = Integer.MAX_VALUE;
        for (int i = 0; i < ints.length; i++) {
            out = Math.min(out,ints[i]);
        }//напишите тут ваш код
        return out;
    }

    public static int[] getArrayOfTenElements() {
        Scanner console = new Scanner(System.in);
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = console.nextInt();
        }//напишите тут ваш код
        return array;
    }
}
