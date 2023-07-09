package BankingAppTask;

import java.util.Scanner;

public class BankUserReg {

    private Scanner scannerUser = new Scanner(System.in);

    private final BankServices bankUserService;

    public BankUserReg() {
        this.bankUserService = new BankServices();
    }

    public void start() {
        String userRegChoice = this.scanUserInfo("""          
                Please type in the number to proceed
                              
                    1. Register user
                    2. Log in user
                    3. End work
                """);

        switch (userRegChoice) {

            case "1":
                this.registerUSer();
                break;
            case "2":
                this.logInUser();
                break;
            case "3":
                System.exit(0);
                break;
            default:
                messageForUser("Type in the number from the menu");
                break;
        }
        this.start();
    }



    private User registerUSer() { // !!!!! not void

        User newUser = new User();
        newUser.setUsername(this.scanUserInfo(
                "Please type in your email address which will be your username"
        ));
        newUser.setPassword(this.scanUserInfo("Please type in your password and memorize it"));
        messageForUser("You have entered: " + newUser);
        messageForUser("You have registered, please memorize your username and password details");
        return newUser;
    }
    private void createUserToList() {
        User user = this.registerUSer();
        String result = this.bankUserService.addUser(user);
        messageForUser(result);
    }

    private void logInUser() {
        User userCredentials = new User();
        userCredentials.setUsername(this.scanUserInfo("Please enter your username"));
        userCredentials.setPassword(this.scanUserInfo("Please enter your password"));

        boolean userMatch = true;

        if (true) {
            BankMenuController menu = new BankMenuController();
            menu.start();
        } else {
            messageForUser("You have entered wrong details");
        }
        scanUserInfo("Please try again, enter your username and password");
    }

    public void messageForUser(String message) {
        System.out.println(message);
    }

    public String scanUserInfo(String message) {
        System.out.println(message);
        return scannerUser.nextLine();
    }
}

