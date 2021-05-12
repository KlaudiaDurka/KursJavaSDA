package com.różne;
import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int n = input.nextInt();
            int a=0, b=1;
            for (int i = 0; i<n; i++){
                b=b+a;
                a=b-a;
            }
            System.out.println(a);
        }
}
