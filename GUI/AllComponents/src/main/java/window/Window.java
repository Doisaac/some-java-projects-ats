package window;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.util.Arrays;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

public class Window extends JFrame{
    
    // Atributes
    JPanel panel;
    
    // Constructor
    public Window(){
        // set the size of the window
        this.setSize(1000, 500);
        
        // defines what will happen when we close the window
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        // set a title
        this.setTitle("The best title");
        
        // set the initial position of the window
        //this.setLocation(100,200);
        
        //set both size and location
        //this.setBounds(650, 200, 500, 500);
        
        // locates the window location in the center
        this.setLocationRelativeTo(null);
        
        //avoids to change the size of the window, also you won't be able to maximize
        this.setResizable(true);
        
        // the minimun size to resize(minimize) the window 
        this.setMinimumSize(new Dimension(200, 200));
        
        // get the content of the window and change the background color of the window
        //this.getContentPane().setBackground(Color.BLACK);
        
        // calls the components method
        startComponents();
    }
    
   
    private void startComponents(){
        setPanels();
        
        setLabelsToThePanel();
        
        //setButtons();
        
        //setRadioButtons();
        
        //setJToggleButtons();
        
        //setJTextField();
        
        //setTextArea();
        
        //setCheckBox();
        
        //setComboBox();
        
        //setPasswordField();
        
        //setTable();
        
        //setList();
    }
    
    private void setPanels(){
        // creates a panel
        panel = new JPanel();
        
        // set the color of  the panel
        //panel.setBackground(Color.red);
        
        // Deactivates the layout that is by default
        panel.setLayout(null);
        
        // gets the content of the window and add the panel above
        this.getContentPane().add(panel);
    }
    
    private void setLabelsToThePanel(){
        
        /*
        CREATING A LABEL WITH TEXT  
        */
        
        // creates new label
        JLabel label = new JLabel();
        
        // creates new label, and setting the position using SwingConstants
        //JLabel label = new JLabel("Hello I'm Douglas", SwingConstants.CENTER);
        
        //set text to the label, by default is in the center
        label.setText("Mundial 2022");
        
        // set the horizontal position of the text inside the label
        label.setHorizontalAlignment(SwingConstants.CENTER);
        
        // set the vertical position of the text
        //label.setVerticalAlignment(SwingConstants.TOP);
        
        //set a new position for the label
        label.setBounds(350, 10, 300, 50);
        
        // changes the color of the label's text
        label.setForeground(Color.BLACK);
        
        // deactivates the default layout of the label's background
        label.setOpaque(true);
        
        // set a new label background color
        //label.setBackground(Color.GRAY);
        
        // modifies the font 
        label.setFont(new Font("cooper black", Font.PLAIN, 40));
        
        // add to the panel the label just created
        panel.add(label);
        
        /*
        CREATING A LABEL WITH AN IMAGE
        */
        
        //new label with an image
        //JLabel labelWithImage = new JLabel(new ImageIcon("mundial.jpg"));
        
        // new Label that will contain an image
        JLabel labelWithImage = new JLabel();
        
        // creates a new ImageIcon
        ImageIcon image = new ImageIcon("mundial.jpg");
        
        // set the position and the width and height
        labelWithImage.setBounds(250, 80, 500, 314);
        
        // changes the image properties
        labelWithImage.setIcon(new ImageIcon(image.getImage().getScaledInstance(labelWithImage.getWidth(), labelWithImage.getHeight(), Image.SCALE_SMOOTH)));
        
        // add the label to the panel
        panel.add(labelWithImage);
    }
    
