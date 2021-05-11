package com.obiektowe.Zadanie2Pokoj;

import com.obiektowe.Zadanie1pies.Pies;

public class Main {
    public static void main(String[] args) {

        Pokoj pokoj1 = new Pokoj(5,10);
        Pokoj pokoj2 = new Pokoj (20,35);

        pokoj1.wyswietlPole();
        pokoj2.wyswietlPole();
        System.out.println();
        pokoj1.wyswietlObjetosc();
        pokoj2.wyswietlObjetosc();



        //       Pokoj[] tablica_pokoi = {pokoj1, pokoj2};
        //       for (Pokoj pokoj : tablica_pokoi){
        //       pokoj.drukujParametry();
        //       System.out.println();
        //       }
    }
}

