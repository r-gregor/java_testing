public class MethodsChainTesting {
    String name;
    String sname;
    int age;

    MethodsChainTesting() {};

    MethodsChainTesting setName(String name) {
        this.name = name;
        return this;
    }

    MethodsChainTesting setSName(String sname) {
        this.sname = sname;
        return this;
    }

    MethodsChainTesting setAge(int age) {
        this.age = age;
        return this;
    }

    MethodsChainTesting display() {
                System.out.println("Name: " +this.name+ ", S-name: " +this.sname+ ", Age: " +this.age);
        return this;
    }

    void info() {
        System.out.println("Just a name: " +this.name);
    }

    public static void main(String[] args) {
        MethodsChainTesting t1 = new MethodsChainTesting().setName("Gregor").setSName("Redelonghi").setAge(52);
        t1.display();

        // no name??
        new MethodsChainTesting().setName("Zala").setSName("Redelonghi").setAge(24).display();

        MethodsChainTesting t3 = new MethodsChainTesting().setName("Mark").setSName("Redelonghi").setAge(21).display();
        MethodsChainTesting t4 = new MethodsChainTesting().setName("Tadeja").setSName("Mali Redelonghi").display();
        MethodsChainTesting t5 = new MethodsChainTesting().setName("�pela").setAge(12).display();
        MethodsChainTesting t6 = new MethodsChainTesting().setAge(100000).setSName("Zoa").setName("Proto").display();

        MethodsChainTesting[] ts = new MethodsChainTesting[]{t1, t3, t4, t5, t6};

        for (int i = 0; i < ts.length; i++) {
            ts[i].info();
        }
    }
}
