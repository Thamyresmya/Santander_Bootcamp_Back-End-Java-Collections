package Map.OperacoesBasicas.atividade;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {

    //Atributos
    private Map<String, Integer> agendaContatoMap;

    //construtor
    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    //Metodos
    //Adiciona um contato à agenda, associando o nome do contato ao número de telefone correspondente.
    public void adicionarContato(String nome, Integer telefone){
        agendaContatoMap.put(nome, telefone);
    }

    //Remove um contato da agenda, dado o nome do contato.
    public void removerContato(String nome){
        if(!agendaContatoMap.isEmpty()){
            agendaContatoMap.remove(nome);
            System.out.println("Contato: " + nome + ". Removido com sucesso!");
        } else {
            System.out.println("Agenda está vazia!");
        }
    }

    //Exibe todos os contatos da agenda, mostrando o nome e o número de telefone de cada contato.
    public void exibirContatos(){
        System.out.println(agendaContatoMap);
    }

    //Pesquisa um contato pelo nome e retorna o número de telefone correspondente.
    public Integer pesquisarPorNome(String nome){
        Integer numeroPorNome = null;
        if(!agendaContatoMap.isEmpty()){
            numeroPorNome = agendaContatoMap.get(nome);
            System.out.println("O número do telefone do contato " + nome + " é " + numeroPorNome);
        } else {
            System.out.println("Agenda está vazia!");
        }
        return numeroPorNome;
    }

    //TESTES
    public static void main(String[] args) {
        //Instaciou a agendaContatos
        AgendaContatos agendaContatos = new AgendaContatos();

        // Adicionar contatos
        agendaContatos.adicionarContato("Camila", 123456);
        agendaContatos.adicionarContato("João", 5665);
        agendaContatos.adicionarContato("Carlos", 1111111);
        agendaContatos.adicionarContato("Ana", 654987);
        agendaContatos.adicionarContato("Maria", 1111111);
        agendaContatos.adicionarContato("Camila", 44444);

        agendaContatos.exibirContatos();

        // Remover um contato
        agendaContatos.removerContato("Maria");
        agendaContatos.exibirContatos();

        // Pesquisar número por nome
        agendaContatos.pesquisarPorNome("João");

        // Pesquisar número por nome Não existe
        agendaContatos.pesquisarPorNome("Paula");

    }
}
