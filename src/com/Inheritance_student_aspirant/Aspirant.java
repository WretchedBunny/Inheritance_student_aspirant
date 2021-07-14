package com.Inheritance_student_aspirant;

public class Aspirant extends Student {
    public Aspirant(String firstName, String lastName, String group, double averageMark) {
        super(firstName, lastName, group, averageMark);
    }

    @Override
    public int getScholarship(double averageMark) {
        if(averageMark >= 5){
            return 200;
        }
        else {
            return 180;
        }
    }
}
