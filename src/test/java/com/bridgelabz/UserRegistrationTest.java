package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {
    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() throws UserRegistrationException {
        UserRegistration userRegistration = new UserRegistration();
        boolean result;
        result=userRegistration.validateFirstName("Kalyani");
        Assertions.assertTrue(result);
    }
    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue() throws UserRegistrationException{
        UserRegistration userRegistration = new UserRegistration();
        boolean result;
        result = userRegistration.validateLastName("Rathod");
        Assertions.assertTrue(result);
    }
    @Test
    public void givenEmail_WhenProper_ShouldReturnTrue() throws UserRegistrationException {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.validateEmail("Kalyani2095@gmail.com");
        Assertions.assertTrue(result);
    }
    @Test
    public void givenMobileNumber_WhenProper_ShouldReturnTrue() throws UserRegistrationException {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.validateMobileNumber("91 9689079507");
        Assertions.assertTrue(result);
    }
    @Test
    public void givenPassword_WhenProper_ShouldReturnTrue() throws UserRegistrationException {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.validatePassword("Ayansh***");
        Assertions.assertTrue(result);
    }
    @Test
    public void givenPasswordRule1_WhenProper_ShouldReturnTrue() throws UserRegistrationException{
        UserRegistration userRegistration =new UserRegistration();
        boolean result = userRegistration.validatePasswordRule1("Ayansh123");
        Assertions.assertTrue(result);
    }
    @Test
    public void givenPasswordRule2_WhenProper_ShouldReturnTrue() throws  UserRegistrationException{
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.validatePasswordRule2("Ayansh2020");
        Assertions.assertTrue(result);
    }


}


