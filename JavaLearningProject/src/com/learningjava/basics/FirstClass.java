package com.learningjava.basics;

public class FirstClass {

    private String stringValue;
    private int numericValue;
    private boolean booleanValue;
    private double doubleValue;

    public String getStringValue() {
        return stringValue;
    }

    public void setStringValue(String stringValue) {
        this.stringValue = stringValue;
    }

    public int getNumericValue() {
        return numericValue;
    }

    public void setNumericValue(int numericValue) {
        this.numericValue = numericValue;
    }

    public boolean isBooleanValue() {
        return booleanValue;
    }

    public void setBooleanValue(boolean booleanValue) {
        this.booleanValue = booleanValue;
    }

    public double getDoubleValue() {
        return doubleValue;
    }

    public void setDoubleValue(double doubleValue) {
        this.doubleValue = doubleValue;
    }

    public void printAttributes() {

        System.out.println("String Value: " + stringValue + " Boolean Value: " + booleanValue);
        System.out.println("Double Value: " + doubleValue + " " + "Inter Value: " + numericValue);


    }

}