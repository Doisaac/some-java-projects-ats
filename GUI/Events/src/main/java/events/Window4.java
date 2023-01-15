// window with mouse motion listener

package events;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Window4 extends JFrame {
    
    private JPanel panel;
    private JTextArea textArea;
    private JButton button;
    private JLabel textToAppears;
    
    /**
     * Initializes the window's properties and also the components
     */
    public Window4() {
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
        mouseMotionListener();
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
        button = new JButton("¡DELETE!");
        button.setFont(new Font("Arial", Font.ITALIC, 20));
        button.setBounds(40, 220, 150, 30);
        panel.add(button);
    }
    
    private void mouseMotionListener(){
        
        MouseMotionListener mouseMotionListener = new MouseMotionListener() {
            @Override
            // works when you click and stay clicking inside the panel
            public void mouseDragged(MouseEvent e) {
                textArea.append("Mouse dragged\n");
            }

            @Override
            // works if the mouse is inside the panel
            public void mouseMoved(MouseEvent e) {
                textArea.append("Mouse moved\n");
            }
        };
        
        panel.addMouseMotionListener(mouseMotionListener);
        
        ActionListener action = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setText("");
            }
        };
        
        
        
        button.addActionListener(action);
    }
        
       

}

