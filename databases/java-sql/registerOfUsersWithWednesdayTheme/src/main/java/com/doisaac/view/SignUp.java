package com.doisaac.view;

import com.doisaac.model.EncryptPassword;
import com.doisaac.model.ImageLoader;
import com.doisaac.model.SQLUser;
import com.doisaac.model.User;
import javax.swing.JOptionPane;

public class SignUp extends javax.swing.JFrame {

    /**
     * Creates new form View
     */
    public SignUp() {
        initComponents();
        initBackground();
        setLocationRelativeTo(null);
    }

    /* FUNCTIONS */
    /**
     * Initializes the image on the main panel
     */
    private void initBackground() {
        ImageLoader img = new ImageLoader(848, 477, "/img/background.png");
        panel.add(img);
        panel.repaint();
    }

    /**
     * Clean all the fields
     */
    private void cleanFields() {
        tfUsername.setText(null);
        tfPassword.setText(null);
        tfConfirmPassword.setText(null);
        tfName.setText(null);
        tfEmail.setText(null);
    }

    /* FUNCTIONS END*/
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        panel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lUsername = new javax.swing.JLabel();
        lPassword = new javax.swing.JLabel();
        lConfirmPassword = new javax.swing.JLabel();
        lName = new javax.swing.JLabel();
        lEmail = new javax.swing.JLabel();
        tfPassword = new javax.swing.JPasswordField();
        tfConfirmPassword = new javax.swing.JPasswordField();
        tfUsername = new javax.swing.JTextField();
        tfName = new javax.swing.JTextField();
        tfEmail = new javax.swing.JTextField();
        lUserRegistration = new javax.swing.JLabel();
        btnRegister = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        panel.setMaximumSize(new java.awt.Dimension(848, 477));
        panel.setLayout(new javax.swing.OverlayLayout(panel));

        jPanel1.setOpaque(false);
        jPanel1.setMaximumSize(new java.awt.Dimension(848, 477));
        jPanel1.setPreferredSize(new java.awt.Dimension(848, 477));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        lUsername.setFont(new java.awt.Font("Bookman Old Style", 1, 20)); // NOI18N
        lUsername.setForeground(new java.awt.Color(255, 255, 255));
        lUsername.setText("Username");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        jPanel1.add(lUsername, gridBagConstraints);

        lPassword.setFont(new java.awt.Font("Bookman Old Style", 1, 20)); // NOI18N
        lPassword.setForeground(new java.awt.Color(255, 255, 255));
        lPassword.setText("Password");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        jPanel1.add(lPassword, gridBagConstraints);

        lConfirmPassword.setFont(new java.awt.Font("Bookman Old Style", 1, 20)); // NOI18N
        lConfirmPassword.setForeground(new java.awt.Color(255, 255, 255));
        lConfirmPassword.setText("<html>Confirm<br> Password</html>");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        jPanel1.add(lConfirmPassword, gridBagConstraints);

        lName.setFont(new java.awt.Font("Bookman Old Style", 1, 20)); // NOI18N
        lName.setForeground(new java.awt.Color(255, 255, 255));
        lName.setText("Name");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        jPanel1.add(lName, gridBagConstraints);

        lEmail.setFont(new java.awt.Font("Bookman Old Style", 1, 20)); // NOI18N
        lEmail.setForeground(new java.awt.Color(255, 255, 255));
        lEmail.setText("Email");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        jPanel1.add(lEmail, gridBagConstraints);

        tfPassword.setBackground(new java.awt.Color(255, 255, 255));
        tfPassword.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tfPassword.setForeground(new java.awt.Color(0, 0, 0));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 200;
        gridBagConstraints.ipady = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(0, 15, 0, 0);
        jPanel1.add(tfPassword, gridBagConstraints);

        tfConfirmPassword.setBackground(new java.awt.Color(255, 255, 255));
        tfConfirmPassword.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tfConfirmPassword.setForeground(new java.awt.Color(0, 0, 0));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 200;
        gridBagConstraints.ipady = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(0, 15, 0, 0);
        jPanel1.add(tfConfirmPassword, gridBagConstraints);

