import java.util.*;
import java.nio.file.*;
import java.nio.*;
import java.io.IOException;

public class LinkTest {
    
    public static void main(String[] args) throws IOException {
        
        Path file1 = Paths.get("test1.txt");
        System.out.println(file1.toRealPath());
        Path hLink = Paths.get("test1.hLink");
        Path sLink = Paths.get("test1.symLink");
    
        try {
            Files.createSymbolicLink(sLink, file1);
    
        } catch (UnsupportedOperationException ex) {
            System.out.println("This OS doesn't support creating Sym links");
        }
    
        try {
            Files.createLink(hLink, file1);
            System.out.println(hLink.toRealPath());
        } catch (UnsupportedOperationException ex) {
            System.out.println("This OS doesn't support creating Sym links");
        }

    }
}