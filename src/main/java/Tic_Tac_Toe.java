
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author linux
 */
public class Tic_Tac_Toe extends javax.swing.JFrame {
    
    private String startGame = "X";
    private int xCount = 0;
    private int oCount = 0;
    private int oStart = 0;
    private int xStart = 0;

    /**
     * Creates new form Tic_Tac_Toe
     */
    public Tic_Tac_Toe() {
        initComponents();
    }
    
    private void gameScore()
    {
        playerxx.setText(String.valueOf(xCount));
        playeroo.setText(String.valueOf(oCount));
    }
    
    private void choosePlayer()
    {
        if(startGame.equalsIgnoreCase("X"))
        {
            startGame = "O";
            oStart++;
        }
        else
        {
            startGame = "X";
            xStart++;
        }
    }
    
    
    
    
    private void WinningGame()
    {
        String b1 = txtbtn1.getText();
        String b2 = txtbtn2.getText();
        String b3 = txtbtn3.getText();
        
        String b4 = txtbtn4.getText();
        String b5 = txtbtn5.getText();
        String b6 = txtbtn6.getText();
        
        String b7 = txtbtn7.getText();
        String b8 = txtbtn8.getText();
        String b9 = txtbtn9.getText();
        
        if(b1 == ("X") && b2 == ("X") && b3 == ("X"))
        {
            JOptionPane.showMessageDialog(this, "Player X Win","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            
            txtbtn1.setBackground(Color.orange);
            txtbtn2.setBackground(Color.orange);
            txtbtn3.setBackground(Color.orange);
        }
        
         if(b4 == ("X") && b5 == ("X") && b6 == ("X"))
        {
            JOptionPane.showMessageDialog(this, "Player X Win","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            
            txtbtn4.setBackground(Color.orange);
            txtbtn5.setBackground(Color.orange);
            txtbtn6.setBackground(Color.orange);
        }
         
         if(b7 == ("X") && b8 == ("X") && b9 == ("X"))
        {
            JOptionPane.showMessageDialog(this, "Player X Win","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            
            txtbtn7.setBackground(Color.orange);
            txtbtn8.setBackground(Color.orange);
            txtbtn9.setBackground(Color.orange);
        }
         
         if(b1 == ("X") && b5 == ("X") && b9 == ("X"))
        {
            JOptionPane.showMessageDialog(this, "Player X Win","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            
            txtbtn1.setBackground(Color.orange);
            txtbtn5.setBackground(Color.orange);
            txtbtn9.setBackground(Color.orange);
        }
         
         if(b3 == ("X") && b5 == ("X") && b7 == ("X"))
        {
            JOptionPane.showMessageDialog(this, "Player X Win","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            
            txtbtn3.setBackground(Color.orange);
            txtbtn5.setBackground(Color.orange);
            txtbtn7.setBackground(Color.orange);
        }
         
         if(b1 == ("X") && b4 == ("X") && b7 == ("X"))
        {
            JOptionPane.showMessageDialog(this, "Player X Win","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            
            txtbtn1.setBackground(Color.orange);
            txtbtn4.setBackground(Color.orange);
            txtbtn7.setBackground(Color.orange);
        }
         
         if(b2 == ("X") && b5 == ("X") && b8 == ("X"))
        {
            JOptionPane.showMessageDialog(this, "Player X Win","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            
            txtbtn2.setBackground(Color.orange);
            txtbtn5.setBackground(Color.orange);
            txtbtn8.setBackground(Color.orange);
        }
         
          if(b3 == ("X") && b6 == ("X") && b9 == ("X"))
        {
            JOptionPane.showMessageDialog(this, "Player X Win","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            
            txtbtn3.setBackground(Color.orange);
            txtbtn6.setBackground(Color.orange);
            txtbtn9.setBackground(Color.orange);
        }
          
        
          
          
          
        
          
          
          
          
          
          
          
          if(b1 == ("O") && b2 == ("O") && b3 == ("O"))
        {
            JOptionPane.showMessageDialog(this, "Player O Win","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            
            txtbtn1.setBackground(Color.orange);
            txtbtn2.setBackground(Color.orange);
            txtbtn3.setBackground(Color.orange);
        }
        
         if(b4 == ("O") && b5 == ("O") && b6 == ("O"))
        {
            JOptionPane.showMessageDialog(this, "Player O Win","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            
            txtbtn4.setBackground(Color.orange);
            txtbtn5.setBackground(Color.orange);
            txtbtn6.setBackground(Color.orange);
        }
         
         if(b7 == ("O") && b8 == ("O") && b9 == ("O"))
        {
            JOptionPane.showMessageDialog(this, "Player O Win","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            
            txtbtn7.setBackground(Color.orange);
            txtbtn8.setBackground(Color.orange);
            txtbtn9.setBackground(Color.orange);
        }
         
         if(b1 == ("O") && b5 == ("O") && b9 == ("O"))
        {
            JOptionPane.showMessageDialog(this, "Player O Win","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            
            txtbtn1.setBackground(Color.orange);
            txtbtn5.setBackground(Color.orange);
            txtbtn9.setBackground(Color.orange);
        }
         
         if(b3 == ("O") && b5 == ("O") && b7 == ("O"))
        {
            JOptionPane.showMessageDialog(this, "Player O Win","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            
            txtbtn3.setBackground(Color.orange);
            txtbtn5.setBackground(Color.orange);
            txtbtn7.setBackground(Color.orange);
        }
         
         if(b1 == ("O") && b4 == ("O") && b7 == ("O"))
        {
            JOptionPane.showMessageDialog(this, "Player O Win","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            
            txtbtn1.setBackground(Color.orange);
            txtbtn4.setBackground(Color.orange);
            txtbtn7.setBackground(Color.orange);
        }
         
         if(b2 == ("O") && b5 == ("O") && b8 == ("O"))
        {
            JOptionPane.showMessageDialog(this, "Player O Win","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            
            txtbtn2.setBackground(Color.orange);
            txtbtn5.setBackground(Color.orange);
            txtbtn8.setBackground(Color.orange);
        }
         
          if(b3 == ("O") && b6 == ("O") && b9 == ("O"))
        {
            JOptionPane.showMessageDialog(this, "Player O Win","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            
            txtbtn3.setBackground(Color.orange);
            txtbtn6.setBackground(Color.orange);
            txtbtn9.setBackground(Color.orange);
        }
          
        if (xStart>4 && oStart==4){
        JOptionPane.showMessageDialog(this, "Tie","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
        
        }
        
        if (oStart>4 && xStart==4){
        JOptionPane.showMessageDialog(this, "Tie","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
        
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

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtbtn2 = new javax.swing.JButton();
        txtbtn3 = new javax.swing.JButton();
        txtbtn1 = new javax.swing.JButton();
        txtbtn4 = new javax.swing.JButton();
        txtbtn5 = new javax.swing.JButton();
        txtbtn6 = new javax.swing.JButton();
        txtbtn8 = new javax.swing.JButton();
        txtbtn9 = new javax.swing.JButton();
        txtbtn7 = new javax.swing.JButton();
        txtexit = new javax.swing.JButton();
        txtreset = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        playero = new javax.swing.JLabel();
        playerx = new javax.swing.JLabel();
        playeroo = new javax.swing.JLabel();
        playerxx = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(15, 41, 229));
        jPanel1.setForeground(new java.awt.Color(30, 23, 247));

        jLabel1.setFont(new java.awt.Font("URW Gothic", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(217, 245, 20));
        jLabel1.setText("TIC TAC TOE");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        txtbtn2.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        txtbtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn2ActionPerformed(evt);
            }
        });

        txtbtn3.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        txtbtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn3ActionPerformed(evt);
            }
        });

        txtbtn1.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        txtbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn1ActionPerformed(evt);
            }
        });

        txtbtn4.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        txtbtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn4ActionPerformed(evt);
            }
        });

        txtbtn5.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        txtbtn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn5ActionPerformed(evt);
            }
        });

        txtbtn6.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        txtbtn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn6ActionPerformed(evt);
            }
        });

        txtbtn8.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        txtbtn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn8ActionPerformed(evt);
            }
        });

        txtbtn9.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        txtbtn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn9ActionPerformed(evt);
            }
        });

        txtbtn7.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        txtbtn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn7ActionPerformed(evt);
            }
        });

        txtexit.setBackground(new java.awt.Color(209, 46, 46));
        txtexit.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        txtexit.setText("Exit");
        txtexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtexitActionPerformed(evt);
            }
        });

        txtreset.setBackground(new java.awt.Color(11, 19, 239));
        txtreset.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        txtreset.setText("Reset");
        txtreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtresetActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        playero.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        playero.setForeground(new java.awt.Color(1, 1, 1));
        playero.setText("Player 2 :");

        playerx.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        playerx.setForeground(new java.awt.Color(1, 1, 1));
        playerx.setText("Player 1 :");

        playeroo.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        playeroo.setForeground(new java.awt.Color(0, 29, 255));
        playeroo.setText("0");

        playerxx.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        playerxx.setForeground(new java.awt.Color(0, 29, 255));
        playerxx.setText("0");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(playero)
                    .addComponent(playerx))
                .addGap(61, 61, 61)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(playeroo)
                    .addComponent(playerxx))
                .addContainerGap(106, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(playerx)
                    .addComponent(playerxx))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(playero)
                    .addComponent(playeroo))
                .addGap(71, 71, 71))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtbtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtbtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtbtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(txtbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(txtbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(txtbtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(txtbtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(txtbtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(txtbtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtreset, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(176, 176, 176)
                        .addComponent(txtexit, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtreset, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtexit, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtbtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtbtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 10, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtbtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn2ActionPerformed
        // TODO add your handling code here:
        
        txtbtn2.setText(startGame);
        if(startGame.equalsIgnoreCase("X"))
        {
            txtbtn2.setForeground(Color.red);
        }
        else
        {
            txtbtn2.setForeground(Color.blue);
        }
        
        choosePlayer();
        WinningGame();
        
    }//GEN-LAST:event_txtbtn2ActionPerformed

    private void txtbtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn3ActionPerformed
        // TODO add your handling code here:
        
        txtbtn3.setText(startGame);
        if(startGame.equalsIgnoreCase("X"))
        {
            txtbtn3.setForeground(Color.red);
        }
        else
        {
            txtbtn3.setForeground(Color.blue);
        }
        
        choosePlayer();
        WinningGame();
        
    }//GEN-LAST:event_txtbtn3ActionPerformed

    private void txtbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn1ActionPerformed
        // TODO add your handling code here:
        
        txtbtn1.setText(startGame);
        if(startGame.equalsIgnoreCase("X"))
        {
            txtbtn1.setForeground(Color.red);
        }
        else
        {
            txtbtn1.setForeground(Color.blue);
        }
        
        choosePlayer();
        WinningGame();
        
    }//GEN-LAST:event_txtbtn1ActionPerformed

    private void txtbtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn4ActionPerformed
        // TODO add your handling code here:
        
        txtbtn4.setText(startGame);
        if(startGame.equalsIgnoreCase("X"))
        {
            txtbtn4.setForeground(Color.red);
        }
        else
        {
            txtbtn4.setForeground(Color.blue);
        }
        
        choosePlayer();
        WinningGame();
        
    }//GEN-LAST:event_txtbtn4ActionPerformed

    private void txtbtn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn5ActionPerformed
        // TODO add your handling code here:
        
        txtbtn5.setText(startGame);
        if(startGame.equalsIgnoreCase("X"))
        {
            txtbtn5.setForeground(Color.red);
        }
        else
        {
            txtbtn5.setForeground(Color.blue);
        }
        
        choosePlayer();
        WinningGame();
        
    }//GEN-LAST:event_txtbtn5ActionPerformed

    private void txtbtn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn6ActionPerformed
        // TODO add your handling code here:
        
        txtbtn6.setText(startGame);
        if(startGame.equalsIgnoreCase("X"))
        {
            txtbtn6.setForeground(Color.red);
        }
        else
        {
            txtbtn6.setForeground(Color.blue);
        }
        
        choosePlayer();
        WinningGame();
        
    }//GEN-LAST:event_txtbtn6ActionPerformed

    private void txtbtn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn8ActionPerformed
        // TODO add your handling code here:
        
        txtbtn8.setText(startGame);
        if(startGame.equalsIgnoreCase("X"))
        {
            txtbtn8.setForeground(Color.red);
        }
        else
        {
            txtbtn8.setForeground(Color.blue);
        }
        
        choosePlayer();
        WinningGame();
        
    }//GEN-LAST:event_txtbtn8ActionPerformed

    private void txtbtn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn9ActionPerformed
        // TODO add your handling code here:
        
        txtbtn9.setText(startGame);
        if(startGame.equalsIgnoreCase("X"))
        {
            txtbtn9.setForeground(Color.red);
        }
        else
        {
            txtbtn9.setForeground(Color.blue);
        }
        
        choosePlayer();
        WinningGame();
        
    }//GEN-LAST:event_txtbtn9ActionPerformed

    private void txtbtn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn7ActionPerformed
        // TODO add your handling code here:
        
        txtbtn7.setText(startGame);
        if(startGame.equalsIgnoreCase("X"))
        {
            txtbtn7.setForeground(Color.red);
        }
        else
        {
            txtbtn7.setForeground(Color.blue);
        }
        
        choosePlayer();
        WinningGame();
        
    }//GEN-LAST:event_txtbtn7ActionPerformed

    private void txtexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtexitActionPerformed
        // TODO add your handling code here:
        
        JFrame frame = new JFrame("Exit");
        if(JOptionPane.showConfirmDialog(frame,"Confirm if you want to exit","Tic_Tac_Toe",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION)
        {
            System.exit(0);
        }
        
        
    }//GEN-LAST:event_txtexitActionPerformed

    private void txtresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtresetActionPerformed
        // TODO add your handling code here:
        
        txtbtn1.setText(null);
        txtbtn1.setBackground(null);
        txtbtn2.setText(null);
        txtbtn2.setBackground(null);
        txtbtn3.setText(null);
        txtbtn3.setBackground(null);
        
        txtbtn4.setText(null);
        txtbtn4.setBackground(null);
        txtbtn5.setText(null);
        txtbtn5.setBackground(null);
        txtbtn6.setText(null);
        txtbtn6.setBackground(null);
        
        txtbtn7.setText(null);
        txtbtn7.setBackground(null);
        txtbtn8.setText(null);
        txtbtn8.setBackground(null);
        txtbtn9.setText(null);
        txtbtn9.setBackground(null);
                
        
    }//GEN-LAST:event_txtresetActionPerformed

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
            java.util.logging.Logger.getLogger(Tic_Tac_Toe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tic_Tac_Toe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tic_Tac_Toe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tic_Tac_Toe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tic_Tac_Toe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel playero;
    private javax.swing.JLabel playeroo;
    private javax.swing.JLabel playerx;
    private javax.swing.JLabel playerxx;
    private javax.swing.JButton txtbtn1;
    private javax.swing.JButton txtbtn2;
    private javax.swing.JButton txtbtn3;
    private javax.swing.JButton txtbtn4;
    private javax.swing.JButton txtbtn5;
    private javax.swing.JButton txtbtn6;
    private javax.swing.JButton txtbtn7;
    private javax.swing.JButton txtbtn8;
    private javax.swing.JButton txtbtn9;
    private javax.swing.JButton txtexit;
    private javax.swing.JButton txtreset;
    // End of variables declaration//GEN-END:variables
}
