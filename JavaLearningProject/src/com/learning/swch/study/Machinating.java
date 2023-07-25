package com.learning.swch.study;

public class Machinating {

private double drinkCoca (int cant) {
    double totalCoca = cant * 100;
    return totalCoca;

}

private  double drinkPepsi (int cant) {
double totalPepsi = cant * 200;

        return totalPepsi;
}

private double drinkWater (int cant){
    double totalWater = cant * 300;
    return  totalWater;

}

private  double drink7Up (int cant) {
    double total7Up = cant * 50.10;
    return total7Up;
}

   public double soldType(int type, int cant) {
        double total = 0;

        switch (type) {
            case 1:
                total = drinkCoca(cant);
                break;
            case 2:
                total = drinkPepsi(cant);
            break;
            case 3:
                total = drinkWater(cant);
                break;
            case 4:
                total = drink7Up(cant);
                break;
            default:
                total = -1;

        }
        return total;
    }


}


