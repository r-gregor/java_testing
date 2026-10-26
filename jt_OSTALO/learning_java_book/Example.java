import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Example extends JFrame
{

    public Example()
    {
       setTitle("Simple example");
       setSize(300, 200);
       setLocationRelativeTo(null);
       setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args)
    {
       Example ex = new Example();
       ex.setVisible(true);
    }
}
