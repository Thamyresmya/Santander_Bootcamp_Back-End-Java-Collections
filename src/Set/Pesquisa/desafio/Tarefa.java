package Set.Pesquisa.desafio;

import java.util.Objects;

public class Tarefa {

    //Atributos
    private String descricao;
    private Boolean concluida;

    //Constrtutor
    public Tarefa(String descricao) {
        this.descricao = descricao;
        this.concluida = false;
    }

    //Getters e Setters
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Boolean isConcluida() {
        return concluida;
    }

    public void setConcluida(Boolean concluida) {
        this.concluida = concluida;
    }

    //toString

    @Override
    public String toString() {
        return "Tarefa{" +
                "descricao='" + descricao + '\'' +
                ", concluida=" + concluida +
                '}';
    }
}
