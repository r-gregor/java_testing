import doors.*;
import windows.*;

public class House {

    public static void main(String[] args) {

        Doors myDoors = new Doors();
        Windows myWindows = new Windows();
        
        System.out.println("\nWhat about my house?");
        boolean my_doors_opened = myDoors.doorsOpenState();
        boolean my_doors_locked = myDoors.doorsLockState();
        
        System.out.println("\nOpening the doors ...");
        myDoors.Open();
        myDoors.doorsOpenState();
        myDoors.doorsLockState();

        System.out.println("\nUnlockig the doors ...");
        myDoors.Unlock();
        myDoors.doorsOpenState();
        myDoors.doorsLockState();
        
        System.out.println("\nOpening the doors ...");
        myDoors.Open();
        myDoors.doorsOpenState();
        myDoors.doorsLockState();

        
        System.out.println("\nLocking the doors ...");
        myDoors.Lock();
        myDoors.doorsOpenState();
        myDoors.doorsLockState();
        
        System.out.println("\nClosing the doors ...");
        myDoors.Close();
        myDoors.doorsOpenState();
        myDoors.doorsLockState();
        
        System.out.println("\nLocking the doors ...");
        myDoors.Lock();
        myDoors.doorsOpenState();
        myDoors.doorsLockState();
    }

}