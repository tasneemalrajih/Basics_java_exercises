package org.example.Exday2;

public class Patient {
    String name ;
    double weight;
    double height;

    public Patient(String n , double w, double h){
        name = n;
        weight = w;
        height = h;
    }
    public double calcBMI(){
        return weight/Math.pow(height/100,2);
    }
    public String getStatus(){
        double bmi = calcBMI();
        if(bmi<18.5) return "Underweigh";
        else if (bmi<25)return "Normal";
        else if (bmi<30) return "Overweight";
        else return "obese";
    }
}
