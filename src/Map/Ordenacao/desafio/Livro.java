package Map.Ordenacao.desafio;

import java.util.Comparator;
import java.util.Map;

public class Livro {
    //Atributos
    private String titulo;
    private String autor;
    private double preco;

    //Contrutor
    public Livro(String titulo, String autor, double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
    }

    //Getters
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "Título=' " + titulo + '\'' +
                ", Autor=' " + autor + '\'' +
                ", Preco= " + preco +
                '}';
    }

    static class ComparatorPorPreco implements Comparator<Map.Entry<String, Livro>> {
        @Override
        public int compare(Map.Entry<String, Livro> l1, Map.Entry<String, Livro> l2) {
            return Double.compare(l1.getValue().getPreco(), l2.getValue().getPreco());
        }
    }

    static class ComparatorPorAutor implements Comparator<Map.Entry<String, Livro>> {
        @Override
        public int compare(Map.Entry<String, Livro> l1, Map.Entry<String, Livro> l2) {
            return l1.getValue().getAutor().compareToIgnoreCase(l2.getValue().getAutor());
        }
    }
}
