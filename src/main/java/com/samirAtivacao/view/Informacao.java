/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.samirAtivacao.view;

import java.awt.Color;

/**
 *
 * @author Oseias
 */
public class Informacao extends javax.swing.JFrame {
        Selecao selecao;
    /**
     * Creates new form informacao
     */
    public Informacao() {
        initComponents();
        botaoManual.setBackground(new Color(0,0,0,0));
         botaoHome.setBackground(new Color(0,0,0,0));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botaoManual = new javax.swing.JButton();
        botaoHome = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1280, 760));
        getContentPane().setLayout(null);

        botaoManual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/manualIcon.png"))); // NOI18N
        botaoManual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoManualActionPerformed(evt);
            }
        });
        getContentPane().add(botaoManual);
        botaoManual.setBounds(352, 569, 60, 60);

        botaoHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/homeBlack.png"))); // NOI18N
        botaoHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoHomeActionPerformed(evt);
            }
        });
        getContentPane().add(botaoHome);
        botaoHome.setBounds(600, 630, 90, 91);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/informacoes.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jLabel2.setMaximumSize(new java.awt.Dimension(1280, 720));
        jLabel2.setMinimumSize(new java.awt.Dimension(1280, 720));
        jLabel2.setPreferredSize(new java.awt.Dimension(1280, 750));
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 1280, 720);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoManualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoManualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoManualActionPerformed

    private void botaoHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoHomeActionPerformed
        if(selecao == null){
            selecao = new Selecao();
            selecao.setLocationRelativeTo(null);
            selecao.setVisible(true);
            selecao.setResizable(false);
            dispose();
        }
        else{
            selecao.setLocationRelativeTo(null);
            selecao.setVisible(true);
            selecao.setResizable(false);
        }
    }//GEN-LAST:event_botaoHomeActionPerformed

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
            java.util.logging.Logger.getLogger(Informacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Informacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Informacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Informacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Informacao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoHome;
    private javax.swing.JButton botaoManual;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
