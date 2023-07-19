package com.learning.swch.study;

import java.util.Scanner;

public class ChooseDay {

    public static void main(String[] args) {
        Scanner show1 = new Scanner(System.in);

        System.out.println("Insert number of day: ");
        int day = show1.nextInt();
        String nameday = "";


        switch (day) {
            case 1:
                nameday = "Sunday";
            case 2:
                nameday = "Monday";
            case 3:
                nameday = "Tuesday";
                break;
            default:
                System.out.println("Dont find insert day");

        }

        System.out.println("El día es: "+nameday);
    }
}
