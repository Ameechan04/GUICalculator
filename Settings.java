import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Settings {
    private static JLabel outputLabel, memoryLabel;
    private static JFrame frame;
    private static JPanel panel;
    private static JButton returnButton;
    public Settings(){
        panel = new JPanel();
        frame = new JFrame();
        frame.setSize(325,400);
        panel.setBackground(new Color(110, 121, 122));

        returnButton = new JButton("Return");
        returnButton.setBounds(10,170,100,50);
        frame.add(returnButton);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.add(panel); //adds invisible panel to the frame
        panel.setLayout(null);

        outputLabel = new JLabel("Settings Page");
        outputLabel.setBounds(10,10,150,150);
        outputLabel.setFont(new Font("Arial", Font.PLAIN, 20));
        panel.add(outputLabel);

        returnButton.addActionListener(new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e) {
                Calculator calc = new Calculator();
                frame.setVisible(false);
            }
        });
    }
}
