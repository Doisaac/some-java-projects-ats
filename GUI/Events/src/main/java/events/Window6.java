// window with mouse wheel listener

package events;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Window6 extends JFrame {
    
    private JPanel panel;
    private JTextArea textArea;
    JTextField field;
    /**
     * Initializes the window's properties and also the components
     */
    public Window6() {
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
        startJTextField();
        startTextArea();
    }
    
    private void startJPanel () {
        panel = new JPanel();
        panel.setLayout(null);
        getContentPane().add(panel);
    }
    
    
    private void startJTextField(){
        field = new JTextField();
        field.setBounds(10, 10, 150, 30);
        panel.add(field);
        addKeyEvent();
    }
    
    
    private void startTextArea(){
        textArea = new JTextArea();
        textArea.setBounds(50, 10, 200, 200);
        panel.add(textArea);
        
        JScrollPane scrollPane = new JScrollPane(textArea, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setBounds(200, 10, 250, 400);
        panel.add(scrollPane);
        
    }
    
    private void addKeyEvent(){
        KeyListener keyListener = new KeyListener() {
            @Override
            // only accepts or works unicodes characters "a-z", numbers or simbols
            public void keyTyped(KeyEvent e) {
                //textArea.append("Key Typed\n");
            }

            @Override
            public void keyPressed(KeyEvent e) {
                //textArea.append("Key pressed\n");
            }

            @Override
            // you have to press a key and stop pressing it, in order to make it works
            public void keyReleased(KeyEvent e) {
                if ( e.getKeyChar() == 'D'){
                    textArea.append("Key released and it was the D\n");
                }
                else if ( e.getKeyChar() == '\n'){
                    textArea.append("Key released and it was enter\n");
                }
            }
        };
        
        field.addKeyListener(keyListener);
    }
    
   
    
    
      
       
    
}

