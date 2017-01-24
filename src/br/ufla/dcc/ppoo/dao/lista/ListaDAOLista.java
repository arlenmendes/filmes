/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufla.dcc.ppoo.dao.lista;

import br.ufla.dcc.ppoo.dao.ListaDAO;
import br.ufla.dcc.ppoo.modelo.Lista;
import br.ufla.dcc.ppoo.seguranca.SessaoUsuario;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author arlen
 */
public class ListaDAOLista implements ListaDAO {
    
    private static ListaDAOLista instancia;
    
    private List<Lista> listas;
    
    private int status = 0;
    
    public ListaDAOLista(){
        listas = new ArrayList<>();
    }
    
    /**
     * @return the instancia
     */
    
    public static ListaDAOLista getInstancia() {
        if(instancia == null){
            instancia = new ListaDAOLista();
        }
        return instancia;
    }
    
    @Override
    public int adicionarLista(Lista lista){
        status = 0;
        /*
         * Respostas:
         * Status 200 = Criado.
         * Status 501 = Ja existe uma lista com o mesmo nome.
         * Status 502 = Lista de filmes Vazia ou inferior a 2 filmes.
         * Status 503 = A Lista nao tem pelo menos 1 palavra chave.
         */

        
        listas.forEach((Lista l) -> {
            if(l.getNome().equals(lista.getNome())){
                status = 501;
            }
        });
        
        if(status != 501){
            //verifica se tem ao menos dois filmes para esta lista
            if(lista.getFilmes().size() >= 2){
                //verifica se tem ao menos uma palavra chave
                if(lista.getChaves().size() > 1){
                    listas.add(lista);
                    status = 200;
                } else {
                    status = 503;
                }
            } else {
                status = 502;
            }
        }
        
        return status;
    }
    
    @Override
    public List<Lista> buscarListaUsuario(){
        
        List<Lista> resposta = new ArrayList<>();
        
        listas.forEach((Lista lista) -> {
            if(lista.getUsuario() == SessaoUsuario.obterInstancia().obterUsuario()){
                resposta.add(lista);
            }
        });
        
        return resposta;
    }
    
    @Override
    public List<Lista> buscarListaPublica(){
        List<Lista> resposta = null;
        
        listas.forEach(lista -> {
            if(lista.isPublica()){
                resposta.add(lista);
            }
        });
        
        return resposta;
    }
    
}
