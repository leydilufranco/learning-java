package com.learning.basics.practice;


public class InformationBMI {

    private double weight;
    private double height;
    private double result;

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void calculateBMI() {

        result = weight / (height * height) ;

        if (result <= 18.5) {

            System.out.println("Your BMI is Underweight " + result);
        } else if (result > 18.5 && result <= 24.9) {

            System.out.println("your BMI is Normal weight " + result);


        } else if (result >= 25.0 && result <= 29.0) {

            System.out.println(" Your BMI is Overweight " + result);

        } else if (result >= 30.0) {
            System.out.println( " your BMI is Obesity " +result);

        }
    }
}
