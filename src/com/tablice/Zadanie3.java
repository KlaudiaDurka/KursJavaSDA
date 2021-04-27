package com.tablice;

public class Zadanie3 {
    public static void main(String[] args) {
        int[] tab1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] tab2 = new int[tab1.length];
        for (int i = 0; i < tab1.length; i++) {
            tab2[i] = tab1[tab1.length - i - 1];
        }
        System.out.print("Tablica 1: ");
        for (int liczba : tab1) {
            System.out.print(liczba + " ");
        }
        System.out.println();
        System.out.print("Tablica 2: ");
        for (int liczba : tab2) {
            System.out.print(liczba + " ");
        }
    }
}

