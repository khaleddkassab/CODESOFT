package org.example;

import java.util.Random;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        String o="y";
        int Score = 0, Attempts = 0;
        while (o.equals("y")) {

            System.out.println("Score : " + Score);
            System.out.println("Attempts : " + Attempts);
            System.out.println("Do you want to Play (y/n)");
            Scanner s = new Scanner(System.in);
            o = s.next();
            if (!o.equals("y")) {break;}

            Random random = new Random();
            int x = random.nextInt(101);
            System.out.println(x);
            int y=0;
            Attempts++;
            while (y<10) {

                System.out.println("Guess a Number");
                Scanner scanner = new Scanner(System.in);
                int input =scanner.nextInt();
                if (input>100 || input <0) {
                    System.out.println("not a valid number");
                    y--;
                    continue;
                }
                if (input>x) {
                    System.out.println(" Higher");

                }
                if (input<x) {
                    System.out.println("lower");

                }
                if (input==x) {
                    System.out.println("Correct");
                    Score++;
                    break;

                }
                y++;
            }
        }
        }


    }



