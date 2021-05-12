package com.tablice;

import java.util.Arrays;
import java.util.Random;

public class Zadanie5MaxMin {
    public static void main(String[] args) {

        int[] tablica = new int[10];
        Random rand = new Random();


        for (int i = 0; i < tablica.length; i++) {
            tablica[i] = rand.nextInt(100);
        }
        for (int liczba : tablica) {
            System.out.println(liczba);
        }
        maxMin(tablica);
    }

    public static void maxMin(int[] tablica) {
        Arrays.sort(tablica);
        System.out.println("Max: " + tablica[tablica.length - 1]);
        System.out.println("Min: " + tablica[0]);
        System.out.println("Drugi Max: " + tablica[tablica.length - 2]);

    }
}
