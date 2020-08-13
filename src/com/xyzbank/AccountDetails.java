package com.xyzbank;

import java.util.Scanner;

public class AccountDetails {
    long acc_num;
    String name;
    String pan;
    float balance;
    float prv_trans;

    void deposit(float amt){
        balance+=amt;
        prv_trans=amt;
    }

    void withdraw(float amt){
        if (balance>= amt) {
            balance -= amt;
            prv_trans=-amt;
        } else {
            System.out.println("insufficient balance");
        }
    }

    float getBalance(){
        return balance;
    }

    float getprv_trans(){
        return prv_trans;
    }
    void CustomerHelp(){
        float amt;
        char select_option;
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome "+this.name);

        do{
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("Choose a option to proceed");
            System.out.println("------------------------------------");
            System.out.println("A -For Balance Enquiry");
            System.out.println("B -For Deposit");
            System.out.println("C -For Withdrawal");
            System.out.println("D -For Previous Transaction");
            System.out.println("E -Exit");

            select_option = input.next().toUpperCase().charAt(0);

            switch (select_option) {
                case 'A':
                    System.out.println("Your account balance is Rs." + getBalance());
                    break;
                case 'B':
                    System.out.println("enter amount to deposit");
                    amt = input.nextFloat();
                    deposit(amt);
                    break;
                case 'C':
                    System.out.println("enter amount to withdraw");
                    amt = input.nextFloat();
                    withdraw(amt);
                    break;
                case 'D':
                    System.out.println("Name :"+name);
                    System.out.println("Account number :"+acc_num);
                    System.out.println("Current balance :"+getBalance());

                    float prv_trans = getprv_trans();
                    System.out.print("Your previous transaction was ");
                    if (prv_trans > 0) {
                        System.out.println("a credit of Rs." + prv_trans);
                    } else if (prv_trans < 0) {
                        System.out.println("a debit of Rs." + Math.abs(prv_trans));
                    }else{
                        System.out.println("null");
                    }
                case 'E':
                    System.out.println("Thank you");
                    System.out.println("Visit again");
                    break;
                default:
                    System.out.println("choose correct option");
            }
        }while (!(select_option=='E'));
    }


}
