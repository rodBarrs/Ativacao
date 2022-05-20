/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.samirAtivacao.view;

import java.awt.Color;

/**
 *
 * @author AGU
 */
@SuppressWarnings("serial")
public class Selecao extends javax.swing.JFrame {

    /**
     * Creates new form Seleçao
     */
    public Selecao() {
        initComponents();
        botaoInfo.setBackground(new Color(0,0,0,0));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botaoSamir = new javax.swing.JButton();
        botaoBeremiz = new javax.swing.JButton();
        botaoInfo = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1280, 720));
        getContentPane().setLayout(null);

        botaoSamir.setBackground(new java.awt.Color(219, 172, 70));
        botaoSamir.setFont(new java.awt.Font("Tahoma", 0, 130)); // NOI18N
        botaoSamir.setForeground(new java.awt.Color(255, 255, 255));
        botaoSamir.setText("SAMIR");
        botaoSamir.setToolTipText("");
        botaoSamir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSamirActionPerformed(evt);
            }
        });
        getContentPane().add(botaoSamir);
        botaoSamir.setBounds(710, 550, 572, 114);

        botaoBeremiz.setBackground(new java.awt.Color(219, 172, 70));
        botaoBeremiz.setFont(new java.awt.Font("Tahoma", 0, 130)); // NOI18N
        botaoBeremiz.setForeground(new java.awt.Color(255, 255, 255));
        botaoBeremiz.setText("BEREMIZ");
        botaoBeremiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoBeremizActionPerformed(evt);
            }
        });
        getContentPane().add(botaoBeremiz);
        botaoBeremiz.setBounds(590, 390, 694, 114);

        botaoInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/info.png"))); // NOI18N
        botaoInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoInfoActionPerformed(evt);
            }
        });
        getContentPane().add(botaoInfo);
        botaoInfo.setBounds(1207, 94, 50, 50);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SelecaoFundo.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jLabel2.setMaximumSize(new java.awt.Dimension(1280, 720));
        jLabel2.setMinimumSize(new java.awt.Dimension(1280, 720));
        jLabel2.setPreferredSize(new java.awt.Dimension(1280, 720));
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 1280, 720);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    Samir loginSamir;
    Beremiz loginbremiz;
    Informacao informacao;
    Selecao selecao;
    private void botaoSamirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSamirActionPerformed
        // TODO add your handling code here:
       
            if(loginSamir == null){
			loginSamir = new Samir();
			loginSamir.setLocationRelativeTo(null);
			loginSamir.setVisible(true);
			loginSamir.setResizable(false);

                dispose();
			}
			 else{
			     loginSamir.setLocationRelativeTo(null);
			loginSamir.setVisible(true);
			loginSamir.setResizable(false);
			 }
            
        
    }//GEN-LAST:event_botaoSamirActionPerformed

    private void botaoBeremizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoBeremizActionPerformed
        if(loginbremiz == null){
		loginbremiz = new Beremiz();
		loginbremiz.setLocationRelativeTo(null);
		loginbremiz.setVisible(true);
            loginbremiz.setResizable(false);
            dispose();
		}
		 else{
		loginbremiz.setLocationRelativeTo(null);
		loginbremiz.setVisible(true);
		loginbremiz.setResizable(false);
		 }
    }//GEN-LAST:event_botaoBeremizActionPerformed

    private void botaoInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoInfoActionPerformed
        // TODO add your handling code here:
        if(informacao == null){
		informacao = new Informacao();
		informacao.setLocationRelativeTo(null);
		informacao.setVisible(true);
            informacao.setResizable(false);
            dispose();
		}
		 else{
		informacao.setLocationRelativeTo(null);
		informacao.setVisible(true);
		informacao.setResizable(false);
		 }
    }//GEN-LAST:event_botaoInfoActionPerformed

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
            java.util.logging.Logger.getLogger(Selecao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Selecao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Selecao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Selecao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Selecao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoBeremiz;
    private javax.swing.JButton botaoInfo;
    private javax.swing.JButton botaoSamir;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
