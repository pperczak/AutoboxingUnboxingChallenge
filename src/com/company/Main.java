package com.company;

public class Main {

    public static void main(String[] args) {

        Bank b1 = new Bank("CreditAgrikol");

        b1.getBranch().get(0).getCustomer().get(0).getName();

    }
}
