package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        /*
        Deklarisati i inicijalizirati String (Napisati rečenicu)
        Deklarisati string niz i njemu dodijeliti vrijednost niza koristeći metodu split( )
        Ispisati vrijednost niza
        */

        String firstText = "Lorem Ipsum is simply dummy text of the printing and typesetting industry";
        String[] firstTextArr = firstText.split(" ");
        System.out.println("\nThis string has " + firstTextArr.length + " words.\n" + Arrays.toString(firstTextArr));

        System.out.println();
        /*
        Deklarisati i inicijalizirati dvodimenzionalni niz sa decimalnim vrijendostima
        Sabrati vrijednosti 1. kolone i vrijednosti 2. reda i ispisati ukupan rezultat
         */
        double[][] _tdArr = new double[][]{{2.6,7.8,1.4},
                                           {22.6,13.1,18.3},
                                           {1.2,22.1,48.3}};
        double sum1col = _tdArr[0][0] + _tdArr[1][0] + _tdArr[2][0];
        double sum2row = _tdArr[1][0] + _tdArr[1][1] + _tdArr[1][2];
        double suma = sum1col + sum2row;
        System.out.printf("Suma vrijednosti 1. kolone je: %.2f, a suma vrijednosti 2. reda je: %.2f",sum1col,sum2row);
        System.out.printf("\nZbir između 1. kolone i 2. reda je: %.2f",suma);

    }
}
