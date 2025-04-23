import java.io.*;
import java.net.*;
import java.util.*;

public class Hello_V2 {
    
    public static void displayApiInfo(String placeholder) throws IOException {
        
        Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress("10.91.8.21", 80));
        
        System.out.println("\n" + "-------------------------------------------------------------");
        System.out.printf("URL: %s%n", placeholder);
        System.out.println("-------------------------------------------------------------");

        URL url = new URL(placeholder);
        
        HttpURLConnection con = (HttpURLConnection) url.openConnection(proxy);
        con.setRequestMethod("GET");
        // con.setConnectTimeout(10000000);

        BufferedReader in = new BufferedReader(new InputStreamReader(
            con.getInputStream()));
        String inputLine;
        
        while ((inputLine = in.readLine()) != null) {
        System.out.println(inputLine);
        }
        
        in.close();
    }

    // main
    public static void main(String args[]) throws IOException {
        String[] myURL2 = {"https://jsonplaceholder.typicode.com/posts/1", "https://api.github.com/users/google", "https://reqres.in/api/users/2", "http://jsonvat.com/rates", "https://api.exchangerate-api.com/v4/latest/GBP"};
        
        for (int i = 0; i < myURL2.length; i++) {
            Hello_V2.displayApiInfo(myURL2[i]);
        }

    }
}