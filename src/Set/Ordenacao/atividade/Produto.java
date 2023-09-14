package Set.Ordenacao.atividade;

import java.util.Comparator;
import java.util.Objects;

public class Produto implements Comparable<Produto> {

    private long cod;
    private String nome;
    private double preco;
    private int quant;

    //Metodo Comparable
    //comparar por nome do produto
    @Override
    public int compareTo(Produto p) {
        return nome.compareToIgnoreCase(p.getNome());
    }

    //Contrutor
    public Produto(long cod, String nome, double preco, int quant) {
        this.cod = cod;
        this.nome = nome;
        this.preco = preco;
        this.quant = quant;
    }

    //Getters e Setters
    public long getCod() {
        return cod;
    }

    public void setCod(long cod) {
        this.cod = cod;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuant() {
        return quant;
    }

    public void setQuant(int quant) {
        this.quant = quant;
    }

    //HastCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Produto produto)) return false;
        return getCod() == produto.getCod();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCod());
    }

    //toString
    @Override
    public String toString() {
        return "Produto{" +
                "cod=" + cod +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quant=" + quant +
                '}';
    }

    //Comparator para comparar preço
    static class ComparatorPorPreco implements Comparator<Produto> {
        @Override
        public int compare(Produto p1, Produto p2) {
            return Double.compare(p1.getPreco(), p2.getPreco());
        }
    }

}