    private void setButtons(){
        /**
         * BUTTON 1
         * text in a button
        */
        // creates a object JButton
        JButton button1 = new JButton();
        
        // add text
        button1.setText("CLICK");
        
        // set enable or unenable by default it's true 
        button1.setEnabled(true);
        
        // set position and size
        button1.setBounds(100, 100, 150, 50);
        
        // set a keyboard combination to click on the button ( alt + letter)
        button1.setMnemonic('a');
        
        // changes text color
        button1.setForeground(Color.BLUE);
        
        // create the variable for all kind of buttons
        Font buttonFont = new Font("cooper black", 3, 20);
        
        // set the button font
        button1.setFont(buttonFont);
        
        // add the button to the panel
        panel.add(button1);
        
        /**
         * BUTTON 2
         * setting a picture in a button
        */
        
        JButton button2 = new JButton();
        button2.setBounds(100,200, 150, 50);
        button2.setBackground(Color.WHITE);
        
        // creates an ImageIcon
        ImageIcon buttonPicture = new ImageIcon("button.jpg");
        
        // add the image with the same size of the button
        button2.setIcon(new ImageIcon(buttonPicture.getImage().getScaledInstance(button2.getWidth(), button2.getHeight(), Image.SCALE_SMOOTH)));
        panel.add(button2);
    
        /**
         * BUTTON 3
         * border of the buttonS
        */
        JButton button3 = new JButton();
        button3.setBounds(100, 300, 150, 50);
        
        // border
        button3.setBorder(BorderFactory.createLineBorder(Color.GREEN, 4, true));
        
        panel.add(button3);
        
    }
    
    /**
     * RADIO BUTTONS
    */
    private void setRadioButtons(){
        // cretes a instance of JRadioButton
        JRadioButton radioButton1 = new JRadioButton("Option 1", true);
        radioButton1.setBounds(50, 100, 100, 50);
        
        JRadioButton radioButton2 = new JRadioButton("Option 2", false);
        radioButton2.setBounds(50, 150, 100, 50);
        
        JRadioButton radioButton3 = new JRadioButton("Option 3", false);
        radioButton3.setBounds(50, 200, 100, 50);
        
        panel.add(radioButton1);
        panel.add(radioButton2);
        panel.add(radioButton3);
        
        /**
         * ButtonGroup
        */
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(radioButton1);
        buttonGroup.add(radioButton2);
        buttonGroup.add(radioButton3);
        
    }
    
    /**
     * JToggleButton -- Botones de activación
    */
    private void setJToggleButtons() {
        JToggleButton toggleButton1 = new JToggleButton("Option 1", true);
        toggleButton1.setBounds(10, 50, 100, 20);
        panel.add(toggleButton1);
        
        JToggleButton toggleButton2 = new JToggleButton("Option 2", false);
        toggleButton2.setBounds(10, 80, 100, 20);
        panel.add(toggleButton2);
        
        JToggleButton toggleButton3 = new JToggleButton("Option 3", false);
        toggleButton3.setBounds(10, 110, 100, 20);
        panel.add(toggleButton3);
        
        /**
         * BUTTON GROUP
         */
        
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(toggleButton1);
        buttonGroup.add(toggleButton2);
        buttonGroup.add(toggleButton3);
        
        
    }
    
    /**
     * JTEXTFIELD - cajas de texto
    */
    private void setJTextField(){
        JTextField textField = new JTextField();
        textField.setText("Type your name here...");
        textField.setBounds(50, 50, 200, 30);
        
        // get the text which is inside
        System.out.println("The text in the field = " + textField.getText());
        panel.add(textField);
    }
    
    /**
     * JTEXTAREA
    */
    private void setTextArea(){
        JTextArea textArea = new JTextArea(3, 2);
        textArea.setText("Type here...");
        
        // add text at the end 
        //textArea.append("or here");
        
        // allow to type or not in the TextArea
        //textArea.setEditable(false);
        
        textArea.setBounds(20, 20, 300, 200);
        panel.add(textArea);
        
        // Scroll pane - barra de desplazamiento
        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setBounds(10, 20, 300, 200);
        
        // Does the scroll bar appears
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
        panel.add(scrollPane);
    }
    
