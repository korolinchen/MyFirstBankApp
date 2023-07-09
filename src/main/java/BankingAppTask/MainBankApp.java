package BankingAppTask;

import java.util.Scanner;

public class MainBankApp {
    public static void main(String[] args) {
        System.out.println("\nWelcome to Java online banking \n");
        BankUserReg regUser = new BankUserReg();
        regUser.start();
    }
}
