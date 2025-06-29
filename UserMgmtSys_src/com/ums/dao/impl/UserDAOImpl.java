package com.ums.dao.impl;

import java.util.Scanner;
import com.ums.dao.UserDAO;
import com.ums.model.User;

public class UserDAOImpl implements UserDAO {

    // === “DB” implemented with a fixed-size array ===
    private static final int MAX_USERS = 100;
    private final User[] users = new User[MAX_USERS];
    private int count = 0;                       // how many users stored

    private final Scanner sc = new Scanner(System.in);

    /* ============================================================== */

    /** Adds a new user after collecting details from the console. */
    @Override
    public void register() {
        if (count >= MAX_USERS) {
            System.out.println("User storage is full.");
            return;
        }

        System.out.println("--- Register New User ---");
        User u = new User();
        u.setId(count + 1);

        System.out.print("First name : ");
        u.setFirstName(sc.nextLine().trim());

        System.out.print("Last  name : ");
        u.setLastName(sc.nextLine().trim());

        System.out.print("Email      : ");
        u.setEmail(sc.nextLine().trim());

        String uname;
        while (true) {
            System.out.print("Username   : ");
            uname = sc.nextLine().trim();
            if (findByUserName(uname) == null)
                break;
            System.out.println("Username already taken. Try again.");
        }
        u.setUsername(uname);

        System.out.print("Password   : ");
        u.setPassword(sc.nextLine().trim());

        users[count++] = u;
        System.out.println("User registered successfully with ID " + u.getId());
    }

    /* ============================================================== */

    @Override
    public boolean verifyUserNameAndPassword(String uname, String pass) {
        User u = findByUserName(uname);
        return u != null && u.getPassword().equals(pass);
    }

    @Override
    public String forgotPassword(String uname) {
        User u = findByUserName(uname);
        return u == null ? null : u.getPassword();
    }

    /* -------- helper -------- */
    private User findByUserName(String uname) {
        for (int i = 0; i < count; i++) {
            if (users[i].getUsername().equals(uname))
                return users[i];
        }
        return null;
    }
}
