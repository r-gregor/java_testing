package doors;

public class Doors {
    public boolean opened = false;
    public boolean locked = true;
    
    
    // PUT UNDER SINGLE FUNCTION --> state()
    public boolean doorsOpenState() {
        boolean state;
        if (opened) {
            System.out.println("The doors are opened.");
            state = opened;
        } else {
            System.out.println("The doors are closed.");
            state = opened;
        }
        return state;
    }

    public boolean doorsLockState() {
        boolean state;
        if (locked) {
            System.out.println("The doors are locked.");
            state = locked;
        } else {
             System.out.println("The doors are unlocked.");
            state = locked;
        }
        return state;
    }
    // PUT UNDER SINGLE FUNCTION --> state()
    
    
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
    
}