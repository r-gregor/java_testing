class Swap2 {
    Swap2() {
        System.out.println("Swap2");
    }
    
    // function to exchange elements and return an array
    int[] exch(int v1, int v2) {
            int inter;
            inter = v1;
            v1 = v2;
            v2 = inter;
            int[] arr1 = {v1, v2};
            return arr1;
    }
    
    // function to return a string of two array elements in a row separated with comma
    String display(int[] arr) {
        String str_out = arr[0] + ", " + arr[1];
        return str_out;
    }
    
    // MAIN
    public static void main(String[] args) {
        Swap2 sw = new Swap2();
        
        int var1 = 51;
        int var2 = 45;
        System.out.println("Original order: " + var1 + ", " + var2);
               
        
        int[] new_arr = sw.exch(var1, var2);
        System.out.println("New (after swap) order: " + sw.display(new_arr));
        
    } // END MAIN
}// END class