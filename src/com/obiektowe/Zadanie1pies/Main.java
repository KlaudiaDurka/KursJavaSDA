package com.obiektowe.Zadanie1pies;

public class Main {
    public static void main(String[] args) {
        Pies pies1 = new Pies("Owczarek", "M");
        Pies pies2 = new Pies("Lablador", "F");

       // pies1.szczekansko();
        pies1.setWiek(5);
       //  pies1.wydrukujParametry();

        Pies[] tablica_psow = {pies1, pies2};
        for (Pies pies : tablica_psow){
            pies.wydrukujParametry();
            System.out.println();
        }
    }
}
