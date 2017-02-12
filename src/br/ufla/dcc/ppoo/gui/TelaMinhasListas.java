/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufla.dcc.ppoo.gui;

import br.ufla.dcc.ppoo.dao.lista.Teste;
import br.ufla.dcc.ppoo.modelo.Filme;
import br.ufla.dcc.ppoo.modelo.Lista;
import br.ufla.dcc.ppoo.seguranca.SessaoUsuario;
import br.ufla.dcc.ppoo.servicos.GerenciadorFilmes;
import br.ufla.dcc.ppoo.servicos.GerenciadorListas;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author arlen
 */
public class TelaMinhasListas extends javax.swing.JFrame {
    
    private TelaPrincipal telaPrincipal;
    
    private final GerenciadorListas gerenciadorlisas;
    
    private List<String> chaves;
    
    private DefaultTableModel model;
    
    /**
     * Creates new form TelaMinhasListas2
     */
    public TelaMinhasListas() throws Exception {
        gerenciadorlisas = new GerenciadorListas();
        inicializar();
    }
    
    public void inicializar() throws Exception{
//        Teste teste = new Teste();
//        teste.main2();
        construirTabela();
        initComponents();
        prepararComponenteInicial();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        chaves = new ArrayList<>();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbListas = new javax.swing.JTable();
        btnSalvar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnNova = new javax.swing.JButton();
        btnRemover = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        lbNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lbAddPalvra = new javax.swing.JLabel();
        txtPalavra = new javax.swing.JTextField();
        btnAdicionarChaves = new javax.swing.JButton();
        lbAddPalavras = new javax.swing.JLabel();
        btnFilmes = new javax.swing.JButton();
        btnVisibilidade = new javax.swing.JButton();
        lbVisibilidade = new javax.swing.JLabel();
        lbPalavras = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Listas de Filmes");

        tbListas.setModel(model);
        tbListas.setColumnSelectionAllowed(true);
        tbListas.getTableHeader().setReorderingAllowed(false);
        tbListas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbListasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbListas);
        tbListas.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnNova.setText("Nova");
        btnNova.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovaActionPerformed(evt);
            }
        });

        btnRemover.setText("Remover");
        btnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        lbNome.setText("Nome da Lista:");

        lbAddPalvra.setText("Palavras-chave");

        btnAdicionarChaves.setText("Adicionar");
        btnAdicionarChaves.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarChavesActionPerformed(evt);
            }
        });

        lbAddPalavras.setText("Palavras: ");

        btnFilmes.setText("Filmes");
        btnFilmes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFilmesActionPerformed(evt);
            }
        });

        btnVisibilidade.setText("Alterar Visibilidade");
        btnVisibilidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisibilidadeActionPerformed(evt);
            }
        });

        lbPalavras.setText("fljljfds");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNome)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnNova, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lbNome)
                    .addComponent(btnFilmes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lbAddPalvra)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtPalavra, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btnRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbPalavras)
                                    .addComponent(lbAddPalavras))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAdicionarChaves, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnVisibilidade, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lbVisibilidade)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap())))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbNome)
                    .addComponent(lbAddPalvra))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPalavra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdicionarChaves)
                    .addComponent(btnVisibilidade))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbAddPalavras)
                    .addComponent(lbVisibilidade))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnFilmes)
                    .addComponent(lbPalavras))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar)
                    .addComponent(btnEditar)
                    .addComponent(btnNova)
                    .addComponent(btnRemover)
                    .addComponent(btnCancelar))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        try {
            salvarLista();
        } catch (Exception ex) {
            Logger.getLogger(TelaMinhasListas.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Throwable ex) {
            Logger.getLogger(TelaMinhasListas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnNovaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovaActionPerformed
        prepararComponenteNovaLista();
    }//GEN-LAST:event_btnNovaActionPerformed

    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRemoverActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
        
        try {
            new TelaMinhasListas();
        } catch (Exception ex) {
            Logger.getLogger(TelaMinhasListas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnAdicionarChavesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarChavesActionPerformed
        adicionarChaves();
    }//GEN-LAST:event_btnAdicionarChavesActionPerformed

    private void btnFilmesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFilmesActionPerformed
        adicionarFilme();
    }//GEN-LAST:event_btnFilmesActionPerformed

    private void tbListasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbListasMouseClicked
        selecionaLista();
    }//GEN-LAST:event_tbListasMouseClicked

    private void btnVisibilidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisibilidadeActionPerformed
        alterarVisibilidade();
    }//GEN-LAST:event_btnVisibilidadeActionPerformed

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
            java.util.logging.Logger.getLogger(TelaMinhasListas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaMinhasListas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaMinhasListas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaMinhasListas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new TelaMinhasListas().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(TelaMinhasListas.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionarChaves;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnFilmes;
    private javax.swing.JButton btnNova;
    private javax.swing.JButton btnRemover;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnVisibilidade;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbAddPalavras;
    private javax.swing.JLabel lbAddPalvra;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbPalavras;
    private javax.swing.JLabel lbVisibilidade;
    private javax.swing.JTable tbListas;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPalavra;
    // End of variables declaration//GEN-END:variables
    
    
    //eventos dos botoes da tela
    private void adicionarChaves() {
        chaves.add(txtPalavra.getText());
        String palavras = "";
        if(!txtPalavra.getText().equals("")){
            palavras = lbPalavras.getText() + txtPalavra.getText() + ", ";
            lbPalavras.setText(palavras);
            txtPalavra.setText("");
        }
    }
    
    private void adicionarFilme(){
        TelaMeusFilmes telaMeusFilmes = new TelaMeusFilmes(telaPrincipal);
        telaMeusFilmes.inicializar();
    }
    
    private void salvarLista() throws Exception, Throwable{
        Lista lista = new Lista(txtNome.getText(), chaves);
        GerenciadorFilmes gF = new GerenciadorFilmes();
        lista.setFilmes(gF.getListaFilme());
        lista.setUsuario(SessaoUsuario.obterInstancia().obterUsuario());
        
        int resposta = gerenciadorlisas.criar(lista);
        if(resposta == 200){
            gF.limparInstancia();
            prepararComponenteInicial();
            atualizarTabela();
            tbListas.updateUI();
        }
    }
    
    //prepara a tela para seus respectivos eventos
    private void prepararComponenteInicial(){
        
        txtNome.setEditable(false);
        txtNome.setText("");
        txtPalavra.setEditable(false);
        
        lbPalavras.setText("");
        lbVisibilidade.setText("");
        btnNova.setEnabled(true);
        btnFilmes.setEnabled(false);
        btnEditar.setEnabled(false);
        btnSalvar.setEnabled(false);
        btnRemover.setEnabled(false);
        btnCancelar.setEnabled(true);
        btnAdicionarChaves.setEnabled(false);
        btnVisibilidade.setEnabled(false);
    }
    
    private void prepararComponenteNovaLista(){
        txtNome.setEditable(true);
        txtNome.setText("");
        txtPalavra.setEditable(true);
        lbVisibilidade.setText("Privada");
        lbPalavras.setText("");
        btnNova.setEnabled(false);
        btnFilmes.setEnabled(true);
        btnEditar.setEnabled(false);
        btnSalvar.setEnabled(true);
        btnRemover.setEnabled(false);
        btnCancelar.setEnabled(true);
        btnAdicionarChaves.setEnabled(true);
        btnVisibilidade.setEnabled(false);
    }
    
    private void construirTabela(){
        
        
        Object[] titulosColunas = new Object[2];
        titulosColunas[0] = "Nome";
        titulosColunas[1] = "Palavras-Chave";
        
        List<Lista> listas = gerenciadorlisas.buscarMinhasListas();
        
        Object[][] dados = new Object [listas.size()][2];
        
        for(int i=0; i< listas.size(); i++){
            dados[i][0] = listas.get(i).getNome();
            String chave = "";
            for(int j = 0; j<listas.get(i).getChaves().size(); j++){
                chave = chave + listas.get(i).getChaves().get(j) + ", ";
            }
            dados[i][1] = chave;
        }
        model = new DefaultTableModel(dados, titulosColunas);
    }
    
    public void atualizarTabela(){
        List<Lista> listas = gerenciadorlisas.buscarMinhasListas();
        
        Lista lista = listas.get(listas.size() - 1);
        
        String chave = "";
        
        for(int j = 0; j < lista.getChaves().size();j++){
            chave = chave + lista.getChaves().get(j) + ", ";
        }
        tbListas.clearSelection();
        model.addRow(new Object[]{lista.getNome(), chave});
    }
    
    private void selecionaLista(){
        Lista lista = gerenciadorlisas.buscarMinhasListas().get(tbListas.getSelectedRow());
        String chave = "";
        txtNome.setText(lista.getNome());

        for(String palavra : lista.getChaves()){
            chave = chave + palavra + ", ";
        }
        lbPalavras.setText(chave);
        
        verificaPrivacidade(lista);
        
        btnEditar.setEnabled(true);
        btnFilmes.setEnabled(true);
        btnVisibilidade.setEnabled(true);
        
        GerenciadorFilmes gFilmes = new GerenciadorFilmes();
        
        for(Filme filme: lista.getFilmes()){
            gFilmes.cadastrarFilme(filme);
            System.out.println(filme.getNome());
        }
    }
    
    private void verificaPrivacidade(Lista l){
        if(l.isPublica()){
            lbVisibilidade.setText("Publica");
        } else {
            lbVisibilidade.setText("Privada");
        }
    }
    
    private void alterarVisibilidade(){
        
        Lista lista = gerenciadorlisas.buscarMinhasListas().get(tbListas.getSelectedRow());
        
        int res = JOptionPane.showConfirmDialog(null, "Deseja Mesmo alterar a visibilidade da lista " + lista.getNome() + "?","Alterar", JOptionPane.YES_NO_OPTION);
        
        if(res == JOptionPane.YES_OPTION){
            if(lista.isPublica())
                lista.setPublica(false);
            else
                lista.setPublica(true);
            verificaPrivacidade(lista);
        }
    }   
    
    
    
}
