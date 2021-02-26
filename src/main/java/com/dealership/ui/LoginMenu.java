package com.dealership.ui;

<<<<<<< HEAD
import com.dealership.services.UserService;

=======
>>>>>>> b0375adfa9b976815d4b636cc14d401b0f332807
import java.util.Scanner;

public class LoginMenu extends AbstractMenu {

<<<<<<< HEAD

=======
>>>>>>> b0375adfa9b976815d4b636cc14d401b0f332807
    @Override
    public void showMenu(Scanner scan) {

        System.out.println("Username: ");
        String username = scan.nextLine();

        System.out.println("Password: ");
        String password = scan.nextLine();

<<<<<<< HEAD
        User user = new UserService().findUserByUserName(username);


    }



=======
    }
>>>>>>> b0375adfa9b976815d4b636cc14d401b0f332807
}
