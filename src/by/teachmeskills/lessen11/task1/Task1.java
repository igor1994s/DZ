package by.teachmeskills.lessen11.task1;

//1)В исходном файле находятся слова, каждое слово на новой стороке. После
//        запуска программы должен создать файл, который будет содержать в себе
//        только полиндромы

import java.io.*;

public class Task1 {
    public static void main(String[] args) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("D:\\Igor\\JavaCourse\\TMS\\src\\by\\teachmeskills\\lessen11\\task1\\words.txt"));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("D:\\Igor\\JavaCourse\\TMS\\src\\by\\teachmeskills\\lessen11\\task1\\polidroms.txt"))) {
            String s;

            while((s=bufferedReader.readLine())!=null){
                if(polidroms(s)){
                    bufferedWriter.write(s+"\n");
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }

    public static boolean polidroms(String s){
        StringBuilder stringBuilder=new StringBuilder(s);
        String sreverse= String.valueOf(stringBuilder.reverse());
        if(s.equals(sreverse)){
            System.out.println("Polidrom write");
            return true;
        }else{
            return false;
        }
    }
}








//        try(BufferedReader bufferedReader=new BufferedReader(new FileReader(file));
//            BufferedWriter bufferedWriter=new BufferedWriter(new FileWriter(fileout))) { // создали объект BufferedReader, который в конструкторе принимает FileReader-поток, который читает посимвально.
//            if (file.createNewFile()) { //проверка на созданный файл
//                System.out.println("Файл создан");
//            }
//
//            String line;
//            while((line=bufferedReader.readLine())!=null){
//                StringBuilder stringBuilder = new StringBuilder();
//                stringBuilder.append(line);
//                if(line==stringBuilder.reverse().toString()){
//bufferedWriter.write(line);
//                }
//            }
//
//            StringBuilder stringBuilder = new StringBuilder();
//            stringBuilder = stringBuilder.append(bufferedReader.readLine());
//        }catch (Exception e){
//            e.printStackTrace();
//        }

