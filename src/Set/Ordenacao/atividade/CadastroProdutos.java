package Set.Ordenacao.atividade;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {

    private Set<Produto> produtoSet;

    //Construtor
    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }

    //Metodos
    //Adiciona um produto ao cadastro.
    public void adicionarProduto(long cod, String nome, double preco, int quantidade){
        produtoSet.add(new Produto(cod, nome, preco, quantidade));
    }

    //Exibe todos os produtos do cadastro em ordem alfabética pelo nome
    public Set<Produto> exibirProdutosPorNome(){
        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
        return produtosPorNome;
    }

    //Exibe todos os produtos do cadastro em ordem crescente de preço
    public Set<Produto> exibirProdutosPorPreco(){
        Set<Produto> produtosPorPreco = new TreeSet<>(new Produto.ComparatorPorPreco());
        produtosPorPreco.addAll(produtoSet);
        return produtosPorPreco;
    }


    //TESTES
    public static void main(String[] args) {
        // Criando uma instância do CadastroProdutos
        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        // Adicionando produtos ao cadastro
        cadastroProdutos.adicionarProduto(1L, "Smartphone", 1000d, 10);
        cadastroProdutos.adicionarProduto(2L, "Notebook", 1500d, 5);
        cadastroProdutos.adicionarProduto(1L, "Mouse", 30d, 20);
        cadastroProdutos.adicionarProduto(4L, "Teclado", 50d, 15);

        System.out.println("\nExibindo todos os produtos no cadastro");
        System.out.println(cadastroProdutos.produtoSet);

        System.out.println("\nExibindo produtos ordenados por nome");
        System.out.println(cadastroProdutos.exibirProdutosPorNome());

        System.out.println("\nExibindo produtos ordenados por preço");
        System.out.println(cadastroProdutos.exibirProdutosPorPreco());
    }
}
