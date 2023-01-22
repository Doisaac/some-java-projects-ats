package additonwith3labels;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Window extends JFrame {
    private JPanel panel;
    private JLabel numberOne, numberTwo, result;
    private JTextField field1, field2, field3;
    private JButton button;
    private Font font = new Font("Comic Sans MS", 3, 20);
    
    
    public Window(){
        setSize(600, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Sum of 2 numbers");
        setResizable(false);
        startComponents();
    }
    
    public void startComponents(){
        startPanel();
        startLabels();
        startFields();
        startButton();
    }
    
    public void startPanel(){
        panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(new Color(215, 219, 221));
        this.add(panel);
    }
    
    public void startLabels(){
        
        //// LABEL 1 //////////////////////
        numberOne = new JLabel("Enter Number 1: ");
        numberOne.setFont(font);
        numberOne.setHorizontalAlignment(SwingConstants.CENTER);
        numberOne.setBounds(40, 50, 200, 60);
        numberOne.setOpaque(false);
        panel.add(numberOne);
        
        //// LABEL 2 //////////////////////
        numberTwo = new JLabel("Enter Number 2: ");
        numberTwo.setFont(font);
        numberTwo.setHorizontalAlignment(SwingConstants.CENTER);
        numberTwo.setBounds(40, 150, 200, 60);
        numberTwo.setOpaque(false);
        panel.add(numberTwo);
    }
    
    public void startFields(){
        //// FIELD 1 //////////////////////
        field1 = new JTextField();
        field1.setBounds(250, 55, 300, 50);
        panel.add(field1);
        
        //// FIELD 2 //////////////////////
        field2 = new JTextField();
        field2.setBounds(250, 155, 300, 50);
        panel.add(field2);
        
        //// FIELD 3 //////////////////////
        field3 = new JTextField();
        field3.setBounds(250, 250, 300, 50);
        panel.add(field3);
    }
    
    public void startButton(){
        button = new JButton("Calculate");
        button.setFont(new Font("Comic Sans MS", 3, 15));
        button.setForeground(Color.WHITE);
        button.setBounds(65, 250, 100, 50);
        button.setBackground(new Color(24, 106, 59));
        panel.add(button);
        startAction();
    }
    
    public void startAction(){
        button.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if ((field1.getText().matches("[0-9]*")) && (field2.getText().matches("[0-9]*"))){
                    long result = ((Integer.parseInt(field1.getText())) + (Integer.parseInt(field2.getText())));
                    field3.setText(Long.toString(result));
                } 
                else{
                    JOptionPane.showMessageDialog(null, "Please enter just numbers");
                }
            }
        });
    }
}
