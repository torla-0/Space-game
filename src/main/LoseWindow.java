package main;

import static main.MapChooseWindow.game;


public class LoseWindow extends javax.swing.JFrame {


    public LoseWindow() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nosacPanel = new javax.swing.JLayeredPane();
        finalScoreLabel = new javax.swing.JLabel();
        backToHomeLabel = new javax.swing.JLabel();
        massageLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(483, 330));
        setMinimumSize(new java.awt.Dimension(483, 330));
        setPreferredSize(new java.awt.Dimension(483, 330));
        setResizable(false);

        finalScoreLabel.setFont(new java.awt.Font("Garamond", 1, 24)); // NOI18N
        finalScoreLabel.setForeground(new java.awt.Color(255, 255, 255));
        finalScoreLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        backToHomeLabel.setFont(new java.awt.Font("Garamond", 1, 24)); // NOI18N
        backToHomeLabel.setForeground(new java.awt.Color(255, 255, 255));
        backToHomeLabel.setText(" Back to home ");
        backToHomeLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backToHomeLabelMouseClicked(evt);
            }
        });

        massageLabel.setFont(new java.awt.Font("Garamond", 1, 24)); // NOI18N
        massageLabel.setForeground(new java.awt.Color(255, 255, 255));
        massageLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        massageLabel.setText("Not bad, more luck next time !");

        nosacPanel.setLayer(finalScoreLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        nosacPanel.setLayer(backToHomeLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        nosacPanel.setLayer(massageLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout nosacPanelLayout = new javax.swing.GroupLayout(nosacPanel);
        nosacPanel.setLayout(nosacPanelLayout);
        nosacPanelLayout.setHorizontalGroup(
            nosacPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nosacPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(nosacPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(nosacPanelLayout.createSequentialGroup()
                        .addComponent(finalScoreLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(nosacPanelLayout.createSequentialGroup()
                        .addComponent(massageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 30, Short.MAX_VALUE))))
            .addGroup(nosacPanelLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(backToHomeLabel)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        nosacPanelLayout.setVerticalGroup(
            nosacPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nosacPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(massageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(finalScoreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                .addComponent(backToHomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        jLabel1.setFocusable(false);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/blackholeProject.gif"))); // NOI18N
        jLabel1.setLayout(null);
        jLabel1.add(nosacPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 19, Short.MAX_VALUE)
                .addComponent(nosacPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 20, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 483, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 20, Short.MAX_VALUE)
                .addComponent(nosacPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 21, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backToHomeLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backToHomeLabelMouseClicked
        this.dispose();
        game.dispose();
        
        
        
        StartWindow start = new StartWindow();
        start.setVisible(true);
        start.setLocationRelativeTo(null);
    }//GEN-LAST:event_backToHomeLabelMouseClicked


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
            java.util.logging.Logger.getLogger(LoseWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoseWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoseWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoseWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoseWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backToHomeLabel;
    static javax.swing.JLabel finalScoreLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel massageLabel;
    private javax.swing.JLayeredPane nosacPanel;
    // End of variables declaration//GEN-END:variables
}
