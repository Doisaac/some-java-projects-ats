package clickcounter;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Window extends JFrame{
    JPanel panel;
    JLabel titleLabel;
    JLabel label1; // you killed text
    JLabel label2; // demogorgons
    JLabel numbers; // the number of kills
    JButton demoButton;
    int clicks = 0; // the times the button was clicked
    
    public Window() {
        setTitle("Click Counter");
        setSize(1000, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        startComponents();
    }
    /**
     * Starts all the components at the window 
     */
    public void startComponents(){
        startPanel();
        startTitleLabel();
        startLabels();
        startDemogorgonButton();
        startBackground();
    }
    
    public void startPanel(){
        panel = new JPanel();
        panel.setLayout(null);
        getContentPane().add(panel);
    }
    
    
    public void startTitleLabel(){
        titleLabel = new JLabel("Click the Demogorgon");
        titleLabel.setBounds(0,10,1000, 80);
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        titleLabel.setFont(new Font("Segoe UI Black", 3, 40));
        titleLabel.setForeground(Color.WHITE);
        panel.add(titleLabel);
    }
    
    public void startDemogorgonButton(){
        demoButton = new JButton();
        demoButton.setBounds(600, 380, 150, 150);
        ImageIcon demogorgon = new ImageIcon(getClass().getResource("/img/Demogorgon.png"));
        demoButton.setIcon(new ImageIcon(demogorgon.getImage().getScaledInstance(demoButton.getWidth(), demoButton.getHeight(), Image.SCALE_SMOOTH)));
        demoButton.setContentAreaFilled(false);
        demoButton.setBorderPainted(false);
        buttonActionListener();
        panel.add(demoButton);
    }   
    
    public void startLabels(){
        //// YOU KILLED /////////////////////////////////
        Font labelsFont = new Font("Bradley Hand ITC", 2, 40); 
        label1 = new JLabel("You Killed");
        label1.setBounds(110, 150,500, 80);
        label1.setFont(labelsFont);
        label1.setForeground(Color.red);
        panel.add(label1);
        
        //// NUMBER /////////////////////////////////
        numbers = new JLabel(Integer.toString(clicks));
        numbers.setBounds(180, 250, 100, 80);
        numbers.setFont(labelsFont);
        numbers.setForeground(Color.red);
        panel.add(numbers);
        
        //// DEMOGORGON /////////////////////////////////
        label2 = new JLabel("DEMOGORGONS");
        label2.setBounds(50, 350,500, 80);
        label2.setFont(labelsFont);
        label2.setForeground(Color.red);
        panel.add(label2);
    }
    
    public void buttonActionListener (){
        
        ActionListener demoAction = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ++clicks;
                numbers.setText(Integer.toString(clicks));
            }
        };
        
        demoButton.addActionListener(demoAction);
    }
    
    
    public void startBackground(){
        JLabel label = new JLabel();
        label.setBounds(1, 1, 1000, 600);
        ImageIcon background = new ImageIcon(getClass().getResource("/img/Walpaper.jpg"));
        label.setIcon(new ImageIcon(background.getImage().getScaledInstance(1000, 600, Image.SCALE_SMOOTH)));
        panel.add(label);
    }
}
