import doors.*;
import windows.*;

public class House2 {

    public static void main(String[] args) {
        
        System.out.println("This is House2 class -- retrieving from doors/Dors2 class!");
        
        Doors2 myDoors = new Doors2();
        Windows myWindows = new Windows();

        System.out.println("\nWhat about my house?");
        myDoors.doorsState();

        System.out.println("\nOpening the doors ...");
        myDoors.Open();
        myDoors.doorsState();

        System.out.println("\nUnlockig the doors ...");
        myDoors.Unlock();
        myDoors.doorsState();

        System.out.println("\nOpening the doors ...");
        myDoors.Open();
        myDoors.doorsState();

        System.out.println("\nLocking the doors ...");
        myDoors.Lock();
        myDoors.doorsState();

        System.out.println("\nClosing the doors ...");
        myDoors.Close();
        myDoors.doorsState();

        System.out.println("\nLocking the doors ...");
        myDoors.Lock();
        myDoors.doorsState();
    } // END MAIN

} // END CLASS
