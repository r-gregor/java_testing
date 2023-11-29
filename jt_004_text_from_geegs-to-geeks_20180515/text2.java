// Java Program to create  a label 
// and add image to it .
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
class text2 extends JFrame {
 
    // frame
    static JFrame f;
 
    // label to diaplay text
    static JLabel l;
 
    // default constructor
    text2()
    {
    }
 
    // main class
    public static void main(String[] args)
    {
        // create a new frame to stor text field and button
        f = new JFrame("label");
 
        // create a new image icon
        ImageIcon i = new ImageIcon("image.png");
 
        // create a label to display image
        l = new JLabel(i);
 
        // create a panel
        JPanel p = new JPanel();
 
        // add label to panel
        p.add(l);
 
        // add panel to frame
        f.add(p);
 
        // set the size of frame
        f.setSize(500, 500);
 
        f.show();
    }
}