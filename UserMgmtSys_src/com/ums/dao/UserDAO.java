package com.ums.dao;

public interface UserDAO {
	/** Register a new user (will interact with the console). */
    void register();

    /** Log-in check. Returns true if username + password match. */
    boolean verifyUserNameAndPassword(String uname, String pass);

    /** “Forgot password” → returns password for a username, null if not found. */
    String forgotPassword(String uname);

}
