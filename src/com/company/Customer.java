package com.company;

import java.util.ArrayList;

/**
 * Created by PLPK on 19.07.2017.
 */
public class Customer {
    private String name;
    private ArrayList<Double> transactions;

    public Customer(String name) {
        this.name = name;
        this.transactions = new ArrayList<Double>();
    }

    public Customer(String name, ArrayList<Double> transactions) {
        this.name = name;
        this.transactions = transactions;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public static Customer CreateCustomer(String in) {
        return new Customer(in);
    }
}
