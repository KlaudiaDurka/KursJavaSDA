package com.figury;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Podaj figure:");
        Scanner input = new Scanner(System.in);
        String figura = input.next();

        if (figura.equals("kolo")){
            System.out.println("podaj promien");
            double r = input.nextDouble();
            kolo koło = new kolo(r);
            System.out.println("wymiary kola");
            System.out.println("obwod: " + kaluklator.obliczObwod(koło));
            System.out.println("pole: " + kaluklator.obliczPole(koło));


        }
        else if(figura.equals("prostokat")){
            System.out.println("podaj boki:");
            double a = input.nextDouble();
            double b = input.nextDouble();
            prostokat prostokąt = new prostokat(a, b);
            System.out.println("wymiary prostokata: ");
            System.out.println("obwod: " + kaluklator.obliczObwod(prostokąt));
            System.out.println("pole: " + kaluklator.obliczPole(prostokąt));

        }

        else if (figura.equals("trojkat")){
            System.out.println("podaj boki:");
            double a = input.nextDouble();
            double b = input.nextDouble();
            double c = input.nextDouble();
            trojkat trójkąt = new trojkat(a, b, c);
            System.out.println("Boki trojkata: ");
            System.out.println("pole: " + kaluklator.obliczPole(trójkąt));
            System.out.println("obwod: " + kaluklator.obliczObwod(trójkąt));
        }

        else {
            System.out.println("Nie ma takiej figury!");
        }
    }

}
