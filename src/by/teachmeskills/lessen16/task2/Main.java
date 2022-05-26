package by.teachmeskills.lessen16.task2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Написать регулярное выражение для валидации e-mail
public class Main {
    public static void main(String[] args) {
        String email="igor1994s@yandex.by";
        Pattern pat=Pattern.compile("^\\w{6,30}@[a-zA-Z_]+?\\.[a-zA-Z]{2,6}");
        Matcher mat=pat.matcher(email);
        System.out.println(mat.matches());
    }
}
