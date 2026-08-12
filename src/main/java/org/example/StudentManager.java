package org.example;

import java.util.Scanner;

public class StudentManager {

    private Student[] students;

    // Constructor
    public StudentManager(Student[] students) {
        this.students = students;
    }

    // Display all students
    public void displayStudents() {
        for (Student student : students) {
            student.display();
        }
    }

    // Calculate class average
    public void calculateAverage() {
        double total = 0;

        for (Student student : students) {
            total += student.getFinalGrade();
        }

        double average = total / students.length;

        System.out.println("\nClass Average is: " + average);
    }

    // Find student with highest grade
    public void findHighestGrade() {

        Student highest = students[0];

        for (int i = 0; i < students.length; i++) {

            if (students[i].getFinalGrade() > highest.getFinalGrade()) {
                highest = students[i];
            }
        }

        System.out.println("\nHighest Grade:");
        highest.display();
    }

    // Search student by ID
    public void searchStudent(Scanner scanner) {

        System.out.print("Enter Student ID: ");
        int id = scanner.nextInt();

        boolean found = false;

        for (Student student : students) {

            if (student.getId() == id) {
                System.out.println("\nStudent found:");
                student.display();

                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Student not found.");
        }
    }

    // Count passed and failed students
    public void countPassedAndFailed() {

        int passed = 0;
        int failed = 0;

        for (Student student : students) {

            if (student.getFinalGrade() >= 60) {
                passed++;
            } else {
                failed++;
            }
        }

        System.out.println("Passed students: " + passed);
        System.out.println("Failed students: " + failed);
    }
}