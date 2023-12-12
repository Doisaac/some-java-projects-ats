package com.doisaac.app;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;

public class Imagen extends javax.swing.JPanel {
    
    private String path;
    
    public Imagen(int width, int height, String path){
        this.setSize(width, height);
        this.path = path;
    }
    
    @Override
    public void paint(Graphics g){
        Dimension size = getSize();
        //ImageIcon img = new ImageIcon(getClass().getResource(path)); this works when the img is in the package
        Image img = new ImageIcon(path).getImage();
        g.drawImage(img, 0, 0, size.width, size.height, null);
        setOpaque(false);
        super.paintComponent(g);
    }
    
}
