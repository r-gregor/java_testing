import java.util.Scanner;

class Padec_V2 {
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
    Padec_V2() {
    }
    
    // parameterized constructor
    Padec_V2(float pt1, float pt2, float x_dst) {
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
        // System.out.println("Drop in percentage: " + this.padec() + " %");
        String value = String.format("Drop in percentage: %.3f %%%n", this.padec()).replace(",", ".");
        System.out.println(value);
    }
    
    
    // MAIN
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Drop calculator V2");
        System.out.print("Enter first vertical point value in metres - pt1: ");
        float new_pt1 = Float.valueOf(input.nextLine().replace(",", "."));
        System.out.print("Enter second vertical point value in metres - pt2: ");
        float new_pt2 = Float.valueOf(input.nextLine().replace(",", "."));
        System.out.print("Enter horizontal distance in metres - x_dst: ");
        float new_x_dst = Float.valueOf(input.nextLine().replace(",", "."));
        

        System.out.println("\nCalculation:\n=============================================");
        Padec_V2 pd = new Padec_V2(new_pt1, new_pt2, new_x_dst);
        
        // print
        pd.print_out();

  
    } // end MAIN
}

