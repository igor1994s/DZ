package by.teachmeskills.lessen9.task_3;

/*
Напишите метод, заменяющий в строке каждое второе вхождение «object-oriented programming» (не учитываем регистр символов) на «OOP».
Например, строка "Object-oriented programming is a programming language model organized around objects rather than "actions" and
data rather than logic. Object-oriented programming blabla. Object-oriented programming bla." должна быть преобразована в
"Object-oriented programming is a programming language model organized around objects rather than "actions" and data rather
than logic. OOP blabla. Object-oriented programming bla."
*/

public class Task_3 {

    public static void main(String[] args) {
        String oop="object-oriented programming";
        String text="\"Object-oriented programming is a programming language model organized around objects rather than \"actions\" and \n" +
                "data rather than logic. Object-oriented programming blabla. Object-oriented programming bla.\"";
        change(text,oop);

    }

    public static void change(String text, String oop){
        StringBuilder itog=new StringBuilder(text);
        int count=0;
        int indexEnd=1;
        int indexStart=0;
        while(indexStart!=indexEnd+oop.length()) {
                indexEnd=text.toLowerCase().lastIndexOf(oop);
                indexStart=text.toLowerCase().indexOf(oop,indexStart);
                indexStart=indexStart + oop.length();
                count++;
        }
        indexStart=0;
        for (int i = 1; i <= count; i++) {
            indexStart=text.toLowerCase().indexOf(oop,indexStart);
            if(i%2==0) {
                itog.replace(indexStart, indexStart + oop.length(), "OOP");
            }
            indexStart=indexStart + oop.length();
        }
        System.out.println(itog);
    }
}
