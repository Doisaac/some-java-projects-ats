package favoriteSport;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;

public class Window extends JFrame{
    private Font buttonFont = new Font("Comic Sans MS", Font.PLAIN, 20);
    private Font titleFont = new Font("Cooper Black", Font.BOLD, 30);
    private JPanel panel;
    private JLabel titleLabel; 
    private JRadioButton sportButton1, sportButton2, sportButton3, sportButton4;     
    private JLabel sportImg;
            
    public Window() {
        setTitle("Favorite Sport");
        setSize(1000, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        startComponents();
    }
    
    private void startComponents(){
        startPanel();
        startLabels();
        startButtons();
    }
    
    private void startPanel(){
        panel = new JPanel();
        panel.setLayout(null);
        this.add(panel);
    }
    
    private void startLabels(){
        ///// TITLE /////////////////////////////////
        titleLabel = new JLabel("CHOOSE YOUR FAVORITE SPORT");
        titleLabel.setFont(titleFont);
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        titleLabel.setBounds(0, 10, 1000, 50);
        panel.add(titleLabel);
    }
    
    private void startButtons(){
        sportButton1 = new JRadioButton("Football");
        sportButton1.setFont(buttonFont);
        sportButton1.setBounds(50, 100, 100, 50);
        sportButton1.setHorizontalAlignment(SwingConstants.LEFT);
        panel.add(sportButton1);
        
        sportButton2 = new JRadioButton("Basketball");
        sportButton2.setFont(buttonFont);
        sportButton2.setBounds(50, 200, 200, 50);
        sportButton2.setHorizontalAlignment(SwingConstants.LEFT);
        panel.add(sportButton2);
        
        sportButton3 = new JRadioButton("Karate");
        sportButton3.setFont(buttonFont);
        sportButton3.setBounds(50, 300, 100, 50);
        sportButton3.setHorizontalAlignment(SwingConstants.LEFT);
        panel.add(sportButton3);
        
        sportButton4 = new JRadioButton("Chess");
        sportButton4.setFont(buttonFont);
        sportButton4.setBounds(50, 400, 100, 50);
        sportButton4.setHorizontalAlignment(SwingConstants.LEFT);
        panel.add(sportButton4);
        
        ButtonGroup sportButtonGroup = new ButtonGroup();
        sportButtonGroup.add(sportButton1);
        sportButtonGroup.add(sportButton2);
        sportButtonGroup.add(sportButton3);
        sportButtonGroup.add(sportButton4);
        actionListeners();
    }
    
   
    
    public void actionListeners(){
        // creates an empty label for the images
        sportImg = new JLabel();
        sportImg.setBounds(400, 100, 480, 400);
        sportImg.setOpaque(true);
        panel.add(sportImg);
        
        // creates the images' icons
        final ImageIcon football = new ImageIcon(getClass().getResource("/img/football.png"));
        final ImageIcon basketball = new ImageIcon(getClass().getResource("/img/basketball.png"));
        final ImageIcon karate = new ImageIcon(getClass().getResource("/img/karate.png"));
        final ImageIcon chess = new ImageIcon(getClass().getResource("/img/chess.png"));
        
        ActionListener action1 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sportImg.setIcon(new ImageIcon(football.getImage().getScaledInstance(
                        sportImg.getWidth(), sportImg.getHeight(), Image.SCALE_SMOOTH)));
            }
        };
        
        sportButton1.addActionListener(action1);
        
        ActionListener action2 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sportImg.setIcon(new ImageIcon(basketball.getImage().getScaledInstance(
                        sportImg.getWidth(), sportImg.getHeight(), Image.SCALE_SMOOTH)));
            }
        };
        
        sportButton2.addActionListener(action2);
        
        ActionListener action3 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sportImg.setIcon(new ImageIcon(karate.getImage().getScaledInstance(
                        sportImg.getWidth(), sportImg.getHeight(), Image.SCALE_SMOOTH)));
            }
        };
        
        sportButton3.addActionListener(action3);
        
        ActionListener action4 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sportImg.setIcon(new ImageIcon(chess.getImage().getScaledInstance(
                        sportImg.getWidth(), sportImg.getHeight(), Image.SCALE_SMOOTH)));
            }
        };
        
        sportButton4.addActionListener(action4);
        
    }
    
}
