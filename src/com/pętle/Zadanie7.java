package com.pętle;

import java.util.Scanner;

public class Zadanie7 {
    public static void main(String[] args) {

        String listaProduktow = "";
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i <=5 ; i++) {
            System.out.println("Podaj nazwe produktu " );
            String produkt = sc.next();
            listaProduktow += produkt;
            listaProduktow += ", ";
        }
        System.out.println("Lista zakupów: " + listaProduktow);
    }
}