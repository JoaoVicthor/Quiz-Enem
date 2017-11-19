/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizenem.view;

import static com.sun.corba.se.impl.util.Utility.printStackTrace;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import quizenem.controller.ControladorPrincipal;

/**
 *
 * @author joaov
 */
public class TelaEquipe extends javax.swing.JPanel {

    private final Moldura frame;

    /**
     * Creates new form TelaEquipe
     */
    public TelaEquipe(Moldura frame) {
        initComponents();
        this.frame = frame;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setLayout(new java.awt.GridLayout(4, 1, 0, 10));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 26)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText(ControladorPrincipal.getInstance().getControladorEquipe().getEquipe().getNomeDaEquipe());
        add(jLabel1);

        jButton1.setText("Iniciar Partida");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1);

        jButton2.setText("Gerenciar Alunos");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2);

        jButton3.setText("Sair");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        add(jButton3);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        frame.remove(this);
        ControladorPrincipal.getInstance().logout();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        frame.remove(this);
        frame.getTelaAlunos();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            ControladorPrincipal.getInstance().getControladorEquipe().iniciarPartida();
            frame.remove(this);
            frame.getTelaPartida();
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
