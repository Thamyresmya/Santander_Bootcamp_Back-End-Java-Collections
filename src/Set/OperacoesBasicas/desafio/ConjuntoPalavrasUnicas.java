package Set.OperacoesBasicas.desafio;

import java.util.HashSet;
import java.util.Set;
public class ConjuntoPalavrasUnicas {

    //conjunto de palavras únicas como atributo
    private Set<String> palavrasUnicasSet;

    //Contrutor
    public ConjuntoPalavrasUnicas() {
        this.palavrasUnicasSet = new HashSet<>();
    }

    //METODOS
    //Adiciona uma palavra ao conjunto.
    public void adicionarPalavra(String palavra) {
        palavrasUnicasSet.add(palavra);
    }

    //Remove uma palavra do conjunto.
    public void removerPalavra(String palavra) {
        if (!palavrasUnicasSet.isEmpty()) {
            if (palavrasUnicasSet.contains(palavra)) {
                palavrasUnicasSet.remove(palavra);
            } else {
                System.out.println("Palavra não encontrada no conjunto!");
            }
        } else {
            System.out.println("O conjunto está vazio!");
        }
    }

    //Verifica se uma palavra está presente no conjunto
    public boolean verificarPalavra(String palavra) {
        return palavrasUnicasSet.contains(palavra);
    }

    //Exibe todas as palavras únicas do conjunto
    public void exibirPalavrasUnicas() {
        if (!palavrasUnicasSet.isEmpty()) {
                System.out.println(palavrasUnicasSet);
        } else {
            System.out.println("O conjunto está vazio!");
        }
    }

    //TESTES
    public static void main(String[] args) {
        // Criando uma instância da classe ConjuntoPalavrasUnicas
        ConjuntoPalavrasUnicas conjuntoLinguagens = new ConjuntoPalavrasUnicas();

        // Adicionando linguagens únicas ao conjunto
        conjuntoLinguagens.adicionarPalavra("Java");
        conjuntoLinguagens.adicionarPalavra("Python");
        conjuntoLinguagens.adicionarPalavra("JavaScript");
        conjuntoLinguagens.adicionarPalavra("Python");
        conjuntoLinguagens.adicionarPalavra("C++");
        conjuntoLinguagens.adicionarPalavra("Ruby");

        // Exibindo as linguagens únicas no conjunto
        conjuntoLinguagens.exibirPalavrasUnicas();

        // Removendo uma linguagem do conjunto
        conjuntoLinguagens.removerPalavra("Python");
        conjuntoLinguagens.exibirPalavrasUnicas();

        // Removendo uma linguagem inexistente
        conjuntoLinguagens.removerPalavra("Swift");

        // Verificando se uma linguagem está no conjunto
        System.out.println("A linguagem 'Java' está no conjunto? " + conjuntoLinguagens.verificarPalavra("Java"));
        System.out.println("A linguagem 'Python' está no conjunto? " + conjuntoLinguagens.verificarPalavra("Python"));

        // Exibindo as linguagens únicas atualizadas no conjunto
        conjuntoLinguagens.exibirPalavrasUnicas();
    }
}
