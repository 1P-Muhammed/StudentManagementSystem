package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = scanner.nextInt();

        Student[] students = new Student[n];

        // Input students
        for (int i = 0; i < students.length; i++) {

            System.out.println("\nStudent " + (i + 1));

            System.out.print("Enter ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Enter Name: ");
            String name = scanner.nextLine();

            int grade1;

            do {
                System.out.print("Enter grade for subject 1 (0 - 100): ");
                grade1 = scanner.nextInt();

                if (grade1 < 0 || grade1 > 100) {
                    System.out.println(
                            "Invalid grade, Please enter a grade between 0 and 100."
                    );
                }

            } while (grade1 < 0 || grade1 > 100);


            int grade2;

            do {
                System.out.print("Enter grade for subject 2 (0 - 100): ");
                grade2 = scanner.nextInt();

                if (grade2 < 0 || grade2 > 100) {
                    System.out.println(
                            "Invalid grade, Please enter a grade between 0 and 100."
                    );
                }

            } while (grade2 < 0 || grade2 > 100);

            students[i] = new Student(id, name, grade1, grade2);
        }

        // Create StudentManager
        StudentManager manager = new StudentManager(students);

        int choice;

        do {

            System.out.println("==============================");
            System.out.println("1. Display Students");
            System.out.println("2. Calculate Average Grade");
            System.out.println("3. Find Highest Grade");
            System.out.println("4. Search Student by ID");
            System.out.println("5. Count Passed and Failed");
            System.out.println("0. Exit");
            System.out.println("==============================");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    manager.displayStudents();
                    break;

                case 2:
                    manager.calculateAverage();
                    break;

                case 3:
                    manager.findHighestGrade();
                    break;

                case 4:
                    manager.searchStudent(scanner);
                    break;

                case 5:
                    manager.countPassedAndFailed();
                    break;

                case 0:
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 0);

        scanner.close();

    }
}