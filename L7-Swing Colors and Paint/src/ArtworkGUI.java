import java.awt.*;
import javax.swing.*;


public class ArtworkGUI {
JFrame frame;
    //DECLARE VARIABLES

    public ArtworkGUI()
    {
        //CREATE THE GUI
        frame = new JFrame("artwork");
        frame.setSize(400,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        JPanel panel = new Artwork();
        frame.setVisible(true);
        frame.add(panel);

    }

    private static class Artwork extends JPanel
    {
        public Artwork() {
            //Set the background color
            setBackground(Color.WHITE);
        }
        public void paintComponent(Graphics g){
            super.paintComponent(g);

            g.setColor(Color.ORANGE);
            g.fillRect(50,50,25,50);

            g.setColor(Color.GREEN);
            g.drawLine(50,50,25,50);

            g.setColor(Color.GREEN);
            g.drawLine(100,50,25,50);

            g.setColor(Color.GREEN);
            g.drawLine(100,50,25,50);

            g.setColor(Color.GREEN);
            g.drawLine(50,25,25,50);

            g.setColor(Color.GREEN);
            g.drawLine(50,25,100,50);


        }
    }
}
