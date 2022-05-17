package com.bridgelabz;

import static com.bridgelabz.UserRegistration.scanner;

public class UserRegistrationMain {
    public static void main(String[] args) {
        System.out.println("Welcome To User Registration");
        System.out.println("Enter 1 : validate first name");
        System.out.println("Enter 2 : validate last name");
        System.out.println("Enter 3 : validate email");
        System.out.println("Enter 4 : validate mobile number");
        System.out.println("Enter 5 : validation passwordrule");
        System.out.println("Enter 6 : validation passwordrule1");

        switch (scanner.nextInt()) {
            case 1 :  UserRegistration.validFirstName();
                break;
            case 2 : UserRegistration.validLastName();
            break;
            case 3 : UserRegistration.validEmail();
            break;
            case 4 : UserRegistration.validMobileNumber();
            break;
            case 5 : UserRegistration.validPassword();
            break;
            case 6 : UserRegistration.validPasswordUppercase();
            break;
            case 7 : UserRegistration.validPasswordNumeric();
            break;
            case 8 : UserRegistration.validatePasswordRule4();
            break;
        }
    }
}