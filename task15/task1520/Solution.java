package com.javarush.task.pro.task15.task1520;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/* 
Перемещение файлов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Path sourceDirectory = Path.of(scanner.nextLine());
        Path targetDirectory = Path.of(scanner.nextLine());
        try (DirectoryStream<Path> sourceDirContains = Files.newDirectoryStream(sourceDirectory)) {
            for (Path file : sourceDirContains) {
                if (Files.isRegularFile(file)){
                    System.out.println(file.toString());
                    System.out.println(targetDirectory.toString());
                    Path pathGen = targetDirectory.resolve(file.getFileName());
                    System.out.println(pathGen.toString());
                    Files.move(file, pathGen);
                }
            }
        }//напишите тут ваш код
    }
}

