package org.example;

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
}
