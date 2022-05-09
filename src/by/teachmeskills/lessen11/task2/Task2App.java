package by.teachmeskills.lessen11.task2;

//2)Текстовый файл содержит текст. После запуска программы в другой файл
//        должны записаться только те предложения в которых от 3-х до 5-ти слов. Если в
//        предложении присутствует слово-палиндром, то не имеет значения какое кол-во
//        слов в предложении, оно попадает в новый файл.
//        Пишем все в ООП стиле. Создаём класс TextFormater
//        в котором два статических метода:
//        1. Метод принимает строку и возвращает кол-во слов в строке.
//        2. Метод принимает строку и проверяет есть ли в строке слово-палиндром. Если
//        есть возвращает true, если нет false
//        В main считываем файл.
//        Разбиваем текст на предложения. Используя методы класса TextFormater
//        определяем подходит ли нам предложение. Если подходит добавляем его в
//        новый файл

import java.io.*;

public class Task2App {
    public static void main(String[] args) {
        String text=TextFormater.textFileReader("D:\\Igor\\JavaCourse\\TMS\\src\\by\\teachmeskills\\lessen11\\task2\\Text.txt");
        String[] sentence =TextFormater.splitSentence(text);
        for (int i = 0; i < sentence.length; i++) {
            if((TextFormater.polidromsInSentence(sentence[i]))||(TextFormater.valueWords(sentence[i]))){
            TextFormater.textFileWriter("D:\\Igor\\JavaCourse\\TMS\\src\\by\\teachmeskills\\lessen11\\task2\\Textitog.txt", sentence[i]);
            }
        }
    }
}

