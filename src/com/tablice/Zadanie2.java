package com.tablice;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Zadanie2 {
    public static void main(String[] args) {

        String[] tab = {"Adam", "Arkadiusz", "Kuba", "Ida", "Mia"};
        String suma = "";
        for (String element : tab) {
            //if(element.length()<5)
            suma = suma + element + " ";
        }
        System.out.println(suma);
    }
}