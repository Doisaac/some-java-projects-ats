package rgb.window;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;


public class Window extends JFrame{

    private JPanel panel;
    private JLabel LTitle;
    private JButton redButton, greenButton, blueButton;
    // determines which button has been clicked
    private int clicked = 0;
    // colors' counter
    private int redCounter = 0, greenCounter = 0, blueCounter = 0;
    
    public Window() {
        setTitle("RGB");
        setSize(600, 400);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        startComponents();
    }
    
    /**
     * Starts all the window's components
     */
    public void startComponents(){
        startPanel();
        startLabels();
        startButtons();
    }
    
    public void startPanel(){
        panel = new JPanel();
        panel.setLayout(null);
        this.add(panel);
        JOptionPane.showMessageDialog(null, "SELECT A COLOR AND MOVE YOUR MOUSE WHEEL AN CREATE YOUR FAV COLOR :)");
        panelEvent();
    }
    
    public void startLabels(){
        LTitle = new JLabel();
        LTitle.setText("Color (Red, Green, Blue)");
        LTitle.setFont(new Font("Comic Sans MS", 0, 20));
        LTitle.setHorizontalAlignment(SwingConstants.CENTER);
        LTitle.setBounds(100, 30, 400, 50);
        panel.add(LTitle);
    }
    
    /**
     * Clicked variable = 0 -> none button was clicked
     * Clicked variable = 1 -> red button was clicked
     * Clicked variable = 2 -> green button was clicked
     * Clicked variable = 3 -> blue  button was clicked
     */
    public void startButtons(){
        //// RED /////////////////////////
        redButton = new JButton("Red");
        redButton.setFont(new Font("Comic Sans MS", 0, 20));
        redButton.setBounds(50, 230, 130, 50);
        redButton.setForeground(Color.RED);
        redButton.setOpaque(true);
        redButton.setBackground(Color.WHITE);
        panel.add(redButton);
        
        //// GREEN /////////////////////////
        greenButton = new JButton("Green");
        greenButton.setFont(new Font("Comic Sans MS", 0, 20));
        greenButton.setBounds(230, 230, 130, 50);
        greenButton.setForeground(Color.GREEN);
        greenButton.setOpaque(true);
        greenButton.setBackground(Color.WHITE);
        panel.add(greenButton);
        
        //// BLUE /////////////////////////
        blueButton = new JButton("Blue");
        blueButton.setFont(new Font("Comic Sans MS", 0, 20));
        blueButton.setBounds(410, 230, 130, 50);
        blueButton.setForeground(Color.BLUE);
        blueButton.setOpaque(true);
        blueButton.setBackground(Color.WHITE);
        panel.add(blueButton);
        
        startButtonsAction();
    }
    
    public void startButtonsAction(){
        // action for red button
        redButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                clicked = 1;
            }
            
        });
        // action for green button
        greenButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                clicked = 2;
            }
            
        });
        // action for blue button
        blueButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                clicked = 3;
            }
            
        });
    }
    
    
    public void panelEvent(){
        panel.addMouseWheelListener(new MouseWheelListener(){
            @Override
            public void mouseWheelMoved(MouseWheelEvent e) {
                if (clicked != 0){ // if any button has been clicked 
                    if (clicked == 1){ // red button was clicked
                        redCounter += e.getWheelRotation();
                        if (redCounter < 0){
                            redCounter = 0;
                        }
                        if(redCounter > 255){
                            redCounter = 255;
                        }
                    }
                    
                    else if(clicked == 2){ // green button was clicked
                        greenCounter += e.getWheelRotation();
                        if (greenCounter < 0){
                            greenCounter = 0;
                        }
                        if(greenCounter > 255){
                            greenCounter = 255;
                        }
                    }
                    
                    else{ // blue button was clicked
                        blueCounter += e.getWheelRotation();
                        if (blueCounter < 0){
                            blueCounter = 0;
                        }
                        if(blueCounter > 255){
                            blueCounter = 255;
                        }
                    }
                    LTitle.setText("Color (Red = " + redCounter + ", Green = "+ greenCounter+", Blue = " + blueCounter+ ")");
                    panel.setBackground(new Color(redCounter, greenCounter, blueCounter));
                }
                
            }
        });
    }
}
    