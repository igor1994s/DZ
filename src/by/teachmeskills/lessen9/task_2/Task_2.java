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
        sb1.append(a+"+"+b+"="+(a+b));
        sb2.append(a+"-"+b+"="+(a-b));
        sb3.append(a+"*"+b+"="+(a*b));
        StringBuilder sbReplace1=new StringBuilder(sb1);
        StringBuilder sbReplace2=new StringBuilder(sb2);
        StringBuilder sbReplace3=new StringBuilder(sb3);
        System.out.println(sb1);
        System.out.println(sb2);
        System.out.println(sb3);
        System.out.println("Метод insert() and delete(): ");
        sb1.insert(sb1.indexOf("=")," равно ");
        sb1.deleteCharAt(sb1.indexOf("="));
        sb2.insert(sb2.indexOf("=")," равно ");
        sb2.deleteCharAt(sb2.indexOf("="));
        sb3.insert(sb3.indexOf("=")," равно ");
        sb3.deleteCharAt(sb3.indexOf("="));
        System.out.println(sb1);
        System.out.println(sb2);
        System.out.println(sb3);
        System.out.println("Метод replace(): ");
        sbReplace1.replace(sbReplace1.indexOf("="),sbReplace1.indexOf("=")+1," равно ");
        sbReplace2.replace(sbReplace2.indexOf("="),sbReplace2.indexOf("=")+1," равно ");
        sbReplace3.replace(sbReplace3.indexOf("="),sbReplace3.indexOf("=")+1," равно ");
        System.out.println(sbReplace1);
        System.out.println(sbReplace2);
        System.out.println(sbReplace3);
    }
}
