package com.typyZmiennych;

import java.util.Scanner;

public class ZadanieB {
    public static void main(String[] args) {

        double C, F;

        System.out.println("Proszę podać liczbę");
        Scanner Celciusz = new Scanner(System.in);

        C = Celciusz.nextDouble();

        System.out.println("Podana temperatura w stopniach Celciusza w przeliczeniu na Fahrenheity wynosi:");
        F = 32 + 1.8 * C;
        System.out.println(F);
        }
    }

