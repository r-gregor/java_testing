// GetAndPost.java

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.*;


public class GetAndPost {
    
    public static void main(String[] args) throws IOException {
        
        // GetAndPost gp = new GetAndPost();
        // gp.MyGETRequest();
        
        GetAndPost.MyGETRequest();
        
    }
    
    public static void MyGETRequest() throws IOException {
        
                
        Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress("10.91.8.21", 80));
        
        URL urlForGetRequest = new URL("https://jsonplaceholder.typicode.com/posts/1");
        String readLine = null;
        HttpURLConnection conection = (HttpURLConnection) urlForGetRequest.openConnection(proxy);
        conection.setRequestMethod("GET");
        // conection.setRequestProperty("userId", "a1bcdef"); // set userId its a sample here
        int responseCode = conection.getResponseCode();
        
        // myTEST
        System.out.printf("The response code is: %d", responseCode);

        if (responseCode == HttpURLConnection.HTTP_OK) {
            BufferedReader in = new BufferedReader(
                new InputStreamReader(conection.getInputStream()));
            StringBuffer response = new StringBuffer();
            while ((readLine = in .readLine()) != null) {
                response.append(readLine);
            } in .close();
            // print result
            System.out.println("JSON String Result " + response.toString());
            //GetAndPost.POSTRequest(response.toString());
        } else {
            System.out.println("GET NOT WORKED");
        }

    }

}