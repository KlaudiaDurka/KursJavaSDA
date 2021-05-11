package com.dataCzas;

import java.time.LocalDate;
import java.util.Scanner;

public class Zadanie3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String data = input.next();

        LocalDate parsedLocalDate = LocalDate.parse(data);
        System.out.println(parsedLocalDate.plusDays(10));
    }
}
