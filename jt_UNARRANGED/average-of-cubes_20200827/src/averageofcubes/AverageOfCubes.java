package averageofcubes;


public class AverageOfCubes {
    int N;

    public AverageOfCubes(int N) {
        this.N = N;
    }

    /*
    // O(N) method:
    private int sumOfCubes() {
        int sum = 0;
        for (int i = 1; i < this.N + 1; i++) {
            sum = sum + (i * i * i);
        }
        return sum;
    }
    */

    // O(1) method: sum of cubes = [(n*(n+1))/2]^2
    private int sumOfCubes2() {
        int sum = 0;
        sum = (int)((N * (N + 1)) / 2);
        int sumOfCubes = sum * sum;
        return sumOfCubes;
    }

    private double average() {
        double average = (double)this.sumOfCubes2() / this.N;
        return average;
    }

    public void result() {
        System.out.printf("The number of consecutive integers N: %d%n", this.N);
        System.out.printf("The sum of cubes S: %d%n", this.sumOfCubes2());
        System.out.printf("The average of cubes A: %.2f%n", this.average());
    }

    public void result2() {
        String[] comp = new String[this.N];

        for (int i = 0; i < this.N; i++) {
            comp[i] = String.valueOf(i + 1) + "^3";
        }

        String line = String.join(" + ", comp);

        System.out.printf("The number of consecutive integers N: %d%n", this.N);
        System.out.print("The sum of cubes: " + line + " = " + this.sumOfCubes2() + "\n");
        System.out.printf("The average of cubes: %.2f%n", this.average());
    }

    public static void main(String[] args) {
        AverageOfCubes aoc = new AverageOfCubes(8);
        // aoc.result();
        aoc.result2();
    }
}

