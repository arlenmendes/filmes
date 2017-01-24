/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufla.dcc.ppoo.gui;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author arlen
 */
public class TelaMinhasListas {
    
    // referência para a tela principal
    private final TelaPrincipal telaPrincipal;
    
    //componentes da tela
    private JDialog janela;
    private JButton btnNovo;
    private JButton btnSalvar;
    private JButton btnAlterar;
    private JButton btnRemover;
    private JButton btnPalavra;
    private JTextField txtNome;
    private JTextField txtPalavra;
    private JLabel lbNome;
    private JLabel lbPalavra;
    private JLabel lbPalavras;
    private JTable tbListas;
    
    /*
     * Constrói a tela de autenticação guardando a referência da tela principal.
     */
    public TelaMinhasListas(TelaPrincipal telaprincipal){
        this.telaPrincipal = telaprincipal;
    }
    
    public void inicializar(){
        
    }
}
