package com.learning.swch.study;

import javax.swing.*;

public class Calculator {


    private double add(double number1, double number2) {
        double result = number1 + number2;

        return result;
    }

    private double substract(double number1, double number2) {
        double result = number1 - number2;

        return result;
    }

    private double multiplication(double number1, double number2) {
        double result = number1 * number2;

        return result;
    }

    private double division(double number1, double number2) {
        double result = 0;
        if (number2 != 0) {
            result = number1 / number2;
        } else {
            System.out.println("it is not possible to divide by 0");
        }

        return result;
    }

    public double operationType(int type, double number1, double number2) {
        double result = 0;

        switch (type) {
            case 1:
                result = add(number1, number2);
                break;
            case 2:
                result = substract(number1, number2);
                break;
            case 3:
                result = multiplication(number1, number2);
                break;
            case 4:
                result = division(number1, number2);
                break;
            default:
                result = -1.0;

        }

        return result;
    }

}

