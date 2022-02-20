package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Unesite 5 brojeva od 0 do 10");
        System.out.print("Prvi broj: ");
        int num1 = scan.nextInt();
        System.out.print("Drugi broj: ");
        int num2 = scan.nextInt();
        System.out.print("Treći broj: ");
        int num3 = scan.nextInt();
        System.out.print("Četvrti broj: ");
        int num4 = scan.nextInt();
        System.out.print("Peti broj: ");
        int num5 = scan.nextInt();

        double prosjek = (double) (num1 + num2 + num3 + num4 + num5) / 5;
        System.out.println(prosjek);

        if (prosjek <= 5) {
            System.out.println("Niste položili, potrudite se još");
        } else if (prosjek >= 6 && prosjek < 7) {
            System.out.println("Položili ste, ali možete bolje, vaš prosjek je " + prosjek);
        } else if (prosjek >= 7 && prosjek < 8) {
            System.out.println("Položili ste, čestitamo, vaš prosjek je " + prosjek);
        } else if (prosjek >= 8 && prosjek < 9) {
            System.out.println("Položili ste, vidi se vaš trud, prosjek je " + prosjek);
        } else if (prosjek >= 9 && prosjek < 10){
            System.out.println("Položili ste, zadovoljni smo vašim napredkom, prosjek je "+prosjek);
        }else{
            System.out.println("Odlično, vaš rad je oduševljavajući, prosjek je "+prosjek);
        }
        scan.nextLine();

        System.out.println("Koja vam je boja draža, Plava ili Zelena");
        String boja = scan.next();
        String slovo = String.valueOf(boja.charAt(0));

        String odabir = slovo.equals("P")||slovo.equals("p") ? "Odabrali ste Plavu" : "Odabrali ste Zelenu";
        System.out.println(odabir);
/*
        BOLJA VERZIJA ZA PROVJERU
        if (slovo.equals("P") || slovo.equals("p")){
            System.out.println("Odabrali ste Plavu");
        }else if(slovo.equals("Z") || slovo.equals("z")){
            if (boja.equals("Zelena") || boja.equals("zelena")){
            System.out.println("Odabrali ste Zelenu");}
            else {
                System.out.println("Niste odabrali iz našeg izbora");
            }
        }else{
            System.out.println("Niste odabrali iz našeg izbora");
        }
*/

    }
}
