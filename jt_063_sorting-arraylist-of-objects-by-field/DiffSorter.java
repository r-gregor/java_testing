// DiffSorter.java

import java.util.Comparator;

public class DiffSorter implements Comparator<Person>
{
    @Override
    public int compare(Person o1, Person o2) {
        return o1.getDiff() - (o2.getDiff());
    }
}