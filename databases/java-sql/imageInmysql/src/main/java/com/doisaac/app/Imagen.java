package com.doisaac.app;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;

public class Imagen extends javax.swing.JPanel {
    
    private BufferedImage path;
    
    public Imagen(int width, int height, BufferedImage path){
        this.setSize(width, height);
        this.path = path;
    }
    
    @Override
    public void paint(Graphics g){
        Dimension size = getSize();
        //ImageIcon img = new ImageIcon(getClass().getResource(path)); this works when the img is in the package
        //Image img = new ImageIcon(path).getImage();
        BufferedImage img = path;
        g.drawImage(img, 0, 0, size.width, size.height, null);
        setOpaque(false);
        super.paintComponent(g);
    }
    
}
