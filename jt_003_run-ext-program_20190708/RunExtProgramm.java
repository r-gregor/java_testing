// filename;  RunExtProgramm.java

import java.util.*;
import java.io.IOException;

public class  RunExtProgramm {
    public static void main(String[] args) {
        try
        {
            // Command to create an external process
            // String command = "c:\\Program Files\\Internet Explorer\\iexplore.exe";
            String command = "/usr/bin/thunderbird";

            // Running the above command
            Runtime r  = Runtime.getRuntime();
            Process proc = r.exec(command);
        }

        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
