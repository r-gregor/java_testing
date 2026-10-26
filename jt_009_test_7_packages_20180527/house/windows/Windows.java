package windows;

public class Windows {
    public boolean opened;
    public boolean closed = true;
    
    public boolean open() {
        opened = true;
        System.out.println("The windows are now opened.");
        return opened;
    }
    
    public boolean close() {
        opened = false;
        System.out.println("The windows are now closed.");
        return opened;
    }    
}