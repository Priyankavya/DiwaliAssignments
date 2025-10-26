
package com.demo.test;
import java.io.*;
import java.util.*;

import Student.LowAttendanceException;
import Student.Student;

public class StudentTest {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        // Creating 10 student objects
        students.add(new Student(1, "Alice", "Math", 85, 92));
        students.add(new Student(2, "Bob", "Science", 58, 78));
        students.add(new Student(3, "Charlie", "History", 90, 88));
        students.add(new Student(4, "David", "Math", 65, 70));
        students.add(new Student(5, "Eva", "Science", 75, 95));
        students.add(new Student(6, "Frank", "History", 55, 60));
        students.add(new Student(7, "Grace", "Math", 95, 99));
        students.add(new Student(8, "Hannah", "Science", 62, 85));
        students.add(new Student(9, "Ian", "History", 80, 77));
        students.add(new Student(10, "Jane", "Math", 59, 68));

        // Serialize to file
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("students.ser"))) {
            for (Student s : students) {
                oos.writeObject(s);
            }
            System.out.println("✅ Students serialized to students.ser");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Sort students by attendance in descending order
        Collections.sort(students);

        System.out.println("\n📊 Students sorted by attendance:");
        for (Student s : students) {
            System.out.println(s);
            try {
                String grade = s.calculateGrade();
                System.out.println("   Grade: " + grade);
            } catch (LowAttendanceException e) {
                System.out.println("   ⚠️ " + e.getMessage());
            }
        }
    }
}
