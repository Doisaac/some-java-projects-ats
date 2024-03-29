/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package game.frames;

import java.awt.Color;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.UIManager;

/**
 *
 * @author MrDoisaac
 */
public class GameFrame extends javax.swing.JFrame {
    
    private String user1;
    private String user2;
    private int user1Victories = 0;
    private int user2Victories = 0;
    private int ties = 0;
    
    // This matrix allows us to know which box is available to click
    private boolean box[][] = new boolean[3][3];

    // This matrix allows us to know which player wins each match
    private int winnerMatrix[][] = new int[3][3];

    private String turn;

    /**
     * Creates new form Main
     */
    public GameFrame(String user1, String user2) {
        this.user1 = user1;
        this.user2 = user2;
        this.turn = user1;
        initComponents();
        setSize(600, 600);
        setLocationRelativeTo(null);
        initializeBox();
    }

    /**
     * Initialize all the matrix as true, referring that all the box is
     * available to click
     */
    private void initializeBox() {
        for (int i = 0; i < box.length; i++) {
            for (int j = 0; j < box[i].length; j++) {
                box[i][j] = true;
            }
        }
    }

    /**
     * Allows us to know which player wins the match
     */
    private void initializeWinnerMatrix() {
        for (int i = 0; i < winnerMatrix.length; i++) {
            for (int j = 0; j < winnerMatrix[i].length; j++) {
                winnerMatrix[i][j] = 0;
            }
        }
    }

    /**
     * Draws an "X" on the button given as an argument
     *
     * @param button The button where the x will be drawn
     */
    private void drawX(JButton button) {
        button.setIcon(new ImageIcon(getClass().getResource("/img/x.png")));
    }

