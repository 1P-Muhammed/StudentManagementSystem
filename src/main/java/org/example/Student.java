package org.example;

public class Student {

    // Attributes
    private int id;
    private String name;
    private int[] grade = new int[2];

    // Constructor
    public Student(int id, String name, int grade1, int grade2){
        this.id = id;
        this.name = name;
        this.grade[0] = grade1;
        this.grade[1] = grade2;
    }

    // Methods

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getFinalGrade() {
        return ((grade[0] + grade[1]) / 2.0);
    }

    public String getStatus() {
        double grade = getFinalGrade();
        if(grade >= 90) {
            return "Excellent";
        } else if (grade >= 75) {
            return "Very Good";
        } else if (grade >= 60) {
            return "Pass";
        } else {
            return "Fail";
        }
    }

    public void display() {
        System.out.println(
                "ID: " + id +
                " | Name: " + name +
                " | Subject 1: " + grade[0] +
                " | Subject 2: " + grade[1] +
                " | Final Grade: " + getFinalGrade() +
                " | Status: " + getStatus()
        );
    }
}
