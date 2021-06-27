package com.company;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int dogCount = 1;
        System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");

        int catCount = 2;
        System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");

        int turtleCount = 0;
        System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");

        flipNHeads(2);

        clock();

    }

    public static String pluralize(String word , int num){
        if(num ==0){
            return word+"s";
        }else if (num >1){
            return word+"s";
        }else{
            return word;
        }
    }

    public static void flipNHeads(int n){
        Random random = new Random();
        double number = random.nextDouble();
        int headsTry=0;
        int flipsTry=0;

        while (headsTry<n){
            if(number >= .5){

                System.out.println("heads");
                headsTry++;
            }else{
                System.out.println("tails");
            }
            flipsTry++;
            number = random.nextDouble();
        }

        System.out.println( "It took "+flipsTry+" flips to flip "+n+" head in a row.");
    }

    public static void clock(){
        LocalDateTime now =  LocalDateTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("HH:mm:ss");
        String beforeFormat = now.format(format);
        System.out.println(beforeFormat);

        while(true){
            now =  LocalDateTime.now();
            String afterFormat = now.format(format);
            if(beforeFormat.equals(afterFormat)){

                continue;
            }
            System.out.println(afterFormat);

            beforeFormat = afterFormat;
        }

    }

}
