package com.rotext.rotext;

public class ViewEscolha extends javax.swing.JFrame {
       
    public ViewEscolha() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        title1 = new javax.swing.JLabel();
        pergunta1 = new javax.swing.JLabel();
        bavisar = new javax.swing.JButton();
        brecolher = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1360, 768));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        title1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/título.png"))); // NOI18N

        pergunta1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        pergunta1.setText("Olá! Você deseja avisar onde há lixo ou recolher lixo em algum endereço?");

        bavisar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bavisar.setText("Avisar");
        bavisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bavisarActionPerformed(evt);
            }
        });

        brecolher.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        brecolher.setText("Recolher");
        brecolher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brecolherActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 142, Short.MAX_VALUE)
                .addComponent(title1)
                .addGap(138, 138, 138))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pergunta1)
                .addGap(241, 241, 241))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(448, 448, 448)
                .addComponent(bavisar, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(brecolher, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(151, 151, 151)
                .addComponent(title1)
                .addGap(96, 96, 96)
                .addComponent(pergunta1)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bavisar, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(brecolher, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(246, Short.MAX_VALUE))
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
    }// </editor-fold>//GEN-END:initComponents

    
    private void bavisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bavisarActionPerformed
        new DigEnd().setVisible(true);
    }//GEN-LAST:event_bavisarActionPerformed

    private void brecolherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brecolherActionPerformed
       new VerEnd().setVisible(true);
    }//GEN-LAST:event_brecolherActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewEscolha().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bavisar;
    private javax.swing.JButton brecolher;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel pergunta1;
    private javax.swing.JLabel title1;
    // End of variables declaration//GEN-END:variables
}