    /**
     * Draws an "O" on the button given as an argument
     *
     * @param button The button where the "O" will be drawn
     */
    private void drawO(JButton button) {
        button.setIcon(new ImageIcon(getClass().getResource("/img/circle.png")));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem3 = new javax.swing.JMenuItem();
        panel = new javax.swing.JPanel();
        button00 = new javax.swing.JButton();
        button01 = new javax.swing.JButton();
        button02 = new javax.swing.JButton();
        button10 = new javax.swing.JButton();
        button11 = new javax.swing.JButton();
        button12 = new javax.swing.JButton();
        button20 = new javax.swing.JButton();
        button21 = new javax.swing.JButton();
        button22 = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();
        gameMenu = new javax.swing.JMenu();
        startAgain = new javax.swing.JMenuItem();
        showResults = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        exit = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();

        jMenuItem3.setText("jMenuItem3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel.setLayout(new java.awt.GridLayout(3, 3));

        button00.setBackground(new java.awt.Color(20, 189, 172));
        button00.setOpaque(true);
        button00.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button00ActionPerformed(evt);
            }
        });
        panel.add(button00);

        button01.setBackground(new java.awt.Color(20, 189, 172));
        button01.setOpaque(true);
        button01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button01ActionPerformed(evt);
            }
        });
        panel.add(button01);

        button02.setBackground(new java.awt.Color(20, 189, 172));
        button02.setOpaque(true);
        button02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button02ActionPerformed(evt);
            }
        });
        panel.add(button02);

        button10.setBackground(new java.awt.Color(20, 189, 172));
        button10.setOpaque(true);
        button10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button10ActionPerformed(evt);
            }
        });
        panel.add(button10);

        button11.setBackground(new java.awt.Color(20, 189, 172));
        button11.setOpaque(true);
        button11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button11ActionPerformed(evt);
            }
        });
        panel.add(button11);

        button12.setBackground(new java.awt.Color(20, 189, 172));
        button12.setOpaque(true);
        button12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button12ActionPerformed(evt);
            }
        });
        panel.add(button12);

        button20.setBackground(new java.awt.Color(20, 189, 172));
        button20.setOpaque(true);
        button20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button20ActionPerformed(evt);
            }
        });
        panel.add(button20);

        button21.setBackground(new java.awt.Color(20, 189, 172));
        button21.setOpaque(true);
        button21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button21ActionPerformed(evt);
            }
        });
        panel.add(button21);

        button22.setBackground(new java.awt.Color(20, 189, 172));
        button22.setOpaque(true);
        button22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button22ActionPerformed(evt);
            }
        });
        panel.add(button22);

        menuBar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        menuBar.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        menuBar.setOpaque(true);

        gameMenu.setBackground(new java.awt.Color(51, 51, 51));
        gameMenu.setText("Game");
        gameMenu.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        startAgain.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        startAgain.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/startAgain.png"))); // NOI18N
        startAgain.setText("Start again");
        startAgain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startAgainActionPerformed(evt);
            }
        });
        gameMenu.add(startAgain);

        showResults.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        showResults.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/results.png"))); // NOI18N
        showResults.setText("Show results");
        showResults.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showResultsActionPerformed(evt);
            }
        });
        gameMenu.add(showResults);
        gameMenu.add(jSeparator1);

        exit.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/exit.png"))); // NOI18N
        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        gameMenu.add(exit);

        menuBar.add(gameMenu);

        helpMenu.setBackground(new java.awt.Color(51, 51, 51));
        helpMenu.setText("Help");
        helpMenu.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        helpMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                helpMenuMouseClicked(evt);
            }
        });
        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, 574, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // exit button
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void button00ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button00ActionPerformed
        if (box[0][0] == true) {
            if (turn.equals(user1)) {
                drawX(button00);
                winnerMatrix[0][0] = 1;
                turn = user2;
            } else {
                drawO(button00);
                winnerMatrix[0][0] = 2;
                turn = user1;
            }
            box[0][0] = false;
            checkWinner();
        }
    }//GEN-LAST:event_button00ActionPerformed

    private void button01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button01ActionPerformed
        if (box[0][1] == true) {
            if (turn.equals(user1)) {
                button01.setIcon(new ImageIcon(getClass().getResource("/img/x.png")));
                winnerMatrix[0][1] = 1;
                turn = user2;
            } else {
                button01.setIcon(new ImageIcon(getClass().getResource("/img/circle.png")));
                winnerMatrix[0][1] = 2;
                turn = user1;
            }
            box[0][1] = false;
            checkWinner();
        }
    }//GEN-LAST:event_button01ActionPerformed

    private void button02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button02ActionPerformed
        if (box[0][2] == true) {
            if (turn.equals(user1)) {
                button02.setIcon(new ImageIcon(getClass().getResource("/img/x.png")));
                winnerMatrix[0][2] = 1;
                turn = user2;
            } else {
                button02.setIcon(new ImageIcon(getClass().getResource("/img/circle.png")));
                winnerMatrix[0][2] = 2;
                turn = user1;
            }
            box[0][2] = false;
            checkWinner();
        }
    }//GEN-LAST:event_button02ActionPerformed

    private void button10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button10ActionPerformed
        if (box[1][0] == true) {
            if (turn.equals(user1)) {
                button10.setIcon(new ImageIcon(getClass().getResource("/img/x.png")));
                winnerMatrix[1][0] = 1;
                turn = user2;
            } else {
                button10.setIcon(new ImageIcon(getClass().getResource("/img/circle.png")));
                winnerMatrix[1][0] = 2;
                turn = user1;
            }
            box[1][0] = false;
            checkWinner();
        }
    }//GEN-LAST:event_button10ActionPerformed

    private void button11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button11ActionPerformed
        if (box[1][1] == true) {
            if (turn.equals(user1)) {
                button11.setIcon(new ImageIcon(getClass().getResource("/img/x.png")));
                winnerMatrix[1][1] = 1;
                turn = user2;
            } else {
                button11.setIcon(new ImageIcon(getClass().getResource("/img/circle.png")));
                winnerMatrix[1][1] = 2;
                turn = user1;
            }
            box[1][1] = false;
            checkWinner();
        }
    }//GEN-LAST:event_button11ActionPerformed

    private void button12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button12ActionPerformed
        if (box[1][2] == true) {
            if (turn.equals(user1)) {
                button12.setIcon(new ImageIcon(getClass().getResource("/img/x.png")));
                winnerMatrix[1][2] = 1;
                turn = user2;
            } else {
                button12.setIcon(new ImageIcon(getClass().getResource("/img/circle.png")));
                winnerMatrix[1][2] = 2;
                turn = user1;
            }
            box[1][2] = false;
            checkWinner();
        }
    }//GEN-LAST:event_button12ActionPerformed

    private void button20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button20ActionPerformed
        if (box[2][0] == true) {
            if (turn.equals(user1)) {
                button20.setIcon(new ImageIcon(getClass().getResource("/img/x.png")));
                winnerMatrix[2][0] = 1;
                turn = user2;
            } else {
                button20.setIcon(new ImageIcon(getClass().getResource("/img/circle.png")));
                winnerMatrix[2][0] = 2;
                turn = user1;
            }
            box[2][0] = false;
            checkWinner();
        }
    }//GEN-LAST:event_button20ActionPerformed

    private void button21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button21ActionPerformed
        if (box[2][1] == true) {
            if (turn.equals(user1)) {
                button21.setIcon(new ImageIcon(getClass().getResource("/img/x.png")));
                winnerMatrix[2][1] = 1;
                turn = user2;
            } else {
                button21.setIcon(new ImageIcon(getClass().getResource("/img/circle.png")));
                winnerMatrix[2][1] = 2;
                turn = user1;
            }
            box[2][1] = false;
            checkWinner();
        }
    }//GEN-LAST:event_button21ActionPerformed

    private void button22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button22ActionPerformed
        if (box[2][2] == true) {
            if (turn.equals(user1)) {
                button22.setIcon(new ImageIcon(getClass().getResource("/img/x.png")));
                winnerMatrix[2][2] = 1;
                turn = user2;
            } else {
                button22.setIcon(new ImageIcon(getClass().getResource("/img/circle.png")));
                winnerMatrix[2][2] = 2;
                turn = user1;
            }
            box[2][2] = false;
            checkWinner();
        }
    }//GEN-LAST:event_button22ActionPerformed

    private void showResultsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showResultsActionPerformed
        //When clicked
        Results results = new Results(this, true, user1, user2, user1Victories, user2Victories, ties);
        results.setVisible(true);
    }//GEN-LAST:event_showResultsActionPerformed

    private void startAgainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startAgainActionPerformed
        user1Victories = 0;
        user2Victories = 0;
        ties = 0;
        restartGame();
    }//GEN-LAST:event_startAgainActionPerformed
    
    /**
     * When clicked the user will be redirect to a web page that will 
       explain him how to play tic-tac-toe
     * @param evt 
     */
    private void helpMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_helpMenuMouseClicked
        try {
            Desktop.getDesktop().browse(new URI("https://www.wikihow.com/Play-Tic-Tac-Toe"));
        } catch (URISyntaxException ex) {
            //Logger.getLogger(GameFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            //Logger.getLogger(GameFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_helpMenuMouseClicked

    /**
     * Checks which user has won the match
     */
    private void checkWinner() {
        boolean winner1 = false;
        boolean winner2 = false;
        int tie = 0;
        
        winner1 = checkPossibleWinner(1);
        winner2 = checkPossibleWinner(2);

        if (winner1 == true) {
            WinnerFrame winnerf = new WinnerFrame(this, true, user1);
            winnerf.setVisible(true);
            user1Victories++;
            restartGame();
        } else if (winner2 == true) {
            WinnerFrame winnerf = new WinnerFrame(this, true, user2);
            winnerf.setVisible(true);
            user2Victories++;
            restartGame();
        } else { // checks if there is a tie
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (winnerMatrix[i][j] != 0){
                        tie++;
                    }
                }
            }
            
            if (tie == 9){
                tieFrame tief = new tieFrame(this, true);
                tief.setVisible(true);
                ties++;
                restartGame();
            } else{
                tie = 0;
            }
            
        }
    }

    /**
     * Checks if the user has a winner row
     *
     * @param num The number of the winnerMatrix. 1 --> user1, 2 --> user2
     * @return true if the user has a winner row, otherwise returns false
     */
    private boolean checkPossibleWinner(int num) {
        if (winnerMatrix[0][0] == num
                && winnerMatrix[0][1] == num
                && winnerMatrix[0][2] == num){
            return true;
        } else if (winnerMatrix[1][0] == num
                && winnerMatrix[1][1] == num
                && winnerMatrix[1][2] == num){
            return true;
        } else if (winnerMatrix[2][0] == num
                && winnerMatrix[2][1] == num
                && winnerMatrix[2][2] == num){
            return true;
        } else if (winnerMatrix[0][0] == num
                && winnerMatrix[1][0] == num
                && winnerMatrix[2][0] == num){
            return true;
        } else if (winnerMatrix[0][1] == num
                && winnerMatrix[1][1] == num
                && winnerMatrix[2][1] == num){
            return true;
        } else if (winnerMatrix[0][2] == num
                && winnerMatrix[1][2] == num
                && winnerMatrix[2][2] == num){
            return true;
        } else if (winnerMatrix[0][0] == num
                && winnerMatrix[1][1] == num
                && winnerMatrix[2][2] == num){
            return true;
        } else if (winnerMatrix[0][2] == num
                && winnerMatrix[1][1] == num
                && winnerMatrix[2][0] == num){
            return true;
        }
        return false;
    }
    
    private void restartGame(){
        // all the box matrix becomes true
        initializeBox();
        // all the winner matrix becomes 0 again
        initializeWinnerMatrix();
        // all the buttons' icons becomes null
        button00.setIcon(null);
        button01.setIcon(null);
        button02.setIcon(null);
        button10.setIcon(null);
        button11.setIcon(null);
        button12.setIcon(null);
        button20.setIcon(null);
        button21.setIcon(null);
        button22.setIcon(null);
        
        // Asks the user who will play first
        whoPlayFirst();
    }
    
    /**
     * Method that shows a JDialog asking who is going to be next user to play
     */
    private void whoPlayFirst(){
        ChooseTurn chooseTurn = new ChooseTurn(this, true, user1, user2);
        chooseTurn.setVisible(true);
        turn = chooseTurn.getTurn();
    }
    
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
            java.util.logging.Logger.getLogger(GameFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GameFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GameFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GameFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GameFrame(null, null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button00;
    private javax.swing.JButton button01;
    private javax.swing.JButton button02;
    private javax.swing.JButton button10;
    private javax.swing.JButton button11;
    private javax.swing.JButton button12;
    private javax.swing.JButton button20;
    private javax.swing.JButton button21;
    private javax.swing.JButton button22;
    private javax.swing.JMenuItem exit;
    private javax.swing.JMenu gameMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JPanel panel;
    private javax.swing.JMenuItem showResults;
    private javax.swing.JMenuItem startAgain;
    // End of variables declaration//GEN-END:variables
}
