// window with mouse wheel listener

package events;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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

public class Window5 extends JFrame {
    
    private JPanel panel;
    private JTextArea textArea;
    private JButton button;
    private JLabel textToAppears;
    
    /**
     * Initializes the window's properties and also the components
     */
    public Window5() {
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
        mouseWheelListener();
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
        button = new JButton("¡CLICK!");
        button.setFont(new Font("Arial", Font.ITALIC, 20));
        button.setBounds(40, 220, 150, 30);
        panel.add(button);
    }
    
    
    private void mouseWheelListener(){
        
        MouseWheelListener mouseListener = new MouseWheelListener() {
            @Override
            public void mouseWheelMoved(MouseWheelEvent e) {
                if(e.getPreciseWheelRotation() < 0){
                    textArea.append("Mouse wheel rotated up\n");
                }
                else{
                    textArea.append("Mouse wheel rotated down\n");
                }
            }
        };
        
        panel.addMouseWheelListener(mouseListener);
    }    
       
    
}

