package org.example;

public class ATM {
    Account Acc = new Account();

    public String withdraw(double amount) {
        if (amount< Acc.balance){
            Acc.balance -= amount;
            return "Withdrawing ... " + Acc.balance;
        }
        return "Error ... " + "Your Balance is :"+Acc.balance;

    }
    public String checkBalance() {
        return "Your Account Balance is :" +Acc.balance;
    }
    public String deposit(double amount) {
        Acc.balance += amount;
        return "Depositing ... " + Acc.balance;
    }
}
