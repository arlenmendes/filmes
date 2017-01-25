package br.ufla.dcc.ppoo.dao;

/**
 * Interface do Data Access Object (Padrão de Projeto) da Filme
 * @author Breno e lucas
 */

// importação das classes utilizadas
import br.ufla.dcc.ppoo.modelo.Filme;
import java.util.List;

public interface FilmeDAO {
    /**
     * Adiciona um objeto Filme na Lista 
     * de Filmes
     */

    public void adicionarFilme(Filme filme);
    /**
     * Retonar um ArrayList contendo
     * objetos da classe Filme
     */
    public List<Filme> getListaFilmes();
    /**
     * Edita série a partir
     * de um indicador da posição da Filme na Lista
     */
    public void editarFilme(Filme filme,int a);
    /**
     * Deleta série a partir
     * de um indicador da posição da Filme na Lista
     */
    public void deletarFilme(Filme filme, int a);
    
    public void limparInstancia();
    
}
