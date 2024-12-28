package project;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        School school = new School();
        BufferedReader studentReader = new BufferedReader(new FileReader("students.txt"));
        BufferedReader teacherReader = new BufferedReader(new FileReader("teachers.txt"));

        String line;
        while ((line = studentReader.readLine()) != null) {
            String[] parts = line.split(" ");
            Student student = new Student(parts[0], parts[1], Integer.parseInt(parts[2]), parts[3].equals("Male"));
            for (int i = 4; i < parts.length; i++) {
                student.addGrade(Integer.parseInt(parts[i]));
            }
            school.addMember(student);
        }

        while ((line = teacherReader.readLine()) != null) {
            String[] parts = line.split(" ");
            Teacher teacher = new Teacher(parts[0], parts[1], Integer.parseInt(parts[2]), parts[3].equals("Male"),
                    parts[4], Integer.parseInt(parts[5]), Integer.parseInt(parts[6]));
            if (teacher.yearsOfExperience > 10) {
                teacher.giveRaise(10);
            }
            school.addMember(teacher);
        }

        System.out.println(school);
        studentReader.close();
        teacherReader.close();
    }
}