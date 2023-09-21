package com.javarush.task.pro.task13.task1305;

import java.util.ArrayList;
import java.util.Iterator;

/* 
Найти и обезвредить
*/

public class Solution {

    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("Hello world!");
        words.add("Amigo");
        words.add("Elly");
        words.add("Kerry");
        words.add("Bug");
        words.add("bug");
        words.add("Easy ug");
        words.add("Risha");

        ArrayList<String> copyWordsFirst = new ArrayList<>(words);
        ArrayList<String> copyWordsSecond = new ArrayList<>(words);
        ArrayList<String> copyWordsThird = new ArrayList<>(words);

        removeBugWithFor(copyWordsFirst);
        removeBugWithWhile(copyWordsSecond);
        removeBugWithCopy(copyWordsThird);

        copyWordsFirst.forEach(System.out::println);
        String line = "_________________________";
        System.out.println(line);
        copyWordsSecond.forEach(System.out::println);
        System.out.println(line);
        copyWordsThird.forEach(System.out::println);
        System.out.println(line);
    }

    public static void removeBugWithFor(ArrayList<String> list) {
        for (int i = list.size()-1; i >= 0; i--) {
            if (list.get(i).equalsIgnoreCase("bug")){
                list.remove(i);
            }
        }//напишите тут ваш код
    }

    public static void removeBugWithWhile(ArrayList<String> list) {
        Iterator<String> temp = list.iterator();
        while (temp.hasNext()){
            if (temp.next().equalsIgnoreCase("bug")){
                temp.remove();
            }
        }
        //напишите тут ваш код
    }

    public static void removeBugWithCopy(ArrayList<String> list) {
        ArrayList<String> listNew = new ArrayList<>(list);
        for (String temp : listNew){
            if (temp.equalsIgnoreCase("bug")){
                list.remove(temp);
            }

        }
        //напишите тут ваш код
    }
}
