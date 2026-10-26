class Swap {
    Swap() {
        System.out.println("Swap");
    }
    
    int[] exch(int v1, int v2) {
            int inter;
            inter = v1;
            v1 = v2;
            v2 = inter;
            int[] arr1 = {v1, v2};
            return arr1;
    }
    
    void display(int[] arr) {
        System.out.print(arr[0] + ", ");
    }
    
    public static void main(String[] args) {
        Swap sw = new Swap();
        
        int var1 = 51;
        int var2 = 45;
        System.out.println("Original order: " + var1 + ", " + var2);

        int[] new_arr = sw.exch(var1, var2);
        System.out.println("New (after swap) order: " + new_arr[0] + ", " + new_arr[1]);
    }
}