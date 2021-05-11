package com.obiektowe.Zadanie1pies;

public class Pies {

    public Pies(String rasa, String płeć){
        this.wiek = 0;
        this.rasa = rasa;
        this.płeć = płeć;
    }

    private String rasa;
    private int wiek;
    private String płeć;

    public void setWiek(int wiek){
        this.wiek = wiek;
    }

    public int getWiek(){
        return this.wiek;
    }

    public void szczekansko(){
        System.out.println("Woof!");
    }

    public void wydrukujParametry(){
        System.out.println(this.rasa);
        System.out.println(this.wiek);
        System.out.println(this.płeć);
    }
}
