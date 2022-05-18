package by.teachmeskills.lessen15.taskOfLessen.task1;

import java.util.Comparator;

public class ComporatorHobby implements Comparator<People> {
    @Override
    public int compare(People o1, People o2) {
        return o2.getHobbies().size()-o1.getHobbies().size();
    }
}
