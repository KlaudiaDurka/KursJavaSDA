package com.różne;

public class abc {
    public static void main(String[] args) {
        System.out.println(doubleLetters("ABCD"));
    }
    public static String doubleLetters(String input){
        String result = "";

        for(int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            result = result + c +c ;
        }
        return result;
    }
}
