package com.typyZmiennych;

import java.util.Scanner;

public class ZadanieD {
    public static void main(String[] args) {
        //dane
        double dystans ;
        int godziny;
        int minuty;
        int sekundy;

        Scanner input = new Scanner(System.in);
        //zczytywanie
        System.out.println("Proszę podać dystans w metrach:");
        dystans = input.nextDouble();

        System.out.println("Proszę podać pełne godziny:");
        godziny = input.nextInt();

        System.out.println("Proszę podać pełne minuty:");
        minuty = input.nextInt();

        System.out.println("Proszę podać sekundy:");
        sekundy = input.nextInt();


        //obliczenia
        int suma_sekund = godziny * 3600 + minuty * 60 + sekundy;
        double suma_godzin = godziny + (minuty / 60) + (sekundy / 3600);
        double mile = dystans / 1609;

        double metry_na_sekunde = dystans / suma_sekund;

        double metry_na_godzine = dystans / suma_godzin;

        double mile_na_godzine = mile / suma_godzin;


        //drukowanie

        System.out.println("predkosc w metrach na seksunde to: " + metry_na_sekunde);
        System.out.println("predkosc w metrach na godzine to: " + metry_na_godzine);
        System.out.println("predkosc w milach na godzine to: " + mile_na_godzine);
    }
}
