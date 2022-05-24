package by.teachmeskills.lessen16.task3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Написать программу для валидации даты высокосного года.
public class Main {
    public static void main(String[] args) {
        String data="401-2-29";
        String _28day="([1-9]|1[0-9]|2[0-8])";
        String _29day="([1-9]|1[0-9]|2[0-9])";
        String _30day="([1-9]|[12][0-9]|30)";
        String _31day="([1-9]|[12][0-9]|3[01])";
        String monthOf31Day="([13578]|1[02])";
        String monthOf30Day="([469]|11)";
        String monthOf28Day="2";
        String monthOf29Day="2";
        String lowYear="([1-35-79]|" +          //одно-значный год
                "[13579][013-57-9]|[2468][1-35-79]|" +          //двух-значный год
                "[1-35-79][013579][013-57-9]|[1-35-79][02468][1-35-79]|[48][13579][013-57-9]|[48][02468][1-35-79]" +  //трех-значный год
                "[13579][01-35-79][013579][013-57-9]|[2468][])";
        String leapYear="([48]|" +
                "[13579][26]|[2468][046]" +
                "[1-9][13579][26]|[1-9][2468][046]|[1-9]0[48]|[48]00" +
                "[1-9][1-9][1-9][]|[1-9][1-9][13579][26]|[1-9][1-9][2468][048]|)";
        String dz=lowYear+"-"+monthOf28Day+"-"+_28day+"|"+lowYear+"-"+monthOf30Day+"-"+_30day+"|"+
                lowYear+"-"+monthOf31Day+"-"+_31day;

        Pattern pat=Pattern.compile(dz);
        Matcher mat=pat.matcher(data);
        System.out.println(mat.matches());
    }
}
