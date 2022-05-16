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
    }
