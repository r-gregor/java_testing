// DiffSorter.java

import java.util.Comparator;

public class DiffSorter implements Comparator<Person>
{
    @Override
    public int compare(Person o1, Person o2) {
        return o1.getDiff() - (o2.getDiff());
        // o2.getDiff() - o1.getDiff()  --> descending order
        // 01.getDiff() - 02.getDiff()  --> ascending order
        // o1.getDiff().compareTo(o2.getDiff()) if Integer and not int
    }
}