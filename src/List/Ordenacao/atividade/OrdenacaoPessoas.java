package List.Ordenacao.atividade;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {

    private List<Pessoa> listaPessoas;

    //Construtor
    public OrdenacaoPessoas() {
        this.listaPessoas = new ArrayList<>();
    }

    //METODOS:
    //Adiciona uma pessoa à lista.
    public void adicionarPessoa(String nome, int idade, double altura){
        listaPessoas.add(new Pessoa(nome, idade, altura));
    }

    // Ordena as pessoas da lista por idade usando a interface Comparable.
    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> pessoasPorIdade = new ArrayList<>(listaPessoas);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    //Ordena as pessoas da lista por altura usando um Comparator personalizado.
    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> pessoasPorAltura = new ArrayList<>(listaPessoas);
        if (!listaPessoas.isEmpty()) {
            Collections.sort(pessoasPorAltura, new Pessoa.ComparatorPorAltura());
            return pessoasPorAltura;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public static void main(String[] args) {
        // Criando uma instância da classe OrdenacaoPessoas
        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();

        // Adicionando pessoas à lista
        ordenacaoPessoas.adicionarPessoa("Thamyres", 20, 1.56);
        ordenacaoPessoas.adicionarPessoa("Erson", 30, 1.80);
        ordenacaoPessoas.adicionarPessoa("Maria Clara", 25, 1.70);
        ordenacaoPessoas.adicionarPessoa("Maria Fernanda", 17, 1.56);


        System.out.println("Exibindo a lista de pessoas adicionadas");
        System.out.println(ordenacaoPessoas.listaPessoas);

        System.out.println("Ordenando e exibindo por idade");
        System.out.println(ordenacaoPessoas.ordenarPorIdade());

        System.out.println("Ordenando e exibindo por altura");
        System.out.println(ordenacaoPessoas.ordenarPorAltura());
    }
}
