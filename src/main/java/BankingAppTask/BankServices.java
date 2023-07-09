package BankingAppTask;

import java.util.ArrayList;

public class BankServices {

    ArrayList<User> newUserList = new ArrayList<>();
    public String addUser(User addedUser) {
            this.newUserList.add(addedUser);
            return "Username" + addedUser.getUsername() + " added successfully";
    }
}