    /**
     * JCHECKBOX
    */
    private void setCheckBox(){
        JCheckBox checkBox1 = new JCheckBox("Milk");
        checkBox1.setBounds(20, 20, 100, 40);
        panel.add(checkBox1);
        
        JCheckBox checkBox2 = new JCheckBox("Eggs");
        checkBox2.setBounds(20, 60, 100, 40);
        panel.add(checkBox2);
        
        JCheckBox checkBox3 = new JCheckBox("Coffe");
        checkBox3.setBounds(20, 90, 100, 40);
        panel.add(checkBox3);
        
        
    }
    
    /**
     * JCOMBOBOX - listas desplegables
    */
    private void setComboBox(){
//        String[] countries = {"Peru", "Colombia", "Ecuador", "El Salvador"};
//        JComboBox comboBox = new JComboBox(countries);
//        comboBox.setBounds(20,20, 100, 30);
//        
//        // add a new object into the combo box 
//        comboBox.addItem("Argentina");
//        
//        // put a new initial selection
//        comboBox.setSelectedItem("El Salvador");
//        panel.add(comboBox);

          /**
           * DEFAULT COMBO BOX MODEL
           */
          
          // creates a person object
          Person person1 = new Person("Douglas Barrera", 19, "Salvadoreña");
          Person person2 = new Person("Josue Barrera", 13, "Salvadoreña");
          
          //creates a model
          DefaultComboBoxModel model = new DefaultComboBoxModel();
          
          // add person to the model
          model.addElement(person1);
          model.addElement(person2);
          
          //crates a combo box
          JComboBox comboBox = new JComboBox(model);
          
          comboBox.setBounds(20,20, 120, 30);
          panel.add(comboBox);
    }
    
    /**
     * PASSWORDFIELD - campo de contraseña
    */
    private void setPasswordField(){
        
        JPasswordField passwordField = new JPasswordField();
        
        passwordField.setBounds(20,20, 150, 30);
        
        passwordField.setText("Hello world");
        
        String password = "";
        
        for (int i = 0; i < passwordField.getPassword().length; i++) {
            password += passwordField.getPassword()[i];
        }
        
        System.out.println("my password is: " + password);
        
        panel.add(passwordField);
    }
    
    /**
     * TABLE 
    */
    private void setTable(){
        // creates a object Default object model
        DefaultTableModel tableModel = new DefaultTableModel();
        
        // add a new model
        tableModel.addColumn("Name");
        tableModel.addColumn("Age");
        tableModel.addColumn("Nationality");
        
        String[] Person1 = {"Douglas", "19", "Salvadoreño"};
        String[] Person2 = {"Carolina", "40", "Salvadoreña"};
        tableModel.addRow(Person1);
        tableModel.addRow(Person2);
        
        JTable table = new JTable(tableModel);
        table.setBounds(20, 20 , 300, 200);
        panel.add(table);
        
        // create a JScrollPane for make them appears
        JScrollPane scrollPane = new JScrollPane(table, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setBounds(20, 20 , 300, 200);
        panel.add(scrollPane);
        
    }
    
    private void setList(){
        
        DefaultListModel listModel = new DefaultListModel();
        listModel.addElement(new Person("Douglas"));
        listModel.addElement(new Person("Isabel"));
        listModel.addElement(new Person("Carolina"));
        listModel.addElement(new Person("Wilfredo"));
        listModel.addElement(new Person("Isaac"));
        listModel.addElement(new Person("Luis"));
        listModel.addElement(new Person("Luisina"));
        listModel.addElement(new Person("Patrick"));
        listModel.addElement(new Person("Millie"));
        listModel.addElement(new Person("Edie"));
        listModel.addElement(new Person("Jhonatan"));
        listModel.addElement(new Person("Mike"));
        
        JList list = new JList(listModel);
        list.setBounds(20, 20, 200, 100);
        panel.add(list);
        
        // add the scroll Pane
        JScrollPane scrollBar = new JScrollPane(list, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollBar.setBounds(20, 20, 200, 100);
        panel.add(scrollBar);
    }
    
    
}
