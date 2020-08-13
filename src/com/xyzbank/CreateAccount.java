package com.xyzbank;

public class CreateAccount extends AccountDetails{

    CreateAccount (String name,String pan){
        System.out.println("Welcome to XYZ bank");
        this.name=name;
        this.pan=pan;
        this.balance=0;
        this.prv_trans=0;
        this.acc_num=20202020001L;
    }
}

