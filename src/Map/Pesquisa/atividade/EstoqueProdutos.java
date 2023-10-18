package Map.Pesquisa.atividade;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {

    //Atributos
    private Map<Long, Produto> estoqueProdutosMap;

    //Construtor (vazio para receber os elementos add)
    public EstoqueProdutos() {
        this.estoqueProdutosMap = new HashMap<>();
    }

    //METODOS
    //Adiciona um produto ao estoque, juntamente com a quantidade disponível e o preço.
    public void adicionarProduto(long cod, String nome, int quantidade, double preco){
        estoqueProdutosMap.put(cod, new Produto(nome, preco, quantidade));
    }

    //Exibe todos os produtos, suas quantidades em estoque e preços.
    public void exibirProdutos(){
        System.out.println(estoqueProdutosMap);
    }

    //Calcula e retorna o valor total do estoque, considerando a quantidade e o preço de cada produto.
    public Double calcularValorTotalEstoque(){
        double valorTotalEstoque = 0d;
        if (!estoqueProdutosMap.isEmpty()){
            for (Produto p : estoqueProdutosMap.values()) {
                valorTotalEstoque += p.getQuantidade() * p.getPreco();
            }
            System.out.println("Valor total do estoque: R$ " + valorTotalEstoque);
        } else {
            System.out.println("Estoque Vazio!");
        }
        return valorTotalEstoque;
    }

    //Retorna o produto mais caro do estoque, ou seja, aquele com o maior preço.
    public Produto obterProdutoMaisCaro(){
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if (!estoqueProdutosMap.isEmpty()){
            for (Produto p : estoqueProdutosMap.values()){
                if (p.getPreco() > maiorPreco){
                    produtoMaisCaro = p;
                    maiorPreco = p.getPreco();
                }
            }
        } else {
            System.out.println("Estoque Vazio!");
        }
        return produtoMaisCaro;
    }

    //Retorna o produto mais barato do estoque, ou seja, aquele com o menor preço.
    public Produto obterProdutoMaisBarato(){
        Produto produtoMaisBarato = null;
        double menorPreco = Double.MAX_VALUE;
        if (!estoqueProdutosMap.isEmpty()){
            for (Produto p : estoqueProdutosMap.values()){
                if (p.getPreco() < menorPreco){
                    produtoMaisBarato = p;
                    menorPreco = p.getPreco();
                }
            }
        } else {
            System.out.println("Estoque Vazio!");
        }
        return produtoMaisBarato;
    }

    //Retorna o produto que está em maior quantidade no estoque, considerando o valor total de cada produto (quantidade * preço).
    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque() {
        Produto produtoMaiorQuantidadeValorNoEstoque = null;
        double maiorValorTotalProdutoEstoque = 0d;
        if (!estoqueProdutosMap.isEmpty()) {
            for (Map.Entry<Long, Produto> entry : estoqueProdutosMap.entrySet()) {
                double valorProdutoEmEstoque = entry.getValue().getPreco() * entry.getValue().getQuantidade();
                if (valorProdutoEmEstoque > maiorValorTotalProdutoEstoque) {
                    maiorValorTotalProdutoEstoque = valorProdutoEmEstoque;
                    produtoMaiorQuantidadeValorNoEstoque = entry.getValue();
                }
            }
        }
        return produtoMaiorQuantidadeValorNoEstoque;
    }

    // TESTES
    public static void main(String[] args) {
        //Instaciando
        EstoqueProdutos estoque = new EstoqueProdutos();

        // Exibe o estoque vazio
        estoque.exibirProdutos();

        // Adiciona produtos ao estoque
        estoque.adicionarProduto(1L, "Notebook", 1, 1500.0);
        estoque.adicionarProduto(2L, "Mouse", 5, 25.0);
        estoque.adicionarProduto(3L, "Monitor", 10, 400.0);
        estoque.adicionarProduto(4L, "Teclado", 2, 40.0);

        // Exibe os produtos no estoque
        estoque.exibirProdutos();

        // Calcula e exibe o valor total do estoque
        estoque.calcularValorTotalEstoque();

        // Obtém e exibe o produto mais caro
        Produto produtoMaisCaro = estoque.obterProdutoMaisCaro();
        System.out.println("Produto mais caro: " + produtoMaisCaro);

        // Obtém e exibe o produto mais barato
        Produto produtoMaisBarato = estoque.obterProdutoMaisBarato();
        System.out.println("Produto mais barato: " + produtoMaisBarato);

        // Obtém e exibe o produto com a maior quantidade em valor no estoque
        Produto produtoMaiorQuantidadeValorTotal = estoque.obterProdutoMaiorQuantidadeValorTotalNoEstoque();
        System.out.println("Produto com maior quantidade em valor no estoque: " + produtoMaiorQuantidadeValorTotal);
    }

}























