package com.javarush.task.pro.task07.task0720;

public class Nimrod {
    public static int laser = 100000;
    public static int rocket = 10000;
    public static int angelicaKiss;
    public int health = 1000000;

    public void defend (int a) {
        health = health - applyShield(a);
    }
    public int attack (){
        return angelicaKiss;
    }

    public byte applyShield (int b){
        byte temp;
        temp = (byte)(b);
        return temp;
    }
}
