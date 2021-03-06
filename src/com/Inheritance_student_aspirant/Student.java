package com.Inheritance_student_aspirant;

public class Student {
    private String firstName;
    private String lastName;
    private String group;
    private double averageMark;

    public Student(String firstName, String lastName, String group, double averageMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
    }

    public double getAverageMark(){
        return averageMark;
    }
    public int getScholarship(double averageMark){
        if(averageMark >= 5){
            return 100;
        }
        else{
            return 80;
        }
    }

}
