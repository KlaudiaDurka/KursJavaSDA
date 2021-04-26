package com.IFwarunkowe;

import java.util.Scanner;

public class Zadanie7 {
        public static void main(String[] args) {
        System.out.println("Podaj nazwę dnia tygodnia ");
        Scanner sc = new Scanner(System.in);
        String dzien = sc.next();
        switch (dzien) {
            case "Poniedziałek": {
                System.out.println("1");
                break;
            }
            case "Wtorek": {
                System.out.println("2");
                break;
            }
            case "Środa": {
                System.out.println("3");
                break;
            }
            case "Czwartek": {
                System.out.println("4");
                break;
            }
            case "Piątek": {
                System.out.println("5");
                break;
            }
            case "Sobota": {
                System.out.println("6");
                break;
            }
            case "Niedziela": {
                System.out.println("7");
                break;
            }
            default: {
                System.out.println("nie istnie dzień tygodnia o podanej nazwie");
                break;
            }
        }
    }
}