package br.ufla.dcc.ppoo.dao.lista;

import br.ufla.dcc.ppoo.dao.FilmeDAO;
import br.ufla.dcc.ppoo.modelo.Filme;
import java.util.ArrayList;
import java.util.List;


/**
 * Implementação do Data Access Object (Padrão de Projeto) da Filme através de
 * Lista em memória
 * 
 * @author Arlen e Valdeci
 */

public class FilmeDAOLista implements FilmeDAO {

    // instância única da classe (Padrão de Projeto Singleton)
    private static FilmeDAOLista instancia;
    
    // lista em em memória dos usuários cadastrados
    private final List<Filme> listaFilme;

    private FilmeDAOLista() {
        listaFilme = new ArrayList<Filme>();
   }

    /**
     * Retorna a instância única da classe (Padrão de Projeto Singleton)
     * 
     * @return A instância única da classe
     */
    public static FilmeDAOLista obterInstancia() {
        if (instancia == null) {
            instancia = new FilmeDAOLista();
        }
        return instancia;
    }
    
    /**
     * Retonar um ArrayList contendo
     * de Filmes
     */  
    @Override
    public List<Filme> getListaFilmes(){
        return listaFilme;
    }

     /**
     * Adiciona um objeto Filme na Lista 
     * objetos da classe Filme
     */
    @Override
    public void adicionarFilme(Filme filme) {
        listaFilme.add(filme);
    }
    
     /**
     * Atualiza o filme a partir
     * de um indicador da posição do Filme na Lista
     */
     public void editarFilme(Filme filme,int a) {
        listaFilme.get(a).setNome(filme.getNome());
        listaFilme.get(a).setGenero(filme.getGenero());
        listaFilme.get(a).setAno(filme.getAno());
        listaFilme.get(a).setDuracao(filme.getDuracao());
        listaFilme.get(a).setDescricao(filme.getDescricao());
    }

    /**
     * Deleta filme a partir
     * de um indicador da posição da Filme na Lista
     */
    @Override
    public void deletarFilme(Filme filme, int a) {
        listaFilme.remove(a);
    }
    
    @Override
    public void limparInstancia(){
        while(listaFilme.size() > 0){
            listaFilme.remove(listaFilme.size()-1);
        }
    };
}
