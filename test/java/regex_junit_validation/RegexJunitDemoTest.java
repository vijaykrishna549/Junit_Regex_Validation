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

    @Test
    void validateMobile() {
        RegexJunitDemo rj = new RegexJunitDemo();
        String mob = "91 1234567898";
        String regPattern = "^([1-9]{2}[- ]?[1-9]{1}[0-9]{9})$";
        assertTrue(rj.validateRegex(regPattern,mob),"The regex pattern for mobile is wrong");
    }

    @Test
    void validatePassword() {
        RegexJunitDemo rj = new RegexJunitDemo();
        String password = "@erttyR34";
        String regPattern = "^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[@!#]*)[a-zA-Z0-9@!#*]{8,}";
        assertTrue(rj.validateRegex(regPattern,password),"The regex pattern for password is wrong");
    }
}