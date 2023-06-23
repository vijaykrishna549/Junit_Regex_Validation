package regex_junit_validation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class RegexJunitDemoTest {

    @Test
    void validateName() {
        RegexJunitDemo rj = new RegexJunitDemo();
        String name = "Tony Stark";
        String regPattern = "^[A-Z][a-z]{3,}(\\s[A-Z][a-z]{3,})*$";
        assertTrue(rj.validateRegex(regPattern,name),"The regex pattern for name is wrong");
    }

    @Test
    void validateEmail() {
        RegexJunitDemo rj = new RegexJunitDemo();
        String email = "abc@yahoo.com";
        String regPattern = "^[a-z0-9]{3,6}[.@+-][0-9a-z]{1,}[.,@][a-z]{0,8}[.]*[,.]*[a-z]{2,3}[.,]*[a-z]*[a-z]*$";
        assertTrue(rj.validateRegex(regPattern,email),"The regex pattern for email is wrong");
    }

//    Validation of different e-mail samples with regex and junit
    @Test
    void validateMobile() {
        RegexJunitDemo rj = new RegexJunitDemo();
        String email1 = "abc@yahoo.com";
        String email2 = "abc-100@yahoo.com";
        String email3 = "abc111@abc,com";
        String email4 = "abc-100@abc.com.au";
        String email5 = "abc-100@abc.net";
        String email6 = "abc@1.com";
        String email7 = "abc@gmail.com.com";
        String email8 = "abc+100@gmail.com";
        String regPattern = "^[a-z0-9]{3,6}[.@+-][0-9a-z]{1,}[.,@][a-z]{0,8}[.]*[,.]*[a-z]{2,3}[.,]*[a-z]*[a-z]*$";
        assertTrue(rj.validateRegex(regPattern,email1),"The regex pattern for email 1 is wrong");
        assertTrue(rj.validateRegex(regPattern,email2),"The regex pattern for email 2 is wrong");
        assertTrue(rj.validateRegex(regPattern,email3),"The regex pattern for email 3 is wrong");
        assertTrue(rj.validateRegex(regPattern,email4),"The regex pattern for email 4 is wrong");
        assertTrue(rj.validateRegex(regPattern,email5),"The regex pattern for email 5 is wrong");
        assertTrue(rj.validateRegex(regPattern,email6),"The regex pattern for email 6 is wrong");
        assertTrue(rj.validateRegex(regPattern,email7),"The regex pattern for email 7 is wrong");
        assertTrue(rj.validateRegex(regPattern,email8),"The regex pattern for email 8 is wrong");

    }

    @Test
    void validatePassword() {
        RegexJunitDemo rj = new RegexJunitDemo();
        String password = "@erttyR34";
        String regPattern = "^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[@!#]*)[a-zA-Z0-9@!#*]{8,}";
        assertTrue(rj.validateRegex(regPattern,password),"The regex pattern for password is wrong");
    }
    @Test
    void validateEmailSamples() {
        RegexJunitDemo rj = new RegexJunitDemo();
        String password = "@erttyR34";
        String regPattern = "^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[@!#]*)[a-zA-Z0-9@!#*]{8,}";
        assertTrue(rj.validateRegex(regPattern,password),"The regex pattern for password is wrong");
    }
}