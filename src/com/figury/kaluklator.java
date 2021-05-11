package com.figury;

public class kaluklator {
    public static double obliczObwod(kolo koło){
        return 2 * Math.PI * koło.getR();
    }
    public static double obliczPole(kolo koło){
        return Math.PI * koło.getR() * koło.getR();
    }

    public static double obliczObwod(prostokat prostokąt){
        return prostokąt.getA() * 2 + prostokąt.getB() * 2;
    }

    public static double obliczPole(prostokat prostokąt){
        return prostokąt.getA() * prostokąt.getB();
    }

    public static double obliczPole(trojkat trójkąt){

        double p = (trójkąt.getA() + trójkąt.getB() + trójkąt.getC())/2;

        return Math.sqrt(p * (p - trójkąt.getA()) * (p - trójkąt.getB()) * (p - trójkąt.getC()));
    }

    public static double obliczObwod(trojkat trójkąt){
        return trójkąt.getA() + trójkąt.getB() + trójkąt.getC();
    }

}
