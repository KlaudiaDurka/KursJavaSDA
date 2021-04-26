package com.pętle;

import java.util.Scanner;

public class Zadanie10 {
    public static void main(String[] args) {
        System.out.println("Podaj liczbę");
        Scanner sc = new Scanner(System.in);

        int suma = 0;
        int liczba = 1;

        while (liczba != 0) {
            liczba = sc.nextInt();
            suma += liczba;
        }
        System.out.println("Suma tych liczb to: " + suma);
    }
}