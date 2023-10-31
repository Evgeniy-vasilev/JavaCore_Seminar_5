package org.example;

import java.util.Comparator;
import java.util.List;

public class Students {
    private String name;
    private List<Double> grades;
    private String specialty;

    public Students(String name, List<Double> grades, String specialty) {
        this.name = name;
        this.grades = grades;
        this.specialty = specialty;
    }

    public List<Double> getGrades() {
        return grades;
    }

    public String getSpecialty() {
        return specialty;
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", grades=" + grades +
                ", specialty='" + specialty + '\'' +
                "}\n";
    }

    /**
     * Метод считает среднюю арифметическую оценку студентов со специализацией "Информатика"
     * и сортирует пятерых студентов по возрастанию этой оценки
     * @param students - массив студентов
     */
    public static void averageGrades(List<Students> students) {
        List<Students> result = students.stream()
                .filter(s -> s.getSpecialty().equals("Информатика"))
                .filter(s -> s.getGrades().stream().mapToDouble(Double::doubleValue).average().orElse(0) > 4.5)
                .sorted(Comparator.comparingDouble(s -> s.getGrades().stream().mapToDouble(Double::doubleValue)
                        .average().orElse(0)))
                .limit(5)
                .toList();
        System.out.println(result);
    }
}
