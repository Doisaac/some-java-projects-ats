// window with action listener

package events;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Window extends JFrame {
    
    private JPanel panel;
    private JLabel label;
    private JTextField field;
    private JButton button;
    private JLabel sayHi;
    
    /**
     * Initializes the window's properties and also the components
     */
    public Window() {
        // window's atributes
        setSize(500, 500);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Events");
        startComponents();
    }
    
    /**
     * Initializes all the components
     */
    private void startComponents() {
        startJPanel();
        startJLabel();
        startJTextField();
        startJButton();
        sayHi();
    }
    
    private void startJPanel () {
        panel = new JPanel();
        panel.setLayout(null);
        getContentPane().add(panel);
    }
    
    private void startJLabel(){
        label = new JLabel("Enter your name");
        label.setFont(new Font("haettenschweiler", 0, 30));
        label.setBounds(30, 30, 200, 30);
        panel.add(label);
    }
    
    private void startJTextField(){
        field = new JTextField();
        field.setBounds(30, 80, 300, 30);
        panel.add(field);
    }
    
    private void startJButton(){
        button = new JButton("¡Click Here!");
        button.setFont(new Font("Arial", Font.ITALIC, 20));
        button.setBounds(100, 120, 150, 30);
        panel.add(button);
    }
    
    private void sayHi(){
        sayHi = new JLabel();
        sayHi.setBounds(30, 160, 300, 40);
        sayHi.setFont(new Font("Agency FB", 0, 20));
        panel.add(sayHi);
        addActionListener();
    }
    
    private void addActionListener(){
        // creates a Action listener object and implements the abstract method
        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if ( field.getText().equals("Douglas")){
                    sayHi.setText("Hi Owner");
                } else{
                    sayHi.setText("Hi " + field.getText());
                }
            }
        };
        
        // creates a action when you click in thce button
        button.addActionListener(actionListener);
        
    }

}
