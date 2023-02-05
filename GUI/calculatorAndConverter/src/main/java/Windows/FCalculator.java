package Windows;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class FCalculator extends javax.swing.JFrame {

    private String numbersString = ""; // result number
    private String operation = "null"; // Math operation 
    private double number1, result;
    private boolean activated = true; // allows click in the addition button
    private boolean pointExist = false; // checks if the numbers already have a point

    /**
     * Creates new form FCalculator
     */
    public FCalculator() {
        initComponents();
        setSize(300, 450);
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
        java.awt.GridBagConstraints gridBagConstraints;

        jButton1 = new javax.swing.JButton();
        panel = new javax.swing.JPanel();
        sampleLabel = new javax.swing.JLabel();
        resultLabel = new javax.swing.JLabel();
        clearButton = new javax.swing.JButton();
        squareRootButton = new javax.swing.JButton();
        dividerButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        sevenButton = new javax.swing.JButton();
        eightButton = new javax.swing.JButton();
        nineButton = new javax.swing.JButton();
        multiplicationButton = new javax.swing.JButton();
        fourButton = new javax.swing.JButton();
        fiveButton = new javax.swing.JButton();
        sixButton = new javax.swing.JButton();
        minusButton = new javax.swing.JButton();
        oneButton = new javax.swing.JButton();
        twoButton = new javax.swing.JButton();
        threeButton = new javax.swing.JButton();
        additionButton = new javax.swing.JButton();
        changeSignButton = new javax.swing.JButton();
        equalButton = new javax.swing.JButton();
        pointButton = new javax.swing.JButton();
        ceroButton = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        standarCalculator = new javax.swing.JMenuItem();
        currencyConverter = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        exit = new javax.swing.JMenuItem();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculator");

        panel.setLayout(new java.awt.GridBagLayout());

        sampleLabel.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        sampleLabel.setForeground(new java.awt.Color(255, 255, 255));
        sampleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sampleLabel.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.5;
        panel.add(sampleLabel, gridBagConstraints);

        resultLabel.setBackground(new java.awt.Color(255, 255, 255));
        resultLabel.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        resultLabel.setText("0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 20);
        panel.add(resultLabel, gridBagConstraints);

        clearButton.setBackground(new java.awt.Color(54, 54, 54));
        clearButton.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        clearButton.setForeground(new java.awt.Color(255, 255, 255));
        clearButton.setText("C");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(clearButton, gridBagConstraints);

        squareRootButton.setBackground(new java.awt.Color(54, 54, 54));
        squareRootButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pow.png"))); // NOI18N
        squareRootButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                squareRootButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(squareRootButton, gridBagConstraints);

        dividerButton.setBackground(new java.awt.Color(54, 54, 54));
        dividerButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/division.png"))); // NOI18N
        dividerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dividerButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(dividerButton, gridBagConstraints);

        deleteButton.setBackground(new java.awt.Color(54, 54, 54));
        deleteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/delete.png"))); // NOI18N
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(deleteButton, gridBagConstraints);

        sevenButton.setBackground(new java.awt.Color(54, 54, 54));
        sevenButton.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        sevenButton.setForeground(new java.awt.Color(255, 255, 255));
        sevenButton.setText("7");
        sevenButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sevenButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(sevenButton, gridBagConstraints);

        eightButton.setBackground(new java.awt.Color(54, 54, 54));
        eightButton.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        eightButton.setForeground(new java.awt.Color(255, 255, 255));
        eightButton.setText("8");
        eightButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eightButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(eightButton, gridBagConstraints);

        nineButton.setBackground(new java.awt.Color(54, 54, 54));
        nineButton.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        nineButton.setForeground(new java.awt.Color(255, 255, 255));
        nineButton.setText("9");
        nineButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nineButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(nineButton, gridBagConstraints);

        multiplicationButton.setBackground(new java.awt.Color(54, 54, 54));
        multiplicationButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/multiplication2.png"))); // NOI18N
        multiplicationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplicationButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(multiplicationButton, gridBagConstraints);

        fourButton.setBackground(new java.awt.Color(54, 54, 54));
        fourButton.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        fourButton.setForeground(new java.awt.Color(255, 255, 255));
        fourButton.setText("4");
        fourButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fourButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(fourButton, gridBagConstraints);

        fiveButton.setBackground(new java.awt.Color(54, 54, 54));
        fiveButton.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        fiveButton.setForeground(new java.awt.Color(255, 255, 255));
        fiveButton.setText("5");
        fiveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fiveButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(fiveButton, gridBagConstraints);

        sixButton.setBackground(new java.awt.Color(54, 54, 54));
        sixButton.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        sixButton.setForeground(new java.awt.Color(255, 255, 255));
        sixButton.setText("6");
        sixButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sixButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(sixButton, gridBagConstraints);

        minusButton.setBackground(new java.awt.Color(54, 54, 54));
        minusButton.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        minusButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/rest.png"))); // NOI18N
        minusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minusButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(minusButton, gridBagConstraints);

        oneButton.setBackground(new java.awt.Color(54, 54, 54));
        oneButton.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        oneButton.setForeground(new java.awt.Color(255, 255, 255));
        oneButton.setText("1");
        oneButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oneButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(oneButton, gridBagConstraints);

        twoButton.setBackground(new java.awt.Color(54, 54, 54));
        twoButton.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        twoButton.setForeground(new java.awt.Color(255, 255, 255));
        twoButton.setText("2");
        twoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twoButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(twoButton, gridBagConstraints);

        threeButton.setBackground(new java.awt.Color(54, 54, 54));
        threeButton.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        threeButton.setForeground(new java.awt.Color(255, 255, 255));
        threeButton.setText("3");
        threeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                threeButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(threeButton, gridBagConstraints);

        additionButton.setBackground(new java.awt.Color(54, 54, 54));
        additionButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/add.png"))); // NOI18N
        additionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                additionButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(additionButton, gridBagConstraints);

        changeSignButton.setBackground(new java.awt.Color(54, 54, 54));
        changeSignButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/moreorless.png"))); // NOI18N
        changeSignButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeSignButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(changeSignButton, gridBagConstraints);

        equalButton.setBackground(new java.awt.Color(54, 54, 54));
        equalButton.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        equalButton.setForeground(new java.awt.Color(255, 255, 255));
        equalButton.setText("=");
        equalButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equalButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(equalButton, gridBagConstraints);

        pointButton.setBackground(new java.awt.Color(54, 54, 54));
        pointButton.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        pointButton.setForeground(new java.awt.Color(255, 255, 255));
        pointButton.setText(".");
        pointButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pointButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(pointButton, gridBagConstraints);

        ceroButton.setBackground(new java.awt.Color(54, 54, 54));
        ceroButton.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        ceroButton.setForeground(new java.awt.Color(255, 255, 255));
        ceroButton.setText("0");
        ceroButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ceroButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(ceroButton, gridBagConstraints);

        jMenu1.setText("Usage");
        jMenu1.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jMenu1.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        standarCalculator.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        standarCalculator.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/calculator.png"))); // NOI18N
        standarCalculator.setText("Standar Calculator");
        jMenu1.add(standarCalculator);

        currencyConverter.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        currencyConverter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/converter.png"))); // NOI18N
        currencyConverter.setText("Currency Converter");
        currencyConverter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                currencyConverterActionPerformed(evt);
            }
        });
        jMenu1.add(currencyConverter);
        jMenu1.add(jSeparator2);

        exit.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/exit.png"))); // NOI18N
        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        jMenu1.add(exit);

        menuBar.add(jMenu1);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void currencyConverterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_currencyConverterActionPerformed
        FCurrencyConverter converterWindow = new FCurrencyConverter();
        converterWindow.setVisible(true);
        dispose();
    }//GEN-LAST:event_currencyConverterActionPerformed

    private void squareRootButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_squareRootButtonActionPerformed
        number1 = Double.parseDouble(numbersString);
        sampleLabel.setText("sqrt(" + number1 + ")");
        result = Math.sqrt(number1);
        resultLabel.setText(String.format("%.2f", result));
        numbersString = String.valueOf(result);

        pointExist = false;
    }//GEN-LAST:event_squareRootButtonActionPerformed

    private void changeSignButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeSignButtonActionPerformed
        if (numbersString.charAt(0) != '-') {
            numbersString = "-" + numbersString;
        } else {
            numbersString = numbersString.substring(1, numbersString.length());
        }
        resultLabel.setText(numbersString);
    }//GEN-LAST:event_changeSignButtonActionPerformed

    private void oneButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oneButtonActionPerformed
        
        if(resultLabel.getText() == "0"){
            numbersString = "1";
        }
        else{
            numbersString += "1";
        }
        
        resultLabel.setText(numbersString);
        activated = true;
    }//GEN-LAST:event_oneButtonActionPerformed

    private void twoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twoButtonActionPerformed
        if(resultLabel.getText() == "0"){
            numbersString = "2";
        }
        else{
            numbersString += "2";
        }
        
        resultLabel.setText(numbersString);
        activated = true;
    }//GEN-LAST:event_twoButtonActionPerformed

    private void threeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_threeButtonActionPerformed
        // TODO add your handling code here:
        if(resultLabel.getText() == "0"){
            numbersString = "3";
        }
        else{
            numbersString += "3";
        }
        
        resultLabel.setText(numbersString);
        activated = true;
    }//GEN-LAST:event_threeButtonActionPerformed

    private void fourButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fourButtonActionPerformed
        // TODO add your handling code here:
        if(resultLabel.getText() == "0"){
            numbersString = "4";
        }
        else{
            numbersString += "4";
        }
        
        resultLabel.setText(numbersString);
        activated = true;
    }//GEN-LAST:event_fourButtonActionPerformed

    private void fiveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fiveButtonActionPerformed
        if(resultLabel.getText() == "0"){
            numbersString = "5";
        }
        else{
            numbersString += "5";
        }
        
        resultLabel.setText(numbersString);
        activated = true;
    }//GEN-LAST:event_fiveButtonActionPerformed

    private void sixButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sixButtonActionPerformed
        if(resultLabel.getText() == "0"){
            numbersString = "6";
        }
        else{
            numbersString += "6";
        }
        
        resultLabel.setText(numbersString);
        activated = true;
    }//GEN-LAST:event_sixButtonActionPerformed

    private void sevenButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sevenButtonActionPerformed
        if(resultLabel.getText() == "0"){
            numbersString = "7";
        }
        else{
            numbersString += "7";
        }
        
        resultLabel.setText(numbersString);
        activated = true;
    }//GEN-LAST:event_sevenButtonActionPerformed

    private void eightButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eightButtonActionPerformed
        if(resultLabel.getText() == "0"){
            numbersString = "8";
        }
        else{
            numbersString += "8";
        }
        
        resultLabel.setText(numbersString);
        activated = true;
    }//GEN-LAST:event_eightButtonActionPerformed

    private void nineButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nineButtonActionPerformed
        if(resultLabel.getText() == "0"){
            numbersString = "9";
        }
        else{
            numbersString += "9";
        }
        
        resultLabel.setText(numbersString);
        activated = true;
    }//GEN-LAST:event_nineButtonActionPerformed

    private void ceroButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ceroButtonActionPerformed
        if(resultLabel.getText() == "0"){
            numbersString = "0";
        }
        else{
            numbersString += "0";
        }
        
        resultLabel.setText(numbersString);
        activated = true;
    }//GEN-LAST:event_ceroButtonActionPerformed

    private void additionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_additionButtonActionPerformed

        if (activated == true) {
            number1 = Double.parseDouble(numbersString);
            sampleLabel.setText(numbersString + " + ");
            numbersString = "";
            operation = "addition";
            activated = false;
            pointExist = false;
        }

    }//GEN-LAST:event_additionButtonActionPerformed

    private void equalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equalButtonActionPerformed
        double number2 = Double.parseDouble(numbersString);

        if (operation.equals("null")) {
            resultLabel.setText(numbersString);
        } else if (operation.equals("addition")) {
            result = number1 + number2;
            resultLabel.setText(String.format("%.2f", result));
            numbersString = String.valueOf(result);

            //operation becomes null again
            operation = "null";
        } else if (operation.equals("rest")) {
            result = number1 - number2;
            resultLabel.setText(String.format("%.2f", result));
            numbersString = String.valueOf(result);

            //operation becomes null again
            operation = "null";
        } else if (operation.equals("mult")) {
            result = number1 * number2;
            resultLabel.setText(String.format("%.2f", result));
            numbersString = String.valueOf(result);

            //operation becomes null again
            operation = "null";
        } else if (operation.equals("div")) {
            result = number1 / number2;
            resultLabel.setText(String.format("%.2f", result));
            numbersString = String.valueOf(result);

            //operation becomes null again
            operation = "null";
        }

        sampleLabel.setText("");
    }//GEN-LAST:event_equalButtonActionPerformed

    private void pointButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pointButtonActionPerformed
        // TODO add your handling code here:
        if (pointExist == false) {
            if (numbersString.equals("")) {
                numbersString = "0.";
            } else {
                numbersString += ".";
            }
            resultLabel.setText(numbersString);
            pointExist = true;
        }
    }//GEN-LAST:event_pointButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        if (numbersString.length() > 0) {
            
            if (numbersString.length() == 1){
                numbersString = "0";
            }
            else{
               numbersString = numbersString.substring(0, numbersString.length() - 1);

            }
            resultLabel.setText(numbersString);
        }

    }//GEN-LAST:event_deleteButtonActionPerformed

    private void minusButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minusButtonActionPerformed
        if (activated == true) {
            number1 = Double.parseDouble(numbersString);
            sampleLabel.setText(numbersString + " - ");
            numbersString = "";
            operation = "rest";
            activated = false;
            pointExist = false;
        }
    }//GEN-LAST:event_minusButtonActionPerformed

    private void multiplicationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplicationButtonActionPerformed
        if (activated == true) {
            number1 = Double.parseDouble(numbersString);
            sampleLabel.setText(numbersString + " * ");
            numbersString = "";
            operation = "mult";
            activated = false;
            pointExist = false;
        }
    }//GEN-LAST:event_multiplicationButtonActionPerformed

    private void dividerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dividerButtonActionPerformed
        if (activated == true) {
            number1 = Double.parseDouble(numbersString);
            sampleLabel.setText(numbersString + " / ");
            numbersString = "";
            operation = "div";
            activated = false;
            pointExist = false;
        }
    }//GEN-LAST:event_dividerButtonActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        sampleLabel.setText("");
        resultLabel.setText("0");
        numbersString = "";
        operation = "null";
        activated = true;
        pointExist = false;
        
    }//GEN-LAST:event_clearButtonActionPerformed

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
            java.util.logging.Logger.getLogger(FCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        try {
            /* Look and Feel*/
            UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel");
        } catch (ClassNotFoundException ex) {
            //Logger.getLogger(FCalculator.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            //Logger.getLogger(FCalculator.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            //Logger.getLogger(FCalculator.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            //Logger.getLogger(FCalculator.class.getName()).log(Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FCalculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton additionButton;
    private javax.swing.JButton ceroButton;
    private javax.swing.JButton changeSignButton;
    private javax.swing.JButton clearButton;
    private javax.swing.JMenuItem currencyConverter;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton dividerButton;
    private javax.swing.JButton eightButton;
    private javax.swing.JButton equalButton;
    private javax.swing.JMenuItem exit;
    private javax.swing.JButton fiveButton;
    private javax.swing.JButton fourButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JButton minusButton;
    private javax.swing.JButton multiplicationButton;
    private javax.swing.JButton nineButton;
    private javax.swing.JButton oneButton;
    private javax.swing.JPanel panel;
    private javax.swing.JButton pointButton;
    private javax.swing.JLabel resultLabel;
    private javax.swing.JLabel sampleLabel;
    private javax.swing.JButton sevenButton;
    private javax.swing.JButton sixButton;
    private javax.swing.JButton squareRootButton;
    private javax.swing.JMenuItem standarCalculator;
    private javax.swing.JButton threeButton;
    private javax.swing.JButton twoButton;
    // End of variables declaration//GEN-END:variables
}