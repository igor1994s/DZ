package by.teachmeskills.lessen16.taskOfLessen;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {
    public static void main(String[] args) {
        String input="390-56-58";
        String pattern="^\\d{3}-\\d{2}-\\d{2}$";
        Pattern p=Pattern.compile(pattern);
        Matcher m=p.matcher(input);
        System.out.println(m.find());
    }
}
