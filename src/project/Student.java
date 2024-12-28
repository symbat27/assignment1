package project;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person {
    private static int idCounter = 1;
    private int studentID;
    private List<Integer> grades;

    public Student(String name, String surname, int age, boolean gender) {
        super(name, surname, age, gender);
        this.studentID = idCounter++;
        this.grades = new ArrayList<>();
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    public double calculateGPA() {
        return grades.stream().mapToInt(i -> i).average().orElse(0);
    }

    @Override
    public String toString() {
        return super.toString() + " I am a student with ID " + studentID + ".";
    }
}
