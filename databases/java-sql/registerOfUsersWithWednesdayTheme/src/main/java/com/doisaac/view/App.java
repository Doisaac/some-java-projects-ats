/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.doisaac.view;

import com.doisaac.model.User;

/**
 *
 * @author MrDoisaac
 */
public class App extends javax.swing.JFrame {

    User user;
    
    /**
     * Creates new form App
     */
    public App() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    /**
     * Creates new form App and show information depending of the user role
     * @param user 
     */
    public App(User user){
        initComponents();
        setLocationRelativeTo(null);
        this.user = user;
        
        lName.setText(user.getName());
        lUserType.setText(user.getUserRol());
        
        if (user.getIdUser_Type() == 1){
            // all is showed
        } 
        else if (user.getIdUser_Type() == 2){
            menuAdm.setVisible(false);
            mitemDisplayDirectors.setVisible(false);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        lTitle = new javax.swing.JLabel();
        lName = new javax.swing.JLabel();
        lUserType = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        menuShow = new javax.swing.JMenu();
        mitemDisplayDirectors = new javax.swing.JMenuItem();
        mitemDisplayCharacters = new javax.swing.JMenuItem();
        mitemDisplayNameOfActors = new javax.swing.JMenuItem();
        menuAdm = new javax.swing.JMenu();
        mitemAddCharacter = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        panel.setBackground(new java.awt.Color(255, 255, 255));
        panel.setPreferredSize(new java.awt.Dimension(848, 477));

        lTitle.setFont(new java.awt.Font("Bookman Old Style", 1, 36)); // NOI18N
        lTitle.setForeground(new java.awt.Color(0, 0, 0));
        lTitle.setText("Welcome to the wednesday show system");

        lName.setFont(new java.awt.Font("Bookman Old Style", 2, 14)); // NOI18N
        lName.setForeground(new java.awt.Color(0, 0, 0));

        lUserType.setFont(new java.awt.Font("Bookman Old Style", 2, 14)); // NOI18N
        lUserType.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lName, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lUserType, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(lTitle)
                .addContainerGap(54, Short.MAX_VALUE))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 358, Short.MAX_VALUE)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lName, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addComponent(lUserType, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        menuBar.setBackground(new java.awt.Color(15, 33, 103));
        menuBar.setForeground(new java.awt.Color(255, 255, 255));
        menuBar.setOpaque(true);

        menuShow.setText("Show ");

        mitemDisplayDirectors.setText("Display directors");
        menuShow.add(mitemDisplayDirectors);

        mitemDisplayCharacters.setText("Display characters");
        mitemDisplayCharacters.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitemDisplayCharactersActionPerformed(evt);
            }
        });
        menuShow.add(mitemDisplayCharacters);

        mitemDisplayNameOfActors.setText("Display name of actors");
        menuShow.add(mitemDisplayNameOfActors);

        menuBar.add(menuShow);

        menuAdm.setText("Adm");

        mitemAddCharacter.setText("Add character");
        menuAdm.add(mitemAddCharacter);

        menuBar.add(menuAdm);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 855, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mitemDisplayCharactersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitemDisplayCharactersActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mitemDisplayCharactersActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new App().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lName;
    private javax.swing.JLabel lTitle;
    private javax.swing.JLabel lUserType;
    private javax.swing.JMenu menuAdm;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuShow;
    private javax.swing.JMenuItem mitemAddCharacter;
    private javax.swing.JMenuItem mitemDisplayCharacters;
    private javax.swing.JMenuItem mitemDisplayDirectors;
    private javax.swing.JMenuItem mitemDisplayNameOfActors;
    private javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables
}
