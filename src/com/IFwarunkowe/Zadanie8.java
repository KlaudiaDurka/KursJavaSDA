package com.IFwarunkowe;

import java.util.Scanner;

public class Zadanie8 {
    public static void main(String[] args)
    {
        double pierwsza_liczba;
        double druga_liczba;
        char znak;
        Scanner wej = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę:");
        pierwsza_liczba = wej.nextInt();
        System.out.println("Podaj drugą liczbę:");
        druga_liczba = wej.nextInt();

        System.out.println("Dodawanie dwóch liczb - wciśnij +");
        System.out.println("Odejmowanie dwóch liczb - wciśnij -");
        System.out.println("Mnożenie dwóch liczb - wciśnij *");
        System.out.println("Dzielenie dwóch liczb - wciśnij /");
        System.out.println("Potęgowanie dwóch liczb - wciśnij ^");
        System.out.println("Pierwiastkowanie dwóch liczb - wciśnij $");

        znak = wej.next().charAt(0);
        switch(znak)
        {
            case '+':
            {
                System.out.println(pierwsza_liczba + druga_liczba);
                break;
            }
            case '-':
            {
                System.out.println(pierwsza_liczba - druga_liczba);
                break;
            }
            case '*':
            {
                System.out.println(pierwsza_liczba * druga_liczba);
                break;
            }
            case '/':
            {
                if(druga_liczba !=0)
                {
                    System.out.println(pierwsza_liczba / druga_liczba);
                }
                else
                {
                    System.out.println("Nie dzielimy przez zero!!!");
                }
                break;
            }
            case '^':
            {
                System.out.println(Math.pow(pierwsza_liczba,druga_liczba));
                break;
            }
            case '$':
            {
                System.out.println(Math.pow(pierwsza_liczba, 1/druga_liczba));
                break;
            }
        }
    }

}