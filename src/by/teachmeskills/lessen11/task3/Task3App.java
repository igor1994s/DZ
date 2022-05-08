package by.teachmeskills.lessen11.task3;

//3) Проверка на цензуру:
//        Создаете 2 файла.
//        1 - й. Содержит исходный текст.
//        2 - й. Содержит слова недопустимые в тексте(black list). Структура файла
//        определите сами, хотите каждое слово на новой строке, хотите через запятую
//        разделяйте, ваша программа делайте как считаете нужным.
//        Задача: необходимо проверить проходит ли текст цензуру. Если в тексте не
//        встретилось ни одного недопустимого слова, то выводите сообщение о том что
//        текст прошёл проверку на цензуру. Если нет, то выводите соответствуюущее
//        сообщение, кол-во предложений не прошедших проверку и сами предложения
//        подлежащие исправлению.

import by.teachmeskills.lessen11.task2.TextFormater;

import java.io.FileWriter;
import java.io.IOException;

public class Task3App {
    public static void main(String[] args) {
        int count=0;
        //считываем основной текст и слова из black list.
        String text = TextFormater.textFileReader(".\\src\\by\\teachmeskills\\lessen11\\task3\\Text.txt");
        String blackList = TextFormater.textFileReader(".\\src\\by\\teachmeskills\\lessen11\\task3\\black list.txt");
        //разбиваем текст на предложения.
        String[] blackWords = TextFormater.splitBlackList(blackList);
        String[] sentences = TextFormater.splitSentence(text);
        int[] metka=TextFormater.blackWordsinSentence(sentences,blackWords);
        TextFormater.output(sentences,metka);
    }

}
