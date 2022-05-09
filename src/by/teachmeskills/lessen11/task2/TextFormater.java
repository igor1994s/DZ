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
        try (FileWriter fileWriter = new FileWriter(output, true)) {
            fileWriter.write(sentence);
            fileWriter.write('.');
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    //метод для деления текста на предложения.
    public static String[] splitSentence(String text) {
        String[] sentence = text.split("\\. ");
        return sentence;
    }

    public static String[] splitBlackList(String blackList) {
        String[] blackWords = blackList.split("\r\n");
        return blackWords;
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

            if ((letter != ' ') && (letter != ',') && (letter != '-')) {
                stringBuilder.append(letter);
            } else if (stringBuilder.length() >= 3) {
                String sreverse = String.valueOf(stringBuilder.reverse());
                stringBuilder.reverse();
                if (sreverse.equalsIgnoreCase(String.valueOf(stringBuilder))) {
                    System.out.println("Polidrom write");
                    return true;
                } else stringBuilder.delete(0, stringBuilder.length());
            }
        }
        return false;
    }

    public static int[] blackWordsinSentence(String[] sentences, String[] blackWords) {
        int[] metka=new int[sentences.length];
        for (int i = 0; i < sentences.length; i++) {
            for (int j = 0; j < blackWords.length; j++) {
                if(sentences[i].toLowerCase().contains(blackWords[j].toLowerCase())){
                    metka[i]=1;
                    break;
                }else{
                    metka[i]=0;
                }
            }
        }
        return metka;
    }

    public static void output(String[] sentences, int[]metka){
        int sum=0;
        StringBuilder out=new StringBuilder();
        for (int i:metka) {
            sum+=i;
        }
        if(sum==0){
            out.append("Данный текст прошел цензуру.");
        }else{
            out.append("Текст не прошел цензуру. Вот предложения в которых нужно что-то подправить: \n");
            for (int i=0;i<metka.length;i++) {
                if(metka[i]==1){
                    out.append(sentences[i]+".\n");
                }
            }
        }
        System.out.println(out);
    }
}
