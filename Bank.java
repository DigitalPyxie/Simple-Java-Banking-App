package com.kekeletso;

public class Bank {

    public static void main(String[] args) {
	// Super simple banking app

        Account john = new Account("John Doe", 92061205);
        john.bankMenu();
    }
}
