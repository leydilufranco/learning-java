package com.learning.swch.study;

import javax.swing.*;

public class CalculatorClient {

   public static void main(String[] args) {
         Calculator myCalculator = new Calculator();

        String selectedOption = JOptionPane.showInputDialog(null, "Select an Option: \n 1. addition \n 2. subtraction \n 3. multiplication \n 4.division");

        int type = Integer.parseInt(selectedOption);
        String number1 = JOptionPane.showInputDialog("Enter first number ");

        double number1Double = Double.parseDouble(number1);

        String number2 = JOptionPane.showInputDialog("Enter second number ");

        double number2Double = Double.parseDouble(number2);

       double result = myCalculator.operationType(type,number1Double, number2Double);

       if(result == -1.0){
           JOptionPane.showMessageDialog(null, "you entered an incorrect option");
       }else{
           JOptionPane.showMessageDialog(null,"the result is: "+ result);
        }

    }
}
