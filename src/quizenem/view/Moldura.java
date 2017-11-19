/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizenem.view;

import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;
import quizenem.controller.ControladorEquipe;
import quizenem.controller.ControladorPrincipal;

/**
 *
 * @author joaov
 */
public class Moldura extends javax.swing.JFrame {

    /**
     * Creates new form Moldura
     */
    public Moldura() {
        super();
        initComponents();
        getTelaLogin();
        setMinimumSize(new Dimension(900, 700));
        setResizable(true);
        setVisible(true);
        setExtendedState(getExtendedState() | JFrame.MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void addToMoldura(JPanel panel) {
        add(panel);
        panel.setVisible(true);
        revalidate();
        repaint();
    }

    public void getTelaLogin() {
        LoginPanel loginPanel = new LoginPanel(this);
        addToMoldura(loginPanel);
    }

    public void getTelaEquipe() {
        TelaEquipe telaEquipe = new TelaEquipe(this);
        addToMoldura(telaEquipe);
    }

    public void getTelaPartida() {
        TelaPartida telaPartida = new TelaPartida(this, ControladorPrincipal.getInstance().getControladorEquipe());
        addToMoldura(telaPartida);
    }

    public void getTelaFinal() {
        TelaFinal telaFinal = new TelaFinal(this);
        addToMoldura(telaFinal);
    }

    public void getTelaAlunos() {
        TelaAlunos telaAlunos = new TelaAlunos(this);
        addToMoldura(telaAlunos);
    }

    public void getTelaDiretor() {
        TelaDiretor telaDiretor = new TelaDiretor(this);
        addToMoldura(telaDiretor);
    }

    public void getTelaCadastroEquipe() {
        TelaCadastroEquipe telaCadastroEquipe = new TelaCadastroEquipe(this);
        addToMoldura(telaCadastroEquipe);
    }

    public void getTelaCadastroPergunta() {
        TelaCadastroPergunta telaCadastroPergunta = new TelaCadastroPergunta(this);
        addToMoldura(telaCadastroPergunta);
    }

    public void getTelaEstatisticasDiretor() {
        TelaEstatisticasDiretor telaEstatisticasDiretor = new TelaEstatisticasDiretor(this);
        addToMoldura(telaEstatisticasDiretor);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
