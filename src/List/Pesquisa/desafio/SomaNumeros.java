package List.Pesquisa.desafio;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {

    private List<Integer> numeros;


    //Construtor
    public SomaNumeros() {
        this.numeros = new ArrayList<>();      //cria uma lista de numeros
    }

    //METODO

    //Adiciona um número à lista de números.
    public void adicionarNumero(int numero){
        this.numeros.add(numero);   //add um numero na lista de numeros
    }

    //Calcula a soma de todos os números na lista e retorna o resultado
    public int calcularSoma(){
        int soma = 0;          //inicia variavel soma com 0
        for (Integer n : numeros ) {
            soma += n;
        }
        return soma;
    }

    //Encontra o maior número na lista e retorna o valor
    public int encontrarMaiorNumero() {
        int numeroMaior = Integer.MIN_VALUE;
        if(!numeros.isEmpty()){
            for (Integer n : numeros) {
                if (n >= numeroMaior){
                    numeroMaior = n;
                }
            }
            return numeroMaior;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    //Encontra o menor número na lista e retorna o valor.
    public int encontrarMenorNumero() {
        int numeroMenor = Integer.MAX_VALUE;
        if(!numeros.isEmpty()){
            for (Integer n : numeros) {
                if (n <= numeroMenor){
                    numeroMenor = n;
                }
            }
            return numeroMenor;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    //Retorna uma lista contendo todos os números presentes na lista
    public void exibirNumeros(){
        if(!numeros.isEmpty()){
            System.out.println(this.numeros);
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }


    //TESTE
    public static void main(String[] args) {
        //Instaciando a classe Soma Numeros
        SomaNumeros somaNumeros = new SomaNumeros();

        // Adicionando números à lista
        somaNumeros.adicionarNumero(1);
        somaNumeros.adicionarNumero(0);
        somaNumeros.adicionarNumero(0);
        somaNumeros.adicionarNumero(5);
        somaNumeros.adicionarNumero(-3);
        somaNumeros.adicionarNumero(11);

        // Exibindo a lista de números adicionados
        System.out.println("Números adicionados:");
        somaNumeros.exibirNumeros();

        // Calculando e exibindo a soma dos números na lista
        System.out.println("Soma dos números = " + somaNumeros.calcularSoma());

        // Encontrando e exibindo o maior número na lista
        System.out.println("Maior número = " + somaNumeros.encontrarMaiorNumero());

        // Encontrando e exibindo o menor número na lista
        System.out.println("Menor número = " + somaNumeros.encontrarMenorNumero());
    }

}

