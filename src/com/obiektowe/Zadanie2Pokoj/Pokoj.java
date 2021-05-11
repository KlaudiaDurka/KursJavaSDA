package com.obiektowe.Zadanie2Pokoj;

public class Pokoj {
    private double wysokosc;
    private double szerokosc;
    private double dlugosc;
    public Pokoj(double wysokosc, double szerokosc, double dlugosc) {
        this.wysokosc = wysokosc;
        this.szerokosc = szerokosc;
        this.dlugosc = dlugosc;
    }
    public Pokoj(double szerokosc, double dlugosc) {
        this.szerokosc = szerokosc;
        this.dlugosc = dlugosc;
        this.wysokosc = 2.4;
    }
    public double obliczPole(){
        return this.szerokosc*this.dlugosc;
    }
    public double obliczObjetosc(){
        return this.szerokosc*this.wysokosc*this.dlugosc;
    }
    public void wyswietlPole(){
        System.out.println(obliczPole());
    }
    public void wyswietlObjetosc(){
        System.out.println(obliczObjetosc());
    }

    public void drukujParametry(){
        System.out.println(this.wysokosc);
        System.out.println(this.szerokosc);
        System.out.println(this.dlugosc);
    }
}