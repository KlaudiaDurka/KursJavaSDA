package com.varargs;

public class Zadanie1 {
    public static void main(String[] args) {
        varArgsPrzyklad(1,2,4,5,3,12,542,5432,-1,32);

    }
    public static void varArgsPrzyklad(int... a){
        for(int elemet : a){
            System.out.println(elemet);
        }
        System.out.println();
        System.out.println(a[1]);
    }
}
