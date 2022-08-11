package com.niit.jap;

public class SavingAccount {
    String accountHolderName;
    String accountStatus;
    int accountBalance;


    public SavingAccount(String accountHolderName, String accountStatus, int accountBalance) {
        this.accountHolderName = accountHolderName;
        this.accountStatus = accountStatus;
        this.accountBalance = accountBalance;

    }

    int retrieveBalance() {
        return accountBalance;

    }

    int withdrawCase(int amount) {;
        return accountBalance-amount;

    }

    int depositCase(int amount) {
        return accountBalance+amount;

    }

    double transferFund(int amount ) {
        return accountBalance-amount;


    }
    long randomGenerateAccountNumber(){
        long accountNumber = (long) (Math.random()* 100_000_000_0000L);
        return accountNumber;

    }
}
