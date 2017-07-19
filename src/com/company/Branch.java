package com.company;

import java.util.ArrayList;

/**
 * Created by PLPK on 19.07.2017.
 */
public class Branch {
    private String branchName;
    private ArrayList<Customer> customer;

    public Branch(String branchName, ArrayList<Customer> customer) {
        this.branchName = branchName;
        this.customer = customer;
    }

    public Branch(String branchName) {
        this.branchName = branchName;
        this.customer = new ArrayList<Customer>();
    }

    public String getBranchName() {
        return branchName;
    }

    public ArrayList<Customer> getCustomer() {
        return customer;
    }
}
