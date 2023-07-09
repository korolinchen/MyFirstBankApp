package BankingAppTask;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BankUserReg {

    private Scanner scannerUser = new Scanner(System.in);

    public void start() {
        String userRegChoice = this.getUserReg("""          
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

    private void registerUSer() {
        User newUser = new User();
        newUser.setUsername(this.getUserReg(
                "Please type in your email address which will be your username"
        ));
        newUser.setPassword(this.getUserReg("Please type in your password and memorize it"));

        messageForUser("You have entered: " + newUser);
        messageForUser("You have registered, please memorize your username and password details");

        ArrayList<User> newUserList = new ArrayList<>();
        newUserList.add(newUser);
        for (User currentUser : newUserList) {
            messageForUser("ArrayList stored" + currentUser.toString());
        }
    }

    private void logInUser() {
        User userCredentials = new User();
        userCredentials.setUsername(this.getUserReg("Please enter your username"));
        userCredentials.setPassword(this.getUserReg("Please enter your password"));

        boolean userMatch = true;

        if (true) {
            BankMenuController menu = new BankMenuController();
            menu.start();
        } else {
            messageForUser("You have entered wrong details");
        }
        getUserReg("Please try again, enter your username and password");
    }

    public void messageForUser(String message) {
        System.out.println(message);
    }

    public String getUserReg(String message) {
        System.out.println(message);
        return scannerUser.nextLine();
    }
}

