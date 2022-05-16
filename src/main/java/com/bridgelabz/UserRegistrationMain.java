package com.bridgelabz;

import static com.bridgelabz.UserRegistration.scanner;

public class UserRegistrationMain {
    public static void main(String[] args) {
        System.out.println("Welcome To User Registration");
        System.out.println("Enter 1 : validate first name");
        System.out.println("Enter 2 : validate last name");
        switch (scanner.nextInt()) {
            case 1:
                UserRegistration.validFirstName();
                break;
            case 2 : UserRegistration.validLastName();
            break;
        }
    }
}