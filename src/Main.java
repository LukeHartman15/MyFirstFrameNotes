import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
       //1 Create a frame
        JFrame frame = new JFrame();
        //2 Create a panel
        JPanel panel = new JPanel();
        //3 Create components
        JLabel label = new JLabel("Hello World");
        JButton button = new JButton("Push Me!");
        JTextField textField = new JTextField(5);
        JMenuBar menu = new JMenuBar();
        JMenu option1 = new JMenu("Click Me!");
        JMenu option2 = new JMenu("No Me!");

        menu.add(option1);
        menu.add(option2);
        //add an image
        ImageIcon icon = new ImageIcon("Images/MyCards/2C.png");
        icon.setImage(icon.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
        JLabel picLabel = new JLabel(icon);
        //4 Add Components to the panel
        panel.add(button);
        panel.add(textField);
        panel.add(label);
        panel.add(picLabel);
        panel.add(menu);




        panel.setBackground(new Color(255, 0, 0));
        panel.setBackground(Color.BLUE);
        //5 Add the panel to the frame
        frame.add(panel);
        //6 Make the frame visible
        frame.setVisible(true);
        frame.setSize(500, 500);
    }
}