package by.teachmeskills.lessen9.task1;

public class Task1 {
    public static void main(String[] args) {
        String st1="Update Java!";
        char a='a';
        char b='v';
        int indexOf=st1.indexOf(a);
        int lastIndexOf=st1.lastIndexOf(b);
        String sub=st1.substring(indexOf,lastIndexOf);
        System.out.println(sub);
    }
}
