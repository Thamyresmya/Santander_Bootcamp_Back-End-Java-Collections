package List.operacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> listaDeCompras;

    public CarrinhoDeCompras() {
        this.listaDeCompras = new ArrayList<>();
    }

    //Adiciona um item ao carrinho
    public void adicionarItem(String nome, double preco, int quantidade) {
        listaDeCompras.add(new Item(nome, preco, quantidade));
    }

    //Remove um item do carrinho com base no seu nome
    public void removerItem(String nome){
        List<Item> itensParaRemover = new ArrayList<>();  //criou uma lista com tarefas para remover
        for (Item i : listaDeCompras) {                  //percorrer todos os itens da lista de compras
            if (i.getNome().equalsIgnoreCase(nome)){    // compra se o nome recebido é igual ao nome dentro da lista de compras
                itensParaRemover.add(i);                //add item na lista para remover
            }
        }
        listaDeCompras.removeAll(itensParaRemover);   //remover td item da listaParaRemover
    }

    //Calcula e retorna o valor total do carrinho
    public double calcularValorTotal() {
        double valorTotal = 0d;
        if (!listaDeCompras.isEmpty()) {
            for (Item item : listaDeCompras) {
                double valorItem = item.getPreco() * item.getQuantidade();
                valorTotal += valorItem;                 //valorTotal = valorTotal + valorItem;
            }
            return valorTotal;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    //Exibe todos os itens presentes no carrinho
    public void exibirItens(){
        System.out.println(listaDeCompras);
    }


    //TESTE
    public static void main(String[] args) {
        // Criando uma instância do carrinho de compras
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        // Adicionando itens ao carrinho
        carrinhoDeCompras.adicionarItem("Lápis", 2d, 3);
        carrinhoDeCompras.adicionarItem("Lápis", 2d, 3);
        carrinhoDeCompras.adicionarItem("Caderno", 35d, 1);
        carrinhoDeCompras.adicionarItem("Borracha", 2d, 2);

        // Exibindo os itens no carrinho
        carrinhoDeCompras.exibirItens();

        // Removendo um item do carrinho
        carrinhoDeCompras.removerItem("Lápis");

        // Exibindo os itens atualizados no carrinho
        carrinhoDeCompras.exibirItens();

        // Calculando e exibindo o valor total da compra
        System.out.println("O valor total da compra é = " + carrinhoDeCompras.calcularValorTotal());
    }
}

