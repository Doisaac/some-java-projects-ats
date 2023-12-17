package com.doisaac.model;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.ImageIcon;

public class ImageLoader extends javax.swing.JPanel{
    
    int width;
    int height;
    String path;

    public ImageLoader(int width, int height, String path) {
        this.setSize(width, height);
        this.path = path;
    }
    
    @Override
    public void paint(Graphics g){
        Dimension dimension = this.getSize();
        ImageIcon image =  new ImageIcon(getClass().getResource(path));
        g.drawImage(image.getImage(), 0, 0, null);
        this.setOpaque(false);
        super.paintComponent(g);
    }
    
    
    
}
