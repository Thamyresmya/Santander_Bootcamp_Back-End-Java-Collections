package Set.Pesquisa.atividade;

import java.util.Objects;

public class Contato {

    //Atributos
    private String nome;
    private int numeroTelefone;

    //Construtor
    public Contato(String nome, int numeroTelefone) {
        this.nome = nome;
        this.numeroTelefone = numeroTelefone;
    }

    //Getters
    public String getNome() {
        return nome;
    }

    public int getNumeroTelefone() {
        return numeroTelefone;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNumeroTelefone(int numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }

    //Verificar se tem contato com o mesmo nome
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Contato contato)) return false;
        return Objects.equals(getNome(), contato.getNome());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome());
    }

    //toString
    @Override
    public String toString() {
        return "{" + nome + " - " + numeroTelefone + "}";
    }
}
