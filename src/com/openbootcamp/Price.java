package com.openbootcamp;

public class Price {
    public static void main(String[] args) {

        double resut = getPrice(245, 10.5);
        System.out.println("El precio final es de: " + resut + " €");

    }
    static double getPrice(double precio, double IVA){
        return precio+((precio*IVA)/100);
    }
}
