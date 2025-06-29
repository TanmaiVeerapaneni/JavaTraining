package com.ums.client;

import java.util.Scanner;
import com.ums.dao.UserDAO;
import com.ums.dao.impl.UserDAOImpl;

public class UserClient {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UserDAO dao = new UserDAOImpl();

        while (true) {
            System.out.println("\n===== USER MANAGEMENT SYSTEM =====");
            System.out.println("1) Register");
            System.out.println("2) Login");
            System.out.println("3) Forgot password");
            System.out.println("4) Exit");
            System.out.print("Choose option: ");

            String choice = sc.nextLine().trim();

            switch (choice) {
                case "1":
                    dao.register();
                    break;

                case "2":
                    System.out.print("Username: ");
                    String uname = sc.nextLine().trim();
                    System.out.print("Password: ");
                    String pass = sc.nextLine().trim();

                    if (dao.verifyUserNameAndPassword(uname, pass)) {
                        System.out.println("Login successful!");
                    } else {
                        System.out.println("Invalid credentials.");
                    }
                    break;

                case "3":
                    System.out.print("Enter username: ");
                    String user = sc.nextLine().trim();
                    String pwd = dao.forgotPassword(user);
                    if (pwd != null) {
                        System.out.println("Password for " + user + " is: " + pwd);
                    } else {
                        System.out.println("Username not found.");
                    }
                    break;

                case "4":
                    System.out.println("Exiting... Bye!");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }
}
