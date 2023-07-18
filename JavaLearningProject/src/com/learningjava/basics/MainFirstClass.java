package com.learningjava.basics;

public class MainFirstClass {

    public static void main(String[] args) {

        FirstClass printAttributes = new FirstClass();

        printAttributes.setStringValue("Leydi");
        printAttributes.setBooleanValue(true);
        printAttributes.setNumericValue(3);
        printAttributes.setDoubleValue(34.7);
        printAttributes.printAttributes();


    }
}
