/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufla.dcc.ppoo.dao;

import br.ufla.dcc.ppoo.dao.lista.ListaDAOLista;
import br.ufla.dcc.ppoo.modelo.Lista;
import java.util.List;

/**
 *
 * @author arlen
 */
public interface ListaDAO {
    
    public int adicionarLista(Lista lista);
    
    public List<Lista> buscarListaUsuario();
    
    public List<Lista> buscarListaPublica();
    
}
