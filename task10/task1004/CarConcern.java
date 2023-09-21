package com.javarush.task.pro.task10.task1004;

/* 
Жажда скорости
*/

public class CarConcern {
    private final String manufacturer = "Lamborghini";
    private final String model;
    private final int year;
    private final String color;

    public CarConcern(String model, int year, String color) {
        this.year = year;
        this.color = color;
        this.model = model;
        //напишите тут ваш код
    }

    public CarConcern(String model, int year) {
        this.year = year;
        this.model = model;
        this.color = "Оранжевый";
        //напишите тут ваш код
    }

    public CarConcern(String model) {
        this.year = 4321;
        this.color = "Оранжевый";
        this.model = model;
        //напишите тут ваш код
    }
}