        tfUsername.setBackground(new java.awt.Color(255, 255, 255));
        tfUsername.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tfUsername.setForeground(new java.awt.Color(0, 0, 0));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 200;
        gridBagConstraints.ipady = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(0, 15, 0, 0);
        jPanel1.add(tfUsername, gridBagConstraints);

        tfName.setBackground(new java.awt.Color(255, 255, 255));
        tfName.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tfName.setForeground(new java.awt.Color(0, 0, 0));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipadx = 200;
        gridBagConstraints.ipady = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(0, 15, 0, 0);
        jPanel1.add(tfName, gridBagConstraints);

        tfEmail.setBackground(new java.awt.Color(255, 255, 255));
        tfEmail.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tfEmail.setForeground(new java.awt.Color(0, 0, 0));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.ipadx = 200;
        gridBagConstraints.ipady = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(0, 15, 0, 0);
        jPanel1.add(tfEmail, gridBagConstraints);

        lUserRegistration.setBackground(new java.awt.Color(255, 255, 255));
        lUserRegistration.setFont(new java.awt.Font("Bookman Old Style", 1, 36)); // NOI18N
        lUserRegistration.setForeground(new java.awt.Color(245, 247, 248));
        lUserRegistration.setText("User Sign Up");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.insets = new java.awt.Insets(15, 0, 0, 0);
        jPanel1.add(lUserRegistration, gridBagConstraints);

        btnRegister.setFont(new java.awt.Font("Bookman Old Style", 1, 20)); // NOI18N
        btnRegister.setText("Register");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 150;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 15, 0);
        jPanel1.add(btnRegister, gridBagConstraints);

        panel.add(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        User user = new User();
        SQLUser sql = new SQLUser();

        // gets the password
        String password = new String(tfPassword.getPassword());
        String passwordConfirmation = new String(tfConfirmPassword.getPassword());

        // Validates if the text fields are filled
        if (tfUsername.getText().isBlank()
                || password.isBlank()
                || passwordConfirmation.isBlank()
                || tfName.getText().isBlank()
                || tfEmail.getText().isBlank())
        {
            JOptionPane.showMessageDialog(null, "Please, complete all the fields");
        } else
        {
            if (password.equals(passwordConfirmation))
            {
                if (sql.checkIfUserExist(tfUsername.getText()) == 0)
                {

                    if (sql.verifyEmail(tfEmail.getText()))
                    {
                        // Encrypts the password
                        String encryptedPassword = EncryptPassword.md5(password);

                        // complete the user information
                        user.setIdUser_Type(2);
                        user.setUsername(tfUsername.getText());
                        user.setPassword(encryptedPassword);
                        user.setName(tfName.getText());
                        user.setEmail(tfEmail.getText());

                        if (sql.registerUser(user))
                        {
                            JOptionPane.showMessageDialog(null, "User registration successfully done");
                            cleanFields();
                        } else
                        {
                            JOptionPane.showMessageDialog(null, "An error has ocurred");
                        }
                    } else 
                    {
                        JOptionPane.showMessageDialog(null, "Please enter a correct email");
                    }

                } else
                {
                    JOptionPane.showMessageDialog(null, "The username is already used, try with another one");
                }

            } else
            {
                JOptionPane.showMessageDialog(null, "The passwords do not match");
            }
        }
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        Main.signUp = null;
    }//GEN-LAST:event_formWindowClosed

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
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegister;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lConfirmPassword;
    private javax.swing.JLabel lEmail;
    private javax.swing.JLabel lName;
    private javax.swing.JLabel lPassword;
    private javax.swing.JLabel lUserRegistration;
    private javax.swing.JLabel lUsername;
    private javax.swing.JPanel panel;
    private javax.swing.JPasswordField tfConfirmPassword;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfName;
    private javax.swing.JPasswordField tfPassword;
    private javax.swing.JTextField tfUsername;
    // End of variables declaration//GEN-END:variables
}
