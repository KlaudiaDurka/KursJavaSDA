package com.różne;
import java.util.Scanner;
public class romb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int wysRombu = sc.nextInt();
        int polRombu;
        if (wysRombu%2 ==0){
            polRombu =wysRombu/2 - 1;
        }else
            polRombu = wysRombu/2;
        int count = 1;
        for (int i = 0; i < polRombu; i++) {
            for (int j = 0; j <= polRombu * 2; j++) {
                if ((j < polRombu - i) || (j > polRombu + i))
                    System.out.print(" ");
                else
                    System.out.print(count);
            }
            count ++;
            System.out.println();
        }
        for (int i = polRombu; i >= 0; i--) {
            for (int j =0; j <= polRombu*2; j++) {
                if ((j < polRombu - i) || (j > polRombu + i))
                    System.out.print(" ");
                else
                    System.out.print(count);
            }
            count++;
            System.out.println();
        }
    }
}
