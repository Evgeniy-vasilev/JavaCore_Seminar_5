package org.example;

import java.util.*;
import java.util.Comparator;

/**
 * Имеется список студентов. Каждый студент имеет имя, список оценок и специальность.
 * Найдите первых 5 студентов специальности "Информатика" с средним баллом выше 4.5,
 * отсортированных по убыванию среднего балла.
 * В решении не использовать циклы! Только StreamAPI
 */
public class Main {
    public static void main(String[] args) {
        List<Students> students = new ArrayList<>();
        Students student1 = new Students("Petr", Arrays.asList(4.3, 4.6, 5.0, 4.7), "Информатика");
        Students student2 = new Students("Petr2", Arrays.asList(4.3, 4.7, 5.0, 4.7), "Информатика");
        Students student3 = new Students("Petr3", Arrays.asList(4.3, 4.9, 5.0, 4.9), "Математика");
        Students student4 = new Students("Petr4", Arrays.asList(4.4, 4.9, 6.0, 4.7), "Информатика");
        Students student5 = new Students("Petr5", Arrays.asList(4.3, 4.5, 5.0, 4.7), "Математика");
        Students student6 = new Students("Petr6", Arrays.asList(4.8, 4.9, 5.0, 4.7), "Информатика");
        Students student7 = new Students("Petr7", Arrays.asList(4.7, 2.9, 5.0, 4.7), "Информатика");
        Students student8 = new Students("Petr8", Arrays.asList(4.6, 4.6, 5.0, 4.7), "Информатика");
        Students student9 = new Students("Petr9", Arrays.asList(5.6, 4.8, 5.2, 4.7), "Информатика");
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);
        students.add(student7);
        students.add(student8);
        students.add(student9);

        Students.averageGrades(students);
    }
}