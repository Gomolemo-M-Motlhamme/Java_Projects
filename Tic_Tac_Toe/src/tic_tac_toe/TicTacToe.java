/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tic_tac_toe;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author gomim
 */
public class TicTacToe extends javax.swing.JFrame {
    
    String startGame = "X";
    int xcount = 0;
    int ocount = 0;
    
    /**
     * Creates new form TicTacToe
     */
    public TicTacToe() {
        initComponents();
        JOptionPane.showMessageDialog(null, "Welcome to TIC TAC TOE" + "\n" + "made by Gomolmeo" + "\n" + "First to 3 points wins it all");
    }
    
    private void TIC_TOE_TOE_GAMEPLAY() //keeps track of our score and ends game
    {
        PlayerX_score.setText(String.valueOf(xcount));
        PlayerY_score.setText(String.valueOf(ocount));
        
        if (xcount == 3) 
            {
                JOptionPane.showMessageDialog(null,"WINNER WINNER" + "\n" + "CHICKEN DINNER" + "\n" + "Player X wins it all");
                System.exit(0);
            }

        else if(ocount == 3)
        {
            JOptionPane.showMessageDialog(null,"WINNER WINNER" + "\n" + "CHICKEN DINNER" + "\n" + "Player O wins it all");
            System.exit(0);
        }
    }
    
    private void choose_a_Player() //picks wheather it's player X or O  turn
    {
        if(startGame.equalsIgnoreCase("X"))
        {
            startGame = "O";
            playerOLabel.setForeground(Color.blue);
            playerXLabel.setForeground(Color.black);
        }
        else
        {
            startGame = "X";
            playerXLabel.setForeground(Color.blue);
            playerOLabel.setForeground(Color.black);
        }
    }
    
