public class Person implements Cloneable {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    String getName() {
        return this.name;
    }

    int getAge() {
        return this.age;
    }

    int getHashcode() {
        return this.hashCode();
    }

    // from: https://www.javatpoint.com/object-cloning
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
