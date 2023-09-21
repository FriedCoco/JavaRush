package com.javarush.task.pro.task12.task1212;

/* 
Создаем свой список
*/

public class CustomStringArrayList {

    private int size;
    private int capacity;
    private String[] elements;

    public CustomStringArrayList() {
        capacity = 10;
        size = 0;
        elements = new String[capacity];
    }

    public void add(String element) {
        if (size == capacity) {
            grow();
        }
        elements[size] = element;
        size++;
    }

    private void grow() {
        capacity = (int) (capacity * 1.5);
        String[] elementsNew = new String[capacity];
        for (int i = 0; i < size; i++) {
            elementsNew[i] = elements[i];
        }
        System.out.println("size "+ elements.length);
        elements = elementsNew;
        System.out.println("size "+ elements.length);
        System.out.println("---");
        //напишите тут ваш код
    }

}
