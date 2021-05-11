package com.obiektowe.Zadanie3kalkulator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
    double a = input.nextDouble();
    //    System.out.println("A teraz podaj działanie");
    Kalkulator.znak = input.next();
    double b = input.nextDouble();

    switch (Kalkulator.znak){
        case "+":
            System.out.println(Kalkulator.dodawanie(a,b));
            break;
        case "-":
            System.out.println(Kalkulator.odejmowanie(a,b));
            break;
        case "*":
            System.out.println(Kalkulator.mnozenie(a,b));
            break;
        case "/":
            System.out.println(Kalkulator.dzielenie(a,b));
            break;
        case "%":
            System.out.println(Kalkulator.modulo(a,b));
            break;
        default:
            System.out.println("Nie ma takiego działania");
    }


}
}



