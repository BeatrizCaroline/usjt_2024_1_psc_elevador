/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.biajava;

/**
 *
 * @author 82324361
 */
public class TelaElevador extends javax.swing.JFrame {
    private Elevador elevador;

    /**
     * Creates new form ElevadorTela
     */
    public TelaElevador() {
        elevador = new Elevador();
        initComponents();
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

        Subir = new javax.swing.JButton();
        Descer = new javax.swing.JButton();
        EntrarGente = new javax.swing.JButton();
        SubirPessoa = new javax.swing.JButton();
        DescerPessoa = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        sentidoLabel = new javax.swing.JLabel();
        qtddePessoas = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Subir.setText("Subir");
        Subir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubirActionPerformed(evt);
            }
        });

        Descer.setText("Descer");
        Descer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DescerActionPerformed(evt);
            }
        });

        EntrarGente.setText("EntrarGente");
        EntrarGente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntrarGenteActionPerformed(evt);
            }
        });

        SubirPessoa.setText("SubirPessoa");
        SubirPessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubirPessoaActionPerformed(evt);
            }
        });

        DescerPessoa.setText("DescerPessoa");

        jLabel1.setText("0");

        jLabel2.setText("Sentido do Elevador:");

        sentidoLabel.setText("Subindo");

        qtddePessoas.setText("Quantidade de Pessoas");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(Subir)
                        .addGap(18, 18, 18)
                        .addComponent(Descer))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(qtddePessoas)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(EntrarGente)
                                .addGap(18, 18, 18)
                                .addComponent(SubirPessoa)
                                .addGap(18, 18, 18)
                                .addComponent(DescerPessoa))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sentidoLabel)))))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(qtddePessoas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(sentidoLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 148, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Subir)
                    .addComponent(Descer))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EntrarGente)
                    .addComponent(SubirPessoa)
                    .addComponent(DescerPessoa))
                .addGap(11, 11, 11))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SubirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubirActionPerformed
        elevador.sobe();
        sentidoLabel.setText("Subindo");
    }//GEN-LAST:event_SubirActionPerformed

    private void DescerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DescerActionPerformed
        elevador.desce();
        sentidoLabel.setText("Descendo");
    }//GEN-LAST:event_DescerActionPerformed

    private void EntrarGenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntrarGenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EntrarGenteActionPerformed

    private void SubirPessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubirPessoaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SubirPessoaActionPerformed

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
            java.util.logging.Logger.getLogger(TelaElevador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaElevador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaElevador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaElevador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaElevador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Descer;
    private javax.swing.JButton DescerPessoa;
    private javax.swing.JButton EntrarGente;
    private javax.swing.JButton Subir;
    private javax.swing.JButton SubirPessoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel qtddePessoas;
    private javax.swing.JLabel sentidoLabel;
    // End of variables declaration//GEN-END:variables
}
