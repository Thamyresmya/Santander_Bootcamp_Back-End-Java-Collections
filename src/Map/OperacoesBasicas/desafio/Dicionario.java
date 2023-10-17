package Map.OperacoesBasicas.desafio;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {

    //Atributos
    public Map<String, String> dicionarioPalavrasMap;

    //Construtor
    public Dicionario() {
        this.dicionarioPalavrasMap = new HashMap<>();
    }

    //Metodos

    //Adiciona uma palavra e sua definição ao dicionário, associando a palavra à sua definição correspondente.
    public void adicionarPalavra(String palavra, String definicao) {
        dicionarioPalavrasMap.put(palavra, definicao);
    }

    //Remove uma palavra do dicionário, dado o termo a ser removido
    public void removerPalavra(String palavra){
        if(!dicionarioPalavrasMap.isEmpty()){
            dicionarioPalavrasMap.remove(palavra);
            System.out.println("Palavra: " + palavra + ". Removida do dicionario com sucesso!");
        } else {
            System.out.println("Dicionario está vazio!");
        }
    }

    //Exibe todas as palavras e suas definições do dicionário, mostrando cada palavra seguida de sua respectiva definição.
    public void exibirPalavras() {
        System.out.println(dicionarioPalavrasMap);
    }

    //Pesquisa uma palavra no dicionário e retorna sua definição correspondente.
    public String pesquisarPorPalavra(String palavra){
        String palavraPesquisada = null;
        if(!dicionarioPalavrasMap.isEmpty()){
            palavraPesquisada = dicionarioPalavrasMap.get(palavra);
            System.out.println("A definição da palavra " + palavra + " é: " + palavraPesquisada);
        } else {
            System.out.println("Dicionario está vazia!");
        }
        return palavraPesquisada;
    }

    //TESTES
    public static void main(String[] args) {
        //Instaciando
        Dicionario dicionario = new Dicionario();

        // Adicionar palavras ao dicionario
        dicionario.adicionarPalavra("Amigo", "que ou aquele que é ligado a outro(s) por laços de amizade.");
        dicionario.adicionarPalavra("Pai", "homem em relação aos seus filhos, naturais ou adotivos.");
        dicionario.adicionarPalavra("Irmão", "aquele que, em relação a outrem, é filho do mesmo pai e/ou da mesma mãe.");

        //Exibir palavras do dicionario
        dicionario.exibirPalavras();

        // Remover palavras ao dicionario
        dicionario.removerPalavra("Pai");
        dicionario.exibirPalavras();

        // Pesquisar palavras no dicionario
        dicionario.pesquisarPorPalavra("Irmão");
    }

}
