package com.varargs.zadanie2;

public class zadanie2 {
    public static void usunElement(int poz, int... a) {

        for (int i = poz; i <a.length-1; i++) {
            a[i] = a[i+1];
        }
        for (int element:a){
            System.out.println(element);
        }
    }
}
