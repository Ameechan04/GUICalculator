import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Calculator {

    //1 make frame
    //2 make a panel
    //
    static String value;
    private static JLabel outputLabel, memoryLabel;
    private static JFrame frame;
    private static JPanel panel;

    private static JButton num1, num2, num3, num4, num5, num6, num7, num8, num9, num0, addButton, subtractButton, equalsButton, clearButton, backspaceButton, multButton, divButton, modButton, settingsButton;

    static int operator, final_value, value1, value2;

    static boolean first_num;

    public Calculator() {
        first_num = true;
        value = "000000000";
        panel = new JPanel();
        frame = new JFrame();
        frame.setSize(325,400);
        panel.setBackground(new Color(110, 121, 122));

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.add(panel); //adds invisible panel to the frame
        panel.setLayout(null);

        outputLabel = new JLabel("00000000");
        outputLabel.setBounds(10,20,150,25);
        outputLabel.setFont(new Font("Arial", Font.PLAIN, 20));
        panel.add(outputLabel);

        memoryLabel = new JLabel("00000000");
        memoryLabel.setBounds(10,40,150,25);
        memoryLabel.setForeground(Color.BLUE);
        panel.add(memoryLabel);

        settingsButton = new JButton("Settings");
        settingsButton.setBounds(10, 300, 100,50);
        panel.add(settingsButton);

        addButton = new JButton(" + ");
        addButton.setBounds(175, 80, 50,50);
        panel.add(addButton);

        backspaceButton = new JButton("<-");
        backspaceButton.setBounds(230, 20, 50,50);
        panel.add(backspaceButton);

        subtractButton = new JButton(" - ");
        subtractButton.setBounds(175, 135, 50,50);
        panel.add(subtractButton);

        multButton = new JButton(" X ");
        multButton.setBounds(175, 190, 50,50);
        panel.add(multButton);

        divButton = new JButton(" / ");
        divButton.setBounds(175, 245, 50,50);
        panel.add(divButton);

        modButton = new JButton("%");
        modButton.setBounds(175, 300, 50,50);
        panel.add(modButton);

        clearButton = new JButton("clear");
        clearButton.setBounds(125, 20, 100,50);
        panel.add(clearButton);


        equalsButton = new JButton(" = ");
        equalsButton.setBounds(230, 245, 50,105);
        panel.add(equalsButton);

        for (Component component : panel.getComponents()) {
            if (component instanceof JButton) {
                component.setBackground(Color.BLACK);
                component.setForeground(Color.WHITE);
            }
        }


        addActionToNumbers();




        basicOperators();





    }



    public static void main(String[] args) {
        Calculator calc = new Calculator();
    }



    private static void addActionToNumbers(){
        num1 = new JButton(" 1 ");
        num1.setBounds(10, 190, 50,50);
        num1.setForeground(Color.yellow);
        panel.add(num1);

        num2 = new JButton(" 2 ");
        num2.setBounds(65, 190, 50,50);
        num2.setForeground(Color.yellow);
        panel.add(num2);

        num3 = new JButton(" 3 ");
        num3.setBounds(120, 190, 50,50);
        num3.setForeground(Color.yellow);
        panel.add(num3);

        num4 = new JButton(" 4 ");
        num4.setBounds(10, 135, 50,50);
        num4.setForeground(Color.yellow);
        panel.add(num4);

        num5 = new JButton(" 5 ");
        num5.setBounds(65, 135, 50,50);
        num5.setForeground(Color.yellow);
        panel.add(num5);

        num6 = new JButton(" 6 ");
        num6.setBounds(120, 135, 50,50);
        num6.setForeground(Color.yellow);
        panel.add(num6);

        num7 = new JButton(" 7 ");
        num7.setBounds(10, 80, 50,50);
        num7.setForeground(Color.yellow);
        panel.add(num7);

        num8 = new JButton(" 8 ");
        num8.setBounds(65, 80, 50,50);
        num8.setForeground(Color.yellow);
        panel.add(num8);

        num9 = new JButton(" 9 ");
        num9.setBounds(120, 80, 50,50);
        num9.setForeground(Color.yellow);
        panel.add(num9);

        num0 = new JButton(" 0 ");
        num0.setBounds(10, 245, 160,50);
        num0.setForeground(Color.yellow);
        num0.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                num0.setBackground(Color.YELLOW);
                num0.setForeground(Color.black);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                num0.setBackground(Color.BLACK);
                num0.setForeground(Color.YELLOW);
            }
        });
        panel.add(num0);

        for (Component component : panel.getComponents()) {
            if (component instanceof JButton) {
                component.setBackground(Color.BLACK); // Set your desired color here
            }
        }

        backspaceButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               value = value.substring(0, (value.length() - 1));
               checkValueLength();
                outputLabel.setText(value);

            }
        });
        num1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value = value + "1";
                checkValueLength();
                outputLabel.setText(value);
            }
        });

        num2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value = value + "2";
                checkValueLength();
                outputLabel.setText(value);
            }
        });

        num3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value = value + "3";
                checkValueLength();
                outputLabel.setText(value);
            }
        });

        num4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value = value + "4";
                checkValueLength();
                outputLabel.setText(value);
            }
        });

        num5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value = value + "5";
                checkValueLength();
                outputLabel.setText(value);
            }
        });

        num6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value = value + "6";
                checkValueLength();
                outputLabel.setText(value);
            }
        });

        num7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value = value + "7";
                checkValueLength();
                outputLabel.setText(value);
            }
        });

        num8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value = value + "8";
                checkValueLength();
                outputLabel.setText(value);
            }
        });

        num9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value = value + "9";
                checkValueLength();
                outputLabel.setText(value);
            }
        });

        num0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value = value + "0";
                checkValueLength();
                outputLabel.setText(value);
            }
        });


    }

    private static void basicOperators() {
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value = "00000000";
                value1 = 0;
                value2 = 0;

                outputLabel.setText(value);
                memoryLabel.setText(value);
            }
        });

        settingsButton.addActionListener(new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                Settings settingPage = new Settings();
            }
        });

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                first_num_check();
                operator = 0;
                value = "00000000";
                outputLabel.setText(value);
            }
        });
        subtractButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                first_num_check();
                operator = 1;
                value = "00000000";
                outputLabel.setText(value);
            }
        });
        multButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                first_num_check();
                operator = 2;
                value = "00000000";
                outputLabel.setText(value);
            }
        });
        divButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                first_num_check();
                operator = 3;
                value = "00000000";
                outputLabel.setText(value);
            }
        });
        modButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                first_num_check();
                operator = 4;
                value = "00000000";
                outputLabel.setText(value);
            }
        });
        equalsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            first_num_check();

            switch (operator) {
                case 0:
                    final_value = value1 + value2;
                    value = final_value + "";
                    value1 = final_value;
                    value2 = 0;
                    checkValueLength();
                    outputLabel.setText(value);
                    break;
                case 1:
                    final_value = value1 - value2;
                    value = final_value + "";
                    value1 = final_value;
                    value2 = 0;
                    checkValueLength();
                    outputLabel.setText(value);
                    break;
                case 2:
                    final_value = value1 * value2;
                    value = final_value + "";
                    value1 = final_value;
                    value2 = 0;
                    checkValueLength();
                    outputLabel.setText(value);
                    break;
                case 3:
                    if (value1 == 0 || value2 == 0) {
                        outputLabel.setText("Div by 0 err");
                        value = "00000000";
                        memoryLabel.setText("Err");
                    } else {
                        final_value = value1 / value2;
                        value = final_value + "";
                        value1 = final_value;
                        value2 = 0;
                        checkValueLength();
                        outputLabel.setText(value);
                    }
                    break;
                case 4:
                    if (value1 == 0 || value2 == 0) {
                        outputLabel.setText("Mod by 0 err");
                        value = "00000000";
                        memoryLabel.setText("Err");
                    } else {
                        final_value = value1 % value2;
                        value = final_value + "";
                        value1 = final_value;
                        value2 = 0;
                        checkValueLength();
                        outputLabel.setText(value);
                    }
                    break;
                default:


            }

            }
        });
    }

    public static void first_num_check(){

        memoryLabel.setText(value);
        if (first_num) {
            value1 = Integer.parseInt(value);
            System.out.println("now on second number. First number value is " + value1);
            first_num = false;
        } else {
            value2 = Integer.parseInt(value);
            System.out.println("now on first number again. Second number value is " + value2);
            first_num = true;
        }
    }



    public static void checkValueLength() {
        if (value.length() > 7) {
            value = value.substring(1);

        }

        if (value.length() < 8) {
            if (value.charAt(0) == '-') {
                value = value.substring(1);
                int places = 8 - value.length();
                for (int i = 0; i < places; i++) {
                    value = "0" + value;
                }
                value = "-" + value;

            } else {
                int places = 8 - value.length();
                for (int i = 0; i < places; i++) {
                    value = "0" + value;
                }
            }
        }


    }



}
