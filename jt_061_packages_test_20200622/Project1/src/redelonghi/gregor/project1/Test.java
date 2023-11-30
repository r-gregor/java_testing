package redelonghi.gregor.project1;

class Test {
    String name;
    int age;

    // prevented to be instantiated with no parameters!
    private Test() {};

    Test(String name, int age) {
        this.name = name;
        this.age = age;
    };

    // static factory method
    public static Test creatATestInstance(String name, int age) {
        String newName = "Mr. " + name;
        int newAge = age * 2;
        return new Test(newName, newAge);
    }

    String getName() {
        return this.name;
    }

    int getAge() {
        return this.age;
    }
}