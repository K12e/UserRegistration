package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    static Scanner scanner = new Scanner(System.in);

    public static void validFirstName() {
        System.out.println("enter your first name");
        String name = scanner.next();
        String regex = "^[A-Z]{1}[a-z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(name);
        boolean b = matcher.matches();
        if (b) {
            System.out.println("name is valid");
        } else {
            System.out.println("name is invalid");
        }
    }
    public static void validLastName() {
        System.out.println("enter your first name");
        String name1 = scanner.next();
        String regex1 = "^[A-Z]{1}[a-z]{2,}$";
        Pattern pattern1 = Pattern.compile(regex1);
        Matcher matcher1 = pattern1.matcher(name1);
        boolean b1 = matcher1.matches();
        if (b1) {
            System.out.println("name is valid");
        } else {
            System.out.println("name is invalid");
        }
    }
    public static void validEmail() {

        System.out.println("enter your Email");
        String name2 = scanner.next();
        String regex2 = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+";
        Pattern pattern2 = Pattern.compile(regex2);
        Matcher matcher2 = pattern2.matcher(name2);
        boolean b2 = matcher2.matches();

        if (b2) {
            System.out.println("email is valid");
        } else {
            System.out.println("email is invalid");
        }
    }
    public static void validMobileNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your mobile number : ");
        String phoneNo = scanner.nextLine();
        String regex3 = "(0|91)?[7-9][0-9]{9}";
        Pattern p3 = Pattern.compile(regex3);
        Matcher m3 = p3.matcher(phoneNo);
        boolean r3 = m3.matches();
        if (r3)
            System.out.println("Phone number is Valid");
        else
            System.out.println("Phone number is Invalid");
    }
    public static void validPassword() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your mobile number : ");
        String Password = scanner.nextLine();
        String regex4 = "^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{8,}$";
        Pattern p4 = Pattern.compile(regex4);
        Matcher m4 = p4.matcher(Password);
        boolean r4 = m4.matches();
        if (r4)
            System.out.println("password is Valid");
        else
            System.out.println("password is Invalid");
    }

    public boolean validateFirstName(String name) {
        String regex1 = "^[A-Z]{1}[a-z]{2,}$";
        Pattern pattern = Pattern.compile(regex1);
        Matcher matcher = pattern.matcher(name);
        boolean b = matcher.matches();
        return b;

    }


    public boolean validateLastName(String name1) {
        String regex1 = "^[A-Z]{1}[a-z]{2,}$";
        Pattern pattern = Pattern.compile(regex1);
        Matcher matcher = pattern.matcher(name1);
        boolean b1 = matcher.matches();
        return b1;
    }

    public boolean validateEmail(String name2) {
        String regex2 = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+";
        Pattern pattern = Pattern.compile(regex2);
        Matcher matcher = pattern.matcher(name2);
        boolean b2 = matcher.matches();
        return b2;
    }

    public boolean validateMobileNumber(String phoneNo) {
        String regex1 = "(0|91)?[7-9][0-9]{9}";
        Pattern pattern = Pattern.compile(regex1);
        Matcher matcher = pattern.matcher(phoneNo);
        boolean b1 = matcher.matches();
        return b1;
    }

    public boolean validatePassword(String Password) {
        String regex4 = "^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{8,}$";
        Pattern pattern = Pattern.compile(regex4);
        Matcher matcher = pattern.matcher(Password);
        boolean b4 = matcher.matches();
        return b4;
    }
}
