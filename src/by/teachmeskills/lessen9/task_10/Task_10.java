package by.teachmeskills.lessen9.task_10;

public class Task_10 {
    public static void main(String[] args) {
        String s="Меня зовут Игорь и я учусь на программиста.";
        int indexStart=0;
        int indexEnd=0;

        StringBuilder max=new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)!=' '&&s.charAt(i)!='.'){
                indexEnd++;
            }else if((indexEnd-indexStart)>max.length()){
                max= new StringBuilder(s.substring(indexStart, indexEnd));
                indexEnd++;
                indexStart=indexEnd;
            }else {
                indexEnd++;
                indexStart=indexEnd;
            }
        }
        System.out.printf("В предложении: \"%s\" самое длинное слово: %s.",s,max);
    }
}
