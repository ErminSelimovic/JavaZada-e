package com.company;

public class Main {

    public static void main(String[] args) {
        double doubleNum1 = 54.3;
        System.out.println("Broj " + doubleNum1 + " nakon korištenja Math.ceil() metode izgleda ovako-> " + Math.ceil(doubleNum1));

        int a = (int) (Math.random() * 99 + 1);
        int b = (int) (Math.random() * 99 + 1);
        int c = (int) (Math.random() * 99 + 1);
        int max = Math.max(Math.max(a, b), c);
        int min = Math.min(Math.min(a, b), c);
        System.out.println("Random vrijednosti brojeva su\na=" + a + "\nb=" + b + "\nc=" + c +
                "\nNajveća vrijednost od ova tri boja je " + max + ", a najniže vrijednost je " + min);
        System.out.println("Kvadrat najveće vrijednosti je " + (int) Math.pow(max, 2) + "," +
                "\na kvadrat najniže vrijednosti je " + (int) Math.pow(min, 2));

    }
}
