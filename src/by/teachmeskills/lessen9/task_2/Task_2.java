package by.teachmeskills.lessen9.task_2;

/*Дано два числа, например 3 и 56, необходимо составить следующие строки:
        3 + 56 = 59
        3 – 56 = -53
        3 * 56 = 168.
        Используем метод StringBuilder.append().
        Замените символ “=” на слово “равно”. Используйте методы StringBuilder.insert(), StringBuilder.deleteCharAt().
        Замените символ “=” на слово “равно”. Используйте методы StringBuilder.replace().*/

public class Task_2 {

    public static void main(String[] args) {
        int a=3;
        int b=56;
        StringBuilder sb1=new StringBuilder();
        StringBuilder sb2=new StringBuilder();
        StringBuilder sb3=new StringBuilder();
        StringBuilder [] sb={sb1,sb2,sb3};
        sb[0].append(a).append("+").append(b).append("=").append(a+b);
        sb[1].append(a).append("-").append(b).append("=").append(a-b);
        sb[2].append(a).append("*").append(b).append("=").append(a*b);
        StringBuilder [] sbReplace = new StringBuilder[3];
        for (int i = 0; i < sb.length; i++) {
            sbReplace[i]=new StringBuilder(sb[i]);
        }
        output(sb);
        System.out.println("Метод insert() and delete(): ");
        for (StringBuilder s:sb) {
            s.insert(s.indexOf("=")," равно ");
            s.deleteCharAt(s.indexOf("="));
        }
        output(sb);
        System.out.println("Метод replace(): ");
        for (StringBuilder s:sbReplace) {
            s.replace(s.indexOf("="),s.indexOf("=")+1," равно ");
        }
        output(sbReplace);
    }

    public static void output(StringBuilder [] sb){
        for (StringBuilder s:sb) {
            System.out.println(s);
        }
    }
}
