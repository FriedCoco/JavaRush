package com.javarush.task.pro.task15.task1522;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Scanner;

/* 
Получение информации по API
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://javarush.ru/api/1.0/rest/projects");
        InputStream input = url.openStream();
        Scanner scanner = new Scanner(input);
        while (scanner.hasNext()) {
            System.out.println(scanner.nextLine());
        }//напишите тут ваш код
    }
}