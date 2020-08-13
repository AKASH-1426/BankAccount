package com.xyzbank;

import java.util.Scanner;

public class BankAccount  {
    public static void main(String[] args) {
        System.out.println("Welcome to XYZ bank");

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your Name");
        String name = input.nextLine();
        System.out.println("Enter your PAN");
        String pan = input.nextLine();

        CreateAccount n_cust=new CreateAccount(name,pan);
        System.out.println("Your account has been created");
        System.out.println("-------------------------------------------");

        System.out.println("Need Help: Press Y");
        char press=input.next().toUpperCase().charAt(0);

        if (press == 'Y'){
            n_cust.CustomerHelp();
        }
    }
}