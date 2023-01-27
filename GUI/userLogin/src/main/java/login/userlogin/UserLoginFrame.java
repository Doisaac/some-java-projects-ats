/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package login.userlogin;

import javax.swing.JOptionPane;

/**
 *
 * @author MrDoisaac
 */
public class UserLoginFrame extends javax.swing.JFrame {

    /**
     * Creates new form UserLoginFrame
     */
    public UserLoginFrame() {
        initComponents();
        setLocationRelativeTo(null);
        
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
        usernameField = new javax.swing.JTextField();
        passwordLabel = new javax.swing.JLabel();
        usernameLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        passwordField = new javax.swing.JPasswordField();
        wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        usernameField.setBackground(new java.awt.Color(255, 255, 255));
        usernameField.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        panel.add(usernameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 430, 300, 40));

        passwordLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        passwordLabel.setForeground(new java.awt.Color(255, 255, 255));
        passwordLabel.setText("Password:");
        panel.add(passwordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 490, -1, 40));

        usernameLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        usernameLabel1.setForeground(new java.awt.Color(255, 255, 255));
        usernameLabel1.setText("Username:");
        panel.add(usernameLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, -1, 40));

        jButton1.setBackground(new java.awt.Color(24, 160, 59));
        jButton1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("LOGIN");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        panel.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 550, 120, 30));

        passwordField.setBackground(new java.awt.Color(255, 255, 255));
        passwordField.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        panel.add(passwordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 490, 300, 40));

        wallpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/wallpaper.png"))); // NOI18N
        panel.add(wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 600));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Strings that contain the username and the password
        String username = "Douglas Barrera";
        String password = "douglaslogin";
        
        // USER VALIDATION 
        if(usernameField.getText().equals(username)){
            String passwordEntered = "";
            
            for (int i = 0; i < passwordField.getPassword().length; i++) {
                passwordEntered += passwordField.getPassword()[i];
            }
            
            if ( passwordEntered.equals(password)){
                JOptionPane.showMessageDialog(null, "USER SUCCESSFULLY");
            } else {
                JOptionPane.showMessageDialog(null, "INCORRECT PASSWORD!");
            }
            
        }
        else{
            JOptionPane.showMessageDialog(null, "INCORRECT USERNAME!");
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(UserLoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserLoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserLoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserLoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserLoginFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel panel;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JTextField usernameField;
    private javax.swing.JLabel usernameLabel1;
    private javax.swing.JLabel wallpaper;
    // End of variables declaration//GEN-END:variables
}
