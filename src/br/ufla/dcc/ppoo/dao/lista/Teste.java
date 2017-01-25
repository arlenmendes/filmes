/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufla.dcc.ppoo.dao.lista;

import br.ufla.dcc.ppoo.gui.TelaMinhasListas;
import br.ufla.dcc.ppoo.modelo.Filme;
import br.ufla.dcc.ppoo.modelo.Lista;
import br.ufla.dcc.ppoo.modelo.Usuario;
import br.ufla.dcc.ppoo.seguranca.SessaoUsuario;
import br.ufla.dcc.ppoo.servicos.GerenciadorListas;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;

/**
 *
 * @author arlen
 */
public class Teste {
    
    
    public Teste(){}
    
    public static void main(String[] args) throws Exception {
        
        GerenciadorListas gF = new GerenciadorListas();
        
        List<String> ch = new ArrayList<>();
        ch.add("Dados");
        ch.add("Terror");
        
        Lista arlen = new Lista("Arlen", ch);
        
        char[] senha = new char[]{'1', '2', '3'};
        Usuario user = new Usuario("paulo", senha, "Paulo");
        SessaoUsuario.obterInstancia().alterarUsuario(user, user.obterSenha());
        
        List<Filme> filmes = new ArrayList<>();
        filmes.add(new Filme("Natacha", "Terror", 1666, "123min", "SHUAHUSHU"));
        filmes.add(new Filme("Caio", "Dores", 1006, "666min", "ASTAH"));
        arlen.setFilmes(filmes);
        arlen.setUsuario(user);
        
        int a = gF.criar(arlen);
        int b = gF.criar(arlen);
        
//        TelaMinhasListas tela = new TelaMinhasListas();
//        tela.setVisible(true);

    }
    public static void main2() throws Exception {
        
        GerenciadorListas gF = new GerenciadorListas();
        
        List<String> ch = new ArrayList<>();
        ch.add("Dados");
        ch.add("Terror");
        
        Lista arlen = new Lista("Arlen", ch);
        
        char[] senha = new char[]{'1', '2', '3'};
        Usuario user = new Usuario("paulo", senha, "Paulo");
        SessaoUsuario.obterInstancia().alterarUsuario(user, user.obterSenha());
        
        List<Filme> filmes = new ArrayList<>();
        filmes.add(new Filme("Natacha", "Terror", 1666, "123min", "SHUAHUSHU"));
        filmes.add(new Filme("Caio", "Dores", 1006, "666min", "ASTAH"));
        arlen.setFilmes(filmes);
        arlen.setUsuario(user);
        
        gF.criar(arlen);
        gF.criar(arlen);
        
//        TelaMinhasListas tela = new TelaMinhasListas();
//        tela.setVisible(true);

    }
}
