// filename: ShellCommandTest.java

import java.util.*;
import java.io.IOException;
import java.io.*;

public class ShellCommandTest {

    public static void RunCommand(ProcessBuilder my_process) {
        
        try {

            Process process = my_process.start();
            StringBuilder output = new StringBuilder();
            BufferedReader reader = new BufferedReader(
                                new InputStreamReader(process.getInputStream()));

            
            String line;
            while ((line = reader.readLine()) != null) {
                    output.append(line + "\n");
            }

            int exitVal = process.waitFor();
            if (exitVal == 0) {
                    // System.out.println("Success!");
                    System.out.println(output);
                    // NO SYSTEM EXIT YOU DUMB !!!
                    //System.exit(0);
            } else {
                    //abnormal...
            }

        } catch (IOException e) {
                e.printStackTrace();
                
        } catch (InterruptedException e) {
                e.printStackTrace();
        }
        
    }
    
    public static void main(String[] args) {
        
        // create all processes before running them!
        ProcessBuilder process_2 = new ProcessBuilder();
        process_2.command("bash", "-c", "ln -snfv base_test_file.txt base_test_file_slink");
        
        ProcessBuilder process_1 = new ProcessBuilder();
        process_1.command("bash", "-c", "ls -d ./*");

        
        // Run processes
        System.out.println("Running proces_1 (listing current directory)...");
        RunCommand(process_1);
        
        System.out.println("Running proces_2 (creating softlink)...");
        RunCommand(process_2);
        
        System.out.println("Running proces_1 (listing current directory)...");
        RunCommand(process_1);

        
        /*
        try {
            ProcessBuilder process_1 = new ProcessBuilder();
            process_1.command("bash", "-c", "ls -d ./*");
            System.out.println("Running proces_1 (listing current directory)...");
            Process process = process_1.start();
            
            Process process = process_1.start();
            StringBuilder output = new StringBuilder();
            BufferedReader reader = new BufferedReader(
                                new InputStreamReader(process.getInputStream()));

            String line;
            while ((line = reader.readLine()) != null) {
                    output.append(line + "\n");
            }

            int exitVal = process.waitFor();
            if (exitVal == 0) {
                    // System.out.println("Success!");
                    System.out.println(output);
                    
                    // NO SYSTEM EXIT YOU DUMB !!!
                    // System.exit(0);                    

            } else {
                    //abnormal...
            }

        } catch (IOException e) {
                e.printStackTrace();
                
        } catch (InterruptedException e) {
                e.printStackTrace();
        }
        */

    }

}
