class Padec2 {
    float pt1;
    float pt2;
    float x_dst;
    float padec;
    
    // vertical distance
    float y_dlt() {
            return pt2 - pt1;
        }
    
    // padec
    float padec() {
        return (y_dlt()/x_dst)*100.0F;
    }
    
    // default constructor
    Padec2() {
    }
    
    // parameterized constructor
    Padec2(float pt1, float pt2, float x_dst) {
        this.pt1 = pt1;
        this.pt2 = pt2;
        this.x_dst = x_dst;
    }

    // print out function
    void print_out() {
        System.out.println("Point T1: " + this.pt1 + " m");
        System.out.println("Point T2: " + this.pt2 + " m");
        System.out.println("Horizontal distance x_dst: " + this.x_dst + " m");
        System.out.println("Vertical distance y_dlt: " + this.y_dlt() + " m");
        System.out.println("=============================================");
        System.out.println("Drop in percentage: " + this.padec() + " %");
    }
    
    
    // MAIN
    public static void main(String[] args) {
        
        // A)
        System.out.println("\nParameterized constructor: -------------------------");
        Padec2 pd2 = new Padec2(300.45F, 301.15F, 150F);
        
        // print
        pd2.print_out();

        
        // B)
        System.out.println("\nDefault constructor: -------------------------");
        Padec2 pd1 = new Padec2();
        pd1.pt1 = 302.05F;
        pd1.pt2 = 304.15F;
        pd1.x_dst = 175F;
        
        // print
        pd1.print_out();
  
    } // end MAIN
}

