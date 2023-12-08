/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.doisaac.crud_mvc.view;

/**
 *
 * @author MrDoisaac
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
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

        jPanel1 = new javax.swing.JPanel();
        lCountry = new javax.swing.JLabel();
        lEmail = new javax.swing.JLabel();
        lPhoneNumber = new javax.swing.JLabel();
        lPersonCode = new javax.swing.JLabel();
        lBirthdate = new javax.swing.JLabel();
        lGender = new javax.swing.JLabel();
        lFirstName = new javax.swing.JLabel();
        tfSearch = new javax.swing.JTextField();
        tfPersonId = new javax.swing.JTextField();
        tfCountry = new javax.swing.JTextField();
        tfPersonCode = new javax.swing.JTextField();
        tfFirstName = new javax.swing.JTextField();
        tfPhoneNumber = new javax.swing.JTextField();
        tfBirthday = new javax.swing.JTextField();
        tfEmail = new javax.swing.JTextField();
        cmGender = new javax.swing.JComboBox<>();
        lSearchPersonCode = new javax.swing.JLabel();
        lID = new javax.swing.JLabel();
        btnModify = new javax.swing.JButton();
        btnInsert = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnClean = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        lCountry.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lCountry.setForeground(new java.awt.Color(0, 0, 0));
        lCountry.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lCountry.setText("Country");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.5;
        jPanel1.add(lCountry, gridBagConstraints);

        lEmail.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lEmail.setForeground(new java.awt.Color(0, 0, 0));
        lEmail.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lEmail.setText("Email");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.5;
        jPanel1.add(lEmail, gridBagConstraints);

        lPhoneNumber.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lPhoneNumber.setForeground(new java.awt.Color(0, 0, 0));
        lPhoneNumber.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lPhoneNumber.setText("Phone number");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.5;
        jPanel1.add(lPhoneNumber, gridBagConstraints);

        lPersonCode.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lPersonCode.setForeground(new java.awt.Color(0, 0, 0));
        lPersonCode.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lPersonCode.setText("Person Code");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.5;
        jPanel1.add(lPersonCode, gridBagConstraints);

        lBirthdate.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lBirthdate.setForeground(new java.awt.Color(0, 0, 0));
        lBirthdate.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lBirthdate.setText("Birthdate");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.5;
        jPanel1.add(lBirthdate, gridBagConstraints);

        lGender.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lGender.setForeground(new java.awt.Color(0, 0, 0));
        lGender.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lGender.setText("Gender");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.5;
        jPanel1.add(lGender, gridBagConstraints);

        lFirstName.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lFirstName.setForeground(new java.awt.Color(0, 0, 0));
        lFirstName.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lFirstName.setText("First Name");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.5;
        jPanel1.add(lFirstName, gridBagConstraints);

        tfSearch.setBackground(new java.awt.Color(155, 190, 200));
        tfSearch.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tfSearch.setForeground(new java.awt.Color(0, 0, 0));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(15, 15, 15, 15);
        jPanel1.add(tfSearch, gridBagConstraints);

        tfPersonId.setBackground(new java.awt.Color(155, 190, 200));
        tfPersonId.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tfPersonId.setForeground(new java.awt.Color(0, 0, 0));
        tfPersonId.setEditable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(5, 15, 15, 15);
        jPanel1.add(tfPersonId, gridBagConstraints);

        tfCountry.setBackground(new java.awt.Color(155, 190, 200));
        tfCountry.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tfCountry.setForeground(new java.awt.Color(0, 0, 0));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.weightx = 0.9;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel1.add(tfCountry, gridBagConstraints);

        tfPersonCode.setBackground(new java.awt.Color(155, 190, 200));
        tfPersonCode.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tfPersonCode.setForeground(new java.awt.Color(0, 0, 0));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.weightx = 0.9;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel1.add(tfPersonCode, gridBagConstraints);

        tfFirstName.setBackground(new java.awt.Color(155, 190, 200));
        tfFirstName.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tfFirstName.setForeground(new java.awt.Color(0, 0, 0));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.weightx = 0.9;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel1.add(tfFirstName, gridBagConstraints);

        tfPhoneNumber.setBackground(new java.awt.Color(155, 190, 200));
        tfPhoneNumber.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tfPhoneNumber.setForeground(new java.awt.Color(0, 0, 0));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.weightx = 0.9;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel1.add(tfPhoneNumber, gridBagConstraints);

        tfBirthday.setBackground(new java.awt.Color(155, 190, 200));
        tfBirthday.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tfBirthday.setForeground(new java.awt.Color(0, 0, 0));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.weightx = 0.9;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel1.add(tfBirthday, gridBagConstraints);

        tfEmail.setBackground(new java.awt.Color(155, 190, 200));
        tfEmail.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tfEmail.setForeground(new java.awt.Color(0, 0, 0));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.weightx = 0.9;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel1.add(tfEmail, gridBagConstraints);

        cmGender.setBackground(new java.awt.Color(155, 190, 200));
        cmGender.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cmGender.setForeground(new java.awt.Color(0, 0, 0));
        cmGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"Male", "Female"}));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.weightx = 0.9;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel1.add(cmGender, gridBagConstraints);

        lSearchPersonCode.setFont(new java.awt.Font("Arial", 2, 12)); // NOI18N
        lSearchPersonCode.setForeground(new java.awt.Color(51, 51, 51));
        lSearchPersonCode.setText("Person Code");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.weightx = 0.9;
        gridBagConstraints.weighty = 0.5;
        jPanel1.add(lSearchPersonCode, gridBagConstraints);

        lID.setFont(new java.awt.Font("Arial", 2, 12)); // NOI18N
        lID.setForeground(new java.awt.Color(51, 51, 51));
        lID.setText("ID");
        lID.setVisible(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(8, 15, 15, 0);
        jPanel1.add(lID, gridBagConstraints);

        btnModify.setBackground(new java.awt.Color(238, 242, 150));
        btnModify.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnModify.setForeground(new java.awt.Color(0, 0, 0));
        btnModify.setText("Modify");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel1.add(btnModify, gridBagConstraints);

        btnInsert.setBackground(new java.awt.Color(154, 222, 123));
        btnInsert.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnInsert.setForeground(new java.awt.Color(0, 0, 0));
        btnInsert.setText("Insert");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel1.add(btnInsert, gridBagConstraints);

        btnDelete.setBackground(new java.awt.Color(255, 143, 143));
        btnDelete.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(0, 0, 0));
        btnDelete.setText("Delete");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel1.add(btnDelete, gridBagConstraints);

        btnClean.setBackground(new java.awt.Color(80, 141, 105));
        btnClean.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnClean.setForeground(new java.awt.Color(0, 0, 0));
        btnClean.setText("Clean");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel1.add(btnClean, gridBagConstraints);

        btnSearch.setBackground(new java.awt.Color(249, 249, 224));
        btnSearch.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnSearch.setForeground(new java.awt.Color(0, 0, 0));
        btnSearch.setText("Search");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(15, 15, 15, 15);
        jPanel1.add(btnSearch, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 594, Short.MAX_VALUE)
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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnClean;
    public javax.swing.JButton btnDelete;
    public javax.swing.JButton btnInsert;
    public javax.swing.JButton btnModify;
    public javax.swing.JButton btnSearch;
    public javax.swing.JComboBox<String> cmGender;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lBirthdate;
    private javax.swing.JLabel lCountry;
    private javax.swing.JLabel lEmail;
    private javax.swing.JLabel lFirstName;
    private javax.swing.JLabel lGender;
    public javax.swing.JLabel lID;
    private javax.swing.JLabel lPersonCode;
    private javax.swing.JLabel lPhoneNumber;
    private javax.swing.JLabel lSearchPersonCode;
    public javax.swing.JTextField tfBirthday;
    public javax.swing.JTextField tfCountry;
    public javax.swing.JTextField tfEmail;
    public javax.swing.JTextField tfFirstName;
    public javax.swing.JTextField tfPersonCode;
    public javax.swing.JTextField tfPersonId;
    public javax.swing.JTextField tfPhoneNumber;
    public javax.swing.JTextField tfSearch;
    // End of variables declaration//GEN-END:variables
}
