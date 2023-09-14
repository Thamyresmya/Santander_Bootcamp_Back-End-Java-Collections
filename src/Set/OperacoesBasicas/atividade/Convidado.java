package Set.OperacoesBasicas.atividade;

import java.util.Objects;

public class Convidado {

    //Atributos
    private String nome;
    private int codigoConvite;

    //Construtor
    public Convidado(String nome, int codigoConvite) {
        this.nome = nome;
        this.codigoConvite = codigoConvite;
    }


    //Getters
    public String getNome() {
        return nome;
    }

    public int getCodigoConvite() {
        return codigoConvite;
    }


    //PARA CONFERIR O CODIGO DO CONVITE PARA NÃO REPETIR
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Convidado convidado)) return false;
        return getCodigoConvite() == convidado.getCodigoConvite();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCodigoConvite());
    }

    //toString
    @Override
    public String toString() {
        return "Convidado{" +
                "nome='" + nome + '\'' +
                ", codigoConvite=" + codigoConvite +
                '}';
    }
}
