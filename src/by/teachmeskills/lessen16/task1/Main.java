package by.teachmeskills.lessen16.task1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
// Написать регулярное вырважение для IPV4
public class Main {
    public static void main(String[] args) {
        String text="255.255.255.16";
        String value255="(([1-9])|([1-9][0-9])|(1[0-9][0-9])|(25[0-5])|(2[0-4][0-9]))\\.";
        String ipv4=value255+value255+value255+"(([1-9])|(1[0-6]))";
        Pattern pat=Pattern.compile(ipv4);
        Matcher mat=pat.matcher(text);
        System.out.println(mat.matches());
    }
}
