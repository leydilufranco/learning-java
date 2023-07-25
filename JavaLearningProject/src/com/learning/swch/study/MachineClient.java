package com.learning.swch.study;

import javax.swing.*;

public class MachineClient {
    public static void main(String[] args) {
        Machinating sodaSale = new Machinating();

        String selectedOption = JOptionPane.showInputDialog(null, "Select an Option: \n 1. cocacola \n 2. pepsi \n 3. water \n 4.7Up");

        int type = Integer.parseInt(selectedOption);
        String cant1 = JOptionPane.showInputDialog("Add cant drink ");

        int cant = Integer.parseInt(cant1);


        double result = sodaSale.soldType(type, cant);

        if (result == -1.0) {
            JOptionPane.showMessageDialog(null, "you entered an incorrect option");
        } else {
            JOptionPane.showMessageDialog(null, "the result is: " + result);
        }


    }
}
