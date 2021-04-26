package com.pętle;

import java.util.Scanner;

public class Zadanie5 {
    public static void main(String[] args) {

        int a;

        Scanner input = new Scanner(System.in);

        System.out.println("podaj liczbe");

        a = input.nextInt();

        for (int i = 1; i <= a; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println("i");
            }
        }
    }
}
