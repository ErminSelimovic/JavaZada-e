package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Map<String, String> songsList = new HashMap<>();
        String singer;
        String song;
        int choice = 1;

        while (choice != 0) {
            System.out.print("Please enter a singer: ");
            singer = scan.nextLine();
            System.out.print("Please enter song for " + singer + ": ");
            song = scan.nextLine();
            songsList.put(singer, song);


            do {
                System.out.println("*******CHOICE******");
                System.out.println("1 - For add new singer and song");
                System.out.println("0 - Exit");

                choice = scan.nextInt();
                if (choice == 0) {
                    System.out.println("Thanks, that's all");
                    break;
                } else if (choice == 1) {
                    System.out.println("Super, add new singer and song");
                } else {
                    System.out.println("That is wrong enter, please choice again");
                }

                scan.nextLine();

            } while (choice < 0 || choice > 1);


        }

        for (String sngList : songsList.keySet()) {
            int playRepeat;
            System.out.println("Next song: " + sngList + " - " + songsList.get(sngList));
            System.out.print("Play (1) or Next (0)\n");

            do {

                playRepeat = scan.nextInt();

                if (playRepeat == 0){
                    break;
                }

                if (playRepeat == 1){
                    
                    while (playRepeat == 1) {
                        System.out.printf("♫♫ Now Playing ♫♫ %s-%s ", sngList, songsList.get(sngList));
                        System.out.println("\nFor repeat enter (1), for Next enter (0)");
                        playRepeat = scan.nextInt();

                        if (playRepeat != 1 && playRepeat > 0){
                            System.out.println("Wrong enter, please choice again");
                        }
                    }

                }


                if (playRepeat > 1 || playRepeat < 0) {
                    System.out.println("Wrong enter");
                    System.out.println("Next song: " + sngList + " - " + songsList.get(sngList));
                    System.out.print("Play (1) or Next (0)\n");
                    while (playRepeat != 1) {
                        playRepeat = scan.nextInt();
                        if (playRepeat != 1){
                            System.out.println("Wrong enter");
                            System.out.println("Next song: " + sngList + " - " + songsList.get(sngList));
                            System.out.print("Play (1) or Next (0)\n");
                            playRepeat = scan.nextInt();
                        }
                    }
                }



            } while (playRepeat == 0);


        }

        System.out.println("Your list is empty, well done!");


    }
}
