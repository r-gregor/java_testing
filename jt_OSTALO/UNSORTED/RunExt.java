// filename: RunExt.java


import java.io.*;


public class RunExt {
    public static void main(String[] args) throws Exception {
        
        String[] cmd = {"C:\\Users\\gregor.redelonghi\\myprogs\\cygwin64\\bin\\bash.exe", "-c", "echo \"Hello Gregor Redelonghi! 20190826\" > heil.txt"};
        Runtime.getRuntime().exec(cmd);
    }
}
