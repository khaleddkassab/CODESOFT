package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        System.out.println("Enter Grades if you ve finished enter (-1)");
        List<Float> Grades = new ArrayList<Float>();
        int num=0;
        while (true) {

            Scanner scanner = new Scanner(System.in);
            float x=scanner.nextFloat();
            if (x ==-1) {break;}
            Grades.add(x);
            num++;

        }
        float Sum=0;
        int Size= num;
        for (int i=0; i<Grades.size(); i++) {
            Sum+=Grades.get(i);
        }
        float percentage=(Sum/Size);
        System.out.println("total marks : "+Sum);
        System.out.println("average percentage : "+percentage+"%");
        if ( percentage>=90){
            System.out.println("A");

        }
        else if ( percentage>=80){
            System.out.println("B");
        }
        else if ( percentage>=70){
            System.out.println("C");
        }
        else if ( percentage>=50){
            System.out.println("D");
        }
        else if ( percentage<50){
            System.out.println("F");
        }
    }
}