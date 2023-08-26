package org.example;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ATM ATM = new ATM();
        while (true) {
            System.out.println("1-withdraw");
            System.out.println("2-deposit");
            System.out.println("3-check balance");
            System.out.println("0-exit" );
                    Scanner scanner = new Scanner(System.in);
            int x=scanner.nextInt();

            if (x==1){
                System.out.print("Please Enter the Amount you want to withdraw: ");
                double amount=scanner.nextDouble();
                System.out.println( ATM.withdraw(amount));
            }
            if (x==2){
                System.out.print("Please Enter the Amount you want to Deposit: ");
                double amount=scanner.nextDouble();
                System.out.println( ATM.deposit(amount));
            }
            if (x==3){
                System.out.println(  ATM.checkBalance());
            }
            if (x==0){
                System.out.println("Bye.. Bye..");
                break;
            }
        }
    }
}