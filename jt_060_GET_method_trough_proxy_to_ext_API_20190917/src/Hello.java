import java.io.*;
import java.net.*;
import java.util.*;

public class Hello {

    public static void main(String args[]) throws IOException {
        
        Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress("10.91.8.21", 80));

        URL url = new URL("https://api.github.com/users/google");
        
        
        HttpURLConnection con = (HttpURLConnection) url.openConnection(proxy);
        con.setRequestMethod("GET");
        con.setConnectTimeout(10000000);
        
        
        // method 2
        // con.setRequestProperty("Accept", "application/json");
        // con.setRequestProperty("Request Method","GET");

        
        BufferedReader in = new BufferedReader(new InputStreamReader(
            con.getInputStream()));
        String inputLine;
        
        while ((inputLine = in.readLine()) != null) {
        System.out.println(inputLine);
        }
        
        in.close();
    }
}