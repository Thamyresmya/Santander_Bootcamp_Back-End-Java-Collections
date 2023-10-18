package Map.Pesquisa.desafio;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {

    //Atributos
    private Map<String, Integer> contagemPalavras;

    //Construtor (vazio para receber os elementos add)
    public ContagemPalavras() {
        this.contagemPalavras = new HashMap<>();
    }

    //METODOS
    //Adiciona uma palavra à contagem
    public void adicionarPalavra(String palavra, Integer contagem){
        contagemPalavras.put(palavra, contagem);
    }

    //Remove uma palavra da contagem, se estiver presente
    public void removerPalavra(String palavra){
        if (!contagemPalavras.isEmpty()){
            contagemPalavras.remove(palavra);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    //Exibe todas as palavras e suas respectivas contagens
    public int exibirContagemPalavras() {
        int contagemTotal = 0;
        for (int contagem : contagemPalavras.values()) {
            contagemTotal += contagem;
        }
        System.out.println("Existem " + contagemTotal + " palavras.");
        return contagemTotal;
    }

    //Encontra a palavra mais frequente no texto e retorna a palavra e sua contagem.
    public String encontrarPalavrasMaisFrequente() {
        String palavraMaisFrequente = null;
        int maiorContagem = 0;
        for (Map.Entry<String, Integer> entry : contagemPalavras.entrySet()) {
            if (entry.getValue() > maiorContagem) {
                maiorContagem = entry.getValue();
                palavraMaisFrequente = entry.getKey();
            }
        }
        return palavraMaisFrequente;
    }


    //TESTES
    public static void main(String[] args) {
        ContagemPalavras contagemPalavras = new ContagemPalavras();

        // Adiciona palavras e suas contagens
        contagemPalavras.adicionarPalavra("Java", 9);
        contagemPalavras.adicionarPalavra("Python", 8);
        contagemPalavras.adicionarPalavra("JavaScript", 1);
        contagemPalavras.adicionarPalavra("C#", 6);

        // Exibe a contagem total de palavras
        contagemPalavras.exibirContagemPalavras();

        // Encontra e exibe a palavra mais frequente
        String palavraMaisFrequente = contagemPalavras.encontrarPalavrasMaisFrequente();
        System.out.println("A palavra mais frequente é: " + palavraMaisFrequente);
    }

}























