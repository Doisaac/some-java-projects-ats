// window with mouse listerner

package events;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Window2 extends JFrame {
    
    private JPanel panel;
    private JTextArea textArea;
    private JButton button;
    private JLabel textToAppears;
    
    /**
     * Initializes the window's properties and also the components
     */
    public Window2() {
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
        startJButton();
        startTextArea();
        mouseListener();
    }
    
    private void startJPanel () {
        panel = new JPanel();
        panel.setLayout(null);
        getContentPane().add(panel);
    }
    
    private void startTextArea(){
        textArea = new JTextArea();
        textArea.setBounds(10, 10, 200, 200);
        panel.add(textArea);
        
        JScrollPane scrollPane = new JScrollPane(textArea, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setBounds(10, 10, 200, 200);
        panel.add(scrollPane);
        
    }
    
    private void startJButton(){
        button = new JButton("¡Click Here!");
        button.setFont(new Font("Arial", Font.ITALIC, 20));
        button.setBounds(40, 220, 150, 30);
        panel.add(button);
    }
    
    private void mouseListener(){
        
        // creates and implements all the abstract methods
        MouseListener mouseListener = new MouseListener() {
            @Override
            // click and stop the click inside the button
            public void mouseClicked(MouseEvent e) {
                textArea.append("Mouse has been clicked\n");
            }

            @Override
            // stay pressing the button 
            public void mousePressed(MouseEvent e) {
                textArea.append("Mouse has been pressed\n");
            }

            @Override
            // doesn't matter if you stop clicking inside or out the button
            public void mouseReleased(MouseEvent e) {
                textArea.append("Mouse has been released\n");
            }

            @Override
            // works just with pass the mouse on
            public void mouseEntered(MouseEvent e) {
                textArea.append("Mouse has been entered\n");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                textArea.append("Mouse has been exited\n");
            }
        };
        
        button.addMouseListener(mouseListener);
        
    }

}

