package BankingAppTask;

import java.math.BigDecimal;
import java.util.Scanner;

public class BankMenuController {
    private Scanner scanner = new Scanner(System.in);

    public void start() {

        String userChoice = this.getScannerInfo("""          
                Please type in the number to proceed
              
                    1. Show balance
                    2. Deposit funds
                    3. Withdraw funds
                    4. Log out
                """);

        switch (userChoice) {

            case "1":
                this.showBalance();
                break;
            case "2":
                this.depositFunds();
                break;
            case "3":
                this.withdrawFunds();
                break;
            case "4":
                System.exit(0);
                break;
            default:
                messageDisplayToUser("Type in the number from the menu");
                break;
        }

        this.start();
    }

    private void showBalance() {
        Double initialBalance = 0.00;
        messageDisplayToUser("Your current account balance: " + initialBalance);
    }
    private void depositFunds() {
    }
    private void withdrawFunds() {
    }


    public void messageDisplayToUser(String message){
            System.out.println(message);
        }

        public String getScannerInfo(String message){
            System.out.println(message);
            return scanner.nextLine();
        }
    }
