
import javax.swing.*;

import Buttons.StartButton;
import Buttons.StopButton;
import Spinners.GasSpinner;

import java.awt.*;



public class VehicleView extends JFrame{
    private static final int X = 800;
    private static final int Y = 800;

    // The controller member
    private VehicleController vehicleC;
    private DrawPanel drawPanel;
    private JPanel controlPanel;
    private JPanel gasPanel;
    private JButton startButton;
    private JButton stopButton;
    private GasSpinner gasSpinner;


    // Constructor
    public VehicleView(String framename, VehicleController cc){
        this.vehicleC = cc;


        gasSpinner = new GasSpinner();
        drawPanel = new DrawPanel(X, Y-240, vehicleC.getVehicles());
        controlPanel = new ControllPanel(vehicleC.getTrucks(), vehicleC.getTurboCars(),
        vehicleC.getVehicles(), gasSpinner);
        gasPanel = new GasPanel(gasSpinner);
        startButton = new StartButton(vehicleC.getVehicles());
        stopButton = new StopButton(vehicleC.getVehicles());
        
        initComponents(framename);
    }

    public void moveit(int index, int x, int y){
        drawPanel.moveit(index, x, y);
    }

    public void repaint(){
        drawPanel.repaint();
    }


    private void initComponents(String title) {

        this.setTitle(title);
        this.setPreferredSize(new Dimension(X,Y));
        this.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));

        this.add(drawPanel);
        this.add(gasPanel);
        this.add(controlPanel);
        this.add(startButton);
        this.add(stopButton);

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