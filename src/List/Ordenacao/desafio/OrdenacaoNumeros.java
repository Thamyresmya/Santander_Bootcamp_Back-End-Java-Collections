package List.Ordenacao.desafio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class OrdenacaoNumeros {

    private List<Integer> listaNumeros;

    //Construtor
    public OrdenacaoNumeros() {
        this.listaNumeros = new ArrayList<>();
    }


    //METODOS:
    //Adiciona um número à lista.
   public void adicionarNumero(int numero){
       listaNumeros.add(numero);
   }

   //Ordena os números da lista em ordem ascendente usando a interface Comparable e a class Collections.
    public List<Integer> ordenarAscendente(){
        List<Integer> numeroAscendente = new ArrayList<>(this.listaNumeros);
        if (!listaNumeros.isEmpty()){
            Collections.sort(numeroAscendente);
            return numeroAscendente;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    //Ordena os números da lista em ordem descendente usando um Comparable e a class Collections.
    public List<Integer> ordenarDescendente(){
        List<Integer> numeroDescendente = new ArrayList<>(this.listaNumeros);
        if (!listaNumeros.isEmpty()){
            numeroDescendente.sort(Collections.reverseOrder());
            return numeroDescendente;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    //Exibir os numeros
    public void exibirNumeros(){
        if (!listaNumeros.isEmpty()){
            System.out.println(this.listaNumeros);
        } else {
            System.out.println("Lista vazia!");
        }
    }

    public static void main(String[] args) {
        // Criando uma instância da classe OrdenacaoNumeros
        OrdenacaoNumeros numeros = new OrdenacaoNumeros();

        // Adicionando números à lista
        numeros.adicionarNumero(2);
        numeros.adicionarNumero(5);
        numeros.adicionarNumero(4);
        numeros.adicionarNumero(1);
        numeros.adicionarNumero(99);

        System.out.println("Exibindo a lista de números adicionados");
        numeros.exibirNumeros();

        System.out.println("Ordenando e exibindo em ordem ascendente");
        System.out.println(numeros.ordenarAscendente());


        System.out.println("Ordenando e exibindo em ordem descendente");
        System.out.println(numeros.ordenarDescendente());

    }
}
