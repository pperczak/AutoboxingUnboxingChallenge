package com.company;

import java.util.ArrayList;

/**
 * Created by PLPK on 19.07.2017.
 */
public class Bank {
    private String bankName;
    private ArrayList<Branch> branch;

    public Bank(String bankName, ArrayList<Branch> branch) {
        this.bankName = bankName;
        this.branch = branch;
    }

    public Bank(String bankName) {
        this.bankName = bankName;
        this.branch = new ArrayList<Branch>();
    }

    public String getBankName() {
        return bankName;
    }

    public ArrayList<Branch> getBranch() {
        return branch;
    }
}
