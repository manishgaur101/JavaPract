package com.general;

import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {
        String username = "manish";
        String password = "manish";

        Scanner input =  new Scanner(System.in);
        System.out.println("Please enter username: ");
        String input_username =  input.nextLine();
        System.out.println("Please enter password: ");
        String input_password =  input.nextLine();

        if(!input_username.equals(username)) {
            System.err.println("Username is Incorrect.");
        } else if (!input_password.equals(password)) {
            System.err.println("Password is Incorrect.");
        }
        else{
            System.out.println("Logged In Successfully.");
        }
    }
}
