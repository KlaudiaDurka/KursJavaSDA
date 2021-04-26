package com.typyZmiennych;

import java.util.Scanner;

public class ZadanieC {
    public static void main(String[] args) {

        double wzrost, waga, BMI;

        System.out.println("Proszę podać wzrost metrach:");
        Scanner m = new Scanner(System.in);
        wzrost = m.nextDouble();

        System.out.println("Proszę podać wagę w kilogramach:");
        Scanner kg = new Scanner(System.in);
        waga = kg.nextDouble();

        System.out.println("Twoje BMI wynosi:");

        BMI = waga / (wzrost * wzrost);

        System.out.println(BMI);

    }
}
