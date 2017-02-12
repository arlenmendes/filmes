/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufla.dcc.ppoo.servicos;

import br.ufla.dcc.ppoo.dao.ListaDAO;
import br.ufla.dcc.ppoo.dao.lista.ListaDAOLista;
import br.ufla.dcc.ppoo.modelo.Lista;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author arlen
 */
public class GerenciadorListas {
    
// atributo utilizado como camada de acesso a dados do cadastro de usuários
    ListaDAO repositorioListas;
    
    public GerenciadorListas(){
        repositorioListas = ListaDAOLista.getInstancia();
    }
    
    public int criar(Lista lista){
        
        int resposta = repositorioListas.adicionarLista(lista);
        
        if(resposta == 200){
            JOptionPane.showMessageDialog(null, "Lista criada com sucesso!");
        } else if(resposta == 501){
            JOptionPane.showMessageDialog(null, "Ja existe uma lista com este nome: " + lista.getNome());
        } else if(resposta == 502) {
            JOptionPane.showMessageDialog(null, "Lista de filmes Vazia ou inferior a 2 filmes.");
        } else if (resposta == 503){
            JOptionPane.showMessageDialog(null, "Palavras chave nao informada.");
        }
        
        return resposta;
    }
    
    public List<Lista> buscarMinhasListas(){
        List<Lista> lista = null;
        
        lista = repositorioListas.buscarListaUsuario();
        
        return lista;
    }
    
    public List<Lista> buscaListaPublica(){
        
        List<Lista> lista = null;
        
        lista = repositorioListas.buscarListaPublica();
        
        return lista;
    }
}
