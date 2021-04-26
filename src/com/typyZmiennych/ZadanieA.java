package com.typyZmiennych;
import java.util.Scanner;
public class ZadanieA {
    public static void main(String[] args) {

        // 1 cal = 2.54 cm

        double cm;
        double inch;

        System.out.println("Proszę podać liczbę");
        Scanner centymetry = new Scanner(System.in);

        cm = centymetry.nextDouble();

        System.out.println("Podana długość w centymetrach w przeliczeniu na cale wynosi:");

        inch = cm/2.54;

        System.out.println(inch);
    }
}
