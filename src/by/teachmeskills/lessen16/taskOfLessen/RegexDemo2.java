package by.teachmeskills.lessen16.taskOfLessen;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo2 {
    public static void main(String[] args) {
        String input="Hello Java! Hello JavaScript!J avaSE 8.";
        String pattern="Java";
        Pattern p=Pattern.compile(pattern);
        Matcher m=p.matcher(input);
        while (m.find()){
            System.out.println(m.group());
        }
    }
}
