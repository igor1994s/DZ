package by.teachmeskills.lessen11.task2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TextFormater {
    //метод для чтения текста из файла.
    public static String textFileReader(String input) {
        StringBuilder stringBuilder = new StringBuilder();
        try (FileReader fileReader = new FileReader(input)) {
            int a;
            while ((a = fileReader.read()) != -1) {
                stringBuilder.append((char) (a));
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return stringBuilder.toString();
    }
    //метод для записи(дозаписи) одного предложения в итоговый файл.
    public static void textFileWriter(String output, String sentence) {
        try (FileWriter fileWriter = new FileWriter(output,true)) {
            fileWriter.write(sentence);
            fileWriter.write('.');
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    //метод для деления текста на предложения файла.
    public static String[] splitSentence(String text) {
        String[] sentence = text.split("\\.");
        return sentence;
    }
    //метод для деления предложения на слова.
    public static boolean valueWords(String sentence) {
        int countWords;
        String[] words = sentence.split("\\ ");
        if (words.length >= 3 && words.length <= 5) {
            return true;
        } else return false;
    }
    //метод для поиска полиндрома в предложении.
    public static boolean polidromsInSentence(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        char letter;

        for (int i = 0; i < s.length(); i++) {
            letter = s.charAt(i);

            if ((letter != ' ')&&(letter != ',')&&(letter != '-')) {
                stringBuilder.append(letter);
            }else if (stringBuilder.length() >= 3) {
                String sreverse = String.valueOf(stringBuilder.reverse());
                stringBuilder.reverse();
                if (sreverse.equalsIgnoreCase(String.valueOf(stringBuilder))) {
                    System.out.println("Polidrom write");
                    return true;
                }
                else stringBuilder.delete(0,stringBuilder.length());
            }
        }
        return false;
    }
}
