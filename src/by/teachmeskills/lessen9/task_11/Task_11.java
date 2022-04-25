package by.teachmeskills.lessen9.task_11;

//Предложение состоит из нескольких слов, разделенных пробелами. Например: "One two three раз два три one1 two2 123 ".
//Найти количество слов, содержащих только символы латинского алфавита.

public class Task_11 {
    public static void main(String[] args) {
        String s="One two three раз два три one1 two2 123";
        char c;
        byte[] b=s.getBytes();
        int indexStart=0;
        int indexEnd=0;
        int abc=0;
        int lat=0;

        for (int i = 0; i < s.length(); i++) {
            c=s.charAt(i);
            if(c!=' '){
                if(b[i]>=65&&b[i]<=90||b[i]>=97&&b[i]<=122){
                    abc++;
                }
                indexEnd++;
            }else if((indexEnd-indexStart)==abc){
                indexEnd++;
                indexStart=indexEnd;
                lat++;
                abc=0;
            }else{
                indexEnd++;
                indexStart=indexEnd;
            }
        }
        System.out.printf("\nВ строке \"%s\" количество слов, сожержащих только буквы латирнского алфавита равно: %d.",s,lat);
    }
}
