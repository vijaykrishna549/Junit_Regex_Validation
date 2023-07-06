package regex_junit_validation;

import java.util.regex.Pattern;

public class RegexJunitDemo {

    String regexPattern;
    String content;

    public RegexJunitDemo(String regexPattern, String content) {
        this.regexPattern = regexPattern;
        this.content = content;
    }

    public RegexJunitDemo() {
    }

    public boolean validateRegex (String regexPattern, String content) throws RegexException{
        boolean isTrue = Pattern.matches(regexPattern, content);
        if(isTrue){
            System.out.println("Regex passed");
        }
        else {
            throw new RegexException("Regex Failed");
//            System.out.println("Regex failed");
        }
        return isTrue;

    }
//    lambda demo
}
