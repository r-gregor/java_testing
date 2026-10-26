package doors;

public class Doors2 {
    public boolean opened = false;
    public boolean locked = true;


    // DOORS STATE IS A SINGLE FUNCTION 20180527
    public void doorsState() {
        if (opened) {
            System.out.println("The doors are opened.");
        } else {
            System.out.println("The doors are closed.");
        }

        if (locked) {
            System.out.println("The doors are locked.");
        } else {
             System.out.println("The doors are unlocked.");
        }
    }

    public boolean Unlock() {
        locked = false;
        return locked;
    }

    public boolean Lock() {
        if (opened == true) {
            locked = false;
            System.out.println("The doors are opened. Cannot lock!");
        } else {
            locked = true;
        }
        return locked;
    }

    public boolean Open() {
        if (locked == true) {
            opened = false;
            System.out.println("The doors are locked. Cannot open!");
        } else {
            opened = true;
        }
        return opened;
    }

    public boolean Close() {
        opened = false;
        return opened;
    }
} // END CLASS
