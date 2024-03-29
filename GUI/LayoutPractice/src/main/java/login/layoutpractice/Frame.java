/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package login.layoutpractice;

import javax.swing.JScrollPane;

/**
 *
 * @author MrDoisaac
 */
public class Frame extends javax.swing.JFrame {

    /**
     * Creates new form Frame
     */
    public Frame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jScrollPane1 = new javax.swing.JScrollPane();
        panel = new javax.swing.JPanel();
        millieName = new javax.swing.JLabel();
        millieImg = new javax.swing.JLabel();
        sadieImg = new javax.swing.JLabel();
        millieRol = new javax.swing.JLabel();
        sadieLabel = new javax.swing.JLabel();
        sadieRoll = new javax.swing.JLabel();
        calebImg = new javax.swing.JLabel();
        calebRoll = new javax.swing.JLabel();
        calebLabel = new javax.swing.JLabel();
        gatenImg = new javax.swing.JLabel();
        gatenLabel = new javax.swing.JLabel();
        gatenRoll = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Stranger Things Main Cast");

        panel.setBackground(new java.awt.Color(102, 102, 102));
        panel.setLayout(new java.awt.GridBagLayout());

        millieName.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        millieName.setForeground(new java.awt.Color(255, 255, 255));
        millieName.setText("Millie Bobby Brown");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.weightx = 0.8;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 0, 20);
        panel.add(millieName, gridBagConstraints);

        millieImg.setBackground(new java.awt.Color(0, 153, 51));
        millieImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Millie.jpg"))); // NOI18N
        millieImg.setOpaque(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_END;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 0, 0);
        panel.add(millieImg, gridBagConstraints);

        sadieImg.setBackground(new java.awt.Color(255, 0, 51));
        sadieImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Sadie.jpg"))); // NOI18N
        sadieImg.setOpaque(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_END;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 0, 0);
        panel.add(sadieImg, gridBagConstraints);

        millieRol.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        millieRol.setForeground(new java.awt.Color(255, 255, 255));
        millieRol.setText("Roll: Eleven");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 0, 0);
        panel.add(millieRol, gridBagConstraints);

        sadieLabel.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        sadieLabel.setForeground(new java.awt.Color(255, 255, 255));
        sadieLabel.setText("Sadie Sink");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 0, 0);
        panel.add(sadieLabel, gridBagConstraints);

        sadieRoll.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        sadieRoll.setForeground(new java.awt.Color(255, 255, 255));
        sadieRoll.setText("Roll: Max");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 0, 0);
        panel.add(sadieRoll, gridBagConstraints);

        calebImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Caleb.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 0, 0);
        panel.add(calebImg, gridBagConstraints);

        calebRoll.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        calebRoll.setForeground(new java.awt.Color(255, 255, 255));
        calebRoll.setText("Roll: Lucas");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 0, 0);
        panel.add(calebRoll, gridBagConstraints);

        calebLabel.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        calebLabel.setForeground(new java.awt.Color(255, 255, 255));
        calebLabel.setText("Caleb Mclaughlin");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(50, 20, 0, 0);
        panel.add(calebLabel, gridBagConstraints);

        gatenImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Gaten.jpg"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_END;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 0, 0);
        panel.add(gatenImg, gridBagConstraints);

        gatenLabel.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        gatenLabel.setForeground(new java.awt.Color(255, 255, 255));
        gatenLabel.setText("Gaten Matarazzo");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 0, 0);
        panel.add(gatenLabel, gridBagConstraints);

        gatenRoll.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        gatenRoll.setForeground(new java.awt.Color(255, 255, 255));
        gatenRoll.setText("Roll: Dustin");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 0, 0);
        panel.add(gatenRoll, gridBagConstraints);

        jScrollPane1.setViewportView(panel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel calebImg;
    private javax.swing.JLabel calebLabel;
    private javax.swing.JLabel calebRoll;
    private javax.swing.JLabel gatenImg;
    private javax.swing.JLabel gatenLabel;
    private javax.swing.JLabel gatenRoll;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel millieImg;
    private javax.swing.JLabel millieName;
    private javax.swing.JLabel millieRol;
    private javax.swing.JPanel panel;
    private javax.swing.JLabel sadieImg;
    private javax.swing.JLabel sadieLabel;
    private javax.swing.JLabel sadieRoll;
    // End of variables declaration//GEN-END:variables
}
