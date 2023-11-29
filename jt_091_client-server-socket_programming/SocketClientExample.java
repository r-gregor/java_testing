// from:
// filename: jv_socket-programming-server-client_20201016.txt
// https://www.journaldev.com/741/java-socket-programming-server-client
//  first run the server: SocketServerExample in first console window
//  then run the client: SocketClientExample in another console window

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * This class implements java socket client
 * @author pankaj
 *
 */
public class SocketClientExample {

    public static void main(String[] args) throws UnknownHostException, IOException, ClassNotFoundException, InterruptedException{
        //get the localhost IP address, if server is running on some other IP, you need to use that
        InetAddress host = InetAddress.getLocalHost();
    
        // added by me -- TEST
        System.out.println("===========================================");
        System.out.printf("Host: %s%n", host);
        System.out.println("===========================================");

        Socket socket = null;
        ObjectOutputStream oos = null;
        ObjectInputStream ois = null;
        for(int i=0; i<5;i++){
            
            //establish socket connection to server
            socket = new Socket(host.getHostName(), 9876);
            
            //write to socket using ObjectOutputStream
            oos = new ObjectOutputStream(socket.getOutputStream());
            System.out.println("Sending request to Socket Server");
            if(i==4)oos.writeObject("exit");
            else oos.writeObject(""+i);
            
            //read the server response message
            ois = new ObjectInputStream(socket.getInputStream());
            String message = (String) ois.readObject();
            System.out.println("Message: " + message);
            
            //close resources
            ois.close();
            oos.close();
            Thread.sleep(100);
        }
    }
}
