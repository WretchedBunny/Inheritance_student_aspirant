package com.Inheritance_student_aspirant;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Student member = new Aspirant("Adam", "Primstone", "ACD", 5.5);

        Student[] students = new Student [3];

        students[0] = member;
        students[1] = new Student("James", "Stuntman", "ABC", 4.5);
        students[2] = new Student("Carol", "Monroe", "CDA", 4.6);

        for (Student student: students) {
            System.out.println(student.getScholarship(student.getAverageMark()));
        }

    }
}
