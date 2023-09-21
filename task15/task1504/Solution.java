package com.javarush.task.pro.task15.task1504;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/* 
Перепутанные байты
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner console = new Scanner(System.in);
        try ( InputStream inputStream = Files.newInputStream(Path.of(console.nextLine()));
              OutputStream outputStream = Files.newOutputStream(Path.of(console.nextLine()))){
            while (inputStream.available() > 1){
                int first = inputStream.read();
                int second = inputStream.read();
                outputStream.write(second);
                outputStream.write(first);
            }
            int last = inputStream.read();
            if (last % 2 != 0){
                outputStream.write(last);
            }
        }


        //напишите тут ваш код
    }
}

