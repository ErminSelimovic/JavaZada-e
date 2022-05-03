package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class BrojeviIznadProsjeka {
    public static void unesiListuBrojevaProsjek() {
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

        prosjekBrojeva(listaBrojeva);

    }

    private static void prosjekBrojeva(ArrayList<Integer> listaBrojeva) {
        int sum = 0;
        for (int broj:listaBrojeva) {
            sum = sum+broj;
        }

        System.out.println(sum);

        int prosjek = sum/(listaBrojeva.size() -1);
        System.out.println(prosjek);
        ArrayList list = new ArrayList();
        for (int i = 0;i<listaBrojeva.size()-1;i++){
            if (listaBrojeva.get(i) > prosjek){
                list.add(listaBrojeva.get(i));
            }
        }
        System.out.println("Brojevi koji su iznad prosjeka: "+ list.toString());
    }
}
