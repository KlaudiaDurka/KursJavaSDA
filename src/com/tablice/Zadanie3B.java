package com.tablice;

public class Zadanie3B {
    public static void main(String[] args) {
        int tab[] = new int[]{4, 6, 8, 9, 2, 3, 13, 123, 1231};
        int tab2[] = new int[tab.length];
        for (int element : tab) {
            System.out.print(element + " ");
        }
        System.out.println();
        for (int i = 0; i < tab.length; i++) {
            tab2[i] = tab[tab.length - 1 - i];
        }
        for (int element : tab2) {
            System.out.print(element + " ");
        }
    }
}
