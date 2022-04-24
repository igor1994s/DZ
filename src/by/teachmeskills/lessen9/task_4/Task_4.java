package by.teachmeskills.lessen9.task_4;

public class Task_4 {

//    Даны строки разной длины (длина - четное число), необходимо вернуть ее два средних знака. Например, если дана строка "string"
//    результат будет "ri", для строки "code" результат "od",  для "Practice" результат "ct".

    public static void main(String[] args) {
        String [] st={"privet", "poka", "application", "dlina", "line"};
        centr(st);
    }

    public static void centr(String [] st){
        for (String s:st) {
            StringBuilder itog=new StringBuilder();
            if(s.length()%2==0){
                itog=new StringBuilder("Два средних знака от слова ").append(s).append(": ");
                itog.append(s.substring(s.length()/2-1,s.length()/2+1));
                System.out.println(itog);
            }else{
                itog.append("Длина слова: ").append(s).append(" нечетная!");
                System.out.println(itog);
            }
        }
    }
}
