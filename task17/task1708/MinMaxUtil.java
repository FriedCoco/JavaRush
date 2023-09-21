package com.javarush.task.pro.task17.task1708;

/* 
Минимальное и максимальное
*/

public class MinMaxUtil {
    public static int min(int a, int b) {
        int min = Integer.MAX_VALUE;
        if (a < min) min = a;
        if (b < min) min = b;
        return min;
    }

    public static int min(int a, int b, int c) {
        int min = Integer.MAX_VALUE;
        if (a < min) min = a;
        if (b < min) min = b;
        if (c < min) min = c;
        return min;
    }

    public static int min(int a, int b, int c, int d) {
        int min = Integer.MAX_VALUE;
        if (a < min) min = a;
        if (b < min) min = b;
        if (c < min) min = c;
        if (d < min) min = d;
        return min;
    }

    public static int min(int a, int b, int c, int d, int e) {
        int min = Integer.MAX_VALUE;
        if (a < min) min = a;
        if (b < min) min = b;
        if (c < min) min = c;
        if (d < min) min = d;
        if (e < min) min = e;
        return min;
    }

    public static int max(int a, int b) {
        int max = Integer.MIN_VALUE;
        if (a > max) max = a;
        if (b > max) max = b;
        return max;
    }

    public static int max(int a, int b, int c) {
        int max = Integer.MIN_VALUE;
        if (a > max) max = a;
        if (b > max) max = b;
        if (c > max) max = c;
        return max;
    }

    public static int max(int a, int b, int c, int d) {
        int max = Integer.MIN_VALUE;
        if (a > max) max = a;
        if (b > max) max = b;
        if (c > max) max = c;
        if (d > max) max = d;
        return max;
    }

    public static int max(int a, int b, int c, int d, int e) {
        int max = Integer.MIN_VALUE;
        if (a > max) max = a;
        if (b > max) max = b;
        if (c > max) max = c;
        if (d > max) max = d;
        if (e > max) max = e;
        return max;
    }


    //напишите тут ваш код
}
