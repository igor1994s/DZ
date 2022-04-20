package by.teachmeskills.lessen9.task_1;

import java.util.Locale;

public class Task_1 {
    public static void main(String[] args) {
        metod("I like Java!!!");

    }

    public static void metod(String st){
        System.out.println(st.charAt(st.length()-1));
        System.out.println("Заканчивается ли строка на \"!!!\"? "+ st.endsWith("!!!"));
        System.out.println("Начинается ли строка с \"I like\"? "+ st.startsWith("I like"));
        System.out.println("Содержит ли строка подстроку \"Java\"? "+ st.contains("Java"));
        System.out.println("Позиция подстроки \"Java\" в строке равна: ? "+ st.indexOf("Java"));
        System.out.println("Строка до замены: "+st);
        System.out.println("Строка после замены а на о: "+st.replace("a","o"));
        System.out.println("Строка в верхнем регистре: "+st.toUpperCase());
        System.out.println("Строка в нижнем регистре: "+st.toLowerCase());
        System.out.println(st.substring(st.indexOf("Java"),st.lastIndexOf("Java")+4));


    }
}