    private void winningGame() //checks for a winner
    {
        String b1 = Btn1.getText();
        String b2 = Btn2.getText();
        String b3 = Btn3.getText();
        
        String b4 = Btn4.getText();
        String b5 = Btn5.getText();
        String b6 = Btn6.getText();
        
        String b7 = Btn7.getText();
        String b8 = Btn8.getText();
        String b9 = Btn9.getText();
        
        String scoreCheck = PlayerX_score.getText();
        
        //For Player x
        if("X".equals(b1) && "X".equals(b2) && "X".equals(b3))
        {
            xcount++;
            TIC_TOE_TOE_GAMEPLAY();
            
            Btn1.setBackground(Color.orange);
            Btn2.setBackground(Color.orange);
            Btn3.setBackground(Color.orange);
            
            JOptionPane.showMessageDialog(null, "Player X wins");
            
            Btn1.setBackground(Color.white);
            Btn2.setBackground(Color.white);
            Btn3.setBackground(Color.white);
            
            Btn1.setText(null);
            Btn2.setText(null);
            Btn3.setText(null);
            Btn4.setText(null);
            Btn5.setText(null);
            Btn6.setText(null);
            Btn7.setText(null);
            Btn8.setText(null);
            Btn9.setText(null);
            
            Btn1.setEnabled(true);
            Btn2.setEnabled(true);
            Btn3.setEnabled(true);
            Btn4.setEnabled(true);
            Btn5.setEnabled(true);
            Btn6.setEnabled(true);
            Btn7.setEnabled(true);
            Btn8.setEnabled(true);
            Btn9.setEnabled(true);
        }
        
        if("X".equals(b4) && "X".equals(b5) && "X".equals(b6))
        {
            xcount++;
            TIC_TOE_TOE_GAMEPLAY();
            
            Btn4.setBackground(Color.orange);
            Btn5.setBackground(Color.orange);
            Btn6.setBackground(Color.orange);
            
            JOptionPane.showMessageDialog(null, "Player X wins");
            
            Btn4.setBackground(Color.white);
            Btn5.setBackground(Color.white);
            Btn6.setBackground(Color.white);
            
            Btn1.setText(null);
            Btn2.setText(null);
            Btn3.setText(null);
            Btn4.setText(null);
            Btn5.setText(null);
            Btn6.setText(null);
            Btn7.setText(null);
            Btn8.setText(null);
            Btn9.setText(null);
            
            Btn1.setEnabled(true);
            Btn2.setEnabled(true);
            Btn3.setEnabled(true);
            Btn4.setEnabled(true);
            Btn5.setEnabled(true);
            Btn6.setEnabled(true);
            Btn7.setEnabled(true);
            Btn8.setEnabled(true);
            Btn9.setEnabled(true);
        }
        
        if("X".equals(b7) && "X".equals(b8) && "X".equals(b9))
        {
            xcount++;
            TIC_TOE_TOE_GAMEPLAY();
            
            Btn7.setBackground(Color.orange);
            Btn8.setBackground(Color.orange);
            Btn9.setBackground(Color.orange);
            
            JOptionPane.showMessageDialog(null, "Player X wins");
            
            Btn7.setBackground(Color.white);
            Btn8.setBackground(Color.white);
            Btn9.setBackground(Color.white);
            
            Btn1.setText(null);
            Btn2.setText(null);
            Btn3.setText(null);
            Btn4.setText(null);
            Btn5.setText(null);
            Btn6.setText(null);
            Btn7.setText(null);
            Btn8.setText(null);
            Btn9.setText(null);
            
            Btn1.setEnabled(true);
            Btn2.setEnabled(true);
            Btn3.setEnabled(true);
            Btn4.setEnabled(true);
            Btn5.setEnabled(true);
            Btn6.setEnabled(true);
            Btn7.setEnabled(true);
            Btn8.setEnabled(true);
            Btn9.setEnabled(true);
        }
        
        if("X".equals(b1) && "X".equals(b4) && "X".equals(b7))
        {
            xcount++;
            TIC_TOE_TOE_GAMEPLAY();
            
            Btn1.setBackground(Color.orange);
            Btn4.setBackground(Color.orange);
            Btn7.setBackground(Color.orange);
            
            JOptionPane.showMessageDialog(null, "Player X wins");
            
            Btn1.setBackground(Color.white);
            Btn4.setBackground(Color.white);
            Btn7.setBackground(Color.white);
            
            Btn1.setText(null);
            Btn2.setText(null);
            Btn3.setText(null);
            Btn4.setText(null);
            Btn5.setText(null);
            Btn6.setText(null);
            Btn7.setText(null);
            Btn8.setText(null);
            Btn9.setText(null);
            
            Btn1.setEnabled(true);
            Btn2.setEnabled(true);
            Btn3.setEnabled(true);
            Btn4.setEnabled(true);
            Btn5.setEnabled(true);
            Btn6.setEnabled(true);
            Btn7.setEnabled(true);
            Btn8.setEnabled(true);
            Btn9.setEnabled(true);
        }
        
        if("X".equals(b2) && "X".equals(b5) && "X".equals(b8))
        {
            xcount++;
            TIC_TOE_TOE_GAMEPLAY();
            
            Btn2.setBackground(Color.orange);
            Btn5.setBackground(Color.orange);
            Btn8.setBackground(Color.orange);
            
            JOptionPane.showMessageDialog(null, "Player X wins");
            
            Btn2.setBackground(Color.white);
            Btn5.setBackground(Color.white);
            Btn8.setBackground(Color.white);
            
            Btn1.setText(null);
            Btn2.setText(null);
            Btn3.setText(null);
            Btn4.setText(null);
            Btn5.setText(null);
            Btn6.setText(null);
            Btn7.setText(null);
            Btn8.setText(null);
            Btn9.setText(null);
            
            Btn1.setEnabled(true);
            Btn2.setEnabled(true);
            Btn3.setEnabled(true);
            Btn4.setEnabled(true);
            Btn5.setEnabled(true);
            Btn6.setEnabled(true);
            Btn7.setEnabled(true);
            Btn8.setEnabled(true);
            Btn9.setEnabled(true);
        }
        
        if("X".equals(b3) && "X".equals(b6) && "X".equals(b9))
        {
            xcount++;
            TIC_TOE_TOE_GAMEPLAY();
            
            Btn3.setBackground(Color.orange);
            Btn6.setBackground(Color.orange);
            Btn9.setBackground(Color.orange);
            
            JOptionPane.showMessageDialog(null, "Player X wins");
            
            Btn3.setBackground(Color.white);
            Btn6.setBackground(Color.white);
            Btn9.setBackground(Color.white);
            
            Btn1.setText(null);
            Btn2.setText(null);
            Btn3.setText(null);
            Btn4.setText(null);
            Btn5.setText(null);
            Btn6.setText(null);
            Btn7.setText(null);
            Btn8.setText(null);
            Btn9.setText(null);
            
            Btn1.setEnabled(true);
            Btn2.setEnabled(true);
            Btn3.setEnabled(true);
            Btn4.setEnabled(true);
            Btn5.setEnabled(true);
            Btn6.setEnabled(true);
            Btn7.setEnabled(true);
            Btn8.setEnabled(true);
            Btn9.setEnabled(true);
        }
        
        if("X".equals(b1) && "X".equals(b5) && "X".equals(b9))
        {
            xcount++;
            TIC_TOE_TOE_GAMEPLAY();
            
            Btn1.setBackground(Color.orange);
            Btn5.setBackground(Color.orange);
            Btn9.setBackground(Color.orange);
            
            JOptionPane.showMessageDialog(null, "Player X wins");
            
            Btn1.setBackground(Color.white);
            Btn5.setBackground(Color.white);
            Btn9.setBackground(Color.white);
            
            Btn1.setText(null);
            Btn2.setText(null);
            Btn3.setText(null);
            Btn4.setText(null);
            Btn5.setText(null);
            Btn6.setText(null);
            Btn7.setText(null);
            Btn8.setText(null);
            Btn9.setText(null);
            
            Btn1.setEnabled(true);
            Btn2.setEnabled(true);
            Btn3.setEnabled(true);
            Btn4.setEnabled(true);
            Btn5.setEnabled(true);
            Btn6.setEnabled(true);
            Btn7.setEnabled(true);
            Btn8.setEnabled(true);
            Btn9.setEnabled(true);
        }
        
        if("X".equals(b3) && "X".equals(b5) && "X".equals(b7))
        {
            xcount++;
            TIC_TOE_TOE_GAMEPLAY();
            
            Btn3.setBackground(Color.orange);
            Btn5.setBackground(Color.orange);
            Btn7.setBackground(Color.orange);
            
            JOptionPane.showMessageDialog(null, "Player X wins");
            
            Btn3.setBackground(Color.white);
            Btn5.setBackground(Color.white);
            Btn7.setBackground(Color.white);
            
            Btn1.setText(null);
            Btn2.setText(null);
            Btn3.setText(null);
            Btn4.setText(null);
            Btn5.setText(null);
            Btn6.setText(null);
            Btn7.setText(null);
            Btn8.setText(null);
            Btn9.setText(null);
            
            Btn1.setEnabled(true);
            Btn2.setEnabled(true);
            Btn3.setEnabled(true);
            Btn4.setEnabled(true);
            Btn5.setEnabled(true);
            Btn6.setEnabled(true);
            Btn7.setEnabled(true);
            Btn8.setEnabled(true);
            Btn9.setEnabled(true);
        }
//===========================================================================//
//===========================================================================//       
        //For Player o
        if("O".equals(b1) && "O".equals(b2) && "O".equals(b3))
        {
            ocount++;
            TIC_TOE_TOE_GAMEPLAY();
            
            Btn1.setBackground(Color.orange);
            Btn2.setBackground(Color.orange);
            Btn3.setBackground(Color.orange);
            
            JOptionPane.showMessageDialog(null, "Player O wins");
            
            Btn1.setBackground(Color.white);
            Btn2.setBackground(Color.white);
            Btn3.setBackground(Color.white);
            
            Btn1.setText(null);
            Btn2.setText(null);
            Btn3.setText(null);
            Btn4.setText(null);
            Btn5.setText(null);
            Btn6.setText(null);
            Btn7.setText(null);
            Btn8.setText(null);
            Btn9.setText(null);
            
            Btn1.setEnabled(true);
            Btn2.setEnabled(true);
            Btn3.setEnabled(true);
            Btn4.setEnabled(true);
            Btn5.setEnabled(true);
            Btn6.setEnabled(true);
            Btn7.setEnabled(true);
            Btn8.setEnabled(true);
            Btn9.setEnabled(true);
        }
        
        if("O".equals(b4) && "O".equals(b5) && "O".equals(b6))
        {
            ocount++;
            TIC_TOE_TOE_GAMEPLAY();
            
            Btn4.setBackground(Color.orange);
            Btn5.setBackground(Color.orange);
            Btn6.setBackground(Color.orange);
            
            JOptionPane.showMessageDialog(null, "Player O wins");
            
            Btn4.setBackground(Color.white);
            Btn5.setBackground(Color.white);
            Btn6.setBackground(Color.white);
            
            Btn1.setText(null);
            Btn2.setText(null);
            Btn3.setText(null);
            Btn4.setText(null);
            Btn5.setText(null);
            Btn6.setText(null);
            Btn7.setText(null);
            Btn8.setText(null);
            Btn9.setText(null);
            
            Btn1.setEnabled(true);
            Btn2.setEnabled(true);
            Btn3.setEnabled(true);
            Btn4.setEnabled(true);
            Btn5.setEnabled(true);
            Btn6.setEnabled(true);
            Btn7.setEnabled(true);
            Btn8.setEnabled(true);
            Btn9.setEnabled(true);
        }
        
        if("O".equals(b7) && "O".equals(b8) && "O".equals(b9))
        {
            ocount++;
            TIC_TOE_TOE_GAMEPLAY();
            
            Btn7.setBackground(Color.orange);
            Btn8.setBackground(Color.orange);
            Btn9.setBackground(Color.orange);
            
            JOptionPane.showMessageDialog(null, "Player O wins");
            
            Btn7.setBackground(Color.white);
            Btn8.setBackground(Color.white);
            Btn9.setBackground(Color.white);
            
            Btn1.setText(null);
            Btn2.setText(null);
            Btn3.setText(null);
            Btn4.setText(null);
            Btn5.setText(null);
            Btn6.setText(null);
            Btn7.setText(null);
            Btn8.setText(null);
            Btn9.setText(null);
            
            Btn1.setEnabled(true);
            Btn2.setEnabled(true);
            Btn3.setEnabled(true);
            Btn4.setEnabled(true);
            Btn5.setEnabled(true);
            Btn6.setEnabled(true);
            Btn7.setEnabled(true);
            Btn8.setEnabled(true);
            Btn9.setEnabled(true);
        }
        
        if("O".equals(b1) && "O".equals(b4) && "O".equals(b7))
        {
            ocount++;
            TIC_TOE_TOE_GAMEPLAY();
            
            Btn1.setBackground(Color.orange);
            Btn4.setBackground(Color.orange);
            Btn7.setBackground(Color.orange);
            
            JOptionPane.showMessageDialog(null, "Player O wins");
            
            Btn1.setBackground(Color.white);
            Btn4.setBackground(Color.white);
            Btn7.setBackground(Color.white);
            
            Btn1.setText(null);
            Btn2.setText(null);
            Btn3.setText(null);
            Btn4.setText(null);
            Btn5.setText(null);
            Btn6.setText(null);
            Btn7.setText(null);
            Btn8.setText(null);
            Btn9.setText(null);
            
            Btn1.setEnabled(true);
            Btn2.setEnabled(true);
            Btn3.setEnabled(true);
            Btn4.setEnabled(true);
            Btn5.setEnabled(true);
            Btn6.setEnabled(true);
            Btn7.setEnabled(true);
            Btn8.setEnabled(true);
            Btn9.setEnabled(true);
        }
        
        if("O".equals(b2) && "O".equals(b5) && "O".equals(b8))
        {
            ocount++;
            TIC_TOE_TOE_GAMEPLAY();
            
            Btn2.setBackground(Color.orange);
            Btn5.setBackground(Color.orange);
            Btn8.setBackground(Color.orange);
            
            JOptionPane.showMessageDialog(null, "Player O wins");
            
            Btn2.setBackground(Color.white);
            Btn5.setBackground(Color.white);
            Btn8.setBackground(Color.white);
            
            Btn1.setText(null);
            Btn2.setText(null);
            Btn3.setText(null);
            Btn4.setText(null);
            Btn5.setText(null);
            Btn6.setText(null);
            Btn7.setText(null);
            Btn8.setText(null);
            Btn9.setText(null);
            
            Btn1.setEnabled(true);
            Btn2.setEnabled(true);
            Btn3.setEnabled(true);
            Btn4.setEnabled(true);
            Btn5.setEnabled(true);
            Btn6.setEnabled(true);
            Btn7.setEnabled(true);
            Btn8.setEnabled(true);
            Btn9.setEnabled(true);
        }
        
        if("O".equals(b3) && "O".equals(b6) && "O".equals(b9))
        {
            ocount++;
            TIC_TOE_TOE_GAMEPLAY();
            
            Btn3.setBackground(Color.orange);
            Btn6.setBackground(Color.orange);
            Btn9.setBackground(Color.orange);
            
            JOptionPane.showMessageDialog(null, "Player O wins");
            
            Btn3.setBackground(Color.white);
            Btn6.setBackground(Color.white);
            Btn9.setBackground(Color.white);
            
            Btn1.setText(null);
            Btn2.setText(null);
            Btn3.setText(null);
            Btn4.setText(null);
            Btn5.setText(null);
            Btn6.setText(null);
            Btn7.setText(null);
            Btn8.setText(null);
            Btn9.setText(null);
            
            Btn1.setEnabled(true);
            Btn2.setEnabled(true);
            Btn3.setEnabled(true);
            Btn4.setEnabled(true);
            Btn5.setEnabled(true);
            Btn6.setEnabled(true);
            Btn7.setEnabled(true);
            Btn8.setEnabled(true);
            Btn9.setEnabled(true);
        }
        
        if("O".equals(b1) && "O".equals(b5) && "O".equals(b9))
        {
            ocount++;
            TIC_TOE_TOE_GAMEPLAY();
            
            Btn1.setBackground(Color.orange);
            Btn5.setBackground(Color.orange);
            Btn9.setBackground(Color.orange);
            
            JOptionPane.showMessageDialog(null, "Player O wins");
            
            Btn1.setBackground(Color.white);
            Btn5.setBackground(Color.white);
            Btn9.setBackground(Color.white);
            
            Btn1.setText(null);
            Btn2.setText(null);
            Btn3.setText(null);
            Btn4.setText(null);
            Btn5.setText(null);
            Btn6.setText(null);
            Btn7.setText(null);
            Btn8.setText(null);
            Btn9.setText(null);
            
            Btn1.setEnabled(true);
            Btn2.setEnabled(true);
            Btn3.setEnabled(true);
            Btn4.setEnabled(true);
            Btn5.setEnabled(true);
            Btn6.setEnabled(true);
            Btn7.setEnabled(true);
            Btn8.setEnabled(true);
            Btn9.setEnabled(true);
        }
        
        if("O".equals(b3) && "O".equals(b5) && "O".equals(b7))
        {
            ocount++;
            TIC_TOE_TOE_GAMEPLAY();
            
            Btn3.setBackground(Color.orange);
            Btn5.setBackground(Color.orange);
            Btn7.setBackground(Color.orange);
            
            JOptionPane.showMessageDialog(null, "Player O wins");
            
            Btn3.setBackground(Color.white);
            Btn5.setBackground(Color.white);
            Btn7.setBackground(Color.white);
            
            Btn1.setText(null);
            Btn2.setText(null);
            Btn3.setText(null);
            Btn4.setText(null);
            Btn5.setText(null);
            Btn6.setText(null);
            Btn7.setText(null);
            Btn8.setText(null);
            Btn9.setText(null);
            
            Btn1.setEnabled(true);
            Btn2.setEnabled(true);
            Btn3.setEnabled(true);
            Btn4.setEnabled(true);
            Btn5.setEnabled(true);
            Btn6.setEnabled(true);
            Btn7.setEnabled(true);
            Btn8.setEnabled(true);
            Btn9.setEnabled(true);
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Btn1 = new javax.swing.JButton();
        Btn7 = new javax.swing.JButton();
        Btn5 = new javax.swing.JButton();
        Btn2 = new javax.swing.JButton();
        Btn3 = new javax.swing.JButton();
        Btn4 = new javax.swing.JButton();
        Btn8 = new javax.swing.JButton();
        Btn9 = new javax.swing.JButton();
        Btn6 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        playerXLabel = new javax.swing.JLabel();
        playerOLabel = new javax.swing.JLabel();
        PlayerX_score = new javax.swing.JLabel();
        PlayerY_score = new javax.swing.JLabel();
        restBtn = new javax.swing.JButton();
        exitBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TIC TAC TOE(X & O)");
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Tic Tac Toe");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                .addContainerGap())
        );

        Btn1.setBackground(new java.awt.Color(255, 255, 255));
        Btn1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Btn1.setPreferredSize(new java.awt.Dimension(120, 120));
        Btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn1ActionPerformed(evt);
            }
        });

        Btn7.setBackground(new java.awt.Color(255, 255, 255));
        Btn7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Btn7.setPreferredSize(new java.awt.Dimension(120, 120));
        Btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn7ActionPerformed(evt);
            }
        });

        Btn5.setBackground(new java.awt.Color(255, 255, 255));
        Btn5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Btn5.setPreferredSize(new java.awt.Dimension(120, 120));
        Btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn5ActionPerformed(evt);
            }
        });

        Btn2.setBackground(new java.awt.Color(255, 255, 255));
        Btn2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Btn2.setPreferredSize(new java.awt.Dimension(120, 120));
        Btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn2ActionPerformed(evt);
            }
        });

        Btn3.setBackground(new java.awt.Color(255, 255, 255));
        Btn3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Btn3.setPreferredSize(new java.awt.Dimension(120, 120));
        Btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn3ActionPerformed(evt);
            }
        });

        Btn4.setBackground(new java.awt.Color(255, 255, 255));
        Btn4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Btn4.setPreferredSize(new java.awt.Dimension(120, 120));
        Btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn4ActionPerformed(evt);
            }
        });

        Btn8.setBackground(new java.awt.Color(255, 255, 255));
        Btn8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Btn8.setPreferredSize(new java.awt.Dimension(120, 120));
        Btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn8ActionPerformed(evt);
            }
        });

        Btn9.setBackground(new java.awt.Color(255, 255, 255));
        Btn9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Btn9.setPreferredSize(new java.awt.Dimension(120, 120));
        Btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn9ActionPerformed(evt);
            }
        });

        Btn6.setBackground(new java.awt.Color(255, 255, 255));
        Btn6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Btn6.setPreferredSize(new java.awt.Dimension(120, 120));
        Btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn6ActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        playerXLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        playerXLabel.setText("Player X:");

        playerOLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        playerOLabel.setText("Player O:");

        PlayerX_score.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        PlayerX_score.setText("xxxxxxxxxxxx");

        PlayerY_score.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        PlayerY_score.setText("xxxxxxxxxxxx");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(playerOLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(PlayerY_score, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(playerXLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(PlayerX_score, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(playerXLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PlayerX_score, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(playerOLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PlayerY_score, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(80, Short.MAX_VALUE))
        );

        restBtn.setBackground(new java.awt.Color(255, 255, 255));
        restBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        restBtn.setText("Rest");
        restBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restBtnActionPerformed(evt);
            }
        });

        exitBtn.setBackground(new java.awt.Color(255, 255, 255));
        exitBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        exitBtn.setText("Exit");
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Btn4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Btn2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Btn3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(restBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(93, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Btn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Btn2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Btn3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Btn4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Btn5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Btn6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(restBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Btn9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Btn8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Btn7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitBtnActionPerformed

    private void restBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restBtnActionPerformed
        // TODO add your handling code here:
        Btn1.setText(null);
        Btn2.setText(null);
        Btn3.setText(null);
        Btn4.setText(null);
        Btn5.setText(null);
        Btn6.setText(null);
        Btn7.setText(null);
        Btn8.setText(null);
        Btn9.setText(null);
        
        Btn1.setEnabled(true);
        Btn2.setEnabled(true);
        Btn3.setEnabled(true);
        Btn4.setEnabled(true);
        Btn5.setEnabled(true);
        Btn6.setEnabled(true);
        Btn7.setEnabled(true);
        Btn8.setEnabled(true);
        Btn9.setEnabled(true);
    }//GEN-LAST:event_restBtnActionPerformed

    private void Btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn9ActionPerformed
        // TODO add your handling code here:
        Btn9.setText(startGame);
        if(startGame.equalsIgnoreCase("X"))
        {
            Btn9.setForeground(Color.red);
        }
        else
        {
            Btn9.setForeground(Color.blue);
        }
        Btn9.setEnabled(false);
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_Btn9ActionPerformed

    private void Btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn8ActionPerformed
        // TODO add your handling code here:
        Btn8.setText(startGame);
        if(startGame.equalsIgnoreCase("X"))
        {
            Btn8.setForeground(Color.red);
        }
        else
        {
            Btn8.setForeground(Color.blue);
        }
        Btn8.setEnabled(false);
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_Btn8ActionPerformed

    private void Btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn7ActionPerformed
        // TODO add your handling code here:
        Btn7.setText(startGame);
        if(startGame.equalsIgnoreCase("X"))
        {
            Btn7.setForeground(Color.red);
        }
        else
        {
            Btn7.setForeground(Color.blue);
        }
        Btn7.setEnabled(false);
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_Btn7ActionPerformed

    private void Btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn4ActionPerformed
        // TODO add your handling code here:
        Btn4.setText(startGame);
        if(startGame.equalsIgnoreCase("X"))
        {
            Btn4.setForeground(Color.red);
        }
        else
        {
            Btn4.setForeground(Color.blue);
        }
        Btn4.setEnabled(false);
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_Btn4ActionPerformed

    private void Btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn5ActionPerformed
        // TODO add your handling code here:
        Btn5.setText(startGame);
        if(startGame.equalsIgnoreCase("X"))
        {
            Btn5.setForeground(Color.red);
        }
        else
        {
            Btn5.setForeground(Color.blue);
        }
        Btn5.setEnabled(false);
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_Btn5ActionPerformed

    private void Btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn6ActionPerformed
        // TODO add your handling code here:
        Btn6.setText(startGame);
        if(startGame.equalsIgnoreCase("X"))
        {
            Btn6.setForeground(Color.red);
        }
        else
        {
            Btn6.setForeground(Color.blue);
        }
        Btn6.setEnabled(false);
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_Btn6ActionPerformed

    private void Btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn3ActionPerformed
        // TODO add your handling code here:
        Btn3.setText(startGame);
        if(startGame.equalsIgnoreCase("X"))
        {
            Btn3.setForeground(Color.red);
        }
        else
        {
            Btn3.setForeground(Color.blue);
        }
        Btn3.setEnabled(false);
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_Btn3ActionPerformed

    private void Btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn2ActionPerformed
        // TODO add your handling code here:
        Btn2.setText(startGame);
        if(startGame.equalsIgnoreCase("X"))
        {
            Btn2.setForeground(Color.red);
        }
        else
        {
            Btn2.setForeground(Color.blue);
        }
        Btn2.setEnabled(false);
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_Btn2ActionPerformed

    private void Btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn1ActionPerformed
        // TODO add your handling code here:
        Btn1.setText(startGame);
        if(startGame.equalsIgnoreCase("X"))
        {
            Btn1.setForeground(Color.red);
        }
        else
        {
            Btn1.setForeground(Color.blue);
        }
        Btn1.setEnabled(false);
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_Btn1ActionPerformed

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
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TicTacToe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn1;
    private javax.swing.JButton Btn2;
    private javax.swing.JButton Btn3;
    private javax.swing.JButton Btn4;
    private javax.swing.JButton Btn5;
    private javax.swing.JButton Btn6;
    private javax.swing.JButton Btn7;
    private javax.swing.JButton Btn8;
    private javax.swing.JButton Btn9;
    private javax.swing.JLabel PlayerX_score;
    private javax.swing.JLabel PlayerY_score;
    private javax.swing.JButton exitBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel playerOLabel;
    private javax.swing.JLabel playerXLabel;
    private javax.swing.JButton restBtn;
    // End of variables declaration//GEN-END:variables
}
