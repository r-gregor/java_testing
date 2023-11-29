// GetAndPost.java

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.*;


public class GetAndPost_V2 {
    
    public static void main(String[] args) throws IOException {
        
        /*
         * https://pokeapi.co/api/v2/pokemon/ditto/
         * 
         * 
        */
        
        String[] myURL2 = {"https://jsonplaceholder.typicode.com/posts/1", "https://api.github.com/users/google", "https://reqres.in/api/users/2", "http://jsonvat.com/rates", "https://api.exchangerate-api.com/v4/latest/GBP"};
        
        for (int i = 0; i < myURL2.length; i++) {
            GetAndPost_V2.MyGETRequest(myURL2[i]);
        }
        
    }
    
    public static void MyGETRequest(String placeholder) throws IOException {
        
                
        Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress("10.91.8.21", 80));
        
        System.out.println("\n" + "-------------------------------------------------------------");
        System.out.printf("URL: %s%n", placeholder);
        System.out.println("-------------------------------------------------------------");
        
        URL urlForGetRequest = new URL(placeholder);
        
        String readLine = null;
        HttpURLConnection conection = (HttpURLConnection) urlForGetRequest.openConnection(proxy);
        conection.setRequestMethod("GET");
        // conection.setRequestProperty("userId", "a1bcdef"); // set userId its a sample here
        int responseCode = conection.getResponseCode();
        
        // myTEST
        System.out.printf("The response code is: %d%n", responseCode);

        if (responseCode == HttpURLConnection.HTTP_OK) {
            BufferedReader in = new BufferedReader(
                new InputStreamReader(conection.getInputStream()));
            StringBuffer response = new StringBuffer();
            while ((readLine = in .readLine()) != null) {
                response.append(readLine);
            } in .close();
            // print result
            System.out.println("JSON String Result:\n" + response.toString());

        } else {
            System.out.println("GET NOT WORKED");
        }

    }

}