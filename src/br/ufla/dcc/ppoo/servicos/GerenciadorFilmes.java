package br.ufla.dcc.ppoo.servicos;

import br.ufla.dcc.ppoo.dao.FilmeDAO;
import br.ufla.dcc.ppoo.dao.lista.FilmeDAOLista;
import br.ufla.dcc.ppoo.i18n.I18N;
import br.ufla.dcc.ppoo.modelo.Filme;
import java.util.List;

public class GerenciadorFilmes {

    private final FilmeDAO repositorioFilme;
    

    public GerenciadorFilmes() {
        repositorioFilme
                = FilmeDAOLista.obterInstancia();
            }

    public List<Filme> getListaFilme(){
        return repositorioFilme.getListaFilmes();
    }

    public void cadastrarFilme(Filme filme){

        repositorioFilme.adicionarFilme(filme);
    }
    public void editarFilme(Filme filme,int a) {
        repositorioFilme.editarFilme(filme,a);
    }
    
    public void deletarFilme (Filme filme, int a){
        repositorioFilme.deletarFilme(filme, a);
    }
    
    public void limparInstancia(){
        repositorioFilme.limparInstancia();
    }
}
