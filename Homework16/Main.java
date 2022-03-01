package com.company;


import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        //PRVI ZADATAK
        System.out.print("Unesite duži string sa više riječi-> ");
        String text = scan.nextLine();
        String[] textArr = text.split(" ");

        for (int i = 0; i < textArr.length; i++) {
            System.out.println(textArr[i]);
        }

        //DRUGI ZADATAK
        int[][] arrNum = new int[3][3];

        System.out.println("\nUnesite broj u dvodimenzionalni niz");
        int sum = 0;
        for (int j = 0; j < 3; j++) {

            for (int k = 0; k < 3; k++) {
                System.out.print("Pozicija[" + j + "][" + k + "] : ");
                arrNum[j][k] = scan.nextInt();
                if (arrNum[j][k] % 2 == 0) {
                    sum = sum + arrNum[j][k];
                }
            }
        }

        System.out.println("\nNiz koji ste unjeli izgleda ovako");
        System.out.println(Arrays.deepToString(arrNum));
        System.out.println("Zbir svih parnih brojeva niza je: " + sum + " , a kvadratni korijen zbira je: " + (Math.sqrt(sum)));

        //TREĆI ZADATAK
        System.out.print("\nMolimo Vas da unesete broj za koji želite tablicu množenja do 10\nVaš broj: ");
        int multiNum = scan.nextInt();

        for (int i = 0; i <= 10; i++) {
            System.out.println(multiNum + "*" + i + "=" + multiNum * i);
        }
    }
}
