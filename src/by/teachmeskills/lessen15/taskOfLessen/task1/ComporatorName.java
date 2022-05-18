package by.teachmeskills.lessen15.taskOfLessen.task1;

import java.util.Comparator;

public class ComporatorName implements Comparator<People> {
    @Override
    public int compare(People o1, People o2) {
        return o1.getName().compareTo(o2.getName());
    }

}
