package com.javarush.task.pro.task05.task0529;

import java.util.Arrays;

/* 
Галаксианские роботанки (5)
*/

public class Solution {
    public static String robotank = "☖";
    public static String empty = "_";
    public static String hit = "🎯";
    public static int width = 30;
    public static int height = 10;

    public static int tanksCount = 0;
    public static String[][] field = new String[height][width];
    public static int[][] bombs = new int[height][width];

    public static void main(String[] args) {
        for (int i = 0; i < field.length; i++) {
            Arrays.fill(field[i], empty);
        } //Заполняем пустотой

        for (int i = 0; i < field.length; i++) {
            int x = (int) (Math.random() * (width - 1));
            field[i][x] = robotank;
            tanksCount = tanksCount + 1;
        } //Ставим роботанки


        while (tanksCount > 0) {
            bombs = new int[height][width];
            for (int i = 0; i < bombs.length; i++) {
                int bombCount = 10;
                while (bombCount > 0) {
                    int j = (int) (Math.random() * width);
                    if (bombs[i][j] == 0) {
                        bombs[i][j] = 1;
                        bombCount--;
                    }
                }
            } //Ставим бомбы

            for (int i = 0; i < field.length; i++) {
                for (int j = 0; j < field[i].length; j++) {
                    if (robotank.equals(field[i][j])) {
                        if (bombs[i][j] == 1) {
                            field[i][j] = hit;
                            tanksCount = tanksCount - 1;
                        }


                    }
                }

            }
        }//Если бомбы и танки совпадают то записываем попадание


        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                System.out.print(field[i][j]);
            }
            System.out.println();
        } //Выводим поле

    }}
