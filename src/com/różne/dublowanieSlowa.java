package com.różne;

public class dublowanieSlowa {
    public static void main(String[] args) {
        System.out.println();
    }

    public static String doubleWords(String input){
        String result = "";

        for (String word : input.split(" ")) {
            result += result + word + " " + word + " ";
        }
        return result;
    }
}
