
package main;

import java.awt.Color;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.Timer;
import static main.GamePaint.switcher;
import static main.StartWindow.nickName;

public class GameWindow extends javax.swing.JFrame {

    /**
     * Creates new form GameWindow
     */
    Point initialClick;
    int thisX;
    int xMoved;
    int x;
    
    static JLabel b1; 
    static JLabel b2; 
    static JLabel b3; 
    static JLabel b4;
    
    static Random random;
    static Random randomAgain;
    static Integer plasmaNumber = 2;
    
    static Integer scorInteger = 0;



    
    
    
    
    static Integer elapsed = 0;
    static Timer timer = new Timer(1000, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            
            if(switcher)
            {
                timeLabel.setText("Time: " + (elapsed++).toString());
            }

            GameThread g1 = new GameThread(oneThreadLabel);
            g1.startTimer();
            
            GameThread g2 = new GameThread(twoThreadLabel);
            g2.startTimer();
            
            GameThread g3 = new GameThread(treeThreadLabel);
            g3.startTimer();
            
            GameThread g4 = new GameThread(fourThreadLabel);
            g4.startTimer();
        }
    });
    
    static Timer projectiles = new Timer(1000, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) 
        {
            {
                 randomAgain = new Random();

                 plasmaNumber = randomAgain.nextInt(4);
                    
                   switch(plasmaNumber)
                   {
                       case 0:
                       {
                           
                           if(switcher)
                           {
                                b1 = new JLabel();
                                b1.setOpaque(true);
                                b1.setBackground(Color.red);
                                b1.setSize(25, 25);
                                oneThreadPanel.add(b1);
                                oneThreadPanel.repaint();
                                oneThreadPanel.revalidate();
                                GamePaint gamePaintOne = new GamePaint(b1, oneThreadPanel);
                                GameThread gameOneColor = new GameThread(b1);
                                gamePaintOne.startTimer();
                                gameOneColor.startTimer();
                           }
                           
                           break;
                       }
                       case 1:
                       {
                           if(switcher)
                           {
                                b2 = new JLabel();
                                b2.setOpaque(true);
                                b2.setBackground(Color.red);
                                b2.setSize(25, 25);
                                twoThreadPanel.add(b2);
                                twoThreadPanel.repaint();
                                twoThreadPanel.revalidate();
                                GamePaint gamePaintTwo = new GamePaint(b2, twoThreadPanel);
                                GameThread gameTwoColor = new GameThread(b2);
                                gamePaintTwo.startTimer();
                                gameTwoColor.startTimer(); 
                           }
                            
                            break;
                       }
                       case 2:
                       {
                           if(switcher)
                           {
                                b3 = new JLabel();
                                b3.setOpaque(true);
                                b3.setBackground(Color.red);
                                b3.setSize(25, 25);
                                treeThreadPanel.add(b3);
                                treeThreadPanel.repaint();
                                treeThreadPanel.revalidate();
                                GamePaint gamePaintTree = new GamePaint(b3, treeThreadPanel);
                                GameThread gameTreeColor = new GameThread(b3);
                                gamePaintTree.startTimer();
                                gameTreeColor.startTimer(); 
                           }
                            
                           break;  
                       }
                       case 3:
                       {
                           if(switcher)
                           {
                                b4 = new JLabel();
                                b4.setOpaque(true);
                                b4.setBackground(Color.red);
                                b4.setSize(25, 25);
                                fourThreadPanel.add(b4);
                                fourThreadPanel.repaint();
                                fourThreadPanel.revalidate();
                                GamePaint gamePaintFour = new GamePaint(b4, fourThreadPanel);
                                GameThread gameFourColor = new GameThread(b4);
                                gamePaintFour.startTimer();
                                gameFourColor.startTimer();
                           break;
                           }
                            
                       }
                       default:
                           break;
                   }

    }
 
        }
    });

    
    public GameWindow() {
        initComponents();
        timer.start();
        projectiles.start();
        switcher = true;
        
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backgroundPanel = new javax.swing.JPanel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jPanel1 = new javax.swing.JPanel();
        scorLabel = new javax.swing.JLabel();
        timeLabel = new javax.swing.JLabel();
        nickNameLabel = new javax.swing.JLabel();
        twoThreadLabel = new javax.swing.JLabel();
        treeThreadLabel = new javax.swing.JLabel();
        fourThreadLabel = new javax.swing.JLabel();
        oneThreadPanel = new javax.swing.JPanel();
        twoThreadPanel = new javax.swing.JPanel();
        treeThreadPanel = new javax.swing.JPanel();
        fourThreadPanel = new javax.swing.JPanel();
        playerLabel = new javax.swing.JLabel();
        oneThreadLabel = new javax.swing.JLabel();
        backgroundLabelGameWin = new javax.swing.JLabel();

        backgroundPanel.setPreferredSize(new java.awt.Dimension(598, 780));

        javax.swing.GroupLayout backgroundPanelLayout = new javax.swing.GroupLayout(backgroundPanel);
        backgroundPanel.setLayout(backgroundPanelLayout);
        backgroundPanelLayout.setHorizontalGroup(
            backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 610, Short.MAX_VALUE)
        );
        backgroundPanelLayout.setVerticalGroup(
            backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 787, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(598, 780));
        setMinimumSize(new java.awt.Dimension(598, 780));
        setPreferredSize(new java.awt.Dimension(598, 780));
        setResizable(false);

        jLayeredPane1.setMaximumSize(new java.awt.Dimension(598, 790));
        jLayeredPane1.setMinimumSize(new java.awt.Dimension(598, 790));
        jLayeredPane1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLayeredPane1MouseDragged(evt);
            }
        });
        jLayeredPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLayeredPane1MouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLayeredPane1MousePressed(evt);
            }
        });

        jPanel1.setOpaque(false);

        scorLabel.setFont(new java.awt.Font("Garamond", 1, 24)); // NOI18N
        scorLabel.setForeground(new java.awt.Color(255, 255, 255));
        scorLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        scorLabel.setText("Score: " + scorInteger);

        timeLabel.setFont(new java.awt.Font("Garamond", 1, 24)); // NOI18N
        timeLabel.setForeground(new java.awt.Color(255, 255, 255));
        timeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        timeLabel.setText("Time: 0");

        nickNameLabel.setText(nickName.toUpperCase());
        nickNameLabel.setFont(new java.awt.Font("Garamond", 1, 24)); // NOI18N
        nickNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        nickNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(scorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addComponent(nickNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(timeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scorLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(timeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
            .addComponent(nickNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLayeredPane1.add(jPanel1);
        jPanel1.setBounds(0, 0, 598, 51);

        twoThreadLabel.setBackground(new java.awt.Color(51, 255, 0));
        twoThreadLabel.setMaximumSize(new java.awt.Dimension(25, 25));
        twoThreadLabel.setMinimumSize(new java.awt.Dimension(25, 25));
        twoThreadLabel.setOpaque(true);
        twoThreadLabel.setPreferredSize(new java.awt.Dimension(25, 25));
        jLayeredPane1.add(twoThreadLabel);
        twoThreadLabel.setBounds(210, 80, 25, 25);

        treeThreadLabel.setBackground(new java.awt.Color(51, 255, 0));
        treeThreadLabel.setMaximumSize(new java.awt.Dimension(25, 25));
        treeThreadLabel.setMinimumSize(new java.awt.Dimension(25, 25));
        treeThreadLabel.setOpaque(true);
        treeThreadLabel.setPreferredSize(new java.awt.Dimension(25, 25));
        jLayeredPane1.add(treeThreadLabel);
        treeThreadLabel.setBounds(370, 80, 25, 25);

        fourThreadLabel.setBackground(new java.awt.Color(51, 255, 0));
        fourThreadLabel.setMaximumSize(new java.awt.Dimension(25, 25));
        fourThreadLabel.setMinimumSize(new java.awt.Dimension(25, 25));
        fourThreadLabel.setOpaque(true);
        fourThreadLabel.setPreferredSize(new java.awt.Dimension(25, 25));
        jLayeredPane1.add(fourThreadLabel);
        fourThreadLabel.setBounds(517, 81, 25, 25);

        oneThreadPanel.setLayout(new BoxLayout(oneThreadPanel, BoxLayout.PAGE_AXIS));
        oneThreadPanel.setMaximumSize(new java.awt.Dimension(68, 680));
        oneThreadPanel.setMinimumSize(new java.awt.Dimension(30, 610));
        oneThreadPanel.setOpaque(false);
        oneThreadPanel.setPreferredSize(new java.awt.Dimension(30, 610));
        oneThreadPanel.setLayout(null);
        jLayeredPane1.add(oneThreadPanel);
        oneThreadPanel.setBounds(60, 110, 50, 610);

        twoThreadPanel.setLayout(new BoxLayout(twoThreadPanel, BoxLayout.PAGE_AXIS));
        twoThreadPanel.setOpaque(false);
        twoThreadPanel.setLayout(null);
        jLayeredPane1.add(twoThreadPanel);
        twoThreadPanel.setBounds(210, 110, 40, 630);

        treeThreadPanel.setLayout(new BoxLayout(treeThreadPanel, BoxLayout.PAGE_AXIS));
        treeThreadPanel.setOpaque(false);
        treeThreadPanel.setLayout(null);
        jLayeredPane1.add(treeThreadPanel);
        treeThreadPanel.setBounds(370, 110, 30, 620);

        fourThreadPanel.setLayout(new BoxLayout(fourThreadPanel, BoxLayout.PAGE_AXIS));
        fourThreadPanel.setOpaque(false);
        fourThreadPanel.setLayout(null);
        jLayeredPane1.add(fourThreadPanel);
        fourThreadPanel.setBounds(517, 112, 30, 625);

        playerLabel.setBackground(new java.awt.Color(0, 204, 255));
        playerLabel.setOpaque(true);
        playerLabel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                playerLabelMouseDragged(evt);
            }
        });
        playerLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                playerLabelMousePressed(evt);
            }
        });
        jLayeredPane1.add(playerLabel);
        playerLabel.setBounds(270, 700, 90, 25);

        oneThreadLabel.setBackground(new java.awt.Color(51, 255, 0));
        oneThreadLabel.setMaximumSize(new java.awt.Dimension(25, 25));
        oneThreadLabel.setMinimumSize(new java.awt.Dimension(25, 25));
        oneThreadLabel.setOpaque(true);
        oneThreadLabel.setPreferredSize(new java.awt.Dimension(25, 25));
        jLayeredPane1.add(oneThreadLabel);
        oneThreadLabel.setBounds(60, 80, 25, 25);

        backgroundLabelGameWin.setMaximumSize(new java.awt.Dimension(598, 780));
        backgroundLabelGameWin.setMinimumSize(new java.awt.Dimension(598, 780));
        backgroundLabelGameWin.setPreferredSize(new java.awt.Dimension(598, 780));
        backgroundLabelGameWin.setLayout(null);
        backgroundLabelGameWin.add(jLayeredPane1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 598, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(backgroundLabelGameWin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 782, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(backgroundLabelGameWin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 782, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLayeredPane1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLayeredPane1MouseEntered

    }//GEN-LAST:event_jLayeredPane1MouseEntered

    private void jLayeredPane1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLayeredPane1MousePressed

    }//GEN-LAST:event_jLayeredPane1MousePressed

    private void jLayeredPane1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLayeredPane1MouseDragged

    }//GEN-LAST:event_jLayeredPane1MouseDragged

    private void playerLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_playerLabelMousePressed
        initialClick = evt.getPoint();
    }//GEN-LAST:event_playerLabelMousePressed

    private void playerLabelMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_playerLabelMouseDragged
        
        if(switcher)
        {
            thisX = playerLabel.getLocation().x;
        
                xMoved = (thisX + evt.getX()) - (thisX + initialClick.x);

                x = thisX + xMoved;

                if(503 > x && x > 0)
                {

                       playerLabel.setLocation(x, playerLabel.getLocation().y);
                       playerLabel.repaint();    

                }
        }
        
        
    }//GEN-LAST:event_playerLabelMouseDragged

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
            java.util.logging.Logger.getLogger(GameWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GameWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GameWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GameWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GameWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    static javax.swing.JLabel backgroundLabelGameWin;
    static javax.swing.JPanel backgroundPanel;
    static javax.swing.JLabel fourThreadLabel;
    private static javax.swing.JPanel fourThreadPanel;
    static javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    static javax.swing.JLabel nickNameLabel;
    static javax.swing.JLabel oneThreadLabel;
    private static javax.swing.JPanel oneThreadPanel;
    static javax.swing.JLabel playerLabel;
    static javax.swing.JLabel scorLabel;
    static javax.swing.JLabel timeLabel;
    static javax.swing.JLabel treeThreadLabel;
    private static javax.swing.JPanel treeThreadPanel;
    static javax.swing.JLabel twoThreadLabel;
    private static javax.swing.JPanel twoThreadPanel;
    // End of variables declaration//GEN-END:variables
}
