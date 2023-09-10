package List.Pesquisa.atividade;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> listaLivros;

    //Construtor

    public CatalogoLivros() {
        this.listaLivros = new ArrayList<>();  //instanciando uma array list vazia
    }

    //METODOS

    //Adicionar livro
    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        listaLivros.add(new Livro(titulo, autor, anoPublicacao));
    }

    //Pesquisar por autor
    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livroPorAutor = new ArrayList<>();     //instacia uma lista de livros por autor
        if (!listaLivros.isEmpty()) {       //verifica se esta vazia
            for (Livro l : listaLivros) {                      //percorre a lista
                if (l.getAutor().equalsIgnoreCase(autor)){     //verifica se é igual
                    livroPorAutor.add(l);                      //add na lista por autor
                }
            }
        }
        return livroPorAutor;           //retorna a lista de autor
    }


    //Pesquisar por intervalo de ano
    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> livroPorIntervaloAnos = new ArrayList<>();     //instacia uma lista de livros por autor
        if (!listaLivros.isEmpty()) {       //verifica se esta vazia
            for (Livro l : listaLivros) {                      //percorre a lista
                if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal){           //verifica esta no intervalo
                    livroPorIntervaloAnos.add(l);                      //add na lista por autor
                }
            }
        }
        return livroPorIntervaloAnos;           //retorna a lista de autor
    }

    //Pesquisa livros por título
    public Livro pesquisarPorTitulo(String titulo){
        Livro livroPorTitulo = null;
        if (!listaLivros.isEmpty()){
            for (Livro l : listaLivros){
                if (l.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

}



















