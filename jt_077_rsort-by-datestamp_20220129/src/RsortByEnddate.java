    // filename: RsortByEnddate.java

public class RsortByEnddate {
    
    
    /** RsortByEnddate */
    public static void main(String[] argv) {
        String mydir;
                
        if (argv.length == 1) {
            mydir = argv[0];
        } else {
            mydir = ".";
        } // end if

        DirWalkRsort dw3 = new DirWalkRsort(mydir);

        // dw3.displayFiles();
        dw3.printDjtsAndFjls();

    } // end RsortByEnddate
    
} // end class
