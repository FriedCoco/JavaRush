package com.javarush.task.pro.task11.task1125;

/* 
Составляем список студентов
*/

public class University {
    private final String[] students = new String[30];

    public void addStudent(String student) {

        for (int i = 0; i < this.students.length; i++) {
            if (this.students[i] == null) {
                this.students[i] = student;
                break;
            }
        }

    }

    public void printStudents() {
        for (String student : this.students) {
            if (student != null) {
                System.out.println(student);
            }
        }
    }

    public static void main(String[] args) {
        University university = new University();
        //напишите тут ваш код
        university.addStudent("Максим Федоренко");
        university.addStudent("Олег Кесарчук");
        university.printStudents();
    }
}
