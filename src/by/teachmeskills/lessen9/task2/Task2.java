package by.teachmeskills.lessen9.task2;

public class Task2 {
    public static void main(String[] args) {
        String st = "Good day! I am Igor.";

        String element3 = String.valueOf(st.charAt(3));
        String element0 = String.valueOf(st.charAt(0));
        StringBuilder sb = new StringBuilder(st);
        System.out.println(sb);
        int indexStart = sb.indexOf(element3);
        int indexEnd = sb.lastIndexOf(element3);
        int index=0;

        do {
            index = sb.indexOf(element3, index + 1);
            sb.replace(index, index + 1, element0);
        }
        while (index != indexEnd);

        System.out.println(sb);

    }
}
