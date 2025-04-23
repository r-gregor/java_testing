public class MyArrayTest {
    int[] my_array_1 = new int[10];
    
    int curr = 0;
    int mal = my_array_1.length;
    
    void addm(int mem) {
        my_array_1[curr] = mem;
        System.out.println("\nAdding " + mem + " to my_array_1.");
        curr += 1;
    }
    
    int how_many() {
        return curr;
    }
    
    void status() {
        System.out.println("Number of elements: " + how_many());
    }
    
    void show() {
        System.out.println("\nElements in my_array_1 are: ");
        for (int i = 0; i < mal; i++) {
            if (my_array_1[i] != 0) {
                System.out.println("Element " + i + ": " + my_array_1[i]);
            }
        }
    }
    
    public static void main(String[] args) {
        
        MyArrayTest mt = new MyArrayTest();
        mt.status();
        
        mt.addm(10);
        mt.status();
        
        mt.addm(65);
        mt.status();        
        
        mt.addm(33);
        mt.status();

        mt.show();
        
        mt.addm(99);
        mt.status();
        
        mt.addm(1050);
        mt.status();
        
        mt.addm(909);
        mt.status();
        
        mt.addm(-65);
        mt.status();
        
        mt.show();
    }

}