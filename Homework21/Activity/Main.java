package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);

        System.out.println("Unesite broj za koji želite dobiti tablicu množenja");
        System.out.print("Broj: ");
        int num = scan.nextInt();
        tablicaMnozenja(num);

        



    }

    private static void tablicaMnozenja(int num) {
        for (int i = 0;i<=10;i++){
            System.out.printf("%s*%s=%d\n",num,i,(num*i));
        }
    }
}
