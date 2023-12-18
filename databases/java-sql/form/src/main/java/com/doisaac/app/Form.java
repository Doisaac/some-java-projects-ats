package com.doisaac.app;

import com.doisaac.model.ConnecionToDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Form extends javax.swing.JFrame {

    /**
     * Creates new form Form
     */
    public Form() {
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

        genderGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        lForm = new javax.swing.JLabel();
        lSelectGender = new javax.swing.JLabel();
        lAge = new javax.swing.JLabel();
        lFavoriteSport = new javax.swing.JLabel();
        rbMale = new javax.swing.JRadioButton();
        rbFemale = new javax.swing.JRadioButton();
        spinAge = new com.toedter.components.JSpinField();
        cbSoccer = new javax.swing.JCheckBox();
        cbBasketaball = new javax.swing.JCheckBox();
        cbTennis = new javax.swing.JCheckBox();
        cbSwimming = new javax.swing.JCheckBox();
        cbBaseball = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        btnShowAForm = new javax.swing.JButton();

        genderGroup.add(rbMale);
        genderGroup.add(rbFemale);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(521, 539));

        jPanel1.setBackground(new java.awt.Color(238, 240, 229));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        lForm.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        lForm.setForeground(new java.awt.Color(22, 48, 32));
        lForm.setText("FORM");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        jPanel1.add(lForm, gridBagConstraints);

        lSelectGender.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        lSelectGender.setForeground(new java.awt.Color(22, 48, 32));
        lSelectGender.setText("Select  Gender");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(0, 50, 0, 0);
        jPanel1.add(lSelectGender, gridBagConstraints);

        lAge.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        lAge.setForeground(new java.awt.Color(22, 48, 32));
        lAge.setText("How old are you?");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(0, 50, 0, 0);
        jPanel1.add(lAge, gridBagConstraints);

        lFavoriteSport.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        lFavoriteSport.setForeground(new java.awt.Color(22, 48, 32));
        lFavoriteSport.setText("Choose your Favorite Sports");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(0, 50, 0, 0);
        jPanel1.add(lFavoriteSport, gridBagConstraints);

        rbMale.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        rbMale.setForeground(new java.awt.Color(22, 48, 32));
        rbMale.setText("Male");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(0, 50, 0, 0);
        jPanel1.add(rbMale, gridBagConstraints);

        rbFemale.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        rbFemale.setForeground(new java.awt.Color(22, 48, 32));
        rbFemale.setText("Female");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(0, 50, 0, 0);
        jPanel1.add(rbFemale, gridBagConstraints);

        spinAge.setForeground(new java.awt.Color(22, 48, 32));
        spinAge.setPreferredSize(new java.awt.Dimension(80, 26));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.weightx = 0.9;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 50);
        jPanel1.add(spinAge, gridBagConstraints);

        cbSoccer.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cbSoccer.setForeground(new java.awt.Color(22, 48, 32));
        cbSoccer.setText("Soccer");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(0, 50, 0, 0);
        jPanel1.add(cbSoccer, gridBagConstraints);

        cbBasketaball.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cbBasketaball.setForeground(new java.awt.Color(22, 48, 32));
        cbBasketaball.setText("Basketball");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(0, 50, 0, 0);
        jPanel1.add(cbBasketaball, gridBagConstraints);

        cbTennis.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cbTennis.setForeground(new java.awt.Color(22, 48, 32));
        cbTennis.setText("Tennis");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(0, 50, 0, 0);
        jPanel1.add(cbTennis, gridBagConstraints);

        cbSwimming.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cbSwimming.setForeground(new java.awt.Color(22, 48, 32));
        cbSwimming.setText("Swimming");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(0, 50, 0, 0);
        jPanel1.add(cbSwimming, gridBagConstraints);

        cbBaseball.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cbBaseball.setForeground(new java.awt.Color(22, 48, 32));
        cbBaseball.setText("Baseball");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(0, 50, 0, 0);
        jPanel1.add(cbBaseball, gridBagConstraints);

        jButton1.setText("Insert");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.ipadx = 100;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        jPanel1.add(jButton1, gridBagConstraints);

        btnShowAForm.setText("Show a Form");
        btnShowAForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowAFormActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.ipadx = 100;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        jPanel1.add(btnShowAForm, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        ConnecionToDB connectionToDB = new ConnecionToDB();
        PreparedStatement ps = null;
        
        String gender = "";
        int age;
        boolean soccer = false, basketball = false, tennis = false, swimming = false, baseball = false;
        
        try
        {
            // JRadioButton selected option
            if (rbMale.isSelected()){
                gender = "Male";
            }
            else if (rbFemale.isSelected()){
                gender = "Female";
            }
            
            // Spinner selected option
            age =  spinAge.getValue();
            
            soccer = cbSoccer.isSelected();
            basketball = cbBasketaball.isSelected();
            tennis = cbTennis.isSelected();
            swimming = cbSwimming.isSelected();
            baseball = cbBaseball.isSelected();
            
            Connection connection = connectionToDB.getConnection();
            ps = connection.prepareStatement("INSERT INTO form (gender, age, soccer, basketball, tennis, swimming, baseball) "
                    + "VALUES (?,?,?,?,?,?,?)");
            
            ps.setString(1, gender);
            ps.setInt(2, age);
            ps.setBoolean(3, soccer);
            ps.setBoolean(4, basketball);
            ps.setBoolean(5, tennis);
            ps.setBoolean(6, swimming);
            ps.setBoolean(7, baseball);
            
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Form inserted successfully");
            
            connection.close();
            
        } catch (Exception e)
        {
            System.out.println("Error: " + e.getMessage());
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnShowAFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowAFormActionPerformed
       
        ConnecionToDB connectionToDB = new ConnecionToDB();
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        try
        {
            Connection connection = connectionToDB.getConnection();
            ps = connection.prepareStatement("SELECT gender, age, soccer, basketball, tennis, swimming, baseball "
                    + "FROM form WHERE id=?");
        
            String inputId =  JOptionPane.showInputDialog(null, "Type the ID");
            int idSelected = Integer.parseInt(inputId);
            
            ps.setInt(1, idSelected);
            rs = ps.executeQuery();
            
            while (rs.next()){
                
                //JRadioButtons
                if (rs.getString("gender").equals("Male")){
                    rbMale.setSelected(true);
                }
                else if (rs.getString("gender").equals("Female")){
                    rbFemale.setSelected(true);
                }
                
                // Spinner
                spinAge.setValue(rs.getInt("age"));
                
                // Sports
                if (rs.getBoolean("soccer")){
                    cbSoccer.setSelected(true);
                }
                if (rs.getBoolean("basketball")){
                    cbBasketaball.setSelected(true);
                }
                if (rs.getBoolean("tennis")){
                    cbTennis.setSelected(true);
                }
                if (rs.getBoolean("swimming")){
                    cbSwimming.setSelected(true);
                }
                if (rs.getBoolean("baseball")){
                    cbBaseball.setSelected(true);
                }
                
            }
            
            connection.close();
            
        } catch (Exception e)
        {
            System.out.println("Error: " + e.getMessage());
        }
    }//GEN-LAST:event_btnShowAFormActionPerformed

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
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnShowAForm;
    private javax.swing.JCheckBox cbBaseball;
    private javax.swing.JCheckBox cbBasketaball;
    private javax.swing.JCheckBox cbSoccer;
    private javax.swing.JCheckBox cbSwimming;
    private javax.swing.JCheckBox cbTennis;
    private javax.swing.ButtonGroup genderGroup;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lAge;
    private javax.swing.JLabel lFavoriteSport;
    private javax.swing.JLabel lForm;
    private javax.swing.JLabel lSelectGender;
    private javax.swing.JRadioButton rbFemale;
    private javax.swing.JRadioButton rbMale;
    private com.toedter.components.JSpinField spinAge;
    // End of variables declaration//GEN-END:variables
}