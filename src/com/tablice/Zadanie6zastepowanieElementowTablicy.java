package com.tablice;

import java.util.Arrays;

public class Zadanie6zastepowanieElementowTablicy {

    public static void main(String[] args) {

    int[] tablica1 = {1,3,5,6,8};
    int[] tablica2 = {1,4,6,7,8};

    for (int i = 0; i < tablica1.length; i++){
        if (tablica1[i] == tablica2[i]){
            tablica1[i] = 0;
        }
    }
        System.out.println(Arrays.toString(tablica1));
}
}
