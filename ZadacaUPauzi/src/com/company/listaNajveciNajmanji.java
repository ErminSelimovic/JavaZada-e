package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class listaNajveciNajmanji {

    public static void unesiListuBrojeva() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Unesite listu cijelih brojeva\n\"0-prekida unos\"");

        ArrayList<Integer> listaBrojeva = new ArrayList<>();

        int i = -1;
        int counter = 1;
        while (i != 0) {

            System.out.print("Molimo Vas unesite broj " + counter + " : ");
            listaBrojeva.add(scan.nextInt());
            i = listaBrojeva.get(counter - 1);
            counter++;
        }
        listaBrojeva.remove(listaBrojeva.size() - 1);


        ArrayList<Integer> listaMaxBrojeva;
        listaMaxBrojeva = listaBrojeva;
        sortiranjeMaxBrojeva(listaMaxBrojeva);

        ArrayList<Integer> listaMin;
        listaMin = listaBrojeva;
        sortoranjeMinBrojeva(listaMin);

    }

    private static void sortiranjeMaxBrojeva(ArrayList<Integer> listaMaxBrojeva) {


        int max1 = Collections.max(listaMaxBrojeva);
        listaMaxBrojeva.remove((Integer) max1);
        int max2 = Collections.max(listaMaxBrojeva);
        listaMaxBrojeva.remove((Integer) max2);

        System.out.println("Maksimalni brojevi u listi su: "+max2+" i "+max1);
    }

    private static void sortoranjeMinBrojeva(ArrayList<Integer>listaMin) {


        int min1 =  Collections.min(listaMin);
        listaMin.remove((Integer) min1);
        int min2 =  Collections.min(listaMin);
        listaMin.remove((Integer) min2);

        System.out.println("Minimalni brojevi u listi su: "+min1 +" i "+min2);

    }

}
