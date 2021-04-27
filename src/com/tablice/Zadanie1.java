package com.tablice;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class Zadanie1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int suma = 0;
        int mediana = 0;
        int size = sc.nextInt();
        int[] tab1 = new int[size];
        for (int i = 0; i < tab1.length; i++) {
            tab1[i] = rand.nextInt(100);
        }
        Arrays.sort(tab1);
        for (int liczba : tab1) {
            System.out.print(liczba + ", ");
            suma += liczba;
            //       System.out.println(suma);
        }
        System.out.println();
        if (tab1.length % 2 != 0)
            mediana = tab1[tab1.length / 2];
        else
            mediana = (tab1[tab1.length / 2] + tab1[tab1.length / 2 + 1]) / 2;
        System.out.println("suma = " + suma);
        System.out.println("Średnia = " + (suma / tab1.length));
        System.out.println("Mediana" + mediana);
    }
}
