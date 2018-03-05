import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class calculator extends JFrame {

    private JTextField input;
    private JButton btn3;
    private JButton button;
    private JButton button_1;
    private JButton button_2;
    private JButton button_3;
    private JButton button_4;
    private JButton button_5;
    private JButton button_6;
    private JButton button_7;
    private JButton button_8;
    private JButton button_9;
    private JButton button_10;
    private JButton button_11;
    private JButton button_12;
    private JButton button_13;
    private JButton button_14;
    private JButton button_16;
    private JButton btnX;
    private JButton btnCe;
    private Label label;
    private String mode = "INFIX";

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    calculator frame = new calculator();
                    frame.setVisible(true);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    private double num;
    private int calculation;

    private void arithmetic_operation() {
        switch (calculation) {
            case 1: // Addition
                double ans = num + Double.parseDouble(input.getText());
                input.setText(Double.toString(ans));
                break;

            case 2: // Subtraction
                ans = num - Double.parseDouble(input.getText());
                input.setText(Double.toString(ans));
                break;

            case 3: // Multipication
                ans = num * Double.parseDouble(input.getText());
                input.setText(Double.toString(ans));
                break;

            case 4: // Division
                ans = num / Double.parseDouble(input.getText());
                input.setText(Double.toString(ans));
                break;
        }
    }

    private calculator() {
        setLocation(550, 300);
        setMaximizedBounds(new Rectangle(0, 0, 0, 0));

        setResizable(true);
        setTitle("Simple Calculator");
        setFont(new Font("Tahoma", Font.BOLD, 15));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(550, 250, 215, 400);
        JPanel contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        input = new JTextField();
        input.setFont(new Font("Tahoma", Font.BOLD, 15));
        input.setHorizontalAlignment(SwingConstants.RIGHT);
        input.setBounds(10, 25, 185, 54);
        input.setColumns(10);
        contentPane.add(input);

        button = new JButton("1");
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                input.setText(input.getText() + "1");
            }
        });
        button.setBounds(6, 175, 43, 32);
        contentPane.add(button);

        button_1 = new JButton("2");
        button_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                input.setText(input.getText() + "2");
            }
        });
        button_1.setBounds(57, 175, 43, 32);
        contentPane.add(button_1);

        btn3 = new JButton("3");
        btn3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                input.setText(input.getText() + "3");
            }
        });
        btn3.setBounds(105, 175, 43, 32);
        contentPane.add(btn3);

        button_2 = new JButton("4");
        button_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                input.setText(input.getText() + "4");
            }
        });
        button_2.setBounds(6, 214, 43, 32);
        contentPane.add(button_2);

        button_3 = new JButton("5");
        button_3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                input.setText(input.getText() + "5");
            }
        });
        button_3.setBounds(57, 214, 43, 32);
        contentPane.add(button_3);

        button_4 = new JButton("6");
        button_4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                input.setText(input.getText() + "6");
            }
        });
        button_4.setBounds(105, 214, 43, 32);
        contentPane.add(button_4);

        button_5 = new JButton("7");
        button_5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                input.setText(input.getText() + "7");
            }
        });
        button_5.setBounds(6, 253, 43, 32);
        contentPane.add(button_5);

        button_6 = new JButton("8");
        button_6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                input.setText(input.getText() + "8");
            }
        });
        button_6.setBounds(57, 253, 43, 32);
        contentPane.add(button_6);

        button_7 = new JButton("9");
        button_7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                input.setText(input.getText() + "9");
            }
        });
        button_7.setBounds(105, 253, 43, 32);
        contentPane.add(button_7);

        button_8 = new JButton("=");
        button_8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                arithmetic_operation();
                label.setText("");
            }
        });
        button_8.setBounds(105, 291, 90, 32);
        contentPane.add(button_8);

        button_9 = new JButton("0");
        button_9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                input.setText(input.getText() + "0");
            }
        });
        button_9.setBounds(57, 291, 43, 32);
        contentPane.add(button_9);

        button_10 = new JButton(".");
        button_10.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                input.setText(input.getText() + ".");
            }
        });
        button_10.setBounds(6, 291, 43, 32);
        contentPane.add(button_10);

        button_11 = new JButton("+");
        button_11.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (mode.equals("INFIX")) {
                    num = Double.parseDouble(input.getText());
                    calculation = 1;
                    input.setText("");
                    label.setText(num + "+");
                }
                else {
                    num = num + Double.parseDouble(input.getText());
                    label.setText(Double.toString(num));
                    input.setText("");
                }
            }
        });
        button_11.setBounds(152, 139, 43, 32);
        contentPane.add(button_11);

        button_12 = new JButton("-");
        button_12.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (mode.equals("INFIX")) {
                    num = Double.parseDouble(input.getText());
                    calculation = 2;
                    input.setText("");
                    label.setText(num + "-");
                }
                else {
                    num = num - Double.parseDouble(input.getText());
                    label.setText(Double.toString(num));
                    input.setText("");
                }
            }
        });
        button_12.setBounds(152, 175, 43, 32);
        contentPane.add(button_12);

        btnX = new JButton("x");
        btnX.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (mode.equals("INFIX")) {
                    num = Double.parseDouble(input.getText());
                    calculation = 3;
                    input.setText("");
                    label.setText(num + "x");
                }
                else {
                    num = num * Double.parseDouble(input.getText());
                    label.setText(Double.toString(num));
                    input.setText("");
                }
            }
        });
        btnX.setBounds(152, 214, 43, 32);
        contentPane.add(btnX);

        button_14 = new JButton("/");
        button_14.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (mode.equals("INFIX")) {
                    num = Double.parseDouble(input.getText());
                    calculation = 4;
                    input.setText("");
                    label.setText(num + "/");
                }
                else {
                    num = num / Double.parseDouble(input.getText());
                    label.setText(Double.toString(num));
                    input.setText("");
                }
            }
        });
        button_14.setBounds(152, 253, 43, 32);
        contentPane.add(button_14);

        button_13 = new JButton("ENTER");
        button_13.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                    num = Double.parseDouble(input.getText());
                    input.setText("");
                    label.setText(num + " ");
                }
        });

        button_13.setFont(new Font("Tahoma", Font.PLAIN, 12));
        button_13.setBounds(104, 101, 91, 32);
        contentPane.add(button_13);

        btnCe = new JButton("C");
        btnCe.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                input.setText("");
                label.setText("");
                num = 0;
            }
        });
        btnCe.setBounds(6, 101, 94, 32);
        contentPane.add(btnCe);

        label = new Label("");
        label.setForeground(Color.RED);
        label.setFont(new Font("Dialog", Font.BOLD, 12));
        label.setAlignment(Label.RIGHT);
        label.setBounds(142, 0, 51, 22);
        contentPane.add(label);

        JLabel lblMode = new JLabel(mode);
        lblMode.setBounds(10, 10, 50, 10);
        contentPane.add(lblMode);

        button_16 = new JButton("MODE");
        button_16.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                if (mode.equals("INFIX")) {
                    mode = "RPN";
                    lblMode.setText(mode);
                }
                else if (mode.equals("RPN")) {
                    mode = "INFIX";
                    lblMode.setText(mode);
                }
            }
        });
        button_16.setBounds(6, 139, 142, 32);
        contentPane.add(button_16);

        JLabel lblBD = new JLabel("Brandon DiCicco - 250862633");
        lblBD.setFont(new Font("Times New Roman", Font.PLAIN,  11));
        lblBD.setBounds(35, 337, 154, 25);
        contentPane.add(lblBD);


    }

    {
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
        $$$setupUI$$$();
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        final JPanel panel1 = new JPanel();
        panel1.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(1, 1, new Insets(0, 0, 0, 0), -1, -1));
    }
}