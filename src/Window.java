package src;
import javax.swing.*;
import java.awt.*;


public class Window extends JFrame{
    private static final int X = Config.X;
    private static final int Y = Config.Y;

    public Window(String title, View view, Controller controller) {
        initComponents(title, view, controller);
    }


    private void initComponents(String title, View view, Controller controller) {

        this.setTitle(title);
        this.setPreferredSize(new Dimension(X,Y));
        this.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
        this.add(view);
        this.add(controller);
        

        // Make the frame pack all it's components by respecting the sizes if possible.
        this.pack();

        // Get the computer screen resolution
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        // Center the frame
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        // Make the frame visible
        this.setVisible(true);
        // Make sure the frame exits when "x" is pressed
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
