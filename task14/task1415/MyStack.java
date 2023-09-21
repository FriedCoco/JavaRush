package com.javarush.task.pro.task14.task1415;

import java.util.LinkedList;
import java.util.List;

/* 
Стек в домашних условиях
*/

public class MyStack {

    private final List<String> storage = new LinkedList<>();

    public void push(String s) {
        storage.add(0, s);//напишите тут ваш код
    }

    public String pop() {
        String temp = storage.get(0);
        storage.remove(0);
        return temp;
        //напишите тут ваш код
    }

    public String peek() {
        return storage.get(0);//напишите тут ваш код
    }

    public boolean empty() {
        return storage.isEmpty();
        //напишите тут ваш код
    }

    public int search(String s) {
        for (String temp : storage) {
            if (temp.equalsIgnoreCase(s)) {
                return storage.indexOf(s);
            }
        }
        return -1;
        //напишите тут ваш код
    }
}
