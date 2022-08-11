package com.niit.jap;

import java.util.Scanner;

public class SavingAccountImpl {
    public static void main(String[] args) {
        SavingAccount savingAccount = new SavingAccount("rishav","Active", 200000);
        Scanner scanner =new Scanner(System.in);
        System.out.println("enter your card");
        String card = scanner.nextLine();
        System.out.println("select language");
        String lang = scanner.nextLine();


        System.out.println("Account holder name= " +savingAccount.accountHolderName);
        System.out.println("Account Status     = "+savingAccount.accountStatus);
        System.out.println("Account Balance    = "+savingAccount.accountBalance);
        System.out.println("Account  Number    = "+savingAccount.randomGenerateAccountNumber());
        System.out.println("retrieve balance   = "+savingAccount.retrieveBalance());
        System.out.println("withdraw Case      = "+savingAccount.withdrawCase(20000));
        System.out.println("deposit  Case      = "+savingAccount.depositCase(200));
        System.out.println("transfer fund      = "+savingAccount.transferFund(240 ));




    }
}