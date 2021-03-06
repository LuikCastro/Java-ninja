/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lutador;

/**
 *
 * @author castr
 */
public class TelaLuta extends javax.swing.JFrame {
    Lutador lutador;
    /**
     * Creates new form TelaLuta
     */
    public TelaLuta() {
        initComponents();
        lutador = new Lutador();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblVida1 = new javax.swing.JLabel();
        lblVida2 = new javax.swing.JLabel();
        btnApanhar1 = new javax.swing.JButton();
        btnConcentrarForca1 = new javax.swing.JButton();
        btnApanhar2 = new javax.swing.JButton();
        btnConcentrarForca2 = new javax.swing.JButton();
        lblResultado1 = new javax.swing.JLabel();
        lblResultado2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblVida1.setText("Vida jogador um (100)");

        lblVida2.setText("Vida jogador dois (100)");

        btnApanhar1.setText("Apanhar");
        btnApanhar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApanhar1ActionPerformed(evt);
            }
        });

        btnConcentrarForca1.setText("Concentrar força");
        btnConcentrarForca1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConcentrarForca1ActionPerformed(evt);
            }
        });

        btnApanhar2.setText("Apanhar");
        btnApanhar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApanhar2ActionPerformed(evt);
            }
        });

        btnConcentrarForca2.setText("Concentrar força");
        btnConcentrarForca2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConcentrarForca2ActionPerformed(evt);
            }
        });

        lblResultado1.setText("Aguardando resultado...");

        lblResultado2.setText("Aguardando resultado...");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnConcentrarForca1)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(28, 28, 28)
                            .addComponent(lblVida1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(btnApanhar1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 119, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnConcentrarForca2)
                            .addComponent(lblVida2))
                        .addGap(32, 32, 32))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnApanhar2)
                        .addGap(48, 48, 48))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(lblResultado2)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(lblResultado1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblVida1)
                    .addComponent(lblVida2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblResultado1)
                    .addComponent(lblResultado2))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnApanhar1)
                    .addComponent(btnApanhar2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConcentrarForca1)
                    .addComponent(btnConcentrarForca2))
                .addContainerGap(174, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnApanhar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApanhar1ActionPerformed
        // TODO add your handling code here:
        lutador.apanhar1();
        lblVida1.setText("Vida jogador um (" + lutador.getVida1() + ")" );
        if (lutador.getVida1() <= 0){
            lblResultado1.setText("Lutador 1 perdeu");
        }
    }//GEN-LAST:event_btnApanhar1ActionPerformed

    private void btnConcentrarForca1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConcentrarForca1ActionPerformed
        // TODO add your handling code here:
        lutador.concentrarForca1();
        lblVida1.setText("Vida jogador um (" + lutador.getVida1() + ")" );
    }//GEN-LAST:event_btnConcentrarForca1ActionPerformed

    private void btnApanhar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApanhar2ActionPerformed
        // TODO add your handling code here:
        lutador.apanhar2();
        lblVida2.setText("Vida jogador dois (" + lutador.getVida2() + ")" );
        if (lutador.getVida2() <= 0){
            lblResultado2.setText("Lutador 2 perdeu");
        }
    }//GEN-LAST:event_btnApanhar2ActionPerformed

    private void btnConcentrarForca2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConcentrarForca2ActionPerformed
        // TODO add your handling code here:
        lutador.concentrarForca2();
        lblVida2.setText("Vida jogador dois (" + lutador.getVida2() + ")" );
    }//GEN-LAST:event_btnConcentrarForca2ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaLuta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLuta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLuta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLuta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLuta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApanhar1;
    private javax.swing.JButton btnApanhar2;
    private javax.swing.JButton btnConcentrarForca1;
    private javax.swing.JButton btnConcentrarForca2;
    private javax.swing.JLabel lblResultado1;
    private javax.swing.JLabel lblResultado2;
    private javax.swing.JLabel lblVida1;
    private javax.swing.JLabel lblVida2;
    // End of variables declaration//GEN-END:variables
}
