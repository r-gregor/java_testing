import java.io.*;

class ReadLines {
    public static void main(String args[]) throws IOException {
        // create a BufferedReader using System.in
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        // System.out.println("Enter 'S' to quit.");
        
        do {
            System.out.print("Enter a letter: ");
            str = br.readLine();
                        
            if (str.equals("S")) {
                System.out.println("Well Done! " + "\""+str+"\"" + " is the RIGHT letter!");
            } else {
                System.out.println("\""+str+"\"" + " is not the right letter");
            }
            
        } while(!str.equals("S"));
    }
}
