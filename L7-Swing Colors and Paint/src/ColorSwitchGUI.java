import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorSwitchGUI {

    //Declare your frame, panel and three buttons.
    JFrame window = new JFrame("Color Switchroo");
    JPanel panel = new JPanel();
    JButton buttonThemeDark = new JButton("Theme: Dark");
    JButton buttonThemeWarren = new JButton("Theme: Warren");
    JButton buttonThemePrimary = new JButton("Theme: Primary");

    public ColorSwitchGUI() {
        //create your GUI
        window.setSize(400, 300);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);

        panel.add(buttonThemeDark);
        panel.add(buttonThemePrimary);
        panel.add(buttonThemeWarren);

        window.add(panel);
        window.setVisible(true);
    }

    //add listeners to change the colors. Don't forget to link them to buttons.
    private class ThemeDark implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            Color panelBack = new Color(38, 28, 44);
            Color buttonBack = new Color(62, 44, 65);
            Color buttonText = new Color(110, 133, 178);

            panel.setBackground(panelBack);
            buttonThemeDark.setBackground(buttonBack);
            buttonThemeDark.setForeground(buttonText);
            buttonThemeWarren.setForeground(buttonText);
            buttonThemeWarren.setBackground(buttonBack);
            buttonThemePrimary.setBackground(buttonBack);
            buttonThemePrimary.setForeground(buttonText);
        }
    }
}