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
        System.out.print("Enter your password : ");
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

    public static void validPasswordRule1() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your password : ");
        String password1 = scanner.nextLine();
        String regex5 = "(?=^.{8,}$)((?=.*\\d)|(?=.*\\W+))(?![.\\n])(?=.*[A-Z])(?=.*[a-z]).*$";
        Pattern p5 = Pattern.compile(regex5);
        Matcher m5 = p5.matcher(password1);
        boolean r5 = m5.matches();
        if (r5)
            System.out.println("password in Uppercase is Valid");
        else
            System.out.println("password  in Uppercase is Invalid");
    }

    public static void validPasswordRule2() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your password : ");
        String Password2 = scanner.nextLine();
        String regex6 = "^[A-Z]{1}+[a-zA-Z]{6}+[0-9]$";
        Pattern p6 = Pattern.compile(regex6);
        Matcher m6 = p6.matcher(Password2);
        boolean r6 = m6.matches();
        if (r6)
            System.out.println("password is only only one numeric is Valid");
        else
            System.out.println("password is only only one numeric is Invalid");
    }

    public static void validPasswordRule3() {
        System.out.println("Enter The Password At least one Upper case and one numeric");
        String password = scanner.nextLine();
        String regex7 = "^[A-Z]{1}+[a-zA-Z]{6}+[0-9]+1}$";
        Pattern pattern7 = Pattern.compile(regex7);
        Matcher matcher7 = pattern7.matcher(password);
        boolean r = matcher7.matches();

        if (r)
            System.out.println("It is a valid Password.");
        else
            System.out.println("It is invalid Password.");
    }

    public static void validPasswordRule4() {
        System.out.println("Enter the Password At least One Upper Case & One Numeric & One Special Character:");
        String password = scanner.nextLine();
        String regex8 = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[@$!%*#?&])[A-Za-z0-9@$!%*?&]{5,}$";
        Pattern pattern8 = Pattern.compile(regex8);
        Matcher matcher8 = pattern8.matcher(password);
        boolean r = matcher8.matches();

        if (r)
            System.out.println("It is a valid Password.");
        else
            System.out.println("It is invalid Password.");
    }

    public static void emailValidation() {
        System.out.print("Enter the email :");
        String email = scanner.next();
        String regex = "[a-zA-Z0-9_.]*[-]*[+]*[a-zA-Z0-9]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        boolean r = matcher.matches();
        if (r)
            System.out.println("Valid G-mail Address");
        else
            System.out.println("Invalid G-mail Address");
    }


    private static final String regex1 = "^[A-Z]{1}[a-z]{2,}$";

    public boolean validateFirstName(String name1) throws UserRegistrationException {
        Pattern pattern = Pattern.compile(regex1);
        if (Pattern.matches(regex1, name1) == true)
            return Pattern.matches(regex1, name1);
        else {
            throw new UserRegistrationException("send proper name");
        }
    }

    private static final String regex2 = "^[A-Z]{1}[a-z]{2,}$";

    public boolean validateLastName(String name1) throws UserRegistrationException {
        Pattern pattern = Pattern.compile(regex1);
        if (Pattern.matches(regex1, name1) == true)
            return Pattern.matches(regex2, name1);
        else {
            throw new UserRegistrationException("send proper name");
        }
    }

    private static final String regex3 = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+";

    public boolean validateEmail(String name1) throws UserRegistrationException {
        Pattern pattern = Pattern.compile(regex1);
        if (Pattern.matches(regex3, name1) == true)
            return Pattern.matches(regex3, name1);
        else {
            throw new UserRegistrationException("send proper email");
        }
    }

    private static final String regex4 = "(0|91)?[7-9][0-9]{9}";

    public boolean validateMobileNumber(String name1) throws UserRegistrationException {
        Pattern pattern = Pattern.compile(regex1);
        if (Pattern.matches(regex4, name1) == true)
            return Pattern.matches(regex4, name1);
        else {
            throw new UserRegistrationException("send proper number");
        }
    }

    private static final String regex5 = "^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{8,}$";

    public boolean validatePassword(String name1) throws UserRegistrationException {
        Pattern pattern = Pattern.compile(regex5);
        if (Pattern.matches(regex5, name1) == true)
            return Pattern.matches(regex5, name1);
        else {
            throw new UserRegistrationException("send proper password");
        }
    }
    private static final String regex6 = "(?=^.{8,}$)((?=.*\\d)|(?=.*\\W+))(?![.\\n])(?=.*[A-Z])(?=.*[a-z]).*$";
    public boolean validatePasswordRule1(String name1) throws UserRegistrationException{
        Pattern pattern = Pattern.compile(regex6);
        if(Pattern.matches(regex6,name1)==true)
            return Pattern.matches(regex6,name1);
        else {
            throw new UserRegistrationException("send proper name");
        }
    }
    private static final String regex7 = "^[A-Z]{1}+[a-zA-Z]{6}+[0-9]$";
    public boolean validatePasswordRule2(String name1) throws UserRegistrationException{
        Pattern pattern = Pattern.compile(regex7);
        if(Pattern.matches(regex7,name1)==true)
            return Pattern.matches(regex7,name1);
        else {
            throw new UserRegistrationException("send proper password");
        }
    }
    private static final String regex8 = "[A-Z]{1}+[a-zA-Z]{6}+[0-9]+1}$";
    public boolean validatePasswordRule3(String name1) throws UserRegistrationException{
        Pattern pattern = Pattern.compile(regex8);
        if(Pattern.matches(regex8,name1)==true)
            return Pattern.matches(regex8,name1);
        else {
            throw new UserRegistrationException("send proper password");
        }
    }
    private static final String regex9 = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[@$!%*#?&])[A-Za-z0-9@$!%*?&]{5,}$";
    public boolean validatePasswordRule4(String name1) throws UserRegistrationException{
        Pattern pattern = Pattern.compile(regex9);
        if(Pattern.matches(regex9,name1)==true)
            return Pattern.matches(regex9,name1);
        else {
            throw new UserRegistrationException("send proper password");
        }
    }

}



