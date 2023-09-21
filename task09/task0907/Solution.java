package com.javarush.task.pro.task09.task0907;

import java.util.regex.Pattern;

/* 
Шестнадцатеричный конвертер
*/

public class Solution {
    private static final String HEX = "0123456789abcdef";

    public static void main(String[] args) {
        int decimalNumber = 1256;
        System.out.println("Десятичное число " + decimalNumber + " равно шестнадцатеричному числу " + toHex(decimalNumber));
        String hexNumber = "4e8";
        System.out.println("Шестнадцатеричное число " + hexNumber + " равно десятичному числу " + toDecimal(hexNumber));
    }

    public static String toHex(int decimalNumber) {
        int i = 0;
        String hexNumber = "";
        if (decimalNumber > 0) {
            while (decimalNumber != 0) {
                hexNumber = HEX.charAt((decimalNumber % 16)) +hexNumber;
                decimalNumber = decimalNumber / 16;
                i++;
            }
            return hexNumber;
        } else {
            //напишите тут ваш код
            return "";
        }
    }

    public static int toDecimal(String hexNumber) {
        int decimalNumber = 0;
        if (hexNumber != null && hexNumber != "") {
            for (int i = 0; i < hexNumber.length(); i++) {
                decimalNumber = decimalNumber + Character.getNumericValue(hexNumber.charAt(hexNumber.length()-1-i)) * (int)(Math.pow(16d, i));

            }
            return decimalNumber;
        } else {

            return 0;
        }
    }
}
