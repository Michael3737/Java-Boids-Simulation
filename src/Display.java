import javax.swing.*;
import java.awt.*;

class Display extends Canvas{

    public Display(int width, int height, String title, Simulation simulation){
        JFrame frame = new JFrame(title);

        frame.setPreferredSize(new Dimension(width,height));
        frame.setMaximumSize(new Dimension(width,height));
        frame.setMinimumSize(new Dimension(width,height));

        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.add(simulation);
        frame.setVisible(true);
        simulation.start();
    }
}