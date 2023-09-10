package List.operacoesBasicas.desafio;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    //atributo uma lista de itens
    private List<Item> listaDeCompras;


    //Construtor
    public CarrinhoDeCompras() {
        this.listaDeCompras = new ArrayList<>();
    }

    //METODOS

    //Adiciona um item ao carrinho
    public void adicionarItem(String nome, double preco, int quantidade) {
        listaDeCompras.add(new Item(nome, preco, quantidade));
    }

    //Remove um item do carrinho com base no nome
    public void removerItem(String nome){
        List<Item> itensParaRemover = new ArrayList<>();  //criou uma lista de itens
        for (Item i : listaDeCompras) {                  //percorre todos os itens da lista de itens
            if (i.getNome().equalsIgnoreCase(nome)){    // compara se o nome recebido no parametro é igual ao nome dentro da lista de itens
                itensParaRemover.add(i);                //se for igual, add o item na lista de itens para remover
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
        if (!listaDeCompras.isEmpty()){
            System.out.println(listaDeCompras);
        } else {
            System.out.println("Lista de compras está vazia!");
        }
    }


    //TESTE
    public static void main(String[] args) {
        // Criando uma instância do carrinho de compras
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        // Adicionando itens ao carrinho
        carrinhoDeCompras.adicionarItem("Batom", 20d, 3);
        carrinhoDeCompras.adicionarItem("Lápis de olho", 25d, 3);
        carrinhoDeCompras.adicionarItem("Rímel", 35d, 1);
        carrinhoDeCompras.adicionarItem("Sobra dourada", 52d, 2);

        // Exibindo os itens no carrinho
        carrinhoDeCompras.exibirItens();

        // Removendo um item do carrinho
        carrinhoDeCompras.removerItem("Batom");

        // Exibindo os itens atualizados no carrinho
        carrinhoDeCompras.exibirItens();

        // Calculando e exibindo o valor total da compra
        System.out.println("O valor total da compra é = " + carrinhoDeCompras.calcularValorTotal());
    }
}

