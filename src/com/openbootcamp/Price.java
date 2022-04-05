package com.openbootcamp;

import java.util.Scanner;

public class Price {
    public static void main(String[] args) {

        System.out.println("El precio final es de: " + getPrice() );



    }
    static double getPrice(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce Precio: ");
        double precio = scanner.nextDouble();
        double IVA = precio*0.21;
        double precioFinal = precio + IVA;
        return precioFinal;


    }
}
