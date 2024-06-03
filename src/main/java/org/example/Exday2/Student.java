package org.example.Exday2;

import jdk.dynalink.beans.StaticClass;

public class Student {

    String name;
    private double mark;
    static int fullMark;

    public Student(String name, double mark){
        this.name = name;
        this.mark = mark;
    }

    public double getPercent(){
        return mark/fullMark;
    }
    public String getGrade(){
        if(mark>85) return "Excllent";
        else if (mark>75)return "Very Good";
        else if (mark>65) return "Good";
        else if (mark>=50) return "Pass";
        else return "Fail";
    }
    public double getMark(){
        return mark;
    }
    public  void setmark(double mark){
        if(mark >= 0){
            this.mark=mark;
        }
    }
}
