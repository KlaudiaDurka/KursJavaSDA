package com.varargs.zadanie2;

public class Main {
    public static void main(String[] args) {
        zadanie2.usunElement(4, 1,2,3,4,5,6,7);
    }
    public static void varArgsPrzyklad(int... a){
        for (int elemet : a) {
            System.out.println(elemet);
        }
        System.out.println(a[1]);
    }
}
