/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufla.dcc.ppoo.modelo;

import br.ufla.dcc.ppoo.seguranca.SessaoUsuario;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author arlen
 */
public class Lista {
    
    private String nome;
    private List<String> chaves;
    private List<Filme> filmes = new ArrayList<>();
    private static Usuario usuario;
    private boolean publica = false;
    
    public Lista(String n, List<String> c){
        this.nome = n;
        this.usuario = SessaoUsuario.obterInstancia().obterUsuario();
        this.chaves = c;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the chaves
     */
    public List<String> getChaves() {
        return chaves;
    }

    /**
     * @param chaves the chaves to set
     */
    public void setChaves(List<String> chaves) {
        this.chaves = chaves;
    }

    /**
     * @return the filmes
     */
    public List<Filme> getFilmes() {
        return filmes;
    }

    /**
     * @param filmes the filmes to set
     */
    public void setFilmes(List<Filme> filmes) {
        this.filmes = filmes;
    }

    /**
     * @return the usuario
     */
    public Usuario getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    /**
     * @return the publica
     */
    public boolean isPublica() {
        return publica;
    }

    /**
     * @param publica the publica to set
     */
    public void setPublica(boolean publica) {
        this.publica = publica;
    }
    
    
}
